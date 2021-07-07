package main;

import bean.Apple;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ljf
 * @Date 2021/7/1 11:41
 * @Description
 *
 * 通过xml注解中bean属性创建bean对象
 *
 * 梳理IOC创建bean的流程
 *
 *
 **/
public class CreatBeanMethod1 {

	public static void main(String[] args) {
		// 获取applicationContext对象
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("CreatBeanMethod1.xml");
		Apple apple = applicationContext.getBean("apple", Apple.class);
		System.out.println(apple);
	}
}
