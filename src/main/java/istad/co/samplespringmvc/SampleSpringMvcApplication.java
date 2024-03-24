package istad.co.samplespringmvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringMvcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SampleSpringMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Error Compile Time");
    }
}
