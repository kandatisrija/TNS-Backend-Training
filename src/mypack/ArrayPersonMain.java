package mypack;

public class ArrayPersonMain {

    public static void main(String[] args) {

        ArrayPerson[] p = {
                new ArrayPerson("Aadhyaaa", 18),
                new ArrayPerson("Srija", 20)
        };

        for (ArrayPerson person : p) {
            System.out.println(person);
        }
    }
}
