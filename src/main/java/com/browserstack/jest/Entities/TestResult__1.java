
package com.browserstack.jest.Entities;

import java.util.LinkedHashMap;
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
        "ancestorTitles",
        "duration",
        "failureDetails",
        "failureMessages",
        "fullName",
        "invocations",
        "location",
        "numPassingAsserts",
        "status",
        "title"
})
@Generated("jsonschema2pojo")
public class TestResult__1 {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("ancestorTitles")
    private List<String> ancestorTitles;
    @JsonProperty("duration")
    private Double duration;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("failureDetails")
    private List<Object> failureDetails;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("failureMessages")
    private List<Object> failureMessages;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fullName")
    private String fullName;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("invocations")
    private Double invocations;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("location")
    private Object location;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassingAsserts")
    private Double numPassingAsserts;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("status")
    private String status;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("ancestorTitles")
    public List<String> getAncestorTitles() {
        return ancestorTitles;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("ancestorTitles")
    public void setAncestorTitles(List<String> ancestorTitles) {
        this.ancestorTitles = ancestorTitles;
    }

    @JsonProperty("duration")
    public Double getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("failureDetails")
    public List<Object> getFailureDetails() {
        return failureDetails;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("failureDetails")
    public void setFailureDetails(List<Object> failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("failureMessages")
    public List<Object> getFailureMessages() {
        return failureMessages;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("failureMessages")
    public void setFailureMessages(List<Object> failureMessages) {
        this.failureMessages = failureMessages;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("invocations")
    public Double getInvocations() {
        return invocations;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("invocations")
    public void setInvocations(Double invocations) {
        this.invocations = invocations;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("location")
    public Object getLocation() {
        return location;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("location")
    public void setLocation(Object location) {
        this.location = location;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassingAsserts")
    public Double getNumPassingAsserts() {
        return numPassingAsserts;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassingAsserts")
    public void setNumPassingAsserts(Double numPassingAsserts) {
        this.numPassingAsserts = numPassingAsserts;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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

