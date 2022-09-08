
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
    "CDiscountPerCoverage",
    "EntityReference",
    "EntityType",
    "IsCovManuallyRated",
    "LobCode",
    "ProductCode",
    "RiskState",
    "RiskStateStatCode",
    "WaivedPremium",
    "PremiumAttributes",
    "PetDiscountCoverage",
    "DiscountCoverageRating"
})
@Generated("jsonschema2pojo")
public class DiscountPerCoverage {

    @JsonProperty("CDiscountPerCoverage")
    private String cDiscountPerCoverage;
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
    private PremiumAttributes__11 premiumAttributes;
    @JsonProperty("PetDiscountCoverage")
    private List<PetDiscountCoverage> petDiscountCoverage = new ArrayList<PetDiscountCoverage>();
    @JsonProperty("DiscountCoverageRating")
    private List<DiscountCoverageRating> discountCoverageRating = new ArrayList<DiscountCoverageRating>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CDiscountPerCoverage")
    public String getCDiscountPerCoverage() {
        return cDiscountPerCoverage;
    }

    @JsonProperty("CDiscountPerCoverage")
    public void setCDiscountPerCoverage(String cDiscountPerCoverage) {
        this.cDiscountPerCoverage = cDiscountPerCoverage;
    }

    public DiscountPerCoverage withCDiscountPerCoverage(String cDiscountPerCoverage) {
        this.cDiscountPerCoverage = cDiscountPerCoverage;
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

    public DiscountPerCoverage withEntityReference(String entityReference) {
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

    public DiscountPerCoverage withEntityType(String entityType) {
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

    public DiscountPerCoverage withIsCovManuallyRated(String isCovManuallyRated) {
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

    public DiscountPerCoverage withLobCode(String lobCode) {
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

    public DiscountPerCoverage withProductCode(String productCode) {
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

    public DiscountPerCoverage withRiskState(String riskState) {
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

    public DiscountPerCoverage withRiskStateStatCode(String riskStateStatCode) {
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

    public DiscountPerCoverage withWaivedPremium(String waivedPremium) {
        this.waivedPremium = waivedPremium;
        return this;
    }

    @JsonProperty("PremiumAttributes")
    public PremiumAttributes__11 getPremiumAttributes() {
        return premiumAttributes;
    }

    @JsonProperty("PremiumAttributes")
    public void setPremiumAttributes(PremiumAttributes__11 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
    }

    public DiscountPerCoverage withPremiumAttributes(PremiumAttributes__11 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
        return this;
    }

    @JsonProperty("PetDiscountCoverage")
    public List<PetDiscountCoverage> getPetDiscountCoverage() {
        return petDiscountCoverage;
    }

    @JsonProperty("PetDiscountCoverage")
    public void setPetDiscountCoverage(List<PetDiscountCoverage> petDiscountCoverage) {
        this.petDiscountCoverage = petDiscountCoverage;
    }

    public DiscountPerCoverage withPetDiscountCoverage(List<PetDiscountCoverage> petDiscountCoverage) {
        this.petDiscountCoverage = petDiscountCoverage;
        return this;
    }

    @JsonProperty("DiscountCoverageRating")
    public List<DiscountCoverageRating> getDiscountCoverageRating() {
        return discountCoverageRating;
    }

    @JsonProperty("DiscountCoverageRating")
    public void setDiscountCoverageRating(List<DiscountCoverageRating> discountCoverageRating) {
        this.discountCoverageRating = discountCoverageRating;
    }

    public DiscountPerCoverage withDiscountCoverageRating(List<DiscountCoverageRating> discountCoverageRating) {
        this.discountCoverageRating = discountCoverageRating;
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

    public DiscountPerCoverage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DiscountPerCoverage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cDiscountPerCoverage");
        sb.append('=');
        sb.append(((this.cDiscountPerCoverage == null)?"<null>":this.cDiscountPerCoverage));
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
        sb.append("petDiscountCoverage");
        sb.append('=');
        sb.append(((this.petDiscountCoverage == null)?"<null>":this.petDiscountCoverage));
        sb.append(',');
        sb.append("discountCoverageRating");
        sb.append('=');
        sb.append(((this.discountCoverageRating == null)?"<null>":this.discountCoverageRating));
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
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.isCovManuallyRated == null)? 0 :this.isCovManuallyRated.hashCode()));
        result = ((result* 31)+((this.waivedPremium == null)? 0 :this.waivedPremium.hashCode()));
        result = ((result* 31)+((this.productCode == null)? 0 :this.productCode.hashCode()));
        result = ((result* 31)+((this.petDiscountCoverage == null)? 0 :this.petDiscountCoverage.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.discountCoverageRating == null)? 0 :this.discountCoverageRating.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lobCode == null)? 0 :this.lobCode.hashCode()));
        result = ((result* 31)+((this.riskState == null)? 0 :this.riskState.hashCode()));
        result = ((result* 31)+((this.premiumAttributes == null)? 0 :this.premiumAttributes.hashCode()));
        result = ((result* 31)+((this.cDiscountPerCoverage == null)? 0 :this.cDiscountPerCoverage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscountPerCoverage) == false) {
            return false;
        }
        DiscountPerCoverage rhs = ((DiscountPerCoverage) other);
        return ((((((((((((((this.riskStateStatCode == rhs.riskStateStatCode)||((this.riskStateStatCode!= null)&&this.riskStateStatCode.equals(rhs.riskStateStatCode)))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.isCovManuallyRated == rhs.isCovManuallyRated)||((this.isCovManuallyRated!= null)&&this.isCovManuallyRated.equals(rhs.isCovManuallyRated))))&&((this.waivedPremium == rhs.waivedPremium)||((this.waivedPremium!= null)&&this.waivedPremium.equals(rhs.waivedPremium))))&&((this.productCode == rhs.productCode)||((this.productCode!= null)&&this.productCode.equals(rhs.productCode))))&&((this.petDiscountCoverage == rhs.petDiscountCoverage)||((this.petDiscountCoverage!= null)&&this.petDiscountCoverage.equals(rhs.petDiscountCoverage))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.discountCoverageRating == rhs.discountCoverageRating)||((this.discountCoverageRating!= null)&&this.discountCoverageRating.equals(rhs.discountCoverageRating))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lobCode == rhs.lobCode)||((this.lobCode!= null)&&this.lobCode.equals(rhs.lobCode))))&&((this.riskState == rhs.riskState)||((this.riskState!= null)&&this.riskState.equals(rhs.riskState))))&&((this.premiumAttributes == rhs.premiumAttributes)||((this.premiumAttributes!= null)&&this.premiumAttributes.equals(rhs.premiumAttributes))))&&((this.cDiscountPerCoverage == rhs.cDiscountPerCoverage)||((this.cDiscountPerCoverage!= null)&&this.cDiscountPerCoverage.equals(rhs.cDiscountPerCoverage))));
    }

}
