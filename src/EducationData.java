public class EducationData {
    double noHS, onlyHS, someCollege, bachelorsOrHigher;

    public EducationData(double noHS, double onlyHS, double someCollege, double bachelorsOrHigher){
        this.noHS = noHS;
        this.onlyHS = onlyHS;
        this.someCollege = someCollege;
        this.bachelorsOrHigher = bachelorsOrHigher;
    }

    public double getNoHS() {
        return noHS;
    }

    public void setNoHS(double noHS) {
        this.noHS = noHS;
    }

    public double getOnlyHS() {
        return onlyHS;
    }

    public void setOnlyHS(double onlyHS) {
        this.onlyHS = onlyHS;
    }

    public double getSomeCollege() {
        return someCollege;
    }

    public void setSomeCollege(double someCollege) {
        this.someCollege = someCollege;
    }

    public double getBachelorsOrHigher() {
        return bachelorsOrHigher;
    }

    public void setBachelorsOrHigher(double bachelorsOrHigher) {
        this.bachelorsOrHigher = bachelorsOrHigher;
    }

    @Override
    public String  toString() {
        return "EducationData{" +
                "noHS=" + noHS +
                ", onlyHS=" + onlyHS +
                ", someCollege=" + someCollege +
                ", bachelorsOrHigher=" + bachelorsOrHigher +
                '}';
    }
}
