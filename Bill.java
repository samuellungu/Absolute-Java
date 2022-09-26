import java.util.Scanner;

public class Bill {
    public static final double RATE=150.00;//Dollars per quarter hour
    private int hours;
    private int minutes;
    private double fee;

    public void inputTimeWorked(){
        System.out.println("Enter the numbers of full hours worked");
        System.out.println("followed by Number of minutes");
        Scanner keyboard=new Scanner(System.in);
        hours=keyboard.nextInt();
        minutes = keyboard.nextInt();

        keyboard.close();
    }
    private double computeFee(int hoursWorked, int minutesWorked){
        minutesWorked=hoursWorked*60+minutesWorked;
        int quarterHours = minutesWorked/15;
        return quarterHours* RATE;
    }
    public void updateFee(){
        fee=computeFee(hours, minutes);
    }

    public void outputBill(){
        System.out.println("Time Worked");
        System.out.println(hours + "Hours and "+minutes+" Minutes");
        System.out.println("Rate: $" + RATE+" Per Quarter Hour");
        System.out.println("Amount due: $"+fee);
    }
    public static void main (String [] args){
        Bill yrBill=new Bill();
        yrBill.inputTimeWorked();
        yrBill.updateFee();
        yrBill.outputBill();
    }
    
}
