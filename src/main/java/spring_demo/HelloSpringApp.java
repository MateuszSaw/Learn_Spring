package spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        //Wczytuje pliki konfiguracyjne spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //pobieram beany z spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //wywołuje metody z beanów

        System.out.println(theCoach.getDailyWorkout());

        //wywołuje nowe metody
        System.out.println(theCoach.getDailyFortune());

        //zamykam context
        context.close();
    }
}
