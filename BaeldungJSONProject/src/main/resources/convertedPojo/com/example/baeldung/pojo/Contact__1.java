
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
    "Phone1",
    "ProducerContact"
})
@Generated("jsonschema2pojo")
public class Contact__1 {

    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("Phone1")
    private String phone1;
    @JsonProperty("ProducerContact")
    private String producerContact;
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

    public Contact__1 withEntityReference(String entityReference) {
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

    public Contact__1 withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("Phone1")
    public String getPhone1() {
        return phone1;
    }

    @JsonProperty("Phone1")
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public Contact__1 withPhone1(String phone1) {
        this.phone1 = phone1;
        return this;
    }

    @JsonProperty("ProducerContact")
    public String getProducerContact() {
        return producerContact;
    }

    @JsonProperty("ProducerContact")
    public void setProducerContact(String producerContact) {
        this.producerContact = producerContact;
    }

    public Contact__1 withProducerContact(String producerContact) {
        this.producerContact = producerContact;
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

    public Contact__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contact__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("phone1");
        sb.append('=');
        sb.append(((this.phone1 == null)?"<null>":this.phone1));
        sb.append(',');
        sb.append("producerContact");
        sb.append('=');
        sb.append(((this.producerContact == null)?"<null>":this.producerContact));
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
        result = ((result* 31)+((this.producerContact == null)? 0 :this.producerContact.hashCode()));
        result = ((result* 31)+((this.phone1 == null)? 0 :this.phone1 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact__1) == false) {
            return false;
        }
        Contact__1 rhs = ((Contact__1) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.producerContact == rhs.producerContact)||((this.producerContact!= null)&&this.producerContact.equals(rhs.producerContact))))&&((this.phone1 == rhs.phone1)||((this.phone1 != null)&&this.phone1 .equals(rhs.phone1))));
    }

}
