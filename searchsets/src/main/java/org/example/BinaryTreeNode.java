package org.example;

public class BinaryTreeNode {
    private int mValue;
    private BinaryTreeNode mLeft;
    private BinaryTreeNode mRight;

    public BinaryTreeNode(int value) {
        mValue = value;
    }

    public int getValue() {
        return mValue;
    }

    public void setValue(int value) {
        mValue = value;
    }

    public BinaryTreeNode getLeft() {
        return mLeft;
    }

    public void setLeft(BinaryTreeNode left) {
        mLeft = left;
    }

    public BinaryTreeNode getRight() {
        return mRight;
    }

    public void setRight(BinaryTreeNode right) {
        mRight = right;
    }

    public String toString() {
        return "(" + mValue + ", Left:" + (mLeft != null ? mLeft.toString() : "null") + ", Right:" + (mRight != null ? mRight.toString() : "null") + ")";
    }
}
