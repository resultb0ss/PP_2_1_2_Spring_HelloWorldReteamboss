import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catOne = applicationContext.getBean("catBean", Cat.class);
        Cat catTwo = applicationContext.getBean("catBean", Cat.class);

        System.out.println("Сравнение бинов hello world = " + (beanOne == beanTwo));
        System.out.println("Bean One = " + beanOne);
        System.out.println("Bean Two = " + beanTwo);
        System.out.println("Сравнение бинов cat = " + (catOne == catTwo));
        System.out.println("Cat One = " + catOne);
        System.out.println("Cat Two = " + catTwo);
    }
}