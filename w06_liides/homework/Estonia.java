package w06_liides.homework;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Estonia implements PersonalCode{
    private String code;

    public Estonia(String code){
        this.code = code;
    }

    @Override
    public String getGender() {
        int gender = Integer.parseInt(code.substring(0, 1));

        if (gender % 2 == 0){
            return "Female";
        } else {
            return "Male";
        }
    }

    @Override
    public int getFullYear() {
        int yearBorn = Integer.parseInt(code.substring(1, 3));
        if (yearBorn >= 22){
            
            return 1900+yearBorn;
        } else {
            return 2000+yearBorn;
        }
        
    }

    @Override
    public String getDOB() {
        int yearBorn = Integer.parseInt(code.substring(1, 3));
        int monthBorn = Integer.parseInt(code.substring(3, 5));
        int dayBorn = Integer.parseInt(code.substring(5, 7));

        return dayBorn+"."+monthBorn+"."+getFullYear();
    }

    @Override
    public int getAGE() {

        int monthBorn = Integer.parseInt(code.substring(3, 5));
        int dayBorn = Integer.parseInt(code.substring(5, 7));

        LocalDate birthday = LocalDate.of(getFullYear(),monthBorn , dayBorn); 
        LocalDate now = LocalDate.now(); 
        Period diff = Period.between(birthday, now); //difference between the dates is calculated
        System.out.println("Exact age of this person is "+diff.getYears() + " years, " + diff.getMonths() + " months, " + diff.getDays() + " days. ");
        return diff.getYears();
    }
}
