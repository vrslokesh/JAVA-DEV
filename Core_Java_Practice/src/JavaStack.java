import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Deer");
        animal.push("Rabbit");
        animal.push("Horse");
        System.out.println(animal.peek());
        System.out.println(animal);
        animal.pop();
        System.out.println(animal);



    }

}
