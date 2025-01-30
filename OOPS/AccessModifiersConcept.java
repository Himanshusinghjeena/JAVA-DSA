public class AccessModifiersConcept {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.username="himanshu jeena";
        System.out.println(b.username);
        b.setPassword("jeena9718@");
        b.getpassword(); 
    }
}

 class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pswrd ){
            password=pswrd;
    }

    public void getpassword(){
        System.out.println("password: "+password);
    }
 }