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
 * <p>Java class for sellingBlock complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="sellingBlock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selling" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sellingCosts" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="remainingPrincipal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="homeValue" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sellingBlock", propOrder = {
        "selling"
})
public class SellingBlock {

    protected List<SellingBlock.Selling> selling;

    /**
     * Gets the value of the selling property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selling property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelling().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellingBlock.Selling }
     */
    public List<SellingBlock.Selling> getSelling() {
        if (selling == null) {
            selling = new ArrayList<SellingBlock.Selling>();
        }
        return this.selling;
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
     *         &lt;element name="sellingCosts" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="remainingPrincipal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="homeValue" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "sellingCosts",
            "remainingPrincipal",
            "homeValue",
            "tax"
    })
    public static class Selling {

        @XmlElement(required = true)
        protected BigInteger sellingCosts;
        @XmlElement(required = true)
        protected BigInteger remainingPrincipal;
        @XmlElement(required = true)
        protected BigInteger homeValue;
        @XmlElement(required = true)
        protected BigInteger tax;

        /**
         * Gets the value of the sellingCosts property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getSellingCosts() {
            return sellingCosts;
        }

        /**
         * Sets the value of the sellingCosts property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setSellingCosts(BigInteger value) {
            this.sellingCosts = value;
        }

        /**
         * Gets the value of the remainingPrincipal property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getRemainingPrincipal() {
            return remainingPrincipal;
        }

        /**
         * Sets the value of the remainingPrincipal property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setRemainingPrincipal(BigInteger value) {
            this.remainingPrincipal = value;
        }

        /**
         * Gets the value of the homeValue property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getHomeValue() {
            return homeValue;
        }

        /**
         * Sets the value of the homeValue property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setHomeValue(BigInteger value) {
            this.homeValue = value;
        }

        /**
         * Gets the value of the tax property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getTax() {
            return tax;
        }

        /**
         * Sets the value of the tax property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setTax(BigInteger value) {
            this.tax = value;
        }

    }

}
