package config;

import bean.Banana;
import org.springframework.context.annotation.Bean;

/**
 * @Author ljf
 * @Date 2021/7/1 11:40
 * @Description
 **/
public class Config {


	@Bean
	public Banana getBanana(){
		return new Banana(1,"香蕉");
	}
}
