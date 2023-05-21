import java.util.*;

public class test {

    public static void main(String[] args){

        Map<String,Integer> note = new HashMap<>();
        note.put("amine",19);
        note.put("ayoub",19);
        note.put("ahmed",19);
        note.put("moad",19);
        note.put("simo",19);
        note.put("mourad",20);

        Map<String,List<Date>> note1 = new HashMap<>();


        List<Date> date = new ArrayList<>();
        date.add(new Date());
        date.add(new Date());
        date.add(new Date());
        date.add(new Date());

        System.out.println(date);

        note1.put("ddd",date);
        note1.put("yyy",date);

        System.out.println(note1);

        if(note1.containsKey("ddd")){
            System.out.println("hhhh");
        }

    }

}
