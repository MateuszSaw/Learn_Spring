package spring_demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private String[] fortuneArray = {
            "no pain no gain",
            "keep working hard",
            "never give up"};

    Random randomString = new Random();

    public String getFortune() {
        int randomNumber = randomString.nextInt(fortuneArray.length);
        String theFortune = fortuneArray[randomNumber];
        return theFortune;
    }
}
