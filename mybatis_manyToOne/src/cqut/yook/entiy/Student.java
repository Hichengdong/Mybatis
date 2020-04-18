package cqut.yook.entiy;

public class Student {
	private Integer id;
	private String name;
	// 多个学生对应一个老师
	private Teacher teacher;

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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "id:" + id + ",name:" + name + ",tid:" + teacher.getId() + ",tname:" + teacher.getName();
	}
}
