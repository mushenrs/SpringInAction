package me.mushen.spring.spittr.servlet;

import lombok.extern.slf4j.Slf4j;
import me.mushen.spring.spittr.config.RootConfig;
import me.mushen.spring.spittr.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Desc
 * @Author Mushen
 * @Create 2018-07-23
 */
@Slf4j
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
