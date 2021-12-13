//class Emp{
//    public void show(){     //instance method
//        System.out.println("Welcome");
//    }
//}
//public class Demo1 {
//    public static void main(String[] args) {
////        Emp obj=new Emp();
////        obj.show();
//        new Emp().show();//anonymous object....onky for single time.
//    }
//}

//Object array creation...............
class emp1{
    int id;
    String name;

    public emp1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class stu1{
    int marks;
    int roll_no;

    public stu1(int marks, int rollno) {
        this.marks = marks;
        this.rollno = rollno;
    }
}
public class Demo1 {
       public static void main(String[] args) {     //Object class  concept..
           Object arr[]=new Object[5];
           arr[1]=new Stu1(rollno:1,marks:45);
           arr[2]=new Emp1(id:1,name:45);
           arr[1]=new Stu1(rollno:1,marks:45);
       }
       }