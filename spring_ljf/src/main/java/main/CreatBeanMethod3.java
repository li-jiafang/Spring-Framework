package main;

import bean.Pear;
import config.ComponentScanConfig;
import config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ljf
 * @Date 2021/7/1 11:56
 * @Description
 * 定义配置类添加@ComponentScan注解扫描指定包
 * 在对应类上添加@Component注解声明 为bean
 *
 **/
public class CreatBeanMethod3 {


	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

		Pear bean = applicationContext.getBean(Pear.class);
		System.out.println(bean);
	}
}
