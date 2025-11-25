package org.example.Ch3;

import org.example.Ch3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Person person = context.getBean(Person.class);
        //
        //Parrot parrot = context.getBean(Parrot.class);
        //
        //System.out.println("Person's name: " + person.getName());
        //
        //System.out.println("Parrot's name: " + parrot.getName());
        //
        //System.out.println("Person's parrot: " + person.getParrot());


        Person p = context.getBean(Person.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());

    }

}
