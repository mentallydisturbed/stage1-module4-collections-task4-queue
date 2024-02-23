package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        int lastPos = 0;
        while(!queue.isEmpty()) {
            Queue<Integer> newQueue = new LinkedList<>();
            int pos = (lastPos + everyDishNumberToEat - 1) % queue.size();
            for(int j = 0; j < pos ; j++) newQueue.add(queue.poll());
            result.add(queue.poll());
            while(!queue.isEmpty()) {
                newQueue.add(queue.poll());
            }

            queue = newQueue;
            lastPos = pos;
        }
        return result;
    }
}
