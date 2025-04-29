import java.util.*;
public class a{
    public class Node{
        public int val;
        public Node left;
        public Node right;
        public Node(int val,Node left,Node right){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public Node root;
    public  void populate(Integer[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=null){
                insert(nums[i]);
            }
        }
    }
    public  void insert(int x){
        root = insertvalues(root, x);
    }
    public Node insertvalues(Node node,int x){
        if (node == null) {
            return new Node(x, null, null);
        }
        if (x < node.val) {
            node.left = insertvalues(node.left, x);
        } else {
            node.right = insertvalues(node.right, x);
        }
        return node;
    }
    public void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        a tree=new a();
        Integer[] nums={1,null,2,3};
        tree.populate(nums);
        tree.inorder(tree.root);

    }
}