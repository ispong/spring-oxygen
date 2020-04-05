package com.ispong.oxygen.config;

//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import com.ispong.oxygen.flysql.annotation.EnableFlysql;
import com.ispong.oxygen.freecode.annotation.EnableFreecode;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 项目基础配置
 *
 * @author ispong
 * @version v0.1.0
 */
//@EnableWechatgo
@EnableFreecode
@EnableFlysql
@Configuration
//@EnableConfigurationProperties
@EnableTransactionManagement
//@EnableAspectJAutoProxy
//@EnableScheduling
//@EnableAsync
//@ImportResource(locations = {"classpath:schema/**"})
public class AppConfig {


}


