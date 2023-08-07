package Datatypes;

public class Year {

    public static void main(String args[] )
        {

            double min, year, months, days;
            min = 235864;
            year = min/(60*24*365);
            months = min/(60*24*30);
            days = min/(60*24);

            System.out.println((int) min + " minutes is approximately " + year + " years and " + months + " months and " + days + " days");
        }
    }


