import java.util.Objects;

public class Student extends Human {

    private String facultyName;

    public Student(String name, String surname, String patronymic, int age, String facultyName) {
        super(name, surname, patronymic, age);
        this.facultyName = facultyName;
    }

    public Student() {
        super("name", "surname", "patronymic", 0);
        facultyName = "facultyName";
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(facultyName, student.facultyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), facultyName);
    }
}
