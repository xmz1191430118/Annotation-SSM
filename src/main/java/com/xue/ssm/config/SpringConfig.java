package com.xue.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author xmz
 * @date 2022/6/25 20:16
 */
@Configuration
@ComponentScan({"com.xue.ssm.service","com.xue.ssm.dao"})
@PropertySource(value = "classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement(proxyTargetClass = true)
public class SpringConfig {
}
