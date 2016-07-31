package org.wang.mall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/**
 * Created by ozintel06 on 16/6/14.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/14/2016 17:15
 */

@Configuration @EnableWebMvc public class WebMvcConfig extends WebMvcConfigurerAdapter {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
   */
  @Override public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * viewResolver.
   *
   * @return  InternalResourceViewResolver
   */
  @Bean public InternalResourceViewResolver viewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/pages/");
    resolver.setSuffix(".jsp");

    return resolver;
  }

} // end class WebMvcConfig
