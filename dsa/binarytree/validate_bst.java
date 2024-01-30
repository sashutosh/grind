class Solution {
    
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);                 
    }

    //Define the upper bound and lower bound for each node, keep updating the bounds while visiting nodes using DFS
    public boolean isValidBST(TreeNode root, double minVal, double maxVal) {
        if(root ==null) return true;
        if(root.val <= minVal || root.val >= maxVal) {
            return false;
        }
        return isValidBST(root.left, minVal, root.val) &&  isValidBST(root.right, root.val, maxVal);   
                 
    }

    
}
