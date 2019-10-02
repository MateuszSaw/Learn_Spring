package spring_demo;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes on tactic practice";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void firstWarmup(){
        System.out.println("FootballCoach: inside method first warm-up ");
    }
    public void lastWarmup(){
        System.out.println("FootballCoach: inside method last warm-up ");
    }
}
