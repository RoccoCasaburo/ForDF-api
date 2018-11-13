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
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

/**
 *
 * @author Rocco Casaburo
 */
@Entity
public class Prenumerato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    public static final String PROP_ID = "id";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Prenumerato)) {
            return false;
        }
        Prenumerato other = (Prenumerato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.Prenumerato[id=" + id + "]";
    }
    protected String serie = "";
    public static final String PROP_SERIE = "serie";

    /**
     * Get the value of serie
     *
     * @return the value of serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Set the value of serie
     *
     * @param serie new value of serie
     */
    public void setSerie(String serie) {
        String oldSerie = this.serie;
        this.serie = serie;
        propertyChangeSupport.firePropertyChange(PROP_SERIE, oldSerie, serie);
    }
    @Transient
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

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
    protected int seriale = 0;
    public static final String PROP_SERIALE = "seriale";

    /**
     * Get the value of seriale
     *
     * @return the value of seriale
     */
    public int getSeriale() {
        return seriale;
    }

    /**
     * Set the value of seriale
     *
     * @param seriale new value of seriale
     */
    public void setSeriale(int seriale) {
        int oldSeriale = this.seriale;
        this.seriale = seriale;
        propertyChangeSupport.firePropertyChange(PROP_SERIALE, oldSeriale, seriale);
    }
    protected String descrizione = "senza descrizione";
    public static final String PROP_DESCRIZIONE = "descrizione";

    /**
     * Get the value of descrizione
     *
     * @return the value of descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Set the value of descrizione
     *
     * @param descrizione new value of descrizione
     */
    public void setDescrizione(String descrizione) {
        String oldDescrizione = this.descrizione;
        this.descrizione = descrizione;
        propertyChangeSupport.firePropertyChange(PROP_DESCRIZIONE, oldDescrizione, descrizione);
    }
    protected Integer fogliPerBlocco = 1;
    public static final String PROP_FOGLIPERBLOCCO = "fogliPerBlocco";

    /**
     * Get the value of fogliPerBlocco
     *
     * @return the value of fogliPerBlocco
     */
    public Integer getFogliPerBlocco() {
        return fogliPerBlocco;
    }

    /**
     * Set the value of fogliPerBlocco
     *
     * @param fogliPerBlocco new value of fogliPerBlocco
     */
    public void setFogliPerBlocco(Integer fogliPerBlocco) {
        Integer oldFogliPerBlocco = this.fogliPerBlocco;
        this.fogliPerBlocco = fogliPerBlocco;
        propertyChangeSupport.firePropertyChange(PROP_FOGLIPERBLOCCO, oldFogliPerBlocco, fogliPerBlocco);
    }
        
    @Converter(name="tipologia",converterClass=org.casaburo.telefisco.api.TipologiaConvertitore.class)
    @Convert("tipologia")
    protected TipologiaEnum tipologia;
    public static final String PROP_TIPOLOGIA = "tipologia";

    /**
     * Get the value of tipologia
     *
     * @return the value of tipologia
     */
    public TipologiaEnum getTipologia() {
        return tipologia;
    }

    /**
     * Set the value of tipologia
     *
     * @param tipologia new value of tipologia
     */
    public void setTipologia(TipologiaEnum tipologia) {
        TipologiaEnum oldTipologia = this.tipologia;
        this.tipologia = tipologia;
        propertyChangeSupport.firePropertyChange(PROP_TIPOLOGIA, oldTipologia, tipologia);
    }
    //TODO: aggiungere le ulteriori proprietà necessarie (vedi specifiche)
}
