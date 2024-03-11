
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
        "added",
        "fileDeleted",
        "matched",
        "unchecked",
        "uncheckedKeys",
        "unmatched",
        "updated"
})
@Generated("jsonschema2pojo")
public class Snapshot {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("added")
    private Double added;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fileDeleted")
    private Boolean fileDeleted;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("matched")
    private Double matched;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("unchecked")
    private Double unchecked;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("uncheckedKeys")
    private List<Object> uncheckedKeys;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("unmatched")
    private Double unmatched;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("updated")
    private Double updated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("added")
    public Double getAdded() {
        return added;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("added")
    public void setAdded(Double added) {
        this.added = added;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fileDeleted")
    public Boolean getFileDeleted() {
        return fileDeleted;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fileDeleted")
    public void setFileDeleted(Boolean fileDeleted) {
        this.fileDeleted = fileDeleted;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("matched")
    public Double getMatched() {
        return matched;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("matched")
    public void setMatched(Double matched) {
        this.matched = matched;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("unchecked")
    public Double getUnchecked() {
        return unchecked;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("unchecked")
    public void setUnchecked(Double unchecked) {
        this.unchecked = unchecked;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("uncheckedKeys")
    public List<Object> getUncheckedKeys() {
        return uncheckedKeys;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("uncheckedKeys")
    public void setUncheckedKeys(List<Object> uncheckedKeys) {
        this.uncheckedKeys = uncheckedKeys;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("unmatched")
    public Double getUnmatched() {
        return unmatched;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("unmatched")
    public void setUnmatched(Double unmatched) {
        this.unmatched = unmatched;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("updated")
    public Double getUpdated() {
        return updated;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("updated")
    public void setUpdated(Double updated) {
        this.updated = updated;
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

