
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
    "AddressType",
    "City",
    "Country",
    "CountryCode",
    "County",
    "CAdditionalInsured",
    "EntityReference",
    "EntityType",
    "IsAuditExpoProrated",
    "Line1",
    "StateCode",
    "StateDesc",
    "SysExposureIsUnits",
    "ZipCode"
})
@Generated("jsonschema2pojo")
public class AddIndAddr {

    @JsonProperty("AddressType")
    private String addressType;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("County")
    private String county;
    @JsonProperty("CAdditionalInsured")
    private String cAdditionalInsured;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("IsAuditExpoProrated")
    private String isAuditExpoProrated;
    @JsonProperty("Line1")
    private String line1;
    @JsonProperty("StateCode")
    private String stateCode;
    @JsonProperty("StateDesc")
    private String stateDesc;
    @JsonProperty("SysExposureIsUnits")
    private String sysExposureIsUnits;
    @JsonProperty("ZipCode")
    private String zipCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AddressType")
    public String getAddressType() {
        return addressType;
    }

    @JsonProperty("AddressType")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public AddIndAddr withAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    public AddIndAddr withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    public AddIndAddr withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public AddIndAddr withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @JsonProperty("County")
    public String getCounty() {
        return county;
    }

    @JsonProperty("County")
    public void setCounty(String county) {
        this.county = county;
    }

    public AddIndAddr withCounty(String county) {
        this.county = county;
        return this;
    }

    @JsonProperty("CAdditionalInsured")
    public String getCAdditionalInsured() {
        return cAdditionalInsured;
    }

    @JsonProperty("CAdditionalInsured")
    public void setCAdditionalInsured(String cAdditionalInsured) {
        this.cAdditionalInsured = cAdditionalInsured;
    }

    public AddIndAddr withCAdditionalInsured(String cAdditionalInsured) {
        this.cAdditionalInsured = cAdditionalInsured;
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

    public AddIndAddr withEntityReference(String entityReference) {
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

    public AddIndAddr withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("IsAuditExpoProrated")
    public String getIsAuditExpoProrated() {
        return isAuditExpoProrated;
    }

    @JsonProperty("IsAuditExpoProrated")
    public void setIsAuditExpoProrated(String isAuditExpoProrated) {
        this.isAuditExpoProrated = isAuditExpoProrated;
    }

    public AddIndAddr withIsAuditExpoProrated(String isAuditExpoProrated) {
        this.isAuditExpoProrated = isAuditExpoProrated;
        return this;
    }

    @JsonProperty("Line1")
    public String getLine1() {
        return line1;
    }

    @JsonProperty("Line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public AddIndAddr withLine1(String line1) {
        this.line1 = line1;
        return this;
    }

    @JsonProperty("StateCode")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("StateCode")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public AddIndAddr withStateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }

    @JsonProperty("StateDesc")
    public String getStateDesc() {
        return stateDesc;
    }

    @JsonProperty("StateDesc")
    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public AddIndAddr withStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
        return this;
    }

    @JsonProperty("SysExposureIsUnits")
    public String getSysExposureIsUnits() {
        return sysExposureIsUnits;
    }

    @JsonProperty("SysExposureIsUnits")
    public void setSysExposureIsUnits(String sysExposureIsUnits) {
        this.sysExposureIsUnits = sysExposureIsUnits;
    }

    public AddIndAddr withSysExposureIsUnits(String sysExposureIsUnits) {
        this.sysExposureIsUnits = sysExposureIsUnits;
        return this;
    }

    @JsonProperty("ZipCode")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("ZipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public AddIndAddr withZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public AddIndAddr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddIndAddr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressType");
        sb.append('=');
        sb.append(((this.addressType == null)?"<null>":this.addressType));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("county");
        sb.append('=');
        sb.append(((this.county == null)?"<null>":this.county));
        sb.append(',');
        sb.append("cAdditionalInsured");
        sb.append('=');
        sb.append(((this.cAdditionalInsured == null)?"<null>":this.cAdditionalInsured));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("isAuditExpoProrated");
        sb.append('=');
        sb.append(((this.isAuditExpoProrated == null)?"<null>":this.isAuditExpoProrated));
        sb.append(',');
        sb.append("line1");
        sb.append('=');
        sb.append(((this.line1 == null)?"<null>":this.line1));
        sb.append(',');
        sb.append("stateCode");
        sb.append('=');
        sb.append(((this.stateCode == null)?"<null>":this.stateCode));
        sb.append(',');
        sb.append("stateDesc");
        sb.append('=');
        sb.append(((this.stateDesc == null)?"<null>":this.stateDesc));
        sb.append(',');
        sb.append("sysExposureIsUnits");
        sb.append('=');
        sb.append(((this.sysExposureIsUnits == null)?"<null>":this.sysExposureIsUnits));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.zipCode == null)? 0 :this.zipCode.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.addressType == null)? 0 :this.addressType.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.stateDesc == null)? 0 :this.stateDesc.hashCode()));
        result = ((result* 31)+((this.county == null)? 0 :this.county.hashCode()));
        result = ((result* 31)+((this.isAuditExpoProrated == null)? 0 :this.isAuditExpoProrated.hashCode()));
        result = ((result* 31)+((this.countryCode == null)? 0 :this.countryCode.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.stateCode == null)? 0 :this.stateCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cAdditionalInsured == null)? 0 :this.cAdditionalInsured.hashCode()));
        result = ((result* 31)+((this.line1 == null)? 0 :this.line1 .hashCode()));
        result = ((result* 31)+((this.sysExposureIsUnits == null)? 0 :this.sysExposureIsUnits.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddIndAddr) == false) {
            return false;
        }
        AddIndAddr rhs = ((AddIndAddr) other);
        return ((((((((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.zipCode == rhs.zipCode)||((this.zipCode!= null)&&this.zipCode.equals(rhs.zipCode))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.addressType == rhs.addressType)||((this.addressType!= null)&&this.addressType.equals(rhs.addressType))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.stateDesc == rhs.stateDesc)||((this.stateDesc!= null)&&this.stateDesc.equals(rhs.stateDesc))))&&((this.county == rhs.county)||((this.county!= null)&&this.county.equals(rhs.county))))&&((this.isAuditExpoProrated == rhs.isAuditExpoProrated)||((this.isAuditExpoProrated!= null)&&this.isAuditExpoProrated.equals(rhs.isAuditExpoProrated))))&&((this.countryCode == rhs.countryCode)||((this.countryCode!= null)&&this.countryCode.equals(rhs.countryCode))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.stateCode == rhs.stateCode)||((this.stateCode!= null)&&this.stateCode.equals(rhs.stateCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cAdditionalInsured == rhs.cAdditionalInsured)||((this.cAdditionalInsured!= null)&&this.cAdditionalInsured.equals(rhs.cAdditionalInsured))))&&((this.line1 == rhs.line1)||((this.line1 != null)&&this.line1 .equals(rhs.line1))))&&((this.sysExposureIsUnits == rhs.sysExposureIsUnits)||((this.sysExposureIsUnits!= null)&&this.sysExposureIsUnits.equals(rhs.sysExposureIsUnits))));
    }

}
