package 单链表;/*

 */

public class SingleLinkListtest {
    public static void main(String[] args) {
        Node node0 = new Node(1, "1", "1");
        Node node1 = new Node(2, "2", "2");
        Node node2 = new Node(3, "3", "3");
        Node node3 = new Node(5, "5", "5");

        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.addbyon(node0);
        singleLinkList.addbyon(node3);
        singleLinkList.addbyon(node2);
        singleLinkList.addbyon(node1);


        Node node4 = new Node(4, "4", "4");
        Node node5= new Node(6, "6", "6");
        Node node6 = new Node(7, "7", "7");
        Node node7 = new Node(8, "8", "8");
        SingleLinkList2 singleLinkList2 = new SingleLinkList2();
        singleLinkList2.addbyon(node4);
        singleLinkList2.addbyon(node5);
        singleLinkList2.addbyon(node6);
        singleLinkList2.addbyon(node7);

       singleLinkList.merge(singleLinkList.getHead(),singleLinkList2.getHead1());
 singleLinkList2.show(singleLinkList2.getHead1());

//        Node node = new Node(2, "555", "555");
//        singleLinkList.update(node);
//        singleLinkList.add(node0);
//        singleLinkList.add(node1);
//        singleLinkList.add(node2);
//        singleLinkList.add(node3);
//        singleLinkList.show();
//        System.out.println(singleLinkList.getlength(singleLinkList.getHead()));
//        System.out.println(singleLinkList.getk(singleLinkList.getHead(),4));
//
//
        //翻转
//        System.out.println("---------------------");
//        singleLinkList.Rever(singleLinkList.getHead());
//        singleLinkList.show(singleLinkList.getHead());

    }
}
class SingleLinkList2{
    private static Node head1=new Node(0,"","");

    public static Node getHead1() {
        return head1;
    }

    public void addbyon(Node node) {
        Node temp = head1;
        boolean flag = false;
        while (true) {


            if (temp.next == null) {
                break;
            }
            if (temp.next.no > node.no) {
                break;
            } else if (temp.next.no == node.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("yjchunzai" + temp.next.no);
        } else {
            node.next = temp.next;
            temp.next=node;
        }
    }

    public void add(Node node) {
        Node temp = head1;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void show(Node head1) {

        if (head1.next == null) {
            System.out.println("weikong");
            return;
        }
        Node temp = head1;
        while (true) {
            if (temp.next == null) {
                break;
            }
            System.out.println(temp.next);
            temp = temp.next;
        }
    }
    public Node getHead() {
        return head1;
    }

    public void setHead(Node head1) {
        this.head1 = head1;
    }
}
class SingleLinkList {




    public void merge(Node head1, Node head2){
        Node list1 =head1.next;
        Node list2 =head2.next;
        Node list3=new Node(0,"0","0");
        Boolean flag=false;
        if (list1==null||list2==null){return ;}
        while (true){
            if (list1.no<=list2.no){
                break;
            }
            list1.next=list2.next;
            list2.next=list1;

            list1=list1.next;
            list2=list2.next;
        }

        System.out.println(list2);

    }







    private Node head = new Node(0, "", "");
    private Node headreveral= new Node(12, "", "");


    //链表反转

    public void Rever(Node head){
    Node temp=head.next;
    Node  temp2=headreveral;
    Node next=null;
    if (head.next==null||head.next.next==null){return;}
    while (temp!=null){
        next=temp.next;
        temp.next=temp2.next;
        temp2.next=temp;
        temp=next;
    }

    head.next=headreveral.next;
    }

//链表倒数第k个元素是什么
    public  Node getk(Node head,int k){

        Node temp =head.next;
        int size=getlength(head)-k;
        if (k<=0||k>getlength(head)){return null;}

        for (int i = 0; i <size; i++) {
            temp=temp.next;
        }

        return temp;
    }


    //求节点个数
    public  int getlength(Node head){
        if(head.next==null){
            return 0;
        }
        int length=0;
//        Node temp=head;
//        while(temp.next!=null){
//            length++;
//            temp.next=temp.next.next;
//        }
        Node temp=head.next;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }


    public void  delete(Node node){
        Node temp=head;
        boolean flag=false;
        if(temp.next==null){
            System.out.println("空链表");
            return;
        }
        while(true){
            if (temp.next==null){return;}
        if (temp.next.no==node.no){
                    flag =true;
                    break;
        }
        temp=temp.next;
        }
       if (flag){
           temp.next=temp.next.next;

       }else{
           System.out.println("未找到no");
       }

    }

    public  void update(Node node){
        Node temp=head;
        boolean flag=false;
        if(temp.next==null){
            System.out.println("空链表");
            return;}
        while(true){
            if(temp.next==null){break;}
            if(temp.no==node.no){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if (flag=true){
            temp.name=node.name;
            temp.nickname= node.nickname;
        }else {
            System.out.println("没有找到");
        }
    }


    public void addbyon(Node node) {
        Node temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > node.no) {
                break;
            } else if (temp.next.no == node.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("yjchunzai" + temp.next.no);
        } else {
            node.next = temp.next;
            temp.next=node;
        }
    }

    public void add(Node node) {
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void show(Node head) {

        if (head.next == null) {
            System.out.println("weikong");
            return;
        }
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            System.out.println(temp.next);
            temp = temp.next;
        }
    }
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}

class Node {
    public int no;
    public String nickname;
    public String name;
    public Node next;

    public Node(int no, String nickname, String name) {
        this.no = no;
        this.nickname = nickname;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no='" + no + '\'' +
                ", nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +

                '}';
    }
}