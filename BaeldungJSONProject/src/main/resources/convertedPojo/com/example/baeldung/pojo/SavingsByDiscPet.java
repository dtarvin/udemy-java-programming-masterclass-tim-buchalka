
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
    "CPiSavingsByDisc",
    "CTotApAllowedDisc",
    "EntityReference",
    "EntityType",
    "IsCovManuallyRated",
    "LobCode",
    "ProductCode",
    "RiskState",
    "RiskStateStatCode",
    "WaivedPremium",
    "PremiumAttributes",
    "savingsByDiscTabPet",
    "savingsByDiscRatePet"
})
@Generated("jsonschema2pojo")
public class SavingsByDiscPet {

    @JsonProperty("CPiSavingsByDisc")
    private String cPiSavingsByDisc;
    @JsonProperty("CTotApAllowedDisc")
    private String cTotApAllowedDisc;
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
    private PremiumAttributes__7 premiumAttributes;
    @JsonProperty("savingsByDiscTabPet")
    private List<SavingsByDiscTabPet> savingsByDiscTabPet = new ArrayList<SavingsByDiscTabPet>();
    @JsonProperty("savingsByDiscRatePet")
    private List<SavingsByDiscRatePet> savingsByDiscRatePet = new ArrayList<SavingsByDiscRatePet>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CPiSavingsByDisc")
    public String getCPiSavingsByDisc() {
        return cPiSavingsByDisc;
    }

    @JsonProperty("CPiSavingsByDisc")
    public void setCPiSavingsByDisc(String cPiSavingsByDisc) {
        this.cPiSavingsByDisc = cPiSavingsByDisc;
    }

    public SavingsByDiscPet withCPiSavingsByDisc(String cPiSavingsByDisc) {
        this.cPiSavingsByDisc = cPiSavingsByDisc;
        return this;
    }

    @JsonProperty("CTotApAllowedDisc")
    public String getCTotApAllowedDisc() {
        return cTotApAllowedDisc;
    }

    @JsonProperty("CTotApAllowedDisc")
    public void setCTotApAllowedDisc(String cTotApAllowedDisc) {
        this.cTotApAllowedDisc = cTotApAllowedDisc;
    }

    public SavingsByDiscPet withCTotApAllowedDisc(String cTotApAllowedDisc) {
        this.cTotApAllowedDisc = cTotApAllowedDisc;
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

    public SavingsByDiscPet withEntityReference(String entityReference) {
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

    public SavingsByDiscPet withEntityType(String entityType) {
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

    public SavingsByDiscPet withIsCovManuallyRated(String isCovManuallyRated) {
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

    public SavingsByDiscPet withLobCode(String lobCode) {
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

    public SavingsByDiscPet withProductCode(String productCode) {
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

    public SavingsByDiscPet withRiskState(String riskState) {
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

    public SavingsByDiscPet withRiskStateStatCode(String riskStateStatCode) {
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

    public SavingsByDiscPet withWaivedPremium(String waivedPremium) {
        this.waivedPremium = waivedPremium;
        return this;
    }

    @JsonProperty("PremiumAttributes")
    public PremiumAttributes__7 getPremiumAttributes() {
        return premiumAttributes;
    }

    @JsonProperty("PremiumAttributes")
    public void setPremiumAttributes(PremiumAttributes__7 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
    }

    public SavingsByDiscPet withPremiumAttributes(PremiumAttributes__7 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
        return this;
    }

    @JsonProperty("savingsByDiscTabPet")
    public List<SavingsByDiscTabPet> getSavingsByDiscTabPet() {
        return savingsByDiscTabPet;
    }

    @JsonProperty("savingsByDiscTabPet")
    public void setSavingsByDiscTabPet(List<SavingsByDiscTabPet> savingsByDiscTabPet) {
        this.savingsByDiscTabPet = savingsByDiscTabPet;
    }

    public SavingsByDiscPet withSavingsByDiscTabPet(List<SavingsByDiscTabPet> savingsByDiscTabPet) {
        this.savingsByDiscTabPet = savingsByDiscTabPet;
        return this;
    }

    @JsonProperty("savingsByDiscRatePet")
    public List<SavingsByDiscRatePet> getSavingsByDiscRatePet() {
        return savingsByDiscRatePet;
    }

    @JsonProperty("savingsByDiscRatePet")
    public void setSavingsByDiscRatePet(List<SavingsByDiscRatePet> savingsByDiscRatePet) {
        this.savingsByDiscRatePet = savingsByDiscRatePet;
    }

    public SavingsByDiscPet withSavingsByDiscRatePet(List<SavingsByDiscRatePet> savingsByDiscRatePet) {
        this.savingsByDiscRatePet = savingsByDiscRatePet;
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

    public SavingsByDiscPet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SavingsByDiscPet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cPiSavingsByDisc");
        sb.append('=');
        sb.append(((this.cPiSavingsByDisc == null)?"<null>":this.cPiSavingsByDisc));
        sb.append(',');
        sb.append("cTotApAllowedDisc");
        sb.append('=');
        sb.append(((this.cTotApAllowedDisc == null)?"<null>":this.cTotApAllowedDisc));
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
        sb.append("savingsByDiscTabPet");
        sb.append('=');
        sb.append(((this.savingsByDiscTabPet == null)?"<null>":this.savingsByDiscTabPet));
        sb.append(',');
        sb.append("savingsByDiscRatePet");
        sb.append('=');
        sb.append(((this.savingsByDiscRatePet == null)?"<null>":this.savingsByDiscRatePet));
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
        result = ((result* 31)+((this.cTotApAllowedDisc == null)? 0 :this.cTotApAllowedDisc.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.isCovManuallyRated == null)? 0 :this.isCovManuallyRated.hashCode()));
        result = ((result* 31)+((this.waivedPremium == null)? 0 :this.waivedPremium.hashCode()));
        result = ((result* 31)+((this.savingsByDiscRatePet == null)? 0 :this.savingsByDiscRatePet.hashCode()));
        result = ((result* 31)+((this.productCode == null)? 0 :this.productCode.hashCode()));
        result = ((result* 31)+((this.cPiSavingsByDisc == null)? 0 :this.cPiSavingsByDisc.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.savingsByDiscTabPet == null)? 0 :this.savingsByDiscTabPet.hashCode()));
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
        if ((other instanceof SavingsByDiscPet) == false) {
            return false;
        }
        SavingsByDiscPet rhs = ((SavingsByDiscPet) other);
        return (((((((((((((((this.riskStateStatCode == rhs.riskStateStatCode)||((this.riskStateStatCode!= null)&&this.riskStateStatCode.equals(rhs.riskStateStatCode)))&&((this.cTotApAllowedDisc == rhs.cTotApAllowedDisc)||((this.cTotApAllowedDisc!= null)&&this.cTotApAllowedDisc.equals(rhs.cTotApAllowedDisc))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.isCovManuallyRated == rhs.isCovManuallyRated)||((this.isCovManuallyRated!= null)&&this.isCovManuallyRated.equals(rhs.isCovManuallyRated))))&&((this.waivedPremium == rhs.waivedPremium)||((this.waivedPremium!= null)&&this.waivedPremium.equals(rhs.waivedPremium))))&&((this.savingsByDiscRatePet == rhs.savingsByDiscRatePet)||((this.savingsByDiscRatePet!= null)&&this.savingsByDiscRatePet.equals(rhs.savingsByDiscRatePet))))&&((this.productCode == rhs.productCode)||((this.productCode!= null)&&this.productCode.equals(rhs.productCode))))&&((this.cPiSavingsByDisc == rhs.cPiSavingsByDisc)||((this.cPiSavingsByDisc!= null)&&this.cPiSavingsByDisc.equals(rhs.cPiSavingsByDisc))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.savingsByDiscTabPet == rhs.savingsByDiscTabPet)||((this.savingsByDiscTabPet!= null)&&this.savingsByDiscTabPet.equals(rhs.savingsByDiscTabPet))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lobCode == rhs.lobCode)||((this.lobCode!= null)&&this.lobCode.equals(rhs.lobCode))))&&((this.riskState == rhs.riskState)||((this.riskState!= null)&&this.riskState.equals(rhs.riskState))))&&((this.premiumAttributes == rhs.premiumAttributes)||((this.premiumAttributes!= null)&&this.premiumAttributes.equals(rhs.premiumAttributes))));
    }

}
