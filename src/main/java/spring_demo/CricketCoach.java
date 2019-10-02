package spring_demo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("CricketCoach: inside setter method- fortuneService");
    }

    public void setEmail(String email) {
        System.out.println("CricketCoach: inside setter method- email");

        this.email = email;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method- team");
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
