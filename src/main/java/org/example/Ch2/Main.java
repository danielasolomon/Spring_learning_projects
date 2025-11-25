package org.example.Ch2;

import org.example.Ch2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {


            System.out.println("Parrot beans: " + context.getBeansOfType(Parrot.class).keySet());

            // 1) Bean-ul creat de @Component + @PostConstruct ("Kiki")
            Parrot kiki = context.getBean("parrot", Parrot.class);
            System.out.println(kiki.getName());  // <- trebuie să afișeze Kiki


            Parrot p = context.getBean(Parrot.class);
            System.out.println(p);
            System.out.println(p.getName());

            String s = context.getBean(String.class);
            System.out.println(s);

            Integer n = context.getBean(Integer.class);
            System.out.println(n);

        }
    }
}
