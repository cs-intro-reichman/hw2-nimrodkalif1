public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        int hours = Integer.parseInt(time.split(":")[0]);
        int minutes = Integer.parseInt(time.split(":")[1]);

        int offHours = minutesToAdd / 60;
        int offMinutes = minutesToAdd % 60;

        hours = (hours + offHours) % 24;
        if ((minutes + offMinutes) / 60 == 1) {
            minutes = (minutes + offMinutes) % 60;
            hours++;
            hours %= 24;
        } else
            minutes += offMinutes;


        String minutesStr = "";
        if (minutes <= 10)
            minutesStr = "0" + minutes;
        else
            minutesStr = "" + minutes;

        String hoursStr = "";
        if (hours <= 10)
            hoursStr = "0" + hours;
        else
            hoursStr = "" + hours;

        System.out.println(hoursStr + ":" + minutesStr);
    }
}
