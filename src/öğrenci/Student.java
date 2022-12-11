public class Student {
    String name;
    String stuNo;
    String year;
    Course quiz;
    Course exam;
    double average;
    boolean isPass;

    Student(String name, String stuno, String year, Course quiz, Course exam){
        this.name= name;
        this.stuNo= stuNo;
        this.year= year;
        this.quiz = quiz;
        this.exam=exam;
        this.average=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(int note1,int note2){
        if(note1>=0 && note1<=100){
            this.quiz.note=note1;
        }
        if(note2>=0 && note2<=100){
            this.exam.note=note2;
        }
    }
    void isPass(){
        System.out.println("====================");
        this.average=(this.quiz.note)*0.2+(this.exam.note)*0.8;
        if(this.average>=55) {
            System.out.println("Congrats, You passed!");
            this.isPass = true;
        }else{
            System.out.println("Sorry, you didn't pass:(");
            this.isPass = false;
        }
    }
    void printNote(){
        System.out.println(this.quiz.name+" Quiz: "+this.quiz.note);
        System.out.println(this.exam.name+" Exam: "+this.exam.note);
        System.out.println("Ortalamanız: "+this.average);
    }

}
