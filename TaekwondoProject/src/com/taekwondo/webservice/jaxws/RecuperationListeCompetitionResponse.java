
package com.taekwondo.webservice.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "recuperationListeCompetitionResponse", namespace = "http://webservice.taekwondo.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recuperationListeCompetitionResponse", namespace = "http://webservice.taekwondo.com/")
public class RecuperationListeCompetitionResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<com.taekwondo.webservice.Competition> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Competition>
     */
    public ArrayList<com.taekwondo.webservice.Competition> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<com.taekwondo.webservice.Competition> _return) {
        this._return = _return;
    }

}
