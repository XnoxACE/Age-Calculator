
import java.util.Calendar;

public class Date {

    private final int day;
    private int month;
    private int year;

    public Date() {
        day = 1;
        month = 1;
        year = 2000;
    }

    //Constructor
    public Date(int day_, int month_, int year_) {

        day = day_;
        month = month_;
        year = year_;
    }

    public int getDay() {
        return (day);
    }

    public int getMonth() {
        return (month);
    }

    public int getYear() {
        return (year);
    }

    public int getAge() {
        month--; //day of the month is stored from index 0 to 11 (subtracted month to match with index of month)
        Calendar now = Calendar.getInstance(); //calandar instance
        //variables
        int currentYear = now.get(Calendar.YEAR); //passing in current year
        int currentMonth = now.get(Calendar.MONTH); //passing in current month (stored from index 0 to 11
        int currentDay = now.get(Calendar.DAY_OF_MONTH); //passing in current day of the month
        // age calculation
        int age = currentYear - year; //intial year calculation
        if (month > currentMonth) { //if month is in the future age is subtracted
            age--;
        }
        if (month == currentMonth) { //if month is the same as current month and day is in the future age is subtracted by 1
            if (day > currentDay) {
                age--;
                System.out.println("test1");
            }
        }
        return (age);
    }

    public String getInfo() {
        return (day + " " + month + " " + year);
    }

    public void setYear(int _year) {
        year = _year;
    }
}
