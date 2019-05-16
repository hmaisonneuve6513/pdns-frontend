package net.osnworld.pdnsfrontend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home.html").setViewName("home.html");
        registry.addViewController("/").setViewName("home.html");
        registry.addViewController("/hello.html").setViewName("hello.html");
        registry.addViewController("/login.html").setViewName("login.html");
    }
}
