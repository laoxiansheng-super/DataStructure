package 队列;/*

 */

public class queue {
    public static void main(String[] args) {
        ArrQueue arrQueue = new ArrQueue(9);
        arrQueue.add(1);
        arrQueue.add(2);
        arrQueue.add(3);
        arrQueue.add(4);
        arrQueue.add(5);
        arrQueue.add(6);
        arrQueue.add(7);
        arrQueue.add(8);
        arrQueue.add(9);
//        arrQueue.head();
//        System.out.println("--------------------");
//
        arrQueue.show();
        System.out.println("--------------------");

//        System.out.println(arrQueue.get());
        System.out.println(arrQueue.get());
        System.out.println("--------------------");
        arrQueue.show();
    }
}

class ArrQueue {
    private int Maxsize;
    private int font;
    private int rear;
    private int arr[];

    public ArrQueue(int maxsize) {
        Maxsize = maxsize+1;
        arr = new int[Maxsize];
        rear = -1;
        font = -1;
    }

    public boolean isempty() {
        return rear ==font ;
    }

    public boolean isfull() {
        return font == Maxsize - 1;
    }

    public void add(int a) {
        if (isfull()) {
            System.out.println("队列已经满了");
            return;
        }
        rear++;
        arr[rear] = a;
    }

    public int get() {
        if (isempty()) {
            throw new RuntimeException("队列为空");
        }
        font++;
        return arr[font];
    }

    public void show(){
        if(isempty()){
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void head(){
        if (isempty()){
            System.out.println("kong");
        }
        System.out.println(arr[font+1]);
    }
}