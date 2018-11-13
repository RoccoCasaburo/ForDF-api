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

/**
 *
 * @author Rocco Casaburo <casaburo.rocco@gmail.com>
 */
public interface AcquirenteInterface {

    Long getId();
    String getCodiceFiscale();
    String getCodiceFiscaleLegaleRappresentante();
    String getCognome();
    String getCognomeLegaleRappresentante();
    String getDenominazione();
    String getDitta();
    String getNome();
    String getNomeLegaleRappresentante();
    String getPartitaIVA();
    
    /**
     * Get the value of tipoAcquirente
     * @return the value of tipoAcquirente
     * @see TipoAcquirenteEnum
     * @see TipoAcquirenteConvertitore
     */
    TipoAcquirenteEnum getTipoAcquirente();
    
    
    void setCodiceFiscale(String codiceFiscale);

    /**
     * Set the value of codiceFiscaleLegaleRappresentante
     * <br>obbligatorio se persona NON fisica
     * @param codiceFiscaleLegaleRappresentante new value of codiceFiscaleLegaleRappresentante
     */
    void setCodiceFiscaleLegaleRappresentante(String codiceFiscaleLegaleRappresentante);

    /**
     * Set the value of cognome
     * <br>Obbligatorio se persona fisica
     * @param cognome new value of cognome
     */
    void setCognome(String cognome);

    /**
     * Set the value of cognomeLegaleRappresentante
     * <br>obbligatorio se persona NON fisica
     * @param cognomeLegaleRappresentante new value of cognomeLegaleRappresentante
     */
    void setCognomeLegaleRappresentante(String cognomeLegaleRappresentante);

    /**
     * Set the value of denominazione
     * <br>obbligatorio se persona NON fisica
     * @param denominazione new value of denominazione
     */
    void setDenominazione(String denominazione);

    /**
     * Set the value of Ditta
     * <br>Indicare solo per imprenditore individuale
     * @param Ditta new value of Ditta
     */
    void setDitta(String Ditta);

    

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    void setId(Long id);

    /**
     * Set the value of nome
     * <br>Obbligatorio se persona fisica
     * @param nome new value of nome
     */
    void setNome(String nome);

    /**
     * Set the value of nomeLegaleRappresentante
     * <br>obbligatorio se persona NON fisica
     * @param nomeLegaleRappresentante new value of nomeLegaleRappresentante
     */
    void setNomeLegaleRappresentante(String nomeLegaleRappresentante);

    /**
     * Set the value of partitaIVA
     *
     * @param partitaIVA new value of partitaIVA
     */
    void setPartitaIVA(String partitaIVA);

    /**
     * Set the value of tipoAcquirente
     * <br>assume i valori:
     * <ul>
     * <li> rivenditore autorizzato [2]
     * <li> utilizzatore [3]
     * </ul>
     * @see org.casaburo.telefisco.api.TipoAcquirenteEnum
     * @see org.casaburo.telefisco.api.TipoAcquirenteConvertitore
     * @param tipoAcquirente new value of tipoAcquirente
     */
    void setTipoAcquirente(TipoAcquirenteEnum tipoAcquirente);

}
