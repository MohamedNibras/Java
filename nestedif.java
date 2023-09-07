class NestedIf
{
public static void main(String args[])
{
double age=10;
double weight=30;

if(age>=18)
{
if(weight>30)
{
System.out.println("the person is eligible to donate blood");
}
else
{
System.out.println("not eligible");
}
}

else
{
System.out.println("age must be greater than 18");
}
}
}