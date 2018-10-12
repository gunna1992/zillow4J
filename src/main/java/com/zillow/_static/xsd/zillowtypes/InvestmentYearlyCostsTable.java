//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 05:22:22 PM IST 
//


package com.zillow._static.xsd.zillowtypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for investmentYearlyCostsTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="investmentYearlyCostsTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="investmentBuyingBlock" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}investmentBuyingBlock" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "investmentYearlyCostsTable", propOrder = {
    "investmentBuyingBlock"
})
public class InvestmentYearlyCostsTable {

    @XmlElement(required = true)
    protected List<InvestmentBuyingBlock> investmentBuyingBlock;

    /**
     * Gets the value of the investmentBuyingBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investmentBuyingBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestmentBuyingBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentBuyingBlock }
     * 
     * 
     */
    public List<InvestmentBuyingBlock> getInvestmentBuyingBlock() {
        if (investmentBuyingBlock == null) {
            investmentBuyingBlock = new ArrayList<InvestmentBuyingBlock>();
        }
        return this.investmentBuyingBlock;
    }

}
