package com.codewithmhg.iterator;

public class Main {
    public static void main(String[] args) {
        var browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");
        browseHistory.push("d");

        Iterator iterator = browseHistory.createIterator();
        while(iterator.hasNext()) {
            var url = iterator.current();
            if(url != null)
                System.out.println(url);
            iterator.next();
        }
    }
}
