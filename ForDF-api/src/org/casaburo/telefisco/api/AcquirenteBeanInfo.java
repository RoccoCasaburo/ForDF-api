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

import java.beans.*;

/**
 *
 * @author Rocco Casaburo <casaburo.rocco@gmail.com>
 */
public class AcquirenteBeanInfo extends  SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( org.casaburo.telefisco.api.Acquirente.class , null ); // NOI18N
        beanDescriptor.setPreferred ( true );
        beanDescriptor.setDisplayName ( "Acquirente" );//GEN-HEADEREND:BeanDescriptor

    // Here you can add code for customizing the BeanDescriptor.


        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_CAP = 0;
    private static final int PROPERTY_città = 1;
    private static final int PROPERTY_codiceFiscale = 2;
    private static final int PROPERTY_codiceFiscaleLegaleRappresentante = 3;
    private static final int PROPERTY_cognome = 4;
    private static final int PROPERTY_cognomeLegaleRappresentante = 5;
    private static final int PROPERTY_denominazione = 6;
    private static final int PROPERTY_ditta = 7;
    private static final int PROPERTY_email1 = 8;
    private static final int PROPERTY_email2 = 9;
    private static final int PROPERTY_faxNumero = 10;
    private static final int PROPERTY_id = 11;
    private static final int PROPERTY_indirizzo = 12;
    private static final int PROPERTY_isDittaIndividuale = 13;
    private static final int PROPERTY_isPersonaFisica = 14;
    private static final int PROPERTY_nome = 15;
    private static final int PROPERTY_nomeLegaleRappresentante = 16;
    private static final int PROPERTY_note = 17;
    private static final int PROPERTY_partitaIVA = 18;
    private static final int PROPERTY_provincia = 19;
    private static final int PROPERTY_sitoWeb = 20;
    private static final int PROPERTY_telefonoLavoro = 21;
    private static final int PROPERTY_telefonoPersonale = 22;
    private static final int PROPERTY_tipoAcquirente = 23;
    private static final int PROPERTY_titolo = 24;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[25];
    
        try {
            properties[PROPERTY_CAP] = new PropertyDescriptor ( "CAP", org.casaburo.telefisco.api.Acquirente.class, "getCAP", "setCAP" ); // NOI18N
            properties[PROPERTY_CAP].setDisplayName ( "C.A.P." );
            properties[PROPERTY_CAP].setShortDescription ( "Codice avviamento postale" );
            properties[PROPERTY_città] = new PropertyDescriptor ( "città", org.casaburo.telefisco.api.Acquirente.class, "getCittà", "setCittà" ); // NOI18N
            properties[PROPERTY_città].setDisplayName ( "Città" );
            properties[PROPERTY_città].setShortDescription ( "Città" );
            properties[PROPERTY_codiceFiscale] = new PropertyDescriptor ( "codiceFiscale", org.casaburo.telefisco.api.Acquirente.class, "getCodiceFiscale", "setCodiceFiscale" ); // NOI18N
            properties[PROPERTY_codiceFiscale].setPreferred ( true );
            properties[PROPERTY_codiceFiscale].setDisplayName ( "Codice fiscale" );
            properties[PROPERTY_codiceFiscale].setShortDescription ( "Codice fiscale del soggetto acquirente. Dato obbligatorio." );
            properties[PROPERTY_codiceFiscale].setBound ( true );
            properties[PROPERTY_codiceFiscaleLegaleRappresentante] = new PropertyDescriptor ( "codiceFiscaleLegaleRappresentante", org.casaburo.telefisco.api.Acquirente.class, "getCodiceFiscaleLegaleRappresentante", "setCodiceFiscaleLegaleRappresentante" ); // NOI18N
            properties[PROPERTY_codiceFiscaleLegaleRappresentante].setExpert ( true );
            properties[PROPERTY_codiceFiscaleLegaleRappresentante].setPreferred ( true );
            properties[PROPERTY_codiceFiscaleLegaleRappresentante].setDisplayName ( "Codice fiscale del legale rappresentante" );
            properties[PROPERTY_codiceFiscaleLegaleRappresentante].setShortDescription ( "Dato obbligatorio se l'acquirente è persona NON fisica." );
            properties[PROPERTY_codiceFiscaleLegaleRappresentante].setBound ( true );
            properties[PROPERTY_cognome] = new PropertyDescriptor ( "cognome", org.casaburo.telefisco.api.Acquirente.class, "getCognome", "setCognome" ); // NOI18N
            properties[PROPERTY_cognome].setPreferred ( true );
            properties[PROPERTY_cognome].setDisplayName ( "Cognome" );
            properties[PROPERTY_cognome].setShortDescription ( "Cognome dell'acquirente. Dato obbligatorio se l'acquirente è persona fisica." );
            properties[PROPERTY_cognome].setBound ( true );
            properties[PROPERTY_cognomeLegaleRappresentante] = new PropertyDescriptor ( "cognomeLegaleRappresentante", org.casaburo.telefisco.api.Acquirente.class, "getCognomeLegaleRappresentante", "setCognomeLegaleRappresentante" ); // NOI18N
            properties[PROPERTY_cognomeLegaleRappresentante].setExpert ( true );
            properties[PROPERTY_cognomeLegaleRappresentante].setPreferred ( true );
            properties[PROPERTY_cognomeLegaleRappresentante].setDisplayName ( "Cognome del legale rappresentante" );
            properties[PROPERTY_cognomeLegaleRappresentante].setShortDescription ( "Dato obbligatorio se l'acquirente è persona NON fisica." );
            properties[PROPERTY_cognomeLegaleRappresentante].setBound ( true );
            properties[PROPERTY_denominazione] = new PropertyDescriptor ( "denominazione", org.casaburo.telefisco.api.Acquirente.class, "getDenominazione", "setDenominazione" ); // NOI18N
            properties[PROPERTY_denominazione].setExpert ( true );
            properties[PROPERTY_denominazione].setPreferred ( true );
            properties[PROPERTY_denominazione].setDisplayName ( "Denominazione" );
            properties[PROPERTY_denominazione].setShortDescription ( "Denominazione del soggetto acquirente. Dato obbligatorio se persona NON fisica." );
            properties[PROPERTY_denominazione].setBound ( true );
            properties[PROPERTY_ditta] = new PropertyDescriptor ( "ditta", org.casaburo.telefisco.api.Acquirente.class, "getDitta", "setDitta" ); // NOI18N
            properties[PROPERTY_ditta].setPreferred ( true );
            properties[PROPERTY_ditta].setDisplayName ( "Ditta" );
            properties[PROPERTY_ditta].setShortDescription ( "Denominazione della ditta individuale. Indicare solo per imprenditore individuale." );
            properties[PROPERTY_ditta].setBound ( true );
            properties[PROPERTY_email1] = new PropertyDescriptor ( "email1", org.casaburo.telefisco.api.Acquirente.class, "getEmail1", "setEmail1" ); // NOI18N
            properties[PROPERTY_email1].setDisplayName ( "E-mail principale" );
            properties[PROPERTY_email1].setShortDescription ( "Indirizzo e-mail principale" );
            properties[PROPERTY_email2] = new PropertyDescriptor ( "email2", org.casaburo.telefisco.api.Acquirente.class, "getEmail2", "setEmail2" ); // NOI18N
            properties[PROPERTY_email2].setDisplayName ( "E-mail secondaria" );
            properties[PROPERTY_email2].setShortDescription ( "indirizzo e-mail secondario" );
            properties[PROPERTY_faxNumero] = new PropertyDescriptor ( "faxNumero", org.casaburo.telefisco.api.Acquirente.class, "getFaxNumero", "setFaxNumero" ); // NOI18N
            properties[PROPERTY_faxNumero].setDisplayName ( "Numero fax" );
            properties[PROPERTY_faxNumero].setShortDescription ( "Numero fax" );
            properties[PROPERTY_id] = new PropertyDescriptor ( "id", org.casaburo.telefisco.api.Acquirente.class, "getId", null ); // NOI18N
            properties[PROPERTY_id].setPreferred ( true );
            properties[PROPERTY_id].setDisplayName ( "Codice ID" );
            properties[PROPERTY_id].setShortDescription ( "Codice univoco di registrazione nel database. Valore assegnato automaticamente alla registrazione." );
            properties[PROPERTY_id].setBound ( true );
            properties[PROPERTY_indirizzo] = new PropertyDescriptor ( "indirizzo", org.casaburo.telefisco.api.Acquirente.class, "getIndirizzo", "setIndirizzo" ); // NOI18N
            properties[PROPERTY_indirizzo].setDisplayName ( "Indirizzo" );
            properties[PROPERTY_indirizzo].setShortDescription ( "Indirizzo" );
            properties[PROPERTY_isDittaIndividuale] = new PropertyDescriptor ( "isDittaIndividuale", org.casaburo.telefisco.api.Acquirente.class, "getIsDittaIndividuale", "setIsDittaIndividuale" ); // NOI18N
            properties[PROPERTY_isDittaIndividuale].setDisplayName ( "È un imprenditore individuale" );
            properties[PROPERTY_isDittaIndividuale].setShortDescription ( "Indica se l'acquirente è un imprenditore individuale. Da specificare solo se l'acquirente è una persona fisica." );
            properties[PROPERTY_isDittaIndividuale].setBound ( true );
            properties[PROPERTY_isPersonaFisica] = new PropertyDescriptor ( "isPersonaFisica", org.casaburo.telefisco.api.Acquirente.class, "getIsPersonaFisica", "setIsPersonaFisica" ); // NOI18N
            properties[PROPERTY_isPersonaFisica].setDisplayName ( "È una persona fisica" );
            properties[PROPERTY_isPersonaFisica].setShortDescription ( "Indica se l'acquirente è una persona fisica o non fisica." );
            properties[PROPERTY_isPersonaFisica].setBound ( true );
            properties[PROPERTY_nome] = new PropertyDescriptor ( "nome", org.casaburo.telefisco.api.Acquirente.class, "getNome", "setNome" ); // NOI18N
            properties[PROPERTY_nome].setPreferred ( true );
            properties[PROPERTY_nome].setDisplayName ( "Nome" );
            properties[PROPERTY_nome].setShortDescription ( "Nome dell'acquirente. Dato obbligatorio se persona fisica." );
            properties[PROPERTY_nome].setBound ( true );
            properties[PROPERTY_nomeLegaleRappresentante] = new PropertyDescriptor ( "nomeLegaleRappresentante", org.casaburo.telefisco.api.Acquirente.class, "getNomeLegaleRappresentante", "setNomeLegaleRappresentante" ); // NOI18N
            properties[PROPERTY_nomeLegaleRappresentante].setExpert ( true );
            properties[PROPERTY_nomeLegaleRappresentante].setPreferred ( true );
            properties[PROPERTY_nomeLegaleRappresentante].setDisplayName ( "Nome del legale rappresentante" );
            properties[PROPERTY_nomeLegaleRappresentante].setShortDescription ( "Dato obbligatorio se l'acquirente è persona NON fisica." );
            properties[PROPERTY_nomeLegaleRappresentante].setBound ( true );
            properties[PROPERTY_note] = new PropertyDescriptor ( "note", org.casaburo.telefisco.api.Acquirente.class, "getNote", "setNote" ); // NOI18N
            properties[PROPERTY_note].setDisplayName ( "Note" );
            properties[PROPERTY_note].setShortDescription ( "Annotazioni personali relative al contatto" );
            properties[PROPERTY_partitaIVA] = new PropertyDescriptor ( "partitaIVA", org.casaburo.telefisco.api.Acquirente.class, "getPartitaIVA", "setPartitaIVA" ); // NOI18N
            properties[PROPERTY_partitaIVA].setPreferred ( true );
            properties[PROPERTY_partitaIVA].setDisplayName ( "Partita I.V.A." );
            properties[PROPERTY_partitaIVA].setShortDescription ( "Partita I.V.A.del soggetto acquirente." );
            properties[PROPERTY_partitaIVA].setBound ( true );
            properties[PROPERTY_provincia] = new PropertyDescriptor ( "provincia", org.casaburo.telefisco.api.Acquirente.class, "getProvincia", "setProvincia" ); // NOI18N
            properties[PROPERTY_provincia].setDisplayName ( "Provincia" );
            properties[PROPERTY_provincia].setShortDescription ( "Provincia" );
            properties[PROPERTY_sitoWeb] = new PropertyDescriptor ( "sitoWeb", org.casaburo.telefisco.api.Acquirente.class, "getSitoWeb", "setSitoWeb" ); // NOI18N
            properties[PROPERTY_sitoWeb].setDisplayName ( "Sito web" );
            properties[PROPERTY_sitoWeb].setShortDescription ( "Indirizzo del sito web del contatto" );
            properties[PROPERTY_telefonoLavoro] = new PropertyDescriptor ( "telefonoLavoro", org.casaburo.telefisco.api.Acquirente.class, "getTelefonoLavoro", "setTelefonoLavoro" ); // NOI18N
            properties[PROPERTY_telefonoLavoro].setDisplayName ( "Telefono lavoro" );
            properties[PROPERTY_telefonoLavoro].setShortDescription ( "Telefono lavoro" );
            properties[PROPERTY_telefonoPersonale] = new PropertyDescriptor ( "telefonoPersonale", org.casaburo.telefisco.api.Acquirente.class, "getTelefonoPersonale", "setTelefonoPersonale" ); // NOI18N
            properties[PROPERTY_telefonoPersonale].setDisplayName ( "Telefono personale" );
            properties[PROPERTY_telefonoPersonale].setShortDescription ( "Telefono personale" );
            properties[PROPERTY_tipoAcquirente] = new PropertyDescriptor ( "tipoAcquirente", org.casaburo.telefisco.api.Acquirente.class, "getTipoAcquirente", "setTipoAcquirente" ); // NOI18N
            properties[PROPERTY_tipoAcquirente].setPreferred ( true );
            properties[PROPERTY_tipoAcquirente].setDisplayName ( "Tipo acquirente" );
            properties[PROPERTY_tipoAcquirente].setShortDescription ( "<html>Può assumere i seguenti valori:<br><ul><li><b>Rivenditore autorizzato</b><li><b>Utilizzatore</b></html>" );
            properties[PROPERTY_tipoAcquirente].setBound ( true );
            properties[PROPERTY_titolo] = new PropertyDescriptor ( "titolo", org.casaburo.telefisco.api.Acquirente.class, "getTitolo", "setTitolo" ); // NOI18N
            properties[PROPERTY_titolo].setDisplayName ( "Titolo" );
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

    // Here you can add code for customizing the properties array.
       

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events

    // EventSet array
    private static EventSetDescriptor[] eventSets = new EventSetDescriptor[0];

    private static EventSetDescriptor[] getEdescriptor(){
        return eventSets;
    }//GEN-HEADEREND:Events










    // Here you can add code for customizing the event sets array.

//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[0];//GEN-HEADEREND:Methods

    // Here you can add code for customizing the methods array.
    
        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "resources/personal.gif";//GEN-BEGIN:Icons
    private static String iconNameC32 = "resources/personal32.gif";
    private static String iconNameM16 = "resources/personal16gray.gif";
    private static String iconNameM32 = "resources/personal32gray.gif";//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx

    
//GEN-FIRST:Superclass

    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
	
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     * 
     * @return BeanDescriptor describing the editable
     * properties of this bean.  May return null if the
     * information should be obtained by automatic analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
	return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     * 
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean.  May return null if the
     * information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will
     * belong to the IndexedPropertyDescriptor subclass of PropertyDescriptor.
     * A client of getPropertyDescriptors can use "instanceof" to check
     * if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
	return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     * 
     * @return  An array of EventSetDescriptors describing the kinds of 
     * events fired by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public EventSetDescriptor[] getEventSetDescriptors() {
	return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     * 
     * @return  An array of MethodDescriptors describing the methods 
     * implemented by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public MethodDescriptor[] getMethodDescriptors() {
	return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are 
     * customizing the bean.
     * @return  Index of default property in the PropertyDescriptor array
     * 		returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will
     * mostly commonly be used by human's when using the bean. 
     * @return Index of default event in the EventSetDescriptor array
     *		returned by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to
     * represent the bean in toolboxes, toolbars, etc.   Icon images
     * will typically be GIFs, but may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from
     * this method.
     * <p>
     * There are four possible flavors of icons (16x16 color,
     * 32x32 color, 16x16 mono, 32x32 mono).  If a bean choses to only
     * support a single icon we recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background
     * so they can be rendered onto an existing background.
     *
     * @param  iconKind  The kind of icon requested.  This should be
     *    one of the constant values ICON_COLOR_16x16, ICON_COLOR_32x32, 
     *    ICON_MONO_16x16, or ICON_MONO_32x32.
     * @return  An image object representing the requested icon.  May
     *    return null if no suitable icon is available.
     */
    public java.awt.Image getIcon(int iconKind) {
        switch ( iconKind ) {
        case ICON_COLOR_16x16:
            if ( iconNameC16 == null )
                return null;
            else {
                if( iconColor16 == null )
                    iconColor16 = loadImage( iconNameC16 );
                return iconColor16;
            }
        case ICON_COLOR_32x32:
            if ( iconNameC32 == null )
                return null;
            else {
                if( iconColor32 == null )
                    iconColor32 = loadImage( iconNameC32 );
                return iconColor32;
            }
        case ICON_MONO_16x16:
            if ( iconNameM16 == null )
                return null;
            else {
                if( iconMono16 == null )
                    iconMono16 = loadImage( iconNameM16 );
                return iconMono16;
            }
        case ICON_MONO_32x32:
            if ( iconNameM32 == null )
                return null;
            else {
                if( iconMono32 == null )
                    iconMono32 = loadImage( iconNameM32 );
                return iconMono32;
            }
	default: return null;
        }
    }

}

