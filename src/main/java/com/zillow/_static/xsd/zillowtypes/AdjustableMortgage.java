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
 * <p>Java class for AdjustableMortgage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustableMortgage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monthlyPrincipalAndInterest" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="monthlyPrincipalAndInterestAdjusted" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="maximumPayment" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="totalPayments" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="totalInterestPayments" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="amortizationSchedule" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}AdjustableMortgageAmortizationSchedule" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustableMortgage", propOrder = {
    "monthlyPrincipalAndInterest",
    "monthlyPrincipalAndInterestAdjusted",
    "maximumPayment",
    "totalPayments",
    "totalInterestPayments",
    "amortizationSchedule"
})
public class AdjustableMortgage {

    @XmlElement(required = true)
    protected BigInteger monthlyPrincipalAndInterest;
    @XmlElement(required = true)
    protected BigInteger monthlyPrincipalAndInterestAdjusted;
    @XmlElement(required = true)
    protected BigInteger maximumPayment;
    @XmlElement(required = true)
    protected BigInteger totalPayments;
    @XmlElement(required = true)
    protected BigInteger totalInterestPayments;
    @XmlElement(required = true)
    protected List<AdjustableMortgageAmortizationSchedule> amortizationSchedule;

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
     * Gets the value of the monthlyPrincipalAndInterestAdjusted property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyPrincipalAndInterestAdjusted() {
        return monthlyPrincipalAndInterestAdjusted;
    }

    /**
     * Sets the value of the monthlyPrincipalAndInterestAdjusted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyPrincipalAndInterestAdjusted(BigInteger value) {
        this.monthlyPrincipalAndInterestAdjusted = value;
    }

    /**
     * Gets the value of the maximumPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumPayment() {
        return maximumPayment;
    }

    /**
     * Sets the value of the maximumPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumPayment(BigInteger value) {
        this.maximumPayment = value;
    }

    /**
     * Gets the value of the totalPayments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPayments() {
        return totalPayments;
    }

    /**
     * Sets the value of the totalPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPayments(BigInteger value) {
        this.totalPayments = value;
    }

    /**
     * Gets the value of the totalInterestPayments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalInterestPayments() {
        return totalInterestPayments;
    }

    /**
     * Sets the value of the totalInterestPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalInterestPayments(BigInteger value) {
        this.totalInterestPayments = value;
    }

    /**
     * Gets the value of the amortizationSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amortizationSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmortizationSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjustableMortgageAmortizationSchedule }
     * 
     * 
     */
    public List<AdjustableMortgageAmortizationSchedule> getAmortizationSchedule() {
        if (amortizationSchedule == null) {
            amortizationSchedule = new ArrayList<AdjustableMortgageAmortizationSchedule>();
        }
        return this.amortizationSchedule;
    }

}
