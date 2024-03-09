package firstapp;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> pro= new ArrayList<String>();
        pro.add("Siem Reap");
        pro.add("Banteay Meanchey");
        pro.add("Battambang");
        pro.add("Porsat");

        for (int i=0; i<pro.size(); i++){
            System.out.println(pro.get(i));
        }
    }
}
