package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UidContainingResponse{

    @JsonProperty("uid")
    protected String uid;
    /**
     * @return The uid
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * @param uid The uid
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

}
