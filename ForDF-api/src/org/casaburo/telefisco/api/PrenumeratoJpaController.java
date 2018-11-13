// <editor-fold defaultstate="collapsed" desc="license">
/*
 *  Copyright 2010 Rocco Casaburo.
 *  mail address: rcp.nbm.casaburo (at) gmail.com
 *  Visit projects homepage at http://sites.google.com/site/nbmprojects
 * 
 *  Licensed under the GNU General Public License, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *       http://www.gnu.org/licenses/gpl-3.0.html
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
// </editor-fold>

package org.casaburo.telefisco.api;

import org.casaburo.telefisco.api.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;

/**
 *
 * @author Rocco Casaburo
 */
public class PrenumeratoJpaController {

    public PrenumeratoJpaController() {
        emf = Persistence.createEntityManagerFactory("ForDFPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Prenumerato prenumerato) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(prenumerato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Prenumerato prenumerato) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            prenumerato = em.merge(prenumerato);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = prenumerato.getId();
                if (findPrenumerato(id) == null) {
                    throw new NonexistentEntityException("The prenumerato with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Prenumerato prenumerato;
            try {
                prenumerato = em.getReference(Prenumerato.class, id);
                prenumerato.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The prenumerato with id " + id + " no longer exists.", enfe);
            }
            em.remove(prenumerato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Prenumerato> findPrenumeratoEntities() {
        return findPrenumeratoEntities(true, -1, -1);
    }

    public List<Prenumerato> findPrenumeratoEntities(int maxResults, int firstResult) {
        return findPrenumeratoEntities(false, maxResults, firstResult);
    }
    @SuppressWarnings("unchecked")
    private List<Prenumerato> findPrenumeratoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select object(o) from Prenumerato as o");
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Prenumerato findPrenumerato(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Prenumerato.class, id);
        } finally {
            em.close();
        }
    }

    public int getPrenumeratoCount() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select count(o) from Prenumerato as o");
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
