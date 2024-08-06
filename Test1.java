class Test1
{
  /*static int rollno=3131;
  static String stname="Vandhana";
  static void displayStudentInfo()
  {
    System.out.println("Student rollno:"+rollno);
    System.out.println("Student name:"+stname);
  }  
  public static void main(String args[])
  {
    displayStudentInfo();  //Invocaing 
  }*/
  int rollno=3131;
  String stname="Vandhana";
  static String collname="PBR VITS";//no need of obj
  void displayStudentInfo()
  {
    System.out.println("Student rollno:"+rollno);
    System.out.println("Student name:"+stname);
  } 
  public static void main(String args[])
  {
    Test1 obj=new Test1();
    System.out.println(obj.rollno);
    System.out.println(obj.stname);
    System.out.println(Test1.collname);
    obj.displayStudentInfo();
    //displayStudentInfo();  //Invocaing 
  } 
}