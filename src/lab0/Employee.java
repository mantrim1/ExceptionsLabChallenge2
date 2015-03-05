package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
/*
Rule for validaton
cannot be null or empty
must be a min of length of 2 max of 12
vacation days cannot exceed max cannot be negative
*/
public class Employee {
    private static int maxVacationDays = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public final int getDaysVacation() {
        return daysVacation;
    }

    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException{
        if(daysVacation<0||daysVacation>maxVacationDays){
            throw new IllegalArgumentException(
        "days vacation must be between 0 and the maximum");
        }
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName)throws IllegalArgumentException {
        if(firstName==null || firstName.length()<2 || firstName.length()>12){
        throw new IllegalArgumentException(
        "first name must be between 2 and 12 charachters");
    }
       
        this.firstName = firstName;
    }

    public final Date getHireDate() {
        return hireDate;
    }

    public final void setHireDate(Date hireDate) {
        
        this.hireDate = hireDate;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    // 333-33-3333
    // 333333333
    public final void setSsn(String ssn) {
        if(ssn==null || ssn.length()!= 9 || firstName.length()>11){
            int hasHyphen=ssn.indexOf("-");
            if(hasHyphen>-1){
                ssn.replaceAll("-", "");
            }
            char[] chars = ssn.toCharArray();
            for(char c : chars){
                if(!Character.isDigit(c)){
                    throw new IllegalArgumentException(
                                    "must be numbers only");
                    
                }
            }
        throw new IllegalArgumentException(
        "first name must be between 2 and 12 charachters");
    }
        this.ssn = ssn;
    }
    
    
    
}
