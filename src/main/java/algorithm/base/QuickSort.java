package algorithm.base;

import algorithm.ITestInterface;

/**
 * Created by yocn on 2019/3/20.
 * 快速排序
 * https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653195042&idx=1&sn=2b0915cd2298be9f2163cc90a3d464da&chksm=8c99f9f8bbee70eef627d0f5e5b80a604221abb3a1b5617b397fa178582dcb063c9fb6f904b3&scene=21#wechat_redirect
 */
public class QuickSort implements ITestInterface {
    @Override
    public void test() {
        int[] sort = {4, 7, 6, 5, 3, 2, 8, 1};
//        quitSort(sort, 0, sort.length - 1);
        quitSort(Constants.src, 0, Constants.src.length - 1);
    }

    public void quitSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = sort(array, left, right);
        quitSort(array, left, index - 1);
        quitSort(array, index + 1, right);
    }

    public int sort(int[] array, int left, int right) {
        int pivotIndex = left;
        int pivot = array[pivotIndex];
        int leftIndex = left;
        int rightIndex = right;
        while (rightIndex != leftIndex) {
            if (array[rightIndex] < pivot) {
                //右指针比基准小，等待左指针找到比基准大的交换
                if (array[leftIndex] > pivot) {
                    swap(array, leftIndex, rightIndex);
                } else {
                    leftIndex++;
                }
            } else {
                rightIndex--;
            }
        }
        swap(array, leftIndex, pivotIndex);
        Constants.printInts(array, leftIndex);
        return leftIndex;
    }

    private void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
