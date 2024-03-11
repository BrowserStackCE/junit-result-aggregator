
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


/**
 * Generated schema for Root
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "numFailedTestSuites",
        "numFailedTests",
        "numPassedTestSuites",
        "numPassedTests",
        "numPendingTestSuites",
        "numPendingTests",
        "numRuntimeErrorTestSuites",
        "numTotalTestSuites",
        "numTotalTests",
        "success",
        "wasInterrupted",
        "startTime",
        "endTime",
        "testResults"
})
@Generated("jsonschema2pojo")
public class JestJson {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numFailedTestSuites")
    private Double numFailedTestSuites;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numFailedTests")
    private Double numFailedTests;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassedTestSuites")
    private Double numPassedTestSuites;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassedTests")
    private Double numPassedTests;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPendingTestSuites")
    private Double numPendingTestSuites;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPendingTests")
    private Double numPendingTests;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numRuntimeErrorTestSuites")
    private Double numRuntimeErrorTestSuites;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numTotalTestSuites")
    private Double numTotalTestSuites;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numTotalTests")
    private Double numTotalTests;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("wasInterrupted")
    private Boolean wasInterrupted;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("startTime")
    private Double startTime;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("endTime")
    private Double endTime;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("testResults")
    private List<TestResult> testResults;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numFailedTestSuites")
    public Double getNumFailedTestSuites() {
        return numFailedTestSuites;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numFailedTestSuites")
    public void setNumFailedTestSuites(Double numFailedTestSuites) {
        this.numFailedTestSuites = numFailedTestSuites;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numFailedTests")
    public Double getNumFailedTests() {
        return numFailedTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numFailedTests")
    public void setNumFailedTests(Double numFailedTests) {
        this.numFailedTests = numFailedTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassedTestSuites")
    public Double getNumPassedTestSuites() {
        return numPassedTestSuites;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassedTestSuites")
    public void setNumPassedTestSuites(Double numPassedTestSuites) {
        this.numPassedTestSuites = numPassedTestSuites;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassedTests")
    public Double getNumPassedTests() {
        return numPassedTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassedTests")
    public void setNumPassedTests(Double numPassedTests) {
        this.numPassedTests = numPassedTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPendingTestSuites")
    public Double getNumPendingTestSuites() {
        return numPendingTestSuites;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPendingTestSuites")
    public void setNumPendingTestSuites(Double numPendingTestSuites) {
        this.numPendingTestSuites = numPendingTestSuites;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPendingTests")
    public Double getNumPendingTests() {
        return numPendingTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPendingTests")
    public void setNumPendingTests(Double numPendingTests) {
        this.numPendingTests = numPendingTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numRuntimeErrorTestSuites")
    public Double getNumRuntimeErrorTestSuites() {
        return numRuntimeErrorTestSuites;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numRuntimeErrorTestSuites")
    public void setNumRuntimeErrorTestSuites(Double numRuntimeErrorTestSuites) {
        this.numRuntimeErrorTestSuites = numRuntimeErrorTestSuites;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numTotalTestSuites")
    public Double getNumTotalTestSuites() {
        return numTotalTestSuites;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numTotalTestSuites")
    public void setNumTotalTestSuites(Double numTotalTestSuites) {
        this.numTotalTestSuites = numTotalTestSuites;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numTotalTests")
    public Double getNumTotalTests() {
        return numTotalTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numTotalTests")
    public void setNumTotalTests(Double numTotalTests) {
        this.numTotalTests = numTotalTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("wasInterrupted")
    public Boolean getWasInterrupted() {
        return wasInterrupted;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("wasInterrupted")
    public void setWasInterrupted(Boolean wasInterrupted) {
        this.wasInterrupted = wasInterrupted;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("startTime")
    public Double getStartTime() {
        return startTime;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("startTime")
    public void setStartTime(Double startTime) {
        this.startTime = startTime;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("endTime")
    public Double getEndTime() {
        return endTime;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("endTime")
    public void setEndTime(Double endTime) {
        this.endTime = endTime;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("testResults")
    public List<TestResult> getTestResults() {
        return testResults;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("testResults")
    public void setTestResults(List<TestResult> testResults) {
        this.testResults = testResults;
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
