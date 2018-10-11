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
 * <p>Java class for RentVsBuy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RentVsBuy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="breakEven" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="totalSavings" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="downPayment" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="closingCosts" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="rentDeposit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="rentDepositReturn" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="rentBrokerFee" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="yearlyCostsTable" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}yearlyCostsTable" maxOccurs="unbounded"/>
 *         &lt;element name="cumulativeYearlyCostsTable" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}cumulativeYearlyCostsTable" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentVsBuy", propOrder = {
    "result",
    "breakEven",
    "totalSavings",
    "downPayment",
    "closingCosts",
    "rentDeposit",
    "rentDepositReturn",
    "rentBrokerFee",
    "yearlyCostsTable",
    "cumulativeYearlyCostsTable"
})
public class RentVsBuy {

    @XmlElement(required = true)
    protected String result;
    @XmlElement(required = true)
    protected BigInteger breakEven;
    @XmlElement(required = true)
    protected BigInteger totalSavings;
    @XmlElement(required = true)
    protected BigInteger downPayment;
    @XmlElement(required = true)
    protected BigInteger closingCosts;
    @XmlElement(required = true)
    protected BigInteger rentDeposit;
    @XmlElement(required = true)
    protected BigInteger rentDepositReturn;
    @XmlElement(required = true)
    protected BigInteger rentBrokerFee;
    @XmlElement(required = true)
    protected List<YearlyCostsTable> yearlyCostsTable;
    @XmlElement(required = true)
    protected List<CumulativeYearlyCostsTable> cumulativeYearlyCostsTable;

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

    /**
     * Gets the value of the breakEven property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBreakEven() {
        return breakEven;
    }

    /**
     * Sets the value of the breakEven property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBreakEven(BigInteger value) {
        this.breakEven = value;
    }

    /**
     * Gets the value of the totalSavings property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSavings() {
        return totalSavings;
    }

    /**
     * Sets the value of the totalSavings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSavings(BigInteger value) {
        this.totalSavings = value;
    }

    /**
     * Gets the value of the downPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDownPayment() {
        return downPayment;
    }

    /**
     * Sets the value of the downPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDownPayment(BigInteger value) {
        this.downPayment = value;
    }

    /**
     * Gets the value of the closingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClosingCosts() {
        return closingCosts;
    }

    /**
     * Sets the value of the closingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClosingCosts(BigInteger value) {
        this.closingCosts = value;
    }

    /**
     * Gets the value of the rentDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRentDeposit() {
        return rentDeposit;
    }

    /**
     * Sets the value of the rentDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRentDeposit(BigInteger value) {
        this.rentDeposit = value;
    }

    /**
     * Gets the value of the rentDepositReturn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRentDepositReturn() {
        return rentDepositReturn;
    }

    /**
     * Sets the value of the rentDepositReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRentDepositReturn(BigInteger value) {
        this.rentDepositReturn = value;
    }

    /**
     * Gets the value of the rentBrokerFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRentBrokerFee() {
        return rentBrokerFee;
    }

    /**
     * Sets the value of the rentBrokerFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRentBrokerFee(BigInteger value) {
        this.rentBrokerFee = value;
    }

    /**
     * Gets the value of the yearlyCostsTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yearlyCostsTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYearlyCostsTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YearlyCostsTable }
     * 
     * 
     */
    public List<YearlyCostsTable> getYearlyCostsTable() {
        if (yearlyCostsTable == null) {
            yearlyCostsTable = new ArrayList<YearlyCostsTable>();
        }
        return this.yearlyCostsTable;
    }

    /**
     * Gets the value of the cumulativeYearlyCostsTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumulativeYearlyCostsTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumulativeYearlyCostsTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CumulativeYearlyCostsTable }
     * 
     * 
     */
    public List<CumulativeYearlyCostsTable> getCumulativeYearlyCostsTable() {
        if (cumulativeYearlyCostsTable == null) {
            cumulativeYearlyCostsTable = new ArrayList<CumulativeYearlyCostsTable>();
        }
        return this.cumulativeYearlyCostsTable;
    }

}
