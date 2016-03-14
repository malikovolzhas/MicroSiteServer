package kz.almondo.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by User on 14.03.2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("kz.almondo.server")
public class WebConfig extends WebMvcConfigurerAdapter {

}
