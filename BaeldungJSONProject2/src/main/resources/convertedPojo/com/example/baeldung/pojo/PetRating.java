
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
    "CAccidentOnlyFtr",
    "CAgeFtr",
    "CAreaFtr",
    "CBaseRate",
    "CBreedFtr",
    "CCoinsuranceFtr",
    "CCoverage",
    "CCoverageCode",
    "CDeductFtr",
    "CMedBaseRate",
    "CPerInciCopay",
    "CPetFinalPbrPremium",
    "CPetTransEffectDt",
    "CPiCovPetRt",
    "CRatingFormula",
    "CRatingFunction",
    "CSeq",
    "CTrendFactor",
    "EntityReference",
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
public class PetRating {

    @JsonProperty("CAccidentOnlyFtr")
    private String cAccidentOnlyFtr;
    @JsonProperty("CAgeFtr")
    private String cAgeFtr;
    @JsonProperty("CAreaFtr")
    private String cAreaFtr;
    @JsonProperty("CBaseRate")
    private String cBaseRate;
    @JsonProperty("CBreedFtr")
    private String cBreedFtr;
    @JsonProperty("CCoinsuranceFtr")
    private String cCoinsuranceFtr;
    @JsonProperty("CCoverage")
    private String cCoverage;
    @JsonProperty("CCoverageCode")
    private String cCoverageCode;
    @JsonProperty("CDeductFtr")
    private String cDeductFtr;
    @JsonProperty("CMedBaseRate")
    private String cMedBaseRate;
    @JsonProperty("CPerInciCopay")
    private String cPerInciCopay;
    @JsonProperty("CPetFinalPbrPremium")
    private String cPetFinalPbrPremium;
    @JsonProperty("CPetTransEffectDt")
    private String cPetTransEffectDt;
    @JsonProperty("CPiCovPetRt")
    private String cPiCovPetRt;
    @JsonProperty("CRatingFormula")
    private String cRatingFormula;
    @JsonProperty("CRatingFunction")
    private String cRatingFunction;
    @JsonProperty("CSeq")
    private String cSeq;
    @JsonProperty("CTrendFactor")
    private String cTrendFactor;
    @JsonProperty("EntityReference")
    private String entityReference;
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
    private PremiumAttributes__4 premiumAttributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CAccidentOnlyFtr")
    public String getCAccidentOnlyFtr() {
        return cAccidentOnlyFtr;
    }

    @JsonProperty("CAccidentOnlyFtr")
    public void setCAccidentOnlyFtr(String cAccidentOnlyFtr) {
        this.cAccidentOnlyFtr = cAccidentOnlyFtr;
    }

    public PetRating withCAccidentOnlyFtr(String cAccidentOnlyFtr) {
        this.cAccidentOnlyFtr = cAccidentOnlyFtr;
        return this;
    }

    @JsonProperty("CAgeFtr")
    public String getCAgeFtr() {
        return cAgeFtr;
    }

    @JsonProperty("CAgeFtr")
    public void setCAgeFtr(String cAgeFtr) {
        this.cAgeFtr = cAgeFtr;
    }

    public PetRating withCAgeFtr(String cAgeFtr) {
        this.cAgeFtr = cAgeFtr;
        return this;
    }

    @JsonProperty("CAreaFtr")
    public String getCAreaFtr() {
        return cAreaFtr;
    }

    @JsonProperty("CAreaFtr")
    public void setCAreaFtr(String cAreaFtr) {
        this.cAreaFtr = cAreaFtr;
    }

    public PetRating withCAreaFtr(String cAreaFtr) {
        this.cAreaFtr = cAreaFtr;
        return this;
    }

    @JsonProperty("CBaseRate")
    public String getCBaseRate() {
        return cBaseRate;
    }

    @JsonProperty("CBaseRate")
    public void setCBaseRate(String cBaseRate) {
        this.cBaseRate = cBaseRate;
    }

    public PetRating withCBaseRate(String cBaseRate) {
        this.cBaseRate = cBaseRate;
        return this;
    }

    @JsonProperty("CBreedFtr")
    public String getCBreedFtr() {
        return cBreedFtr;
    }

    @JsonProperty("CBreedFtr")
    public void setCBreedFtr(String cBreedFtr) {
        this.cBreedFtr = cBreedFtr;
    }

    public PetRating withCBreedFtr(String cBreedFtr) {
        this.cBreedFtr = cBreedFtr;
        return this;
    }

    @JsonProperty("CCoinsuranceFtr")
    public String getCCoinsuranceFtr() {
        return cCoinsuranceFtr;
    }

    @JsonProperty("CCoinsuranceFtr")
    public void setCCoinsuranceFtr(String cCoinsuranceFtr) {
        this.cCoinsuranceFtr = cCoinsuranceFtr;
    }

    public PetRating withCCoinsuranceFtr(String cCoinsuranceFtr) {
        this.cCoinsuranceFtr = cCoinsuranceFtr;
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

    public PetRating withCCoverage(String cCoverage) {
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

    public PetRating withCCoverageCode(String cCoverageCode) {
        this.cCoverageCode = cCoverageCode;
        return this;
    }

    @JsonProperty("CDeductFtr")
    public String getCDeductFtr() {
        return cDeductFtr;
    }

    @JsonProperty("CDeductFtr")
    public void setCDeductFtr(String cDeductFtr) {
        this.cDeductFtr = cDeductFtr;
    }

    public PetRating withCDeductFtr(String cDeductFtr) {
        this.cDeductFtr = cDeductFtr;
        return this;
    }

    @JsonProperty("CMedBaseRate")
    public String getCMedBaseRate() {
        return cMedBaseRate;
    }

    @JsonProperty("CMedBaseRate")
    public void setCMedBaseRate(String cMedBaseRate) {
        this.cMedBaseRate = cMedBaseRate;
    }

    public PetRating withCMedBaseRate(String cMedBaseRate) {
        this.cMedBaseRate = cMedBaseRate;
        return this;
    }

    @JsonProperty("CPerInciCopay")
    public String getCPerInciCopay() {
        return cPerInciCopay;
    }

    @JsonProperty("CPerInciCopay")
    public void setCPerInciCopay(String cPerInciCopay) {
        this.cPerInciCopay = cPerInciCopay;
    }

    public PetRating withCPerInciCopay(String cPerInciCopay) {
        this.cPerInciCopay = cPerInciCopay;
        return this;
    }

    @JsonProperty("CPetFinalPbrPremium")
    public String getCPetFinalPbrPremium() {
        return cPetFinalPbrPremium;
    }

    @JsonProperty("CPetFinalPbrPremium")
    public void setCPetFinalPbrPremium(String cPetFinalPbrPremium) {
        this.cPetFinalPbrPremium = cPetFinalPbrPremium;
    }

    public PetRating withCPetFinalPbrPremium(String cPetFinalPbrPremium) {
        this.cPetFinalPbrPremium = cPetFinalPbrPremium;
        return this;
    }

    @JsonProperty("CPetTransEffectDt")
    public String getCPetTransEffectDt() {
        return cPetTransEffectDt;
    }

    @JsonProperty("CPetTransEffectDt")
    public void setCPetTransEffectDt(String cPetTransEffectDt) {
        this.cPetTransEffectDt = cPetTransEffectDt;
    }

    public PetRating withCPetTransEffectDt(String cPetTransEffectDt) {
        this.cPetTransEffectDt = cPetTransEffectDt;
        return this;
    }

    @JsonProperty("CPiCovPetRt")
    public String getCPiCovPetRt() {
        return cPiCovPetRt;
    }

    @JsonProperty("CPiCovPetRt")
    public void setCPiCovPetRt(String cPiCovPetRt) {
        this.cPiCovPetRt = cPiCovPetRt;
    }

    public PetRating withCPiCovPetRt(String cPiCovPetRt) {
        this.cPiCovPetRt = cPiCovPetRt;
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

    public PetRating withCRatingFormula(String cRatingFormula) {
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

    public PetRating withCRatingFunction(String cRatingFunction) {
        this.cRatingFunction = cRatingFunction;
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

    public PetRating withCSeq(String cSeq) {
        this.cSeq = cSeq;
        return this;
    }

    @JsonProperty("CTrendFactor")
    public String getCTrendFactor() {
        return cTrendFactor;
    }

    @JsonProperty("CTrendFactor")
    public void setCTrendFactor(String cTrendFactor) {
        this.cTrendFactor = cTrendFactor;
    }

    public PetRating withCTrendFactor(String cTrendFactor) {
        this.cTrendFactor = cTrendFactor;
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

    public PetRating withEntityReference(String entityReference) {
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

    public PetRating withEntityType(String entityType) {
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

    public PetRating withIsCovManuallyRated(String isCovManuallyRated) {
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

    public PetRating withLobCode(String lobCode) {
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

    public PetRating withProductCode(String productCode) {
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

    public PetRating withRiskState(String riskState) {
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

    public PetRating withRiskStateStatCode(String riskStateStatCode) {
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

    public PetRating withWaivedPremium(String waivedPremium) {
        this.waivedPremium = waivedPremium;
        return this;
    }

    @JsonProperty("PremiumAttributes")
    public PremiumAttributes__4 getPremiumAttributes() {
        return premiumAttributes;
    }

    @JsonProperty("PremiumAttributes")
    public void setPremiumAttributes(PremiumAttributes__4 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
    }

    public PetRating withPremiumAttributes(PremiumAttributes__4 premiumAttributes) {
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

    public PetRating withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PetRating.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cAccidentOnlyFtr");
        sb.append('=');
        sb.append(((this.cAccidentOnlyFtr == null)?"<null>":this.cAccidentOnlyFtr));
        sb.append(',');
        sb.append("cAgeFtr");
        sb.append('=');
        sb.append(((this.cAgeFtr == null)?"<null>":this.cAgeFtr));
        sb.append(',');
        sb.append("cAreaFtr");
        sb.append('=');
        sb.append(((this.cAreaFtr == null)?"<null>":this.cAreaFtr));
        sb.append(',');
        sb.append("cBaseRate");
        sb.append('=');
        sb.append(((this.cBaseRate == null)?"<null>":this.cBaseRate));
        sb.append(',');
        sb.append("cBreedFtr");
        sb.append('=');
        sb.append(((this.cBreedFtr == null)?"<null>":this.cBreedFtr));
        sb.append(',');
        sb.append("cCoinsuranceFtr");
        sb.append('=');
        sb.append(((this.cCoinsuranceFtr == null)?"<null>":this.cCoinsuranceFtr));
        sb.append(',');
        sb.append("cCoverage");
        sb.append('=');
        sb.append(((this.cCoverage == null)?"<null>":this.cCoverage));
        sb.append(',');
        sb.append("cCoverageCode");
        sb.append('=');
        sb.append(((this.cCoverageCode == null)?"<null>":this.cCoverageCode));
        sb.append(',');
        sb.append("cDeductFtr");
        sb.append('=');
        sb.append(((this.cDeductFtr == null)?"<null>":this.cDeductFtr));
        sb.append(',');
        sb.append("cMedBaseRate");
        sb.append('=');
        sb.append(((this.cMedBaseRate == null)?"<null>":this.cMedBaseRate));
        sb.append(',');
        sb.append("cPerInciCopay");
        sb.append('=');
        sb.append(((this.cPerInciCopay == null)?"<null>":this.cPerInciCopay));
        sb.append(',');
        sb.append("cPetFinalPbrPremium");
        sb.append('=');
        sb.append(((this.cPetFinalPbrPremium == null)?"<null>":this.cPetFinalPbrPremium));
        sb.append(',');
        sb.append("cPetTransEffectDt");
        sb.append('=');
        sb.append(((this.cPetTransEffectDt == null)?"<null>":this.cPetTransEffectDt));
        sb.append(',');
        sb.append("cPiCovPetRt");
        sb.append('=');
        sb.append(((this.cPiCovPetRt == null)?"<null>":this.cPiCovPetRt));
        sb.append(',');
        sb.append("cRatingFormula");
        sb.append('=');
        sb.append(((this.cRatingFormula == null)?"<null>":this.cRatingFormula));
        sb.append(',');
        sb.append("cRatingFunction");
        sb.append('=');
        sb.append(((this.cRatingFunction == null)?"<null>":this.cRatingFunction));
        sb.append(',');
        sb.append("cSeq");
        sb.append('=');
        sb.append(((this.cSeq == null)?"<null>":this.cSeq));
        sb.append(',');
        sb.append("cTrendFactor");
        sb.append('=');
        sb.append(((this.cTrendFactor == null)?"<null>":this.cTrendFactor));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
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
        result = ((result* 31)+((this.cRatingFunction == null)? 0 :this.cRatingFunction.hashCode()));
        result = ((result* 31)+((this.cSeq == null)? 0 :this.cSeq.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.cDeductFtr == null)? 0 :this.cDeductFtr.hashCode()));
        result = ((result* 31)+((this.cPiCovPetRt == null)? 0 :this.cPiCovPetRt.hashCode()));
        result = ((result* 31)+((this.cCoverageCode == null)? 0 :this.cCoverageCode.hashCode()));
        result = ((result* 31)+((this.lobCode == null)? 0 :this.lobCode.hashCode()));
        result = ((result* 31)+((this.riskState == null)? 0 :this.riskState.hashCode()));
        result = ((result* 31)+((this.premiumAttributes == null)? 0 :this.premiumAttributes.hashCode()));
        result = ((result* 31)+((this.cBaseRate == null)? 0 :this.cBaseRate.hashCode()));
        result = ((result* 31)+((this.cAgeFtr == null)? 0 :this.cAgeFtr.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.isCovManuallyRated == null)? 0 :this.isCovManuallyRated.hashCode()));
        result = ((result* 31)+((this.cPerInciCopay == null)? 0 :this.cPerInciCopay.hashCode()));
        result = ((result* 31)+((this.cCoinsuranceFtr == null)? 0 :this.cCoinsuranceFtr.hashCode()));
        result = ((result* 31)+((this.cAccidentOnlyFtr == null)? 0 :this.cAccidentOnlyFtr.hashCode()));
        result = ((result* 31)+((this.cPetTransEffectDt == null)? 0 :this.cPetTransEffectDt.hashCode()));
        result = ((result* 31)+((this.waivedPremium == null)? 0 :this.waivedPremium.hashCode()));
        result = ((result* 31)+((this.cBreedFtr == null)? 0 :this.cBreedFtr.hashCode()));
        result = ((result* 31)+((this.cCoverage == null)? 0 :this.cCoverage.hashCode()));
        result = ((result* 31)+((this.cTrendFactor == null)? 0 :this.cTrendFactor.hashCode()));
        result = ((result* 31)+((this.productCode == null)? 0 :this.productCode.hashCode()));
        result = ((result* 31)+((this.cMedBaseRate == null)? 0 :this.cMedBaseRate.hashCode()));
        result = ((result* 31)+((this.cAreaFtr == null)? 0 :this.cAreaFtr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cPetFinalPbrPremium == null)? 0 :this.cPetFinalPbrPremium.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PetRating) == false) {
            return false;
        }
        PetRating rhs = ((PetRating) other);
        return (((((((((((((((((((((((((((((this.riskStateStatCode == rhs.riskStateStatCode)||((this.riskStateStatCode!= null)&&this.riskStateStatCode.equals(rhs.riskStateStatCode)))&&((this.cRatingFormula == rhs.cRatingFormula)||((this.cRatingFormula!= null)&&this.cRatingFormula.equals(rhs.cRatingFormula))))&&((this.cRatingFunction == rhs.cRatingFunction)||((this.cRatingFunction!= null)&&this.cRatingFunction.equals(rhs.cRatingFunction))))&&((this.cSeq == rhs.cSeq)||((this.cSeq!= null)&&this.cSeq.equals(rhs.cSeq))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.cDeductFtr == rhs.cDeductFtr)||((this.cDeductFtr!= null)&&this.cDeductFtr.equals(rhs.cDeductFtr))))&&((this.cPiCovPetRt == rhs.cPiCovPetRt)||((this.cPiCovPetRt!= null)&&this.cPiCovPetRt.equals(rhs.cPiCovPetRt))))&&((this.cCoverageCode == rhs.cCoverageCode)||((this.cCoverageCode!= null)&&this.cCoverageCode.equals(rhs.cCoverageCode))))&&((this.lobCode == rhs.lobCode)||((this.lobCode!= null)&&this.lobCode.equals(rhs.lobCode))))&&((this.riskState == rhs.riskState)||((this.riskState!= null)&&this.riskState.equals(rhs.riskState))))&&((this.premiumAttributes == rhs.premiumAttributes)||((this.premiumAttributes!= null)&&this.premiumAttributes.equals(rhs.premiumAttributes))))&&((this.cBaseRate == rhs.cBaseRate)||((this.cBaseRate!= null)&&this.cBaseRate.equals(rhs.cBaseRate))))&&((this.cAgeFtr == rhs.cAgeFtr)||((this.cAgeFtr!= null)&&this.cAgeFtr.equals(rhs.cAgeFtr))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.isCovManuallyRated == rhs.isCovManuallyRated)||((this.isCovManuallyRated!= null)&&this.isCovManuallyRated.equals(rhs.isCovManuallyRated))))&&((this.cPerInciCopay == rhs.cPerInciCopay)||((this.cPerInciCopay!= null)&&this.cPerInciCopay.equals(rhs.cPerInciCopay))))&&((this.cCoinsuranceFtr == rhs.cCoinsuranceFtr)||((this.cCoinsuranceFtr!= null)&&this.cCoinsuranceFtr.equals(rhs.cCoinsuranceFtr))))&&((this.cAccidentOnlyFtr == rhs.cAccidentOnlyFtr)||((this.cAccidentOnlyFtr!= null)&&this.cAccidentOnlyFtr.equals(rhs.cAccidentOnlyFtr))))&&((this.cPetTransEffectDt == rhs.cPetTransEffectDt)||((this.cPetTransEffectDt!= null)&&this.cPetTransEffectDt.equals(rhs.cPetTransEffectDt))))&&((this.waivedPremium == rhs.waivedPremium)||((this.waivedPremium!= null)&&this.waivedPremium.equals(rhs.waivedPremium))))&&((this.cBreedFtr == rhs.cBreedFtr)||((this.cBreedFtr!= null)&&this.cBreedFtr.equals(rhs.cBreedFtr))))&&((this.cCoverage == rhs.cCoverage)||((this.cCoverage!= null)&&this.cCoverage.equals(rhs.cCoverage))))&&((this.cTrendFactor == rhs.cTrendFactor)||((this.cTrendFactor!= null)&&this.cTrendFactor.equals(rhs.cTrendFactor))))&&((this.productCode == rhs.productCode)||((this.productCode!= null)&&this.productCode.equals(rhs.productCode))))&&((this.cMedBaseRate == rhs.cMedBaseRate)||((this.cMedBaseRate!= null)&&this.cMedBaseRate.equals(rhs.cMedBaseRate))))&&((this.cAreaFtr == rhs.cAreaFtr)||((this.cAreaFtr!= null)&&this.cAreaFtr.equals(rhs.cAreaFtr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cPetFinalPbrPremium == rhs.cPetFinalPbrPremium)||((this.cPetFinalPbrPremium!= null)&&this.cPetFinalPbrPremium.equals(rhs.cPetFinalPbrPremium))));
    }

}
