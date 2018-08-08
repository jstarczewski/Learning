import java.util.*;

public class TimeConverter {

    public static String convertTime(String s) {
        if (s.contains("AM")) {
            if (s.substring(0, 2).equals("12")) {
                return "00" + s.substring(2, s.length() - 2);
            } else {
                return s.substring(0, s.length() - 2);
            }
        } else if (s.contains("PM")) {
            if (s.substring(0, 1).equals("0")) {
                int t = Integer.valueOf(s.substring(1, 2));
                t += 12;
                String temp = s.substring(2, s.length() - 1);
                String newTime = String.valueOf(t) + temp.substring(0, temp.length() - 1);
                return newTime;
            } else {
                int t = Integer.valueOf(s.substring(0, 2));
                if (t==12)
                    return "00" + s.substring(2, s.length() - 2);
                else
                    t+=12;
                    return t+s.substring(2, s.length()-2);
            }
        }
        return s;
    }


    public static void main(String[] args) {
        String time = "11:12:35PM";
        System.out.println(convertTime(time));

    }

}
