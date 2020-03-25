package springles4.entities;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {

    @Override
    public String getSong() {
        return "Merry Christmas";
    }
}
