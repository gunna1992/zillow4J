//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.07 at 02:14:39 PM IST 
//


package com.zillow._static.xsd.zillowtypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for MonthlyPaymentsSummary complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MonthlyPaymentsSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payment" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}MonthlyPaymentData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="downPayment" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="monthlyPropertyTaxes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="monthlyHazardInsurance" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyPaymentsSummary", propOrder = {
        "payment",
        "downPayment",
        "monthlyPropertyTaxes",
        "monthlyHazardInsurance"
})
public class MonthlyPaymentsSummary {

    protected List<MonthlyPaymentData> payment;
    @XmlElement(required = true)
    protected BigInteger downPayment;
    protected BigInteger monthlyPropertyTaxes;
    protected BigInteger monthlyHazardInsurance;

    /**
     * Gets the value of the payment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthlyPaymentData }
     */
    public List<MonthlyPaymentData> getPayment() {
        if (payment == null) {
            payment = new ArrayList<MonthlyPaymentData>();
        }
        return this.payment;
    }

    /**
     * Gets the value of the downPayment property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDownPayment() {
        return downPayment;
    }

    /**
     * Sets the value of the downPayment property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDownPayment(BigInteger value) {
        this.downPayment = value;
    }

    /**
     * Gets the value of the monthlyPropertyTaxes property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMonthlyPropertyTaxes() {
        return monthlyPropertyTaxes;
    }

    /**
     * Sets the value of the monthlyPropertyTaxes property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMonthlyPropertyTaxes(BigInteger value) {
        this.monthlyPropertyTaxes = value;
    }

    /**
     * Gets the value of the monthlyHazardInsurance property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMonthlyHazardInsurance() {
        return monthlyHazardInsurance;
    }

    /**
     * Sets the value of the monthlyHazardInsurance property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMonthlyHazardInsurance(BigInteger value) {
        this.monthlyHazardInsurance = value;
    }

}
