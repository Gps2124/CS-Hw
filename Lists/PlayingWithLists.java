import java.util.ArrayList;

public class PlayingWithLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(4);
        list1.add(8);
        list1.add(9);
        list1.add(11);
        list1.add(15);
        list1.add(17);
        list1.add(28);
        list1.add(41);
        list1.add(59);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(7);
        list2.add(11);
        list2.add(17);
        list2.add(19);
        list2.add(20);
        list2.add(23);
        list2.add(28);
        list2.add(37);
        list2.add(59);
        list2.add(81);

        list.add("the ");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        System.out.println(list);
        addStars(list);
        System.out.println(list);
        removeStars(list);
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(intersect(list1, list2));

    }
    public static void addStars(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i += 2) {
            list.add(i, "*");
        }
    }
    public static void removeStars(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i ++) {
            list.remove(i);
        }
    }
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list2.get(j) == list1.get(i))
                    list3.add(list1.get(i));

            }
        }
        return list3;
    }

//    public static ArrayList<String> reverse(ArrayList<String> list) {
//
//    }
}

