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
 * @author Rocco.Casaburo
 */
public interface ContattoInterface {



    String getTitolo();
    String getNome();
    String getCognome();
    String getCittà();
    String getCAP();
    String getProvincia();
    String getIndirizzo();
    String getTelefonoLavoro();
    String getTelefonoPersonale();
    String getFaxNumero();
    String getEmail1();
    String getEmail2();
    String getSitoWeb();
    String getNote();


    /**
     * Esempi: Sig.; Sig.ra; Dott.;Prof.;Avv.;Egr.
     * @param titolo
     */
    void setTitolo(String titolo);
    void setNome(String nome);
    void setCognome(String cognome);
    void setCittà(String città);
    void setCAP(String CAP);
    void setProvincia(String provincia);
    void setIndirizzo(String indirizzo);
    void setTelefonoLavoro(String telefonoLavoro);
    void setTelefonoPersonale(String telefonoPersonale);
    void setFaxNumero(String faxNumero);
    void setEmail1(String email1);
    void setEmail2(String email2);
    void setSitoWeb(String sitoWeb);
    void setNote(String note);





}
