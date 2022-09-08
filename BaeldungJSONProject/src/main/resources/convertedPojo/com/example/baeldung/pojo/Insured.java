
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
    "BusinessName",
    "CopyCustomerDetails",
    "CreateShellAccount",
    "CustomerName",
    "CAddInsured",
    "CEmailNew",
    "CFirstName",
    "CLastName",
    "CPhone",
    "EntityReference",
    "EntityType",
    "FeinPhoneRequired",
    "FirstName",
    "IndRiskSituation",
    "InsuredSearchComplete",
    "InsDob",
    "IsDeregulated",
    "MasterCustomerGid",
    "MasterRecordGid",
    "NameType",
    "NameTypeStatCode",
    "OrderCreditScore",
    "PolicyInsured",
    "QuoteNumber",
    "RcFailureCancel",
    "RetrieveQuoteNumber",
    "StatusUpdMisPolicies",
    "Surname",
    "WrapUpSponsorship",
    "Address",
    "Contact",
    "InsuredBillingInfo"
})
@Generated("jsonschema2pojo")
public class Insured {

    @JsonProperty("BusinessName")
    private String businessName;
    @JsonProperty("CopyCustomerDetails")
    private String copyCustomerDetails;
    @JsonProperty("CreateShellAccount")
    private String createShellAccount;
    @JsonProperty("CustomerName")
    private String customerName;
    @JsonProperty("CAddInsured")
    private String cAddInsured;
    @JsonProperty("CEmailNew")
    private String cEmailNew;
    @JsonProperty("CFirstName")
    private String cFirstName;
    @JsonProperty("CLastName")
    private String cLastName;
    @JsonProperty("CPhone")
    private String cPhone;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("FeinPhoneRequired")
    private String feinPhoneRequired;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("IndRiskSituation")
    private String indRiskSituation;
    @JsonProperty("InsuredSearchComplete")
    private String insuredSearchComplete;
    @JsonProperty("InsDob")
    private String insDob;
    @JsonProperty("IsDeregulated")
    private String isDeregulated;
    @JsonProperty("MasterCustomerGid")
    private String masterCustomerGid;
    @JsonProperty("MasterRecordGid")
    private String masterRecordGid;
    @JsonProperty("NameType")
    private String nameType;
    @JsonProperty("NameTypeStatCode")
    private String nameTypeStatCode;
    @JsonProperty("OrderCreditScore")
    private String orderCreditScore;
    @JsonProperty("PolicyInsured")
    private String policyInsured;
    @JsonProperty("QuoteNumber")
    private String quoteNumber;
    @JsonProperty("RcFailureCancel")
    private String rcFailureCancel;
    @JsonProperty("RetrieveQuoteNumber")
    private String retrieveQuoteNumber;
    @JsonProperty("StatusUpdMisPolicies")
    private String statusUpdMisPolicies;
    @JsonProperty("Surname")
    private String surname;
    @JsonProperty("WrapUpSponsorship")
    private String wrapUpSponsorship;
    @JsonProperty("Address")
    private List<Address> address = new ArrayList<Address>();
    @JsonProperty("Contact")
    private List<Contact> contact = new ArrayList<Contact>();
    @JsonProperty("InsuredBillingInfo")
    private List<InsuredBillingInfo> insuredBillingInfo = new ArrayList<InsuredBillingInfo>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BusinessName")
    public String getBusinessName() {
        return businessName;
    }

    @JsonProperty("BusinessName")
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Insured withBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }

    @JsonProperty("CopyCustomerDetails")
    public String getCopyCustomerDetails() {
        return copyCustomerDetails;
    }

    @JsonProperty("CopyCustomerDetails")
    public void setCopyCustomerDetails(String copyCustomerDetails) {
        this.copyCustomerDetails = copyCustomerDetails;
    }

    public Insured withCopyCustomerDetails(String copyCustomerDetails) {
        this.copyCustomerDetails = copyCustomerDetails;
        return this;
    }

    @JsonProperty("CreateShellAccount")
    public String getCreateShellAccount() {
        return createShellAccount;
    }

    @JsonProperty("CreateShellAccount")
    public void setCreateShellAccount(String createShellAccount) {
        this.createShellAccount = createShellAccount;
    }

    public Insured withCreateShellAccount(String createShellAccount) {
        this.createShellAccount = createShellAccount;
        return this;
    }

    @JsonProperty("CustomerName")
    public String getCustomerName() {
        return customerName;
    }

    @JsonProperty("CustomerName")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Insured withCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    @JsonProperty("CAddInsured")
    public String getCAddInsured() {
        return cAddInsured;
    }

    @JsonProperty("CAddInsured")
    public void setCAddInsured(String cAddInsured) {
        this.cAddInsured = cAddInsured;
    }

    public Insured withCAddInsured(String cAddInsured) {
        this.cAddInsured = cAddInsured;
        return this;
    }

    @JsonProperty("CEmailNew")
    public String getCEmailNew() {
        return cEmailNew;
    }

    @JsonProperty("CEmailNew")
    public void setCEmailNew(String cEmailNew) {
        this.cEmailNew = cEmailNew;
    }

    public Insured withCEmailNew(String cEmailNew) {
        this.cEmailNew = cEmailNew;
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

    public Insured withCFirstName(String cFirstName) {
        this.cFirstName = cFirstName;
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

    public Insured withCLastName(String cLastName) {
        this.cLastName = cLastName;
        return this;
    }

    @JsonProperty("CPhone")
    public String getCPhone() {
        return cPhone;
    }

    @JsonProperty("CPhone")
    public void setCPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public Insured withCPhone(String cPhone) {
        this.cPhone = cPhone;
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

    public Insured withEntityReference(String entityReference) {
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

    public Insured withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("FeinPhoneRequired")
    public String getFeinPhoneRequired() {
        return feinPhoneRequired;
    }

    @JsonProperty("FeinPhoneRequired")
    public void setFeinPhoneRequired(String feinPhoneRequired) {
        this.feinPhoneRequired = feinPhoneRequired;
    }

    public Insured withFeinPhoneRequired(String feinPhoneRequired) {
        this.feinPhoneRequired = feinPhoneRequired;
        return this;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Insured withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("IndRiskSituation")
    public String getIndRiskSituation() {
        return indRiskSituation;
    }

    @JsonProperty("IndRiskSituation")
    public void setIndRiskSituation(String indRiskSituation) {
        this.indRiskSituation = indRiskSituation;
    }

    public Insured withIndRiskSituation(String indRiskSituation) {
        this.indRiskSituation = indRiskSituation;
        return this;
    }

    @JsonProperty("InsuredSearchComplete")
    public String getInsuredSearchComplete() {
        return insuredSearchComplete;
    }

    @JsonProperty("InsuredSearchComplete")
    public void setInsuredSearchComplete(String insuredSearchComplete) {
        this.insuredSearchComplete = insuredSearchComplete;
    }

    public Insured withInsuredSearchComplete(String insuredSearchComplete) {
        this.insuredSearchComplete = insuredSearchComplete;
        return this;
    }

    @JsonProperty("InsDob")
    public String getInsDob() {
        return insDob;
    }

    @JsonProperty("InsDob")
    public void setInsDob(String insDob) {
        this.insDob = insDob;
    }

    public Insured withInsDob(String insDob) {
        this.insDob = insDob;
        return this;
    }

    @JsonProperty("IsDeregulated")
    public String getIsDeregulated() {
        return isDeregulated;
    }

    @JsonProperty("IsDeregulated")
    public void setIsDeregulated(String isDeregulated) {
        this.isDeregulated = isDeregulated;
    }

    public Insured withIsDeregulated(String isDeregulated) {
        this.isDeregulated = isDeregulated;
        return this;
    }

    @JsonProperty("MasterCustomerGid")
    public String getMasterCustomerGid() {
        return masterCustomerGid;
    }

    @JsonProperty("MasterCustomerGid")
    public void setMasterCustomerGid(String masterCustomerGid) {
        this.masterCustomerGid = masterCustomerGid;
    }

    public Insured withMasterCustomerGid(String masterCustomerGid) {
        this.masterCustomerGid = masterCustomerGid;
        return this;
    }

    @JsonProperty("MasterRecordGid")
    public String getMasterRecordGid() {
        return masterRecordGid;
    }

    @JsonProperty("MasterRecordGid")
    public void setMasterRecordGid(String masterRecordGid) {
        this.masterRecordGid = masterRecordGid;
    }

    public Insured withMasterRecordGid(String masterRecordGid) {
        this.masterRecordGid = masterRecordGid;
        return this;
    }

    @JsonProperty("NameType")
    public String getNameType() {
        return nameType;
    }

    @JsonProperty("NameType")
    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public Insured withNameType(String nameType) {
        this.nameType = nameType;
        return this;
    }

    @JsonProperty("NameTypeStatCode")
    public String getNameTypeStatCode() {
        return nameTypeStatCode;
    }

    @JsonProperty("NameTypeStatCode")
    public void setNameTypeStatCode(String nameTypeStatCode) {
        this.nameTypeStatCode = nameTypeStatCode;
    }

    public Insured withNameTypeStatCode(String nameTypeStatCode) {
        this.nameTypeStatCode = nameTypeStatCode;
        return this;
    }

    @JsonProperty("OrderCreditScore")
    public String getOrderCreditScore() {
        return orderCreditScore;
    }

    @JsonProperty("OrderCreditScore")
    public void setOrderCreditScore(String orderCreditScore) {
        this.orderCreditScore = orderCreditScore;
    }

    public Insured withOrderCreditScore(String orderCreditScore) {
        this.orderCreditScore = orderCreditScore;
        return this;
    }

    @JsonProperty("PolicyInsured")
    public String getPolicyInsured() {
        return policyInsured;
    }

    @JsonProperty("PolicyInsured")
    public void setPolicyInsured(String policyInsured) {
        this.policyInsured = policyInsured;
    }

    public Insured withPolicyInsured(String policyInsured) {
        this.policyInsured = policyInsured;
        return this;
    }

    @JsonProperty("QuoteNumber")
    public String getQuoteNumber() {
        return quoteNumber;
    }

    @JsonProperty("QuoteNumber")
    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    public Insured withQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
        return this;
    }

    @JsonProperty("RcFailureCancel")
    public String getRcFailureCancel() {
        return rcFailureCancel;
    }

    @JsonProperty("RcFailureCancel")
    public void setRcFailureCancel(String rcFailureCancel) {
        this.rcFailureCancel = rcFailureCancel;
    }

    public Insured withRcFailureCancel(String rcFailureCancel) {
        this.rcFailureCancel = rcFailureCancel;
        return this;
    }

    @JsonProperty("RetrieveQuoteNumber")
    public String getRetrieveQuoteNumber() {
        return retrieveQuoteNumber;
    }

    @JsonProperty("RetrieveQuoteNumber")
    public void setRetrieveQuoteNumber(String retrieveQuoteNumber) {
        this.retrieveQuoteNumber = retrieveQuoteNumber;
    }

    public Insured withRetrieveQuoteNumber(String retrieveQuoteNumber) {
        this.retrieveQuoteNumber = retrieveQuoteNumber;
        return this;
    }

    @JsonProperty("StatusUpdMisPolicies")
    public String getStatusUpdMisPolicies() {
        return statusUpdMisPolicies;
    }

    @JsonProperty("StatusUpdMisPolicies")
    public void setStatusUpdMisPolicies(String statusUpdMisPolicies) {
        this.statusUpdMisPolicies = statusUpdMisPolicies;
    }

    public Insured withStatusUpdMisPolicies(String statusUpdMisPolicies) {
        this.statusUpdMisPolicies = statusUpdMisPolicies;
        return this;
    }

    @JsonProperty("Surname")
    public String getSurname() {
        return surname;
    }

    @JsonProperty("Surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Insured withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @JsonProperty("WrapUpSponsorship")
    public String getWrapUpSponsorship() {
        return wrapUpSponsorship;
    }

    @JsonProperty("WrapUpSponsorship")
    public void setWrapUpSponsorship(String wrapUpSponsorship) {
        this.wrapUpSponsorship = wrapUpSponsorship;
    }

    public Insured withWrapUpSponsorship(String wrapUpSponsorship) {
        this.wrapUpSponsorship = wrapUpSponsorship;
        return this;
    }

    @JsonProperty("Address")
    public List<Address> getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Insured withAddress(List<Address> address) {
        this.address = address;
        return this;
    }

    @JsonProperty("Contact")
    public List<Contact> getContact() {
        return contact;
    }

    @JsonProperty("Contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public Insured withContact(List<Contact> contact) {
        this.contact = contact;
        return this;
    }

    @JsonProperty("InsuredBillingInfo")
    public List<InsuredBillingInfo> getInsuredBillingInfo() {
        return insuredBillingInfo;
    }

    @JsonProperty("InsuredBillingInfo")
    public void setInsuredBillingInfo(List<InsuredBillingInfo> insuredBillingInfo) {
        this.insuredBillingInfo = insuredBillingInfo;
    }

    public Insured withInsuredBillingInfo(List<InsuredBillingInfo> insuredBillingInfo) {
        this.insuredBillingInfo = insuredBillingInfo;
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

    public Insured withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Insured.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("businessName");
        sb.append('=');
        sb.append(((this.businessName == null)?"<null>":this.businessName));
        sb.append(',');
        sb.append("copyCustomerDetails");
        sb.append('=');
        sb.append(((this.copyCustomerDetails == null)?"<null>":this.copyCustomerDetails));
        sb.append(',');
        sb.append("createShellAccount");
        sb.append('=');
        sb.append(((this.createShellAccount == null)?"<null>":this.createShellAccount));
        sb.append(',');
        sb.append("customerName");
        sb.append('=');
        sb.append(((this.customerName == null)?"<null>":this.customerName));
        sb.append(',');
        sb.append("cAddInsured");
        sb.append('=');
        sb.append(((this.cAddInsured == null)?"<null>":this.cAddInsured));
        sb.append(',');
        sb.append("cEmailNew");
        sb.append('=');
        sb.append(((this.cEmailNew == null)?"<null>":this.cEmailNew));
        sb.append(',');
        sb.append("cFirstName");
        sb.append('=');
        sb.append(((this.cFirstName == null)?"<null>":this.cFirstName));
        sb.append(',');
        sb.append("cLastName");
        sb.append('=');
        sb.append(((this.cLastName == null)?"<null>":this.cLastName));
        sb.append(',');
        sb.append("cPhone");
        sb.append('=');
        sb.append(((this.cPhone == null)?"<null>":this.cPhone));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("feinPhoneRequired");
        sb.append('=');
        sb.append(((this.feinPhoneRequired == null)?"<null>":this.feinPhoneRequired));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("indRiskSituation");
        sb.append('=');
        sb.append(((this.indRiskSituation == null)?"<null>":this.indRiskSituation));
        sb.append(',');
        sb.append("insuredSearchComplete");
        sb.append('=');
        sb.append(((this.insuredSearchComplete == null)?"<null>":this.insuredSearchComplete));
        sb.append(',');
        sb.append("insDob");
        sb.append('=');
        sb.append(((this.insDob == null)?"<null>":this.insDob));
        sb.append(',');
        sb.append("isDeregulated");
        sb.append('=');
        sb.append(((this.isDeregulated == null)?"<null>":this.isDeregulated));
        sb.append(',');
        sb.append("masterCustomerGid");
        sb.append('=');
        sb.append(((this.masterCustomerGid == null)?"<null>":this.masterCustomerGid));
        sb.append(',');
        sb.append("masterRecordGid");
        sb.append('=');
        sb.append(((this.masterRecordGid == null)?"<null>":this.masterRecordGid));
        sb.append(',');
        sb.append("nameType");
        sb.append('=');
        sb.append(((this.nameType == null)?"<null>":this.nameType));
        sb.append(',');
        sb.append("nameTypeStatCode");
        sb.append('=');
        sb.append(((this.nameTypeStatCode == null)?"<null>":this.nameTypeStatCode));
        sb.append(',');
        sb.append("orderCreditScore");
        sb.append('=');
        sb.append(((this.orderCreditScore == null)?"<null>":this.orderCreditScore));
        sb.append(',');
        sb.append("policyInsured");
        sb.append('=');
        sb.append(((this.policyInsured == null)?"<null>":this.policyInsured));
        sb.append(',');
        sb.append("quoteNumber");
        sb.append('=');
        sb.append(((this.quoteNumber == null)?"<null>":this.quoteNumber));
        sb.append(',');
        sb.append("rcFailureCancel");
        sb.append('=');
        sb.append(((this.rcFailureCancel == null)?"<null>":this.rcFailureCancel));
        sb.append(',');
        sb.append("retrieveQuoteNumber");
        sb.append('=');
        sb.append(((this.retrieveQuoteNumber == null)?"<null>":this.retrieveQuoteNumber));
        sb.append(',');
        sb.append("statusUpdMisPolicies");
        sb.append('=');
        sb.append(((this.statusUpdMisPolicies == null)?"<null>":this.statusUpdMisPolicies));
        sb.append(',');
        sb.append("surname");
        sb.append('=');
        sb.append(((this.surname == null)?"<null>":this.surname));
        sb.append(',');
        sb.append("wrapUpSponsorship");
        sb.append('=');
        sb.append(((this.wrapUpSponsorship == null)?"<null>":this.wrapUpSponsorship));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("insuredBillingInfo");
        sb.append('=');
        sb.append(((this.insuredBillingInfo == null)?"<null>":this.insuredBillingInfo));
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
        result = ((result* 31)+((this.cPhone == null)? 0 :this.cPhone.hashCode()));
        result = ((result* 31)+((this.retrieveQuoteNumber == null)? 0 :this.retrieveQuoteNumber.hashCode()));
        result = ((result* 31)+((this.indRiskSituation == null)? 0 :this.indRiskSituation.hashCode()));
        result = ((result* 31)+((this.masterRecordGid == null)? 0 :this.masterRecordGid.hashCode()));
        result = ((result* 31)+((this.wrapUpSponsorship == null)? 0 :this.wrapUpSponsorship.hashCode()));
        result = ((result* 31)+((this.businessName == null)? 0 :this.businessName.hashCode()));
        result = ((result* 31)+((this.cEmailNew == null)? 0 :this.cEmailNew.hashCode()));
        result = ((result* 31)+((this.nameType == null)? 0 :this.nameType.hashCode()));
        result = ((result* 31)+((this.rcFailureCancel == null)? 0 :this.rcFailureCancel.hashCode()));
        result = ((result* 31)+((this.cLastName == null)? 0 :this.cLastName.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.surname == null)? 0 :this.surname.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.policyInsured == null)? 0 :this.policyInsured.hashCode()));
        result = ((result* 31)+((this.insDob == null)? 0 :this.insDob.hashCode()));
        result = ((result* 31)+((this.copyCustomerDetails == null)? 0 :this.copyCustomerDetails.hashCode()));
        result = ((result* 31)+((this.insuredBillingInfo == null)? 0 :this.insuredBillingInfo.hashCode()));
        result = ((result* 31)+((this.orderCreditScore == null)? 0 :this.orderCreditScore.hashCode()));
        result = ((result* 31)+((this.cAddInsured == null)? 0 :this.cAddInsured.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.statusUpdMisPolicies == null)? 0 :this.statusUpdMisPolicies.hashCode()));
        result = ((result* 31)+((this.createShellAccount == null)? 0 :this.createShellAccount.hashCode()));
        result = ((result* 31)+((this.customerName == null)? 0 :this.customerName.hashCode()));
        result = ((result* 31)+((this.isDeregulated == null)? 0 :this.isDeregulated.hashCode()));
        result = ((result* 31)+((this.quoteNumber == null)? 0 :this.quoteNumber.hashCode()));
        result = ((result* 31)+((this.feinPhoneRequired == null)? 0 :this.feinPhoneRequired.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.insuredSearchComplete == null)? 0 :this.insuredSearchComplete.hashCode()));
        result = ((result* 31)+((this.nameTypeStatCode == null)? 0 :this.nameTypeStatCode.hashCode()));
        result = ((result* 31)+((this.cFirstName == null)? 0 :this.cFirstName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.masterCustomerGid == null)? 0 :this.masterCustomerGid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Insured) == false) {
            return false;
        }
        Insured rhs = ((Insured) other);
        return ((((((((((((((((((((((((((((((((((this.cPhone == rhs.cPhone)||((this.cPhone!= null)&&this.cPhone.equals(rhs.cPhone)))&&((this.retrieveQuoteNumber == rhs.retrieveQuoteNumber)||((this.retrieveQuoteNumber!= null)&&this.retrieveQuoteNumber.equals(rhs.retrieveQuoteNumber))))&&((this.indRiskSituation == rhs.indRiskSituation)||((this.indRiskSituation!= null)&&this.indRiskSituation.equals(rhs.indRiskSituation))))&&((this.masterRecordGid == rhs.masterRecordGid)||((this.masterRecordGid!= null)&&this.masterRecordGid.equals(rhs.masterRecordGid))))&&((this.wrapUpSponsorship == rhs.wrapUpSponsorship)||((this.wrapUpSponsorship!= null)&&this.wrapUpSponsorship.equals(rhs.wrapUpSponsorship))))&&((this.businessName == rhs.businessName)||((this.businessName!= null)&&this.businessName.equals(rhs.businessName))))&&((this.cEmailNew == rhs.cEmailNew)||((this.cEmailNew!= null)&&this.cEmailNew.equals(rhs.cEmailNew))))&&((this.nameType == rhs.nameType)||((this.nameType!= null)&&this.nameType.equals(rhs.nameType))))&&((this.rcFailureCancel == rhs.rcFailureCancel)||((this.rcFailureCancel!= null)&&this.rcFailureCancel.equals(rhs.rcFailureCancel))))&&((this.cLastName == rhs.cLastName)||((this.cLastName!= null)&&this.cLastName.equals(rhs.cLastName))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.surname == rhs.surname)||((this.surname!= null)&&this.surname.equals(rhs.surname))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.policyInsured == rhs.policyInsured)||((this.policyInsured!= null)&&this.policyInsured.equals(rhs.policyInsured))))&&((this.insDob == rhs.insDob)||((this.insDob!= null)&&this.insDob.equals(rhs.insDob))))&&((this.copyCustomerDetails == rhs.copyCustomerDetails)||((this.copyCustomerDetails!= null)&&this.copyCustomerDetails.equals(rhs.copyCustomerDetails))))&&((this.insuredBillingInfo == rhs.insuredBillingInfo)||((this.insuredBillingInfo!= null)&&this.insuredBillingInfo.equals(rhs.insuredBillingInfo))))&&((this.orderCreditScore == rhs.orderCreditScore)||((this.orderCreditScore!= null)&&this.orderCreditScore.equals(rhs.orderCreditScore))))&&((this.cAddInsured == rhs.cAddInsured)||((this.cAddInsured!= null)&&this.cAddInsured.equals(rhs.cAddInsured))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.statusUpdMisPolicies == rhs.statusUpdMisPolicies)||((this.statusUpdMisPolicies!= null)&&this.statusUpdMisPolicies.equals(rhs.statusUpdMisPolicies))))&&((this.createShellAccount == rhs.createShellAccount)||((this.createShellAccount!= null)&&this.createShellAccount.equals(rhs.createShellAccount))))&&((this.customerName == rhs.customerName)||((this.customerName!= null)&&this.customerName.equals(rhs.customerName))))&&((this.isDeregulated == rhs.isDeregulated)||((this.isDeregulated!= null)&&this.isDeregulated.equals(rhs.isDeregulated))))&&((this.quoteNumber == rhs.quoteNumber)||((this.quoteNumber!= null)&&this.quoteNumber.equals(rhs.quoteNumber))))&&((this.feinPhoneRequired == rhs.feinPhoneRequired)||((this.feinPhoneRequired!= null)&&this.feinPhoneRequired.equals(rhs.feinPhoneRequired))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.insuredSearchComplete == rhs.insuredSearchComplete)||((this.insuredSearchComplete!= null)&&this.insuredSearchComplete.equals(rhs.insuredSearchComplete))))&&((this.nameTypeStatCode == rhs.nameTypeStatCode)||((this.nameTypeStatCode!= null)&&this.nameTypeStatCode.equals(rhs.nameTypeStatCode))))&&((this.cFirstName == rhs.cFirstName)||((this.cFirstName!= null)&&this.cFirstName.equals(rhs.cFirstName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.masterCustomerGid == rhs.masterCustomerGid)||((this.masterCustomerGid!= null)&&this.masterCustomerGid.equals(rhs.masterCustomerGid))));
    }

}
