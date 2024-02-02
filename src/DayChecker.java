public class DayChecker {
    DayOfWeek day;
    public DayChecker(DayOfWeek day){
        this.day = day;
    }

    //method to print custom message based on the day provided by the user
    public void CustomMessage()
    {
        switch(day){
            case SUNDAY:
                System.out.println("Easy like a Sunday morning");
                break;
            case MONDAY:
                System.out.println("Seize the day!");
                break;
            case TUESDAY:
                System.out.println("It's time for taco Tuesdays!!");
                break;
            case WEDNESDAY:
                System.out.println("Happy hump day!");
                break;
            case THURSDAY:
                System.out.println("One more day till Friday...");
                break;
            case FRIDAY:
                System.out.println("TGIF!!");
                break;
            case SATURDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Well that doesn't seem to be a day of the week.");
                break;
        }
    }
}
