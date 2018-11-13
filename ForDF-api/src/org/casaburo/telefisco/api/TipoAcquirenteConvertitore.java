/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casaburo.telefisco.api;

import org.eclipse.persistence.mappings.converters.ObjectTypeConverter;

/**
 *
 * @author Rocco Casaburo <casaburo.rocco at gmail.com>
 */
public class TipoAcquirenteConvertitore extends ObjectTypeConverter {

    public TipoAcquirenteConvertitore() {
        addConversionValue("2", TipoAcquirenteEnum.RIVENDITORE_AUTORIZZATO);
        addConversionValue("3", TipoAcquirenteEnum.UTILIZZATORE);
       

    }
}
