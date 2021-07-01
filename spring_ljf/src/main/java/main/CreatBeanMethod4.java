package main;

import bean.Orange;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author ljf
 * @Date 2021/7/1 12:15
 * @Description\
 *
 * 通过BeanDefinition完成bean创建
 * 前面通过xml,@Bean,@Component注解创建bean的方式,从原理上讲都是通过BeanDefinition来完成的
 **/
public class CreatBeanMethod4 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

		AbstractBeanDefinition beanDefinition =BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(Orange.class);
		beanDefinition.setScope("singleton");
		beanDefinition.setLazyInit(true);
		applicationContext.registerBeanDefinition("orange",beanDefinition);
		applicationContext.refresh();

		Orange orange = applicationContext.getBean("orange", Orange.class);
		System.out.println(orange);


	}
}
