class Box
{
double width,height,depth;

void volume()
{
System.out.println("volume is:"+(width*height*depth));
}
}

class BoxDemo
{
public static void main(String args[])
{
Box ob1=new Box();
Box ob2=new Box();

ob1.width=10;
ob1.height=15;
ob1.depth=20;

ob2.width=3;
ob2.height=6;
ob2.depth=9;

ob1.volume();
ob2.volume();
}
}