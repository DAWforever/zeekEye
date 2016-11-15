package cn.edu.hut.crazyacking.spider.queue;

import java.util.HashSet;

/**
 * 已访问url队列
 *
 * @author crazyacking
 */
public class AbnormalUrlQueue {
    private static final HashSet<String> visitedUrlQueue = new HashSet<String>();

    public synchronized static void addElement(String url) {
        visitedUrlQueue.add(url);
    }

    public synchronized static boolean isContains(String url) {
        return visitedUrlQueue.contains(url);
    }

    public synchronized static int size() {
        return visitedUrlQueue.size();
    }
}
