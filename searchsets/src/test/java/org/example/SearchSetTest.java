package org.example;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

import com.sun.source.tree.BinaryTree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class SearchSetTest {
    @Test
    public void testSearchSet() {
        SearchSet searchSet = new SearchSet();
        assertThat(searchSet.getNumberElements()).isEqualTo(0);

        assertThat(searchSet.contains(5)).isFalse();
        assertThat(searchSet.contains(10)).isFalse();
        assertThat(searchSet.contains(2)).isFalse();

        searchSet.insert(5);

        assertThat(searchSet.contains(5)).isTrue();
        assertThat(searchSet.contains(10)).isFalse();
        assertThat(searchSet.contains(2)).isFalse();
        assertThat(searchSet.getNumberElements()).isEqualTo(1);

        searchSet.insert(10);

        assertThat(searchSet.contains(5)).isTrue();
        assertThat(searchSet.contains(10)).isTrue();
        assertThat(searchSet.contains(2)).isFalse();
        assertThat(searchSet.getNumberElements()).isEqualTo(2);

        searchSet.insert(2);

        assertThat(searchSet.contains(5)).isTrue();
        assertThat(searchSet.contains(10)).isTrue();
        assertThat(searchSet.contains(2)).isTrue();

        assertThat(searchSet.getNumberElements()).isEqualTo(3);

        searchSet.insert(2); // Test repeated inserts
        searchSet.insert(5);
        searchSet.insert(10);

        assertThat(searchSet.contains(5)).isTrue();
        assertThat(searchSet.contains(10)).isTrue();
        assertThat(searchSet.contains(2)).isTrue();

        assertThat(searchSet.getNumberElements()).isEqualTo(3);
    }

    @Test
    public void testBinaryTree() {
        BinaryTreeNode headNode = new BinaryTreeNode(1);

        assertThat(headNode.getValue()).isEqualTo(1);
        assertThat(headNode.getLeft()).isEqualTo(null);
        assertThat(headNode.getRight()).isEqualTo(null);

        headNode.setValue(2);

        assertThat(headNode.getValue()).isEqualTo(2);
        assertThat(headNode.getLeft()).isEqualTo(null);
        assertThat(headNode.getRight()).isEqualTo(null);

        headNode.setLeft(new BinaryTreeNode(3));

        assertThat(headNode.getValue()).isEqualTo(2);
        assertThat(headNode.getLeft().getValue()).isEqualTo(3);
        assertThat(headNode.getRight()).isEqualTo(null);

        headNode.setRight(new BinaryTreeNode(4));

        assertThat(headNode.getValue()).isEqualTo(2);
        assertThat(headNode.getLeft().getValue()).isEqualTo(3);
        assertThat(headNode.getRight().getValue()).isEqualTo(4);
    }
}
