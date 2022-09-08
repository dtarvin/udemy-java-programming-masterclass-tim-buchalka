
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
    "CAddiDiscount",
    "CMaxDiscount",
    "CPetDiscount",
    "CPetPiDiscount",
    "CPolicyDiscount",
    "CTotalDiscount",
    "EntityReference",
    "EntityType",
    "CDiScountTab"
})
@Generated("jsonschema2pojo")
public class CPetPIDiscount {

    @JsonProperty("CAddiDiscount")
    private String cAddiDiscount;
    @JsonProperty("CMaxDiscount")
    private String cMaxDiscount;
    @JsonProperty("CPetDiscount")
    private String cPetDiscount;
    @JsonProperty("CPetPiDiscount")
    private String cPetPiDiscount;
    @JsonProperty("CPolicyDiscount")
    private String cPolicyDiscount;
    @JsonProperty("CTotalDiscount")
    private String cTotalDiscount;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("CDiScountTab")
    private List<CDiScountTab> cDiScountTab = new ArrayList<CDiScountTab>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CAddiDiscount")
    public String getCAddiDiscount() {
        return cAddiDiscount;
    }

    @JsonProperty("CAddiDiscount")
    public void setCAddiDiscount(String cAddiDiscount) {
        this.cAddiDiscount = cAddiDiscount;
    }

    public CPetPIDiscount withCAddiDiscount(String cAddiDiscount) {
        this.cAddiDiscount = cAddiDiscount;
        return this;
    }

    @JsonProperty("CMaxDiscount")
    public String getCMaxDiscount() {
        return cMaxDiscount;
    }

    @JsonProperty("CMaxDiscount")
    public void setCMaxDiscount(String cMaxDiscount) {
        this.cMaxDiscount = cMaxDiscount;
    }

    public CPetPIDiscount withCMaxDiscount(String cMaxDiscount) {
        this.cMaxDiscount = cMaxDiscount;
        return this;
    }

    @JsonProperty("CPetDiscount")
    public String getCPetDiscount() {
        return cPetDiscount;
    }

    @JsonProperty("CPetDiscount")
    public void setCPetDiscount(String cPetDiscount) {
        this.cPetDiscount = cPetDiscount;
    }

    public CPetPIDiscount withCPetDiscount(String cPetDiscount) {
        this.cPetDiscount = cPetDiscount;
        return this;
    }

    @JsonProperty("CPetPiDiscount")
    public String getCPetPiDiscount() {
        return cPetPiDiscount;
    }

    @JsonProperty("CPetPiDiscount")
    public void setCPetPiDiscount(String cPetPiDiscount) {
        this.cPetPiDiscount = cPetPiDiscount;
    }

    public CPetPIDiscount withCPetPiDiscount(String cPetPiDiscount) {
        this.cPetPiDiscount = cPetPiDiscount;
        return this;
    }

    @JsonProperty("CPolicyDiscount")
    public String getCPolicyDiscount() {
        return cPolicyDiscount;
    }

    @JsonProperty("CPolicyDiscount")
    public void setCPolicyDiscount(String cPolicyDiscount) {
        this.cPolicyDiscount = cPolicyDiscount;
    }

    public CPetPIDiscount withCPolicyDiscount(String cPolicyDiscount) {
        this.cPolicyDiscount = cPolicyDiscount;
        return this;
    }

    @JsonProperty("CTotalDiscount")
    public String getCTotalDiscount() {
        return cTotalDiscount;
    }

    @JsonProperty("CTotalDiscount")
    public void setCTotalDiscount(String cTotalDiscount) {
        this.cTotalDiscount = cTotalDiscount;
    }

    public CPetPIDiscount withCTotalDiscount(String cTotalDiscount) {
        this.cTotalDiscount = cTotalDiscount;
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

    public CPetPIDiscount withEntityReference(String entityReference) {
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

    public CPetPIDiscount withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("CDiScountTab")
    public List<CDiScountTab> getCDiScountTab() {
        return cDiScountTab;
    }

    @JsonProperty("CDiScountTab")
    public void setCDiScountTab(List<CDiScountTab> cDiScountTab) {
        this.cDiScountTab = cDiScountTab;
    }

    public CPetPIDiscount withCDiScountTab(List<CDiScountTab> cDiScountTab) {
        this.cDiScountTab = cDiScountTab;
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

    public CPetPIDiscount withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CPetPIDiscount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cAddiDiscount");
        sb.append('=');
        sb.append(((this.cAddiDiscount == null)?"<null>":this.cAddiDiscount));
        sb.append(',');
        sb.append("cMaxDiscount");
        sb.append('=');
        sb.append(((this.cMaxDiscount == null)?"<null>":this.cMaxDiscount));
        sb.append(',');
        sb.append("cPetDiscount");
        sb.append('=');
        sb.append(((this.cPetDiscount == null)?"<null>":this.cPetDiscount));
        sb.append(',');
        sb.append("cPetPiDiscount");
        sb.append('=');
        sb.append(((this.cPetPiDiscount == null)?"<null>":this.cPetPiDiscount));
        sb.append(',');
        sb.append("cPolicyDiscount");
        sb.append('=');
        sb.append(((this.cPolicyDiscount == null)?"<null>":this.cPolicyDiscount));
        sb.append(',');
        sb.append("cTotalDiscount");
        sb.append('=');
        sb.append(((this.cTotalDiscount == null)?"<null>":this.cTotalDiscount));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("cDiScountTab");
        sb.append('=');
        sb.append(((this.cDiScountTab == null)?"<null>":this.cDiScountTab));
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
        result = ((result* 31)+((this.cTotalDiscount == null)? 0 :this.cTotalDiscount.hashCode()));
        result = ((result* 31)+((this.cPetPiDiscount == null)? 0 :this.cPetPiDiscount.hashCode()));
        result = ((result* 31)+((this.cPetDiscount == null)? 0 :this.cPetDiscount.hashCode()));
        result = ((result* 31)+((this.cMaxDiscount == null)? 0 :this.cMaxDiscount.hashCode()));
        result = ((result* 31)+((this.cDiScountTab == null)? 0 :this.cDiScountTab.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cAddiDiscount == null)? 0 :this.cAddiDiscount.hashCode()));
        result = ((result* 31)+((this.cPolicyDiscount == null)? 0 :this.cPolicyDiscount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CPetPIDiscount) == false) {
            return false;
        }
        CPetPIDiscount rhs = ((CPetPIDiscount) other);
        return (((((((((((this.cTotalDiscount == rhs.cTotalDiscount)||((this.cTotalDiscount!= null)&&this.cTotalDiscount.equals(rhs.cTotalDiscount)))&&((this.cPetPiDiscount == rhs.cPetPiDiscount)||((this.cPetPiDiscount!= null)&&this.cPetPiDiscount.equals(rhs.cPetPiDiscount))))&&((this.cPetDiscount == rhs.cPetDiscount)||((this.cPetDiscount!= null)&&this.cPetDiscount.equals(rhs.cPetDiscount))))&&((this.cMaxDiscount == rhs.cMaxDiscount)||((this.cMaxDiscount!= null)&&this.cMaxDiscount.equals(rhs.cMaxDiscount))))&&((this.cDiScountTab == rhs.cDiScountTab)||((this.cDiScountTab!= null)&&this.cDiScountTab.equals(rhs.cDiScountTab))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cAddiDiscount == rhs.cAddiDiscount)||((this.cAddiDiscount!= null)&&this.cAddiDiscount.equals(rhs.cAddiDiscount))))&&((this.cPolicyDiscount == rhs.cPolicyDiscount)||((this.cPolicyDiscount!= null)&&this.cPolicyDiscount.equals(rhs.cPolicyDiscount))));
    }

}
