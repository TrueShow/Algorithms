//package Lesson_3;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class PriorityQueue<T>  {
//    private PriorityArray[] queue;
//    private int head;
//
//    public PriorityQueue(int size) {
//        this.queue = new PriorityArray[size];
//        this.head = -1;
//    }
//
//    public boolean isEmpty() {
//        return head == -1;
//    }
//
//    public boolean isFull() {
//        return head == queue.length - 1;
//    }
//
//    public void push(T obj, int priority) {
//        if (isFull()) throw new RuntimeException("Array is full");
//
//        queue[++head] = new PriorityArray<T>(obj, priority);
//    }
//
//    public T pop() throws RuntimeException {
//        if (isEmpty()) throw new RuntimeException("Array is empty");
//        Arrays.sort(queue, new Comparator<PriorityArray>() {
//            public int compare(PriorityArray o1, PriorityArray o2) {
//                return o1.getPriority() - o2.getPriority();
//            }
//        });
//
//        int max = queue[0].getPriority();
//        PriorityArray pa = queue[0];
//        for (int i = 1; i < queue.length; i++) {
//            if (queue[i].getPriority() > max) {
//                max = queue[i].getPriority();
//                pa = queue[i];
//            }
//            return (T)pa;
//        }
//        return (T)queue[head--];
//    }
//
//    @Override
//    public String toString() {
//        return "Stack{" +
//                "stack=" + Arrays.toString(queue) +
//                '}';
//    }
//
//    private class PriorityArray<T>{
//        private int priority;
//        private T obj;
//
//        public PriorityArray(T obj, int priority) {
//            this.priority = priority;
//            this.obj = obj;
//        }
//
//        public int getPriority() {
//            return priority;
//        }
//
//        public T getObj() {
//            return obj;
//        }
//    }
//}
