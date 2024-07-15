
package com.example.inpost.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "city",
    "province",
    "post_code",
    "street",
    "building_number",
    "flat_number"
})
@Generated("jsonschema2pojo")
public class AddressDetails {

    @JsonProperty("city")
    private String city;
    @JsonProperty("province")
    private String province;
    @SerializedName("post_code")
    private String postCode;
    @JsonProperty("street")
    private String street;
    @JsonProperty("building_number")
    private String buildingNumber;
    @JsonProperty("flat_number")
    private Object flatNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    @JsonProperty("post_code")
    public String getPostCode() {
        return postCode;
    }

    @JsonProperty("post_code")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("building_number")
    public String getBuildingNumber() {
        return buildingNumber;
    }

    @JsonProperty("building_number")
    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    @JsonProperty("flat_number")
    public Object getFlatNumber() {
        return flatNumber;
    }

    @JsonProperty("flat_number")
    public void setFlatNumber(Object flatNumber) {
        this.flatNumber = flatNumber;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
