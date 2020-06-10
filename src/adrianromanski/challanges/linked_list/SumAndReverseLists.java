package adrianromanski.challanges.linked_list;

import java.util.Stack;

public class SumAndReverseLists {

    public Stack<Integer> sum(Stack<Integer> first, Stack<Integer> second) {

        int num1 = convertFrom(first);
        int num2 = convertFrom(second);

        int sum = num1 + num2;

        return convertTo(sum);
    }

    private int convertFrom(Stack<Integer> stack) {
        StringBuilder builder = new StringBuilder();

        while(!stack.isEmpty()) {
            int num = stack.pop();
            builder.append(num);
        }
        return Integer.parseInt(builder.toString());
    }

    private Stack<Integer> convertTo(int number) {

        Stack<Integer> forward = new Stack<>();
        Stack<Integer> backward = new Stack<>();

        while(number > 0) {
            forward.push(number % 10);
            number/=10;
        }

        while(!forward.isEmpty()) {
            backward.push(forward.pop());
        }

        return backward;
    }
}
