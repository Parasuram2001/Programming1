package logicsclass1;

class Sample1
{
public String rev()
{
String str="java";
String reverse=" ";
for(int i=str.length()-1;i>=0;i--)
{
reverse=reverse+str.charAt(i);
}
return reverse;
}
}
class mainclass1
{
public static void main(String[] args)
{
Sample1 y=new Sample1();
System.out.println(y.rev());
}
}
