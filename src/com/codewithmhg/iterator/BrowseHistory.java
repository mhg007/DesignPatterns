package com.codewithmhg.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count = 0;
    void push(String url){
        urls[count++] = (url);
    }
    public String pop(){
        return urls[--count];
    }
    public Iterator createIterator() {
        return new ListIterator(this);
    }
    public class ListIterator implements Iterator {
        private BrowseHistory history;
        private int index;
        public ListIterator(BrowseHistory history) {
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return (index < history.urls.length);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
