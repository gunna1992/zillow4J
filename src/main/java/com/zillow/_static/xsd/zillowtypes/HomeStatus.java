//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 05:22:22 PM IST 
//


package com.zillow._static.xsd.zillowtypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HomeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HomeStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="forSale"/>
 *     &lt;enumeration value="makeMeMove"/>
 *     &lt;enumeration value="recentlySold"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HomeStatus")
@XmlEnum
public enum HomeStatus {

    @XmlEnumValue("forSale")
    FOR_SALE("forSale"),
    @XmlEnumValue("makeMeMove")
    MAKE_ME_MOVE("makeMeMove"),
    @XmlEnumValue("recentlySold")
    RECENTLY_SOLD("recentlySold"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    HomeStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HomeStatus fromValue(String v) {
        for (HomeStatus c: HomeStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
