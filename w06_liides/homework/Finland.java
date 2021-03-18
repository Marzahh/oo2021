package w06_liides.homework;

import java.time.LocalDate;
import java.time.Period;

public class Finland implements PersonalCode {
    private String code;

    public Finland (String code){
        this.code = code;
    }

    @Override
    public String getGender() {
        int gender = Integer.parseInt(code.substring(7, 10));

        if (gender % 2 == 0){
            return "Female";
        } else {
            return "Male";
        }
    }

    @Override
    public int getFullYear() {
        int yearBorn = Integer.parseInt(code.substring(4, 6));
        String century = code.substring(6, 7);

        century.toString();

        if (century == "+"){
            return 1800+yearBorn;
        } else if (century == "-") {
            return 1900+yearBorn;
        } else if (century == "A") {
            return 2000+yearBorn;
        }else{
            return 0;
        }
        
    }

    @Override
    public String getDOB() {
        
        int monthBorn = Integer.parseInt(code.substring(2, 4));
        int dayBorn = Integer.parseInt(code.substring(0, 2));

        return dayBorn+"."+monthBorn+"."+getFullYear();
    }

    @Override
    public int getAGE() {
        int monthBorn = Integer.parseInt(code.substring(2, 4));
        int dayBorn = Integer.parseInt(code.substring(0, 2));

        LocalDate birthday = LocalDate.of(getFullYear(),monthBorn , dayBorn); 
        LocalDate now = LocalDate.now(); 
        Period diff = Period.between(birthday, now); //difference between the dates is calculated
        System.out.println("Exact age of this person is "+diff.getYears() + " years, " + diff.getMonths() + " months, " + diff.getDays() + " days. ");
        return diff.getYears();
    }
    
}
