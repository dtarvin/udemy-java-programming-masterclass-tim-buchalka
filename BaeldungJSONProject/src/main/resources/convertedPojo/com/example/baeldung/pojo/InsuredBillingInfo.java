
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
    "InsuredBilling"
})
@Generated("jsonschema2pojo")
public class InsuredBillingInfo {

    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("InsuredBilling")
    private String insuredBilling;
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

    public InsuredBillingInfo withEntityReference(String entityReference) {
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

    public InsuredBillingInfo withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("InsuredBilling")
    public String getInsuredBilling() {
        return insuredBilling;
    }

    @JsonProperty("InsuredBilling")
    public void setInsuredBilling(String insuredBilling) {
        this.insuredBilling = insuredBilling;
    }

    public InsuredBillingInfo withInsuredBilling(String insuredBilling) {
        this.insuredBilling = insuredBilling;
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

    public InsuredBillingInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InsuredBillingInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("insuredBilling");
        sb.append('=');
        sb.append(((this.insuredBilling == null)?"<null>":this.insuredBilling));
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
        result = ((result* 31)+((this.insuredBilling == null)? 0 :this.insuredBilling.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InsuredBillingInfo) == false) {
            return false;
        }
        InsuredBillingInfo rhs = ((InsuredBillingInfo) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.insuredBilling == rhs.insuredBilling)||((this.insuredBilling!= null)&&this.insuredBilling.equals(rhs.insuredBilling))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))));
    }

}
