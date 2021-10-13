package 队列;/*

 */

public class for_queue {
    public static void main(String[] args) {
        for_ArrQueue for_arrQueue = new for_ArrQueue(10);

        for_arrQueue.add(1);
        for_arrQueue.add(2);
        for_arrQueue.add(3);
        for_arrQueue.add(4);
        for_arrQueue.add(5);
        for_arrQueue.add(6);
        for_arrQueue.add(7);
        for_arrQueue.add(8);
        for_arrQueue.add(9);
        for_arrQueue.add(10);
        System.out.println(for_arrQueue.get());
//        for_arrQueue.head();

        System.out.println("---------------");
        for_arrQueue.show();
    }
}

class for_ArrQueue {
    private int MaxSize;
    private int font;
    private int rear;
    int[] arr;

    public for_ArrQueue(int maxsize) {
        MaxSize = maxsize+1;
        arr = new int[MaxSize];
        font = 0;
        rear = 0;
    }

    public boolean isempty() {
        return font == rear;
    }

    public boolean isfull() {
        return (rear+1 ) % MaxSize == font;
    }

    public void add(int n) {
        if (isfull()) {
            System.out.println("已经满了");
            return;
        }
        arr[rear] = n;
        rear = (rear + 1) % MaxSize;
    }

    public int get() {
        if (isempty()) {
            throw new RuntimeException("队列是空");
        }
        int value = arr[font];
        font = (font + 1) % MaxSize;
        return value;
    }

    public void show() {
        if (isempty()) {
            System.out.println("kong ");
            return;
        }
        for (int i = font; i < font + (rear - font + MaxSize) % MaxSize; i++) {
            System.out.println(arr[i % MaxSize]);
        }
    }

    public void head() {
        if (isempty()) {
            System.out.println("kong");
        }
        System.out.println(arr[font % MaxSize]);
    }

}