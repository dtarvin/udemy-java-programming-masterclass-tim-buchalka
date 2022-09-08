
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
    "CDiscountOffset",
    "EntityReference",
    "EntityType",
    "IsCovManuallyRated",
    "LobCode",
    "ProductCode",
    "RiskState",
    "RiskStateStatCode",
    "WaivedPremium",
    "PremiumAttributes",
    "PetDiscountOffset",
    "DiscOffsetCovRating"
})
@Generated("jsonschema2pojo")
public class DiscountOffset {

    @JsonProperty("CDiscountOffset")
    private String cDiscountOffset;
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
    private PremiumAttributes__9 premiumAttributes;
    @JsonProperty("PetDiscountOffset")
    private List<PetDiscountOffset> petDiscountOffset = new ArrayList<PetDiscountOffset>();
    @JsonProperty("DiscOffsetCovRating")
    private List<DiscOffsetCovRating> discOffsetCovRating = new ArrayList<DiscOffsetCovRating>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CDiscountOffset")
    public String getCDiscountOffset() {
        return cDiscountOffset;
    }

    @JsonProperty("CDiscountOffset")
    public void setCDiscountOffset(String cDiscountOffset) {
        this.cDiscountOffset = cDiscountOffset;
    }

    public DiscountOffset withCDiscountOffset(String cDiscountOffset) {
        this.cDiscountOffset = cDiscountOffset;
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

    public DiscountOffset withEntityReference(String entityReference) {
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

    public DiscountOffset withEntityType(String entityType) {
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

    public DiscountOffset withIsCovManuallyRated(String isCovManuallyRated) {
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

    public DiscountOffset withLobCode(String lobCode) {
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

    public DiscountOffset withProductCode(String productCode) {
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

    public DiscountOffset withRiskState(String riskState) {
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

    public DiscountOffset withRiskStateStatCode(String riskStateStatCode) {
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

    public DiscountOffset withWaivedPremium(String waivedPremium) {
        this.waivedPremium = waivedPremium;
        return this;
    }

    @JsonProperty("PremiumAttributes")
    public PremiumAttributes__9 getPremiumAttributes() {
        return premiumAttributes;
    }

    @JsonProperty("PremiumAttributes")
    public void setPremiumAttributes(PremiumAttributes__9 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
    }

    public DiscountOffset withPremiumAttributes(PremiumAttributes__9 premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
        return this;
    }

    @JsonProperty("PetDiscountOffset")
    public List<PetDiscountOffset> getPetDiscountOffset() {
        return petDiscountOffset;
    }

    @JsonProperty("PetDiscountOffset")
    public void setPetDiscountOffset(List<PetDiscountOffset> petDiscountOffset) {
        this.petDiscountOffset = petDiscountOffset;
    }

    public DiscountOffset withPetDiscountOffset(List<PetDiscountOffset> petDiscountOffset) {
        this.petDiscountOffset = petDiscountOffset;
        return this;
    }

    @JsonProperty("DiscOffsetCovRating")
    public List<DiscOffsetCovRating> getDiscOffsetCovRating() {
        return discOffsetCovRating;
    }

    @JsonProperty("DiscOffsetCovRating")
    public void setDiscOffsetCovRating(List<DiscOffsetCovRating> discOffsetCovRating) {
        this.discOffsetCovRating = discOffsetCovRating;
    }

    public DiscountOffset withDiscOffsetCovRating(List<DiscOffsetCovRating> discOffsetCovRating) {
        this.discOffsetCovRating = discOffsetCovRating;
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

    public DiscountOffset withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DiscountOffset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cDiscountOffset");
        sb.append('=');
        sb.append(((this.cDiscountOffset == null)?"<null>":this.cDiscountOffset));
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
        sb.append("petDiscountOffset");
        sb.append('=');
        sb.append(((this.petDiscountOffset == null)?"<null>":this.petDiscountOffset));
        sb.append(',');
        sb.append("discOffsetCovRating");
        sb.append('=');
        sb.append(((this.discOffsetCovRating == null)?"<null>":this.discOffsetCovRating));
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
        result = ((result* 31)+((this.discOffsetCovRating == null)? 0 :this.discOffsetCovRating.hashCode()));
        result = ((result* 31)+((this.petDiscountOffset == null)? 0 :this.petDiscountOffset.hashCode()));
        result = ((result* 31)+((this.waivedPremium == null)? 0 :this.waivedPremium.hashCode()));
        result = ((result* 31)+((this.productCode == null)? 0 :this.productCode.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.cDiscountOffset == null)? 0 :this.cDiscountOffset.hashCode()));
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
        if ((other instanceof DiscountOffset) == false) {
            return false;
        }
        DiscountOffset rhs = ((DiscountOffset) other);
        return ((((((((((((((this.riskStateStatCode == rhs.riskStateStatCode)||((this.riskStateStatCode!= null)&&this.riskStateStatCode.equals(rhs.riskStateStatCode)))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.isCovManuallyRated == rhs.isCovManuallyRated)||((this.isCovManuallyRated!= null)&&this.isCovManuallyRated.equals(rhs.isCovManuallyRated))))&&((this.discOffsetCovRating == rhs.discOffsetCovRating)||((this.discOffsetCovRating!= null)&&this.discOffsetCovRating.equals(rhs.discOffsetCovRating))))&&((this.petDiscountOffset == rhs.petDiscountOffset)||((this.petDiscountOffset!= null)&&this.petDiscountOffset.equals(rhs.petDiscountOffset))))&&((this.waivedPremium == rhs.waivedPremium)||((this.waivedPremium!= null)&&this.waivedPremium.equals(rhs.waivedPremium))))&&((this.productCode == rhs.productCode)||((this.productCode!= null)&&this.productCode.equals(rhs.productCode))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.cDiscountOffset == rhs.cDiscountOffset)||((this.cDiscountOffset!= null)&&this.cDiscountOffset.equals(rhs.cDiscountOffset))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lobCode == rhs.lobCode)||((this.lobCode!= null)&&this.lobCode.equals(rhs.lobCode))))&&((this.riskState == rhs.riskState)||((this.riskState!= null)&&this.riskState.equals(rhs.riskState))))&&((this.premiumAttributes == rhs.premiumAttributes)||((this.premiumAttributes!= null)&&this.premiumAttributes.equals(rhs.premiumAttributes))));
    }

}
