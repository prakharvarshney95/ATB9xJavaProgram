package Nov_2024.ex_07112024_Inheritance.singleInheritance.example2;

public class Python extends Programming {

    // Extend - is A
    // Python is a Programming

    void print() {
        System.out.println(versions);
        System.out.println(author);
    }

    Python() {
        System.out.println("DC");
    }

    public static void main(String[] args) {
        Python p1 = new Python();
        System.out.println(p1.author);
        System.out.println(p1.versions);
    }
}
