class Box {
    int value;
}

public class Basics {
    public static void main(String[] args) {

        Box x = new Box();
        x.value = 5;

        Box p = x;   // p refers to same object

        System.out.println(x.value); // 5
        System.out.println(p.value); // 5

        p.value *= 6;

        System.out.println(x.value); // 30
    }
}

