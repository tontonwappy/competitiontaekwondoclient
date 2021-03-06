
package com.taekwondo.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "retrouveIdCategorieResponse", namespace = "http://webservice.taekwondo.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrouveIdCategorieResponse", namespace = "http://webservice.taekwondo.com/")
public class RetrouveIdCategorieResponse {

    @XmlElement(name = "return", namespace = "")
    private int _return;

    /**
     * 
     * @return
     *     returns int
     */
    public int getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(int _return) {
        this._return = _return;
    }

}
