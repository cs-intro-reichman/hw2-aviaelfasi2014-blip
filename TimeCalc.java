public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        String hourSTR;
        String minuteSTR;
        int minuteToAdd = Integer.parseInt(args[1]);
        int newHour = Integer.parseInt(time.substring(0, 2));
        int newMinute = Integer.parseInt(time.substring(3, 5));
        int totalMinute = newHour * 60 + newMinute + minuteToAdd;
        totalMinute = totalMinute % (24 * 60); 
        int hour = totalMinute / 60;
        int minute = totalMinute % 60;
        if (hour < 10) {
            hourSTR = "0" + hour;
        } else {
            hourSTR = String.valueOf(hour);
        }
        if (minute < 10) {
            minuteSTR = "0" + minute;
        } else {
            minuteSTR = String.valueOf(minute);
        }

        System.out.println(hourSTR + ":" + minuteSTR);
    }
}