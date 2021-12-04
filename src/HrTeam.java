public class HrTeam extends Echipa{

    private int getCostMembri;

    public HrTeam(String nume, int NrMaxim) {
        super(nume, NrMaxim);
    }


    @Override
    int getCostMembri() {
        int cost = 0;
        for (Membru i : membri){
            if(i.getExperienta() < 2) {
                cost = cost + 1000;
            }
            else {
                if(i.getExperienta() >= 2 && i.getExperienta() <= 5) {
                    cost = cost + 1000 + 250;
                }
                else {
                    cost = cost + 1000 + 500;
                }
            }
        }
        return cost;
    }

    int getCost() {
        int cost;
        cost = (1350 + (this.lider.getExperienta() * 300)) + this.getCostMembri();
        return cost;
    }
}
