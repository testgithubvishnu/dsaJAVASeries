package Trees;

public class binaryTree {
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree
    {
        static int idx=-1;
         static Node createTree(int nodes[])
        {
            idx++;
          if(nodes[idx]==-1)
          {
              return null;
          }
          Node newnode=new Node(nodes[idx]);
          newnode.left=createTree(nodes);
          newnode.right=createTree(nodes);

          return newnode;
        }
    }

    public static void main(String[] args) {
     int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     BinaryTree tree=new BinaryTree();
     Node root=tree.createTree(nodes);

        System.out.println(root.data);
    }

}
