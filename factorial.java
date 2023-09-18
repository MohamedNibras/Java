class Factorial
{
public static void main(String[]args)
{
for(int i=1;i<10;i++)
System.out.println("Factorial of " +i+ "is"+factorial(i));
}
static int factorial(int m)
{
if(m==1) return m; 
else
return m*factorial(m-1);
}
}
