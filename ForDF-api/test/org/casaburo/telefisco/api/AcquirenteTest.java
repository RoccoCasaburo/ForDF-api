/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casaburo.telefisco.api;

import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rocco Casaburo <casaburo.rocco at gmail.com>
 */
public class AcquirenteTest {

    private static EntityManagerFactory emf;
    private static EntityManager em;
    static final Logger logger=Logger.getAnonymousLogger();

    public AcquirenteTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        emf = Persistence.createEntityManagerFactory("ForDFPU");
        em = emf.createEntityManager();

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        if (em.isOpen()) {
            em.close();
        }
        if (emf.isOpen()) {
            emf.close();
        }

    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void createSomeAcquirente() {
        logger.info("creating Acquirenti...");
        for (int i = 0; i < 10; i++) {
            em.getTransaction().begin();
            Acquirente a = new Acquirente();
            a.setTipoAcquirente(TipoAcquirenteEnum.UTILIZZATORE);
            em.persist(a);
            em.flush();
            em.getTransaction().commit();
            System.out.println(a);

        }

    }

    @Test
    public void retrieveAcquirenti() {
        logger.info("retrieving Acquirenti...");
        for (int i = 1; i <= 10; i++) {
            Acquirente a = em.find(Acquirente.class, (long) i);
            System.out.println(a);
            assertNotNull(a);

        }
    }
}
