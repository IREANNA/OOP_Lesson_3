import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class StudyGroup {
    private String groupName;
    private List<Student> studentList = new ArrayList<Student>();
    private int studentsCount=0;


    public StudyGroup(String groupName) {
        this.groupName = groupName;
    }

    public StudyGroup(String groupName, List<Student> studentList) {
        this.groupName = groupName;
        this.studentList = new ArrayList<>(studentList);
        this.studentsCount = this.studentList.size();
    }

    public StudyGroup(){}

    public void addStudent(Student student) {
        getStudentList().add(student);
        this.studentsCount++;
    }

    public void addListStudents(List<Student> studentList) {
        this.studentList = studentList;
        this.studentsCount += studentList.size();
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
        studentsCount--;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    @Override
    public String toString() {
        return "Группа " + groupName + ": " + studentList;
    }

}