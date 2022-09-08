
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
    "CCoverage",
    "CIsCovSelected",
    "COptAnnualPremium",
    "COptCovCode",
    "CPbr",
    "CPiCovOptTab",
    "CRate",
    "EntityReference",
    "EntityStatus",
    "EntityType",
    "CCoverageOption",
    "CSublimit"
})
@Generated("jsonschema2pojo")
public class PetAllOptCov {

    @JsonProperty("CCoverage")
    private String cCoverage;
    @JsonProperty("CIsCovSelected")
    private String cIsCovSelected;
    @JsonProperty("COptAnnualPremium")
    private String cOptAnnualPremium;
    @JsonProperty("COptCovCode")
    private String cOptCovCode;
    @JsonProperty("CPbr")
    private String cPbr;
    @JsonProperty("CPiCovOptTab")
    private String cPiCovOptTab;
    @JsonProperty("CRate")
    private String cRate;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityStatus")
    private String entityStatus;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("CCoverageOption")
    private String cCoverageOption;
    @JsonProperty("CSublimit")
    private String cSublimit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CCoverage")
    public String getCCoverage() {
        return cCoverage;
    }

    @JsonProperty("CCoverage")
    public void setCCoverage(String cCoverage) {
        this.cCoverage = cCoverage;
    }

    public PetAllOptCov withCCoverage(String cCoverage) {
        this.cCoverage = cCoverage;
        return this;
    }

    @JsonProperty("CIsCovSelected")
    public String getCIsCovSelected() {
        return cIsCovSelected;
    }

    @JsonProperty("CIsCovSelected")
    public void setCIsCovSelected(String cIsCovSelected) {
        this.cIsCovSelected = cIsCovSelected;
    }

    public PetAllOptCov withCIsCovSelected(String cIsCovSelected) {
        this.cIsCovSelected = cIsCovSelected;
        return this;
    }

    @JsonProperty("COptAnnualPremium")
    public String getCOptAnnualPremium() {
        return cOptAnnualPremium;
    }

    @JsonProperty("COptAnnualPremium")
    public void setCOptAnnualPremium(String cOptAnnualPremium) {
        this.cOptAnnualPremium = cOptAnnualPremium;
    }

    public PetAllOptCov withCOptAnnualPremium(String cOptAnnualPremium) {
        this.cOptAnnualPremium = cOptAnnualPremium;
        return this;
    }

    @JsonProperty("COptCovCode")
    public String getCOptCovCode() {
        return cOptCovCode;
    }

    @JsonProperty("COptCovCode")
    public void setCOptCovCode(String cOptCovCode) {
        this.cOptCovCode = cOptCovCode;
    }

    public PetAllOptCov withCOptCovCode(String cOptCovCode) {
        this.cOptCovCode = cOptCovCode;
        return this;
    }

    @JsonProperty("CPbr")
    public String getCPbr() {
        return cPbr;
    }

    @JsonProperty("CPbr")
    public void setCPbr(String cPbr) {
        this.cPbr = cPbr;
    }

    public PetAllOptCov withCPbr(String cPbr) {
        this.cPbr = cPbr;
        return this;
    }

    @JsonProperty("CPiCovOptTab")
    public String getCPiCovOptTab() {
        return cPiCovOptTab;
    }

    @JsonProperty("CPiCovOptTab")
    public void setCPiCovOptTab(String cPiCovOptTab) {
        this.cPiCovOptTab = cPiCovOptTab;
    }

    public PetAllOptCov withCPiCovOptTab(String cPiCovOptTab) {
        this.cPiCovOptTab = cPiCovOptTab;
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

    public PetAllOptCov withCRate(String cRate) {
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

    public PetAllOptCov withEntityReference(String entityReference) {
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

    public PetAllOptCov withEntityStatus(String entityStatus) {
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

    public PetAllOptCov withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("CCoverageOption")
    public String getCCoverageOption() {
        return cCoverageOption;
    }

    @JsonProperty("CCoverageOption")
    public void setCCoverageOption(String cCoverageOption) {
        this.cCoverageOption = cCoverageOption;
    }

    public PetAllOptCov withCCoverageOption(String cCoverageOption) {
        this.cCoverageOption = cCoverageOption;
        return this;
    }

    @JsonProperty("CSublimit")
    public String getCSublimit() {
        return cSublimit;
    }

    @JsonProperty("CSublimit")
    public void setCSublimit(String cSublimit) {
        this.cSublimit = cSublimit;
    }

    public PetAllOptCov withCSublimit(String cSublimit) {
        this.cSublimit = cSublimit;
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

    public PetAllOptCov withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PetAllOptCov.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cCoverage");
        sb.append('=');
        sb.append(((this.cCoverage == null)?"<null>":this.cCoverage));
        sb.append(',');
        sb.append("cIsCovSelected");
        sb.append('=');
        sb.append(((this.cIsCovSelected == null)?"<null>":this.cIsCovSelected));
        sb.append(',');
        sb.append("cOptAnnualPremium");
        sb.append('=');
        sb.append(((this.cOptAnnualPremium == null)?"<null>":this.cOptAnnualPremium));
        sb.append(',');
        sb.append("cOptCovCode");
        sb.append('=');
        sb.append(((this.cOptCovCode == null)?"<null>":this.cOptCovCode));
        sb.append(',');
        sb.append("cPbr");
        sb.append('=');
        sb.append(((this.cPbr == null)?"<null>":this.cPbr));
        sb.append(',');
        sb.append("cPiCovOptTab");
        sb.append('=');
        sb.append(((this.cPiCovOptTab == null)?"<null>":this.cPiCovOptTab));
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
        sb.append("cCoverageOption");
        sb.append('=');
        sb.append(((this.cCoverageOption == null)?"<null>":this.cCoverageOption));
        sb.append(',');
        sb.append("cSublimit");
        sb.append('=');
        sb.append(((this.cSublimit == null)?"<null>":this.cSublimit));
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
        result = ((result* 31)+((this.cOptAnnualPremium == null)? 0 :this.cOptAnnualPremium.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.cSublimit == null)? 0 :this.cSublimit.hashCode()));
        result = ((result* 31)+((this.cCoverage == null)? 0 :this.cCoverage.hashCode()));
        result = ((result* 31)+((this.cCoverageOption == null)? 0 :this.cCoverageOption.hashCode()));
        result = ((result* 31)+((this.cPbr == null)? 0 :this.cPbr.hashCode()));
        result = ((result* 31)+((this.cPiCovOptTab == null)? 0 :this.cPiCovOptTab.hashCode()));
        result = ((result* 31)+((this.cIsCovSelected == null)? 0 :this.cIsCovSelected.hashCode()));
        result = ((result* 31)+((this.entityStatus == null)? 0 :this.entityStatus.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.cOptCovCode == null)? 0 :this.cOptCovCode.hashCode()));
        result = ((result* 31)+((this.cRate == null)? 0 :this.cRate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PetAllOptCov) == false) {
            return false;
        }
        PetAllOptCov rhs = ((PetAllOptCov) other);
        return ((((((((((((((this.cOptAnnualPremium == rhs.cOptAnnualPremium)||((this.cOptAnnualPremium!= null)&&this.cOptAnnualPremium.equals(rhs.cOptAnnualPremium)))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.cSublimit == rhs.cSublimit)||((this.cSublimit!= null)&&this.cSublimit.equals(rhs.cSublimit))))&&((this.cCoverage == rhs.cCoverage)||((this.cCoverage!= null)&&this.cCoverage.equals(rhs.cCoverage))))&&((this.cCoverageOption == rhs.cCoverageOption)||((this.cCoverageOption!= null)&&this.cCoverageOption.equals(rhs.cCoverageOption))))&&((this.cPbr == rhs.cPbr)||((this.cPbr!= null)&&this.cPbr.equals(rhs.cPbr))))&&((this.cPiCovOptTab == rhs.cPiCovOptTab)||((this.cPiCovOptTab!= null)&&this.cPiCovOptTab.equals(rhs.cPiCovOptTab))))&&((this.cIsCovSelected == rhs.cIsCovSelected)||((this.cIsCovSelected!= null)&&this.cIsCovSelected.equals(rhs.cIsCovSelected))))&&((this.entityStatus == rhs.entityStatus)||((this.entityStatus!= null)&&this.entityStatus.equals(rhs.entityStatus))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.cOptCovCode == rhs.cOptCovCode)||((this.cOptCovCode!= null)&&this.cOptCovCode.equals(rhs.cOptCovCode))))&&((this.cRate == rhs.cRate)||((this.cRate!= null)&&this.cRate.equals(rhs.cRate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
