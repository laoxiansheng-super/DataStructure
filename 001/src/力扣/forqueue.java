package 力扣;/*

 */

class MyCircularQueue {
    private int font;
    private int rear;
    private int MaxSize;
    private int[] arr;

    public MyCircularQueue(int k) {
        MaxSize = k+1;
        font = 0;
        rear = 0;
        arr = new int[MaxSize];
    }

    public boolean isEmpty() {
        return rear == font;
    }

    public boolean isFull() {
        return (rear + 1) % MaxSize == font;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else {
            arr[rear] = value;
            rear = (rear + 1) % MaxSize;
            return true;
        }
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
else{font = (font + 1) % MaxSize;
            return true;}

    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        int value = arr[font];
        return value;
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        int value = arr[(rear-1+MaxSize)%MaxSize];
        return value;

    }


}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */