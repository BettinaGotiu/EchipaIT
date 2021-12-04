public class DevTeam extends Echipa {

  public DevTeam(String nume, int NrMaxim) {
    super(nume, NrMaxim);
  }


  @Override
  int getCostMembri() {
    int cost = 0;
      for (Membru i : membri){
        if(i.getExperienta() < 2) {
          cost = cost + 1500;
        }
         else {
           if(i.getExperienta() >= 2 && i.getExperienta() <= 5) {
             cost = cost + 1500 + 375;
           }
           else {
             cost = cost + 1500 + 750;
           }
        }
      }
      return cost;
  }
  @Override
  int getCost() {
    int cost;
    cost = (2500 + (this.lider.getExperienta()*250)) +this.getCostMembri();
    return cost;
  }
}

