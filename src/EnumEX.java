enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;
    }
}
public class EnumEX {

    public static void main(String[] args) {
        Day today = Day.FRIDAY;
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

    }

}
