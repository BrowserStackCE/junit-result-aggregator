
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
        "end",
        "runtime",
        "slow",
        "start"
})
@Generated("jsonschema2pojo")
public class PerfStats {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("end")
    private Double end;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("runtime")
    private Double runtime;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("slow")
    private Boolean slow;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("start")
    private Double start;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("end")
    public Double getEnd() {
        return end;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("end")
    public void setEnd(Double end) {
        this.end = end;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("runtime")
    public Double getRuntime() {
        return runtime;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("runtime")
    public void setRuntime(Double runtime) {
        this.runtime = runtime;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("slow")
    public Boolean getSlow() {
        return slow;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("slow")
    public void setSlow(Boolean slow) {
        this.slow = slow;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("start")
    public Double getStart() {
        return start;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("start")
    public void setStart(Double start) {
        this.start = start;
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
