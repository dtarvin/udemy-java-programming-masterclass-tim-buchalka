
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
    "AdpPrefill",
    "BinderFlag",
    "BlacklstChrPattrn",
    "BookingDate",
    "BookingStatus",
    "BookingUser",
    "CanWaivePremium",
    "CompanyCode",
    "CompanyName",
    "CompositeRating",
    "ControlDate",
    "CustomPackVersion",
    "CustomPolicyNumber",
    "CustomRevisionNumber",
    "DisplayPolicyNumber",
    "EffectiveDate",
    "EndorsementReason",
    "EntityReference",
    "EntityType",
    "ExpirationDate",
    "IsComReduct",
    "IsCovManuallyRated",
    "IsRebind",
    "IsRewrite",
    "IsSubjectToAudit",
    "MasterQuote",
    "MicVersion",
    "NextGenAudited",
    "NoConflictOnRollfwd",
    "OldEntityReference",
    "OldEntityType",
    "OnDemandReorder",
    "OoseVoidIndicator",
    "OrdCarrReport",
    "OrgEntityReference",
    "PaperType",
    "PendingCanInd",
    "PolicyNumber",
    "PolicyQuoteIndicator",
    "PolTerm",
    "PolTermCode",
    "PremiumRounding",
    "PrimaryRiskState",
    "ProductCode",
    "ProductName",
    "ProductVersion",
    "RateClicked",
    "RatingMode",
    "Renewal",
    "RenewalCounter",
    "RenewalCounter2",
    "RenewalIndicator",
    "RetainBtmFltEndr",
    "RevisionNumber",
    "RiskState",
    "RiskStateStatCode",
    "SourceSystem",
    "TotalAnnualColFee",
    "TotalAnnualFee",
    "TotalAnnualSurcharge",
    "TotalAnnualTax",
    "TotalFtermColFee",
    "TotalFtermFee",
    "TotalFtermSurcharge",
    "TotalFtermTaxes",
    "TotalSurcharge",
    "TotalSurchargeFterm",
    "TotalTransFee",
    "TotalTransSurcharge",
    "TransactionAction",
    "TransactionCode",
    "TransactionFactor",
    "TransAccountingDate",
    "TransAccountingMonth",
    "TransAccountingYear",
    "TransDisplayName",
    "TransEffectiveDate",
    "WaivedPremium",
    "WaivePremium",
    "PremiumAttributes",
    "Insured",
    "Producer",
    "LOB_PH"
})
@Generated("jsonschema2pojo")
public class Policy {

    @JsonProperty("AdpPrefill")
    private String adpPrefill;
    @JsonProperty("BinderFlag")
    private String binderFlag;
    @JsonProperty("BlacklstChrPattrn")
    private String blacklstChrPattrn;
    @JsonProperty("BookingDate")
    private String bookingDate;
    @JsonProperty("BookingStatus")
    private String bookingStatus;
    @JsonProperty("BookingUser")
    private String bookingUser;
    @JsonProperty("CanWaivePremium")
    private String canWaivePremium;
    @JsonProperty("CompanyCode")
    private String companyCode;
    @JsonProperty("CompanyName")
    private String companyName;
    @JsonProperty("CompositeRating")
    private String compositeRating;
    @JsonProperty("ControlDate")
    private String controlDate;
    @JsonProperty("CustomPackVersion")
    private String customPackVersion;
    @JsonProperty("CustomPolicyNumber")
    private String customPolicyNumber;
    @JsonProperty("CustomRevisionNumber")
    private String customRevisionNumber;
    @JsonProperty("DisplayPolicyNumber")
    private String displayPolicyNumber;
    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("EndorsementReason")
    private String endorsementReason;
    @JsonProperty("EntityReference")
    private String entityReference;
    @JsonProperty("EntityType")
    private String entityType;
    @JsonProperty("ExpirationDate")
    private String expirationDate;
    @JsonProperty("IsComReduct")
    private String isComReduct;
    @JsonProperty("IsCovManuallyRated")
    private String isCovManuallyRated;
    @JsonProperty("IsRebind")
    private String isRebind;
    @JsonProperty("IsRewrite")
    private String isRewrite;
    @JsonProperty("IsSubjectToAudit")
    private String isSubjectToAudit;
    @JsonProperty("MasterQuote")
    private String masterQuote;
    @JsonProperty("MicVersion")
    private String micVersion;
    @JsonProperty("NextGenAudited")
    private String nextGenAudited;
    @JsonProperty("NoConflictOnRollfwd")
    private String noConflictOnRollfwd;
    @JsonProperty("OldEntityReference")
    private String oldEntityReference;
    @JsonProperty("OldEntityType")
    private String oldEntityType;
    @JsonProperty("OnDemandReorder")
    private String onDemandReorder;
    @JsonProperty("OoseVoidIndicator")
    private String ooseVoidIndicator;
    @JsonProperty("OrdCarrReport")
    private String ordCarrReport;
    @JsonProperty("OrgEntityReference")
    private String orgEntityReference;
    @JsonProperty("PaperType")
    private String paperType;
    @JsonProperty("PendingCanInd")
    private String pendingCanInd;
    @JsonProperty("PolicyNumber")
    private String policyNumber;
    @JsonProperty("PolicyQuoteIndicator")
    private String policyQuoteIndicator;
    @JsonProperty("PolTerm")
    private String polTerm;
    @JsonProperty("PolTermCode")
    private String polTermCode;
    @JsonProperty("PremiumRounding")
    private String premiumRounding;
    @JsonProperty("PrimaryRiskState")
    private String primaryRiskState;
    @JsonProperty("ProductCode")
    private String productCode;
    @JsonProperty("ProductName")
    private String productName;
    @JsonProperty("ProductVersion")
    private String productVersion;
    @JsonProperty("RateClicked")
    private String rateClicked;
    @JsonProperty("RatingMode")
    private String ratingMode;
    @JsonProperty("Renewal")
    private String renewal;
    @JsonProperty("RenewalCounter")
    private String renewalCounter;
    @JsonProperty("RenewalCounter2")
    private String renewalCounter2;
    @JsonProperty("RenewalIndicator")
    private String renewalIndicator;
    @JsonProperty("RetainBtmFltEndr")
    private String retainBtmFltEndr;
    @JsonProperty("RevisionNumber")
    private String revisionNumber;
    @JsonProperty("RiskState")
    private String riskState;
    @JsonProperty("RiskStateStatCode")
    private String riskStateStatCode;
    @JsonProperty("SourceSystem")
    private String sourceSystem;
    @JsonProperty("TotalAnnualColFee")
    private String totalAnnualColFee;
    @JsonProperty("TotalAnnualFee")
    private String totalAnnualFee;
    @JsonProperty("TotalAnnualSurcharge")
    private String totalAnnualSurcharge;
    @JsonProperty("TotalAnnualTax")
    private String totalAnnualTax;
    @JsonProperty("TotalFtermColFee")
    private String totalFtermColFee;
    @JsonProperty("TotalFtermFee")
    private String totalFtermFee;
    @JsonProperty("TotalFtermSurcharge")
    private String totalFtermSurcharge;
    @JsonProperty("TotalFtermTaxes")
    private String totalFtermTaxes;
    @JsonProperty("TotalSurcharge")
    private String totalSurcharge;
    @JsonProperty("TotalSurchargeFterm")
    private String totalSurchargeFterm;
    @JsonProperty("TotalTransFee")
    private String totalTransFee;
    @JsonProperty("TotalTransSurcharge")
    private String totalTransSurcharge;
    @JsonProperty("TransactionAction")
    private String transactionAction;
    @JsonProperty("TransactionCode")
    private String transactionCode;
    @JsonProperty("TransactionFactor")
    private String transactionFactor;
    @JsonProperty("TransAccountingDate")
    private String transAccountingDate;
    @JsonProperty("TransAccountingMonth")
    private String transAccountingMonth;
    @JsonProperty("TransAccountingYear")
    private String transAccountingYear;
    @JsonProperty("TransDisplayName")
    private String transDisplayName;
    @JsonProperty("TransEffectiveDate")
    private String transEffectiveDate;
    @JsonProperty("WaivedPremium")
    private String waivedPremium;
    @JsonProperty("WaivePremium")
    private String waivePremium;
    @JsonProperty("PremiumAttributes")
    private PremiumAttributes premiumAttributes;
    @JsonProperty("Insured")
    private List<Insured> insured = new ArrayList<Insured>();
    @JsonProperty("Producer")
    private List<Producer> producer = new ArrayList<Producer>();
    @JsonProperty("LOB_PH")
    private List<LobPh> lobPh = new ArrayList<LobPh>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AdpPrefill")
    public String getAdpPrefill() {
        return adpPrefill;
    }

    @JsonProperty("AdpPrefill")
    public void setAdpPrefill(String adpPrefill) {
        this.adpPrefill = adpPrefill;
    }

    public Policy withAdpPrefill(String adpPrefill) {
        this.adpPrefill = adpPrefill;
        return this;
    }

    @JsonProperty("BinderFlag")
    public String getBinderFlag() {
        return binderFlag;
    }

    @JsonProperty("BinderFlag")
    public void setBinderFlag(String binderFlag) {
        this.binderFlag = binderFlag;
    }

    public Policy withBinderFlag(String binderFlag) {
        this.binderFlag = binderFlag;
        return this;
    }

    @JsonProperty("BlacklstChrPattrn")
    public String getBlacklstChrPattrn() {
        return blacklstChrPattrn;
    }

    @JsonProperty("BlacklstChrPattrn")
    public void setBlacklstChrPattrn(String blacklstChrPattrn) {
        this.blacklstChrPattrn = blacklstChrPattrn;
    }

    public Policy withBlacklstChrPattrn(String blacklstChrPattrn) {
        this.blacklstChrPattrn = blacklstChrPattrn;
        return this;
    }

    @JsonProperty("BookingDate")
    public String getBookingDate() {
        return bookingDate;
    }

    @JsonProperty("BookingDate")
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Policy withBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }

    @JsonProperty("BookingStatus")
    public String getBookingStatus() {
        return bookingStatus;
    }

    @JsonProperty("BookingStatus")
    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Policy withBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
        return this;
    }

    @JsonProperty("BookingUser")
    public String getBookingUser() {
        return bookingUser;
    }

    @JsonProperty("BookingUser")
    public void setBookingUser(String bookingUser) {
        this.bookingUser = bookingUser;
    }

    public Policy withBookingUser(String bookingUser) {
        this.bookingUser = bookingUser;
        return this;
    }

    @JsonProperty("CanWaivePremium")
    public String getCanWaivePremium() {
        return canWaivePremium;
    }

    @JsonProperty("CanWaivePremium")
    public void setCanWaivePremium(String canWaivePremium) {
        this.canWaivePremium = canWaivePremium;
    }

    public Policy withCanWaivePremium(String canWaivePremium) {
        this.canWaivePremium = canWaivePremium;
        return this;
    }

    @JsonProperty("CompanyCode")
    public String getCompanyCode() {
        return companyCode;
    }

    @JsonProperty("CompanyCode")
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Policy withCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }

    @JsonProperty("CompanyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("CompanyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Policy withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    @JsonProperty("CompositeRating")
    public String getCompositeRating() {
        return compositeRating;
    }

    @JsonProperty("CompositeRating")
    public void setCompositeRating(String compositeRating) {
        this.compositeRating = compositeRating;
    }

    public Policy withCompositeRating(String compositeRating) {
        this.compositeRating = compositeRating;
        return this;
    }

    @JsonProperty("ControlDate")
    public String getControlDate() {
        return controlDate;
    }

    @JsonProperty("ControlDate")
    public void setControlDate(String controlDate) {
        this.controlDate = controlDate;
    }

    public Policy withControlDate(String controlDate) {
        this.controlDate = controlDate;
        return this;
    }

    @JsonProperty("CustomPackVersion")
    public String getCustomPackVersion() {
        return customPackVersion;
    }

    @JsonProperty("CustomPackVersion")
    public void setCustomPackVersion(String customPackVersion) {
        this.customPackVersion = customPackVersion;
    }

    public Policy withCustomPackVersion(String customPackVersion) {
        this.customPackVersion = customPackVersion;
        return this;
    }

    @JsonProperty("CustomPolicyNumber")
    public String getCustomPolicyNumber() {
        return customPolicyNumber;
    }

    @JsonProperty("CustomPolicyNumber")
    public void setCustomPolicyNumber(String customPolicyNumber) {
        this.customPolicyNumber = customPolicyNumber;
    }

    public Policy withCustomPolicyNumber(String customPolicyNumber) {
        this.customPolicyNumber = customPolicyNumber;
        return this;
    }

    @JsonProperty("CustomRevisionNumber")
    public String getCustomRevisionNumber() {
        return customRevisionNumber;
    }

    @JsonProperty("CustomRevisionNumber")
    public void setCustomRevisionNumber(String customRevisionNumber) {
        this.customRevisionNumber = customRevisionNumber;
    }

    public Policy withCustomRevisionNumber(String customRevisionNumber) {
        this.customRevisionNumber = customRevisionNumber;
        return this;
    }

    @JsonProperty("DisplayPolicyNumber")
    public String getDisplayPolicyNumber() {
        return displayPolicyNumber;
    }

    @JsonProperty("DisplayPolicyNumber")
    public void setDisplayPolicyNumber(String displayPolicyNumber) {
        this.displayPolicyNumber = displayPolicyNumber;
    }

    public Policy withDisplayPolicyNumber(String displayPolicyNumber) {
        this.displayPolicyNumber = displayPolicyNumber;
        return this;
    }

    @JsonProperty("EffectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("EffectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Policy withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    @JsonProperty("EndorsementReason")
    public String getEndorsementReason() {
        return endorsementReason;
    }

    @JsonProperty("EndorsementReason")
    public void setEndorsementReason(String endorsementReason) {
        this.endorsementReason = endorsementReason;
    }

    public Policy withEndorsementReason(String endorsementReason) {
        this.endorsementReason = endorsementReason;
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

    public Policy withEntityReference(String entityReference) {
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

    public Policy withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("ExpirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("ExpirationDate")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Policy withExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    @JsonProperty("IsComReduct")
    public String getIsComReduct() {
        return isComReduct;
    }

    @JsonProperty("IsComReduct")
    public void setIsComReduct(String isComReduct) {
        this.isComReduct = isComReduct;
    }

    public Policy withIsComReduct(String isComReduct) {
        this.isComReduct = isComReduct;
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

    public Policy withIsCovManuallyRated(String isCovManuallyRated) {
        this.isCovManuallyRated = isCovManuallyRated;
        return this;
    }

    @JsonProperty("IsRebind")
    public String getIsRebind() {
        return isRebind;
    }

    @JsonProperty("IsRebind")
    public void setIsRebind(String isRebind) {
        this.isRebind = isRebind;
    }

    public Policy withIsRebind(String isRebind) {
        this.isRebind = isRebind;
        return this;
    }

    @JsonProperty("IsRewrite")
    public String getIsRewrite() {
        return isRewrite;
    }

    @JsonProperty("IsRewrite")
    public void setIsRewrite(String isRewrite) {
        this.isRewrite = isRewrite;
    }

    public Policy withIsRewrite(String isRewrite) {
        this.isRewrite = isRewrite;
        return this;
    }

    @JsonProperty("IsSubjectToAudit")
    public String getIsSubjectToAudit() {
        return isSubjectToAudit;
    }

    @JsonProperty("IsSubjectToAudit")
    public void setIsSubjectToAudit(String isSubjectToAudit) {
        this.isSubjectToAudit = isSubjectToAudit;
    }

    public Policy withIsSubjectToAudit(String isSubjectToAudit) {
        this.isSubjectToAudit = isSubjectToAudit;
        return this;
    }

    @JsonProperty("MasterQuote")
    public String getMasterQuote() {
        return masterQuote;
    }

    @JsonProperty("MasterQuote")
    public void setMasterQuote(String masterQuote) {
        this.masterQuote = masterQuote;
    }

    public Policy withMasterQuote(String masterQuote) {
        this.masterQuote = masterQuote;
        return this;
    }

    @JsonProperty("MicVersion")
    public String getMicVersion() {
        return micVersion;
    }

    @JsonProperty("MicVersion")
    public void setMicVersion(String micVersion) {
        this.micVersion = micVersion;
    }

    public Policy withMicVersion(String micVersion) {
        this.micVersion = micVersion;
        return this;
    }

    @JsonProperty("NextGenAudited")
    public String getNextGenAudited() {
        return nextGenAudited;
    }

    @JsonProperty("NextGenAudited")
    public void setNextGenAudited(String nextGenAudited) {
        this.nextGenAudited = nextGenAudited;
    }

    public Policy withNextGenAudited(String nextGenAudited) {
        this.nextGenAudited = nextGenAudited;
        return this;
    }

    @JsonProperty("NoConflictOnRollfwd")
    public String getNoConflictOnRollfwd() {
        return noConflictOnRollfwd;
    }

    @JsonProperty("NoConflictOnRollfwd")
    public void setNoConflictOnRollfwd(String noConflictOnRollfwd) {
        this.noConflictOnRollfwd = noConflictOnRollfwd;
    }

    public Policy withNoConflictOnRollfwd(String noConflictOnRollfwd) {
        this.noConflictOnRollfwd = noConflictOnRollfwd;
        return this;
    }

    @JsonProperty("OldEntityReference")
    public String getOldEntityReference() {
        return oldEntityReference;
    }

    @JsonProperty("OldEntityReference")
    public void setOldEntityReference(String oldEntityReference) {
        this.oldEntityReference = oldEntityReference;
    }

    public Policy withOldEntityReference(String oldEntityReference) {
        this.oldEntityReference = oldEntityReference;
        return this;
    }

    @JsonProperty("OldEntityType")
    public String getOldEntityType() {
        return oldEntityType;
    }

    @JsonProperty("OldEntityType")
    public void setOldEntityType(String oldEntityType) {
        this.oldEntityType = oldEntityType;
    }

    public Policy withOldEntityType(String oldEntityType) {
        this.oldEntityType = oldEntityType;
        return this;
    }

    @JsonProperty("OnDemandReorder")
    public String getOnDemandReorder() {
        return onDemandReorder;
    }

    @JsonProperty("OnDemandReorder")
    public void setOnDemandReorder(String onDemandReorder) {
        this.onDemandReorder = onDemandReorder;
    }

    public Policy withOnDemandReorder(String onDemandReorder) {
        this.onDemandReorder = onDemandReorder;
        return this;
    }

    @JsonProperty("OoseVoidIndicator")
    public String getOoseVoidIndicator() {
        return ooseVoidIndicator;
    }

    @JsonProperty("OoseVoidIndicator")
    public void setOoseVoidIndicator(String ooseVoidIndicator) {
        this.ooseVoidIndicator = ooseVoidIndicator;
    }

    public Policy withOoseVoidIndicator(String ooseVoidIndicator) {
        this.ooseVoidIndicator = ooseVoidIndicator;
        return this;
    }

    @JsonProperty("OrdCarrReport")
    public String getOrdCarrReport() {
        return ordCarrReport;
    }

    @JsonProperty("OrdCarrReport")
    public void setOrdCarrReport(String ordCarrReport) {
        this.ordCarrReport = ordCarrReport;
    }

    public Policy withOrdCarrReport(String ordCarrReport) {
        this.ordCarrReport = ordCarrReport;
        return this;
    }

    @JsonProperty("OrgEntityReference")
    public String getOrgEntityReference() {
        return orgEntityReference;
    }

    @JsonProperty("OrgEntityReference")
    public void setOrgEntityReference(String orgEntityReference) {
        this.orgEntityReference = orgEntityReference;
    }

    public Policy withOrgEntityReference(String orgEntityReference) {
        this.orgEntityReference = orgEntityReference;
        return this;
    }

    @JsonProperty("PaperType")
    public String getPaperType() {
        return paperType;
    }

    @JsonProperty("PaperType")
    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public Policy withPaperType(String paperType) {
        this.paperType = paperType;
        return this;
    }

    @JsonProperty("PendingCanInd")
    public String getPendingCanInd() {
        return pendingCanInd;
    }

    @JsonProperty("PendingCanInd")
    public void setPendingCanInd(String pendingCanInd) {
        this.pendingCanInd = pendingCanInd;
    }

    public Policy withPendingCanInd(String pendingCanInd) {
        this.pendingCanInd = pendingCanInd;
        return this;
    }

    @JsonProperty("PolicyNumber")
    public String getPolicyNumber() {
        return policyNumber;
    }

    @JsonProperty("PolicyNumber")
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Policy withPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
        return this;
    }

    @JsonProperty("PolicyQuoteIndicator")
    public String getPolicyQuoteIndicator() {
        return policyQuoteIndicator;
    }

    @JsonProperty("PolicyQuoteIndicator")
    public void setPolicyQuoteIndicator(String policyQuoteIndicator) {
        this.policyQuoteIndicator = policyQuoteIndicator;
    }

    public Policy withPolicyQuoteIndicator(String policyQuoteIndicator) {
        this.policyQuoteIndicator = policyQuoteIndicator;
        return this;
    }

    @JsonProperty("PolTerm")
    public String getPolTerm() {
        return polTerm;
    }

    @JsonProperty("PolTerm")
    public void setPolTerm(String polTerm) {
        this.polTerm = polTerm;
    }

    public Policy withPolTerm(String polTerm) {
        this.polTerm = polTerm;
        return this;
    }

    @JsonProperty("PolTermCode")
    public String getPolTermCode() {
        return polTermCode;
    }

    @JsonProperty("PolTermCode")
    public void setPolTermCode(String polTermCode) {
        this.polTermCode = polTermCode;
    }

    public Policy withPolTermCode(String polTermCode) {
        this.polTermCode = polTermCode;
        return this;
    }

    @JsonProperty("PremiumRounding")
    public String getPremiumRounding() {
        return premiumRounding;
    }

    @JsonProperty("PremiumRounding")
    public void setPremiumRounding(String premiumRounding) {
        this.premiumRounding = premiumRounding;
    }

    public Policy withPremiumRounding(String premiumRounding) {
        this.premiumRounding = premiumRounding;
        return this;
    }

    @JsonProperty("PrimaryRiskState")
    public String getPrimaryRiskState() {
        return primaryRiskState;
    }

    @JsonProperty("PrimaryRiskState")
    public void setPrimaryRiskState(String primaryRiskState) {
        this.primaryRiskState = primaryRiskState;
    }

    public Policy withPrimaryRiskState(String primaryRiskState) {
        this.primaryRiskState = primaryRiskState;
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

    public Policy withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    @JsonProperty("ProductName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("ProductName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Policy withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    @JsonProperty("ProductVersion")
    public String getProductVersion() {
        return productVersion;
    }

    @JsonProperty("ProductVersion")
    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public Policy withProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }

    @JsonProperty("RateClicked")
    public String getRateClicked() {
        return rateClicked;
    }

    @JsonProperty("RateClicked")
    public void setRateClicked(String rateClicked) {
        this.rateClicked = rateClicked;
    }

    public Policy withRateClicked(String rateClicked) {
        this.rateClicked = rateClicked;
        return this;
    }

    @JsonProperty("RatingMode")
    public String getRatingMode() {
        return ratingMode;
    }

    @JsonProperty("RatingMode")
    public void setRatingMode(String ratingMode) {
        this.ratingMode = ratingMode;
    }

    public Policy withRatingMode(String ratingMode) {
        this.ratingMode = ratingMode;
        return this;
    }

    @JsonProperty("Renewal")
    public String getRenewal() {
        return renewal;
    }

    @JsonProperty("Renewal")
    public void setRenewal(String renewal) {
        this.renewal = renewal;
    }

    public Policy withRenewal(String renewal) {
        this.renewal = renewal;
        return this;
    }

    @JsonProperty("RenewalCounter")
    public String getRenewalCounter() {
        return renewalCounter;
    }

    @JsonProperty("RenewalCounter")
    public void setRenewalCounter(String renewalCounter) {
        this.renewalCounter = renewalCounter;
    }

    public Policy withRenewalCounter(String renewalCounter) {
        this.renewalCounter = renewalCounter;
        return this;
    }

    @JsonProperty("RenewalCounter2")
    public String getRenewalCounter2() {
        return renewalCounter2;
    }

    @JsonProperty("RenewalCounter2")
    public void setRenewalCounter2(String renewalCounter2) {
        this.renewalCounter2 = renewalCounter2;
    }

    public Policy withRenewalCounter2(String renewalCounter2) {
        this.renewalCounter2 = renewalCounter2;
        return this;
    }

    @JsonProperty("RenewalIndicator")
    public String getRenewalIndicator() {
        return renewalIndicator;
    }

    @JsonProperty("RenewalIndicator")
    public void setRenewalIndicator(String renewalIndicator) {
        this.renewalIndicator = renewalIndicator;
    }

    public Policy withRenewalIndicator(String renewalIndicator) {
        this.renewalIndicator = renewalIndicator;
        return this;
    }

    @JsonProperty("RetainBtmFltEndr")
    public String getRetainBtmFltEndr() {
        return retainBtmFltEndr;
    }

    @JsonProperty("RetainBtmFltEndr")
    public void setRetainBtmFltEndr(String retainBtmFltEndr) {
        this.retainBtmFltEndr = retainBtmFltEndr;
    }

    public Policy withRetainBtmFltEndr(String retainBtmFltEndr) {
        this.retainBtmFltEndr = retainBtmFltEndr;
        return this;
    }

    @JsonProperty("RevisionNumber")
    public String getRevisionNumber() {
        return revisionNumber;
    }

    @JsonProperty("RevisionNumber")
    public void setRevisionNumber(String revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    public Policy withRevisionNumber(String revisionNumber) {
        this.revisionNumber = revisionNumber;
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

    public Policy withRiskState(String riskState) {
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

    public Policy withRiskStateStatCode(String riskStateStatCode) {
        this.riskStateStatCode = riskStateStatCode;
        return this;
    }

    @JsonProperty("SourceSystem")
    public String getSourceSystem() {
        return sourceSystem;
    }

    @JsonProperty("SourceSystem")
    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public Policy withSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }

    @JsonProperty("TotalAnnualColFee")
    public String getTotalAnnualColFee() {
        return totalAnnualColFee;
    }

    @JsonProperty("TotalAnnualColFee")
    public void setTotalAnnualColFee(String totalAnnualColFee) {
        this.totalAnnualColFee = totalAnnualColFee;
    }

    public Policy withTotalAnnualColFee(String totalAnnualColFee) {
        this.totalAnnualColFee = totalAnnualColFee;
        return this;
    }

    @JsonProperty("TotalAnnualFee")
    public String getTotalAnnualFee() {
        return totalAnnualFee;
    }

    @JsonProperty("TotalAnnualFee")
    public void setTotalAnnualFee(String totalAnnualFee) {
        this.totalAnnualFee = totalAnnualFee;
    }

    public Policy withTotalAnnualFee(String totalAnnualFee) {
        this.totalAnnualFee = totalAnnualFee;
        return this;
    }

    @JsonProperty("TotalAnnualSurcharge")
    public String getTotalAnnualSurcharge() {
        return totalAnnualSurcharge;
    }

    @JsonProperty("TotalAnnualSurcharge")
    public void setTotalAnnualSurcharge(String totalAnnualSurcharge) {
        this.totalAnnualSurcharge = totalAnnualSurcharge;
    }

    public Policy withTotalAnnualSurcharge(String totalAnnualSurcharge) {
        this.totalAnnualSurcharge = totalAnnualSurcharge;
        return this;
    }

    @JsonProperty("TotalAnnualTax")
    public String getTotalAnnualTax() {
        return totalAnnualTax;
    }

    @JsonProperty("TotalAnnualTax")
    public void setTotalAnnualTax(String totalAnnualTax) {
        this.totalAnnualTax = totalAnnualTax;
    }

    public Policy withTotalAnnualTax(String totalAnnualTax) {
        this.totalAnnualTax = totalAnnualTax;
        return this;
    }

    @JsonProperty("TotalFtermColFee")
    public String getTotalFtermColFee() {
        return totalFtermColFee;
    }

    @JsonProperty("TotalFtermColFee")
    public void setTotalFtermColFee(String totalFtermColFee) {
        this.totalFtermColFee = totalFtermColFee;
    }

    public Policy withTotalFtermColFee(String totalFtermColFee) {
        this.totalFtermColFee = totalFtermColFee;
        return this;
    }

    @JsonProperty("TotalFtermFee")
    public String getTotalFtermFee() {
        return totalFtermFee;
    }

    @JsonProperty("TotalFtermFee")
    public void setTotalFtermFee(String totalFtermFee) {
        this.totalFtermFee = totalFtermFee;
    }

    public Policy withTotalFtermFee(String totalFtermFee) {
        this.totalFtermFee = totalFtermFee;
        return this;
    }

    @JsonProperty("TotalFtermSurcharge")
    public String getTotalFtermSurcharge() {
        return totalFtermSurcharge;
    }

    @JsonProperty("TotalFtermSurcharge")
    public void setTotalFtermSurcharge(String totalFtermSurcharge) {
        this.totalFtermSurcharge = totalFtermSurcharge;
    }

    public Policy withTotalFtermSurcharge(String totalFtermSurcharge) {
        this.totalFtermSurcharge = totalFtermSurcharge;
        return this;
    }

    @JsonProperty("TotalFtermTaxes")
    public String getTotalFtermTaxes() {
        return totalFtermTaxes;
    }

    @JsonProperty("TotalFtermTaxes")
    public void setTotalFtermTaxes(String totalFtermTaxes) {
        this.totalFtermTaxes = totalFtermTaxes;
    }

    public Policy withTotalFtermTaxes(String totalFtermTaxes) {
        this.totalFtermTaxes = totalFtermTaxes;
        return this;
    }

    @JsonProperty("TotalSurcharge")
    public String getTotalSurcharge() {
        return totalSurcharge;
    }

    @JsonProperty("TotalSurcharge")
    public void setTotalSurcharge(String totalSurcharge) {
        this.totalSurcharge = totalSurcharge;
    }

    public Policy withTotalSurcharge(String totalSurcharge) {
        this.totalSurcharge = totalSurcharge;
        return this;
    }

    @JsonProperty("TotalSurchargeFterm")
    public String getTotalSurchargeFterm() {
        return totalSurchargeFterm;
    }

    @JsonProperty("TotalSurchargeFterm")
    public void setTotalSurchargeFterm(String totalSurchargeFterm) {
        this.totalSurchargeFterm = totalSurchargeFterm;
    }

    public Policy withTotalSurchargeFterm(String totalSurchargeFterm) {
        this.totalSurchargeFterm = totalSurchargeFterm;
        return this;
    }

    @JsonProperty("TotalTransFee")
    public String getTotalTransFee() {
        return totalTransFee;
    }

    @JsonProperty("TotalTransFee")
    public void setTotalTransFee(String totalTransFee) {
        this.totalTransFee = totalTransFee;
    }

    public Policy withTotalTransFee(String totalTransFee) {
        this.totalTransFee = totalTransFee;
        return this;
    }

    @JsonProperty("TotalTransSurcharge")
    public String getTotalTransSurcharge() {
        return totalTransSurcharge;
    }

    @JsonProperty("TotalTransSurcharge")
    public void setTotalTransSurcharge(String totalTransSurcharge) {
        this.totalTransSurcharge = totalTransSurcharge;
    }

    public Policy withTotalTransSurcharge(String totalTransSurcharge) {
        this.totalTransSurcharge = totalTransSurcharge;
        return this;
    }

    @JsonProperty("TransactionAction")
    public String getTransactionAction() {
        return transactionAction;
    }

    @JsonProperty("TransactionAction")
    public void setTransactionAction(String transactionAction) {
        this.transactionAction = transactionAction;
    }

    public Policy withTransactionAction(String transactionAction) {
        this.transactionAction = transactionAction;
        return this;
    }

    @JsonProperty("TransactionCode")
    public String getTransactionCode() {
        return transactionCode;
    }

    @JsonProperty("TransactionCode")
    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public Policy withTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
        return this;
    }

    @JsonProperty("TransactionFactor")
    public String getTransactionFactor() {
        return transactionFactor;
    }

    @JsonProperty("TransactionFactor")
    public void setTransactionFactor(String transactionFactor) {
        this.transactionFactor = transactionFactor;
    }

    public Policy withTransactionFactor(String transactionFactor) {
        this.transactionFactor = transactionFactor;
        return this;
    }

    @JsonProperty("TransAccountingDate")
    public String getTransAccountingDate() {
        return transAccountingDate;
    }

    @JsonProperty("TransAccountingDate")
    public void setTransAccountingDate(String transAccountingDate) {
        this.transAccountingDate = transAccountingDate;
    }

    public Policy withTransAccountingDate(String transAccountingDate) {
        this.transAccountingDate = transAccountingDate;
        return this;
    }

    @JsonProperty("TransAccountingMonth")
    public String getTransAccountingMonth() {
        return transAccountingMonth;
    }

    @JsonProperty("TransAccountingMonth")
    public void setTransAccountingMonth(String transAccountingMonth) {
        this.transAccountingMonth = transAccountingMonth;
    }

    public Policy withTransAccountingMonth(String transAccountingMonth) {
        this.transAccountingMonth = transAccountingMonth;
        return this;
    }

    @JsonProperty("TransAccountingYear")
    public String getTransAccountingYear() {
        return transAccountingYear;
    }

    @JsonProperty("TransAccountingYear")
    public void setTransAccountingYear(String transAccountingYear) {
        this.transAccountingYear = transAccountingYear;
    }

    public Policy withTransAccountingYear(String transAccountingYear) {
        this.transAccountingYear = transAccountingYear;
        return this;
    }

    @JsonProperty("TransDisplayName")
    public String getTransDisplayName() {
        return transDisplayName;
    }

    @JsonProperty("TransDisplayName")
    public void setTransDisplayName(String transDisplayName) {
        this.transDisplayName = transDisplayName;
    }

    public Policy withTransDisplayName(String transDisplayName) {
        this.transDisplayName = transDisplayName;
        return this;
    }

    @JsonProperty("TransEffectiveDate")
    public String getTransEffectiveDate() {
        return transEffectiveDate;
    }

    @JsonProperty("TransEffectiveDate")
    public void setTransEffectiveDate(String transEffectiveDate) {
        this.transEffectiveDate = transEffectiveDate;
    }

    public Policy withTransEffectiveDate(String transEffectiveDate) {
        this.transEffectiveDate = transEffectiveDate;
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

    public Policy withWaivedPremium(String waivedPremium) {
        this.waivedPremium = waivedPremium;
        return this;
    }

    @JsonProperty("WaivePremium")
    public String getWaivePremium() {
        return waivePremium;
    }

    @JsonProperty("WaivePremium")
    public void setWaivePremium(String waivePremium) {
        this.waivePremium = waivePremium;
    }

    public Policy withWaivePremium(String waivePremium) {
        this.waivePremium = waivePremium;
        return this;
    }

    @JsonProperty("PremiumAttributes")
    public PremiumAttributes getPremiumAttributes() {
        return premiumAttributes;
    }

    @JsonProperty("PremiumAttributes")
    public void setPremiumAttributes(PremiumAttributes premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
    }

    public Policy withPremiumAttributes(PremiumAttributes premiumAttributes) {
        this.premiumAttributes = premiumAttributes;
        return this;
    }

    @JsonProperty("Insured")
    public List<Insured> getInsured() {
        return insured;
    }

    @JsonProperty("Insured")
    public void setInsured(List<Insured> insured) {
        this.insured = insured;
    }

    public Policy withInsured(List<Insured> insured) {
        this.insured = insured;
        return this;
    }

    @JsonProperty("Producer")
    public List<Producer> getProducer() {
        return producer;
    }

    @JsonProperty("Producer")
    public void setProducer(List<Producer> producer) {
        this.producer = producer;
    }

    public Policy withProducer(List<Producer> producer) {
        this.producer = producer;
        return this;
    }

    @JsonProperty("LOB_PH")
    public List<LobPh> getLobPh() {
        return lobPh;
    }

    @JsonProperty("LOB_PH")
    public void setLobPh(List<LobPh> lobPh) {
        this.lobPh = lobPh;
    }

    public Policy withLobPh(List<LobPh> lobPh) {
        this.lobPh = lobPh;
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

    public Policy withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Policy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adpPrefill");
        sb.append('=');
        sb.append(((this.adpPrefill == null)?"<null>":this.adpPrefill));
        sb.append(',');
        sb.append("binderFlag");
        sb.append('=');
        sb.append(((this.binderFlag == null)?"<null>":this.binderFlag));
        sb.append(',');
        sb.append("blacklstChrPattrn");
        sb.append('=');
        sb.append(((this.blacklstChrPattrn == null)?"<null>":this.blacklstChrPattrn));
        sb.append(',');
        sb.append("bookingDate");
        sb.append('=');
        sb.append(((this.bookingDate == null)?"<null>":this.bookingDate));
        sb.append(',');
        sb.append("bookingStatus");
        sb.append('=');
        sb.append(((this.bookingStatus == null)?"<null>":this.bookingStatus));
        sb.append(',');
        sb.append("bookingUser");
        sb.append('=');
        sb.append(((this.bookingUser == null)?"<null>":this.bookingUser));
        sb.append(',');
        sb.append("canWaivePremium");
        sb.append('=');
        sb.append(((this.canWaivePremium == null)?"<null>":this.canWaivePremium));
        sb.append(',');
        sb.append("companyCode");
        sb.append('=');
        sb.append(((this.companyCode == null)?"<null>":this.companyCode));
        sb.append(',');
        sb.append("companyName");
        sb.append('=');
        sb.append(((this.companyName == null)?"<null>":this.companyName));
        sb.append(',');
        sb.append("compositeRating");
        sb.append('=');
        sb.append(((this.compositeRating == null)?"<null>":this.compositeRating));
        sb.append(',');
        sb.append("controlDate");
        sb.append('=');
        sb.append(((this.controlDate == null)?"<null>":this.controlDate));
        sb.append(',');
        sb.append("customPackVersion");
        sb.append('=');
        sb.append(((this.customPackVersion == null)?"<null>":this.customPackVersion));
        sb.append(',');
        sb.append("customPolicyNumber");
        sb.append('=');
        sb.append(((this.customPolicyNumber == null)?"<null>":this.customPolicyNumber));
        sb.append(',');
        sb.append("customRevisionNumber");
        sb.append('=');
        sb.append(((this.customRevisionNumber == null)?"<null>":this.customRevisionNumber));
        sb.append(',');
        sb.append("displayPolicyNumber");
        sb.append('=');
        sb.append(((this.displayPolicyNumber == null)?"<null>":this.displayPolicyNumber));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("endorsementReason");
        sb.append('=');
        sb.append(((this.endorsementReason == null)?"<null>":this.endorsementReason));
        sb.append(',');
        sb.append("entityReference");
        sb.append('=');
        sb.append(((this.entityReference == null)?"<null>":this.entityReference));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
        sb.append(',');
        sb.append("isComReduct");
        sb.append('=');
        sb.append(((this.isComReduct == null)?"<null>":this.isComReduct));
        sb.append(',');
        sb.append("isCovManuallyRated");
        sb.append('=');
        sb.append(((this.isCovManuallyRated == null)?"<null>":this.isCovManuallyRated));
        sb.append(',');
        sb.append("isRebind");
        sb.append('=');
        sb.append(((this.isRebind == null)?"<null>":this.isRebind));
        sb.append(',');
        sb.append("isRewrite");
        sb.append('=');
        sb.append(((this.isRewrite == null)?"<null>":this.isRewrite));
        sb.append(',');
        sb.append("isSubjectToAudit");
        sb.append('=');
        sb.append(((this.isSubjectToAudit == null)?"<null>":this.isSubjectToAudit));
        sb.append(',');
        sb.append("masterQuote");
        sb.append('=');
        sb.append(((this.masterQuote == null)?"<null>":this.masterQuote));
        sb.append(',');
        sb.append("micVersion");
        sb.append('=');
        sb.append(((this.micVersion == null)?"<null>":this.micVersion));
        sb.append(',');
        sb.append("nextGenAudited");
        sb.append('=');
        sb.append(((this.nextGenAudited == null)?"<null>":this.nextGenAudited));
        sb.append(',');
        sb.append("noConflictOnRollfwd");
        sb.append('=');
        sb.append(((this.noConflictOnRollfwd == null)?"<null>":this.noConflictOnRollfwd));
        sb.append(',');
        sb.append("oldEntityReference");
        sb.append('=');
        sb.append(((this.oldEntityReference == null)?"<null>":this.oldEntityReference));
        sb.append(',');
        sb.append("oldEntityType");
        sb.append('=');
        sb.append(((this.oldEntityType == null)?"<null>":this.oldEntityType));
        sb.append(',');
        sb.append("onDemandReorder");
        sb.append('=');
        sb.append(((this.onDemandReorder == null)?"<null>":this.onDemandReorder));
        sb.append(',');
        sb.append("ooseVoidIndicator");
        sb.append('=');
        sb.append(((this.ooseVoidIndicator == null)?"<null>":this.ooseVoidIndicator));
        sb.append(',');
        sb.append("ordCarrReport");
        sb.append('=');
        sb.append(((this.ordCarrReport == null)?"<null>":this.ordCarrReport));
        sb.append(',');
        sb.append("orgEntityReference");
        sb.append('=');
        sb.append(((this.orgEntityReference == null)?"<null>":this.orgEntityReference));
        sb.append(',');
        sb.append("paperType");
        sb.append('=');
        sb.append(((this.paperType == null)?"<null>":this.paperType));
        sb.append(',');
        sb.append("pendingCanInd");
        sb.append('=');
        sb.append(((this.pendingCanInd == null)?"<null>":this.pendingCanInd));
        sb.append(',');
        sb.append("policyNumber");
        sb.append('=');
        sb.append(((this.policyNumber == null)?"<null>":this.policyNumber));
        sb.append(',');
        sb.append("policyQuoteIndicator");
        sb.append('=');
        sb.append(((this.policyQuoteIndicator == null)?"<null>":this.policyQuoteIndicator));
        sb.append(',');
        sb.append("polTerm");
        sb.append('=');
        sb.append(((this.polTerm == null)?"<null>":this.polTerm));
        sb.append(',');
        sb.append("polTermCode");
        sb.append('=');
        sb.append(((this.polTermCode == null)?"<null>":this.polTermCode));
        sb.append(',');
        sb.append("premiumRounding");
        sb.append('=');
        sb.append(((this.premiumRounding == null)?"<null>":this.premiumRounding));
        sb.append(',');
        sb.append("primaryRiskState");
        sb.append('=');
        sb.append(((this.primaryRiskState == null)?"<null>":this.primaryRiskState));
        sb.append(',');
        sb.append("productCode");
        sb.append('=');
        sb.append(((this.productCode == null)?"<null>":this.productCode));
        sb.append(',');
        sb.append("productName");
        sb.append('=');
        sb.append(((this.productName == null)?"<null>":this.productName));
        sb.append(',');
        sb.append("productVersion");
        sb.append('=');
        sb.append(((this.productVersion == null)?"<null>":this.productVersion));
        sb.append(',');
        sb.append("rateClicked");
        sb.append('=');
        sb.append(((this.rateClicked == null)?"<null>":this.rateClicked));
        sb.append(',');
        sb.append("ratingMode");
        sb.append('=');
        sb.append(((this.ratingMode == null)?"<null>":this.ratingMode));
        sb.append(',');
        sb.append("renewal");
        sb.append('=');
        sb.append(((this.renewal == null)?"<null>":this.renewal));
        sb.append(',');
        sb.append("renewalCounter");
        sb.append('=');
        sb.append(((this.renewalCounter == null)?"<null>":this.renewalCounter));
        sb.append(',');
        sb.append("renewalCounter2");
        sb.append('=');
        sb.append(((this.renewalCounter2 == null)?"<null>":this.renewalCounter2));
        sb.append(',');
        sb.append("renewalIndicator");
        sb.append('=');
        sb.append(((this.renewalIndicator == null)?"<null>":this.renewalIndicator));
        sb.append(',');
        sb.append("retainBtmFltEndr");
        sb.append('=');
        sb.append(((this.retainBtmFltEndr == null)?"<null>":this.retainBtmFltEndr));
        sb.append(',');
        sb.append("revisionNumber");
        sb.append('=');
        sb.append(((this.revisionNumber == null)?"<null>":this.revisionNumber));
        sb.append(',');
        sb.append("riskState");
        sb.append('=');
        sb.append(((this.riskState == null)?"<null>":this.riskState));
        sb.append(',');
        sb.append("riskStateStatCode");
        sb.append('=');
        sb.append(((this.riskStateStatCode == null)?"<null>":this.riskStateStatCode));
        sb.append(',');
        sb.append("sourceSystem");
        sb.append('=');
        sb.append(((this.sourceSystem == null)?"<null>":this.sourceSystem));
        sb.append(',');
        sb.append("totalAnnualColFee");
        sb.append('=');
        sb.append(((this.totalAnnualColFee == null)?"<null>":this.totalAnnualColFee));
        sb.append(',');
        sb.append("totalAnnualFee");
        sb.append('=');
        sb.append(((this.totalAnnualFee == null)?"<null>":this.totalAnnualFee));
        sb.append(',');
        sb.append("totalAnnualSurcharge");
        sb.append('=');
        sb.append(((this.totalAnnualSurcharge == null)?"<null>":this.totalAnnualSurcharge));
        sb.append(',');
        sb.append("totalAnnualTax");
        sb.append('=');
        sb.append(((this.totalAnnualTax == null)?"<null>":this.totalAnnualTax));
        sb.append(',');
        sb.append("totalFtermColFee");
        sb.append('=');
        sb.append(((this.totalFtermColFee == null)?"<null>":this.totalFtermColFee));
        sb.append(',');
        sb.append("totalFtermFee");
        sb.append('=');
        sb.append(((this.totalFtermFee == null)?"<null>":this.totalFtermFee));
        sb.append(',');
        sb.append("totalFtermSurcharge");
        sb.append('=');
        sb.append(((this.totalFtermSurcharge == null)?"<null>":this.totalFtermSurcharge));
        sb.append(',');
        sb.append("totalFtermTaxes");
        sb.append('=');
        sb.append(((this.totalFtermTaxes == null)?"<null>":this.totalFtermTaxes));
        sb.append(',');
        sb.append("totalSurcharge");
        sb.append('=');
        sb.append(((this.totalSurcharge == null)?"<null>":this.totalSurcharge));
        sb.append(',');
        sb.append("totalSurchargeFterm");
        sb.append('=');
        sb.append(((this.totalSurchargeFterm == null)?"<null>":this.totalSurchargeFterm));
        sb.append(',');
        sb.append("totalTransFee");
        sb.append('=');
        sb.append(((this.totalTransFee == null)?"<null>":this.totalTransFee));
        sb.append(',');
        sb.append("totalTransSurcharge");
        sb.append('=');
        sb.append(((this.totalTransSurcharge == null)?"<null>":this.totalTransSurcharge));
        sb.append(',');
        sb.append("transactionAction");
        sb.append('=');
        sb.append(((this.transactionAction == null)?"<null>":this.transactionAction));
        sb.append(',');
        sb.append("transactionCode");
        sb.append('=');
        sb.append(((this.transactionCode == null)?"<null>":this.transactionCode));
        sb.append(',');
        sb.append("transactionFactor");
        sb.append('=');
        sb.append(((this.transactionFactor == null)?"<null>":this.transactionFactor));
        sb.append(',');
        sb.append("transAccountingDate");
        sb.append('=');
        sb.append(((this.transAccountingDate == null)?"<null>":this.transAccountingDate));
        sb.append(',');
        sb.append("transAccountingMonth");
        sb.append('=');
        sb.append(((this.transAccountingMonth == null)?"<null>":this.transAccountingMonth));
        sb.append(',');
        sb.append("transAccountingYear");
        sb.append('=');
        sb.append(((this.transAccountingYear == null)?"<null>":this.transAccountingYear));
        sb.append(',');
        sb.append("transDisplayName");
        sb.append('=');
        sb.append(((this.transDisplayName == null)?"<null>":this.transDisplayName));
        sb.append(',');
        sb.append("transEffectiveDate");
        sb.append('=');
        sb.append(((this.transEffectiveDate == null)?"<null>":this.transEffectiveDate));
        sb.append(',');
        sb.append("waivedPremium");
        sb.append('=');
        sb.append(((this.waivedPremium == null)?"<null>":this.waivedPremium));
        sb.append(',');
        sb.append("waivePremium");
        sb.append('=');
        sb.append(((this.waivePremium == null)?"<null>":this.waivePremium));
        sb.append(',');
        sb.append("premiumAttributes");
        sb.append('=');
        sb.append(((this.premiumAttributes == null)?"<null>":this.premiumAttributes));
        sb.append(',');
        sb.append("insured");
        sb.append('=');
        sb.append(((this.insured == null)?"<null>":this.insured));
        sb.append(',');
        sb.append("producer");
        sb.append('=');
        sb.append(((this.producer == null)?"<null>":this.producer));
        sb.append(',');
        sb.append("lobPh");
        sb.append('=');
        sb.append(((this.lobPh == null)?"<null>":this.lobPh));
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
        result = ((result* 31)+((this.renewalCounter == null)? 0 :this.renewalCounter.hashCode()));
        result = ((result* 31)+((this.riskStateStatCode == null)? 0 :this.riskStateStatCode.hashCode()));
        result = ((result* 31)+((this.isSubjectToAudit == null)? 0 :this.isSubjectToAudit.hashCode()));
        result = ((result* 31)+((this.revisionNumber == null)? 0 :this.revisionNumber.hashCode()));
        result = ((result* 31)+((this.renewalCounter2 == null)? 0 :this.renewalCounter2 .hashCode()));
        result = ((result* 31)+((this.companyName == null)? 0 :this.companyName.hashCode()));
        result = ((result* 31)+((this.policyNumber == null)? 0 :this.policyNumber.hashCode()));
        result = ((result* 31)+((this.micVersion == null)? 0 :this.micVersion.hashCode()));
        result = ((result* 31)+((this.productName == null)? 0 :this.productName.hashCode()));
        result = ((result* 31)+((this.controlDate == null)? 0 :this.controlDate.hashCode()));
        result = ((result* 31)+((this.isRewrite == null)? 0 :this.isRewrite.hashCode()));
        result = ((result* 31)+((this.productVersion == null)? 0 :this.productVersion.hashCode()));
        result = ((result* 31)+((this.compositeRating == null)? 0 :this.compositeRating.hashCode()));
        result = ((result* 31)+((this.binderFlag == null)? 0 :this.binderFlag.hashCode()));
        result = ((result* 31)+((this.entityReference == null)? 0 :this.entityReference.hashCode()));
        result = ((result* 31)+((this.transactionFactor == null)? 0 :this.transactionFactor.hashCode()));
        result = ((result* 31)+((this.displayPolicyNumber == null)? 0 :this.displayPolicyNumber.hashCode()));
        result = ((result* 31)+((this.primaryRiskState == null)? 0 :this.primaryRiskState.hashCode()));
        result = ((result* 31)+((this.bookingStatus == null)? 0 :this.bookingStatus.hashCode()));
        result = ((result* 31)+((this.riskState == null)? 0 :this.riskState.hashCode()));
        result = ((result* 31)+((this.premiumAttributes == null)? 0 :this.premiumAttributes.hashCode()));
        result = ((result* 31)+((this.noConflictOnRollfwd == null)? 0 :this.noConflictOnRollfwd.hashCode()));
        result = ((result* 31)+((this.companyCode == null)? 0 :this.companyCode.hashCode()));
        result = ((result* 31)+((this.rateClicked == null)? 0 :this.rateClicked.hashCode()));
        result = ((result* 31)+((this.customPackVersion == null)? 0 :this.customPackVersion.hashCode()));
        result = ((result* 31)+((this.paperType == null)? 0 :this.paperType.hashCode()));
        result = ((result* 31)+((this.totalSurchargeFterm == null)? 0 :this.totalSurchargeFterm.hashCode()));
        result = ((result* 31)+((this.transDisplayName == null)? 0 :this.transDisplayName.hashCode()));
        result = ((result* 31)+((this.transAccountingDate == null)? 0 :this.transAccountingDate.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.isCovManuallyRated == null)? 0 :this.isCovManuallyRated.hashCode()));
        result = ((result* 31)+((this.transactionCode == null)? 0 :this.transactionCode.hashCode()));
        result = ((result* 31)+((this.transAccountingYear == null)? 0 :this.transAccountingYear.hashCode()));
        result = ((result* 31)+((this.waivedPremium == null)? 0 :this.waivedPremium.hashCode()));
        result = ((result* 31)+((this.lobPh == null)? 0 :this.lobPh.hashCode()));
        result = ((result* 31)+((this.transEffectiveDate == null)? 0 :this.transEffectiveDate.hashCode()));
        result = ((result* 31)+((this.totalAnnualColFee == null)? 0 :this.totalAnnualColFee.hashCode()));
        result = ((result* 31)+((this.oldEntityReference == null)? 0 :this.oldEntityReference.hashCode()));
        result = ((result* 31)+((this.producer == null)? 0 :this.producer.hashCode()));
        result = ((result* 31)+((this.bookingDate == null)? 0 :this.bookingDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.customRevisionNumber == null)? 0 :this.customRevisionNumber.hashCode()));
        result = ((result* 31)+((this.masterQuote == null)? 0 :this.masterQuote.hashCode()));
        result = ((result* 31)+((this.blacklstChrPattrn == null)? 0 :this.blacklstChrPattrn.hashCode()));
        result = ((result* 31)+((this.oldEntityType == null)? 0 :this.oldEntityType.hashCode()));
        result = ((result* 31)+((this.orgEntityReference == null)? 0 :this.orgEntityReference.hashCode()));
        result = ((result* 31)+((this.polTermCode == null)? 0 :this.polTermCode.hashCode()));
        result = ((result* 31)+((this.transactionAction == null)? 0 :this.transactionAction.hashCode()));
        result = ((result* 31)+((this.insured == null)? 0 :this.insured.hashCode()));
        result = ((result* 31)+((this.isComReduct == null)? 0 :this.isComReduct.hashCode()));
        result = ((result* 31)+((this.sourceSystem == null)? 0 :this.sourceSystem.hashCode()));
        result = ((result* 31)+((this.totalFtermSurcharge == null)? 0 :this.totalFtermSurcharge.hashCode()));
        result = ((result* 31)+((this.isRebind == null)? 0 :this.isRebind.hashCode()));
        result = ((result* 31)+((this.ooseVoidIndicator == null)? 0 :this.ooseVoidIndicator.hashCode()));
        result = ((result* 31)+((this.totalSurcharge == null)? 0 :this.totalSurcharge.hashCode()));
        result = ((result* 31)+((this.totalFtermFee == null)? 0 :this.totalFtermFee.hashCode()));
        result = ((result* 31)+((this.totalFtermTaxes == null)? 0 :this.totalFtermTaxes.hashCode()));
        result = ((result* 31)+((this.totalTransFee == null)? 0 :this.totalTransFee.hashCode()));
        result = ((result* 31)+((this.renewalIndicator == null)? 0 :this.renewalIndicator.hashCode()));
        result = ((result* 31)+((this.totalTransSurcharge == null)? 0 :this.totalTransSurcharge.hashCode()));
        result = ((result* 31)+((this.nextGenAudited == null)? 0 :this.nextGenAudited.hashCode()));
        result = ((result* 31)+((this.totalAnnualSurcharge == null)? 0 :this.totalAnnualSurcharge.hashCode()));
        result = ((result* 31)+((this.waivePremium == null)? 0 :this.waivePremium.hashCode()));
        result = ((result* 31)+((this.ordCarrReport == null)? 0 :this.ordCarrReport.hashCode()));
        result = ((result* 31)+((this.pendingCanInd == null)? 0 :this.pendingCanInd.hashCode()));
        result = ((result* 31)+((this.totalAnnualTax == null)? 0 :this.totalAnnualTax.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        result = ((result* 31)+((this.onDemandReorder == null)? 0 :this.onDemandReorder.hashCode()));
        result = ((result* 31)+((this.bookingUser == null)? 0 :this.bookingUser.hashCode()));
        result = ((result* 31)+((this.transAccountingMonth == null)? 0 :this.transAccountingMonth.hashCode()));
        result = ((result* 31)+((this.endorsementReason == null)? 0 :this.endorsementReason.hashCode()));
        result = ((result* 31)+((this.polTerm == null)? 0 :this.polTerm.hashCode()));
        result = ((result* 31)+((this.renewal == null)? 0 :this.renewal.hashCode()));
        result = ((result* 31)+((this.totalFtermColFee == null)? 0 :this.totalFtermColFee.hashCode()));
        result = ((result* 31)+((this.canWaivePremium == null)? 0 :this.canWaivePremium.hashCode()));
        result = ((result* 31)+((this.retainBtmFltEndr == null)? 0 :this.retainBtmFltEndr.hashCode()));
        result = ((result* 31)+((this.policyQuoteIndicator == null)? 0 :this.policyQuoteIndicator.hashCode()));
        result = ((result* 31)+((this.productCode == null)? 0 :this.productCode.hashCode()));
        result = ((result* 31)+((this.totalAnnualFee == null)? 0 :this.totalAnnualFee.hashCode()));
        result = ((result* 31)+((this.adpPrefill == null)? 0 :this.adpPrefill.hashCode()));
        result = ((result* 31)+((this.premiumRounding == null)? 0 :this.premiumRounding.hashCode()));
        result = ((result* 31)+((this.customPolicyNumber == null)? 0 :this.customPolicyNumber.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.ratingMode == null)? 0 :this.ratingMode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Policy) == false) {
            return false;
        }
        Policy rhs = ((Policy) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.renewalCounter == rhs.renewalCounter)||((this.renewalCounter!= null)&&this.renewalCounter.equals(rhs.renewalCounter)))&&((this.riskStateStatCode == rhs.riskStateStatCode)||((this.riskStateStatCode!= null)&&this.riskStateStatCode.equals(rhs.riskStateStatCode))))&&((this.isSubjectToAudit == rhs.isSubjectToAudit)||((this.isSubjectToAudit!= null)&&this.isSubjectToAudit.equals(rhs.isSubjectToAudit))))&&((this.revisionNumber == rhs.revisionNumber)||((this.revisionNumber!= null)&&this.revisionNumber.equals(rhs.revisionNumber))))&&((this.renewalCounter2 == rhs.renewalCounter2)||((this.renewalCounter2 != null)&&this.renewalCounter2 .equals(rhs.renewalCounter2))))&&((this.companyName == rhs.companyName)||((this.companyName!= null)&&this.companyName.equals(rhs.companyName))))&&((this.policyNumber == rhs.policyNumber)||((this.policyNumber!= null)&&this.policyNumber.equals(rhs.policyNumber))))&&((this.micVersion == rhs.micVersion)||((this.micVersion!= null)&&this.micVersion.equals(rhs.micVersion))))&&((this.productName == rhs.productName)||((this.productName!= null)&&this.productName.equals(rhs.productName))))&&((this.controlDate == rhs.controlDate)||((this.controlDate!= null)&&this.controlDate.equals(rhs.controlDate))))&&((this.isRewrite == rhs.isRewrite)||((this.isRewrite!= null)&&this.isRewrite.equals(rhs.isRewrite))))&&((this.productVersion == rhs.productVersion)||((this.productVersion!= null)&&this.productVersion.equals(rhs.productVersion))))&&((this.compositeRating == rhs.compositeRating)||((this.compositeRating!= null)&&this.compositeRating.equals(rhs.compositeRating))))&&((this.binderFlag == rhs.binderFlag)||((this.binderFlag!= null)&&this.binderFlag.equals(rhs.binderFlag))))&&((this.entityReference == rhs.entityReference)||((this.entityReference!= null)&&this.entityReference.equals(rhs.entityReference))))&&((this.transactionFactor == rhs.transactionFactor)||((this.transactionFactor!= null)&&this.transactionFactor.equals(rhs.transactionFactor))))&&((this.displayPolicyNumber == rhs.displayPolicyNumber)||((this.displayPolicyNumber!= null)&&this.displayPolicyNumber.equals(rhs.displayPolicyNumber))))&&((this.primaryRiskState == rhs.primaryRiskState)||((this.primaryRiskState!= null)&&this.primaryRiskState.equals(rhs.primaryRiskState))))&&((this.bookingStatus == rhs.bookingStatus)||((this.bookingStatus!= null)&&this.bookingStatus.equals(rhs.bookingStatus))))&&((this.riskState == rhs.riskState)||((this.riskState!= null)&&this.riskState.equals(rhs.riskState))))&&((this.premiumAttributes == rhs.premiumAttributes)||((this.premiumAttributes!= null)&&this.premiumAttributes.equals(rhs.premiumAttributes))))&&((this.noConflictOnRollfwd == rhs.noConflictOnRollfwd)||((this.noConflictOnRollfwd!= null)&&this.noConflictOnRollfwd.equals(rhs.noConflictOnRollfwd))))&&((this.companyCode == rhs.companyCode)||((this.companyCode!= null)&&this.companyCode.equals(rhs.companyCode))))&&((this.rateClicked == rhs.rateClicked)||((this.rateClicked!= null)&&this.rateClicked.equals(rhs.rateClicked))))&&((this.customPackVersion == rhs.customPackVersion)||((this.customPackVersion!= null)&&this.customPackVersion.equals(rhs.customPackVersion))))&&((this.paperType == rhs.paperType)||((this.paperType!= null)&&this.paperType.equals(rhs.paperType))))&&((this.totalSurchargeFterm == rhs.totalSurchargeFterm)||((this.totalSurchargeFterm!= null)&&this.totalSurchargeFterm.equals(rhs.totalSurchargeFterm))))&&((this.transDisplayName == rhs.transDisplayName)||((this.transDisplayName!= null)&&this.transDisplayName.equals(rhs.transDisplayName))))&&((this.transAccountingDate == rhs.transAccountingDate)||((this.transAccountingDate!= null)&&this.transAccountingDate.equals(rhs.transAccountingDate))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.isCovManuallyRated == rhs.isCovManuallyRated)||((this.isCovManuallyRated!= null)&&this.isCovManuallyRated.equals(rhs.isCovManuallyRated))))&&((this.transactionCode == rhs.transactionCode)||((this.transactionCode!= null)&&this.transactionCode.equals(rhs.transactionCode))))&&((this.transAccountingYear == rhs.transAccountingYear)||((this.transAccountingYear!= null)&&this.transAccountingYear.equals(rhs.transAccountingYear))))&&((this.waivedPremium == rhs.waivedPremium)||((this.waivedPremium!= null)&&this.waivedPremium.equals(rhs.waivedPremium))))&&((this.lobPh == rhs.lobPh)||((this.lobPh!= null)&&this.lobPh.equals(rhs.lobPh))))&&((this.transEffectiveDate == rhs.transEffectiveDate)||((this.transEffectiveDate!= null)&&this.transEffectiveDate.equals(rhs.transEffectiveDate))))&&((this.totalAnnualColFee == rhs.totalAnnualColFee)||((this.totalAnnualColFee!= null)&&this.totalAnnualColFee.equals(rhs.totalAnnualColFee))))&&((this.oldEntityReference == rhs.oldEntityReference)||((this.oldEntityReference!= null)&&this.oldEntityReference.equals(rhs.oldEntityReference))))&&((this.producer == rhs.producer)||((this.producer!= null)&&this.producer.equals(rhs.producer))))&&((this.bookingDate == rhs.bookingDate)||((this.bookingDate!= null)&&this.bookingDate.equals(rhs.bookingDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.customRevisionNumber == rhs.customRevisionNumber)||((this.customRevisionNumber!= null)&&this.customRevisionNumber.equals(rhs.customRevisionNumber))))&&((this.masterQuote == rhs.masterQuote)||((this.masterQuote!= null)&&this.masterQuote.equals(rhs.masterQuote))))&&((this.blacklstChrPattrn == rhs.blacklstChrPattrn)||((this.blacklstChrPattrn!= null)&&this.blacklstChrPattrn.equals(rhs.blacklstChrPattrn))))&&((this.oldEntityType == rhs.oldEntityType)||((this.oldEntityType!= null)&&this.oldEntityType.equals(rhs.oldEntityType))))&&((this.orgEntityReference == rhs.orgEntityReference)||((this.orgEntityReference!= null)&&this.orgEntityReference.equals(rhs.orgEntityReference))))&&((this.polTermCode == rhs.polTermCode)||((this.polTermCode!= null)&&this.polTermCode.equals(rhs.polTermCode))))&&((this.transactionAction == rhs.transactionAction)||((this.transactionAction!= null)&&this.transactionAction.equals(rhs.transactionAction))))&&((this.insured == rhs.insured)||((this.insured!= null)&&this.insured.equals(rhs.insured))))&&((this.isComReduct == rhs.isComReduct)||((this.isComReduct!= null)&&this.isComReduct.equals(rhs.isComReduct))))&&((this.sourceSystem == rhs.sourceSystem)||((this.sourceSystem!= null)&&this.sourceSystem.equals(rhs.sourceSystem))))&&((this.totalFtermSurcharge == rhs.totalFtermSurcharge)||((this.totalFtermSurcharge!= null)&&this.totalFtermSurcharge.equals(rhs.totalFtermSurcharge))))&&((this.isRebind == rhs.isRebind)||((this.isRebind!= null)&&this.isRebind.equals(rhs.isRebind))))&&((this.ooseVoidIndicator == rhs.ooseVoidIndicator)||((this.ooseVoidIndicator!= null)&&this.ooseVoidIndicator.equals(rhs.ooseVoidIndicator))))&&((this.totalSurcharge == rhs.totalSurcharge)||((this.totalSurcharge!= null)&&this.totalSurcharge.equals(rhs.totalSurcharge))))&&((this.totalFtermFee == rhs.totalFtermFee)||((this.totalFtermFee!= null)&&this.totalFtermFee.equals(rhs.totalFtermFee))))&&((this.totalFtermTaxes == rhs.totalFtermTaxes)||((this.totalFtermTaxes!= null)&&this.totalFtermTaxes.equals(rhs.totalFtermTaxes))))&&((this.totalTransFee == rhs.totalTransFee)||((this.totalTransFee!= null)&&this.totalTransFee.equals(rhs.totalTransFee))))&&((this.renewalIndicator == rhs.renewalIndicator)||((this.renewalIndicator!= null)&&this.renewalIndicator.equals(rhs.renewalIndicator))))&&((this.totalTransSurcharge == rhs.totalTransSurcharge)||((this.totalTransSurcharge!= null)&&this.totalTransSurcharge.equals(rhs.totalTransSurcharge))))&&((this.nextGenAudited == rhs.nextGenAudited)||((this.nextGenAudited!= null)&&this.nextGenAudited.equals(rhs.nextGenAudited))))&&((this.totalAnnualSurcharge == rhs.totalAnnualSurcharge)||((this.totalAnnualSurcharge!= null)&&this.totalAnnualSurcharge.equals(rhs.totalAnnualSurcharge))))&&((this.waivePremium == rhs.waivePremium)||((this.waivePremium!= null)&&this.waivePremium.equals(rhs.waivePremium))))&&((this.ordCarrReport == rhs.ordCarrReport)||((this.ordCarrReport!= null)&&this.ordCarrReport.equals(rhs.ordCarrReport))))&&((this.pendingCanInd == rhs.pendingCanInd)||((this.pendingCanInd!= null)&&this.pendingCanInd.equals(rhs.pendingCanInd))))&&((this.totalAnnualTax == rhs.totalAnnualTax)||((this.totalAnnualTax!= null)&&this.totalAnnualTax.equals(rhs.totalAnnualTax))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))))&&((this.onDemandReorder == rhs.onDemandReorder)||((this.onDemandReorder!= null)&&this.onDemandReorder.equals(rhs.onDemandReorder))))&&((this.bookingUser == rhs.bookingUser)||((this.bookingUser!= null)&&this.bookingUser.equals(rhs.bookingUser))))&&((this.transAccountingMonth == rhs.transAccountingMonth)||((this.transAccountingMonth!= null)&&this.transAccountingMonth.equals(rhs.transAccountingMonth))))&&((this.endorsementReason == rhs.endorsementReason)||((this.endorsementReason!= null)&&this.endorsementReason.equals(rhs.endorsementReason))))&&((this.polTerm == rhs.polTerm)||((this.polTerm!= null)&&this.polTerm.equals(rhs.polTerm))))&&((this.renewal == rhs.renewal)||((this.renewal!= null)&&this.renewal.equals(rhs.renewal))))&&((this.totalFtermColFee == rhs.totalFtermColFee)||((this.totalFtermColFee!= null)&&this.totalFtermColFee.equals(rhs.totalFtermColFee))))&&((this.canWaivePremium == rhs.canWaivePremium)||((this.canWaivePremium!= null)&&this.canWaivePremium.equals(rhs.canWaivePremium))))&&((this.retainBtmFltEndr == rhs.retainBtmFltEndr)||((this.retainBtmFltEndr!= null)&&this.retainBtmFltEndr.equals(rhs.retainBtmFltEndr))))&&((this.policyQuoteIndicator == rhs.policyQuoteIndicator)||((this.policyQuoteIndicator!= null)&&this.policyQuoteIndicator.equals(rhs.policyQuoteIndicator))))&&((this.productCode == rhs.productCode)||((this.productCode!= null)&&this.productCode.equals(rhs.productCode))))&&((this.totalAnnualFee == rhs.totalAnnualFee)||((this.totalAnnualFee!= null)&&this.totalAnnualFee.equals(rhs.totalAnnualFee))))&&((this.adpPrefill == rhs.adpPrefill)||((this.adpPrefill!= null)&&this.adpPrefill.equals(rhs.adpPrefill))))&&((this.premiumRounding == rhs.premiumRounding)||((this.premiumRounding!= null)&&this.premiumRounding.equals(rhs.premiumRounding))))&&((this.customPolicyNumber == rhs.customPolicyNumber)||((this.customPolicyNumber!= null)&&this.customPolicyNumber.equals(rhs.customPolicyNumber))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.ratingMode == rhs.ratingMode)||((this.ratingMode!= null)&&this.ratingMode.equals(rhs.ratingMode))));
    }

}
