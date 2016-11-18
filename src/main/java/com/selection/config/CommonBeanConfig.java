package com.selection.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by ascrom on 16/11/16.
 */
@Configuration
@EnableJpaRepositories("com.selection.repositories")
public class CommonBeanConfig {

}
