public class Courses {
    String name;
    String Teacher;
    String startDate;
    String endDate;
    int allStudents;

    void includeStudent() {
        this.allStudents += 1;
    }

    void changeTeacher(String name) {
        this.name = name;
    }

    void changeSDate(String date) {
        this.startDate = date;
    }

    void changeEDate(String date) {
        this.endDate = date;
    }

    public String getCourse(){
        return this.name;
    }
}
