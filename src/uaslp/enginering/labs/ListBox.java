package uaslp.enginering.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBox extends Control {
    private List<String> options;

    public ListBox(String ... options){
        this.options = new ArrayList<>(options.length);

        Collections.addAll(this.options, options);
    }

    @Override
    protected void draw() {

        for(String option: options){
            System.out.print(option + " - ");
        }

    }
}
