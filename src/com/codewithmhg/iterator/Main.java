package com.codewithmhg.iterator;

public class Main {
    public static void main(String[] args) {
        var browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");
        for(int i=0;i<browseHistory.getUrls().size();i++){
            var url = browseHistory.getUrls().get(i);
            System.out.println(url);
        }
    }
}
