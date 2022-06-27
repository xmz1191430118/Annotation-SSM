package com.xue.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author xmz
 * @date 2022/6/25 20:27
 */
@Configuration
@ComponentScan("com.xue.ssm.controller")
@EnableWebMvc
public class SpringMVCConfig {
////hot-fix
}
