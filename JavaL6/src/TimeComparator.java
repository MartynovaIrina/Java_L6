import java.util.Comparator;

public class TimeComparator implements Comparator<Time> {
    int totalTimeSecTime1;
    int totalTimeSecTime2;
    @Override
    public int compare(Time time1, Time time2){
        totalTimeSecTime1 = convertToSec(time1.getHours(), time1.getMinutes(), time1.getSeconds());
        totalTimeSecTime2 = convertToSec(time2.getHours(), time2.getMinutes(), time2.getSeconds());

        if (totalTimeSecTime1 > totalTimeSecTime2){
            return 1;
        } else if (totalTimeSecTime1 < totalTimeSecTime2) {
            return -1;
        }
        else{
            return 0;
        }
    }
    private int convertToSec(int hours, int minutes, int seconds){
        return hours * 3600 + minutes * 60 + seconds;
    }
}
