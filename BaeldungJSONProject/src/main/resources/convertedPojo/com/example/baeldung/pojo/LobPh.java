
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
    "CPolicyDiscount",
    "CTotAnnPolDisc",
    "EntityReference",
    "EntityType",
    "IsCovManuallyRated",
    "LobCode",
    "PolicyLobPh",
    "ProductCode",
    "RiskState",
    "WaivedPremium",
    "PremiumAttributes",
    "PHBasicPetInformation",
    "csavingbydiscount",
    "PhDiscounts",
    "TaxesSurchargesFees",
    "PetInsurancePet"
})
@Generated("jsonschema2pojo")
public class LobPh {

    @JsonProperty("CPolicyDiscount")
    private String cPolicyDiscount;
    @JsonProperty("CTotAnnPolDisc")
    private String cTotAnnPolDisc;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("IsCovManuallyRated")
    private String isCovManuallyRated;
    @JsonProperty("LobCode")
    private String lobCode;
    @JsonProperty("PolicyLobPh")
    private String policyLobPh;
    @JsonProperty("ProductCode")
    private String productCode;
    @JsonProperty("RiskState")
    private String riskState;
    @JsonProperty("WaivedPremium")
    private String waivedPremium;
    @JsonProperty("PremiumAttributes")
    private PremiumAttributes__1 premiumAttributes;
    @JsonProperty("PHBasicPetInformation")
    private List<PHBasicPetInformation> pHBasicPetInformation = new ArrayList<PHBasicPetInformation>();
    @JsonProperty("csavingbydiscount")
    private List<Csavingbydiscount> csavingbydiscount = new ArrayList<Csavingbydiscount>();
    @JsonProperty("PhDiscounts")
    private List<PhDiscount> phDiscounts = new ArrayList<PhDiscount>();
    @JsonProperty("TaxesSurchargesFees")
    private List<TaxesSurchargesFee> taxesSurchargesFees = new ArrayList<TaxesSurchargesFee>();
    @JsonProperty("PetInsurancePet")
    private List<PetInsurancePet> petInsurancePet = new ArrayList<PetInsurancePet>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CPolicyDiscount")
    public String getCPolicyDiscount() {
        return cPolicyDiscount;
    }

    @JsonProperty("CPolicyDiscount")
    public void setCPolicyDiscount(String cPolicyDiscount) {
        this.cPolicyDiscount = cPolicyDiscount;
    }

    public LobPh withCPolicyDiscount(String cPolicyDiscount) {
        this.cPolicyDiscount = cPolicyDiscount;
        return this;
    }

    @JsonProperty("CTotAnnPolDisc")
    public String getCTotAnnPolDisc() {
        return cTotAnnPolDisc;
    }

    @JsonProperty("CTotAnnPolDisc")
    public void setCTotAnnPolDisc(String cTotAnnPolDisc) {
        this.cTotAnnPolDisc = cTotAnnPolDisc;
    }

    public LobPh withCTotAnnPolDisc(String cTotAnnPolDisc) {
        this.cTotAnnPolDisc = cTotAnnPolDisc;
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

    public LobPh withEntityReference(String entityReference) {
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

    public LobPh withEntityType(String entityType) {
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

    public LobPh withIsCovManuallyRated(String isCovManuallyRated) {
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

    public LobPh withLobCode(String lobCode) {
        this.lobCode = lobCode;
        return this;
    }

    @JsonProperty("PolicyLobPh")
    public String getPolicyLobPh() {
        return policyLobPh;
    }

    @JsonProperty("PolicyLobPh")
    public void setPolicyLobPh(String policyLobPh) {
        this.policyLobPh = policyLobPh;
    }

    public LobPh withPolicyLobPh(String policyLobPh) {
        this.policyLobPh = policyLobPh;
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

    public LobPh withProductCode(String productCode) {
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

    public LobPh withRiskState(String riskState) {
        this.riskState = riskState;
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

    public LobPh withWaivedPremium(String waivedPremium) {
        this.waivedPremium = waivedPremium;
        return this;
    }

    @JsonProperty("PremiumAttributes")
    public PremiumAttributes__1 getPremiumAttributes() {
        return premiumAttributes;
    }

    @JsonProperty("PremiumAttributes")
    public void setPremiumAttributes(PremiumAttributes__1 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
    }

    public LobPh withPremiumAttributes(PremiumAttributes__1 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
        return this;
    }

    @JsonProperty("PHBasicPetInformation")
    public List<PHBasicPetInformation> getPHBasicPetInformation() {
        return pHBasicPetInformation;
    }

    @JsonProperty("PHBasicPetInformation")
    public void setPHBasicPetInformation(List<PHBasicPetInformation> pHBasicPetInformation) {
        this.pHBasicPetInformation = pHBasicPetInformation;
    }

    public LobPh withPHBasicPetInformation(List<PHBasicPetInformation> pHBasicPetInformation) {
        this.pHBasicPetInformation = pHBasicPetInformation;
        return this;
    }

    @JsonProperty("csavingbydiscount")
    public List<Csavingbydiscount> getCsavingbydiscount() {
        return csavingbydiscount;
    }

    @JsonProperty("csavingbydiscount")
    public void setCsavingbydiscount(List<Csavingbydiscount> csavingbydiscount) {
        this.csavingbydiscount = csavingbydiscount;
    }

    public LobPh withCsavingbydiscount(List<Csavingbydiscount> csavingbydiscount) {
        this.csavingbydiscount = csavingbydiscount;
        return this;
    }

    @JsonProperty("PhDiscounts")
    public List<PhDiscount> getPhDiscounts() {
        return phDiscounts;
    }

    @JsonProperty("PhDiscounts")
    public void setPhDiscounts(List<PhDiscount> phDiscounts) {
        this.phDiscounts = phDiscounts;
    }

    public LobPh withPhDiscounts(List<PhDiscount> phDiscounts) {
        this.phDiscounts = phDiscounts;
        return this;
    }

    @JsonProperty("TaxesSurchargesFees")
    public List<TaxesSurchargesFee> getTaxesSurchargesFees() {
        return taxesSurchargesFees;
    }

    @JsonProperty("TaxesSurchargesFees")
    public void setTaxesSurchargesFees(List<TaxesSurchargesFee> taxesSurchargesFees) {
        this.taxesSurchargesFees = taxesSurchargesFees;
    }

    public LobPh withTaxesSurchargesFees(List<TaxesSurchargesFee> taxesSurchargesFees) {
        this.taxesSurchargesFees = taxesSurchargesFees;
        return this;
    }

    @JsonProperty("PetInsurancePet")
    public List<PetInsurancePet> getPetInsurancePet() {
        return petInsurancePet;
    }

    @JsonProperty("PetInsurancePet")
    public void setPetInsurancePet(List<PetInsurancePet> petInsurancePet) {
        this.petInsurancePet = petInsurancePet;
    }

    public LobPh withPetInsurancePet(List<PetInsurancePet> petInsurancePet) {
        this.petInsurancePet = petInsurancePet;
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

    public LobPh withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LobPh.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cPolicyDiscount");
        sb.append('=');
        sb.append(((this.cPolicyDiscount == null)?"<null>":this.cPolicyDiscount));
        sb.append(',');
        sb.append("cTotAnnPolDisc");
        sb.append('=');
        sb.append(((this.cTotAnnPolDisc == null)?"<null>":this.cTotAnnPolDisc));
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
        sb.append("policyLobPh");
        sb.append('=');
        sb.append(((this.policyLobPh == null)?"<null>":this.policyLobPh));
        sb.append(',');
        sb.append("productCode");
        sb.append('=');
        sb.append(((this.productCode == null)?"<null>":this.productCode));
        sb.append(',');
        sb.append("riskState");
        sb.append('=');
        sb.append(((this.riskState == null)?"<null>":this.riskState));
        sb.append(',');
        sb.append("waivedPremium");
        sb.append('=');
        sb.append(((this.waivedPremium == null)?"<null>":this.waivedPremium));
        sb.append(',');
        sb.append("premiumAttributes");
        sb.append('=');
        sb.append(((this.premiumAttributes == null)?"<null>":this.premiumAttributes));
        sb.append(',');
        sb.append("pHBasicPetInformation");
        sb.append('=');
        sb.append(((this.pHBasicPetInformation == null)?"<null>":this.pHBasicPetInformation));
        sb.append(',');
        sb.append("csavingbydiscount");
        sb.append('=');
        sb.append(((this.csavingbydiscount == null)?"<null>":this.csavingbydiscount));
        sb.append(',');
        sb.append("phDiscounts");
        sb.append('=');
        sb.append(((this.phDiscounts == null)?"<null>":this.phDiscounts));
        sb.append(',');
        sb.append("taxesSurchargesFees");
        sb.append('=');
        sb.append(((this.taxesSurchargesFees == null)?"<null>":this.taxesSurchargesFees));
        sb.append(',');
        sb.append("petInsurancePet");
        sb.append('=');
        sb.append(((this.petInsurancePet == null)?"<null>":this.petInsurancePet));
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
        result = ((result* 31)+((this.policyLobPh == null)? 0 :this.policyLobPh.hashCode()));
        result = ((result* 31)+((this.pHBasicPetInformation == null)? 0 :this.pHBasicPetInformation.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.isCovManuallyRated == null)? 0 :this.isCovManuallyRated.hashCode()));
        result = ((result* 31)+((this.phDiscounts == null)? 0 :this.phDiscounts.hashCode()));
        result = ((result* 31)+((this.cPolicyDiscount == null)? 0 :this.cPolicyDiscount.hashCode()));
        result = ((result* 31)+((this.petInsurancePet == null)? 0 :this.petInsurancePet.hashCode()));
        result = ((result* 31)+((this.waivedPremium == null)? 0 :this.waivedPremium.hashCode()));
        result = ((result* 31)+((this.productCode == null)? 0 :this.productCode.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lobCode == null)? 0 :this.lobCode.hashCode()));
        result = ((result* 31)+((this.riskState == null)? 0 :this.riskState.hashCode()));
        result = ((result* 31)+((this.premiumAttributes == null)? 0 :this.premiumAttributes.hashCode()));
        result = ((result* 31)+((this.cTotAnnPolDisc == null)? 0 :this.cTotAnnPolDisc.hashCode()));
        result = ((result* 31)+((this.csavingbydiscount == null)? 0 :this.csavingbydiscount.hashCode()));
        result = ((result* 31)+((this.taxesSurchargesFees == null)? 0 :this.taxesSurchargesFees.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LobPh) == false) {
            return false;
        }
        LobPh rhs = ((LobPh) other);
        return ((((((((((((((((((this.policyLobPh == rhs.policyLobPh)||((this.policyLobPh!= null)&&this.policyLobPh.equals(rhs.policyLobPh)))&&((this.pHBasicPetInformation == rhs.pHBasicPetInformation)||((this.pHBasicPetInformation!= null)&&this.pHBasicPetInformation.equals(rhs.pHBasicPetInformation))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.isCovManuallyRated == rhs.isCovManuallyRated)||((this.isCovManuallyRated!= null)&&this.isCovManuallyRated.equals(rhs.isCovManuallyRated))))&&((this.phDiscounts == rhs.phDiscounts)||((this.phDiscounts!= null)&&this.phDiscounts.equals(rhs.phDiscounts))))&&((this.cPolicyDiscount == rhs.cPolicyDiscount)||((this.cPolicyDiscount!= null)&&this.cPolicyDiscount.equals(rhs.cPolicyDiscount))))&&((this.petInsurancePet == rhs.petInsurancePet)||((this.petInsurancePet!= null)&&this.petInsurancePet.equals(rhs.petInsurancePet))))&&((this.waivedPremium == rhs.waivedPremium)||((this.waivedPremium!= null)&&this.waivedPremium.equals(rhs.waivedPremium))))&&((this.productCode == rhs.productCode)||((this.productCode!= null)&&this.productCode.equals(rhs.productCode))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lobCode == rhs.lobCode)||((this.lobCode!= null)&&this.lobCode.equals(rhs.lobCode))))&&((this.riskState == rhs.riskState)||((this.riskState!= null)&&this.riskState.equals(rhs.riskState))))&&((this.premiumAttributes == rhs.premiumAttributes)||((this.premiumAttributes!= null)&&this.premiumAttributes.equals(rhs.premiumAttributes))))&&((this.cTotAnnPolDisc == rhs.cTotAnnPolDisc)||((this.cTotAnnPolDisc!= null)&&this.cTotAnnPolDisc.equals(rhs.cTotAnnPolDisc))))&&((this.csavingbydiscount == rhs.csavingbydiscount)||((this.csavingbydiscount!= null)&&this.csavingbydiscount.equals(rhs.csavingbydiscount))))&&((this.taxesSurchargesFees == rhs.taxesSurchargesFees)||((this.taxesSurchargesFees!= null)&&this.taxesSurchargesFees.equals(rhs.taxesSurchargesFees))));
    }

}
