public class CombinedTable {
    private int totalSeats;
    private SingleTable t1;
    private SingleTable t2;
    public CombinedTable(SingleTable one, SingleTable two) {
        t1 = one;
        t2 = two;
        totalSeats = one.getNumSeats() + two.getNumSeats() - 2;
    }
    public boolean canSeat(int ppl) {
        return (ppl <= totalSeats);
    }
    public double getDesirability() {
        double average = (t1.getViewQuality() + t2.getViewQuality())/2;
        if (t1.getHeight() == t2.getHeight()) return (average);
        return average - 10;
    }
}
