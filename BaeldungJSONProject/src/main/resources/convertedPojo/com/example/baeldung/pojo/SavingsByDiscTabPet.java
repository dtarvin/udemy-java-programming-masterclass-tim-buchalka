
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
    "CDiscountCode",
    "CDiscRate",
    "CPiSavingByDiscTab",
    "EntityReference",
    "EntityStatus",
    "EntityType"
})
@Generated("jsonschema2pojo")
public class SavingsByDiscTabPet {

    @JsonProperty("CAnnualSavings")
    private String cAnnualSavings;
    @JsonProperty("CDiscount")
    private String cDiscount;
    @JsonProperty("CDiscountCode")
    private String cDiscountCode;
    @JsonProperty("CDiscRate")
    private String cDiscRate;
    @JsonProperty("CPiSavingByDiscTab")
    private String cPiSavingByDiscTab;
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

    public SavingsByDiscTabPet withCAnnualSavings(String cAnnualSavings) {
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

    public SavingsByDiscTabPet withCDiscount(String cDiscount) {
        this.cDiscount = cDiscount;
        return this;
    }

    @JsonProperty("CDiscountCode")
    public String getCDiscountCode() {
        return cDiscountCode;
    }

    @JsonProperty("CDiscountCode")
    public void setCDiscountCode(String cDiscountCode) {
        this.cDiscountCode = cDiscountCode;
    }

    public SavingsByDiscTabPet withCDiscountCode(String cDiscountCode) {
        this.cDiscountCode = cDiscountCode;
        return this;
    }

    @JsonProperty("CDiscRate")
    public String getCDiscRate() {
        return cDiscRate;
    }

    @JsonProperty("CDiscRate")
    public void setCDiscRate(String cDiscRate) {
        this.cDiscRate = cDiscRate;
    }

    public SavingsByDiscTabPet withCDiscRate(String cDiscRate) {
        this.cDiscRate = cDiscRate;
        return this;
    }

    @JsonProperty("CPiSavingByDiscTab")
    public String getCPiSavingByDiscTab() {
        return cPiSavingByDiscTab;
    }

    @JsonProperty("CPiSavingByDiscTab")
    public void setCPiSavingByDiscTab(String cPiSavingByDiscTab) {
        this.cPiSavingByDiscTab = cPiSavingByDiscTab;
    }

    public SavingsByDiscTabPet withCPiSavingByDiscTab(String cPiSavingByDiscTab) {
        this.cPiSavingByDiscTab = cPiSavingByDiscTab;
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

    public SavingsByDiscTabPet withEntityReference(String entityReference) {
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

    public SavingsByDiscTabPet withEntityStatus(String entityStatus) {
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

    public SavingsByDiscTabPet withEntityType(String entityType) {
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

    public SavingsByDiscTabPet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SavingsByDiscTabPet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cAnnualSavings");
        sb.append('=');
        sb.append(((this.cAnnualSavings == null)?"<null>":this.cAnnualSavings));
        sb.append(',');
        sb.append("cDiscount");
        sb.append('=');
        sb.append(((this.cDiscount == null)?"<null>":this.cDiscount));
        sb.append(',');
        sb.append("cDiscountCode");
        sb.append('=');
        sb.append(((this.cDiscountCode == null)?"<null>":this.cDiscountCode));
        sb.append(',');
        sb.append("cDiscRate");
        sb.append('=');
        sb.append(((this.cDiscRate == null)?"<null>":this.cDiscRate));
        sb.append(',');
        sb.append("cPiSavingByDiscTab");
        sb.append('=');
        sb.append(((this.cPiSavingByDiscTab == null)?"<null>":this.cPiSavingByDiscTab));
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
        result = ((result* 31)+((this.cDiscountCode == null)? 0 :this.cDiscountCode.hashCode()));
        result = ((result* 31)+((this.cDiscRate == null)? 0 :this.cDiscRate.hashCode()));
        result = ((result* 31)+((this.entityStatus == null)? 0 :this.entityStatus.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.cAnnualSavings == null)? 0 :this.cAnnualSavings.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cDiscount == null)? 0 :this.cDiscount.hashCode()));
        result = ((result* 31)+((this.cPiSavingByDiscTab == null)? 0 :this.cPiSavingByDiscTab.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SavingsByDiscTabPet) == false) {
            return false;
        }
        SavingsByDiscTabPet rhs = ((SavingsByDiscTabPet) other);
        return ((((((((((this.cDiscountCode == rhs.cDiscountCode)||((this.cDiscountCode!= null)&&this.cDiscountCode.equals(rhs.cDiscountCode)))&&((this.cDiscRate == rhs.cDiscRate)||((this.cDiscRate!= null)&&this.cDiscRate.equals(rhs.cDiscRate))))&&((this.entityStatus == rhs.entityStatus)||((this.entityStatus!= null)&&this.entityStatus.equals(rhs.entityStatus))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.cAnnualSavings == rhs.cAnnualSavings)||((this.cAnnualSavings!= null)&&this.cAnnualSavings.equals(rhs.cAnnualSavings))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cDiscount == rhs.cDiscount)||((this.cDiscount!= null)&&this.cDiscount.equals(rhs.cDiscount))))&&((this.cPiSavingByDiscTab == rhs.cPiSavingByDiscTab)||((this.cPiSavingByDiscTab!= null)&&this.cPiSavingByDiscTab.equals(rhs.cPiSavingByDiscTab))));
    }

}
