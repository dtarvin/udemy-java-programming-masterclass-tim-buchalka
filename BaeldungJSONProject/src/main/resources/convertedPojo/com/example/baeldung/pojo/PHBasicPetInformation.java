
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
    "CAgeNew",
    "CBreed",
    "CBreedGroup",
    "CExpectedLife",
    "CGender",
    "CName",
    "CPetNumber",
    "CPetTransEffDate",
    "CPetType",
    "CPhPetDetId",
    "CSpecies",
    "CTotalAnnualDiscounts",
    "EntityReference",
    "EntityType"
})
@Generated("jsonschema2pojo")
public class PHBasicPetInformation {

    @JsonProperty("CAgeNew")
    private String cAgeNew;
    @JsonProperty("CBreed")
    private String cBreed;
    @JsonProperty("CBreedGroup")
    private String cBreedGroup;
    @JsonProperty("CExpectedLife")
    private String cExpectedLife;
    @JsonProperty("CGender")
    private String cGender;
    @JsonProperty("CName")
    private String cName;
    @JsonProperty("CPetNumber")
    private String cPetNumber;
    @JsonProperty("CPetTransEffDate")
    private String cPetTransEffDate;
    @JsonProperty("CPetType")
    private String cPetType;
    @JsonProperty("CPhPetDetId")
    private String cPhPetDetId;
    @JsonProperty("CSpecies")
    private String cSpecies;
    @JsonProperty("CTotalAnnualDiscounts")
    private String cTotalAnnualDiscounts;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CAgeNew")
    public String getCAgeNew() {
        return cAgeNew;
    }

    @JsonProperty("CAgeNew")
    public void setCAgeNew(String cAgeNew) {
        this.cAgeNew = cAgeNew;
    }

    public PHBasicPetInformation withCAgeNew(String cAgeNew) {
        this.cAgeNew = cAgeNew;
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

    public PHBasicPetInformation withCBreed(String cBreed) {
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

    public PHBasicPetInformation withCBreedGroup(String cBreedGroup) {
        this.cBreedGroup = cBreedGroup;
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

    public PHBasicPetInformation withCExpectedLife(String cExpectedLife) {
        this.cExpectedLife = cExpectedLife;
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

    public PHBasicPetInformation withCGender(String cGender) {
        this.cGender = cGender;
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

    public PHBasicPetInformation withCName(String cName) {
        this.cName = cName;
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

    public PHBasicPetInformation withCPetNumber(String cPetNumber) {
        this.cPetNumber = cPetNumber;
        return this;
    }

    @JsonProperty("CPetTransEffDate")
    public String getCPetTransEffDate() {
        return cPetTransEffDate;
    }

    @JsonProperty("CPetTransEffDate")
    public void setCPetTransEffDate(String cPetTransEffDate) {
        this.cPetTransEffDate = cPetTransEffDate;
    }

    public PHBasicPetInformation withCPetTransEffDate(String cPetTransEffDate) {
        this.cPetTransEffDate = cPetTransEffDate;
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

    public PHBasicPetInformation withCPetType(String cPetType) {
        this.cPetType = cPetType;
        return this;
    }

    @JsonProperty("CPhPetDetId")
    public String getCPhPetDetId() {
        return cPhPetDetId;
    }

    @JsonProperty("CPhPetDetId")
    public void setCPhPetDetId(String cPhPetDetId) {
        this.cPhPetDetId = cPhPetDetId;
    }

    public PHBasicPetInformation withCPhPetDetId(String cPhPetDetId) {
        this.cPhPetDetId = cPhPetDetId;
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

    public PHBasicPetInformation withCSpecies(String cSpecies) {
        this.cSpecies = cSpecies;
        return this;
    }

    @JsonProperty("CTotalAnnualDiscounts")
    public String getCTotalAnnualDiscounts() {
        return cTotalAnnualDiscounts;
    }

    @JsonProperty("CTotalAnnualDiscounts")
    public void setCTotalAnnualDiscounts(String cTotalAnnualDiscounts) {
        this.cTotalAnnualDiscounts = cTotalAnnualDiscounts;
    }

    public PHBasicPetInformation withCTotalAnnualDiscounts(String cTotalAnnualDiscounts) {
        this.cTotalAnnualDiscounts = cTotalAnnualDiscounts;
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

    public PHBasicPetInformation withEntityReference(String entityReference) {
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

    public PHBasicPetInformation withEntityType(String entityType) {
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

    public PHBasicPetInformation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PHBasicPetInformation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cAgeNew");
        sb.append('=');
        sb.append(((this.cAgeNew == null)?"<null>":this.cAgeNew));
        sb.append(',');
        sb.append("cBreed");
        sb.append('=');
        sb.append(((this.cBreed == null)?"<null>":this.cBreed));
        sb.append(',');
        sb.append("cBreedGroup");
        sb.append('=');
        sb.append(((this.cBreedGroup == null)?"<null>":this.cBreedGroup));
        sb.append(',');
        sb.append("cExpectedLife");
        sb.append('=');
        sb.append(((this.cExpectedLife == null)?"<null>":this.cExpectedLife));
        sb.append(',');
        sb.append("cGender");
        sb.append('=');
        sb.append(((this.cGender == null)?"<null>":this.cGender));
        sb.append(',');
        sb.append("cName");
        sb.append('=');
        sb.append(((this.cName == null)?"<null>":this.cName));
        sb.append(',');
        sb.append("cPetNumber");
        sb.append('=');
        sb.append(((this.cPetNumber == null)?"<null>":this.cPetNumber));
        sb.append(',');
        sb.append("cPetTransEffDate");
        sb.append('=');
        sb.append(((this.cPetTransEffDate == null)?"<null>":this.cPetTransEffDate));
        sb.append(',');
        sb.append("cPetType");
        sb.append('=');
        sb.append(((this.cPetType == null)?"<null>":this.cPetType));
        sb.append(',');
        sb.append("cPhPetDetId");
        sb.append('=');
        sb.append(((this.cPhPetDetId == null)?"<null>":this.cPhPetDetId));
        sb.append(',');
        sb.append("cSpecies");
        sb.append('=');
        sb.append(((this.cSpecies == null)?"<null>":this.cSpecies));
        sb.append(',');
        sb.append("cTotalAnnualDiscounts");
        sb.append('=');
        sb.append(((this.cTotalAnnualDiscounts == null)?"<null>":this.cTotalAnnualDiscounts));
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
        result = ((result* 31)+((this.cBreedGroup == null)? 0 :this.cBreedGroup.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.cAgeNew == null)? 0 :this.cAgeNew.hashCode()));
        result = ((result* 31)+((this.cTotalAnnualDiscounts == null)? 0 :this.cTotalAnnualDiscounts.hashCode()));
        result = ((result* 31)+((this.cPhPetDetId == null)? 0 :this.cPhPetDetId.hashCode()));
        result = ((result* 31)+((this.cSpecies == null)? 0 :this.cSpecies.hashCode()));
        result = ((result* 31)+((this.cPetNumber == null)? 0 :this.cPetNumber.hashCode()));
        result = ((result* 31)+((this.cBreed == null)? 0 :this.cBreed.hashCode()));
        result = ((result* 31)+((this.cName == null)? 0 :this.cName.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.cGender == null)? 0 :this.cGender.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cPetType == null)? 0 :this.cPetType.hashCode()));
        result = ((result* 31)+((this.cExpectedLife == null)? 0 :this.cExpectedLife.hashCode()));
        result = ((result* 31)+((this.cPetTransEffDate == null)? 0 :this.cPetTransEffDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PHBasicPetInformation) == false) {
            return false;
        }
        PHBasicPetInformation rhs = ((PHBasicPetInformation) other);
        return ((((((((((((((((this.cBreedGroup == rhs.cBreedGroup)||((this.cBreedGroup!= null)&&this.cBreedGroup.equals(rhs.cBreedGroup)))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.cAgeNew == rhs.cAgeNew)||((this.cAgeNew!= null)&&this.cAgeNew.equals(rhs.cAgeNew))))&&((this.cTotalAnnualDiscounts == rhs.cTotalAnnualDiscounts)||((this.cTotalAnnualDiscounts!= null)&&this.cTotalAnnualDiscounts.equals(rhs.cTotalAnnualDiscounts))))&&((this.cPhPetDetId == rhs.cPhPetDetId)||((this.cPhPetDetId!= null)&&this.cPhPetDetId.equals(rhs.cPhPetDetId))))&&((this.cSpecies == rhs.cSpecies)||((this.cSpecies!= null)&&this.cSpecies.equals(rhs.cSpecies))))&&((this.cPetNumber == rhs.cPetNumber)||((this.cPetNumber!= null)&&this.cPetNumber.equals(rhs.cPetNumber))))&&((this.cBreed == rhs.cBreed)||((this.cBreed!= null)&&this.cBreed.equals(rhs.cBreed))))&&((this.cName == rhs.cName)||((this.cName!= null)&&this.cName.equals(rhs.cName))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.cGender == rhs.cGender)||((this.cGender!= null)&&this.cGender.equals(rhs.cGender))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cPetType == rhs.cPetType)||((this.cPetType!= null)&&this.cPetType.equals(rhs.cPetType))))&&((this.cExpectedLife == rhs.cExpectedLife)||((this.cExpectedLife!= null)&&this.cExpectedLife.equals(rhs.cExpectedLife))))&&((this.cPetTransEffDate == rhs.cPetTransEffDate)||((this.cPetTransEffDate!= null)&&this.cPetTransEffDate.equals(rhs.cPetTransEffDate))));
    }

}
