package uz.pdp.beans;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Component
@Scope("prototype")
@Lazy
public class Emp {

    private String fullName;

    private int age;

    @PostConstruct
    public void init() {
        System.out.println("init ishladi ");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("init ishladi ");
    }
}
