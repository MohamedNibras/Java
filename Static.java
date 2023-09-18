 class Static
{
   int rollno;
   String name; 
   static String collegename = "the new college";

   void display(int roll, String Name)
   {
      rollno = roll;
      name = Name;
      System.out.println("Name : " + name + "\nRoll no : " + rollno + "\nCollege name : " + collegename);
   }
}

class StaticDemo
{
   public static void main(String args[])
   {
      Static obj = new Static();

      obj.display(8046,"Mohamed Nibras");
   }
}