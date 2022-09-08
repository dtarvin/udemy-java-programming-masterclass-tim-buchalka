
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
    "Policy",
    "PolicyStatus"
})
@Generated("jsonschema2pojo")
public class Input {

    @JsonProperty("Policy")
    private Policy policy;
    @JsonProperty("PolicyStatus")
    private PolicyStatus policyStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Policy")
    public Policy getPolicy() {
        return policy;
    }

    @JsonProperty("Policy")
    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public Input withPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }

    @JsonProperty("PolicyStatus")
    public PolicyStatus getPolicyStatus() {
        return policyStatus;
    }

    @JsonProperty("PolicyStatus")
    public void setPolicyStatus(PolicyStatus policyStatus) {
        this.policyStatus = policyStatus;
    }

    public Input withPolicyStatus(PolicyStatus policyStatus) {
        this.policyStatus = policyStatus;
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

    public Input withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Input.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("policy");
        sb.append('=');
        sb.append(((this.policy == null)?"<null>":this.policy));
        sb.append(',');
        sb.append("policyStatus");
        sb.append('=');
        sb.append(((this.policyStatus == null)?"<null>":this.policyStatus));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.policyStatus == null)? 0 :this.policyStatus.hashCode()));
        result = ((result* 31)+((this.policy == null)? 0 :this.policy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Input) == false) {
            return false;
        }
        Input rhs = ((Input) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.policyStatus == rhs.policyStatus)||((this.policyStatus!= null)&&this.policyStatus.equals(rhs.policyStatus))))&&((this.policy == rhs.policy)||((this.policy!= null)&&this.policy.equals(rhs.policy))));
    }

}
