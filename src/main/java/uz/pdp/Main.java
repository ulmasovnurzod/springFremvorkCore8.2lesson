package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.pdp.beans.Emp;
import uz.pdp.beans.Employee;
import uz.pdp.beans.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello PDP!");

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-config.xml");
//        Person person = context.getBean(Person.class);
//        System.out.println(person);
//        Person person1 = context.getBean(Person.class);
//        System.out.println(person1);
//        person1.setAge(29);
//        System.out.println( "person " + person);
//        System.out.println( "person1 " + person1);


//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Employee bean = context.getBean(Employee.class);
//        System.out.println(System.identityHashCode(bean));
//        Employee bean1= context.getBean(Employee.class);
//        System.out.println(System.identityHashCode(bean1));
//        Employee bean2 = context.getBean(Employee.class);
//        System.out.println(System.identityHashCode(bean2));
//        context.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("uz.pdp.beans");
        Emp bean = context.getBean(Emp.class);
        System.out.println(System.identityHashCode(bean));
        Emp bean1 = context.getBean(Emp.class);
        System.out.println(System.identityHashCode(bean1));
        Emp bean2 = context.getBean(Emp.class);
        System.out.println(System.identityHashCode(bean2));
        context.close();
    }
}