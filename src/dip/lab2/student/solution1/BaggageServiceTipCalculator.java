package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP? If
 * not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TippedService {

    // I decided to put rates back to the sub classes as I think premise that the level of service should be gratified with the same percentage for each type of service is too rigid
    private static double minBill=0.00;
    private static double maxBill = 100.00;
    
    
    private static double goodRate = 0.20;
    private static double fairRate = 0.15;
    private static double poorRate = 0.10;
    private static String billEntryErr
            = "Error: bill must be between " + minBill + " and "
            + maxBill;
    
    

    private double baseTipPerBag;
    private int bagCount;
//    public enum ServiceQuality {
//        GOOD, FAIR, POOR
//    }
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
//        this.serviceQuality=q; //setServiceRating(q); // perform validation
        this.setServiceRating(q);
//        this.setBagCount(bags);
        this.bagCount = bags;

        baseTipPerBag = 1.00; // set default value
    }

    @Override
    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        return tip;
    }

//    @Override
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

//    @Override
    /**
     *
     * @return
     */
//        @Override
    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if (bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if (baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
