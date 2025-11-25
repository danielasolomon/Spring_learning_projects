package org.example.Ch3.config;
import org.example.Ch3.Parrot;
import org.example.Ch3.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "org.example.Ch3")
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Bilo");
        person.setParrot(parrot());
        return person;
    }



//    @Bean
//    public Person person(Parrot parrot) {
//        Person person = new Person();
//        person.setName("Bilo");
//        person.setParrot(parrot);
//        return person;
//    }

}
