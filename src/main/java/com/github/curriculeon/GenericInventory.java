package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType> {
    private List<SomeType> list;

    public GenericInventory() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(SomeType someObject) {
        list.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        if (list.contains(someObject)) {
            return true;
        }
        return false;
    }

    @Override
    public SomeType get(int indexOfElement) {
//        for (int i = 1; i <= list.size(); i++) {
//            if (indexOfElement == i) {
//                return list.get(i);
//            }
//        }
        return list.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return list.remove(indexOfElement);
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return list.toArray(objectsToBeAdded);
    }
}
