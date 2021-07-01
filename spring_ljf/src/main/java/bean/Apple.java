package bean;

/**
 * @author: ljf
 * @create: 2021/4/30 18:04
 * @description:
 **/
public class Apple {

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
		return "Apple{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
