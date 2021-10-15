package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */

    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        //Task implementation
        if (firstNumber == null || secondNumber == null)
            throw new RuntimeException("null list is detected!");

        return getNum(firstNumber) + getNum(secondNumber);
    }

    public Integer getNum(List<Integer> list) {
        Integer res = 0;
        for (int i = 0; i < list.size(); i++) {
            res = res + list.get(i) * (int) Math.pow(10, i);
        }
        return res;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        // Task implementation
        if (list == null)
            throw new RuntimeException("null list is detected!");

        if (list.isEmpty())
            return Collections.EMPTY_LIST;

        List newList = new ArrayList();
        for (int i = 0; i < list.size(); i = i + 2) {
            newList.add(list.get(i));
        }
        return newList;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        // Task implementation
        if (list == null)
            throw new RuntimeException("null list is detected!");

        if (list.isEmpty())
            return Collections.EMPTY_LIST;

        List newList = new ArrayList();
        newList.add(list.get(0));
        if (list.size() > 1)
            newList.add(list.get(list.size() - 1));

        return newList;
    }
}
