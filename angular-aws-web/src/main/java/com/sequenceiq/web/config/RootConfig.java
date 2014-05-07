package com.sequenceiq.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

import com.sequenceiq.core.config.CoreConfiguration;

/**
 * User: doktoric
 */

@Configuration
@ComponentScan(basePackages = {"com.aws.web"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = org.springframework.stereotype.Controller.class)})
@Import(CoreConfiguration.class)
public class RootConfig {

}
