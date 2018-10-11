//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.11 at 03:39:13 PM IST 
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
 * <p>Java class for loanAmountPairs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loanAmountPairs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pairs" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ltv" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loanAmountPairs", propOrder = {
    "pairs"
})
public class LoanAmountPairs {

    protected List<LoanAmountPairs.Pairs> pairs;

    /**
     * Gets the value of the pairs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pairs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanAmountPairs.Pairs }
     * 
     * 
     */
    public List<LoanAmountPairs.Pairs> getPairs() {
        if (pairs == null) {
            pairs = new ArrayList<LoanAmountPairs.Pairs>();
        }
        return this.pairs;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ltv" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ltv",
        "loanAmount"
    })
    public static class Pairs {

        protected double ltv;
        @XmlElement(required = true)
        protected BigInteger loanAmount;

        /**
         * Gets the value of the ltv property.
         * 
         */
        public double getLtv() {
            return ltv;
        }

        /**
         * Sets the value of the ltv property.
         * 
         */
        public void setLtv(double value) {
            this.ltv = value;
        }

        /**
         * Gets the value of the loanAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLoanAmount() {
            return loanAmount;
        }

        /**
         * Sets the value of the loanAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLoanAmount(BigInteger value) {
            this.loanAmount = value;
        }

    }

}
