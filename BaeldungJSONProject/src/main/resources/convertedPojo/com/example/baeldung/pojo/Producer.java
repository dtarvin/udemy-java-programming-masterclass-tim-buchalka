
package com.example.baeldung.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DirectBillIndicator",
    "DisplayProducerCode",
    "DistinguishedFieldUw",
    "EntityReference",
    "EntityType",
    "ExtUpdMisPolicies",
    "GoodStanding",
    "LicenseNo",
    "LicenseStates",
    "Name",
    "PolicyProducer",
    "Primary",
    "ProducerCode",
    "ProducerOfRecord",
    "SurplusLines",
    "Address",
    "Contact"
})
@Generated("jsonschema2pojo")
public class Producer {

    @JsonProperty("DirectBillIndicator")
    private String directBillIndicator;
    @JsonProperty("DisplayProducerCode")
    private String displayProducerCode;
    @JsonProperty("DistinguishedFieldUw")
    private String distinguishedFieldUw;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("ExtUpdMisPolicies")
    private String extUpdMisPolicies;
    @JsonProperty("GoodStanding")
    private String goodStanding;
    @JsonProperty("LicenseNo")
    private String licenseNo;
    @JsonProperty("LicenseStates")
    private String licenseStates;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("PolicyProducer")
    private String policyProducer;
    @JsonProperty("Primary")
    private String primary;
    @JsonProperty("ProducerCode")
    private String producerCode;
    @JsonProperty("ProducerOfRecord")
    private String producerOfRecord;
    @JsonProperty("SurplusLines")
    private String surplusLines;
    @JsonProperty("Address")
    private List<Address__1> address = new ArrayList<Address__1>();
    @JsonProperty("Contact")
    private List<Contact__1> contact = new ArrayList<Contact__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DirectBillIndicator")
    public String getDirectBillIndicator() {
        return directBillIndicator;
    }

    @JsonProperty("DirectBillIndicator")
    public void setDirectBillIndicator(String directBillIndicator) {
        this.directBillIndicator = directBillIndicator;
    }

    public Producer withDirectBillIndicator(String directBillIndicator) {
        this.directBillIndicator = directBillIndicator;
        return this;
    }

    @JsonProperty("DisplayProducerCode")
    public String getDisplayProducerCode() {
        return displayProducerCode;
    }

    @JsonProperty("DisplayProducerCode")
    public void setDisplayProducerCode(String displayProducerCode) {
        this.displayProducerCode = displayProducerCode;
    }

    public Producer withDisplayProducerCode(String displayProducerCode) {
        this.displayProducerCode = displayProducerCode;
        return this;
    }

    @JsonProperty("DistinguishedFieldUw")
    public String getDistinguishedFieldUw() {
        return distinguishedFieldUw;
    }

    @JsonProperty("DistinguishedFieldUw")
    public void setDistinguishedFieldUw(String distinguishedFieldUw) {
        this.distinguishedFieldUw = distinguishedFieldUw;
    }

    public Producer withDistinguishedFieldUw(String distinguishedFieldUw) {
        this.distinguishedFieldUw = distinguishedFieldUw;
        return this;
    }

    @JsonProperty("EntityReference")
    public String getEntityReference() {
        return entityReference;
    }

    @JsonProperty("EntityReference")
    public void setEntityReference(String entityReference) {
        this.entityReference = entityReference;
    }

    public Producer withEntityReference(String entityReference) {
        this.entityReference = entityReference;
        return this;
    }

    @JsonProperty("EntityType")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("EntityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Producer withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("ExtUpdMisPolicies")
    public String getExtUpdMisPolicies() {
        return extUpdMisPolicies;
    }

    @JsonProperty("ExtUpdMisPolicies")
    public void setExtUpdMisPolicies(String extUpdMisPolicies) {
        this.extUpdMisPolicies = extUpdMisPolicies;
    }

    public Producer withExtUpdMisPolicies(String extUpdMisPolicies) {
        this.extUpdMisPolicies = extUpdMisPolicies;
        return this;
    }

    @JsonProperty("GoodStanding")
    public String getGoodStanding() {
        return goodStanding;
    }

    @JsonProperty("GoodStanding")
    public void setGoodStanding(String goodStanding) {
        this.goodStanding = goodStanding;
    }

    public Producer withGoodStanding(String goodStanding) {
        this.goodStanding = goodStanding;
        return this;
    }

    @JsonProperty("LicenseNo")
    public String getLicenseNo() {
        return licenseNo;
    }

    @JsonProperty("LicenseNo")
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public Producer withLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }

    @JsonProperty("LicenseStates")
    public String getLicenseStates() {
        return licenseStates;
    }

    @JsonProperty("LicenseStates")
    public void setLicenseStates(String licenseStates) {
        this.licenseStates = licenseStates;
    }

    public Producer withLicenseStates(String licenseStates) {
        this.licenseStates = licenseStates;
        return this;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public Producer withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("PolicyProducer")
    public String getPolicyProducer() {
        return policyProducer;
    }

    @JsonProperty("PolicyProducer")
    public void setPolicyProducer(String policyProducer) {
        this.policyProducer = policyProducer;
    }

    public Producer withPolicyProducer(String policyProducer) {
        this.policyProducer = policyProducer;
        return this;
    }

    @JsonProperty("Primary")
    public String getPrimary() {
        return primary;
    }

    @JsonProperty("Primary")
    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public Producer withPrimary(String primary) {
        this.primary = primary;
        return this;
    }

    @JsonProperty("ProducerCode")
    public String getProducerCode() {
        return producerCode;
    }

    @JsonProperty("ProducerCode")
    public void setProducerCode(String producerCode) {
        this.producerCode = producerCode;
    }

    public Producer withProducerCode(String producerCode) {
        this.producerCode = producerCode;
        return this;
    }

    @JsonProperty("ProducerOfRecord")
    public String getProducerOfRecord() {
        return producerOfRecord;
    }

    @JsonProperty("ProducerOfRecord")
    public void setProducerOfRecord(String producerOfRecord) {
        this.producerOfRecord = producerOfRecord;
    }

    public Producer withProducerOfRecord(String producerOfRecord) {
        this.producerOfRecord = producerOfRecord;
        return this;
    }

    @JsonProperty("SurplusLines")
    public String getSurplusLines() {
        return surplusLines;
    }

    @JsonProperty("SurplusLines")
    public void setSurplusLines(String surplusLines) {
        this.surplusLines = surplusLines;
    }

    public Producer withSurplusLines(String surplusLines) {
        this.surplusLines = surplusLines;
        return this;
    }

    @JsonProperty("Address")
    public List<Address__1> getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(List<Address__1> address) {
        this.address = address;
    }

    public Producer withAddress(List<Address__1> address) {
        this.address = address;
        return this;
    }

    @JsonProperty("Contact")
    public List<Contact__1> getContact() {
        return contact;
    }

    @JsonProperty("Contact")
    public void setContact(List<Contact__1> contact) {
        this.contact = contact;
    }

    public Producer withContact(List<Contact__1> contact) {
        this.contact = contact;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Producer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Producer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("directBillIndicator");
        sb.append('=');
        sb.append(((this.directBillIndicator == null)?"<null>":this.directBillIndicator));
        sb.append(',');
        sb.append("displayProducerCode");
        sb.append('=');
        sb.append(((this.displayProducerCode == null)?"<null>":this.displayProducerCode));
        sb.append(',');
        sb.append("distinguishedFieldUw");
        sb.append('=');
        sb.append(((this.distinguishedFieldUw == null)?"<null>":this.distinguishedFieldUw));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("extUpdMisPolicies");
        sb.append('=');
        sb.append(((this.extUpdMisPolicies == null)?"<null>":this.extUpdMisPolicies));
        sb.append(',');
        sb.append("goodStanding");
        sb.append('=');
        sb.append(((this.goodStanding == null)?"<null>":this.goodStanding));
        sb.append(',');
        sb.append("licenseNo");
        sb.append('=');
        sb.append(((this.licenseNo == null)?"<null>":this.licenseNo));
        sb.append(',');
        sb.append("licenseStates");
        sb.append('=');
        sb.append(((this.licenseStates == null)?"<null>":this.licenseStates));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("policyProducer");
        sb.append('=');
        sb.append(((this.policyProducer == null)?"<null>":this.policyProducer));
        sb.append(',');
        sb.append("primary");
        sb.append('=');
        sb.append(((this.primary == null)?"<null>":this.primary));
        sb.append(',');
        sb.append("producerCode");
        sb.append('=');
        sb.append(((this.producerCode == null)?"<null>":this.producerCode));
        sb.append(',');
        sb.append("producerOfRecord");
        sb.append('=');
        sb.append(((this.producerOfRecord == null)?"<null>":this.producerOfRecord));
        sb.append(',');
        sb.append("surplusLines");
        sb.append('=');
        sb.append(((this.surplusLines == null)?"<null>":this.surplusLines));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.licenseNo == null)? 0 :this.licenseNo.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.distinguishedFieldUw == null)? 0 :this.distinguishedFieldUw.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.licenseStates == null)? 0 :this.licenseStates.hashCode()));
        result = ((result* 31)+((this.goodStanding == null)? 0 :this.goodStanding.hashCode()));
        result = ((result* 31)+((this.producerCode == null)? 0 :this.producerCode.hashCode()));
        result = ((result* 31)+((this.displayProducerCode == null)? 0 :this.displayProducerCode.hashCode()));
        result = ((result* 31)+((this.producerOfRecord == null)? 0 :this.producerOfRecord.hashCode()));
        result = ((result* 31)+((this.directBillIndicator == null)? 0 :this.directBillIndicator.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.policyProducer == null)? 0 :this.policyProducer.hashCode()));
        result = ((result* 31)+((this.surplusLines == null)? 0 :this.surplusLines.hashCode()));
        result = ((result* 31)+((this.extUpdMisPolicies == null)? 0 :this.extUpdMisPolicies.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.primary == null)? 0 :this.primary.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Producer) == false) {
            return false;
        }
        Producer rhs = ((Producer) other);
        return (((((((((((((((((((this.licenseNo == rhs.licenseNo)||((this.licenseNo!= null)&&this.licenseNo.equals(rhs.licenseNo)))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.distinguishedFieldUw == rhs.distinguishedFieldUw)||((this.distinguishedFieldUw!= null)&&this.distinguishedFieldUw.equals(rhs.distinguishedFieldUw))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.licenseStates == rhs.licenseStates)||((this.licenseStates!= null)&&this.licenseStates.equals(rhs.licenseStates))))&&((this.goodStanding == rhs.goodStanding)||((this.goodStanding!= null)&&this.goodStanding.equals(rhs.goodStanding))))&&((this.producerCode == rhs.producerCode)||((this.producerCode!= null)&&this.producerCode.equals(rhs.producerCode))))&&((this.displayProducerCode == rhs.displayProducerCode)||((this.displayProducerCode!= null)&&this.displayProducerCode.equals(rhs.displayProducerCode))))&&((this.producerOfRecord == rhs.producerOfRecord)||((this.producerOfRecord!= null)&&this.producerOfRecord.equals(rhs.producerOfRecord))))&&((this.directBillIndicator == rhs.directBillIndicator)||((this.directBillIndicator!= null)&&this.directBillIndicator.equals(rhs.directBillIndicator))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.policyProducer == rhs.policyProducer)||((this.policyProducer!= null)&&this.policyProducer.equals(rhs.policyProducer))))&&((this.surplusLines == rhs.surplusLines)||((this.surplusLines!= null)&&this.surplusLines.equals(rhs.surplusLines))))&&((this.extUpdMisPolicies == rhs.extUpdMisPolicies)||((this.extUpdMisPolicies!= null)&&this.extUpdMisPolicies.equals(rhs.extUpdMisPolicies))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.primary == rhs.primary)||((this.primary!= null)&&this.primary.equals(rhs.primary))));
    }

}
