package com.codewithmhg.memento;

public class Editor {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public EditorState createState(){
        return new EditorState(content);
    }
    public void restore(EditorState state){
        content = state.getContent();
    }
    public void undo(){
        StringBuilder buffer = new StringBuilder();
        for(int i=0;i<content.length()-1;i++){
            buffer.append(content.charAt(i));
        }
        content = String.valueOf(buffer);
    }

}
