package Trees;

//Preorder Traversal:
//------------------
//Root
//Left Subtree
//Right Subtree

public class TreePreOrder {
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

    public static void preorder(Node root)
    {
        if(root== null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        // TREE:
//           1
//          / \
//         2   3
//        / \   \
//       4   5   6

     // Pre Order: 1,2,4,5,3,6

      int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ;
        BinaryTree tree= new BinaryTree();
        Node root= tree.createTree(nodes);
        preorder(root);

    }
}
