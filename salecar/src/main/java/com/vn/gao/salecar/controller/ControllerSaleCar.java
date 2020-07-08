package com.vn.gao.salecar.controller;

import com.vn.gao.salecar.reponsitory.CarImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@EnableWebMvc
public class ControllerSaleCar extends WebMvcConfigurerAdapter {


    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("templates/");
        resolver.setSuffix(".html");
        return resolver;
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/results").setViewName("results");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/form").setViewName("form");
    }

    @Autowired
    CarImpl car;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String findAll() {
//        Optional<CarEntity> carEntity = car.findById(1L);
//        System.out.println(carEntity.toString());
        return "index";
    }
}
