
class Basics{
    public static void main(String[] args) {

        // method 01
        String str ="Himanshu Jeena";
        // methos 02
        // String str1= new String("Himanshu Jeena");
        System.out.println("str: "+str);
        // System.out.println("str1: "+str1);
        

        // Input a String
        // System.out.print("input a String: ");
        // Scanner sc = new Scanner(System.in);
        // String str2 =sc.next(); // take input only one word or character
        // System.out.println("str2: "+str2);

        // String str3 = sc.nextLine(); // take input as many as
        // System.out.println("str3: "+str3);


        // Calculate length
        System.out.println(str.length());

        // Concatenate
        String str1=" is a good Boy!!..";
        System.out.println(str+str1);

        // charAt(index) gave the charcter at specific index
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(7));
    }
}