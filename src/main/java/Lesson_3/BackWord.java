package Lesson_3;

import java.util.Arrays;

public class BackWord {
    public static String convert(String word) {
        String[] split = word.split("");
        int length = split.length;
        Stack stack = new Stack(length);
        for (int i = 0; i < length; i++) {
            stack.push(split[i]);
        }
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < length; i++) {
            newWord.append(stack.pop());
        }
        return newWord.toString();
    }

    private static class Stack {
        private String[] stack;
        private int head;

        public Stack(int size) {
            this.stack = new String[size];
            this.head = -1;
        }

        public boolean isEmpty() {
            return head == -1;
        }

        public boolean isFull() {
            return head == stack.length - 1;
        }

        public boolean push(String i) {
            if (isFull()) return false;
            stack[++head] = i;
            return true;
        }

        public String pop() throws RuntimeException {
            if (isEmpty()) throw new RuntimeException("Stack is empty");
            return stack[head--];
        }

        public String peek() throws RuntimeException {
            if (isEmpty()) throw new RuntimeException("Stack is empty");
            return stack[head];
        }

        @Override
        public String toString() {
            return "Stack{" +
                    "stack=" + Arrays.toString(stack) +
                    '}';
        }
    }
}
