package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * (-1);
            }
        });
        for(String s : firstList) {
            priorityQueue.add(s);
        }
        for (String s:
             secondList) {
            priorityQueue.add(s);
        }
        return priorityQueue;
    }
}
