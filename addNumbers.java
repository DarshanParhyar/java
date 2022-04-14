class Main
{

 public int addNumbers(int a, int b)
 {

  int sum = a+b;
  return sum;

 }


 public static void main (String [] args)
  {
 
  int num1=34;
  int num2=45;

 Main obj = new Main();

 int result = obj.addNumbers(num1,num2);

 System.out.println("Sum is: " +result);

 
  }

}