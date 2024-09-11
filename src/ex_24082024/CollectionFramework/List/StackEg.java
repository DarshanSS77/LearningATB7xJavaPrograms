package ex_24082024.CollectionFramework.List;

import java.util.Stack;

public class StackEg {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("One");
        s.push(2);
        s.push(true);

        System.out.println(s);

        s.pop();
        System.out.println(s);

        s.add(8);


        System.out.println(s.peek());
    }
}
