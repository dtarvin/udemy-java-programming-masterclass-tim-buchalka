
package com.example.baeldung.pojo;

import java.util.HashMap;
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
    "EntityReference",
    "EntityType",
    "InsuredContact",
    "MasterRecordGid"
})
@Generated("jsonschema2pojo")
public class Contact {

    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("InsuredContact")
    private String insuredContact;
    @JsonProperty("MasterRecordGid")
    private String masterRecordGid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EntityReference")
    public String getEntityReference() {
        return entityReference;
    }

    @JsonProperty("EntityReference")
    public void setEntityReference(String entityReference) {
        this.entityReference = entityReference;
    }

    public Contact withEntityReference(String entityReference) {
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

    public Contact withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("InsuredContact")
    public String getInsuredContact() {
        return insuredContact;
    }

    @JsonProperty("InsuredContact")
    public void setInsuredContact(String insuredContact) {
        this.insuredContact = insuredContact;
    }

    public Contact withInsuredContact(String insuredContact) {
        this.insuredContact = insuredContact;
        return this;
    }

    @JsonProperty("MasterRecordGid")
    public String getMasterRecordGid() {
        return masterRecordGid;
    }

    @JsonProperty("MasterRecordGid")
    public void setMasterRecordGid(String masterRecordGid) {
        this.masterRecordGid = masterRecordGid;
    }

    public Contact withMasterRecordGid(String masterRecordGid) {
        this.masterRecordGid = masterRecordGid;
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

    public Contact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("insuredContact");
        sb.append('=');
        sb.append(((this.insuredContact == null)?"<null>":this.insuredContact));
        sb.append(',');
        sb.append("masterRecordGid");
        sb.append('=');
        sb.append(((this.masterRecordGid == null)?"<null>":this.masterRecordGid));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.insuredContact == null)? 0 :this.insuredContact.hashCode()));
        result = ((result* 31)+((this.masterRecordGid == null)? 0 :this.masterRecordGid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.insuredContact == rhs.insuredContact)||((this.insuredContact!= null)&&this.insuredContact.equals(rhs.insuredContact))))&&((this.masterRecordGid == rhs.masterRecordGid)||((this.masterRecordGid!= null)&&this.masterRecordGid.equals(rhs.masterRecordGid))));
    }

}
