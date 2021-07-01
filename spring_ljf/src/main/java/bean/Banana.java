package bean;

/**
 * @Author ljf
 * @Date 2021/7/1 11:36
 * @Description
 **/
public class Banana {
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

	public Banana() {
	}

	public Banana(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Banana{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
