package top.fomeiherz.config;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.fomeiherz.filters.ErrorFilter;
import top.fomeiherz.filters.PostFilter;
import top.fomeiherz.filters.PreFilter;
import top.fomeiherz.filters.RouteFilter;

@EnableZuulProxy
@Configuration
public class FilterConfig {

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

}
