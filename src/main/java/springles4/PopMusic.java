package springles4;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {

    @Override
    public String getSong() {
        return "Merry Christmas";
    }
}
