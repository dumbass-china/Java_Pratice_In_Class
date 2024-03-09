package firstapp;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] pro; //declaring an array
        pro = new String[4];//
        //assigning the values to array pro

        pro[0]="Siem Reap";
        pro[1]="Banteay Meanchey";
        pro[2]="Battambang";
        pro[3]="Porsat";

        String[] pros={"Siem Reap","Banteay Meanchey","Battambang","Porsat"};

        //retrieval the values of array elements
        for(int i=0; i<pro.length; i++){
            System.out.println(pro[i]);
        }

        //enhanced for loop : foreach loop

        for(String p :pro)  {
            System.out.println(p);
        }

        for(var p :pros)  {
            System.out.println(p);
        }
    }
}
