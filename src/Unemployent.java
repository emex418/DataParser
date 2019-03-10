public class Unemployent {
    int laborForceSize, employed, unemployed;
    double unemploymentRate;
    public Unemployent(int laborForceSize, int employed, int unemployed, double unemploymentRate){
        this.employed = employed;
        this.laborForceSize = laborForceSize;
        this.unemployed = unemployed;
        this.unemploymentRate = unemploymentRate;
    }

    public int getLaborForceSize() {
        return laborForceSize;
    }

    public void setLaborForceSize(int laborForceSize) {
        this.laborForceSize = laborForceSize;
    }

    public int getEmployed() {
        return employed;
    }

    public void setEmployed(int employed) {
        this.employed = employed;
    }

    public int getUnemployed() {
        return unemployed;
    }

    public void setUnemployed(int unemployed) {
        this.unemployed = unemployed;
    }

    public double getUnemploymentRate() {
        return unemploymentRate;
    }

    public void setUnemploymentRate(double unemploymentRate) {
        this.unemploymentRate = unemploymentRate;
    }

    @Override
    public String toString() {
        return "Unemployent{" +
                "laborForceSize=" + laborForceSize +
                ", employed=" + employed +
                ", unemployed=" + unemployed +
                ", unemploymentRate=" + unemploymentRate +
                '}';
    }
}
