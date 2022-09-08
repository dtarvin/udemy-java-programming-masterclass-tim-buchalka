
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
    "CEmail",
    "CFirstName",
    "CGender",
    "CInsDob",
    "CLastName",
    "CPhoneNo",
    "EntityReference",
    "EntityType",
    "PolicyPmCAddlInsured",
    "AddIndAddrs"
})
@Generated("jsonschema2pojo")
public class AddInsured {

    @JsonProperty("CEmail")
    private String cEmail;
    @JsonProperty("CFirstName")
    private String cFirstName;
    @JsonProperty("CGender")
    private String cGender;
    @JsonProperty("CInsDob")
    private String cInsDob;
    @JsonProperty("CLastName")
    private String cLastName;
    @JsonProperty("CPhoneNo")
    private String cPhoneNo;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("PolicyPmCAddlInsured")
    private String policyPmCAddlInsured;
    @JsonProperty("AddIndAddrs")
    private List<AddIndAddr> addIndAddrs = new ArrayList<AddIndAddr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CEmail")
    public String getCEmail() {
        return cEmail;
    }

    @JsonProperty("CEmail")
    public void setCEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public AddInsured withCEmail(String cEmail) {
        this.cEmail = cEmail;
        return this;
    }

    @JsonProperty("CFirstName")
    public String getCFirstName() {
        return cFirstName;
    }

    @JsonProperty("CFirstName")
    public void setCFirstName(String cFirstName) {
        this.cFirstName = cFirstName;
    }

    public AddInsured withCFirstName(String cFirstName) {
        this.cFirstName = cFirstName;
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

    public AddInsured withCGender(String cGender) {
        this.cGender = cGender;
        return this;
    }

    @JsonProperty("CInsDob")
    public String getCInsDob() {
        return cInsDob;
    }

    @JsonProperty("CInsDob")
    public void setCInsDob(String cInsDob) {
        this.cInsDob = cInsDob;
    }

    public AddInsured withCInsDob(String cInsDob) {
        this.cInsDob = cInsDob;
        return this;
    }

    @JsonProperty("CLastName")
    public String getCLastName() {
        return cLastName;
    }

    @JsonProperty("CLastName")
    public void setCLastName(String cLastName) {
        this.cLastName = cLastName;
    }

    public AddInsured withCLastName(String cLastName) {
        this.cLastName = cLastName;
        return this;
    }

    @JsonProperty("CPhoneNo")
    public String getCPhoneNo() {
        return cPhoneNo;
    }

    @JsonProperty("CPhoneNo")
    public void setCPhoneNo(String cPhoneNo) {
        this.cPhoneNo = cPhoneNo;
    }

    public AddInsured withCPhoneNo(String cPhoneNo) {
        this.cPhoneNo = cPhoneNo;
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

    public AddInsured withEntityReference(String entityReference) {
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

    public AddInsured withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("PolicyPmCAddlInsured")
    public String getPolicyPmCAddlInsured() {
        return policyPmCAddlInsured;
    }

    @JsonProperty("PolicyPmCAddlInsured")
    public void setPolicyPmCAddlInsured(String policyPmCAddlInsured) {
        this.policyPmCAddlInsured = policyPmCAddlInsured;
    }

    public AddInsured withPolicyPmCAddlInsured(String policyPmCAddlInsured) {
        this.policyPmCAddlInsured = policyPmCAddlInsured;
        return this;
    }

    @JsonProperty("AddIndAddrs")
    public List<AddIndAddr> getAddIndAddrs() {
        return addIndAddrs;
    }

    @JsonProperty("AddIndAddrs")
    public void setAddIndAddrs(List<AddIndAddr> addIndAddrs) {
        this.addIndAddrs = addIndAddrs;
    }

    public AddInsured withAddIndAddrs(List<AddIndAddr> addIndAddrs) {
        this.addIndAddrs = addIndAddrs;
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

    public AddInsured withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddInsured.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cEmail");
        sb.append('=');
        sb.append(((this.cEmail == null)?"<null>":this.cEmail));
        sb.append(',');
        sb.append("cFirstName");
        sb.append('=');
        sb.append(((this.cFirstName == null)?"<null>":this.cFirstName));
        sb.append(',');
        sb.append("cGender");
        sb.append('=');
        sb.append(((this.cGender == null)?"<null>":this.cGender));
        sb.append(',');
        sb.append("cInsDob");
        sb.append('=');
        sb.append(((this.cInsDob == null)?"<null>":this.cInsDob));
        sb.append(',');
        sb.append("cLastName");
        sb.append('=');
        sb.append(((this.cLastName == null)?"<null>":this.cLastName));
        sb.append(',');
        sb.append("cPhoneNo");
        sb.append('=');
        sb.append(((this.cPhoneNo == null)?"<null>":this.cPhoneNo));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("policyPmCAddlInsured");
        sb.append('=');
        sb.append(((this.policyPmCAddlInsured == null)?"<null>":this.policyPmCAddlInsured));
        sb.append(',');
        sb.append("addIndAddrs");
        sb.append('=');
        sb.append(((this.addIndAddrs == null)?"<null>":this.addIndAddrs));
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
        result = ((result* 31)+((this.cInsDob == null)? 0 :this.cInsDob.hashCode()));
        result = ((result* 31)+((this.cPhoneNo == null)? 0 :this.cPhoneNo.hashCode()));
        result = ((result* 31)+((this.cLastName == null)? 0 :this.cLastName.hashCode()));
        result = ((result* 31)+((this.policyPmCAddlInsured == null)? 0 :this.policyPmCAddlInsured.hashCode()));
        result = ((result* 31)+((this.cEmail == null)? 0 :this.cEmail.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.cGender == null)? 0 :this.cGender.hashCode()));
        result = ((result* 31)+((this.addIndAddrs == null)? 0 :this.addIndAddrs.hashCode()));
        result = ((result* 31)+((this.cFirstName == null)? 0 :this.cFirstName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddInsured) == false) {
            return false;
        }
        AddInsured rhs = ((AddInsured) other);
        return ((((((((((((this.cInsDob == rhs.cInsDob)||((this.cInsDob!= null)&&this.cInsDob.equals(rhs.cInsDob)))&&((this.cPhoneNo == rhs.cPhoneNo)||((this.cPhoneNo!= null)&&this.cPhoneNo.equals(rhs.cPhoneNo))))&&((this.cLastName == rhs.cLastName)||((this.cLastName!= null)&&this.cLastName.equals(rhs.cLastName))))&&((this.policyPmCAddlInsured == rhs.policyPmCAddlInsured)||((this.policyPmCAddlInsured!= null)&&this.policyPmCAddlInsured.equals(rhs.policyPmCAddlInsured))))&&((this.cEmail == rhs.cEmail)||((this.cEmail!= null)&&this.cEmail.equals(rhs.cEmail))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.cGender == rhs.cGender)||((this.cGender!= null)&&this.cGender.equals(rhs.cGender))))&&((this.addIndAddrs == rhs.addIndAddrs)||((this.addIndAddrs!= null)&&this.addIndAddrs.equals(rhs.addIndAddrs))))&&((this.cFirstName == rhs.cFirstName)||((this.cFirstName!= null)&&this.cFirstName.equals(rhs.cFirstName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
