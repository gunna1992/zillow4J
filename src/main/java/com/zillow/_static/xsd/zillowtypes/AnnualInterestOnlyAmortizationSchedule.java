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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for annualInterestOnlyAmortizationSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="annualInterestOnlyAmortizationSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Payment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="beginningBalance" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="payment" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="interest" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="endingBalance" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="frequency" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "annualInterestOnlyAmortizationSchedule", propOrder = {
    "payment"
})
public class AnnualInterestOnlyAmortizationSchedule {

    @XmlElement(name = "Payment")
    protected List<AnnualInterestOnlyAmortizationSchedule.Payment> payment;
    @XmlAttribute(name = "frequency", required = true)
    protected String frequency;

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
     * {@link AnnualInterestOnlyAmortizationSchedule.Payment }
     * 
     * 
     */
    public List<AnnualInterestOnlyAmortizationSchedule.Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<AnnualInterestOnlyAmortizationSchedule.Payment>();
        }
        return this.payment;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
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
     *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="beginningBalance" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="payment" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="interest" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="endingBalance" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "period",
        "beginningBalance",
        "payment",
        "interest",
        "endingBalance"
    })
    public static class Payment {

        @XmlElement(required = true)
        protected BigInteger period;
        @XmlElement(required = true)
        protected BigInteger beginningBalance;
        @XmlElement(required = true)
        protected BigInteger payment;
        @XmlElement(required = true)
        protected BigInteger interest;
        @XmlElement(required = true)
        protected BigInteger endingBalance;

        /**
         * Gets the value of the period property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPeriod() {
            return period;
        }

        /**
         * Sets the value of the period property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPeriod(BigInteger value) {
            this.period = value;
        }

        /**
         * Gets the value of the beginningBalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBeginningBalance() {
            return beginningBalance;
        }

        /**
         * Sets the value of the beginningBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBeginningBalance(BigInteger value) {
            this.beginningBalance = value;
        }

        /**
         * Gets the value of the payment property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPayment() {
            return payment;
        }

        /**
         * Sets the value of the payment property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPayment(BigInteger value) {
            this.payment = value;
        }

        /**
         * Gets the value of the interest property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInterest() {
            return interest;
        }

        /**
         * Sets the value of the interest property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInterest(BigInteger value) {
            this.interest = value;
        }

        /**
         * Gets the value of the endingBalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEndingBalance() {
            return endingBalance;
        }

        /**
         * Sets the value of the endingBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEndingBalance(BigInteger value) {
            this.endingBalance = value;
        }

    }

}
