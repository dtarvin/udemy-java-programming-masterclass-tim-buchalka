
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
    "CAnnualSavings",
    "CDiscount",
    "CSavingByDiscnt",
    "EntityReference",
    "EntityStatus",
    "EntityType"
})
@Generated("jsonschema2pojo")
public class Csavegbydiscnt {

    @JsonProperty("CAnnualSavings")
    private String cAnnualSavings;
    @JsonProperty("CDiscount")
    private String cDiscount;
    @JsonProperty("CSavingByDiscnt")
    private String cSavingByDiscnt;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityStatus")
    private String entityStatus;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CAnnualSavings")
    public String getCAnnualSavings() {
        return cAnnualSavings;
    }

    @JsonProperty("CAnnualSavings")
    public void setCAnnualSavings(String cAnnualSavings) {
        this.cAnnualSavings = cAnnualSavings;
    }

    public Csavegbydiscnt withCAnnualSavings(String cAnnualSavings) {
        this.cAnnualSavings = cAnnualSavings;
        return this;
    }

    @JsonProperty("CDiscount")
    public String getCDiscount() {
        return cDiscount;
    }

    @JsonProperty("CDiscount")
    public void setCDiscount(String cDiscount) {
        this.cDiscount = cDiscount;
    }

    public Csavegbydiscnt withCDiscount(String cDiscount) {
        this.cDiscount = cDiscount;
        return this;
    }

    @JsonProperty("CSavingByDiscnt")
    public String getCSavingByDiscnt() {
        return cSavingByDiscnt;
    }

    @JsonProperty("CSavingByDiscnt")
    public void setCSavingByDiscnt(String cSavingByDiscnt) {
        this.cSavingByDiscnt = cSavingByDiscnt;
    }

    public Csavegbydiscnt withCSavingByDiscnt(String cSavingByDiscnt) {
        this.cSavingByDiscnt = cSavingByDiscnt;
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

    public Csavegbydiscnt withEntityReference(String entityReference) {
        this.entityReference = entityReference;
        return this;
    }

    @JsonProperty("EntityStatus")
    public String getEntityStatus() {
        return entityStatus;
    }

    @JsonProperty("EntityStatus")
    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public Csavegbydiscnt withEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
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

    public Csavegbydiscnt withEntityType(String entityType) {
        this.entityType = entityType;
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

    public Csavegbydiscnt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Csavegbydiscnt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cAnnualSavings");
        sb.append('=');
        sb.append(((this.cAnnualSavings == null)?"<null>":this.cAnnualSavings));
        sb.append(',');
        sb.append("cDiscount");
        sb.append('=');
        sb.append(((this.cDiscount == null)?"<null>":this.cDiscount));
        sb.append(',');
        sb.append("cSavingByDiscnt");
        sb.append('=');
        sb.append(((this.cSavingByDiscnt == null)?"<null>":this.cSavingByDiscnt));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("entityStatus");
        sb.append('=');
        sb.append(((this.entityStatus == null)?"<null>":this.entityStatus));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
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
        result = ((result* 31)+((this.entityStatus == null)? 0 :this.entityStatus.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.cSavingByDiscnt == null)? 0 :this.cSavingByDiscnt.hashCode()));
        result = ((result* 31)+((this.cAnnualSavings == null)? 0 :this.cAnnualSavings.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cDiscount == null)? 0 :this.cDiscount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Csavegbydiscnt) == false) {
            return false;
        }
        Csavegbydiscnt rhs = ((Csavegbydiscnt) other);
        return ((((((((this.entityStatus == rhs.entityStatus)||((this.entityStatus!= null)&&this.entityStatus.equals(rhs.entityStatus)))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.cSavingByDiscnt == rhs.cSavingByDiscnt)||((this.cSavingByDiscnt!= null)&&this.cSavingByDiscnt.equals(rhs.cSavingByDiscnt))))&&((this.cAnnualSavings == rhs.cAnnualSavings)||((this.cAnnualSavings!= null)&&this.cAnnualSavings.equals(rhs.cAnnualSavings))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cDiscount == rhs.cDiscount)||((this.cDiscount!= null)&&this.cDiscount.equals(rhs.cDiscount))));
    }

}
