public class Tasksheet129 {

    public static void main(String[] args) {
        
    try {
        gorilla animal = new gorilla();

        animal.groom();
        animal.pet();
        animal.feed(true);  // put gorilla food into cage
    }
        catch (Exception e) {
            System.out.println(e);
    }
    }
}
