package Lesson_3;

public class Test {
    public static void main(String[] args) {
        Deque deq = new Deque(10);
        deq.add_first(4);
        deq.add_end(5);
        deq.add_end(65);
        deq.add_end(34);
        deq.add_first(34);
        deq.add_first(66);
        int x = deq.pop_end();
        int y = deq.pop_end();
        int z = deq.pop_end();
        int w = deq.pop_end();
        int ww = deq.pop_end();
        int zz = deq.pop_end();

        System.out.println(deq  + "\n " + x + " " + y + " " + z + " " + w + " " + ww + " " + zz);

        String word = "Привет!";

        String revers = BackWord.convert(word);
        System.out.println(revers);

//        Не успеваю с приоритетами, но мыслю хоть в верном направлении? :-)
//        PriorityQueue<String> test = new PriorityQueue<String>(10);
//        test.push("привет!", 5);
//        test.push("пока!", 3);
//        System.out.println(test.pop());


    }
}
