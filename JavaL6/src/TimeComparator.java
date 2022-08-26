import java.util.Comparator;

public class TimeComparator implements Comparator<Time> {
    @Override
    public int compare(Time time1, Time time2){
        if (time1.getHours() > time2.getHours()){
            return 1;
        } else if (time1.getHours() == time2.getHours() && time1.getMinutes() > time2.getMinutes()) {
            return 1;
        } else if (time1.getHours() == time2.getHours() && time1.getMinutes() == time2.getMinutes() &&
                time1.getSeconds() > time2.getSeconds()) {
            return 1;
        }
        else{
            return -1;
        }
    }
}
