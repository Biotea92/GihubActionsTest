package com.example.ci.config;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Component
public class SiteProperties {
    private final String authorName;
    private final String authorEmail;

    public SiteProperties(
            @Value("${site.authorName}") String authorName,
            @Value("${site.authorEmail}") String authorEmail) {
        this.authorName = authorName;
        this.authorEmail = authorEmail;
    }

}
