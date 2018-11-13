/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casaburo.telefisco.test;

import org.casaburo.telefisco.api.Prenumerato;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.casaburo.telefisco.api.TipologiaConvertitore;
import org.casaburo.telefisco.api.TipologiaEnum;
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
public class ForDFTest {

    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static final Logger logger = Logger.getLogger("Test logger");

    public ForDFTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        logger.info("setup Test class...");
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
    public void testPersistenceForNull() {
        logger.info("checking for nullity...");
        assertNotNull("check emf for null", emf);
        assertNotNull("check em for null", em);

    }

    @Test
    public void testTipologiaConversion() {
       TipologiaConvertitore converter = new TipologiaConvertitore();
       String response= converter.convertObjectValueToDataValue(TipologiaEnum.FATTURA_ACCOMPAGNATORIA, null).toString();
       assertEquals("02", response);
     
    }

@Test
    public void createPrenumerato(){
        Prenumerato p1 = new Prenumerato();
        p1.setTipologia(TipologiaEnum.BOLLA_ACCOMPAGNAMENTO);
        assertNull(p1.getId());
        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
        assertNotNull(p1.getId());

        Prenumerato p2 = new Prenumerato();
        em.getTransaction().begin();
        em.persist(p2);
        em.flush();
        em.refresh(p2);
        em.getTransaction().commit();
        
        System.out.println("p2 prima: "+p2);
        assertNotSame(p1, p2);
        p2=em.find(Prenumerato.class, p1.getId());
        System.out.println("p1= "+p1);
        System.out.println("p2 find (p1.getId()): "+p2);
        assertEquals(p1, p2);

    }
}
