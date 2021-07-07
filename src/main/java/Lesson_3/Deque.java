package Lesson_3;

import java.util.Arrays;

public class Deque {
    private int head;
    private int tail;
    private int[] arr;
    private int capacity;

    public Deque(int initial) {
        this.arr = new int[initial];
        this.head = 0;
        this.tail = 0;
        capacity = 0;
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public boolean isFull() {
        return capacity == arr.length;
    }

    public void add_first(int x) {
        if (isFull())
            throw new RuntimeException("Deque is full!");
        if (head == arr.length - 1 && tail != 0) {
            head = -1;
        }
        arr[head++] = x;
        capacity++;
    }

    public void add_end(int x) {
        if (isFull())
            throw new RuntimeException("Deque is full!");
        if (tail == 0 && head != arr.length - 1) {
            tail = arr.length - 1;
        }
        arr[tail--] = x;
        capacity++;
    }

    public int pop_first() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        capacity--;
        if (head == 0) {
            head = arr.length - 1;
        }
        return arr[head--];
    }

    public int pop_end() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        capacity--;
        if (tail == arr.length - 1) {
            tail = -1;
        }
        return arr[++tail];
    }

    @Override
    public String toString() {
        return "Deque{" +
                "arr=" + Arrays.toString(arr) +
                ", capacity=" + capacity +
                '}';
    }
}
