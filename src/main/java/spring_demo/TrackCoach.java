package spring_demo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach(){}

    public String getDailyFortune() {
        return "Just Do It " + fortuneService.getFortune();
    }

    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}
