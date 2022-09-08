
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
    "CAnnualOffsetPremium",
    "CAnnualSaveByDiscTot",
    "CCoverage",
    "CCoverageCode",
    "CCoverageName",
    "CPetDiscountOffset",
    "CRate",
    "EntityReference",
    "EntityStatus",
    "EntityType"
})
@Generated("jsonschema2pojo")
public class PetDiscountOffset {

    @JsonProperty("CAnnualOffsetPremium")
    private String cAnnualOffsetPremium;
    @JsonProperty("CAnnualSaveByDiscTot")
    private String cAnnualSaveByDiscTot;
    @JsonProperty("CCoverage")
    private String cCoverage;
    @JsonProperty("CCoverageCode")
    private String cCoverageCode;
    @JsonProperty("CCoverageName")
    private String cCoverageName;
    @JsonProperty("CPetDiscountOffset")
    private String cPetDiscountOffset;
    @JsonProperty("CRate")
    private String cRate;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityStatus")
    private String entityStatus;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CAnnualOffsetPremium")
    public String getCAnnualOffsetPremium() {
        return cAnnualOffsetPremium;
    }

    @JsonProperty("CAnnualOffsetPremium")
    public void setCAnnualOffsetPremium(String cAnnualOffsetPremium) {
        this.cAnnualOffsetPremium = cAnnualOffsetPremium;
    }

    public PetDiscountOffset withCAnnualOffsetPremium(String cAnnualOffsetPremium) {
        this.cAnnualOffsetPremium = cAnnualOffsetPremium;
        return this;
    }

    @JsonProperty("CAnnualSaveByDiscTot")
    public String getCAnnualSaveByDiscTot() {
        return cAnnualSaveByDiscTot;
    }

    @JsonProperty("CAnnualSaveByDiscTot")
    public void setCAnnualSaveByDiscTot(String cAnnualSaveByDiscTot) {
        this.cAnnualSaveByDiscTot = cAnnualSaveByDiscTot;
    }

    public PetDiscountOffset withCAnnualSaveByDiscTot(String cAnnualSaveByDiscTot) {
        this.cAnnualSaveByDiscTot = cAnnualSaveByDiscTot;
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

    public PetDiscountOffset withCCoverage(String cCoverage) {
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

    public PetDiscountOffset withCCoverageCode(String cCoverageCode) {
        this.cCoverageCode = cCoverageCode;
        return this;
    }

    @JsonProperty("CCoverageName")
    public String getCCoverageName() {
        return cCoverageName;
    }

    @JsonProperty("CCoverageName")
    public void setCCoverageName(String cCoverageName) {
        this.cCoverageName = cCoverageName;
    }

    public PetDiscountOffset withCCoverageName(String cCoverageName) {
        this.cCoverageName = cCoverageName;
        return this;
    }

    @JsonProperty("CPetDiscountOffset")
    public String getCPetDiscountOffset() {
        return cPetDiscountOffset;
    }

    @JsonProperty("CPetDiscountOffset")
    public void setCPetDiscountOffset(String cPetDiscountOffset) {
        this.cPetDiscountOffset = cPetDiscountOffset;
    }

    public PetDiscountOffset withCPetDiscountOffset(String cPetDiscountOffset) {
        this.cPetDiscountOffset = cPetDiscountOffset;
        return this;
    }

    @JsonProperty("CRate")
    public String getCRate() {
        return cRate;
    }

    @JsonProperty("CRate")
    public void setCRate(String cRate) {
        this.cRate = cRate;
    }

    public PetDiscountOffset withCRate(String cRate) {
        this.cRate = cRate;
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

    public PetDiscountOffset withEntityReference(String entityReference) {
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

    public PetDiscountOffset withEntityStatus(String entityStatus) {
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

    public PetDiscountOffset withEntityType(String entityType) {
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

    public PetDiscountOffset withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PetDiscountOffset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cAnnualOffsetPremium");
        sb.append('=');
        sb.append(((this.cAnnualOffsetPremium == null)?"<null>":this.cAnnualOffsetPremium));
        sb.append(',');
        sb.append("cAnnualSaveByDiscTot");
        sb.append('=');
        sb.append(((this.cAnnualSaveByDiscTot == null)?"<null>":this.cAnnualSaveByDiscTot));
        sb.append(',');
        sb.append("cCoverage");
        sb.append('=');
        sb.append(((this.cCoverage == null)?"<null>":this.cCoverage));
        sb.append(',');
        sb.append("cCoverageCode");
        sb.append('=');
        sb.append(((this.cCoverageCode == null)?"<null>":this.cCoverageCode));
        sb.append(',');
        sb.append("cCoverageName");
        sb.append('=');
        sb.append(((this.cCoverageName == null)?"<null>":this.cCoverageName));
        sb.append(',');
        sb.append("cPetDiscountOffset");
        sb.append('=');
        sb.append(((this.cPetDiscountOffset == null)?"<null>":this.cPetDiscountOffset));
        sb.append(',');
        sb.append("cRate");
        sb.append('=');
        sb.append(((this.cRate == null)?"<null>":this.cRate));
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
        result = ((result* 31)+((this.cCoverageName == null)? 0 :this.cCoverageName.hashCode()));
        result = ((result* 31)+((this.cCoverage == null)? 0 :this.cCoverage.hashCode()));
        result = ((result* 31)+((this.cAnnualSaveByDiscTot == null)? 0 :this.cAnnualSaveByDiscTot.hashCode()));
        result = ((result* 31)+((this.entityStatus == null)? 0 :this.entityStatus.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.cCoverageCode == null)? 0 :this.cCoverageCode.hashCode()));
        result = ((result* 31)+((this.cRate == null)? 0 :this.cRate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cPetDiscountOffset == null)? 0 :this.cPetDiscountOffset.hashCode()));
        result = ((result* 31)+((this.cAnnualOffsetPremium == null)? 0 :this.cAnnualOffsetPremium.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PetDiscountOffset) == false) {
            return false;
        }
        PetDiscountOffset rhs = ((PetDiscountOffset) other);
        return ((((((((((((this.cCoverageName == rhs.cCoverageName)||((this.cCoverageName!= null)&&this.cCoverageName.equals(rhs.cCoverageName)))&&((this.cCoverage == rhs.cCoverage)||((this.cCoverage!= null)&&this.cCoverage.equals(rhs.cCoverage))))&&((this.cAnnualSaveByDiscTot == rhs.cAnnualSaveByDiscTot)||((this.cAnnualSaveByDiscTot!= null)&&this.cAnnualSaveByDiscTot.equals(rhs.cAnnualSaveByDiscTot))))&&((this.entityStatus == rhs.entityStatus)||((this.entityStatus!= null)&&this.entityStatus.equals(rhs.entityStatus))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.cCoverageCode == rhs.cCoverageCode)||((this.cCoverageCode!= null)&&this.cCoverageCode.equals(rhs.cCoverageCode))))&&((this.cRate == rhs.cRate)||((this.cRate!= null)&&this.cRate.equals(rhs.cRate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cPetDiscountOffset == rhs.cPetDiscountOffset)||((this.cPetDiscountOffset!= null)&&this.cPetDiscountOffset.equals(rhs.cPetDiscountOffset))))&&((this.cAnnualOffsetPremium == rhs.cAnnualOffsetPremium)||((this.cAnnualOffsetPremium!= null)&&this.cAnnualOffsetPremium.equals(rhs.cAnnualOffsetPremium))));
    }

}
