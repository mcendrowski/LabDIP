package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TippedService {
    
    // I decided to put rates back to the sub classes as I think premise that the level of service should be gratified with the same percentage for each type of service is too rigid
    private static double minBill = 0.00;
    private static String billEntryErr =
            "Error: bill must be greater than or equal to " + minBill;
    private static double goodRate = 0.20;
    private static double fairRate = 0.15;
    private static double poorRate = 0.10;

    private double bill;
//    public enum ServiceQuality {
//        GOOD, FAIR, POOR
//    }
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    @Override
    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(billEntryErr);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

}
