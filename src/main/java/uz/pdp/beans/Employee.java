package uz.pdp.beans;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Employee {

    private String fullName;

    private int age;

    public void init() {
        System.out.println("init ishladi ");
    }
    public void destroy() {
        System.out.println("init ishladi ");
    }
}
