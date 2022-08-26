//https://acmp.ru/index.asp?main=task&id_task=119
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String fileName = "INPUT";
        String format = ".TXT";
        String pathToFile = fileName + format;

        String fileNameOutput = "OUTPUT";
        String formatOutput = ".TXT";
        String pathToFileOutput = fileNameOutput + formatOutput;

        try(FileReader fileReader = new FileReader(pathToFile);
            FileWriter fileWriter = new FileWriter(pathToFileOutput)){
            Scanner scanner = new Scanner(fileReader);
            int hours;
            int minutes;
            int seconds;
            int numberOfLines;
            numberOfLines = scanner.nextInt();
            TimeComparator timeComparator = new TimeComparator();
            Set<Time> time = new TreeSet<>(timeComparator);

            for (int i = 0; i < numberOfLines; i++){
                hours = scanner.nextInt();
                minutes = scanner.nextInt();
                seconds = scanner.nextInt();
                Time currTime = new Time(hours, minutes, seconds);
                time.add(currTime);
            }
            for (Time currTime : time){
                fileWriter.write(currTime.getHours() + " " + currTime.getMinutes() + " " +
                        currTime.getSeconds() + "\n");
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}