import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        Greeter greeter = context.getBean(Greeter.class);
//        greeter.greet();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.ref
        Greeter greeter = context.getBean(Greeter.class);
//        Greeter greeter2 = greeter.greeterBean("Test");
        greeter.greet();
    }
}
