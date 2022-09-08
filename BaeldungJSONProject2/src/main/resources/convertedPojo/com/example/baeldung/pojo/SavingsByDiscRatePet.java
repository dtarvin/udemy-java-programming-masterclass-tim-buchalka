
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
    "CCoverageCode",
    "CPiSaviByDiscRate",
    "CRatingFormula",
    "CRatingFunction",
    "CSaviByDiscPrem",
    "CSeq",
    "EntityReference",
    "EntityStatus",
    "EntityType",
    "IsCovManuallyRated",
    "LobCode",
    "ProductCode",
    "RiskState",
    "RiskStateStatCode",
    "WaivedPremium",
    "PremiumAttributes"
})
@Generated("jsonschema2pojo")
public class SavingsByDiscRatePet {

    @JsonProperty("CCoverage")
    private String cCoverage;
    @JsonProperty("CCoverageCode")
    private String cCoverageCode;
    @JsonProperty("CPiSaviByDiscRate")
    private String cPiSaviByDiscRate;
    @JsonProperty("CRatingFormula")
    private String cRatingFormula;
    @JsonProperty("CRatingFunction")
    private String cRatingFunction;
    @JsonProperty("CSaviByDiscPrem")
    private String cSaviByDiscPrem;
    @JsonProperty("CSeq")
    private String cSeq;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityStatus")
    private String entityStatus;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("IsCovManuallyRated")
    private String isCovManuallyRated;
    @JsonProperty("LobCode")
    private String lobCode;
    @JsonProperty("ProductCode")
    private String productCode;
    @JsonProperty("RiskState")
    private String riskState;
    @JsonProperty("RiskStateStatCode")
    private String riskStateStatCode;
    @JsonProperty("WaivedPremium")
    private String waivedPremium;
    @JsonProperty("PremiumAttributes")
    private PremiumAttributes__8 premiumAttributes;
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

    public SavingsByDiscRatePet withCCoverage(String cCoverage) {
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

    public SavingsByDiscRatePet withCCoverageCode(String cCoverageCode) {
        this.cCoverageCode = cCoverageCode;
        return this;
    }

    @JsonProperty("CPiSaviByDiscRate")
    public String getCPiSaviByDiscRate() {
        return cPiSaviByDiscRate;
    }

    @JsonProperty("CPiSaviByDiscRate")
    public void setCPiSaviByDiscRate(String cPiSaviByDiscRate) {
        this.cPiSaviByDiscRate = cPiSaviByDiscRate;
    }

    public SavingsByDiscRatePet withCPiSaviByDiscRate(String cPiSaviByDiscRate) {
        this.cPiSaviByDiscRate = cPiSaviByDiscRate;
        return this;
    }

    @JsonProperty("CRatingFormula")
    public String getCRatingFormula() {
        return cRatingFormula;
    }

    @JsonProperty("CRatingFormula")
    public void setCRatingFormula(String cRatingFormula) {
        this.cRatingFormula = cRatingFormula;
    }

    public SavingsByDiscRatePet withCRatingFormula(String cRatingFormula) {
        this.cRatingFormula = cRatingFormula;
        return this;
    }

    @JsonProperty("CRatingFunction")
    public String getCRatingFunction() {
        return cRatingFunction;
    }

    @JsonProperty("CRatingFunction")
    public void setCRatingFunction(String cRatingFunction) {
        this.cRatingFunction = cRatingFunction;
    }

    public SavingsByDiscRatePet withCRatingFunction(String cRatingFunction) {
        this.cRatingFunction = cRatingFunction;
        return this;
    }

    @JsonProperty("CSaviByDiscPrem")
    public String getCSaviByDiscPrem() {
        return cSaviByDiscPrem;
    }

    @JsonProperty("CSaviByDiscPrem")
    public void setCSaviByDiscPrem(String cSaviByDiscPrem) {
        this.cSaviByDiscPrem = cSaviByDiscPrem;
    }

    public SavingsByDiscRatePet withCSaviByDiscPrem(String cSaviByDiscPrem) {
        this.cSaviByDiscPrem = cSaviByDiscPrem;
        return this;
    }

    @JsonProperty("CSeq")
    public String getCSeq() {
        return cSeq;
    }

    @JsonProperty("CSeq")
    public void setCSeq(String cSeq) {
        this.cSeq = cSeq;
    }

    public SavingsByDiscRatePet withCSeq(String cSeq) {
        this.cSeq = cSeq;
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

    public SavingsByDiscRatePet withEntityReference(String entityReference) {
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

    public SavingsByDiscRatePet withEntityStatus(String entityStatus) {
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

    public SavingsByDiscRatePet withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("IsCovManuallyRated")
    public String getIsCovManuallyRated() {
        return isCovManuallyRated;
    }

    @JsonProperty("IsCovManuallyRated")
    public void setIsCovManuallyRated(String isCovManuallyRated) {
        this.isCovManuallyRated = isCovManuallyRated;
    }

    public SavingsByDiscRatePet withIsCovManuallyRated(String isCovManuallyRated) {
        this.isCovManuallyRated = isCovManuallyRated;
        return this;
    }

    @JsonProperty("LobCode")
    public String getLobCode() {
        return lobCode;
    }

    @JsonProperty("LobCode")
    public void setLobCode(String lobCode) {
        this.lobCode = lobCode;
    }

    public SavingsByDiscRatePet withLobCode(String lobCode) {
        this.lobCode = lobCode;
        return this;
    }

    @JsonProperty("ProductCode")
    public String getProductCode() {
        return productCode;
    }

    @JsonProperty("ProductCode")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public SavingsByDiscRatePet withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    @JsonProperty("RiskState")
    public String getRiskState() {
        return riskState;
    }

    @JsonProperty("RiskState")
    public void setRiskState(String riskState) {
        this.riskState = riskState;
    }

    public SavingsByDiscRatePet withRiskState(String riskState) {
        this.riskState = riskState;
        return this;
    }

    @JsonProperty("RiskStateStatCode")
    public String getRiskStateStatCode() {
        return riskStateStatCode;
    }

    @JsonProperty("RiskStateStatCode")
    public void setRiskStateStatCode(String riskStateStatCode) {
        this.riskStateStatCode = riskStateStatCode;
    }

    public SavingsByDiscRatePet withRiskStateStatCode(String riskStateStatCode) {
        this.riskStateStatCode = riskStateStatCode;
        return this;
    }

    @JsonProperty("WaivedPremium")
    public String getWaivedPremium() {
        return waivedPremium;
    }

    @JsonProperty("WaivedPremium")
    public void setWaivedPremium(String waivedPremium) {
        this.waivedPremium = waivedPremium;
    }

    public SavingsByDiscRatePet withWaivedPremium(String waivedPremium) {
        this.waivedPremium = waivedPremium;
        return this;
    }

    @JsonProperty("PremiumAttributes")
    public PremiumAttributes__8 getPremiumAttributes() {
        return premiumAttributes;
    }

    @JsonProperty("PremiumAttributes")
    public void setPremiumAttributes(PremiumAttributes__8 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
    }

    public SavingsByDiscRatePet withPremiumAttributes(PremiumAttributes__8 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
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

    public SavingsByDiscRatePet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SavingsByDiscRatePet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cCoverage");
        sb.append('=');
        sb.append(((this.cCoverage == null)?"<null>":this.cCoverage));
        sb.append(',');
        sb.append("cCoverageCode");
        sb.append('=');
        sb.append(((this.cCoverageCode == null)?"<null>":this.cCoverageCode));
        sb.append(',');
        sb.append("cPiSaviByDiscRate");
        sb.append('=');
        sb.append(((this.cPiSaviByDiscRate == null)?"<null>":this.cPiSaviByDiscRate));
        sb.append(',');
        sb.append("cRatingFormula");
        sb.append('=');
        sb.append(((this.cRatingFormula == null)?"<null>":this.cRatingFormula));
        sb.append(',');
        sb.append("cRatingFunction");
        sb.append('=');
        sb.append(((this.cRatingFunction == null)?"<null>":this.cRatingFunction));
        sb.append(',');
        sb.append("cSaviByDiscPrem");
        sb.append('=');
        sb.append(((this.cSaviByDiscPrem == null)?"<null>":this.cSaviByDiscPrem));
        sb.append(',');
        sb.append("cSeq");
        sb.append('=');
        sb.append(((this.cSeq == null)?"<null>":this.cSeq));
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
        sb.append("isCovManuallyRated");
        sb.append('=');
        sb.append(((this.isCovManuallyRated == null)?"<null>":this.isCovManuallyRated));
        sb.append(',');
        sb.append("lobCode");
        sb.append('=');
        sb.append(((this.lobCode == null)?"<null>":this.lobCode));
        sb.append(',');
        sb.append("productCode");
        sb.append('=');
        sb.append(((this.productCode == null)?"<null>":this.productCode));
        sb.append(',');
        sb.append("riskState");
        sb.append('=');
        sb.append(((this.riskState == null)?"<null>":this.riskState));
        sb.append(',');
        sb.append("riskStateStatCode");
        sb.append('=');
        sb.append(((this.riskStateStatCode == null)?"<null>":this.riskStateStatCode));
        sb.append(',');
        sb.append("waivedPremium");
        sb.append('=');
        sb.append(((this.waivedPremium == null)?"<null>":this.waivedPremium));
        sb.append(',');
        sb.append("premiumAttributes");
        sb.append('=');
        sb.append(((this.premiumAttributes == null)?"<null>":this.premiumAttributes));
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
        result = ((result* 31)+((this.riskStateStatCode == null)? 0 :this.riskStateStatCode.hashCode()));
        result = ((result* 31)+((this.cRatingFormula == null)? 0 :this.cRatingFormula.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.isCovManuallyRated == null)? 0 :this.isCovManuallyRated.hashCode()));
        result = ((result* 31)+((this.cSaviByDiscPrem == null)? 0 :this.cSaviByDiscPrem.hashCode()));
        result = ((result* 31)+((this.cRatingFunction == null)? 0 :this.cRatingFunction.hashCode()));
        result = ((result* 31)+((this.waivedPremium == null)? 0 :this.waivedPremium.hashCode()));
        result = ((result* 31)+((this.cCoverage == null)? 0 :this.cCoverage.hashCode()));
        result = ((result* 31)+((this.cSeq == null)? 0 :this.cSeq.hashCode()));
        result = ((result* 31)+((this.productCode == null)? 0 :this.productCode.hashCode()));
        result = ((result* 31)+((this.entityStatus == null)? 0 :this.entityStatus.hashCode()));
        result = ((result* 31)+((this.cPiSaviByDiscRate == null)? 0 :this.cPiSaviByDiscRate.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.cCoverageCode == null)? 0 :this.cCoverageCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lobCode == null)? 0 :this.lobCode.hashCode()));
        result = ((result* 31)+((this.riskState == null)? 0 :this.riskState.hashCode()));
        result = ((result* 31)+((this.premiumAttributes == null)? 0 :this.premiumAttributes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SavingsByDiscRatePet) == false) {
            return false;
        }
        SavingsByDiscRatePet rhs = ((SavingsByDiscRatePet) other);
        return (((((((((((((((((((this.riskStateStatCode == rhs.riskStateStatCode)||((this.riskStateStatCode!= null)&&this.riskStateStatCode.equals(rhs.riskStateStatCode)))&&((this.cRatingFormula == rhs.cRatingFormula)||((this.cRatingFormula!= null)&&this.cRatingFormula.equals(rhs.cRatingFormula))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.isCovManuallyRated == rhs.isCovManuallyRated)||((this.isCovManuallyRated!= null)&&this.isCovManuallyRated.equals(rhs.isCovManuallyRated))))&&((this.cSaviByDiscPrem == rhs.cSaviByDiscPrem)||((this.cSaviByDiscPrem!= null)&&this.cSaviByDiscPrem.equals(rhs.cSaviByDiscPrem))))&&((this.cRatingFunction == rhs.cRatingFunction)||((this.cRatingFunction!= null)&&this.cRatingFunction.equals(rhs.cRatingFunction))))&&((this.waivedPremium == rhs.waivedPremium)||((this.waivedPremium!= null)&&this.waivedPremium.equals(rhs.waivedPremium))))&&((this.cCoverage == rhs.cCoverage)||((this.cCoverage!= null)&&this.cCoverage.equals(rhs.cCoverage))))&&((this.cSeq == rhs.cSeq)||((this.cSeq!= null)&&this.cSeq.equals(rhs.cSeq))))&&((this.productCode == rhs.productCode)||((this.productCode!= null)&&this.productCode.equals(rhs.productCode))))&&((this.entityStatus == rhs.entityStatus)||((this.entityStatus!= null)&&this.entityStatus.equals(rhs.entityStatus))))&&((this.cPiSaviByDiscRate == rhs.cPiSaviByDiscRate)||((this.cPiSaviByDiscRate!= null)&&this.cPiSaviByDiscRate.equals(rhs.cPiSaviByDiscRate))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.cCoverageCode == rhs.cCoverageCode)||((this.cCoverageCode!= null)&&this.cCoverageCode.equals(rhs.cCoverageCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lobCode == rhs.lobCode)||((this.lobCode!= null)&&this.lobCode.equals(rhs.lobCode))))&&((this.riskState == rhs.riskState)||((this.riskState!= null)&&this.riskState.equals(rhs.riskState))))&&((this.premiumAttributes == rhs.premiumAttributes)||((this.premiumAttributes!= null)&&this.premiumAttributes.equals(rhs.premiumAttributes))));
    }

}
