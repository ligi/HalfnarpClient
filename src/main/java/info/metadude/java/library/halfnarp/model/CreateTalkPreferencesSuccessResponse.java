package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTalkPreferencesSuccessResponse extends CreateResponse {

    @JsonProperty("update_url")
    private String updateUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The updateUrl
     */
    @JsonProperty("update_url")
    public String getUpdateUrl() {
        return updateUrl;
    }

    /**
     * @param updateUrl The update_url
     */
    @JsonProperty("update_url")
    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "updateUrl = " + updateUrl + ", " +
                "uid = " + uid;
    }

}
