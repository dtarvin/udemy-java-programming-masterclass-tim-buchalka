
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
    "CSavingByDiscount",
    "CTotlAnnualSavingDis",
    "EntityReference",
    "EntityType",
    "csavegbydiscnt"
})
@Generated("jsonschema2pojo")
public class Csavingbydiscount {

    @JsonProperty("CSavingByDiscount")
    private String cSavingByDiscount;
    @JsonProperty("CTotlAnnualSavingDis")
    private String cTotlAnnualSavingDis;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("csavegbydiscnt")
    private List<Csavegbydiscnt> csavegbydiscnt = new ArrayList<Csavegbydiscnt>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CSavingByDiscount")
    public String getCSavingByDiscount() {
        return cSavingByDiscount;
    }

    @JsonProperty("CSavingByDiscount")
    public void setCSavingByDiscount(String cSavingByDiscount) {
        this.cSavingByDiscount = cSavingByDiscount;
    }

    public Csavingbydiscount withCSavingByDiscount(String cSavingByDiscount) {
        this.cSavingByDiscount = cSavingByDiscount;
        return this;
    }

    @JsonProperty("CTotlAnnualSavingDis")
    public String getCTotlAnnualSavingDis() {
        return cTotlAnnualSavingDis;
    }

    @JsonProperty("CTotlAnnualSavingDis")
    public void setCTotlAnnualSavingDis(String cTotlAnnualSavingDis) {
        this.cTotlAnnualSavingDis = cTotlAnnualSavingDis;
    }

    public Csavingbydiscount withCTotlAnnualSavingDis(String cTotlAnnualSavingDis) {
        this.cTotlAnnualSavingDis = cTotlAnnualSavingDis;
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

    public Csavingbydiscount withEntityReference(String entityReference) {
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

    public Csavingbydiscount withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("csavegbydiscnt")
    public List<Csavegbydiscnt> getCsavegbydiscnt() {
        return csavegbydiscnt;
    }

    @JsonProperty("csavegbydiscnt")
    public void setCsavegbydiscnt(List<Csavegbydiscnt> csavegbydiscnt) {
        this.csavegbydiscnt = csavegbydiscnt;
    }

    public Csavingbydiscount withCsavegbydiscnt(List<Csavegbydiscnt> csavegbydiscnt) {
        this.csavegbydiscnt = csavegbydiscnt;
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

    public Csavingbydiscount withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Csavingbydiscount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cSavingByDiscount");
        sb.append('=');
        sb.append(((this.cSavingByDiscount == null)?"<null>":this.cSavingByDiscount));
        sb.append(',');
        sb.append("cTotlAnnualSavingDis");
        sb.append('=');
        sb.append(((this.cTotlAnnualSavingDis == null)?"<null>":this.cTotlAnnualSavingDis));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("csavegbydiscnt");
        sb.append('=');
        sb.append(((this.csavegbydiscnt == null)?"<null>":this.csavegbydiscnt));
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
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.csavegbydiscnt == null)? 0 :this.csavegbydiscnt.hashCode()));
        result = ((result* 31)+((this.cSavingByDiscount == null)? 0 :this.cSavingByDiscount.hashCode()));
        result = ((result* 31)+((this.cTotlAnnualSavingDis == null)? 0 :this.cTotlAnnualSavingDis.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Csavingbydiscount) == false) {
            return false;
        }
        Csavingbydiscount rhs = ((Csavingbydiscount) other);
        return (((((((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference)))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.csavegbydiscnt == rhs.csavegbydiscnt)||((this.csavegbydiscnt!= null)&&this.csavegbydiscnt.equals(rhs.csavegbydiscnt))))&&((this.cSavingByDiscount == rhs.cSavingByDiscount)||((this.cSavingByDiscount!= null)&&this.cSavingByDiscount.equals(rhs.cSavingByDiscount))))&&((this.cTotlAnnualSavingDis == rhs.cTotlAnnualSavingDis)||((this.cTotlAnnualSavingDis!= null)&&this.cTotlAnnualSavingDis.equals(rhs.cTotlAnnualSavingDis))));
    }

}
