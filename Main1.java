import java.util.Scanner;
public class Main1{
  public static void main(String[] args) {
    int w=3;
    int f=4;
    int sum=w+f;
    System.out.println(sum);
    int a=10;
    int b=3;
    int difference=a-b;
    System.out.println(difference);
    boolean truthval1=true;
    boolean truthval2=false;
    boolean booloperator=truthval1 && truthval2;
    System.out.println(booloperator);
    String str1="hello";
    String str2=" world";
    System.out.println(str1+str2);
    float f1=3.4f;
    float f2=5.6f;
    System.out.println(f1*f2);
    long population1=8000000000L;
    long population2=9000000000L;
    System.out.println(population1+population2);
    int x=45;
    int y=56;
    System.out.println(x*y);
    System.out.println(x/y);
    System.out.println(x%y);
    System.out.println(x//y);
    Scanner inputer= new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number=inputer.nextInt();
    if (number>0){
	System.out.print("Positive");
}
    else if (number==0){
	System.out.print("Neither Positive nor Negative");
}
   else {
	System.out.print("Negative");
}
    if (number%2==0){
	System.out.println(" Even");
}
    else{
	System.out.println(" Odd");
  }
    int multiplier=10;
    for(int i=0;i<5;i++){
	multiplier=multiplier*10;
    }
    System.out.println("10^^5="+multiplier);
    int counter=0;
    while (counter<=5){
	counter+=1;
	System.out.println(counter);
}
   boolean checkerr=true;
    do{
	System.out.print("Do you want checkerr to be false or true?: ");
	checkerr=inputer.nextBoolean();
} while (checkerr);

}
}