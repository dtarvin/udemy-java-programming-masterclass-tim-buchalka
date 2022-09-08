
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
    "AnnualPremium",
    "BalanceToMinimum",
    "CommissionablePremium",
    "FullTermPremium",
    "TransactionPremium",
    "TransPremNotSubToAud",
    "WrittenPremium"
})
@Generated("jsonschema2pojo")
public class PremiumAttributes__9 {

    @JsonProperty("AnnualPremium")
    private String annualPremium;
    @JsonProperty("BalanceToMinimum")
    private String balanceToMinimum;
    @JsonProperty("CommissionablePremium")
    private String commissionablePremium;
    @JsonProperty("FullTermPremium")
    private String fullTermPremium;
    @JsonProperty("TransactionPremium")
    private String transactionPremium;
    @JsonProperty("TransPremNotSubToAud")
    private String transPremNotSubToAud;
    @JsonProperty("WrittenPremium")
    private String writtenPremium;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AnnualPremium")
    public String getAnnualPremium() {
        return annualPremium;
    }

    @JsonProperty("AnnualPremium")
    public void setAnnualPremium(String annualPremium) {
        this.annualPremium = annualPremium;
    }

    public PremiumAttributes__9 withAnnualPremium(String annualPremium) {
        this.annualPremium = annualPremium;
        return this;
    }

    @JsonProperty("BalanceToMinimum")
    public String getBalanceToMinimum() {
        return balanceToMinimum;
    }

    @JsonProperty("BalanceToMinimum")
    public void setBalanceToMinimum(String balanceToMinimum) {
        this.balanceToMinimum = balanceToMinimum;
    }

    public PremiumAttributes__9 withBalanceToMinimum(String balanceToMinimum) {
        this.balanceToMinimum = balanceToMinimum;
        return this;
    }

    @JsonProperty("CommissionablePremium")
    public String getCommissionablePremium() {
        return commissionablePremium;
    }

    @JsonProperty("CommissionablePremium")
    public void setCommissionablePremium(String commissionablePremium) {
        this.commissionablePremium = commissionablePremium;
    }

    public PremiumAttributes__9 withCommissionablePremium(String commissionablePremium) {
        this.commissionablePremium = commissionablePremium;
        return this;
    }

    @JsonProperty("FullTermPremium")
    public String getFullTermPremium() {
        return fullTermPremium;
    }

    @JsonProperty("FullTermPremium")
    public void setFullTermPremium(String fullTermPremium) {
        this.fullTermPremium = fullTermPremium;
    }

    public PremiumAttributes__9 withFullTermPremium(String fullTermPremium) {
        this.fullTermPremium = fullTermPremium;
        return this;
    }

    @JsonProperty("TransactionPremium")
    public String getTransactionPremium() {
        return transactionPremium;
    }

    @JsonProperty("TransactionPremium")
    public void setTransactionPremium(String transactionPremium) {
        this.transactionPremium = transactionPremium;
    }

    public PremiumAttributes__9 withTransactionPremium(String transactionPremium) {
        this.transactionPremium = transactionPremium;
        return this;
    }

    @JsonProperty("TransPremNotSubToAud")
    public String getTransPremNotSubToAud() {
        return transPremNotSubToAud;
    }

    @JsonProperty("TransPremNotSubToAud")
    public void setTransPremNotSubToAud(String transPremNotSubToAud) {
        this.transPremNotSubToAud = transPremNotSubToAud;
    }

    public PremiumAttributes__9 withTransPremNotSubToAud(String transPremNotSubToAud) {
        this.transPremNotSubToAud = transPremNotSubToAud;
        return this;
    }

    @JsonProperty("WrittenPremium")
    public String getWrittenPremium() {
        return writtenPremium;
    }

    @JsonProperty("WrittenPremium")
    public void setWrittenPremium(String writtenPremium) {
        this.writtenPremium = writtenPremium;
    }

    public PremiumAttributes__9 withWrittenPremium(String writtenPremium) {
        this.writtenPremium = writtenPremium;
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

    public PremiumAttributes__9 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PremiumAttributes__9 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annualPremium");
        sb.append('=');
        sb.append(((this.annualPremium == null)?"<null>":this.annualPremium));
        sb.append(',');
        sb.append("balanceToMinimum");
        sb.append('=');
        sb.append(((this.balanceToMinimum == null)?"<null>":this.balanceToMinimum));
        sb.append(',');
        sb.append("commissionablePremium");
        sb.append('=');
        sb.append(((this.commissionablePremium == null)?"<null>":this.commissionablePremium));
        sb.append(',');
        sb.append("fullTermPremium");
        sb.append('=');
        sb.append(((this.fullTermPremium == null)?"<null>":this.fullTermPremium));
        sb.append(',');
        sb.append("transactionPremium");
        sb.append('=');
        sb.append(((this.transactionPremium == null)?"<null>":this.transactionPremium));
        sb.append(',');
        sb.append("transPremNotSubToAud");
        sb.append('=');
        sb.append(((this.transPremNotSubToAud == null)?"<null>":this.transPremNotSubToAud));
        sb.append(',');
        sb.append("writtenPremium");
        sb.append('=');
        sb.append(((this.writtenPremium == null)?"<null>":this.writtenPremium));
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
        result = ((result* 31)+((this.commissionablePremium == null)? 0 :this.commissionablePremium.hashCode()));
        result = ((result* 31)+((this.fullTermPremium == null)? 0 :this.fullTermPremium.hashCode()));
        result = ((result* 31)+((this.annualPremium == null)? 0 :this.annualPremium.hashCode()));
        result = ((result* 31)+((this.balanceToMinimum == null)? 0 :this.balanceToMinimum.hashCode()));
        result = ((result* 31)+((this.writtenPremium == null)? 0 :this.writtenPremium.hashCode()));
        result = ((result* 31)+((this.transactionPremium == null)? 0 :this.transactionPremium.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.transPremNotSubToAud == null)? 0 :this.transPremNotSubToAud.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PremiumAttributes__9) == false) {
            return false;
        }
        PremiumAttributes__9 rhs = ((PremiumAttributes__9) other);
        return (((((((((this.commissionablePremium == rhs.commissionablePremium)||((this.commissionablePremium!= null)&&this.commissionablePremium.equals(rhs.commissionablePremium)))&&((this.fullTermPremium == rhs.fullTermPremium)||((this.fullTermPremium!= null)&&this.fullTermPremium.equals(rhs.fullTermPremium))))&&((this.annualPremium == rhs.annualPremium)||((this.annualPremium!= null)&&this.annualPremium.equals(rhs.annualPremium))))&&((this.balanceToMinimum == rhs.balanceToMinimum)||((this.balanceToMinimum!= null)&&this.balanceToMinimum.equals(rhs.balanceToMinimum))))&&((this.writtenPremium == rhs.writtenPremium)||((this.writtenPremium!= null)&&this.writtenPremium.equals(rhs.writtenPremium))))&&((this.transactionPremium == rhs.transactionPremium)||((this.transactionPremium!= null)&&this.transactionPremium.equals(rhs.transactionPremium))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.transPremNotSubToAud == rhs.transPremNotSubToAud)||((this.transPremNotSubToAud!= null)&&this.transPremNotSubToAud.equals(rhs.transPremNotSubToAud))));
    }

}
