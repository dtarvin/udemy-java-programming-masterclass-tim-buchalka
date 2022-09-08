
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
    "CCovWell",
    "CDewormingLimit",
    "CExcessWellWaitPerDt",
    "CMicroHelthCertLimit",
    "CNeuterTeethCleanLmt",
    "CRatingFormula",
    "CRatingFunction",
    "CSeq",
    "CTestsLimit",
    "CTier",
    "CVaccinesLimit",
    "CWellnessEffectDt",
    "CWellnessExamLimit",
    "CWellnessExpirDt",
    "CWellnessPlan",
    "CWellnessPremium",
    "CWellnessWaitPeriod",
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
public class Coverwellness {

    @JsonProperty("CCoverage")
    private String cCoverage;
    @JsonProperty("CCoverageCode")
    private String cCoverageCode;
    @JsonProperty("CCovWell")
    private String cCovWell;
    @JsonProperty("CDewormingLimit")
    private String cDewormingLimit;
    @JsonProperty("CExcessWellWaitPerDt")
    private String cExcessWellWaitPerDt;
    @JsonProperty("CMicroHelthCertLimit")
    private String cMicroHelthCertLimit;
    @JsonProperty("CNeuterTeethCleanLmt")
    private String cNeuterTeethCleanLmt;
    @JsonProperty("CRatingFormula")
    private String cRatingFormula;
    @JsonProperty("CRatingFunction")
    private String cRatingFunction;
    @JsonProperty("CSeq")
    private String cSeq;
    @JsonProperty("CTestsLimit")
    private String cTestsLimit;
    @JsonProperty("CTier")
    private String cTier;
    @JsonProperty("CVaccinesLimit")
    private String cVaccinesLimit;
    @JsonProperty("CWellnessEffectDt")
    private String cWellnessEffectDt;
    @JsonProperty("CWellnessExamLimit")
    private String cWellnessExamLimit;
    @JsonProperty("CWellnessExpirDt")
    private String cWellnessExpirDt;
    @JsonProperty("CWellnessPlan")
    private String cWellnessPlan;
    @JsonProperty("CWellnessPremium")
    private String cWellnessPremium;
    @JsonProperty("CWellnessWaitPeriod")
    private String cWellnessWaitPeriod;
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
    private PremiumAttributes__5 premiumAttributes;
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

    public Coverwellness withCCoverage(String cCoverage) {
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

    public Coverwellness withCCoverageCode(String cCoverageCode) {
        this.cCoverageCode = cCoverageCode;
        return this;
    }

    @JsonProperty("CCovWell")
    public String getCCovWell() {
        return cCovWell;
    }

    @JsonProperty("CCovWell")
    public void setCCovWell(String cCovWell) {
        this.cCovWell = cCovWell;
    }

    public Coverwellness withCCovWell(String cCovWell) {
        this.cCovWell = cCovWell;
        return this;
    }

    @JsonProperty("CDewormingLimit")
    public String getCDewormingLimit() {
        return cDewormingLimit;
    }

    @JsonProperty("CDewormingLimit")
    public void setCDewormingLimit(String cDewormingLimit) {
        this.cDewormingLimit = cDewormingLimit;
    }

    public Coverwellness withCDewormingLimit(String cDewormingLimit) {
        this.cDewormingLimit = cDewormingLimit;
        return this;
    }

    @JsonProperty("CExcessWellWaitPerDt")
    public String getCExcessWellWaitPerDt() {
        return cExcessWellWaitPerDt;
    }

    @JsonProperty("CExcessWellWaitPerDt")
    public void setCExcessWellWaitPerDt(String cExcessWellWaitPerDt) {
        this.cExcessWellWaitPerDt = cExcessWellWaitPerDt;
    }

    public Coverwellness withCExcessWellWaitPerDt(String cExcessWellWaitPerDt) {
        this.cExcessWellWaitPerDt = cExcessWellWaitPerDt;
        return this;
    }

    @JsonProperty("CMicroHelthCertLimit")
    public String getCMicroHelthCertLimit() {
        return cMicroHelthCertLimit;
    }

    @JsonProperty("CMicroHelthCertLimit")
    public void setCMicroHelthCertLimit(String cMicroHelthCertLimit) {
        this.cMicroHelthCertLimit = cMicroHelthCertLimit;
    }

    public Coverwellness withCMicroHelthCertLimit(String cMicroHelthCertLimit) {
        this.cMicroHelthCertLimit = cMicroHelthCertLimit;
        return this;
    }

    @JsonProperty("CNeuterTeethCleanLmt")
    public String getCNeuterTeethCleanLmt() {
        return cNeuterTeethCleanLmt;
    }

    @JsonProperty("CNeuterTeethCleanLmt")
    public void setCNeuterTeethCleanLmt(String cNeuterTeethCleanLmt) {
        this.cNeuterTeethCleanLmt = cNeuterTeethCleanLmt;
    }

    public Coverwellness withCNeuterTeethCleanLmt(String cNeuterTeethCleanLmt) {
        this.cNeuterTeethCleanLmt = cNeuterTeethCleanLmt;
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

    public Coverwellness withCRatingFormula(String cRatingFormula) {
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

    public Coverwellness withCRatingFunction(String cRatingFunction) {
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

    public Coverwellness withCSeq(String cSeq) {
        this.cSeq = cSeq;
        return this;
    }

    @JsonProperty("CTestsLimit")
    public String getCTestsLimit() {
        return cTestsLimit;
    }

    @JsonProperty("CTestsLimit")
    public void setCTestsLimit(String cTestsLimit) {
        this.cTestsLimit = cTestsLimit;
    }

    public Coverwellness withCTestsLimit(String cTestsLimit) {
        this.cTestsLimit = cTestsLimit;
        return this;
    }

    @JsonProperty("CTier")
    public String getCTier() {
        return cTier;
    }

    @JsonProperty("CTier")
    public void setCTier(String cTier) {
        this.cTier = cTier;
    }

    public Coverwellness withCTier(String cTier) {
        this.cTier = cTier;
        return this;
    }

    @JsonProperty("CVaccinesLimit")
    public String getCVaccinesLimit() {
        return cVaccinesLimit;
    }

    @JsonProperty("CVaccinesLimit")
    public void setCVaccinesLimit(String cVaccinesLimit) {
        this.cVaccinesLimit = cVaccinesLimit;
    }

    public Coverwellness withCVaccinesLimit(String cVaccinesLimit) {
        this.cVaccinesLimit = cVaccinesLimit;
        return this;
    }

    @JsonProperty("CWellnessEffectDt")
    public String getCWellnessEffectDt() {
        return cWellnessEffectDt;
    }

    @JsonProperty("CWellnessEffectDt")
    public void setCWellnessEffectDt(String cWellnessEffectDt) {
        this.cWellnessEffectDt = cWellnessEffectDt;
    }

    public Coverwellness withCWellnessEffectDt(String cWellnessEffectDt) {
        this.cWellnessEffectDt = cWellnessEffectDt;
        return this;
    }

    @JsonProperty("CWellnessExamLimit")
    public String getCWellnessExamLimit() {
        return cWellnessExamLimit;
    }

    @JsonProperty("CWellnessExamLimit")
    public void setCWellnessExamLimit(String cWellnessExamLimit) {
        this.cWellnessExamLimit = cWellnessExamLimit;
    }

    public Coverwellness withCWellnessExamLimit(String cWellnessExamLimit) {
        this.cWellnessExamLimit = cWellnessExamLimit;
        return this;
    }

    @JsonProperty("CWellnessExpirDt")
    public String getCWellnessExpirDt() {
        return cWellnessExpirDt;
    }

    @JsonProperty("CWellnessExpirDt")
    public void setCWellnessExpirDt(String cWellnessExpirDt) {
        this.cWellnessExpirDt = cWellnessExpirDt;
    }

    public Coverwellness withCWellnessExpirDt(String cWellnessExpirDt) {
        this.cWellnessExpirDt = cWellnessExpirDt;
        return this;
    }

    @JsonProperty("CWellnessPlan")
    public String getCWellnessPlan() {
        return cWellnessPlan;
    }

    @JsonProperty("CWellnessPlan")
    public void setCWellnessPlan(String cWellnessPlan) {
        this.cWellnessPlan = cWellnessPlan;
    }

    public Coverwellness withCWellnessPlan(String cWellnessPlan) {
        this.cWellnessPlan = cWellnessPlan;
        return this;
    }

    @JsonProperty("CWellnessPremium")
    public String getCWellnessPremium() {
        return cWellnessPremium;
    }

    @JsonProperty("CWellnessPremium")
    public void setCWellnessPremium(String cWellnessPremium) {
        this.cWellnessPremium = cWellnessPremium;
    }

    public Coverwellness withCWellnessPremium(String cWellnessPremium) {
        this.cWellnessPremium = cWellnessPremium;
        return this;
    }

    @JsonProperty("CWellnessWaitPeriod")
    public String getCWellnessWaitPeriod() {
        return cWellnessWaitPeriod;
    }

    @JsonProperty("CWellnessWaitPeriod")
    public void setCWellnessWaitPeriod(String cWellnessWaitPeriod) {
        this.cWellnessWaitPeriod = cWellnessWaitPeriod;
    }

    public Coverwellness withCWellnessWaitPeriod(String cWellnessWaitPeriod) {
        this.cWellnessWaitPeriod = cWellnessWaitPeriod;
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

    public Coverwellness withEntityReference(String entityReference) {
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

    public Coverwellness withEntityType(String entityType) {
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

    public Coverwellness withIsCovManuallyRated(String isCovManuallyRated) {
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

    public Coverwellness withLobCode(String lobCode) {
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

    public Coverwellness withProductCode(String productCode) {
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

    public Coverwellness withRiskState(String riskState) {
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

    public Coverwellness withRiskStateStatCode(String riskStateStatCode) {
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

    public Coverwellness withWaivedPremium(String waivedPremium) {
        this.waivedPremium = waivedPremium;
        return this;
    }

    @JsonProperty("PremiumAttributes")
    public PremiumAttributes__5 getPremiumAttributes() {
        return premiumAttributes;
    }

    @JsonProperty("PremiumAttributes")
    public void setPremiumAttributes(PremiumAttributes__5 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
    }

    public Coverwellness withPremiumAttributes(PremiumAttributes__5 premiumAttributes) {
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

    public Coverwellness withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Coverwellness.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cCoverage");
        sb.append('=');
        sb.append(((this.cCoverage == null)?"<null>":this.cCoverage));
        sb.append(',');
        sb.append("cCoverageCode");
        sb.append('=');
        sb.append(((this.cCoverageCode == null)?"<null>":this.cCoverageCode));
        sb.append(',');
        sb.append("cCovWell");
        sb.append('=');
        sb.append(((this.cCovWell == null)?"<null>":this.cCovWell));
        sb.append(',');
        sb.append("cDewormingLimit");
        sb.append('=');
        sb.append(((this.cDewormingLimit == null)?"<null>":this.cDewormingLimit));
        sb.append(',');
        sb.append("cExcessWellWaitPerDt");
        sb.append('=');
        sb.append(((this.cExcessWellWaitPerDt == null)?"<null>":this.cExcessWellWaitPerDt));
        sb.append(',');
        sb.append("cMicroHelthCertLimit");
        sb.append('=');
        sb.append(((this.cMicroHelthCertLimit == null)?"<null>":this.cMicroHelthCertLimit));
        sb.append(',');
        sb.append("cNeuterTeethCleanLmt");
        sb.append('=');
        sb.append(((this.cNeuterTeethCleanLmt == null)?"<null>":this.cNeuterTeethCleanLmt));
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
        sb.append("cTestsLimit");
        sb.append('=');
        sb.append(((this.cTestsLimit == null)?"<null>":this.cTestsLimit));
        sb.append(',');
        sb.append("cTier");
        sb.append('=');
        sb.append(((this.cTier == null)?"<null>":this.cTier));
        sb.append(',');
        sb.append("cVaccinesLimit");
        sb.append('=');
        sb.append(((this.cVaccinesLimit == null)?"<null>":this.cVaccinesLimit));
        sb.append(',');
        sb.append("cWellnessEffectDt");
        sb.append('=');
        sb.append(((this.cWellnessEffectDt == null)?"<null>":this.cWellnessEffectDt));
        sb.append(',');
        sb.append("cWellnessExamLimit");
        sb.append('=');
        sb.append(((this.cWellnessExamLimit == null)?"<null>":this.cWellnessExamLimit));
        sb.append(',');
        sb.append("cWellnessExpirDt");
        sb.append('=');
        sb.append(((this.cWellnessExpirDt == null)?"<null>":this.cWellnessExpirDt));
        sb.append(',');
        sb.append("cWellnessPlan");
        sb.append('=');
        sb.append(((this.cWellnessPlan == null)?"<null>":this.cWellnessPlan));
        sb.append(',');
        sb.append("cWellnessPremium");
        sb.append('=');
        sb.append(((this.cWellnessPremium == null)?"<null>":this.cWellnessPremium));
        sb.append(',');
        sb.append("cWellnessWaitPeriod");
        sb.append('=');
        sb.append(((this.cWellnessWaitPeriod == null)?"<null>":this.cWellnessWaitPeriod));
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
        result = ((result* 31)+((this.cWellnessExamLimit == null)? 0 :this.cWellnessExamLimit.hashCode()));
        result = ((result* 31)+((this.cCoverageCode == null)? 0 :this.cCoverageCode.hashCode()));
        result = ((result* 31)+((this.cWellnessPremium == null)? 0 :this.cWellnessPremium.hashCode()));
        result = ((result* 31)+((this.lobCode == null)? 0 :this.lobCode.hashCode()));
        result = ((result* 31)+((this.riskState == null)? 0 :this.riskState.hashCode()));
        result = ((result* 31)+((this.premiumAttributes == null)? 0 :this.premiumAttributes.hashCode()));
        result = ((result* 31)+((this.cWellnessPlan == null)? 0 :this.cWellnessPlan.hashCode()));
        result = ((result* 31)+((this.cExcessWellWaitPerDt == null)? 0 :this.cExcessWellWaitPerDt.hashCode()));
        result = ((result* 31)+((this.cDewormingLimit == null)? 0 :this.cDewormingLimit.hashCode()));
        result = ((result* 31)+((this.cWellnessWaitPeriod == null)? 0 :this.cWellnessWaitPeriod.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.isCovManuallyRated == null)? 0 :this.isCovManuallyRated.hashCode()));
        result = ((result* 31)+((this.cWellnessExpirDt == null)? 0 :this.cWellnessExpirDt.hashCode()));
        result = ((result* 31)+((this.cVaccinesLimit == null)? 0 :this.cVaccinesLimit.hashCode()));
        result = ((result* 31)+((this.waivedPremium == null)? 0 :this.waivedPremium.hashCode()));
        result = ((result* 31)+((this.cCoverage == null)? 0 :this.cCoverage.hashCode()));
        result = ((result* 31)+((this.cCovWell == null)? 0 :this.cCovWell.hashCode()));
        result = ((result* 31)+((this.cMicroHelthCertLimit == null)? 0 :this.cMicroHelthCertLimit.hashCode()));
        result = ((result* 31)+((this.productCode == null)? 0 :this.productCode.hashCode()));
        result = ((result* 31)+((this.cNeuterTeethCleanLmt == null)? 0 :this.cNeuterTeethCleanLmt.hashCode()));
        result = ((result* 31)+((this.cWellnessEffectDt == null)? 0 :this.cWellnessEffectDt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cTestsLimit == null)? 0 :this.cTestsLimit.hashCode()));
        result = ((result* 31)+((this.cTier == null)? 0 :this.cTier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Coverwellness) == false) {
            return false;
        }
        Coverwellness rhs = ((Coverwellness) other);
        return ((((((((((((((((((((((((((((((this.riskStateStatCode == rhs.riskStateStatCode)||((this.riskStateStatCode!= null)&&this.riskStateStatCode.equals(rhs.riskStateStatCode)))&&((this.cRatingFormula == rhs.cRatingFormula)||((this.cRatingFormula!= null)&&this.cRatingFormula.equals(rhs.cRatingFormula))))&&((this.cRatingFunction == rhs.cRatingFunction)||((this.cRatingFunction!= null)&&this.cRatingFunction.equals(rhs.cRatingFunction))))&&((this.cSeq == rhs.cSeq)||((this.cSeq!= null)&&this.cSeq.equals(rhs.cSeq))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.cWellnessExamLimit == rhs.cWellnessExamLimit)||((this.cWellnessExamLimit!= null)&&this.cWellnessExamLimit.equals(rhs.cWellnessExamLimit))))&&((this.cCoverageCode == rhs.cCoverageCode)||((this.cCoverageCode!= null)&&this.cCoverageCode.equals(rhs.cCoverageCode))))&&((this.cWellnessPremium == rhs.cWellnessPremium)||((this.cWellnessPremium!= null)&&this.cWellnessPremium.equals(rhs.cWellnessPremium))))&&((this.lobCode == rhs.lobCode)||((this.lobCode!= null)&&this.lobCode.equals(rhs.lobCode))))&&((this.riskState == rhs.riskState)||((this.riskState!= null)&&this.riskState.equals(rhs.riskState))))&&((this.premiumAttributes == rhs.premiumAttributes)||((this.premiumAttributes!= null)&&this.premiumAttributes.equals(rhs.premiumAttributes))))&&((this.cWellnessPlan == rhs.cWellnessPlan)||((this.cWellnessPlan!= null)&&this.cWellnessPlan.equals(rhs.cWellnessPlan))))&&((this.cExcessWellWaitPerDt == rhs.cExcessWellWaitPerDt)||((this.cExcessWellWaitPerDt!= null)&&this.cExcessWellWaitPerDt.equals(rhs.cExcessWellWaitPerDt))))&&((this.cDewormingLimit == rhs.cDewormingLimit)||((this.cDewormingLimit!= null)&&this.cDewormingLimit.equals(rhs.cDewormingLimit))))&&((this.cWellnessWaitPeriod == rhs.cWellnessWaitPeriod)||((this.cWellnessWaitPeriod!= null)&&this.cWellnessWaitPeriod.equals(rhs.cWellnessWaitPeriod))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.isCovManuallyRated == rhs.isCovManuallyRated)||((this.isCovManuallyRated!= null)&&this.isCovManuallyRated.equals(rhs.isCovManuallyRated))))&&((this.cWellnessExpirDt == rhs.cWellnessExpirDt)||((this.cWellnessExpirDt!= null)&&this.cWellnessExpirDt.equals(rhs.cWellnessExpirDt))))&&((this.cVaccinesLimit == rhs.cVaccinesLimit)||((this.cVaccinesLimit!= null)&&this.cVaccinesLimit.equals(rhs.cVaccinesLimit))))&&((this.waivedPremium == rhs.waivedPremium)||((this.waivedPremium!= null)&&this.waivedPremium.equals(rhs.waivedPremium))))&&((this.cCoverage == rhs.cCoverage)||((this.cCoverage!= null)&&this.cCoverage.equals(rhs.cCoverage))))&&((this.cCovWell == rhs.cCovWell)||((this.cCovWell!= null)&&this.cCovWell.equals(rhs.cCovWell))))&&((this.cMicroHelthCertLimit == rhs.cMicroHelthCertLimit)||((this.cMicroHelthCertLimit!= null)&&this.cMicroHelthCertLimit.equals(rhs.cMicroHelthCertLimit))))&&((this.productCode == rhs.productCode)||((this.productCode!= null)&&this.productCode.equals(rhs.productCode))))&&((this.cNeuterTeethCleanLmt == rhs.cNeuterTeethCleanLmt)||((this.cNeuterTeethCleanLmt!= null)&&this.cNeuterTeethCleanLmt.equals(rhs.cNeuterTeethCleanLmt))))&&((this.cWellnessEffectDt == rhs.cWellnessEffectDt)||((this.cWellnessEffectDt!= null)&&this.cWellnessEffectDt.equals(rhs.cWellnessEffectDt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cTestsLimit == rhs.cTestsLimit)||((this.cTestsLimit!= null)&&this.cTestsLimit.equals(rhs.cTestsLimit))))&&((this.cTier == rhs.cTier)||((this.cTier!= null)&&this.cTier.equals(rhs.cTier))));
    }

}
