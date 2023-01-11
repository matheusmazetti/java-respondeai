public class User {
    String name;
    private String email;
    String birthDate;
    private String cpf;
    int completedCourses;
    int allCourses;

    void registration(){
        this.allCourses += 1;
    }

    void complete(){
        this.completedCourses += 1;
    }

    void changeCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    void changeEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
}
