
package com.taekwondo.webservice.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "recuperationListeCompetiteurResponse", namespace = "http://webservice.taekwondo.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recuperationListeCompetiteurResponse", namespace = "http://webservice.taekwondo.com/")
public class RecuperationListeCompetiteurResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<com.taekwondo.webservice.Competiteur> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Competiteur>
     */
    public ArrayList<com.taekwondo.webservice.Competiteur> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<com.taekwondo.webservice.Competiteur> _return) {
        this._return = _return;
    }

}
