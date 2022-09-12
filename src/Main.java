public class Main {
    public static void main(String[] args){
        book b1 = new book("Sherlock Holmes");
        book b2 = new book("The snow queen");
        Magazine m1 = new Magazine("National Geographic ");
        Magazine m2 = new Magazine("Glamour");


        Printable[] printables = {b1,b2,m1,m2};
        for (Printable printable: printables){
            printable.print();

        }
    }
}