public class main {
    public static void main(String[] args) {
        teacher t1 = new teacher("Beren","PHY","530");

        Course fizikquiz = new Course("PHYSICS","101","PHY");
        fizikquiz.addTeacher(t1);

        Course fizikfinal = new Course("PHYSICS","102","PHY");
        fizikfinal.addTeacher(t1);


        Student s1 = new Student("Zehra", "11", "2", fizikquiz,fizikfinal );
        s1.addBulkExamNote(60,90);
        s1.isPass();
        s1.printNote();
    }



}
