
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
import com.google.gson.annotations.SerializedName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "href",
    "name",
    "type",
    "status",
    "location",
    "location_type",
    "location_date",
    "location_description",
    "location_description_1",
    "location_description_2",
    "distance",
    "opening_hours",
    "address",
    "address_details",
    "phone_number",
    "payment_point_descr",
    "functions",
    "partner_id",
    "is_next",
    "payment_available",
    "payment_type",
    "virtual",
    "recommended_low_interest_box_machines_list",
    "apm_doubled",
    "location_247",
    "operating_hours_extended",
    "agency",
    "image_url",
    "easy_access_zone",
    "air_index_level",
    "physical_type_mapped",
    "physical_type_description"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("href")
    private String href;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private List<String> type;
    @JsonProperty("status")
    private String status;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("location_type")
    private Object locationType;
    @JsonProperty("location_date")
    private Object locationDate;
    @JsonProperty("location_description")
    private String locationDescription;
    @JsonProperty("location_description_1")
    private String locationDescription1;
    @JsonProperty("location_description_2")
    private Object locationDescription2;
    @JsonProperty("distance")
    private Object distance;
    @JsonProperty("opening_hours")
    private String openingHours;
    @JsonProperty("address")
    private Address address;
    @SerializedName("address_details")
    private AddressDetails addressDetails;
    @JsonProperty("phone_number")
    private Object phoneNumber;
    @JsonProperty("payment_point_descr")
    private String paymentPointDescr;
    @JsonProperty("functions")
    private List<String> functions;
    @JsonProperty("partner_id")
    private Integer partnerId;
    @JsonProperty("is_next")
    private Boolean isNext;
    @JsonProperty("payment_available")
    private Boolean paymentAvailable;
    @JsonProperty("payment_type")
    private PaymentType paymentType;
    @JsonProperty("virtual")
    private String virtual;
    @JsonProperty("recommended_low_interest_box_machines_list")
    private Object recommendedLowInterestBoxMachinesList;
    @JsonProperty("apm_doubled")
    private Object apmDoubled;
    @JsonProperty("location_247")
    private Boolean location247;
    @JsonProperty("operating_hours_extended")
    private OperatingHoursExtended operatingHoursExtended;
    @JsonProperty("agency")
    private String agency;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("easy_access_zone")
    private Boolean easyAccessZone;
    @JsonProperty("air_index_level")
    private Object airIndexLevel;
    @JsonProperty("physical_type_mapped")
    private Object physicalTypeMapped;
    @JsonProperty("physical_type_description")
    private Object physicalTypeDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public List<String> getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(List<String> type) {
        this.type = type;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("location_type")
    public Object getLocationType() {
        return locationType;
    }

    @JsonProperty("location_type")
    public void setLocationType(Object locationType) {
        this.locationType = locationType;
    }

    @JsonProperty("location_date")
    public Object getLocationDate() {
        return locationDate;
    }

    @JsonProperty("location_date")
    public void setLocationDate(Object locationDate) {
        this.locationDate = locationDate;
    }

    @JsonProperty("location_description")
    public String getLocationDescription() {
        return locationDescription;
    }

    @JsonProperty("location_description")
    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    @JsonProperty("location_description_1")
    public String getLocationDescription1() {
        return locationDescription1;
    }

    @JsonProperty("location_description_1")
    public void setLocationDescription1(String locationDescription1) {
        this.locationDescription1 = locationDescription1;
    }

    @JsonProperty("location_description_2")
    public Object getLocationDescription2() {
        return locationDescription2;
    }

    @JsonProperty("location_description_2")
    public void setLocationDescription2(Object locationDescription2) {
        this.locationDescription2 = locationDescription2;
    }

    @JsonProperty("distance")
    public Object getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Object distance) {
        this.distance = distance;
    }

    @JsonProperty("opening_hours")
    public String getOpeningHours() {
        return openingHours;
    }

    @JsonProperty("opening_hours")
    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("address_details")
    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    @JsonProperty("address_details")
    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

    @JsonProperty("phone_number")
    public Object getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(Object phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("payment_point_descr")
    public String getPaymentPointDescr() {
        return paymentPointDescr;
    }

    @JsonProperty("payment_point_descr")
    public void setPaymentPointDescr(String paymentPointDescr) {
        this.paymentPointDescr = paymentPointDescr;
    }

    @JsonProperty("functions")
    public List<String> getFunctions() {
        return functions;
    }

    @JsonProperty("functions")
    public void setFunctions(List<String> functions) {
        this.functions = functions;
    }

    @JsonProperty("partner_id")
    public Integer getPartnerId() {
        return partnerId;
    }

    @JsonProperty("partner_id")
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    @JsonProperty("is_next")
    public Boolean getIsNext() {
        return isNext;
    }

    @JsonProperty("is_next")
    public void setIsNext(Boolean isNext) {
        this.isNext = isNext;
    }

    @JsonProperty("payment_available")
    public Boolean getPaymentAvailable() {
        return paymentAvailable;
    }

    @JsonProperty("payment_available")
    public void setPaymentAvailable(Boolean paymentAvailable) {
        this.paymentAvailable = paymentAvailable;
    }

    @JsonProperty("payment_type")
    public PaymentType getPaymentType() {
        return paymentType;
    }

    @JsonProperty("payment_type")
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @JsonProperty("virtual")
    public String getVirtual() {
        return virtual;
    }

    @JsonProperty("virtual")
    public void setVirtual(String virtual) {
        this.virtual = virtual;
    }

    @JsonProperty("recommended_low_interest_box_machines_list")
    public Object getRecommendedLowInterestBoxMachinesList() {
        return recommendedLowInterestBoxMachinesList;
    }

    @JsonProperty("recommended_low_interest_box_machines_list")
    public void setRecommendedLowInterestBoxMachinesList(Object recommendedLowInterestBoxMachinesList) {
        this.recommendedLowInterestBoxMachinesList = recommendedLowInterestBoxMachinesList;
    }

    @JsonProperty("apm_doubled")
    public Object getApmDoubled() {
        return apmDoubled;
    }

    @JsonProperty("apm_doubled")
    public void setApmDoubled(Object apmDoubled) {
        this.apmDoubled = apmDoubled;
    }

    @JsonProperty("location_247")
    public Boolean getLocation247() {
        return location247;
    }

    @JsonProperty("location_247")
    public void setLocation247(Boolean location247) {
        this.location247 = location247;
    }

    @JsonProperty("operating_hours_extended")
    public OperatingHoursExtended getOperatingHoursExtended() {
        return operatingHoursExtended;
    }

    @JsonProperty("operating_hours_extended")
    public void setOperatingHoursExtended(OperatingHoursExtended operatingHoursExtended) {
        this.operatingHoursExtended = operatingHoursExtended;
    }

    @JsonProperty("agency")
    public String getAgency() {
        return agency;
    }

    @JsonProperty("agency")
    public void setAgency(String agency) {
        this.agency = agency;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("easy_access_zone")
    public Boolean getEasyAccessZone() {
        return easyAccessZone;
    }

    @JsonProperty("easy_access_zone")
    public void setEasyAccessZone(Boolean easyAccessZone) {
        this.easyAccessZone = easyAccessZone;
    }

    @JsonProperty("air_index_level")
    public Object getAirIndexLevel() {
        return airIndexLevel;
    }

    @JsonProperty("air_index_level")
    public void setAirIndexLevel(Object airIndexLevel) {
        this.airIndexLevel = airIndexLevel;
    }

    @JsonProperty("physical_type_mapped")
    public Object getPhysicalTypeMapped() {
        return physicalTypeMapped;
    }

    @JsonProperty("physical_type_mapped")
    public void setPhysicalTypeMapped(Object physicalTypeMapped) {
        this.physicalTypeMapped = physicalTypeMapped;
    }

    @JsonProperty("physical_type_description")
    public Object getPhysicalTypeDescription() {
        return physicalTypeDescription;
    }

    @JsonProperty("physical_type_description")
    public void setPhysicalTypeDescription(Object physicalTypeDescription) {
        this.physicalTypeDescription = physicalTypeDescription;
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
