package model.human.comparator;

import model.tree.TreeItem;

import java.util.Comparator;
public class HumanComparatorByAge<T extends TreeItem>  implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}