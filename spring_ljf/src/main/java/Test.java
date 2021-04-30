import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: ljf
 * @create: 2021/4/30 18:03
 * @description:
 **/
public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test.xml");
		Apple apple = applicationContext.getBean("apple", Apple.class);
		System.out.println(apple);
	}
}
