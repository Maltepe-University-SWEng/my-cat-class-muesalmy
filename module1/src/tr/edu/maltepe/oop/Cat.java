package tr.edu.maltepe.oop;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Cat {
    // Özellikler
    private String name;
    private int age;

    // Parametreli yapıcı metot
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Varsayılan yapıcı metot
    public Cat() {
    }

    // Getter ve Setter metotları
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // meow metodu: /Users/muesalmy/Downloads konumundaki "cat.wav" dosyasını çalar
    public void meow() {
        try {
            // "cat.wav" dosyasının mutlak yolu
            File soundFile = new File("/Users/muesalmy/Downloads/cat.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();

            // Sesin tamamını çalması için bekleme (mikrosaniye cinsinden uzunluk / 1000 = milisaniye)
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.out.println("Ses çalınırken hata oluştu.");
            e.printStackTrace();
        }
    }
}
