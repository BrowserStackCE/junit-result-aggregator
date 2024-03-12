
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
    "added",
    "fileDeleted",
    "matched",
    "unchecked",
    "unmatched",
    "updated"
})
@Generated("jsonschema2pojo")
public class Snapshot__1 {

    @JsonProperty("added")
    private Integer added;
    @JsonProperty("fileDeleted")
    private Boolean fileDeleted;
    @JsonProperty("matched")
    private Integer matched;
    @JsonProperty("unchecked")
    private Integer unchecked;
    @JsonProperty("unmatched")
    private Integer unmatched;
    @JsonProperty("updated")
    private Integer updated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("added")
    public Integer getAdded() {
        return added;
    }

    @JsonProperty("added")
    public void setAdded(Integer added) {
        this.added = added;
    }

    @JsonProperty("fileDeleted")
    public Boolean getFileDeleted() {
        return fileDeleted;
    }

    @JsonProperty("fileDeleted")
    public void setFileDeleted(Boolean fileDeleted) {
        this.fileDeleted = fileDeleted;
    }

    @JsonProperty("matched")
    public Integer getMatched() {
        return matched;
    }

    @JsonProperty("matched")
    public void setMatched(Integer matched) {
        this.matched = matched;
    }

    @JsonProperty("unchecked")
    public Integer getUnchecked() {
        return unchecked;
    }

    @JsonProperty("unchecked")
    public void setUnchecked(Integer unchecked) {
        this.unchecked = unchecked;
    }

    @JsonProperty("unmatched")
    public Integer getUnmatched() {
        return unmatched;
    }

    @JsonProperty("unmatched")
    public void setUnmatched(Integer unmatched) {
        this.unmatched = unmatched;
    }

    @JsonProperty("updated")
    public Integer getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(Integer updated) {
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
