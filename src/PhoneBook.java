import java.util.*;

public class PhoneBook  {
    private  HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    private Comparator<? super Map.Entry<String, ArrayList<Integer>>> PhoneComparator;

    public void add(String name, Integer phoneNum) {  //Добавление


        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(phoneNum);
        }
        else {
            ArrayList<Integer> phone=new ArrayList<>();
            phone.add(phoneNum);
            phoneBook.put(name,phone);
        }
    }

    public ArrayList<Integer> find(String name) { //  вывод номеров по имени

        return phoneBook.get(name);
    }

    public  void print() { // вывод всей мапы
        List<Map.Entry<String,ArrayList<Integer>>> entryList=new ArrayList<>(phoneBook.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, ArrayList<Integer>>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList<Integer>> o1, Map.Entry<String, ArrayList<Integer>> o2) {
                return o2.getValue().size()-o1.getValue().size();
            }
        });
        System.out.println(entryList);
    }

}
