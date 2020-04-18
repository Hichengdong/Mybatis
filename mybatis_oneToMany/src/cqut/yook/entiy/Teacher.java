package cqut.yook.entiy;

import java.util.List;

public class Teacher {
	private Integer id;
	private String name;
	private List<Student> students;

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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("tid:");
		sb.append(id);
		sb.append(",name:");
		sb.append(name);
		sb.append(",students:[");
		students.forEach((Student student) -> {
			sb.append("id:");
			sb.append(student.getId());
			sb.append(",name:");
			sb.append(student.getName());
			sb.append(";");
		});
		sb.append("]");
		return sb.toString();
	}
}
