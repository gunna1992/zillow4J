//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 05:22:22 PM IST 
//


package com.zillow._static.xsd.zillowtypes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yearlyCostsTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yearlyCostsTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="buyingBlock" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}buyingBlock" maxOccurs="unbounded"/>
 *         &lt;element name="rentingBlock" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}rentingBlock" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yearlyCostsTable", propOrder = {
    "year",
    "buyingBlock",
    "rentingBlock"
})
public class YearlyCostsTable {

    @XmlElement(required = true)
    protected BigInteger year;
    @XmlElement(required = true)
    protected List<BuyingBlock> buyingBlock;
    @XmlElement(required = true)
    protected List<RentingBlock> rentingBlock;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYear(BigInteger value) {
        this.year = value;
    }

    /**
     * Gets the value of the buyingBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyingBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyingBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyingBlock }
     * 
     * 
     */
    public List<BuyingBlock> getBuyingBlock() {
        if (buyingBlock == null) {
            buyingBlock = new ArrayList<BuyingBlock>();
        }
        return this.buyingBlock;
    }

    /**
     * Gets the value of the rentingBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentingBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentingBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RentingBlock }
     * 
     * 
     */
    public List<RentingBlock> getRentingBlock() {
        if (rentingBlock == null) {
            rentingBlock = new ArrayList<RentingBlock>();
        }
        return this.rentingBlock;
    }

}
