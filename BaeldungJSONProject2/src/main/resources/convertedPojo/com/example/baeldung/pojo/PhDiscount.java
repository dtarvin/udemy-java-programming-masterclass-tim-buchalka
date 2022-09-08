
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
    "CAdditionalDiscount",
    "CDiscount",
    "CDiscountPercent",
    "CPiDiscount",
    "CSelect",
    "CSortby",
    "EntityReference",
    "EntityStatus",
    "EntityType"
})
@Generated("jsonschema2pojo")
public class PhDiscount {

    @JsonProperty("CAdditionalDiscount")
    private String cAdditionalDiscount;
    @JsonProperty("CDiscount")
    private String cDiscount;
    @JsonProperty("CDiscountPercent")
    private String cDiscountPercent;
    @JsonProperty("CPiDiscount")
    private String cPiDiscount;
    @JsonProperty("CSelect")
    private String cSelect;
    @JsonProperty("CSortby")
    private String cSortby;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityStatus")
    private String entityStatus;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CAdditionalDiscount")
    public String getCAdditionalDiscount() {
        return cAdditionalDiscount;
    }

    @JsonProperty("CAdditionalDiscount")
    public void setCAdditionalDiscount(String cAdditionalDiscount) {
        this.cAdditionalDiscount = cAdditionalDiscount;
    }

    public PhDiscount withCAdditionalDiscount(String cAdditionalDiscount) {
        this.cAdditionalDiscount = cAdditionalDiscount;
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

    public PhDiscount withCDiscount(String cDiscount) {
        this.cDiscount = cDiscount;
        return this;
    }

    @JsonProperty("CDiscountPercent")
    public String getCDiscountPercent() {
        return cDiscountPercent;
    }

    @JsonProperty("CDiscountPercent")
    public void setCDiscountPercent(String cDiscountPercent) {
        this.cDiscountPercent = cDiscountPercent;
    }

    public PhDiscount withCDiscountPercent(String cDiscountPercent) {
        this.cDiscountPercent = cDiscountPercent;
        return this;
    }

    @JsonProperty("CPiDiscount")
    public String getCPiDiscount() {
        return cPiDiscount;
    }

    @JsonProperty("CPiDiscount")
    public void setCPiDiscount(String cPiDiscount) {
        this.cPiDiscount = cPiDiscount;
    }

    public PhDiscount withCPiDiscount(String cPiDiscount) {
        this.cPiDiscount = cPiDiscount;
        return this;
    }

    @JsonProperty("CSelect")
    public String getCSelect() {
        return cSelect;
    }

    @JsonProperty("CSelect")
    public void setCSelect(String cSelect) {
        this.cSelect = cSelect;
    }

    public PhDiscount withCSelect(String cSelect) {
        this.cSelect = cSelect;
        return this;
    }

    @JsonProperty("CSortby")
    public String getCSortby() {
        return cSortby;
    }

    @JsonProperty("CSortby")
    public void setCSortby(String cSortby) {
        this.cSortby = cSortby;
    }

    public PhDiscount withCSortby(String cSortby) {
        this.cSortby = cSortby;
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

    public PhDiscount withEntityReference(String entityReference) {
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

    public PhDiscount withEntityStatus(String entityStatus) {
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

    public PhDiscount withEntityType(String entityType) {
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

    public PhDiscount withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PhDiscount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cAdditionalDiscount");
        sb.append('=');
        sb.append(((this.cAdditionalDiscount == null)?"<null>":this.cAdditionalDiscount));
        sb.append(',');
        sb.append("cDiscount");
        sb.append('=');
        sb.append(((this.cDiscount == null)?"<null>":this.cDiscount));
        sb.append(',');
        sb.append("cDiscountPercent");
        sb.append('=');
        sb.append(((this.cDiscountPercent == null)?"<null>":this.cDiscountPercent));
        sb.append(',');
        sb.append("cPiDiscount");
        sb.append('=');
        sb.append(((this.cPiDiscount == null)?"<null>":this.cPiDiscount));
        sb.append(',');
        sb.append("cSelect");
        sb.append('=');
        sb.append(((this.cSelect == null)?"<null>":this.cSelect));
        sb.append(',');
        sb.append("cSortby");
        sb.append('=');
        sb.append(((this.cSortby == null)?"<null>":this.cSortby));
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
        result = ((result* 31)+((this.cSelect == null)? 0 :this.cSelect.hashCode()));
        result = ((result* 31)+((this.cDiscountPercent == null)? 0 :this.cDiscountPercent.hashCode()));
        result = ((result* 31)+((this.cSortby == null)? 0 :this.cSortby.hashCode()));
        result = ((result* 31)+((this.cPiDiscount == null)? 0 :this.cPiDiscount.hashCode()));
        result = ((result* 31)+((this.entityStatus == null)? 0 :this.entityStatus.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.cAdditionalDiscount == null)? 0 :this.cAdditionalDiscount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cDiscount == null)? 0 :this.cDiscount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PhDiscount) == false) {
            return false;
        }
        PhDiscount rhs = ((PhDiscount) other);
        return (((((((((((this.cSelect == rhs.cSelect)||((this.cSelect!= null)&&this.cSelect.equals(rhs.cSelect)))&&((this.cDiscountPercent == rhs.cDiscountPercent)||((this.cDiscountPercent!= null)&&this.cDiscountPercent.equals(rhs.cDiscountPercent))))&&((this.cSortby == rhs.cSortby)||((this.cSortby!= null)&&this.cSortby.equals(rhs.cSortby))))&&((this.cPiDiscount == rhs.cPiDiscount)||((this.cPiDiscount!= null)&&this.cPiDiscount.equals(rhs.cPiDiscount))))&&((this.entityStatus == rhs.entityStatus)||((this.entityStatus!= null)&&this.entityStatus.equals(rhs.entityStatus))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.cAdditionalDiscount == rhs.cAdditionalDiscount)||((this.cAdditionalDiscount!= null)&&this.cAdditionalDiscount.equals(rhs.cAdditionalDiscount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cDiscount == rhs.cDiscount)||((this.cDiscount!= null)&&this.cDiscount.equals(rhs.cDiscount))));
    }

}
