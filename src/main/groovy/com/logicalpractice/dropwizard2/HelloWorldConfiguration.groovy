package com.logicalpractice.dropwizard2;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 */
class HelloWorldConfiguration extends Configuration {

    @NotEmpty
    @JsonProperty
    private String template = "Hello, %s";

    @NotEmpty
    @JsonProperty
    private String defaultName = "Stranger";

    public String getTemplate() {
        return template;
    }

    public String getDefaultName() {
        return defaultName;
    }

}
