import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Greeter {

    private String name;

    public Greeter() {
        this("World");
    }

    public Greeter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
        System.out.println("Setter");
    }

    public void greet(String name) {
        System.out.println(String.format("Hello, %s!", name));
    }

    public void greet() {
        System.out.println(String.format("Hello, %s!", this.name));
    }
//
//    public void greet() {
//        System.out.println("Hello!");
//    }

//    @Bean
//    public Greeter greeter() {
//        return new Greeter();
//    }
}
