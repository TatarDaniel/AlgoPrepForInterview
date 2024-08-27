package org.dt.project.arrays.medium;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(final List<Integer> list, final int toMove) {

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            while(left < right && list.get(right) == toMove) {
                right--;
            }
            if(left < right && list.get(left) == toMove) {
                Collections.swap(list, left, right);
            }
            left++;
        }

        return list;
    }
}


/*
* Additional solution is to use concurrent ds but it will involve n^2 time and space complexity
* */

/*
public static List<Integer> moveElementToEnd(final List<Integer> list, final int toMove) {

        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>(list);

        for(Integer elements : copyOnWriteArrayList){
            if(elements == toMove){
                copyOnWriteArrayList.remove(elements);
                copyOnWriteArrayList.add(toMove);
            }
        }

        return copyOnWriteArrayList;
    }
 */
