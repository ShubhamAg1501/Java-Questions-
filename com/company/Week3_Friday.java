import java.util.ArrayList;
public class Week3_Friday{
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object o: ar){
            System.out.println(o);

        }
        //Q2
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        //Q3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        //Q4
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);
        //Q5
        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);
        System.out.println(s);

    }
}