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
 * @author Rocco.Casaburo
 */
public class AcquirenteJpaController {

    public AcquirenteJpaController() {
        emf = Persistence.createEntityManagerFactory("ForDFPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Acquirente acquirente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(acquirente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Acquirente acquirente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {

            em = getEntityManager();
            em.getTransaction().begin();
            acquirente = em.merge(acquirente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = acquirente.getId();
                if (findAcquirente(id) == null) {
                    throw new NonexistentEntityException("The acquirente with id " + id + " no longer exists.");
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
            Acquirente acquirente;
            try {
                acquirente = em.getReference(Acquirente.class, id);
                acquirente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The acquirente with id " + id + " no longer exists.", enfe);
            }
            em.remove(acquirente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Acquirente> findAcquirenteEntities() {
        return findAcquirenteEntities(true, -1, -1);
    }

    public List<Acquirente> findAcquirenteEntities(String filtro) {
        if (!filtro.equals("")) {
            return findAcquirenteEntities(true, -1, -1, filtro);
        }

        return findAcquirenteEntities(true, -1, -1);

    }

    public List<Acquirente> findAcquirenteEntities(int maxResults, int firstResult) {
        return findAcquirenteEntities(false, maxResults, firstResult);
    }

    @SuppressWarnings("unchecked")
    private List<Acquirente> findAcquirenteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select object(o) from Acquirente as o");
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    @SuppressWarnings("unchecked")
    private List<Acquirente> findAcquirenteEntities(boolean all, int maxResults, int firstResult, String filtro) {
        EntityManager em = getEntityManager();

        try {
            Query q = em.createQuery("select a from Acquirente a WHERE a.id= :numero"
                    + " OR UPPER(a.cognome) LIKE :filtro"
                    + " OR UPPER(a.nome) LIKE :filtro"
                    + " OR UPPER(a.denominazione) LIKE :filtro"
                    + " OR UPPER(a.ditta) LIKE :filtro"
                    + " OR a.partitaIVA = :filtroesatto"
                    + " OR UPPER(a.codiceFiscale) LIKE :filtro"
                    + "");

            Long mioID;
            try {
                mioID = Long.parseLong(filtro);
            } catch (NumberFormatException numberFormatException) {
                mioID = 0l;
            }
            q.setParameter("numero", mioID);
            q.setParameter("filtro", "%" + filtro.toUpperCase() + "%");
            q.setParameter("filtroesatto", filtro.toUpperCase());
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Acquirente findAcquirente(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Acquirente.class, id);
        } finally {
            em.close();
        }
    }

    public int getAcquirenteCount() {
        EntityManager em = getEntityManager();
        try {
            return ((Long) em.createQuery("select count(o) from Acquirente as o").getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
