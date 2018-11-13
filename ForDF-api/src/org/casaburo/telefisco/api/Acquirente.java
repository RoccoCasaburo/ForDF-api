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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.logging.Logger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Transient;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;



/**
 *
 * @author Rocco Casaburo <casaburo.rocco@gmail.com>
 */
@Entity
//@Table(name = "ACQUIRENTE",schema="APP")
@NamedQueries({
    @NamedQuery(name = "Acquirente.findAll", query = "SELECT a FROM Acquirente a")})
public class Acquirente implements Serializable, Cloneable, AcquirenteInterface, ContattoInterface {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    protected Long id;
    public static final String PROP_ID = "id";

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    @Override
    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }
    @Transient
    private PropertyChangeSupport propertyChangeSupport;

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acquirente)) {
            return false;
        }
        Acquirente other = (Acquirente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[id=" + id + "] (" + super.toString() + ")";
    }
    @Column(length = 16)
    protected String codiceFiscale = "";
    public static final String PROP_CODICEFISCALE = "codiceFiscale";

    /**
     * Get the value of codiceFiscale
     *
     * @return the value of codiceFiscale
     */
    @Override
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Set the value of codiceFiscale
     *
     * @param codiceFiscale new value of codiceFiscale
     */
    @Override
    public void setCodiceFiscale(String codiceFiscale) {
        String oldCodiceFiscale = this.codiceFiscale;
        this.codiceFiscale = codiceFiscale;
        propertyChangeSupport.firePropertyChange(PROP_CODICEFISCALE, oldCodiceFiscale, codiceFiscale);
    }
    @Column(length = 16)
    protected String partitaIVA = "";
    public static final String PROP_PARTITAIVA = "partitaIVA";

    /**
     * Get the value of partitaIVA
     *
     * @return the value of partitaIVA
     */
    @Override
    public String getPartitaIVA() {
        return partitaIVA;
    }

    /**
     * Set the value of partitaIVA
     *
     * @param partitaIVA new value of partitaIVA
     */
    @Override
    public void setPartitaIVA(String partitaIVA) {
        String oldPartitaIVA = this.partitaIVA;
        this.partitaIVA = partitaIVA;
        propertyChangeSupport.firePropertyChange(PROP_PARTITAIVA, oldPartitaIVA, partitaIVA);
    }
    protected Boolean isPersonaFisica = true;
    public static final String PROP_PERSONAFISICA = "isPersonaFisica";

    /**
     * Get the value of isPersonaFisica
     *
     * @return the value of isPersonaFisica
     */
    public boolean getIsPersonaFisica() {
        return isPersonaFisica;
    }

    /**
     * Set the value of isPersonaFisica
     *
     * @param personaFisica new value of isPersonaFisica
     */
    public void setIsPersonaFisica(boolean personaFisica) {
        boolean oldPersonaFisica = this.isPersonaFisica;
        this.isPersonaFisica = personaFisica;
        propertyChangeSupport.firePropertyChange(PROP_PERSONAFISICA, oldPersonaFisica, personaFisica);
    }
    @Column(name = "COGNOME", length = 24)
    protected String cognome = "";
    public static final String PROP_COGNOME = "cognome";

    /**
     * Get the value of cognome
     *
     * @return the value of cognome
     */
    @Override
    public String getCognome() {
        return cognome;
    }

    /**
     * Set the value of cognome
     * Obbligatorio se persona fisica
     * @param cognome new value of cognome
     */
    @Override
    public void setCognome(String cognome) {
        String oldCognome = this.cognome;
        this.cognome = cognome;
        propertyChangeSupport.firePropertyChange(PROP_COGNOME, oldCognome, cognome);
    }
    @Column(length = 20)
    protected String nome = "";
    public static final String PROP_NOME = "nome";

    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    @Override
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     * Obbligatorio se persona fisica
     * @param nome new value of nome
     */
    @Override
    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }
    protected Boolean isDittaIndividuale = false;
    public static final String PROP_DITTAINDIVIDUALE = "isDittaIndividuale";

    /**
     * Get the value of isDittaIndividuale
     *
     * @return the value of isDittaIndividuale
     */
    public Boolean getIsDittaIndividuale() {
        return isDittaIndividuale;
    }

    /**
     * Set the value of isDittaIndividuale
     *
     * @param dittaIndividuale new value of isDittaIndividuale
     */
    public void setIsDittaIndividuale(Boolean dittaIndividuale) {
        Boolean oldDittaIndividuale = this.isDittaIndividuale;
        this.isDittaIndividuale = dittaIndividuale;
        propertyChangeSupport.firePropertyChange(PROP_DITTAINDIVIDUALE, oldDittaIndividuale, dittaIndividuale);
    }
    @Column(length = 60)
    protected String ditta = "";
    public static final String PROP_DITTA = "ditta";

    /**
     * Get the value of ditta
     *
     * @return the value of ditta
     */
    @Override
    public String getDitta() {
        return ditta;
    }

    /**
     * Set the value of ditta
     * Indicare solo per imprenditore individuale
     * @param ditta new value of ditta
     */
    @Override
    public void setDitta(String ditta) {
        String oldDitta = this.ditta;
        this.ditta = ditta;
        propertyChangeSupport.firePropertyChange(PROP_DITTA, oldDitta, ditta);
    }
    @Column(length = 60)
    protected String denominazione = "";
    public static final String PROP_DENOMINAZIONE = "denominazione";

    /**
     * Get the value of denominazione
     *
     * @return the value of denominazione
     */
    @Override
    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Set the value of denominazione
     * obbligatorio se persona NON fisica
     * @param denominazione new value of denominazione
     */
    @Override
    public void setDenominazione(String denominazione) {
        String oldDenominazione = this.denominazione;
        this.denominazione = denominazione;
        propertyChangeSupport.firePropertyChange(PROP_DENOMINAZIONE, oldDenominazione, denominazione);
    }
    @Column(name = "CODICEFISCALE_LEGALE_RAPPRESENTANTE", length = 16)
    protected String codiceFiscaleLegaleRappresentante = "";
    public static final String PROP_CODICEFISCALE_LEGALE_RAPPRESENTANTE = "codiceFiscaleLegaleRappresentante";

    /**
     * Get the value of codiceFiscaleLegaleRappresentante
     *
     * @return the value of codiceFiscaleLegaleRappresentante
     */
    @Override
    public String getCodiceFiscaleLegaleRappresentante() {
        return codiceFiscaleLegaleRappresentante;
    }

    /**
     * Set the value of codiceFiscaleLegaleRappresentante
     * obbligatorio se persona NON fisica
     * @param codiceFiscaleLegaleRappresentante new value of codiceFiscaleLegaleRappresentante
     */
    @Override
    public void setCodiceFiscaleLegaleRappresentante(String codiceFiscaleLegaleRappresentante) {
        String oldCodiceFiscaleLegaleRappresentante = this.codiceFiscaleLegaleRappresentante;
        this.codiceFiscaleLegaleRappresentante = codiceFiscaleLegaleRappresentante;
        propertyChangeSupport.firePropertyChange(PROP_CODICEFISCALE_LEGALE_RAPPRESENTANTE, oldCodiceFiscaleLegaleRappresentante, codiceFiscaleLegaleRappresentante);
    }
    @Column(name = "COGNOME_LEGALE_RAPPRESENTANTE", length = 24)
    protected String cognomeLegaleRappresentante = "";
    public static final String PROP_COGNOME_LEGALE_RAPPRESENTANTE = "cognomeLegaleRappresentante";

    /**
     * Get the value of cognomeLegaleRappresentante
     *
     * @return the value of cognomeLegaleRappresentante
     */
    @Override
    public String getCognomeLegaleRappresentante() {
        return cognomeLegaleRappresentante;
    }

    /**
     * Set the value of cognomeLegaleRappresentante
     * obbligatorio se persona NON fisica
     * @param cognomeLegaleRappresentante new value of cognomeLegaleRappresentante
     */
    @Override
    public void setCognomeLegaleRappresentante(String cognomeLegaleRappresentante) {
        String oldCognomeLegaleRappresentante = this.cognomeLegaleRappresentante;
        this.cognomeLegaleRappresentante = cognomeLegaleRappresentante;
        propertyChangeSupport.firePropertyChange(PROP_COGNOME_LEGALE_RAPPRESENTANTE, oldCognomeLegaleRappresentante, cognomeLegaleRappresentante);
    }
    @Column(name = "NOME_LEGALE_RAPPRESENTANTE", length = 20)
    protected String nomeLegaleRappresentante = "";
    public static final String PROP_NOME_LEGALE_RAPPRESENTANTE = "nomeLegaleRappresentante";

    /**
     * Get the value of nomeLegaleRappresentante
     *
     * @return the value of nomeLegaleRappresentante
     */
    @Override
    public String getNomeLegaleRappresentante() {
        return nomeLegaleRappresentante;
    }

    /**
     * Set the value of nomeLegaleRappresentante
     * obbligatorio se persona NON fisica
     * @param nomeLegaleRappresentante new value of nomeLegaleRappresentante
     */
    @Override
    public void setNomeLegaleRappresentante(String nomeLegaleRappresentante) {
        String oldNomeLegaleRappresentante = this.nomeLegaleRappresentante;
        this.nomeLegaleRappresentante = nomeLegaleRappresentante;
        propertyChangeSupport.firePropertyChange(PROP_NOME_LEGALE_RAPPRESENTANTE, oldNomeLegaleRappresentante, nomeLegaleRappresentante);
    }
//    @ObjectTypeConverter(name = "TipoAcquirenteConvertitore",
//    dataType = java.lang.Integer.class,
//    objectType = TipoAcquirenteEnum.class,
//    conversionValues = {
//        @ConversionValue(dataValue = "2", objectValue = "RIVENDITORE_AUTORIZZATO"),
//        @ConversionValue(dataValue = "3", objectValue = "UTILIZZATORE")})
//    @Convert("TipoAcquirenteEnum")
    @Column(length = 1, precision = 1, scale = 0)
    @Converter(name="tipoAcquirente", converterClass=org.casaburo.telefisco.api.TipoAcquirenteConvertitore.class)
    @Convert("tipoAcquirente")
    protected TipoAcquirenteEnum tipoAcquirente = TipoAcquirenteEnum.UTILIZZATORE;
    public static final String PROP_TIPOACQUIRENTE = "tipoAcquirente";

    /**
     * Get the value of tipoAcquirente
     * assume i seguenti valori:
     * <ul>
     * <li> 2 (rivenditore autorizzato)
     * <li> 3 (utilizzatore)
     * </ul>
     *
     * @return the value of tipoAcquirente
     */
    @Override
    public TipoAcquirenteEnum getTipoAcquirente() {
        return tipoAcquirente;
    }

    /**
     * Set the value of tipoAcquirente
     * assume i seguenti valori:
     * <ul>
     * <li> 2 (rivenditore autorizzato)
     * <li> 3 (utilizzatore)
     * </ul>
     *
     * @param tipoAcquirente new value of tipoAcquirente
     */
    @Override
    public void setTipoAcquirente(TipoAcquirenteEnum tipoAcquirente) {
        TipoAcquirenteEnum oldTipoAcquirente = this.tipoAcquirente;
        this.tipoAcquirente = tipoAcquirente;
        propertyChangeSupport.firePropertyChange(PROP_TIPOACQUIRENTE, oldTipoAcquirente, tipoAcquirente);
    }

    public boolean persist() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ForDFPU");
        EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
        try {
            em.persist(this);
            em.getTransaction().commit();
            setModificato(false);
            return true;
        } catch (Exception e) {
            Logger.getLogger(this.getClass().getName(), e.getLocalizedMessage());
            em.getTransaction().rollback();
            return false;
        } finally {
            em.close();
        }
    }
    @Transient
    protected Boolean modificato = false;
    public static final String PROP_MODIFICATO = "modificato";

    /**
     * Get the value of modificato
     *
     * @return the value of modificato
     */
    public Boolean isModificato() {
        return modificato;
    }

    /**
     * Set the value of modificato
     *
     * @param modificato new value of modificato
     */
    private void setModificato(Boolean modificato) {
        Boolean oldModificato = this.modificato;
        this.modificato = modificato;
        propertyChangeSupport.firePropertyChange(PROP_MODIFICATO, oldModificato, modificato);
    }

    public Acquirente() {

        propertyChangeSupport = new PropertyChangeSupport(this);
    }
//    @Override
//    public void propertyChange(PropertyChangeEvent evt) {
//       throw new UnsupportedOperationException("Not supported yet.");
//    }
    protected String titolo = "";
    public static final String PROP_TITOLO = "titolo";

    /**
     * Get the value of titolo
     *
     * @return the value of titolo
     */
    @Override
    public String getTitolo() {
        return titolo;
    }

    /**
     * Set the value of titolo
     *
     * @param titolo new value of titolo
     */
    @Override
    public void setTitolo(String titolo) {
        String oldTitolo = this.titolo;
        this.titolo = titolo;
        propertyChangeSupport.firePropertyChange(PROP_TITOLO, oldTitolo, titolo);


    }
@Column(length=40)
    protected String città = "";
    public static final String PROP_CITTÀ = "città";

    /**
     * Get the value of città
     *
     * @return the value of città
     */
    @Override
    public String getCittà() {
        return città;
    }

    /**
     * Set the value of città
     *
     * @param città new value of città
     */
    @Override
    public void setCittà(String città) {
        String oldCittà = this.città;
        this.città = città;
        propertyChangeSupport.firePropertyChange(PROP_CITTÀ, oldCittà, città);
    }
    @Column(length=5)
    protected String CAP = "";
    public static final String PROP_CAP = "CAP";

    /**
     * Get the value of CAP
     *
     * @return the value of CAP
     */
    @Override
    public String getCAP() {
        return CAP;
    }

    /**
     * Set the value of CAP
     *
     * @param CAP new value of CAP
     */
    @Override
    public void setCAP(String CAP) {
        String oldCAP = this.CAP;
        this.CAP = CAP;
        propertyChangeSupport.firePropertyChange(PROP_CAP, oldCAP, CAP);
    }
    @Column(length=2)
    protected String provincia = "";
    public static final String PROP_PROVINCIA = "provincia";

    /**
     * Get the value of provincia
     *
     * @return the value of provincia
     */
    @Override
    public String getProvincia() {
        return provincia;
    }

    /**
     * Set the value of provincia
     *
     * @param provincia new value of provincia
     */
    @Override
    public void setProvincia(String provincia) {
        String oldProvincia = this.provincia;
        this.provincia = provincia;
        propertyChangeSupport.firePropertyChange(PROP_PROVINCIA, oldProvincia, provincia);
    }
    @Column(length=35)
    protected String indirizzo = "";
    public static final String PROP_INDIRIZZO = "indirizzo";

    /**
     * Get the value of indirizzo
     *
     * @return the value of indirizzo
     */
    @Override
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Set the value of indirizzo
     *
     * @param indirizzo new value of indirizzo
     */
    @Override
    public void setIndirizzo(String indirizzo) {
        String oldIndirizzo = this.indirizzo;
        this.indirizzo = indirizzo;
        propertyChangeSupport.firePropertyChange(PROP_INDIRIZZO, oldIndirizzo, indirizzo);
    }
    protected String telefonoLavoro = "";
    public static final String PROP_TELEFONOLAVORO = "telefonoLavoro";

    /**
     * Get the value of telefonoLavoro
     *
     * @return the value of telefonoLavoro
     */
    @Override
    public String getTelefonoLavoro() {
        return telefonoLavoro;
    }

    /**
     * Set the value of telefonoLavoro
     *
     * @param telefonoLavoro new value of telefonoLavoro
     */
    @Override
    public void setTelefonoLavoro(String telefonoLavoro) {
        String oldTelefonoLavoro = this.telefonoLavoro;
        this.telefonoLavoro = telefonoLavoro;
        propertyChangeSupport.firePropertyChange(PROP_TELEFONOLAVORO, oldTelefonoLavoro, telefonoLavoro);
    }
    protected String telefonoPersonale = "";
    public static final String PROP_TELEFONOPERSONALE = "telefonoPersonale";

    /**
     * Get the value of telefonoPersonale
     *
     * @return the value of telefonoPersonale
     */
    @Override
    public String getTelefonoPersonale() {
        return telefonoPersonale;
    }

    /**
     * Set the value of telefonoPersonale
     *
     * @param telefonoPersonale new value of telefonoPersonale
     */
    @Override
    public void setTelefonoPersonale(String telefonoPersonale) {
        String oldTelefonoPersonale = this.telefonoPersonale;
        this.telefonoPersonale = telefonoPersonale;
        propertyChangeSupport.firePropertyChange(PROP_TELEFONOPERSONALE, oldTelefonoPersonale, telefonoPersonale);
    }
    protected String faxNumero = "";
    public static final String PROP_FAXNUMERO = "faxNumero";

    /**
     * Get the value of faxNumero
     *
     * @return the value of faxNumero
     */
    @Override
    public String getFaxNumero() {
        return faxNumero;
    }

    /**
     * Set the value of faxNumero
     *
     * @param faxNumero new value of faxNumero
     */
    @Override
    public void setFaxNumero(String faxNumero) {
        String oldFaxNumero = this.faxNumero;
        this.faxNumero = faxNumero;
        propertyChangeSupport.firePropertyChange(PROP_FAXNUMERO, oldFaxNumero, faxNumero);
    }
    protected String email1 = "";
    public static final String PROP_EMAIL1 = "email1";

    /**
     * Get the value of email1
     *
     * @return the value of email1
     */
    @Override
    public String getEmail1() {
        return email1;
    }

    /**
     * Set the value of email1
     *
     * @param email1 new value of email1
     */
    @Override
    public void setEmail1(String email1) {
        String oldEmail1 = this.email1;
        this.email1 = email1;
        propertyChangeSupport.firePropertyChange(PROP_EMAIL1, oldEmail1, email1);
    }
    protected String email2 = "";
    public static final String PROP_EMAIL2 = "email2";

    /**
     * Get the value of email2
     *
     * @return the value of email2
     */
    @Override
    public String getEmail2() {
        return email2;
    }

    /**
     * Set the value of email2
     *
     * @param email2 new value of email2
     */
    @Override
    public void setEmail2(String email2) {
        String oldEmail2 = this.email2;
        this.email2 = email2;
        propertyChangeSupport.firePropertyChange(PROP_EMAIL2, oldEmail2, email2);
    }
    protected String sitoWeb = "";
    public static final String PROP_SITOWEB = "sitoWeb";

    /**
     * Get the value of sitoWeb
     *
     * @return the value of sitoWeb
     */
    @Override
    public String getSitoWeb() {
        return sitoWeb;
    }

    /**
     * Set the value of sitoWeb
     *
     * @param sitoWeb new value of sitoWeb
     */
    @Override
    public void setSitoWeb(String sitoWeb) {
        String oldSitoWeb = this.sitoWeb;
        this.sitoWeb = sitoWeb;
        propertyChangeSupport.firePropertyChange(PROP_SITOWEB, oldSitoWeb, sitoWeb);
    }
    protected String note = "";
    public static final String PROP_NOTE = "note";

    /**
     * Get the value of note
     *
     * @return the value of note
     */
    @Override
    public String getNote() {
        return note;
    }

    /**
     * Set the value of note
     *
     * @param note new value of note
     */
    @Override
    public void setNote(String note) {
        String oldNote = this.note;
        this.note = note;
        propertyChangeSupport.firePropertyChange(PROP_NOTE, oldNote, note);
    }

    /**
     * EFFETTUA ESCLUSIVAMENTE SHALLOW COPY<br>
     * EVITA LA MODIFICA DELL'ID DELL'ENTITA' IGNORANDO IL METODO <b>setId()</b>
     * @param source l'Acquirente che si vuole copiare
     * @see #copyEntityDataFrom(Acquirente source)
     */
    public void copyFieldsDataFrom(Acquirente source) {
        Method[] metodi = this.getClass().getMethods();
        String nomeSetter;
        String nomeGetter;
        Method setter = null;
        Method getter = null;
        for (Method metodo : metodi) {
            if (metodo.getName().replace(this.getClass() + ".", "").startsWith("set") && metodo.getModifiers() >= Modifier.PUBLIC) {
                try {
                    nomeSetter = metodo.getName().replace("" + this.getClass() + ".", "");
                    nomeGetter = nomeSetter.replaceFirst("set", "get");
                    getter = this.getClass().getMethod(nomeGetter);
                    setter = this.getClass().getMethod(nomeSetter, getter.getReturnType());
                    if (!nomeSetter.contains("setId"))//lascia inalterato l'ID dell'entità
                    {
                        setter.invoke(this, getter.invoke(source));
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }
    }

    /**
     * Come {@link #copyFieldsDataFrom(Acquirente source)}, ma copia anche l'ID dell'entità
     * @param source l'Acquirente che si vuole copiare
     * @see #copyFieldsDataFrom(Acquirente source)
     */
    public void copyEntityDataFrom(Acquirente source) {
        copyFieldsDataFrom(source);
        setId(source.getId());

    }
}
