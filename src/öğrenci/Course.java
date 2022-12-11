public class Course {
    teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix){
          this.name = name;
          this.code = code;
          this.prefix = prefix;
          int note = 0;

    }

    void addTeacher(teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve Ders bilgileri uyuşmuyor.");
        }

    }

    void printTeacherInfo(){

        this.teacher.print();
     }



}
