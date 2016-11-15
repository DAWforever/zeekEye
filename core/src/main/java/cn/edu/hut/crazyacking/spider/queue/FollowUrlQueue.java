package cn.edu.hut.crazyacking.spider.queue;

import java.util.LinkedList;

/**
 * 未访问的url队列
 *
 * @author crazyacking
 */
public class FollowUrlQueue {
    /*
    队列中对应最多的超链接数量
     */
    public static final int MAX_SIZE = 10000;
    /*
    超链接队列
     */
    private static final LinkedList<String> followUrlQueue = new LinkedList<String>();

    public synchronized static void addElement(String url) {
        followUrlQueue.add(url);
    }

    public synchronized static void addFirstElement(String url) {
        followUrlQueue.addFirst(url);
    }

    public synchronized static String outElement() {
        return followUrlQueue.removeFirst();
    }

    public synchronized static boolean isEmpty() {
        return followUrlQueue.isEmpty();
    }

    public static int size() {
        return followUrlQueue.size();
    }

    public static boolean isContains(String url) {
        return followUrlQueue.contains(url);
    }
}
