public enum Month {
    // These declarations call the constructor below.
    JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
    public final int order;
    Month(int order) {
        this.order = order;
    }
}