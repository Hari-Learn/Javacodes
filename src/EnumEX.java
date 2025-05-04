import java.util.Arrays;
import java.util.Scanner;

enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;

    }
}
public class EnumEX {

    public static void main(String[] args) {
        System.out.println("Enter the day :");
        Scanner in = new Scanner(System.in);
        String inoutDay =  in.nextLine();
        Day today = Day.valueOf(inoutDay.toUpperCase());

        //Day today = Day.FRIDAY;
        switch (today){
            case MONDAY:
                System.out.println("Start of the week");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("its the weekend");
                break;
            default:
                System.out.println("Its the mid of the week");
                break;
        }

        if(today.isWeekend()){
            System.out.println(today + "is a weekend");
        }
        else{
            System.out.println(today + "is a weekday");
        }

        System.out.println("Enumeration using for");
        for(Day day : Day.values()){
            System.out.println( "--> "+day);
        }
        System.out.println("Using lambda");
        Arrays.stream(Day.values()).forEach(day -> System.out.println(day));
        Arrays.stream(Day.values()).forEach(System.out::println);
    }

}
