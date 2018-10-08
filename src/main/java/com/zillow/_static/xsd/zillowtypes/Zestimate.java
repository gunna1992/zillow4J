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


/**
 * <p>Java class for Zestimate complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Zestimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}Amount"/>
 *         &lt;element name="last-updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oneWeekChange" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}AmountOptional"/>
 *         &lt;element name="valueChange" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}AmountOptional"/>
 *         &lt;element name="valuationRange">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="low" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}Amount"/>
 *                   &lt;element name="high" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}Amount"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="percentile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zestimate", propOrder = {
        "amount",
        "lastUpdated",
        "oneWeekChange",
        "valueChange",
        "valuationRange",
        "percentile"
})
public class Zestimate {

    @XmlElement(required = true)
    protected Amount amount;
    @XmlElement(name = "last-updated")
    protected String lastUpdated;
    @XmlElement(required = true)
    protected AmountOptional oneWeekChange;
    @XmlElement(required = true)
    protected AmountOptional valueChange;
    @XmlElement(required = true)
    protected Zestimate.ValuationRange valuationRange;
    protected String percentile;

    /**
     * Gets the value of the amount property.
     *
     * @return possible object is
     * {@link Amount }
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     *
     * @param value allowed object is
     *              {@link Amount }
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastUpdated(String value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the oneWeekChange property.
     *
     * @return possible object is
     * {@link AmountOptional }
     */
    public AmountOptional getOneWeekChange() {
        return oneWeekChange;
    }

    /**
     * Sets the value of the oneWeekChange property.
     *
     * @param value allowed object is
     *              {@link AmountOptional }
     */
    public void setOneWeekChange(AmountOptional value) {
        this.oneWeekChange = value;
    }

    /**
     * Gets the value of the valueChange property.
     *
     * @return possible object is
     * {@link AmountOptional }
     */
    public AmountOptional getValueChange() {
        return valueChange;
    }

    /**
     * Sets the value of the valueChange property.
     *
     * @param value allowed object is
     *              {@link AmountOptional }
     */
    public void setValueChange(AmountOptional value) {
        this.valueChange = value;
    }

    /**
     * Gets the value of the valuationRange property.
     *
     * @return possible object is
     * {@link Zestimate.ValuationRange }
     */
    public Zestimate.ValuationRange getValuationRange() {
        return valuationRange;
    }

    /**
     * Sets the value of the valuationRange property.
     *
     * @param value allowed object is
     *              {@link Zestimate.ValuationRange }
     */
    public void setValuationRange(Zestimate.ValuationRange value) {
        this.valuationRange = value;
    }

    /**
     * Gets the value of the percentile property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPercentile() {
        return percentile;
    }

    /**
     * Sets the value of the percentile property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPercentile(String value) {
        this.percentile = value;
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
     *         &lt;element name="low" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}Amount"/>
     *         &lt;element name="high" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}Amount"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "low",
            "high"
    })
    public static class ValuationRange {

        @XmlElement(required = true)
        protected Amount low;
        @XmlElement(required = true)
        protected Amount high;

        /**
         * Gets the value of the low property.
         *
         * @return possible object is
         * {@link Amount }
         */
        public Amount getLow() {
            return low;
        }

        /**
         * Sets the value of the low property.
         *
         * @param value allowed object is
         *              {@link Amount }
         */
        public void setLow(Amount value) {
            this.low = value;
        }

        /**
         * Gets the value of the high property.
         *
         * @return possible object is
         * {@link Amount }
         */
        public Amount getHigh() {
            return high;
        }

        /**
         * Sets the value of the high property.
         *
         * @param value allowed object is
         *              {@link Amount }
         */
        public void setHigh(Amount value) {
            this.high = value;
        }

    }

}
