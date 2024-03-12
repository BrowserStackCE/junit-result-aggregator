
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
        "sourceVersion",
        "leaks",
        "numFailingTests",
        "numPassingTests",
        "numPendingTests",
        "numTodoTests",
        "openHandles",
        "perfStats",
        "skipped",
        "snapshot",
        "testFilePath",
        "testResults",
        "failureMessage",
        "groups",
        "numTries",
        "timelineTraceLink",
        "runnerParams"
})
@Generated("jsonschema2pojo")
public class TestResult {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("sourceVersion")
    private String sourceVersion;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("leaks")
    private Boolean leaks;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numFailingTests")
    private Double numFailingTests;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassingTests")
    private Double numPassingTests;
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
    @JsonProperty("numTodoTests")
    private Double numTodoTests;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("openHandles")
    private List<Object> openHandles;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("perfStats")
    private PerfStats perfStats;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("skipped")
    private Boolean skipped;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("snapshot")
    private Snapshot snapshot;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("testFilePath")
    private String testFilePath;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("testResults")
    private List<TestResult__1> testResults;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("failureMessage")
    private Object failureMessage;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("groups")
    private List<Object> groups;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numTries")
    private Double numTries;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("timelineTraceLink")
    private Object timelineTraceLink;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("runnerParams")
    private RunnerParams runnerParams;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("sourceVersion")
    public String getSourceVersion() {
        return sourceVersion;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("sourceVersion")
    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("leaks")
    public Boolean getLeaks() {
        return leaks;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("leaks")
    public void setLeaks(Boolean leaks) {
        this.leaks = leaks;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numFailingTests")
    public Double getNumFailingTests() {
        return numFailingTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numFailingTests")
    public void setNumFailingTests(Double numFailingTests) {
        this.numFailingTests = numFailingTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassingTests")
    public Double getNumPassingTests() {
        return numPassingTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numPassingTests")
    public void setNumPassingTests(Double numPassingTests) {
        this.numPassingTests = numPassingTests;
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
    @JsonProperty("numTodoTests")
    public Double getNumTodoTests() {
        return numTodoTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numTodoTests")
    public void setNumTodoTests(Double numTodoTests) {
        this.numTodoTests = numTodoTests;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("openHandles")
    public List<Object> getOpenHandles() {
        return openHandles;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("openHandles")
    public void setOpenHandles(List<Object> openHandles) {
        this.openHandles = openHandles;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("perfStats")
    public PerfStats getPerfStats() {
        return perfStats;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("perfStats")
    public void setPerfStats(PerfStats perfStats) {
        this.perfStats = perfStats;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("skipped")
    public Boolean getSkipped() {
        return skipped;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("skipped")
    public void setSkipped(Boolean skipped) {
        this.skipped = skipped;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("snapshot")
    public Snapshot getSnapshot() {
        return snapshot;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("snapshot")
    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("testFilePath")
    public String getTestFilePath() {
        return testFilePath;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("testFilePath")
    public void setTestFilePath(String testFilePath) {
        this.testFilePath = testFilePath;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("testResults")
    public List<TestResult__1> getTestResults() {
        return testResults;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("testResults")
    public void setTestResults(List<TestResult__1> testResults) {
        this.testResults = testResults;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("failureMessage")
    public Object getFailureMessage() {
        return failureMessage;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("failureMessage")
    public void setFailureMessage(Object failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("groups")
    public List<Object> getGroups() {
        return groups;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("groups")
    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numTries")
    public Double getNumTries() {
        return numTries;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("numTries")
    public void setNumTries(Double numTries) {
        this.numTries = numTries;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("timelineTraceLink")
    public Object getTimelineTraceLink() {
        return timelineTraceLink;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("timelineTraceLink")
    public void setTimelineTraceLink(Object timelineTraceLink) {
        this.timelineTraceLink = timelineTraceLink;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("runnerParams")
    public RunnerParams getRunnerParams() {
        return runnerParams;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("runnerParams")
    public void setRunnerParams(RunnerParams runnerParams) {
        this.runnerParams = runnerParams;
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
