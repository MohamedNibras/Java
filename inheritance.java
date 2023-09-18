class a
{
int i,j;
void showij()
{
System.out.println("i and j : " +i+ ","+j);
}
}

class b extends a
{
int k;
void showk()
{
System.out.println("k :" +k);
}
}

class Inheritance
{
public static void main(String args[])
{
a superob=new a();
b subob=new b();

superob.i=10;
superob.j=20;
superob.showij();

subob.i=7;
subob.j=8;
subob.k=9;
subob.showij();
subob.showk();
}
}
