package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> tailsList =  new ArrayList<>(value.length() + 1);
        tailsList.add(value);
        do {
            value = value.substring(1);
            tailsList.add(value);
        }while(!value.equals(""));
        return tailsList;
    }

}
