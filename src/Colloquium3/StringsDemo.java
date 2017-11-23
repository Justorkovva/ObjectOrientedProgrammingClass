package Colloquium3;

public class StringsDemo {

public static void main(String[] args) {
Strings s= new Strings("dependent","extreme","continued","attending","projection");

System.out.println("Printed in alphabetical order:");
s.PrintInAlphabeticalOrder();
System.out.println();

System.out.println("All joined into one string with commas : ");
s.JoinIntoOneString();
System.out.println();

System.out.println("Joined and reversed :");
s.Reverse();

}
}