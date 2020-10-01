package uaslp.enginering.labs;

public class Checkbox {
    private String text;

    public Checkbox(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void draw(){
        System.out.print("[""]" + text);
    }

}
