package spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        boolean result = (theCoach == alphaCoach);

        System.out.println("\n Pointing to the same point: " + result);
        System.out.println("\n Memory location for theCoach: " + theCoach);
        System.out.println("\n Memory location for theCoach: " + alphaCoach);

        context.close();
    }
}
