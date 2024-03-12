
package com.browserstack.jest.Entities;

import java.util.LinkedHashMap;
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
    "database",
    "customHeaders",
    "appCookie",
    "executionId",
    "includeTestCategory"
})
@Generated("jsonschema2pojo")
public class RunnerParams {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("database")
    private String database;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customHeaders")
    private String customHeaders;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("appCookie")
    private String appCookie;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("executionId")
    private String executionId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("includeTestCategory")
    private String includeTestCategory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("database")
    public String getDatabase() {
        return database;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("database")
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customHeaders")
    public String getCustomHeaders() {
        return customHeaders;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customHeaders")
    public void setCustomHeaders(String customHeaders) {
        this.customHeaders = customHeaders;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("appCookie")
    public String getAppCookie() {
        return appCookie;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("appCookie")
    public void setAppCookie(String appCookie) {
        this.appCookie = appCookie;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("executionId")
    public String getExecutionId() {
        return executionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("executionId")
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("includeTestCategory")
    public String getIncludeTestCategory() {
        return includeTestCategory;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("includeTestCategory")
    public void setIncludeTestCategory(String includeTestCategory) {
        this.includeTestCategory = includeTestCategory;
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
