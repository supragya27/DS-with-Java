import java.util.Scanner;
class Node{
    int data; Node lchild,rchild;
    Node(int d){
        data=d;
        lchild=rchild=null;
    }
}
class quElem{
    Node tNode;quElem next;
    quElem(Node t){
        tNode=t;
        next=null;
    }
}
class queue{
    quElem front,rear;
    queue()
    {
        front=rear=null;
    }
    void add(Node q)
    {
        if(front==null){
            front=new quElem(q);rear=front;return;
        }
        rear.next=new quElem(q);
        rear=rear.next;return;
    }
    int remove(){
        if(front==null)
        return -1;
        int a=front.tNode.data;
        front=front.next;
        return a;
    }
    quElem peek(){
        return front;
    }
}
class Tree{
     Node root;
         queue q1=new queue();
     Tree(){
         root=null;
     }
     void insert(int d){
         if(root==null){
             root=new Node(d);             
             q1.add(root);
             return;
         }
       quElem f=q1.peek();
        Node nN=new Node(d);
       if(f.tNode.lchild==null){
           f.tNode.lchild=nN;
           q1.add(nN);
        }
        else{
            f.tNode.rchild=nN;
            q1.add(nN);
            q1.remove();
        }
     }
     void inOrderPrinting(){
         Node a=root;
         iOP(a);
         System.out.println();
     }
     void iOP(Node a){
         if(a.lchild!=null)
         iOP(a.lchild);
         System.out.print(a.data+" ");
         if(a.rchild!=null)
         iOP(a.rchild);
     }

     void preOrderPrinting(){
         Node a=root;
         preOP(a);
         System.out.println();
     }
     void preOP(Node a){
         System.out.print(a.data+" ");
         if(a.lchild!=null)
         preOP(a.lchild);
         if(a.rchild!=null)
         preOP(a.rchild);
     }

     void postOrderPrinting(){
         Node a=root;
         postOP(a);
         System.out.println();
     }
     void postOP(Node a){
         if(a.lchild!=null)
         postOP(a.lchild);
         if(a.rchild!=null)
         postOP(a.rchild);
         System.out.print(a.data+" ");
     }
}
class Main
{
    public static void main(String[] args)
    {
        Tree t=new Tree();
        t.insert(4);
        t.insert(2);
        t.insert(6);
        t.insert(1);
        t.insert(3);
        t.insert(5);
        t.insert(7);
        
        System.out.print("Post order traversal: ");
        t.postOrderPrinting();
        System.out.print("Pre order traversal: ");
        t.preOrderPrinting();
        System.out.print("In order traversal: ");
        t.inOrderPrinting();
    }
    }