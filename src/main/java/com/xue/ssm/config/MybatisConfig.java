package com.xue.ssm.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xmz
 * @date 2022/6/25 20:17
 */
public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.xue.ssm.pojo");
        sqlSessionFactoryBean.setMapperLocations(resolveMapperLocations());
        return sqlSessionFactoryBean;
    }




    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mac = new MapperScannerConfigurer();
        mac.setBasePackage("com.xue.ssm.dao");
        return mac;
    }

    public Resource[] resolveMapperLocations() {
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
        List<String> mapperLocations = new ArrayList();
        mapperLocations.add("classpath:mapper/*.xml");
        List<Resource> resources = new ArrayList();
        if (mapperLocations != null) {
            for (String mapperLocation : mapperLocations) {
                try {
                    Resource[] mappers = resourceResolver.getResources(mapperLocation);
                    resources.addAll(Arrays.asList(mappers));
                } catch (IOException e) {
                    // ignore
                }
            }
        }
        return resources.toArray(new Resource[resources.size()]);
    }
//    public Resource[] resolveMapperLocations() throws IOException {
//        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
//        return resourceResolver.getResources("classpath:mapper/*.xml");
//    }

}
