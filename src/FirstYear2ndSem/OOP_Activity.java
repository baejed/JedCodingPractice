package FirstYear2ndSem;

public class OOP_Activity {

    public static void main(String[] args) {

        Commission commission = new Commission(50, 0.5);

        System.out.println(commission.commissionRate);

    }

}

class Commission {

    double salesFigure;
    double commissionRate;

    Commission() {

    }

    Commission(double salesFigure, double commissionRate) {
        this.salesFigure = salesFigure;
        this.commissionRate = commissionRate;
    }

    public void setSalesFigure(double salesFigure) {
        this.salesFigure = salesFigure;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getSalesFigure() {
        return salesFigure;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void computeCommission(double salesFigure, double commissionRate) {
        System.out.println(salesFigure * commissionRate);
    }

}