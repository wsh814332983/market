package dataPart;

import java.util.Date;
import java.util.Calendar;

public class getTime {
	public getTime() {
    }
    public static String GetTime() { //�õ���ǰʱ��
        Date date1 = new Date();
        Calendar objcalendar;
        String time = "";
        objcalendar = Calendar.getInstance();
        int year = objcalendar.get(Calendar.YEAR);
        int Month = objcalendar.get(Calendar.MONTH);
        Month += 1;
        Integer Month1 = new Integer(Month);
        String Monthtos;
        if (Month < 10) {
            Monthtos = "0" + Month1.toString();
        } else {
            Monthtos = Month1.toString();
        }
        int Date = objcalendar.get(Calendar.DATE);
        Integer Date1 = new Integer(Date);
        String Datetos;
        if (Date < 10) {
            Datetos = "0" + Date1.toString();
        } else {
            Datetos = Date1.toString();
        }

        String time1 = date1.toString().substring(11, 19);
        time =year + "-" + Monthtos + "-" + Datetos + " " + time1;

        return time;

    }
}
