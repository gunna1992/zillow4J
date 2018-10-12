//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 05:22:22 PM IST 
//


package com.zillow._static.xsd.zillowtypes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MortgageTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MortgageTerms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monthlyPrincipalAndInterest" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="monthlyPrincipalAndInterest2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="monthlyPrincipalAndInterest3" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="discountedCost" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="discountedCost2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="discountedCost3" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="remainingPrincipal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="remainingPrincipal2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="remainingPrincipal3" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="taxSavings" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="taxSavings2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="taxSavings3" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="totalCost2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="totalCost3" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MortgageTerms", propOrder = {
    "monthlyPrincipalAndInterest",
    "monthlyPrincipalAndInterest2",
    "monthlyPrincipalAndInterest3",
    "discountedCost",
    "discountedCost2",
    "discountedCost3",
    "remainingPrincipal",
    "remainingPrincipal2",
    "remainingPrincipal3",
    "taxSavings",
    "taxSavings2",
    "taxSavings3",
    "totalCost",
    "totalCost2",
    "totalCost3",
    "result"
})
public class MortgageTerms {

    @XmlElement(required = true)
    protected BigInteger monthlyPrincipalAndInterest;
    @XmlElement(required = true)
    protected BigInteger monthlyPrincipalAndInterest2;
    @XmlElement(required = true)
    protected BigInteger monthlyPrincipalAndInterest3;
    @XmlElement(required = true)
    protected BigInteger discountedCost;
    @XmlElement(required = true)
    protected BigInteger discountedCost2;
    @XmlElement(required = true)
    protected BigInteger discountedCost3;
    @XmlElement(required = true)
    protected BigInteger remainingPrincipal;
    @XmlElement(required = true)
    protected BigInteger remainingPrincipal2;
    @XmlElement(required = true)
    protected BigInteger remainingPrincipal3;
    @XmlElement(required = true)
    protected BigInteger taxSavings;
    @XmlElement(required = true)
    protected BigInteger taxSavings2;
    @XmlElement(required = true)
    protected BigInteger taxSavings3;
    @XmlElement(required = true)
    protected BigInteger totalCost;
    @XmlElement(required = true)
    protected BigInteger totalCost2;
    @XmlElement(required = true)
    protected BigInteger totalCost3;
    @XmlElement(required = true)
    protected String result;

    /**
     * Gets the value of the monthlyPrincipalAndInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyPrincipalAndInterest() {
        return monthlyPrincipalAndInterest;
    }

    /**
     * Sets the value of the monthlyPrincipalAndInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyPrincipalAndInterest(BigInteger value) {
        this.monthlyPrincipalAndInterest = value;
    }

    /**
     * Gets the value of the monthlyPrincipalAndInterest2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyPrincipalAndInterest2() {
        return monthlyPrincipalAndInterest2;
    }

    /**
     * Sets the value of the monthlyPrincipalAndInterest2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyPrincipalAndInterest2(BigInteger value) {
        this.monthlyPrincipalAndInterest2 = value;
    }

    /**
     * Gets the value of the monthlyPrincipalAndInterest3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyPrincipalAndInterest3() {
        return monthlyPrincipalAndInterest3;
    }

    /**
     * Sets the value of the monthlyPrincipalAndInterest3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyPrincipalAndInterest3(BigInteger value) {
        this.monthlyPrincipalAndInterest3 = value;
    }

    /**
     * Gets the value of the discountedCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiscountedCost() {
        return discountedCost;
    }

    /**
     * Sets the value of the discountedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiscountedCost(BigInteger value) {
        this.discountedCost = value;
    }

    /**
     * Gets the value of the discountedCost2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiscountedCost2() {
        return discountedCost2;
    }

    /**
     * Sets the value of the discountedCost2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiscountedCost2(BigInteger value) {
        this.discountedCost2 = value;
    }

    /**
     * Gets the value of the discountedCost3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiscountedCost3() {
        return discountedCost3;
    }

    /**
     * Sets the value of the discountedCost3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiscountedCost3(BigInteger value) {
        this.discountedCost3 = value;
    }

    /**
     * Gets the value of the remainingPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRemainingPrincipal() {
        return remainingPrincipal;
    }

    /**
     * Sets the value of the remainingPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRemainingPrincipal(BigInteger value) {
        this.remainingPrincipal = value;
    }

    /**
     * Gets the value of the remainingPrincipal2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRemainingPrincipal2() {
        return remainingPrincipal2;
    }

    /**
     * Sets the value of the remainingPrincipal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRemainingPrincipal2(BigInteger value) {
        this.remainingPrincipal2 = value;
    }

    /**
     * Gets the value of the remainingPrincipal3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRemainingPrincipal3() {
        return remainingPrincipal3;
    }

    /**
     * Sets the value of the remainingPrincipal3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRemainingPrincipal3(BigInteger value) {
        this.remainingPrincipal3 = value;
    }

    /**
     * Gets the value of the taxSavings property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxSavings() {
        return taxSavings;
    }

    /**
     * Sets the value of the taxSavings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxSavings(BigInteger value) {
        this.taxSavings = value;
    }

    /**
     * Gets the value of the taxSavings2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxSavings2() {
        return taxSavings2;
    }

    /**
     * Sets the value of the taxSavings2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxSavings2(BigInteger value) {
        this.taxSavings2 = value;
    }

    /**
     * Gets the value of the taxSavings3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxSavings3() {
        return taxSavings3;
    }

    /**
     * Sets the value of the taxSavings3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxSavings3(BigInteger value) {
        this.taxSavings3 = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCost(BigInteger value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the totalCost2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCost2() {
        return totalCost2;
    }

    /**
     * Sets the value of the totalCost2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCost2(BigInteger value) {
        this.totalCost2 = value;
    }

    /**
     * Gets the value of the totalCost3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCost3() {
        return totalCost3;
    }

    /**
     * Sets the value of the totalCost3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCost3(BigInteger value) {
        this.totalCost3 = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

}
