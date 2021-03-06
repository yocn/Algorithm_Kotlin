import algorithm.PrefixSum.BestWorkTime;
import algorithm.PrefixSum.CommonPrefix;
import algorithm.PrefixSum.MinM;
import algorithm.XApple;
import algorithm.monotoneStack.BadHairCows;
import algorithm.monotoneStack.MinLeftNum;
import algorithm.monotoneStack.StageWater;
import algorithm.other.HammingDistance;
import algorithm.other.SortArray;
import algorithm.stackQueue.Queue2Stack;
import algorithm.stackQueue.Stack2Queue;
import lock.ProducerAndCustomer;
import structure.testLinkedList;
import util.LogUtil;
import zipFileTest.testZipFile;

import java.io.IOException;
import java.util.*;

/**
 * Created by yocn on 2018/12/4.
 * //
 */
public class Main {
    //    public static void main(String[] args) {
////        System.out.println("asdadsa");
////        AnnoParser parser = new AnnoParser();
////        parser.parse(IAlgoProxy.class);
////        int[] indexs = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
////        for (int i = 0; i < 10; ++i) {
////            System.out.println("i->" + i + " index->" + indexs[i]);
////        }
////        for (int i = 0; i < 10; i++) {
////            System.out.println("i->" + i + " index->" + indexs[i]);
////        }
//
////        LogUtil.Companion.d("yocn Function->" + Constant.ifInConstents(Constant.Function.class, 100));
//
////        LogUtil.Companion.d("yocn Function->" + Constant.Function.TYPE_TOAST);
////        LogUtil.Companion.d("yocn Function->" + Constant.Function.TYPE_SHOW_LOCAL_IMAGE_0);
//
////        ThreadLocal threadLocal;
////        LinkedHashMap ma;
////        String string = null;
////        HashMap<Integer, String> map = new HashMap<>();
////        map.put(null, "123");
////        System.out.println("0     ->" + map.get(null) + " v->" + hash(null));
////
////        System.out.println("1     ->" + map.hashCode() + " v->" + (map.hashCode() >>> 16) + " x->" + (map.hashCode() ^ (map.hashCode() >>> 16)));
//
////        new ATestLock().doTest();
////        new TestTreeMap().test();
//
//        Random random = new Random();
//        StringBuffer sb = new StringBuffer();
//        sb.append("{");
//        for (int i = 0; i < 47; i++) {
//            sb.append("x:").append(random.nextInt(10000)).append(",y:").append(random.nextInt(10000)).append("|");
//        }
//        sb.append("}");
//        try {
//            int srcLength = sb.toString().length();
//            byte[] dest = GZIPUtils.compress(sb.toString());
//            String ss = new String(dest, "utf-8");
//            LogUtil.Companion.d("" + ss);
//            e.printStackTrace();
//        }
//    }
//
//    static final int hash(Object key) {
//        int h;
//        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
//    }
//}

    public static void main(String[] args) throws IOException {
//        ZigzagConversion.test();
//        Palindromic.test();
//        LongestSubString.test();
//        IsPalindromic.test();
//        RegularExpressionMatching.test();
//        EightQueen.test();
//        new TraverseBinaryTree().test();
//        new SimpleDynamicProxy().test();
//        TestRetrofit.retrofitGetWeather();
//        TestOKHttp.test();
//        new TestRecursion(0).process();
//        testOKIO.test();
//        new GenerateParenttheses().test();
//        new ArrangeAllString().test();
//        new CombinationOfPhoneNumLetter().test();
//        new CombinationNum().test();
//        new CombinationNum2().test();
//        new Permutations().test();
//        new Fibonacci().test();
//        new TestAQS().test();
//        new SpiralMatrix().test();
//        new PascalTriangle().test();
//        new SprialMatrixII().test();
//        new LongestUnivaluePath().test();
//        new RomanToInteger().test();
//        new ReverseInteger().test();
//        new Sum3().test();
//        new SumOfLeftLeaves().test();
//        new Sum2().test();
//        new Atoi().test();
//        new ChainAdd().test();
//        new GetStep().test();
//        new BinarySearch().test();
//        ITestInterface test = new BubbleSort();
//        ITestInterface test = new BinaryTreeBFS();
//        test.test();

//        LogUtil.Companion.d(""+Math.pow(1.01,365));

//        String RC4Key = "1234567890Abcdef";
//        char[] chars = RC4Key.toCharArray();
//        int a1 = 0;
//        int[] tar = new int[4];
//        for (int i = 0; i < chars.length; i++) {
//            int digit = i % 4;
//            int real = chars[i] << 8 * digit;
//            LogUtil.Companion.d(i + " - " + real + " digit->" + digit);
//            a1 += real;
//            if (i % 4 == 3) {
//                tar[i / 4] = a1;
//                LogUtil.Companion.d("---------" + a1 + " i/4->" + (i / 4));
//                a1 = 0;
//            }
//        }
//        for (int i : tar) {
//            LogUtil.Companion.d("" + i);
//        }

//        int a = 3;
//        int b = 4;
//
//        add(a, b);
//        LogUtil.Companion.d(a);
//        LogUtil.Companion.d(b);
//
//        int[] aa = {1, 2};
//        int[] bb = {3, 4};
//        LogUtil.Companion.d(aa[0] + "|" + aa[1]);
//        LogUtil.Companion.d(bb[0] + "|" + bb[1]);
//
//        String sa = "12";
//        String sb = "12";
//        add(sa, sb);
//        LogUtil.Companion.d(sa);
//        LogUtil.Companion.d(sb);
//
//        Integer ai = Integer.parseInt("12");
//        Integer bi = Integer.parseInt("34");
//        add(ai, bi);
//        LogUtil.Companion.d(ai);
//        LogUtil.Companion.d(bi);
//
//        O ao = new O(1);
//        O bo = new O(2);
//        add(ao, bo);
//        LogUtil.Companion.d(ao.x);
//        LogUtil.Companion.d(bo.x);

//        ProductMethod.productMethod();
//        new testReflect().test();
//        new GenerateParenttheses().test();
//        new SortedArray().test();
//        new CountBinaryTreeNode().test();
//        new DepthOfBinaryTree().test();
//        new BinaryTreeBFS().test();
//        new LongestSubString().test();
//        new TrieTree().test();
//        new BinaryTreeMirror().test();
//        new CountingSort().test();
//        new BinarySearch().test();
//        new BinaryTreeBFS().test();
//        new BinaryTreeDFS().test();
//        new CompleteBinTreeAddNode().test();
//        new BubbleSort().bubbleSort(new int[]{1, 9, 2, 4, 7, 3, 7, 2, 7, 20, 1, 11, 12, 8});
//        LogUtil.Companion.d(new BinarySearch().binSearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 9));
//        LogUtil.Companion.d(0 ^ 12);
//        BinaryTreeUtil.printBinTree(BinaryTreeUtil.prepareANode2());
//        new testStaticCodeLoad().testSingleTon();

//        new testArrayDeque().test();
//        new testThreadLocal().test();
//        new LongestChildString().test();
//        new FastSlowPointer().test();
//        LogUtil.Companion.d("" + (-1 % 8));
//        LogUtil.Companion.d("" + (-10 % 16));
//        LogUtil.Companion.d("" + (-10 & 15));
//        LogUtil.Companion.d("" + (6 & 15));
//        LogUtil.Companion.d("" + Integer.toBinaryString(6));
//        LogUtil.Companion.d("" + Integer.toBinaryString(-10));
//
//        LogUtil.Companion.d("" + Integer.toBinaryString(-1));
//        LogUtil.Companion.d("" + Integer.toBinaryString(-2));
//        LogUtil.Companion.d("" + Integer.toBinaryString(-3));
//        LogUtil.Companion.d("" + Integer.toBinaryString(-4));
//        LogUtil.Companion.d("" + Integer.toBinaryString(-5));
//        for (int i = -10; i <= 10; i++) {
//            LogUtil.Companion.d(i + "   " + Integer.toBinaryString(i));
//        }
//        new LongestChildString().test();
//        new QuickSort().test();
//        new MergeSort().test();
//        new XApple().test();
//        new Queue2Stack().test();
//        new Stack2Queue().test();
//        new ProducerAndCustomer().test();
//        new testLinkedList().test();
//        new CompleteBinTreeAddNode().test();
//        new MinStack().test();
//        new SingleLinkedList().test();
//        new HammingDistance().test();
//        new SortArray().test();
//        new MinLeftNum().test();
//        new BadHairCows().test();
//        new StageWater().test();
//        new CommonPrefix().test();
//        new MinM().test();
//        new BestWorkTime().test();
        new testZipFile().test();
    }

//    static class O {
//        public O(int x) {
//            this.x = x;
//        }
//
//        public int x;
//    }
//
//    public static void add(int x, int y) {
//        x++;
//        y++;
//    }
//
//    public static void add(Integer x, Integer y) {
//        x++;
//        y++;
//    }
//
//    public static void add(int[] x, int[] y) {
//        x[0] = 10;
//        y[0] = 10;
//    }
//
//    public static void add(String x, String y) {
//        x += "a";
//        y += "a";
//    }
//
//    public static void add(O x, O y) {
//        x.x++;
//        y.x++;
//    }
}