
public class Left_View_BTree 
{
    static class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    static Node root;
    void printleftview()
    {
        printlv(root,1);
    }
    static int level=0;
    void printlv(Node root,int n)
    {
        if(root == null)
            return;
        if(level<n)
        {
            System.out.println(root.data + " ");
            level=n;
        }
        printlv(root.left,n+1);
        printlv(root.right,n+1);
    }
    public static void main(String srgs[])
    {
        Left_View_BTree lv=new Left_View_BTree();
        lv.root=new Node(10);
        lv.root.left=new Node(20);
        lv.root.right=new Node(30);
        lv.root.left.left=new Node(40);
        lv.root.left.right=new Node(50);
        lv.root.right.right=new Node(60);
        lv.root.left.right.left=new Node(70);
        lv.root.left.right.left.right=new Node(80);
        lv.printleftview();
    }
}
