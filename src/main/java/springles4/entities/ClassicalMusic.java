package springles4.entities;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music{

      @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
