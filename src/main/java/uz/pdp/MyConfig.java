package uz.pdp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import uz.pdp.beans.Employee;

@Configuration
public class MyConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Scope("prototype")
    @Lazy
    public Employee employee() {
        return new Employee("Nurzod O'lmasov",28);
    }
}
