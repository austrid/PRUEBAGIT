public class Saludo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hi there, " + name);

        sc.close ();
        
    }
    
}
