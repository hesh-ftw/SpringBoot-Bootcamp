package runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


// implements commandline runnable
@Component
public class InitApplicationData implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("init database data");
    }
}
