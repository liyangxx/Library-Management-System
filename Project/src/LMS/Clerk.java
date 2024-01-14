package LMS;

public class Clerk extends Staff {
  
    private int deskNo;  // Desk Number of the Clerk
    private static int currentDeskNumber = 0;
  
    public Clerk(int id, String n, String a, int ph, double s, int dk) {
        super(id, n, a, ph, s);
        
        if (dk == -1) {
            deskNo = currentDeskNumber;
        } else {
            deskNo = dk;
        }
        
        currentDeskNumber++;
    }
    
    // Getter for deskNo
    public int getDeskNo() {
        return deskNo;
    }

    // Setter for deskNo
    public void setDeskNo(int newDeskNo) {
        deskNo = newDeskNo;
    }

    // Printing Clerk's Info
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Desk Number: " + deskNo);
    }
    
}   // Clerk's Class Closed
