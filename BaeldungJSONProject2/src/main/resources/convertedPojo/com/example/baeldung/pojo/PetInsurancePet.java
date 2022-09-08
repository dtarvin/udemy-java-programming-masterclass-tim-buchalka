
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
    "CAge",
    "CBreed",
    "CBreedGroup",
    "CDispPetName",
    "CExpectedLife",
    "CFiveDigitZip",
    "CGender",
    "CHasPetYN",
    "CName",
    "CPet",
    "CPetNumber",
    "CPetTransEffectDt",
    "CPetType",
    "CPrimaryState",
    "CSpecies",
    "CThreeDigitZip",
    "CWellness",
    "EntityReference",
    "EntityStatus",
    "EntityType",
    "IsCovManuallyRated",
    "LobCode",
    "ProductCode",
    "RiskState",
    "RiskStateStatCode",
    "WaivedPremium",
    "PremiumAttributes",
    "CPIPlan",
    "CPetPIDiscount",
    "PetRating",
    "COVERWELLNESS",
    "PetOptCov",
    "savingsByDiscPet",
    "DiscountOffset",
    "DiscountPerCoverage"
})
@Generated("jsonschema2pojo")
public class PetInsurancePet {

    @JsonProperty("CAge")
    private String cAge;
    @JsonProperty("CBreed")
    private String cBreed;
    @JsonProperty("CBreedGroup")
    private String cBreedGroup;
    @JsonProperty("CDispPetName")
    private String cDispPetName;
    @JsonProperty("CExpectedLife")
    private String cExpectedLife;
    @JsonProperty("CFiveDigitZip")
    private String cFiveDigitZip;
    @JsonProperty("CGender")
    private String cGender;
    @JsonProperty("CHasPetYN")
    private String cHasPetYN;
    @JsonProperty("CName")
    private String cName;
    @JsonProperty("CPet")
    private String cPet;
    @JsonProperty("CPetNumber")
    private String cPetNumber;
    @JsonProperty("CPetTransEffectDt")
    private String cPetTransEffectDt;
    @JsonProperty("CPetType")
    private String cPetType;
    @JsonProperty("CPrimaryState")
    private String cPrimaryState;
    @JsonProperty("CSpecies")
    private String cSpecies;
    @JsonProperty("CThreeDigitZip")
    private String cThreeDigitZip;
    @JsonProperty("CWellness")
    private String cWellness;
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
    private PremiumAttributes__3 premiumAttributes;
    @JsonProperty("CPIPlan")
    private List<CPIPlan> cPIPlan = new ArrayList<CPIPlan>();
    @JsonProperty("CPetPIDiscount")
    private List<CPetPIDiscount> cPetPIDiscount = new ArrayList<CPetPIDiscount>();
    @JsonProperty("PetRating")
    private List<PetRating> petRating = new ArrayList<PetRating>();
    @JsonProperty("COVERWELLNESS")
    private List<Coverwellness> coverwellness = new ArrayList<Coverwellness>();
    @JsonProperty("PetOptCov")
    private List<PetOptCov> petOptCov = new ArrayList<PetOptCov>();
    @JsonProperty("savingsByDiscPet")
    private List<SavingsByDiscPet> savingsByDiscPet = new ArrayList<SavingsByDiscPet>();
    @JsonProperty("DiscountOffset")
    private List<DiscountOffset> discountOffset = new ArrayList<DiscountOffset>();
    @JsonProperty("DiscountPerCoverage")
    private List<DiscountPerCoverage> discountPerCoverage = new ArrayList<DiscountPerCoverage>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CAge")
    public String getCAge() {
        return cAge;
    }

    @JsonProperty("CAge")
    public void setCAge(String cAge) {
        this.cAge = cAge;
    }

    public PetInsurancePet withCAge(String cAge) {
        this.cAge = cAge;
        return this;
    }

    @JsonProperty("CBreed")
    public String getCBreed() {
        return cBreed;
    }

    @JsonProperty("CBreed")
    public void setCBreed(String cBreed) {
        this.cBreed = cBreed;
    }

    public PetInsurancePet withCBreed(String cBreed) {
        this.cBreed = cBreed;
        return this;
    }

    @JsonProperty("CBreedGroup")
    public String getCBreedGroup() {
        return cBreedGroup;
    }

    @JsonProperty("CBreedGroup")
    public void setCBreedGroup(String cBreedGroup) {
        this.cBreedGroup = cBreedGroup;
    }

    public PetInsurancePet withCBreedGroup(String cBreedGroup) {
        this.cBreedGroup = cBreedGroup;
        return this;
    }

    @JsonProperty("CDispPetName")
    public String getCDispPetName() {
        return cDispPetName;
    }

    @JsonProperty("CDispPetName")
    public void setCDispPetName(String cDispPetName) {
        this.cDispPetName = cDispPetName;
    }

    public PetInsurancePet withCDispPetName(String cDispPetName) {
        this.cDispPetName = cDispPetName;
        return this;
    }

    @JsonProperty("CExpectedLife")
    public String getCExpectedLife() {
        return cExpectedLife;
    }

    @JsonProperty("CExpectedLife")
    public void setCExpectedLife(String cExpectedLife) {
        this.cExpectedLife = cExpectedLife;
    }

    public PetInsurancePet withCExpectedLife(String cExpectedLife) {
        this.cExpectedLife = cExpectedLife;
        return this;
    }

    @JsonProperty("CFiveDigitZip")
    public String getCFiveDigitZip() {
        return cFiveDigitZip;
    }

    @JsonProperty("CFiveDigitZip")
    public void setCFiveDigitZip(String cFiveDigitZip) {
        this.cFiveDigitZip = cFiveDigitZip;
    }

    public PetInsurancePet withCFiveDigitZip(String cFiveDigitZip) {
        this.cFiveDigitZip = cFiveDigitZip;
        return this;
    }

    @JsonProperty("CGender")
    public String getCGender() {
        return cGender;
    }

    @JsonProperty("CGender")
    public void setCGender(String cGender) {
        this.cGender = cGender;
    }

    public PetInsurancePet withCGender(String cGender) {
        this.cGender = cGender;
        return this;
    }

    @JsonProperty("CHasPetYN")
    public String getCHasPetYN() {
        return cHasPetYN;
    }

    @JsonProperty("CHasPetYN")
    public void setCHasPetYN(String cHasPetYN) {
        this.cHasPetYN = cHasPetYN;
    }

    public PetInsurancePet withCHasPetYN(String cHasPetYN) {
        this.cHasPetYN = cHasPetYN;
        return this;
    }

    @JsonProperty("CName")
    public String getCName() {
        return cName;
    }

    @JsonProperty("CName")
    public void setCName(String cName) {
        this.cName = cName;
    }

    public PetInsurancePet withCName(String cName) {
        this.cName = cName;
        return this;
    }

    @JsonProperty("CPet")
    public String getCPet() {
        return cPet;
    }

    @JsonProperty("CPet")
    public void setCPet(String cPet) {
        this.cPet = cPet;
    }

    public PetInsurancePet withCPet(String cPet) {
        this.cPet = cPet;
        return this;
    }

    @JsonProperty("CPetNumber")
    public String getCPetNumber() {
        return cPetNumber;
    }

    @JsonProperty("CPetNumber")
    public void setCPetNumber(String cPetNumber) {
        this.cPetNumber = cPetNumber;
    }

    public PetInsurancePet withCPetNumber(String cPetNumber) {
        this.cPetNumber = cPetNumber;
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

    public PetInsurancePet withCPetTransEffectDt(String cPetTransEffectDt) {
        this.cPetTransEffectDt = cPetTransEffectDt;
        return this;
    }

    @JsonProperty("CPetType")
    public String getCPetType() {
        return cPetType;
    }

    @JsonProperty("CPetType")
    public void setCPetType(String cPetType) {
        this.cPetType = cPetType;
    }

    public PetInsurancePet withCPetType(String cPetType) {
        this.cPetType = cPetType;
        return this;
    }

    @JsonProperty("CPrimaryState")
    public String getCPrimaryState() {
        return cPrimaryState;
    }

    @JsonProperty("CPrimaryState")
    public void setCPrimaryState(String cPrimaryState) {
        this.cPrimaryState = cPrimaryState;
    }

    public PetInsurancePet withCPrimaryState(String cPrimaryState) {
        this.cPrimaryState = cPrimaryState;
        return this;
    }

    @JsonProperty("CSpecies")
    public String getCSpecies() {
        return cSpecies;
    }

    @JsonProperty("CSpecies")
    public void setCSpecies(String cSpecies) {
        this.cSpecies = cSpecies;
    }

    public PetInsurancePet withCSpecies(String cSpecies) {
        this.cSpecies = cSpecies;
        return this;
    }

    @JsonProperty("CThreeDigitZip")
    public String getCThreeDigitZip() {
        return cThreeDigitZip;
    }

    @JsonProperty("CThreeDigitZip")
    public void setCThreeDigitZip(String cThreeDigitZip) {
        this.cThreeDigitZip = cThreeDigitZip;
    }

    public PetInsurancePet withCThreeDigitZip(String cThreeDigitZip) {
        this.cThreeDigitZip = cThreeDigitZip;
        return this;
    }

    @JsonProperty("CWellness")
    public String getCWellness() {
        return cWellness;
    }

    @JsonProperty("CWellness")
    public void setCWellness(String cWellness) {
        this.cWellness = cWellness;
    }

    public PetInsurancePet withCWellness(String cWellness) {
        this.cWellness = cWellness;
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

    public PetInsurancePet withEntityReference(String entityReference) {
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

    public PetInsurancePet withEntityStatus(String entityStatus) {
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

    public PetInsurancePet withEntityType(String entityType) {
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

    public PetInsurancePet withIsCovManuallyRated(String isCovManuallyRated) {
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

    public PetInsurancePet withLobCode(String lobCode) {
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

    public PetInsurancePet withProductCode(String productCode) {
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

    public PetInsurancePet withRiskState(String riskState) {
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

    public PetInsurancePet withRiskStateStatCode(String riskStateStatCode) {
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

    public PetInsurancePet withWaivedPremium(String waivedPremium) {
        this.waivedPremium = waivedPremium;
        return this;
    }

    @JsonProperty("PremiumAttributes")
    public PremiumAttributes__3 getPremiumAttributes() {
        return premiumAttributes;
    }

    @JsonProperty("PremiumAttributes")
    public void setPremiumAttributes(PremiumAttributes__3 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
    }

    public PetInsurancePet withPremiumAttributes(PremiumAttributes__3 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
        return this;
    }

    @JsonProperty("CPIPlan")
    public List<CPIPlan> getCPIPlan() {
        return cPIPlan;
    }

    @JsonProperty("CPIPlan")
    public void setCPIPlan(List<CPIPlan> cPIPlan) {
        this.cPIPlan = cPIPlan;
    }

    public PetInsurancePet withCPIPlan(List<CPIPlan> cPIPlan) {
        this.cPIPlan = cPIPlan;
        return this;
    }

    @JsonProperty("CPetPIDiscount")
    public List<CPetPIDiscount> getCPetPIDiscount() {
        return cPetPIDiscount;
    }

    @JsonProperty("CPetPIDiscount")
    public void setCPetPIDiscount(List<CPetPIDiscount> cPetPIDiscount) {
        this.cPetPIDiscount = cPetPIDiscount;
    }

    public PetInsurancePet withCPetPIDiscount(List<CPetPIDiscount> cPetPIDiscount) {
        this.cPetPIDiscount = cPetPIDiscount;
        return this;
    }

    @JsonProperty("PetRating")
    public List<PetRating> getPetRating() {
        return petRating;
    }

    @JsonProperty("PetRating")
    public void setPetRating(List<PetRating> petRating) {
        this.petRating = petRating;
    }

    public PetInsurancePet withPetRating(List<PetRating> petRating) {
        this.petRating = petRating;
        return this;
    }

    @JsonProperty("COVERWELLNESS")
    public List<Coverwellness> getCoverwellness() {
        return coverwellness;
    }

    @JsonProperty("COVERWELLNESS")
    public void setCoverwellness(List<Coverwellness> coverwellness) {
        this.coverwellness = coverwellness;
    }

    public PetInsurancePet withCoverwellness(List<Coverwellness> coverwellness) {
        this.coverwellness = coverwellness;
        return this;
    }

    @JsonProperty("PetOptCov")
    public List<PetOptCov> getPetOptCov() {
        return petOptCov;
    }

    @JsonProperty("PetOptCov")
    public void setPetOptCov(List<PetOptCov> petOptCov) {
        this.petOptCov = petOptCov;
    }

    public PetInsurancePet withPetOptCov(List<PetOptCov> petOptCov) {
        this.petOptCov = petOptCov;
        return this;
    }

    @JsonProperty("savingsByDiscPet")
    public List<SavingsByDiscPet> getSavingsByDiscPet() {
        return savingsByDiscPet;
    }

    @JsonProperty("savingsByDiscPet")
    public void setSavingsByDiscPet(List<SavingsByDiscPet> savingsByDiscPet) {
        this.savingsByDiscPet = savingsByDiscPet;
    }

    public PetInsurancePet withSavingsByDiscPet(List<SavingsByDiscPet> savingsByDiscPet) {
        this.savingsByDiscPet = savingsByDiscPet;
        return this;
    }

    @JsonProperty("DiscountOffset")
    public List<DiscountOffset> getDiscountOffset() {
        return discountOffset;
    }

    @JsonProperty("DiscountOffset")
    public void setDiscountOffset(List<DiscountOffset> discountOffset) {
        this.discountOffset = discountOffset;
    }

    public PetInsurancePet withDiscountOffset(List<DiscountOffset> discountOffset) {
        this.discountOffset = discountOffset;
        return this;
    }

    @JsonProperty("DiscountPerCoverage")
    public List<DiscountPerCoverage> getDiscountPerCoverage() {
        return discountPerCoverage;
    }

    @JsonProperty("DiscountPerCoverage")
    public void setDiscountPerCoverage(List<DiscountPerCoverage> discountPerCoverage) {
        this.discountPerCoverage = discountPerCoverage;
    }

    public PetInsurancePet withDiscountPerCoverage(List<DiscountPerCoverage> discountPerCoverage) {
        this.discountPerCoverage = discountPerCoverage;
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

    public PetInsurancePet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PetInsurancePet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cAge");
        sb.append('=');
        sb.append(((this.cAge == null)?"<null>":this.cAge));
        sb.append(',');
        sb.append("cBreed");
        sb.append('=');
        sb.append(((this.cBreed == null)?"<null>":this.cBreed));
        sb.append(',');
        sb.append("cBreedGroup");
        sb.append('=');
        sb.append(((this.cBreedGroup == null)?"<null>":this.cBreedGroup));
        sb.append(',');
        sb.append("cDispPetName");
        sb.append('=');
        sb.append(((this.cDispPetName == null)?"<null>":this.cDispPetName));
        sb.append(',');
        sb.append("cExpectedLife");
        sb.append('=');
        sb.append(((this.cExpectedLife == null)?"<null>":this.cExpectedLife));
        sb.append(',');
        sb.append("cFiveDigitZip");
        sb.append('=');
        sb.append(((this.cFiveDigitZip == null)?"<null>":this.cFiveDigitZip));
        sb.append(',');
        sb.append("cGender");
        sb.append('=');
        sb.append(((this.cGender == null)?"<null>":this.cGender));
        sb.append(',');
        sb.append("cHasPetYN");
        sb.append('=');
        sb.append(((this.cHasPetYN == null)?"<null>":this.cHasPetYN));
        sb.append(',');
        sb.append("cName");
        sb.append('=');
        sb.append(((this.cName == null)?"<null>":this.cName));
        sb.append(',');
        sb.append("cPet");
        sb.append('=');
        sb.append(((this.cPet == null)?"<null>":this.cPet));
        sb.append(',');
        sb.append("cPetNumber");
        sb.append('=');
        sb.append(((this.cPetNumber == null)?"<null>":this.cPetNumber));
        sb.append(',');
        sb.append("cPetTransEffectDt");
        sb.append('=');
        sb.append(((this.cPetTransEffectDt == null)?"<null>":this.cPetTransEffectDt));
        sb.append(',');
        sb.append("cPetType");
        sb.append('=');
        sb.append(((this.cPetType == null)?"<null>":this.cPetType));
        sb.append(',');
        sb.append("cPrimaryState");
        sb.append('=');
        sb.append(((this.cPrimaryState == null)?"<null>":this.cPrimaryState));
        sb.append(',');
        sb.append("cSpecies");
        sb.append('=');
        sb.append(((this.cSpecies == null)?"<null>":this.cSpecies));
        sb.append(',');
        sb.append("cThreeDigitZip");
        sb.append('=');
        sb.append(((this.cThreeDigitZip == null)?"<null>":this.cThreeDigitZip));
        sb.append(',');
        sb.append("cWellness");
        sb.append('=');
        sb.append(((this.cWellness == null)?"<null>":this.cWellness));
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
        sb.append("cPIPlan");
        sb.append('=');
        sb.append(((this.cPIPlan == null)?"<null>":this.cPIPlan));
        sb.append(',');
        sb.append("cPetPIDiscount");
        sb.append('=');
        sb.append(((this.cPetPIDiscount == null)?"<null>":this.cPetPIDiscount));
        sb.append(',');
        sb.append("petRating");
        sb.append('=');
        sb.append(((this.petRating == null)?"<null>":this.petRating));
        sb.append(',');
        sb.append("coverwellness");
        sb.append('=');
        sb.append(((this.coverwellness == null)?"<null>":this.coverwellness));
        sb.append(',');
        sb.append("petOptCov");
        sb.append('=');
        sb.append(((this.petOptCov == null)?"<null>":this.petOptCov));
        sb.append(',');
        sb.append("savingsByDiscPet");
        sb.append('=');
        sb.append(((this.savingsByDiscPet == null)?"<null>":this.savingsByDiscPet));
        sb.append(',');
        sb.append("discountOffset");
        sb.append('=');
        sb.append(((this.discountOffset == null)?"<null>":this.discountOffset));
        sb.append(',');
        sb.append("discountPerCoverage");
        sb.append('=');
        sb.append(((this.discountPerCoverage == null)?"<null>":this.discountPerCoverage));
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
        result = ((result* 31)+((this.cDispPetName == null)? 0 :this.cDispPetName.hashCode()));
        result = ((result* 31)+((this.petRating == null)? 0 :this.petRating.hashCode()));
        result = ((result* 31)+((this.cSpecies == null)? 0 :this.cSpecies.hashCode()));
        result = ((result* 31)+((this.discountPerCoverage == null)? 0 :this.discountPerCoverage.hashCode()));
        result = ((result* 31)+((this.cPet == null)? 0 :this.cPet.hashCode()));
        result = ((result* 31)+((this.cPIPlan == null)? 0 :this.cPIPlan.hashCode()));
        result = ((result* 31)+((this.cPetNumber == null)? 0 :this.cPetNumber.hashCode()));
        result = ((result* 31)+((this.cBreed == null)? 0 :this.cBreed.hashCode()));
        result = ((result* 31)+((this.cName == null)? 0 :this.cName.hashCode()));
        result = ((result* 31)+((this.cPrimaryState == null)? 0 :this.cPrimaryState.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.savingsByDiscPet == null)? 0 :this.savingsByDiscPet.hashCode()));
        result = ((result* 31)+((this.discountOffset == null)? 0 :this.discountOffset.hashCode()));
        result = ((result* 31)+((this.lobCode == null)? 0 :this.lobCode.hashCode()));
        result = ((result* 31)+((this.riskState == null)? 0 :this.riskState.hashCode()));
        result = ((result* 31)+((this.premiumAttributes == null)? 0 :this.premiumAttributes.hashCode()));
        result = ((result* 31)+((this.coverwellness == null)? 0 :this.coverwellness.hashCode()));
        result = ((result* 31)+((this.cPetPIDiscount == null)? 0 :this.cPetPIDiscount.hashCode()));
        result = ((result* 31)+((this.cExpectedLife == null)? 0 :this.cExpectedLife.hashCode()));
        result = ((result* 31)+((this.petOptCov == null)? 0 :this.petOptCov.hashCode()));
        result = ((result* 31)+((this.cHasPetYN == null)? 0 :this.cHasPetYN.hashCode()));
        result = ((result* 31)+((this.cBreedGroup == null)? 0 :this.cBreedGroup.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.isCovManuallyRated == null)? 0 :this.isCovManuallyRated.hashCode()));
        result = ((result* 31)+((this.cWellness == null)? 0 :this.cWellness.hashCode()));
        result = ((result* 31)+((this.cFiveDigitZip == null)? 0 :this.cFiveDigitZip.hashCode()));
        result = ((result* 31)+((this.cPetTransEffectDt == null)? 0 :this.cPetTransEffectDt.hashCode()));
        result = ((result* 31)+((this.waivedPremium == null)? 0 :this.waivedPremium.hashCode()));
        result = ((result* 31)+((this.cThreeDigitZip == null)? 0 :this.cThreeDigitZip.hashCode()));
        result = ((result* 31)+((this.cAge == null)? 0 :this.cAge.hashCode()));
        result = ((result* 31)+((this.productCode == null)? 0 :this.productCode.hashCode()));
        result = ((result* 31)+((this.entityStatus == null)? 0 :this.entityStatus.hashCode()));
        result = ((result* 31)+((this.cGender == null)? 0 :this.cGender.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cPetType == null)? 0 :this.cPetType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PetInsurancePet) == false) {
            return false;
        }
        PetInsurancePet rhs = ((PetInsurancePet) other);
        return (((((((((((((((((((((((((((((((((((((this.riskStateStatCode == rhs.riskStateStatCode)||((this.riskStateStatCode!= null)&&this.riskStateStatCode.equals(rhs.riskStateStatCode)))&&((this.cDispPetName == rhs.cDispPetName)||((this.cDispPetName!= null)&&this.cDispPetName.equals(rhs.cDispPetName))))&&((this.petRating == rhs.petRating)||((this.petRating!= null)&&this.petRating.equals(rhs.petRating))))&&((this.cSpecies == rhs.cSpecies)||((this.cSpecies!= null)&&this.cSpecies.equals(rhs.cSpecies))))&&((this.discountPerCoverage == rhs.discountPerCoverage)||((this.discountPerCoverage!= null)&&this.discountPerCoverage.equals(rhs.discountPerCoverage))))&&((this.cPet == rhs.cPet)||((this.cPet!= null)&&this.cPet.equals(rhs.cPet))))&&((this.cPIPlan == rhs.cPIPlan)||((this.cPIPlan!= null)&&this.cPIPlan.equals(rhs.cPIPlan))))&&((this.cPetNumber == rhs.cPetNumber)||((this.cPetNumber!= null)&&this.cPetNumber.equals(rhs.cPetNumber))))&&((this.cBreed == rhs.cBreed)||((this.cBreed!= null)&&this.cBreed.equals(rhs.cBreed))))&&((this.cName == rhs.cName)||((this.cName!= null)&&this.cName.equals(rhs.cName))))&&((this.cPrimaryState == rhs.cPrimaryState)||((this.cPrimaryState!= null)&&this.cPrimaryState.equals(rhs.cPrimaryState))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.savingsByDiscPet == rhs.savingsByDiscPet)||((this.savingsByDiscPet!= null)&&this.savingsByDiscPet.equals(rhs.savingsByDiscPet))))&&((this.discountOffset == rhs.discountOffset)||((this.discountOffset!= null)&&this.discountOffset.equals(rhs.discountOffset))))&&((this.lobCode == rhs.lobCode)||((this.lobCode!= null)&&this.lobCode.equals(rhs.lobCode))))&&((this.riskState == rhs.riskState)||((this.riskState!= null)&&this.riskState.equals(rhs.riskState))))&&((this.premiumAttributes == rhs.premiumAttributes)||((this.premiumAttributes!= null)&&this.premiumAttributes.equals(rhs.premiumAttributes))))&&((this.coverwellness == rhs.coverwellness)||((this.coverwellness!= null)&&this.coverwellness.equals(rhs.coverwellness))))&&((this.cPetPIDiscount == rhs.cPetPIDiscount)||((this.cPetPIDiscount!= null)&&this.cPetPIDiscount.equals(rhs.cPetPIDiscount))))&&((this.cExpectedLife == rhs.cExpectedLife)||((this.cExpectedLife!= null)&&this.cExpectedLife.equals(rhs.cExpectedLife))))&&((this.petOptCov == rhs.petOptCov)||((this.petOptCov!= null)&&this.petOptCov.equals(rhs.petOptCov))))&&((this.cHasPetYN == rhs.cHasPetYN)||((this.cHasPetYN!= null)&&this.cHasPetYN.equals(rhs.cHasPetYN))))&&((this.cBreedGroup == rhs.cBreedGroup)||((this.cBreedGroup!= null)&&this.cBreedGroup.equals(rhs.cBreedGroup))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.isCovManuallyRated == rhs.isCovManuallyRated)||((this.isCovManuallyRated!= null)&&this.isCovManuallyRated.equals(rhs.isCovManuallyRated))))&&((this.cWellness == rhs.cWellness)||((this.cWellness!= null)&&this.cWellness.equals(rhs.cWellness))))&&((this.cFiveDigitZip == rhs.cFiveDigitZip)||((this.cFiveDigitZip!= null)&&this.cFiveDigitZip.equals(rhs.cFiveDigitZip))))&&((this.cPetTransEffectDt == rhs.cPetTransEffectDt)||((this.cPetTransEffectDt!= null)&&this.cPetTransEffectDt.equals(rhs.cPetTransEffectDt))))&&((this.waivedPremium == rhs.waivedPremium)||((this.waivedPremium!= null)&&this.waivedPremium.equals(rhs.waivedPremium))))&&((this.cThreeDigitZip == rhs.cThreeDigitZip)||((this.cThreeDigitZip!= null)&&this.cThreeDigitZip.equals(rhs.cThreeDigitZip))))&&((this.cAge == rhs.cAge)||((this.cAge!= null)&&this.cAge.equals(rhs.cAge))))&&((this.productCode == rhs.productCode)||((this.productCode!= null)&&this.productCode.equals(rhs.productCode))))&&((this.entityStatus == rhs.entityStatus)||((this.entityStatus!= null)&&this.entityStatus.equals(rhs.entityStatus))))&&((this.cGender == rhs.cGender)||((this.cGender!= null)&&this.cGender.equals(rhs.cGender))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cPetType == rhs.cPetType)||((this.cPetType!= null)&&this.cPetType.equals(rhs.cPetType))));
    }

}
