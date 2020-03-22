package springles4;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    String volume1= Integer.toString(getVolume());

    public String playMusic() {
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong()
                + " with volume " + this.volume1;
    }
}


//    Например, внедрение зависимости через setter
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    тоже самое через поле!
//    @Autowired
//    private Music music;

//    через конструктор
//    @Autowired
//    public MusicPlayer(Music music) { this.music = music;}

//    @Autowired
//    @Qualifier("classicalMusic") //т.е. решаем проблему необнозначности и указываем какой конкретно бин внедрять
//    private  Music music;

//    это же, но через конструктор, с учетом специфического синтаксиса для конструктора.
//    т.е. аннотацию @Qualifier необходимо поставить к каждому аргументу конструктора:
//
//     public MusicPlayer(@Qualifier("rockMusic") Music music1,
//                   @Qualifier("classicalMusic") Music music2)
//    {this.music1 = music1;
//    this.music2 = music2; }