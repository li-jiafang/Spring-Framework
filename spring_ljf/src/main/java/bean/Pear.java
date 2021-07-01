package bean;

import org.springframework.stereotype.Component;

/**
 * @Author ljf
 * @Date 2021/7/1 11:37
 * @Description
 **/
@Component
public class Pear {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pear{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
