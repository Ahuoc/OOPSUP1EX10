package org.example;

public class SearchSet {
    private int mElements;
    private BinaryTreeNode mHead;

    public SearchSet() {
        mHead = null;
        mElements = 0;
    }

    public void insert(int value) {
        if (mHead == null) {
            mHead = new BinaryTreeNode(value);
            mElements++;
            return;
        }
        BinaryTreeNode treeNode = mHead;
        while (treeNode != null) {
            if (value == treeNode.getValue()) {
                return;
            }
            else if (value < treeNode.getValue()) {
                if (treeNode.getLeft() == null) {
                    treeNode.setLeft(new BinaryTreeNode(value));
                    mElements++;
                    return;
                }
                treeNode = treeNode.getLeft();
            }
            else {
                if (treeNode.getRight() == null) {
                    treeNode.setRight(new BinaryTreeNode(value));
                    mElements++;
                    return;
                }
                treeNode = treeNode.getRight();
            }
        }
    }

    public int getNumberElements() {
        return mElements;
    }

    public boolean contains(int value) {
        BinaryTreeNode treeNode = mHead;
        while (treeNode != null) {
            if (value == treeNode.getValue()) {
                return true;
            }
            else if (value < treeNode.getValue()) {
                treeNode = treeNode.getLeft();
            }
            else {
                treeNode = treeNode.getRight();
            }
        }
        return false;
    }

    public static void main (String[] args) {

    }
}
