
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
    "CAccAwaitDt",
    "CAccExpDt",
    "CAccWaitPeriod",
    "CAnnualDeductible",
    "CAnnCovLimitType",
    "CAnnCovLmt",
    "CCoinsurance",
    "CCovType",
    "CDedReduction",
    "CDedReducAmt",
    "CEffectAnnDed",
    "CExcessIllnessDy",
    "CExcessOrthoWtPrDy",
    "CExcessWaitDays",
    "CIllnessEffectiveDt",
    "CIllnessExpirDate",
    "CIllnessWaitDays",
    "CNumTermCount",
    "COrthopedicWaitPrDy",
    "COrthoEffectDt",
    "COrthoExpDate",
    "CPerIncidentCopay",
    "CPiPlan",
    "CReimbursement",
    "CSelectedPetPlan",
    "CWaiveOrthoWaitPr",
    "EntityReference",
    "EntityType"
})
@Generated("jsonschema2pojo")
public class CPIPlan {

    @JsonProperty("CAccAwaitDt")
    private String cAccAwaitDt;
    @JsonProperty("CAccExpDt")
    private String cAccExpDt;
    @JsonProperty("CAccWaitPeriod")
    private String cAccWaitPeriod;
    @JsonProperty("CAnnualDeductible")
    private String cAnnualDeductible;
    @JsonProperty("CAnnCovLimitType")
    private String cAnnCovLimitType;
    @JsonProperty("CAnnCovLmt")
    private String cAnnCovLmt;
    @JsonProperty("CCoinsurance")
    private String cCoinsurance;
    @JsonProperty("CCovType")
    private String cCovType;
    @JsonProperty("CDedReduction")
    private String cDedReduction;
    @JsonProperty("CDedReducAmt")
    private String cDedReducAmt;
    @JsonProperty("CEffectAnnDed")
    private String cEffectAnnDed;
    @JsonProperty("CExcessIllnessDy")
    private String cExcessIllnessDy;
    @JsonProperty("CExcessOrthoWtPrDy")
    private String cExcessOrthoWtPrDy;
    @JsonProperty("CExcessWaitDays")
    private String cExcessWaitDays;
    @JsonProperty("CIllnessEffectiveDt")
    private String cIllnessEffectiveDt;
    @JsonProperty("CIllnessExpirDate")
    private String cIllnessExpirDate;
    @JsonProperty("CIllnessWaitDays")
    private String cIllnessWaitDays;
    @JsonProperty("CNumTermCount")
    private String cNumTermCount;
    @JsonProperty("COrthopedicWaitPrDy")
    private String cOrthopedicWaitPrDy;
    @JsonProperty("COrthoEffectDt")
    private String cOrthoEffectDt;
    @JsonProperty("COrthoExpDate")
    private String cOrthoExpDate;
    @JsonProperty("CPerIncidentCopay")
    private String cPerIncidentCopay;
    @JsonProperty("CPiPlan")
    private String cPiPlan;
    @JsonProperty("CReimbursement")
    private String cReimbursement;
    @JsonProperty("CSelectedPetPlan")
    private String cSelectedPetPlan;
    @JsonProperty("CWaiveOrthoWaitPr")
    private String cWaiveOrthoWaitPr;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CAccAwaitDt")
    public String getCAccAwaitDt() {
        return cAccAwaitDt;
    }

    @JsonProperty("CAccAwaitDt")
    public void setCAccAwaitDt(String cAccAwaitDt) {
        this.cAccAwaitDt = cAccAwaitDt;
    }

    public CPIPlan withCAccAwaitDt(String cAccAwaitDt) {
        this.cAccAwaitDt = cAccAwaitDt;
        return this;
    }

    @JsonProperty("CAccExpDt")
    public String getCAccExpDt() {
        return cAccExpDt;
    }

    @JsonProperty("CAccExpDt")
    public void setCAccExpDt(String cAccExpDt) {
        this.cAccExpDt = cAccExpDt;
    }

    public CPIPlan withCAccExpDt(String cAccExpDt) {
        this.cAccExpDt = cAccExpDt;
        return this;
    }

    @JsonProperty("CAccWaitPeriod")
    public String getCAccWaitPeriod() {
        return cAccWaitPeriod;
    }

    @JsonProperty("CAccWaitPeriod")
    public void setCAccWaitPeriod(String cAccWaitPeriod) {
        this.cAccWaitPeriod = cAccWaitPeriod;
    }

    public CPIPlan withCAccWaitPeriod(String cAccWaitPeriod) {
        this.cAccWaitPeriod = cAccWaitPeriod;
        return this;
    }

    @JsonProperty("CAnnualDeductible")
    public String getCAnnualDeductible() {
        return cAnnualDeductible;
    }

    @JsonProperty("CAnnualDeductible")
    public void setCAnnualDeductible(String cAnnualDeductible) {
        this.cAnnualDeductible = cAnnualDeductible;
    }

    public CPIPlan withCAnnualDeductible(String cAnnualDeductible) {
        this.cAnnualDeductible = cAnnualDeductible;
        return this;
    }

    @JsonProperty("CAnnCovLimitType")
    public String getCAnnCovLimitType() {
        return cAnnCovLimitType;
    }

    @JsonProperty("CAnnCovLimitType")
    public void setCAnnCovLimitType(String cAnnCovLimitType) {
        this.cAnnCovLimitType = cAnnCovLimitType;
    }

    public CPIPlan withCAnnCovLimitType(String cAnnCovLimitType) {
        this.cAnnCovLimitType = cAnnCovLimitType;
        return this;
    }

    @JsonProperty("CAnnCovLmt")
    public String getCAnnCovLmt() {
        return cAnnCovLmt;
    }

    @JsonProperty("CAnnCovLmt")
    public void setCAnnCovLmt(String cAnnCovLmt) {
        this.cAnnCovLmt = cAnnCovLmt;
    }

    public CPIPlan withCAnnCovLmt(String cAnnCovLmt) {
        this.cAnnCovLmt = cAnnCovLmt;
        return this;
    }

    @JsonProperty("CCoinsurance")
    public String getCCoinsurance() {
        return cCoinsurance;
    }

    @JsonProperty("CCoinsurance")
    public void setCCoinsurance(String cCoinsurance) {
        this.cCoinsurance = cCoinsurance;
    }

    public CPIPlan withCCoinsurance(String cCoinsurance) {
        this.cCoinsurance = cCoinsurance;
        return this;
    }

    @JsonProperty("CCovType")
    public String getCCovType() {
        return cCovType;
    }

    @JsonProperty("CCovType")
    public void setCCovType(String cCovType) {
        this.cCovType = cCovType;
    }

    public CPIPlan withCCovType(String cCovType) {
        this.cCovType = cCovType;
        return this;
    }

    @JsonProperty("CDedReduction")
    public String getCDedReduction() {
        return cDedReduction;
    }

    @JsonProperty("CDedReduction")
    public void setCDedReduction(String cDedReduction) {
        this.cDedReduction = cDedReduction;
    }

    public CPIPlan withCDedReduction(String cDedReduction) {
        this.cDedReduction = cDedReduction;
        return this;
    }

    @JsonProperty("CDedReducAmt")
    public String getCDedReducAmt() {
        return cDedReducAmt;
    }

    @JsonProperty("CDedReducAmt")
    public void setCDedReducAmt(String cDedReducAmt) {
        this.cDedReducAmt = cDedReducAmt;
    }

    public CPIPlan withCDedReducAmt(String cDedReducAmt) {
        this.cDedReducAmt = cDedReducAmt;
        return this;
    }

    @JsonProperty("CEffectAnnDed")
    public String getCEffectAnnDed() {
        return cEffectAnnDed;
    }

    @JsonProperty("CEffectAnnDed")
    public void setCEffectAnnDed(String cEffectAnnDed) {
        this.cEffectAnnDed = cEffectAnnDed;
    }

    public CPIPlan withCEffectAnnDed(String cEffectAnnDed) {
        this.cEffectAnnDed = cEffectAnnDed;
        return this;
    }

    @JsonProperty("CExcessIllnessDy")
    public String getCExcessIllnessDy() {
        return cExcessIllnessDy;
    }

    @JsonProperty("CExcessIllnessDy")
    public void setCExcessIllnessDy(String cExcessIllnessDy) {
        this.cExcessIllnessDy = cExcessIllnessDy;
    }

    public CPIPlan withCExcessIllnessDy(String cExcessIllnessDy) {
        this.cExcessIllnessDy = cExcessIllnessDy;
        return this;
    }

    @JsonProperty("CExcessOrthoWtPrDy")
    public String getCExcessOrthoWtPrDy() {
        return cExcessOrthoWtPrDy;
    }

    @JsonProperty("CExcessOrthoWtPrDy")
    public void setCExcessOrthoWtPrDy(String cExcessOrthoWtPrDy) {
        this.cExcessOrthoWtPrDy = cExcessOrthoWtPrDy;
    }

    public CPIPlan withCExcessOrthoWtPrDy(String cExcessOrthoWtPrDy) {
        this.cExcessOrthoWtPrDy = cExcessOrthoWtPrDy;
        return this;
    }

    @JsonProperty("CExcessWaitDays")
    public String getCExcessWaitDays() {
        return cExcessWaitDays;
    }

    @JsonProperty("CExcessWaitDays")
    public void setCExcessWaitDays(String cExcessWaitDays) {
        this.cExcessWaitDays = cExcessWaitDays;
    }

    public CPIPlan withCExcessWaitDays(String cExcessWaitDays) {
        this.cExcessWaitDays = cExcessWaitDays;
        return this;
    }

    @JsonProperty("CIllnessEffectiveDt")
    public String getCIllnessEffectiveDt() {
        return cIllnessEffectiveDt;
    }

    @JsonProperty("CIllnessEffectiveDt")
    public void setCIllnessEffectiveDt(String cIllnessEffectiveDt) {
        this.cIllnessEffectiveDt = cIllnessEffectiveDt;
    }

    public CPIPlan withCIllnessEffectiveDt(String cIllnessEffectiveDt) {
        this.cIllnessEffectiveDt = cIllnessEffectiveDt;
        return this;
    }

    @JsonProperty("CIllnessExpirDate")
    public String getCIllnessExpirDate() {
        return cIllnessExpirDate;
    }

    @JsonProperty("CIllnessExpirDate")
    public void setCIllnessExpirDate(String cIllnessExpirDate) {
        this.cIllnessExpirDate = cIllnessExpirDate;
    }

    public CPIPlan withCIllnessExpirDate(String cIllnessExpirDate) {
        this.cIllnessExpirDate = cIllnessExpirDate;
        return this;
    }

    @JsonProperty("CIllnessWaitDays")
    public String getCIllnessWaitDays() {
        return cIllnessWaitDays;
    }

    @JsonProperty("CIllnessWaitDays")
    public void setCIllnessWaitDays(String cIllnessWaitDays) {
        this.cIllnessWaitDays = cIllnessWaitDays;
    }

    public CPIPlan withCIllnessWaitDays(String cIllnessWaitDays) {
        this.cIllnessWaitDays = cIllnessWaitDays;
        return this;
    }

    @JsonProperty("CNumTermCount")
    public String getCNumTermCount() {
        return cNumTermCount;
    }

    @JsonProperty("CNumTermCount")
    public void setCNumTermCount(String cNumTermCount) {
        this.cNumTermCount = cNumTermCount;
    }

    public CPIPlan withCNumTermCount(String cNumTermCount) {
        this.cNumTermCount = cNumTermCount;
        return this;
    }

    @JsonProperty("COrthopedicWaitPrDy")
    public String getCOrthopedicWaitPrDy() {
        return cOrthopedicWaitPrDy;
    }

    @JsonProperty("COrthopedicWaitPrDy")
    public void setCOrthopedicWaitPrDy(String cOrthopedicWaitPrDy) {
        this.cOrthopedicWaitPrDy = cOrthopedicWaitPrDy;
    }

    public CPIPlan withCOrthopedicWaitPrDy(String cOrthopedicWaitPrDy) {
        this.cOrthopedicWaitPrDy = cOrthopedicWaitPrDy;
        return this;
    }

    @JsonProperty("COrthoEffectDt")
    public String getCOrthoEffectDt() {
        return cOrthoEffectDt;
    }

    @JsonProperty("COrthoEffectDt")
    public void setCOrthoEffectDt(String cOrthoEffectDt) {
        this.cOrthoEffectDt = cOrthoEffectDt;
    }

    public CPIPlan withCOrthoEffectDt(String cOrthoEffectDt) {
        this.cOrthoEffectDt = cOrthoEffectDt;
        return this;
    }

    @JsonProperty("COrthoExpDate")
    public String getCOrthoExpDate() {
        return cOrthoExpDate;
    }

    @JsonProperty("COrthoExpDate")
    public void setCOrthoExpDate(String cOrthoExpDate) {
        this.cOrthoExpDate = cOrthoExpDate;
    }

    public CPIPlan withCOrthoExpDate(String cOrthoExpDate) {
        this.cOrthoExpDate = cOrthoExpDate;
        return this;
    }

    @JsonProperty("CPerIncidentCopay")
    public String getCPerIncidentCopay() {
        return cPerIncidentCopay;
    }

    @JsonProperty("CPerIncidentCopay")
    public void setCPerIncidentCopay(String cPerIncidentCopay) {
        this.cPerIncidentCopay = cPerIncidentCopay;
    }

    public CPIPlan withCPerIncidentCopay(String cPerIncidentCopay) {
        this.cPerIncidentCopay = cPerIncidentCopay;
        return this;
    }

    @JsonProperty("CPiPlan")
    public String getCPiPlan() {
        return cPiPlan;
    }

    @JsonProperty("CPiPlan")
    public void setCPiPlan(String cPiPlan) {
        this.cPiPlan = cPiPlan;
    }

    public CPIPlan withCPiPlan(String cPiPlan) {
        this.cPiPlan = cPiPlan;
        return this;
    }

    @JsonProperty("CReimbursement")
    public String getCReimbursement() {
        return cReimbursement;
    }

    @JsonProperty("CReimbursement")
    public void setCReimbursement(String cReimbursement) {
        this.cReimbursement = cReimbursement;
    }

    public CPIPlan withCReimbursement(String cReimbursement) {
        this.cReimbursement = cReimbursement;
        return this;
    }

    @JsonProperty("CSelectedPetPlan")
    public String getCSelectedPetPlan() {
        return cSelectedPetPlan;
    }

    @JsonProperty("CSelectedPetPlan")
    public void setCSelectedPetPlan(String cSelectedPetPlan) {
        this.cSelectedPetPlan = cSelectedPetPlan;
    }

    public CPIPlan withCSelectedPetPlan(String cSelectedPetPlan) {
        this.cSelectedPetPlan = cSelectedPetPlan;
        return this;
    }

    @JsonProperty("CWaiveOrthoWaitPr")
    public String getCWaiveOrthoWaitPr() {
        return cWaiveOrthoWaitPr;
    }

    @JsonProperty("CWaiveOrthoWaitPr")
    public void setCWaiveOrthoWaitPr(String cWaiveOrthoWaitPr) {
        this.cWaiveOrthoWaitPr = cWaiveOrthoWaitPr;
    }

    public CPIPlan withCWaiveOrthoWaitPr(String cWaiveOrthoWaitPr) {
        this.cWaiveOrthoWaitPr = cWaiveOrthoWaitPr;
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

    public CPIPlan withEntityReference(String entityReference) {
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

    public CPIPlan withEntityType(String entityType) {
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

    public CPIPlan withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CPIPlan.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cAccAwaitDt");
        sb.append('=');
        sb.append(((this.cAccAwaitDt == null)?"<null>":this.cAccAwaitDt));
        sb.append(',');
        sb.append("cAccExpDt");
        sb.append('=');
        sb.append(((this.cAccExpDt == null)?"<null>":this.cAccExpDt));
        sb.append(',');
        sb.append("cAccWaitPeriod");
        sb.append('=');
        sb.append(((this.cAccWaitPeriod == null)?"<null>":this.cAccWaitPeriod));
        sb.append(',');
        sb.append("cAnnualDeductible");
        sb.append('=');
        sb.append(((this.cAnnualDeductible == null)?"<null>":this.cAnnualDeductible));
        sb.append(',');
        sb.append("cAnnCovLimitType");
        sb.append('=');
        sb.append(((this.cAnnCovLimitType == null)?"<null>":this.cAnnCovLimitType));
        sb.append(',');
        sb.append("cAnnCovLmt");
        sb.append('=');
        sb.append(((this.cAnnCovLmt == null)?"<null>":this.cAnnCovLmt));
        sb.append(',');
        sb.append("cCoinsurance");
        sb.append('=');
        sb.append(((this.cCoinsurance == null)?"<null>":this.cCoinsurance));
        sb.append(',');
        sb.append("cCovType");
        sb.append('=');
        sb.append(((this.cCovType == null)?"<null>":this.cCovType));
        sb.append(',');
        sb.append("cDedReduction");
        sb.append('=');
        sb.append(((this.cDedReduction == null)?"<null>":this.cDedReduction));
        sb.append(',');
        sb.append("cDedReducAmt");
        sb.append('=');
        sb.append(((this.cDedReducAmt == null)?"<null>":this.cDedReducAmt));
        sb.append(',');
        sb.append("cEffectAnnDed");
        sb.append('=');
        sb.append(((this.cEffectAnnDed == null)?"<null>":this.cEffectAnnDed));
        sb.append(',');
        sb.append("cExcessIllnessDy");
        sb.append('=');
        sb.append(((this.cExcessIllnessDy == null)?"<null>":this.cExcessIllnessDy));
        sb.append(',');
        sb.append("cExcessOrthoWtPrDy");
        sb.append('=');
        sb.append(((this.cExcessOrthoWtPrDy == null)?"<null>":this.cExcessOrthoWtPrDy));
        sb.append(',');
        sb.append("cExcessWaitDays");
        sb.append('=');
        sb.append(((this.cExcessWaitDays == null)?"<null>":this.cExcessWaitDays));
        sb.append(',');
        sb.append("cIllnessEffectiveDt");
        sb.append('=');
        sb.append(((this.cIllnessEffectiveDt == null)?"<null>":this.cIllnessEffectiveDt));
        sb.append(',');
        sb.append("cIllnessExpirDate");
        sb.append('=');
        sb.append(((this.cIllnessExpirDate == null)?"<null>":this.cIllnessExpirDate));
        sb.append(',');
        sb.append("cIllnessWaitDays");
        sb.append('=');
        sb.append(((this.cIllnessWaitDays == null)?"<null>":this.cIllnessWaitDays));
        sb.append(',');
        sb.append("cNumTermCount");
        sb.append('=');
        sb.append(((this.cNumTermCount == null)?"<null>":this.cNumTermCount));
        sb.append(',');
        sb.append("cOrthopedicWaitPrDy");
        sb.append('=');
        sb.append(((this.cOrthopedicWaitPrDy == null)?"<null>":this.cOrthopedicWaitPrDy));
        sb.append(',');
        sb.append("cOrthoEffectDt");
        sb.append('=');
        sb.append(((this.cOrthoEffectDt == null)?"<null>":this.cOrthoEffectDt));
        sb.append(',');
        sb.append("cOrthoExpDate");
        sb.append('=');
        sb.append(((this.cOrthoExpDate == null)?"<null>":this.cOrthoExpDate));
        sb.append(',');
        sb.append("cPerIncidentCopay");
        sb.append('=');
        sb.append(((this.cPerIncidentCopay == null)?"<null>":this.cPerIncidentCopay));
        sb.append(',');
        sb.append("cPiPlan");
        sb.append('=');
        sb.append(((this.cPiPlan == null)?"<null>":this.cPiPlan));
        sb.append(',');
        sb.append("cReimbursement");
        sb.append('=');
        sb.append(((this.cReimbursement == null)?"<null>":this.cReimbursement));
        sb.append(',');
        sb.append("cSelectedPetPlan");
        sb.append('=');
        sb.append(((this.cSelectedPetPlan == null)?"<null>":this.cSelectedPetPlan));
        sb.append(',');
        sb.append("cWaiveOrthoWaitPr");
        sb.append('=');
        sb.append(((this.cWaiveOrthoWaitPr == null)?"<null>":this.cWaiveOrthoWaitPr));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
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
        result = ((result* 31)+((this.cExcessIllnessDy == null)? 0 :this.cExcessIllnessDy.hashCode()));
        result = ((result* 31)+((this.cPerIncidentCopay == null)? 0 :this.cPerIncidentCopay.hashCode()));
        result = ((result* 31)+((this.cSelectedPetPlan == null)? 0 :this.cSelectedPetPlan.hashCode()));
        result = ((result* 31)+((this.cDedReducAmt == null)? 0 :this.cDedReducAmt.hashCode()));
        result = ((result* 31)+((this.cCoinsurance == null)? 0 :this.cCoinsurance.hashCode()));
        result = ((result* 31)+((this.cReimbursement == null)? 0 :this.cReimbursement.hashCode()));
        result = ((result* 31)+((this.cAccWaitPeriod == null)? 0 :this.cAccWaitPeriod.hashCode()));
        result = ((result* 31)+((this.cEffectAnnDed == null)? 0 :this.cEffectAnnDed.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.cExcessOrthoWtPrDy == null)? 0 :this.cExcessOrthoWtPrDy.hashCode()));
        result = ((result* 31)+((this.cAnnCovLmt == null)? 0 :this.cAnnCovLmt.hashCode()));
        result = ((result* 31)+((this.cOrthoEffectDt == null)? 0 :this.cOrthoEffectDt.hashCode()));
        result = ((result* 31)+((this.cOrthopedicWaitPrDy == null)? 0 :this.cOrthopedicWaitPrDy.hashCode()));
        result = ((result* 31)+((this.cIllnessExpirDate == null)? 0 :this.cIllnessExpirDate.hashCode()));
        result = ((result* 31)+((this.cIllnessEffectiveDt == null)? 0 :this.cIllnessEffectiveDt.hashCode()));
        result = ((result* 31)+((this.cIllnessWaitDays == null)? 0 :this.cIllnessWaitDays.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.cCovType == null)? 0 :this.cCovType.hashCode()));
        result = ((result* 31)+((this.cWaiveOrthoWaitPr == null)? 0 :this.cWaiveOrthoWaitPr.hashCode()));
        result = ((result* 31)+((this.cAnnCovLimitType == null)? 0 :this.cAnnCovLimitType.hashCode()));
        result = ((result* 31)+((this.cExcessWaitDays == null)? 0 :this.cExcessWaitDays.hashCode()));
        result = ((result* 31)+((this.cNumTermCount == null)? 0 :this.cNumTermCount.hashCode()));
        result = ((result* 31)+((this.cAccExpDt == null)? 0 :this.cAccExpDt.hashCode()));
        result = ((result* 31)+((this.cDedReduction == null)? 0 :this.cDedReduction.hashCode()));
        result = ((result* 31)+((this.cAccAwaitDt == null)? 0 :this.cAccAwaitDt.hashCode()));
        result = ((result* 31)+((this.cAnnualDeductible == null)? 0 :this.cAnnualDeductible.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cOrthoExpDate == null)? 0 :this.cOrthoExpDate.hashCode()));
        result = ((result* 31)+((this.cPiPlan == null)? 0 :this.cPiPlan.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CPIPlan) == false) {
            return false;
        }
        CPIPlan rhs = ((CPIPlan) other);
        return ((((((((((((((((((((((((((((((this.cExcessIllnessDy == rhs.cExcessIllnessDy)||((this.cExcessIllnessDy!= null)&&this.cExcessIllnessDy.equals(rhs.cExcessIllnessDy)))&&((this.cPerIncidentCopay == rhs.cPerIncidentCopay)||((this.cPerIncidentCopay!= null)&&this.cPerIncidentCopay.equals(rhs.cPerIncidentCopay))))&&((this.cSelectedPetPlan == rhs.cSelectedPetPlan)||((this.cSelectedPetPlan!= null)&&this.cSelectedPetPlan.equals(rhs.cSelectedPetPlan))))&&((this.cDedReducAmt == rhs.cDedReducAmt)||((this.cDedReducAmt!= null)&&this.cDedReducAmt.equals(rhs.cDedReducAmt))))&&((this.cCoinsurance == rhs.cCoinsurance)||((this.cCoinsurance!= null)&&this.cCoinsurance.equals(rhs.cCoinsurance))))&&((this.cReimbursement == rhs.cReimbursement)||((this.cReimbursement!= null)&&this.cReimbursement.equals(rhs.cReimbursement))))&&((this.cAccWaitPeriod == rhs.cAccWaitPeriod)||((this.cAccWaitPeriod!= null)&&this.cAccWaitPeriod.equals(rhs.cAccWaitPeriod))))&&((this.cEffectAnnDed == rhs.cEffectAnnDed)||((this.cEffectAnnDed!= null)&&this.cEffectAnnDed.equals(rhs.cEffectAnnDed))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.cExcessOrthoWtPrDy == rhs.cExcessOrthoWtPrDy)||((this.cExcessOrthoWtPrDy!= null)&&this.cExcessOrthoWtPrDy.equals(rhs.cExcessOrthoWtPrDy))))&&((this.cAnnCovLmt == rhs.cAnnCovLmt)||((this.cAnnCovLmt!= null)&&this.cAnnCovLmt.equals(rhs.cAnnCovLmt))))&&((this.cOrthoEffectDt == rhs.cOrthoEffectDt)||((this.cOrthoEffectDt!= null)&&this.cOrthoEffectDt.equals(rhs.cOrthoEffectDt))))&&((this.cOrthopedicWaitPrDy == rhs.cOrthopedicWaitPrDy)||((this.cOrthopedicWaitPrDy!= null)&&this.cOrthopedicWaitPrDy.equals(rhs.cOrthopedicWaitPrDy))))&&((this.cIllnessExpirDate == rhs.cIllnessExpirDate)||((this.cIllnessExpirDate!= null)&&this.cIllnessExpirDate.equals(rhs.cIllnessExpirDate))))&&((this.cIllnessEffectiveDt == rhs.cIllnessEffectiveDt)||((this.cIllnessEffectiveDt!= null)&&this.cIllnessEffectiveDt.equals(rhs.cIllnessEffectiveDt))))&&((this.cIllnessWaitDays == rhs.cIllnessWaitDays)||((this.cIllnessWaitDays!= null)&&this.cIllnessWaitDays.equals(rhs.cIllnessWaitDays))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.cCovType == rhs.cCovType)||((this.cCovType!= null)&&this.cCovType.equals(rhs.cCovType))))&&((this.cWaiveOrthoWaitPr == rhs.cWaiveOrthoWaitPr)||((this.cWaiveOrthoWaitPr!= null)&&this.cWaiveOrthoWaitPr.equals(rhs.cWaiveOrthoWaitPr))))&&((this.cAnnCovLimitType == rhs.cAnnCovLimitType)||((this.cAnnCovLimitType!= null)&&this.cAnnCovLimitType.equals(rhs.cAnnCovLimitType))))&&((this.cExcessWaitDays == rhs.cExcessWaitDays)||((this.cExcessWaitDays!= null)&&this.cExcessWaitDays.equals(rhs.cExcessWaitDays))))&&((this.cNumTermCount == rhs.cNumTermCount)||((this.cNumTermCount!= null)&&this.cNumTermCount.equals(rhs.cNumTermCount))))&&((this.cAccExpDt == rhs.cAccExpDt)||((this.cAccExpDt!= null)&&this.cAccExpDt.equals(rhs.cAccExpDt))))&&((this.cDedReduction == rhs.cDedReduction)||((this.cDedReduction!= null)&&this.cDedReduction.equals(rhs.cDedReduction))))&&((this.cAccAwaitDt == rhs.cAccAwaitDt)||((this.cAccAwaitDt!= null)&&this.cAccAwaitDt.equals(rhs.cAccAwaitDt))))&&((this.cAnnualDeductible == rhs.cAnnualDeductible)||((this.cAnnualDeductible!= null)&&this.cAnnualDeductible.equals(rhs.cAnnualDeductible))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cOrthoExpDate == rhs.cOrthoExpDate)||((this.cOrthoExpDate!= null)&&this.cOrthoExpDate.equals(rhs.cOrthoExpDate))))&&((this.cPiPlan == rhs.cPiPlan)||((this.cPiPlan!= null)&&this.cPiPlan.equals(rhs.cPiPlan))));
    }

}
