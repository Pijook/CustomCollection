package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomCollection<Type> implements Iterable<Type> {

    private final List<Type> list;

    public CustomCollection(){
        this.list = new ArrayList<>();
    }

    public CustomCollection(List<Type> list){
        this.list = new ArrayList<>(list);
    }

    public void add(Type a){
        list.add(a);
    }

    public void remove(Type a){
        list.add(a);
    }

    public Type get(int index){
        return list.get(index);
    }

    public int size(){
        return list.size();
    }

    public Iterator<Type> iterator(){
        return new CustomIterator(this);
    }

    public class CustomIterator implements Iterator<Type> {

        private final CustomCollection<Type> customCollection;
        private int index;

        public CustomIterator(CustomCollection<Type> customCollection){
            this.customCollection = customCollection;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < customCollection.size();
        }

        @Override
        public Type next() {
            return customCollection.get(index++);
        }
    }

}
