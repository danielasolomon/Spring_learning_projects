package org.example.Ch2;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name;

    @PostConstruct
    public void init() {
        if (this.name == null || this.name.isBlank()) {
            this.name = "Kiki";
        }
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
