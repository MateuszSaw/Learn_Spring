package spring_demo;

public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "play quick game one on one ";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
