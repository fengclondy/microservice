package com.example.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;
import java.util.Map;

/**
 * Created by 42278 on 2017/4/10.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HALRecommendations extends ResourceSupport {

    @JsonProperty("_embedded")
    private Map<String, List<HALRecommendation>> embedded;

    public HALRecommendations(){
        this.embedded = new HashedMap();
    }

    public void add(String name, List<HALRecommendation> embedded){
        this.embedded.put(name,embedded);
    }

    public Map<String, List<HALRecommendation>> getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Map<String, List<HALRecommendation>> embedded) {
        this.embedded = embedded;
    }
}
