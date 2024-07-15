
package com.example.inpost.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday",
    "sunday"
})
@Generated("jsonschema2pojo")
public class Customer {

    @JsonProperty("monday")
    private List<Monday> monday;
    @JsonProperty("tuesday")
    private List<Tuesday> tuesday;
    @JsonProperty("wednesday")
    private List<Wednesday> wednesday;
    @JsonProperty("thursday")
    private List<Thursday> thursday;
    @JsonProperty("friday")
    private List<Friday> friday;
    @JsonProperty("saturday")
    private List<Saturday> saturday;
    @JsonProperty("sunday")
    private List<Object> sunday;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("monday")
    public List<Monday> getMonday() {
        return monday;
    }

    @JsonProperty("monday")
    public void setMonday(List<Monday> monday) {
        this.monday = monday;
    }

    @JsonProperty("tuesday")
    public List<Tuesday> getTuesday() {
        return tuesday;
    }

    @JsonProperty("tuesday")
    public void setTuesday(List<Tuesday> tuesday) {
        this.tuesday = tuesday;
    }

    @JsonProperty("wednesday")
    public List<Wednesday> getWednesday() {
        return wednesday;
    }

    @JsonProperty("wednesday")
    public void setWednesday(List<Wednesday> wednesday) {
        this.wednesday = wednesday;
    }

    @JsonProperty("thursday")
    public List<Thursday> getThursday() {
        return thursday;
    }

    @JsonProperty("thursday")
    public void setThursday(List<Thursday> thursday) {
        this.thursday = thursday;
    }

    @JsonProperty("friday")
    public List<Friday> getFriday() {
        return friday;
    }

    @JsonProperty("friday")
    public void setFriday(List<Friday> friday) {
        this.friday = friday;
    }

    @JsonProperty("saturday")
    public List<Saturday> getSaturday() {
        return saturday;
    }

    @JsonProperty("saturday")
    public void setSaturday(List<Saturday> saturday) {
        this.saturday = saturday;
    }

    @JsonProperty("sunday")
    public List<Object> getSunday() {
        return sunday;
    }

    @JsonProperty("sunday")
    public void setSunday(List<Object> sunday) {
        this.sunday = sunday;
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
