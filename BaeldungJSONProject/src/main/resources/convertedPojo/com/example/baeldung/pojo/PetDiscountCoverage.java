
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
    "CAnnualDiscountPremium",
    "CAnnualPremium",
    "CCoverage",
    "CCoverageCode",
    "CDiscountFactor",
    "CDisplayCoverage",
    "CFinalAnnDisPremium",
    "CPetDiscountCov",
    "EntityReference",
    "EntityStatus",
    "EntityType",
    "CSelect"
})
@Generated("jsonschema2pojo")
public class PetDiscountCoverage {

    @JsonProperty("CAnnualDiscountPremium")
    private String cAnnualDiscountPremium;
    @JsonProperty("CAnnualPremium")
    private String cAnnualPremium;
    @JsonProperty("CCoverage")
    private String cCoverage;
    @JsonProperty("CCoverageCode")
    private String cCoverageCode;
    @JsonProperty("CDiscountFactor")
    private String cDiscountFactor;
    @JsonProperty("CDisplayCoverage")
    private String cDisplayCoverage;
    @JsonProperty("CFinalAnnDisPremium")
    private String cFinalAnnDisPremium;
    @JsonProperty("CPetDiscountCov")
    private String cPetDiscountCov;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityStatus")
    private String entityStatus;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("CSelect")
    private String cSelect;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CAnnualDiscountPremium")
    public String getCAnnualDiscountPremium() {
        return cAnnualDiscountPremium;
    }

    @JsonProperty("CAnnualDiscountPremium")
    public void setCAnnualDiscountPremium(String cAnnualDiscountPremium) {
        this.cAnnualDiscountPremium = cAnnualDiscountPremium;
    }

    public PetDiscountCoverage withCAnnualDiscountPremium(String cAnnualDiscountPremium) {
        this.cAnnualDiscountPremium = cAnnualDiscountPremium;
        return this;
    }

    @JsonProperty("CAnnualPremium")
    public String getCAnnualPremium() {
        return cAnnualPremium;
    }

    @JsonProperty("CAnnualPremium")
    public void setCAnnualPremium(String cAnnualPremium) {
        this.cAnnualPremium = cAnnualPremium;
    }

    public PetDiscountCoverage withCAnnualPremium(String cAnnualPremium) {
        this.cAnnualPremium = cAnnualPremium;
        return this;
    }

    @JsonProperty("CCoverage")
    public String getCCoverage() {
        return cCoverage;
    }

    @JsonProperty("CCoverage")
    public void setCCoverage(String cCoverage) {
        this.cCoverage = cCoverage;
    }

    public PetDiscountCoverage withCCoverage(String cCoverage) {
        this.cCoverage = cCoverage;
        return this;
    }

    @JsonProperty("CCoverageCode")
    public String getCCoverageCode() {
        return cCoverageCode;
    }

    @JsonProperty("CCoverageCode")
    public void setCCoverageCode(String cCoverageCode) {
        this.cCoverageCode = cCoverageCode;
    }

    public PetDiscountCoverage withCCoverageCode(String cCoverageCode) {
        this.cCoverageCode = cCoverageCode;
        return this;
    }

    @JsonProperty("CDiscountFactor")
    public String getCDiscountFactor() {
        return cDiscountFactor;
    }

    @JsonProperty("CDiscountFactor")
    public void setCDiscountFactor(String cDiscountFactor) {
        this.cDiscountFactor = cDiscountFactor;
    }

    public PetDiscountCoverage withCDiscountFactor(String cDiscountFactor) {
        this.cDiscountFactor = cDiscountFactor;
        return this;
    }

    @JsonProperty("CDisplayCoverage")
    public String getCDisplayCoverage() {
        return cDisplayCoverage;
    }

    @JsonProperty("CDisplayCoverage")
    public void setCDisplayCoverage(String cDisplayCoverage) {
        this.cDisplayCoverage = cDisplayCoverage;
    }

    public PetDiscountCoverage withCDisplayCoverage(String cDisplayCoverage) {
        this.cDisplayCoverage = cDisplayCoverage;
        return this;
    }

    @JsonProperty("CFinalAnnDisPremium")
    public String getCFinalAnnDisPremium() {
        return cFinalAnnDisPremium;
    }

    @JsonProperty("CFinalAnnDisPremium")
    public void setCFinalAnnDisPremium(String cFinalAnnDisPremium) {
        this.cFinalAnnDisPremium = cFinalAnnDisPremium;
    }

    public PetDiscountCoverage withCFinalAnnDisPremium(String cFinalAnnDisPremium) {
        this.cFinalAnnDisPremium = cFinalAnnDisPremium;
        return this;
    }

    @JsonProperty("CPetDiscountCov")
    public String getCPetDiscountCov() {
        return cPetDiscountCov;
    }

    @JsonProperty("CPetDiscountCov")
    public void setCPetDiscountCov(String cPetDiscountCov) {
        this.cPetDiscountCov = cPetDiscountCov;
    }

    public PetDiscountCoverage withCPetDiscountCov(String cPetDiscountCov) {
        this.cPetDiscountCov = cPetDiscountCov;
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

    public PetDiscountCoverage withEntityReference(String entityReference) {
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

    public PetDiscountCoverage withEntityStatus(String entityStatus) {
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

    public PetDiscountCoverage withEntityType(String entityType) {
        this.entityType = entityType;
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

    public PetDiscountCoverage withCSelect(String cSelect) {
        this.cSelect = cSelect;
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

    public PetDiscountCoverage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PetDiscountCoverage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cAnnualDiscountPremium");
        sb.append('=');
        sb.append(((this.cAnnualDiscountPremium == null)?"<null>":this.cAnnualDiscountPremium));
        sb.append(',');
        sb.append("cAnnualPremium");
        sb.append('=');
        sb.append(((this.cAnnualPremium == null)?"<null>":this.cAnnualPremium));
        sb.append(',');
        sb.append("cCoverage");
        sb.append('=');
        sb.append(((this.cCoverage == null)?"<null>":this.cCoverage));
        sb.append(',');
        sb.append("cCoverageCode");
        sb.append('=');
        sb.append(((this.cCoverageCode == null)?"<null>":this.cCoverageCode));
        sb.append(',');
        sb.append("cDiscountFactor");
        sb.append('=');
        sb.append(((this.cDiscountFactor == null)?"<null>":this.cDiscountFactor));
        sb.append(',');
        sb.append("cDisplayCoverage");
        sb.append('=');
        sb.append(((this.cDisplayCoverage == null)?"<null>":this.cDisplayCoverage));
        sb.append(',');
        sb.append("cFinalAnnDisPremium");
        sb.append('=');
        sb.append(((this.cFinalAnnDisPremium == null)?"<null>":this.cFinalAnnDisPremium));
        sb.append(',');
        sb.append("cPetDiscountCov");
        sb.append('=');
        sb.append(((this.cPetDiscountCov == null)?"<null>":this.cPetDiscountCov));
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
        sb.append("cSelect");
        sb.append('=');
        sb.append(((this.cSelect == null)?"<null>":this.cSelect));
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
        result = ((result* 31)+((this.cDisplayCoverage == null)? 0 :this.cDisplayCoverage.hashCode()));
        result = ((result* 31)+((this.cAnnualDiscountPremium == null)? 0 :this.cAnnualDiscountPremium.hashCode()));
        result = ((result* 31)+((this.cPetDiscountCov == null)? 0 :this.cPetDiscountCov.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.cAnnualPremium == null)? 0 :this.cAnnualPremium.hashCode()));
        result = ((result* 31)+((this.cCoverage == null)? 0 :this.cCoverage.hashCode()));
        result = ((result* 31)+((this.cSelect == null)? 0 :this.cSelect.hashCode()));
        result = ((result* 31)+((this.entityStatus == null)? 0 :this.entityStatus.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.cDiscountFactor == null)? 0 :this.cDiscountFactor.hashCode()));
        result = ((result* 31)+((this.cCoverageCode == null)? 0 :this.cCoverageCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cFinalAnnDisPremium == null)? 0 :this.cFinalAnnDisPremium.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PetDiscountCoverage) == false) {
            return false;
        }
        PetDiscountCoverage rhs = ((PetDiscountCoverage) other);
        return ((((((((((((((this.cDisplayCoverage == rhs.cDisplayCoverage)||((this.cDisplayCoverage!= null)&&this.cDisplayCoverage.equals(rhs.cDisplayCoverage)))&&((this.cAnnualDiscountPremium == rhs.cAnnualDiscountPremium)||((this.cAnnualDiscountPremium!= null)&&this.cAnnualDiscountPremium.equals(rhs.cAnnualDiscountPremium))))&&((this.cPetDiscountCov == rhs.cPetDiscountCov)||((this.cPetDiscountCov!= null)&&this.cPetDiscountCov.equals(rhs.cPetDiscountCov))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.cAnnualPremium == rhs.cAnnualPremium)||((this.cAnnualPremium!= null)&&this.cAnnualPremium.equals(rhs.cAnnualPremium))))&&((this.cCoverage == rhs.cCoverage)||((this.cCoverage!= null)&&this.cCoverage.equals(rhs.cCoverage))))&&((this.cSelect == rhs.cSelect)||((this.cSelect!= null)&&this.cSelect.equals(rhs.cSelect))))&&((this.entityStatus == rhs.entityStatus)||((this.entityStatus!= null)&&this.entityStatus.equals(rhs.entityStatus))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.cDiscountFactor == rhs.cDiscountFactor)||((this.cDiscountFactor!= null)&&this.cDiscountFactor.equals(rhs.cDiscountFactor))))&&((this.cCoverageCode == rhs.cCoverageCode)||((this.cCoverageCode!= null)&&this.cCoverageCode.equals(rhs.cCoverageCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cFinalAnnDisPremium == rhs.cFinalAnnDisPremium)||((this.cFinalAnnDisPremium!= null)&&this.cFinalAnnDisPremium.equals(rhs.cFinalAnnDisPremium))));
    }

}
