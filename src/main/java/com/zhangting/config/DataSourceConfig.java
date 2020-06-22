package com.zhangting.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author 张挺
 * @Description 数据源配置
 * @Date 2020/6/14 18:47
 */
@Configuration
public class DataSourceConfig {
    @Bean({"dataSource"})
    @ConfigurationProperties(
            prefix = "spring.datasource.mysql"
    )
    public DataSource dataSource() {
        return new DruidDataSource();
    }
}
