package CommandPattern;

import java.util.Map;

public class Editor {
    private String text = "";
    private int start = 0;
    private int end = 0;

    public String getText() {
        return text;
    }

    public void setText(String s) {
        text = s;
    }

    public void setSelection(int start, int end) {
        this.start = Math.min(start, end);
        this.end = Math.max(start, end);
    }

    public void setSelection(int index){
        start = index;
        end = index;
    }

    public String getSelection() throws Exception {
        if (start >= end) {
            System.out.println("invalid selection");
            throw new Exception("invalid selection");
        } else {
            return text.substring(start, end);
        }
    }

    public void deleteSelection() throws Exception {
        if (start >= end) {
            System.out.println("invalid selection");
            throw new Exception("invalid selection");
        } else {
            String temp = text.substring(0, start);
            temp = temp + text.substring(end);
            text = temp;
        }
    }

    public void replaceSelection(String s) throws Exception {
        if (start > end) {
            System.out.println("invalid selection");
            throw new Exception("invalid selection");
        } else if (start == end) {
            text = text.substring(0, start) + s + text.substring(end);
        } else {
            String temp = text.substring(0, start);
            temp += s;
            temp = temp + text.substring(end);
            text = temp;
        }
    }
}
