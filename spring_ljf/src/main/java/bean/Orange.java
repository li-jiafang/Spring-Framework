package bean;

/**
 * @Author ljf
 * @Date 2021/7/1 12:18
 * @Description
 **/
public class Orange {
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
		return "Orange{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
