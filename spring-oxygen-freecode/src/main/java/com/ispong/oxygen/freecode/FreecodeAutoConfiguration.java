package com.ispong.oxygen.freecode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.sql.DataSource;
import java.util.Map;

/**
 * freecode 自动配置中心
 *
 * @author ispong
 * @since 0.0.1
 */
@Slf4j
@EnableConfigurationProperties(FreecodeProperties.class)
public class FreecodeAutoConfiguration {

    @Bean
    @ConditionalOnClass(FreecodeAutoConfiguration.class)
    public FreecodeUtils initFreemarkerUtil(FreeMarkerConfigurer freeMarkerConfigurer) {

        return new FreecodeUtils(freeMarkerConfigurer);
    }

    @Bean
    @ConditionalOnBean(FreecodeUtils.class)
    public FreecodeRepository initFreecodeRepository(@Autowired Map<String, DataSource> oxygenDataSourceMap) {

        log.debug("init freecode repository");

        return new FreecodeRepository(oxygenDataSourceMap);
    }

    @Bean
    @ConditionalOnClass(FreecodeRepository.class)
    public FreecodeService initFreecodeService(FreecodeRepository freecodeRepository) {

        return new FreecodeService(freecodeRepository);
    }

    @Bean
    @ConditionalOnBean(FreecodeService.class)
    public FreecodeController initWechatgoController(FreecodeService freecodeService) {

        log.debug("init freecode controller");
        return new FreecodeController(freecodeService);
    }

}
