public class teacher {
    String name;
    String mpno;
    String branch;

   teacher(String name, String mpno, String branch){
       this.name = name;
       this.mpno = mpno;
       this.branch = branch;

   }
   void print(){
       System.out.println("Adı : " + this.name);
       System.out.println("Telefonu : " + this.mpno);
       System.out.println("Branşı : " + this.branch);
   }






}
