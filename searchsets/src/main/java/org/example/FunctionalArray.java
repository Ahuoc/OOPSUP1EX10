package org.example;

public class FunctionalArray {
    private BinaryTreeNode mHead = null;
    private int mElements;

    public FunctionalArray(int size) {
        mElements = size;
        mHead = new BinaryTreeNode(0);
        for (int numToAdd = 1; numToAdd < mElements+1; numToAdd++) {
            int leftToAdd = numToAdd;
            BinaryTreeNode currentNode = mHead;
            boolean added = false;
            while (!added) {
                if ((leftToAdd & 1) == 1) {
                    leftToAdd >>= 1;
                    if (leftToAdd <= 1) {
                        currentNode.setRight(new BinaryTreeNode(numToAdd-1));
                        added = true;
                    }
                    currentNode = currentNode.getRight();
                }
                else {
                    leftToAdd >>= 1;
                    if (leftToAdd <= 1) {
                        currentNode.setLeft(new BinaryTreeNode(numToAdd-1));
                        added = true;
                    }
                    currentNode = currentNode.getLeft();
                }
            }
        }
    }

    public void set(int index, int value) {
        BinaryTreeNode currentNode = mHead;
        if (index == 0) {
            mHead.setValue(value);
            return;
        }
        index += 1; // Make up for head being 0
        boolean added = false;
        while (!added) {
            if ((index & 1) == 1) {
                index >>= 1;
                if (index <= 1) {
                    currentNode.getRight().setValue(value);
                    added = true;
                }
                currentNode = currentNode.getRight();
            }
            else {
                index >>= 1;
                if (index <= 1) {
                    currentNode.getLeft().setValue(value);
                    added = true;
                }
                currentNode = currentNode.getLeft();
            }
        }
    }

    public int get(int index) {
        BinaryTreeNode currentNode = mHead;
        if (index == 0) {
            return mHead.getValue();
        }
        index += 1; // Make up for head being 0
        while (true) {
            if ((index & 1) == 1) {
                index >>= 1;
                if (index <= 1) {
                    return currentNode.getRight().getValue();
                }
                currentNode = currentNode.getRight();
            }
            else {
                index >>= 1;
                if (index <= 1) {
                    return currentNode.getLeft().getValue();
                }
                currentNode = currentNode.getLeft();
            }
        }
    }

    public String toString() {
        return mHead.toString();
    }

}
