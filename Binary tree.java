import java.util.Stack;


class K{
    int data;
    K left,right;
    public K(int n)
    {
        data=n;
        left=right=null;

    }
    
}
 class BinaryTree
 { 
     K root;
     void inorder()
     {
         if(root==null)
         return;
         Stack<K> s=new Stack<K>();
         K x=root;
         while(x!=null||s.size()>0)
         {
             while(x!=null)
             {
                 s.push(x);
                 x=x.left;
             }
             x=s.pop();
             System.out.print(x.data+"");
             x=x.right;
         }
     }
     public static void main(String[] args) {
         
        BinaryTree tr=new BinaryTree();
        tr.root=new K(1);
        tr.root.left=new K(2);
        tr.root.right=new K(3);
        tr.root.left.left=new K(4);
        tr.root.left.right=new K(5);
        tr.inorder();

     }

 }

