package org.shad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfigAnnotation {

    @Bean
    public Employee emp(){
        return new Employee();
    }
}
