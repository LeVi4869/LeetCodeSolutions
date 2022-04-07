class Solution {
    int camera = 0;

    public enum Camera {
        HAS_CAMERA, COVERED, PLEASE_COVER
    };

    public int minCameraCover(TreeNode root) {
        return cover(root) == Camera.PLEASE_COVER ? ++camera : camera;
    }

    public Camera cover(TreeNode root) {
        if (root == null) {
            return Camera.COVERED;
        }
        Camera l = cover(root.left);
        Camera r = cover(root.right);
        if (l == Camera.PLEASE_COVER || r == Camera.PLEASE_COVER) {
            camera++;
            return Camera.HAS_CAMERA;
        }
        if (l == Camera.HAS_CAMERA || r == Camera.HAS_CAMERA) {
            return Camera.COVERED;
        }
        return Camera.PLEASE_COVER;
    }
}