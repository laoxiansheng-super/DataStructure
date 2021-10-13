package 栈.stack;/*

 */

public class stack {
    private String [] arr;
    private int Maxsize;
    private int top;
    public stack(int maxsize){
        this.Maxsize=maxsize;
        arr=new String[this.Maxsize];
    }

    public  boolean isfull(){
        return  top==Maxsize-1;
    }
    public  boolean isempty(){
        return top==-1;
    }
    //入栈
    public  void push(String s){
if (isfull()){return;}
top++;
arr[top]=s;
    }
    //出栈
    public  void get(){
        if (isempty()){return;}
        top--;
//        System.out.println(arr[top]);
    }
    //展示
    public  void show(){
        for (int i = top; i >0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        stack stack = new stack(5);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.show();
        stack.get();
        stack.show();
    }



}
