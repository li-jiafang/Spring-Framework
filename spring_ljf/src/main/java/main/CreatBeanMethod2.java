package main;

import bean.Banana;
import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author ljf
 * @Date 2021/7/1 11:43
 * @Description
 *
 * 创建bean方式2:通过@Bean注解完成bean的创建
 **/
public class CreatBeanMethod2 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Banana bean = applicationContext.getBean("getBanana",Banana.class);
		System.out.println(bean);

	}
}
