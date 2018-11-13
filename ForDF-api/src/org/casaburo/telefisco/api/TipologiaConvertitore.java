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
public class TipologiaConvertitore extends ObjectTypeConverter {

    public TipologiaConvertitore() {
        addConversionValue("01", TipologiaEnum.BOLLA_ACCOMPAGNAMENTO);
        addConversionValue("02", TipologiaEnum.FATTURA_ACCOMPAGNATORIA);
        addConversionValue("03", TipologiaEnum.RICEVUTA_FISCALE_DA_BOLLETTARIO_A_MADRE_E_FIGLIA);
        addConversionValue("04", TipologiaEnum.RICEVUTA_FISCALE);
        addConversionValue("05", TipologiaEnum.SCONTRINO_FISCALE);
        addConversionValue("06", TipologiaEnum.FATTURA_RICEVUTA_FISCALE);
        addConversionValue("07", TipologiaEnum.CONTRASSEGNO_IVA);
        addConversionValue("08", TipologiaEnum.GIORNALE_DI_FONDO);
        addConversionValue("09", TipologiaEnum.FORMULARIO_ACCOMPAGNAMENTO_RIFIUTI);


    }
}
