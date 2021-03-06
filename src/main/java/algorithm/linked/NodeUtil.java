package algorithm.linked;

import util.LogUtil;

/**
 * Created by yocn on 2019/7/8.
 */
public class NodeUtil {
    public static SingleNode createASingleNodeList() {
        return createASingleNodeList(7);
    }

    public static SingleNode createASingleNodeList(int length) {
        SingleNode root = new SingleNode(0);
        for (int i = 0; i < length - 1; i++) {
            root.getLevelNode(i).setNext(new SingleNode(i + 1));
        }
        return root;
    }

    public static SingleNode getNodeDeep(SingleNode node, int deep) {
        if (deep > getLinkedListLength(node)) {
            return null;
        }
        int index = 0;
        SingleNode currentNode = node;
        while (currentNode != null) {
            currentNode = currentNode.getNext();
            index++;
            if (deep == index) {
                return currentNode;
            }
        }
        return null;
    }

    public static int getLinkedListLength(SingleNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.getNext();
        }
        return length;
    }

    public static boolean isLinkedListLoop(SingleNode node) {
        SingleNode fastPointer = node;
        SingleNode slowPointer = node;
        while (slowPointer != null && fastPointer != null && slowPointer.getNext() != null && fastPointer.getNext() != null) {
            fastPointer = fastPointer.getNext().getNext();
            slowPointer = slowPointer.getNext();
            if (fastPointer == slowPointer) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLoop(SingleNode node) {
        if (node == null || node.getNext() == null) {
            return false;
        }
        SingleNode fast = node.getNext();
        SingleNode slow = node;
        while (fast != null) {
            if (fast == slow) {
                return true;
            }
            if (fast.getNext() != null) {
                fast = fast.getNext().getNext();
            } else {
                return false;
            }
            slow = slow.getNext();
        }
        return false;
    }

    public static void printASingleNodeList(String TAG, SingleNode node) {
        LogUtil.Companion.d(TAG + " " + getASingleNodeList(node));
    }

    public static String getASingleNodeList(SingleNode node) {
        if (isLinkedListLoop(node)) {
            return "链表有环";
        }
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.getVal()).append("->");
            node = node.getNext();
        }
        sb.append("null");
        return sb.toString();
    }

    public static void printASingleNodeList(SingleNode node) {
        if (isLinkedListLoop(node)) {
            LogUtil.Companion.d("链表有环");
        }
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.getVal()).append("->");
            node = node.getNext();
        }
        sb.append("null");
        LogUtil.Companion.d(sb.toString());
    }
}
