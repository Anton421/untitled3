import java.util.Objects;

public class book implements Printable{
    private String name;

    public book(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println("Printable book " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        book book = (book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                '}';
    }
    public static void printBooks(Printable[] printables) {
        for (Printable p: printables) {
            if (p instanceof book)
                p.print();
        }
    }
}