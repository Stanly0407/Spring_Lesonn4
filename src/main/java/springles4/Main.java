package springles4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springles4.config.SpringConfig;
import springles4.entities.MusicPlayer;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        context.close();

    }
}
