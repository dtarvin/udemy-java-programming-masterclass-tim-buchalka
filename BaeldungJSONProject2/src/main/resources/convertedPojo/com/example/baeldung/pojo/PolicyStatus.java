
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
    "status",
    "entityType",
    "entityReference",
    "statusTimestamp"
})
@Generated("jsonschema2pojo")
public class PolicyStatus {

    @JsonProperty("status")
    private String status;
    @JsonProperty("entityType")
    private String entityType;
    @JsonProperty("entityReference")
    private String entityReference;
    @JsonProperty("statusTimestamp")
    private String statusTimestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public PolicyStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public PolicyStatus withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("entityReference")
    public String getEntityReference() {
        return entityReference;
    }

    @JsonProperty("entityReference")
    public void setEntityReference(String entityReference) {
        this.entityReference = entityReference;
    }

    public PolicyStatus withEntityReference(String entityReference) {
        this.entityReference = entityReference;
        return this;
    }

    @JsonProperty("statusTimestamp")
    public String getStatusTimestamp() {
        return statusTimestamp;
    }

    @JsonProperty("statusTimestamp")
    public void setStatusTimestamp(String statusTimestamp) {
        this.statusTimestamp = statusTimestamp;
    }

    public PolicyStatus withStatusTimestamp(String statusTimestamp) {
        this.statusTimestamp = statusTimestamp;
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

    public PolicyStatus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PolicyStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("statusTimestamp");
        sb.append('=');
        sb.append(((this.statusTimestamp == null)?"<null>":this.statusTimestamp));
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
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.statusTimestamp == null)? 0 :this.statusTimestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PolicyStatus) == false) {
            return false;
        }
        PolicyStatus rhs = ((PolicyStatus) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.statusTimestamp == rhs.statusTimestamp)||((this.statusTimestamp!= null)&&this.statusTimestamp.equals(rhs.statusTimestamp))));
    }

}
