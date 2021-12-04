import java.util.ArrayList;


public abstract class Echipa {
    protected Membru lider;
    String nume;
    int NrMaxim;
    protected ArrayList<Membru> membri = new ArrayList<>();

    public Echipa (String nume, int NrMaxim){
        this.nume = nume;
        this.NrMaxim = NrMaxim;
    }

    boolean addMembru(Membru member){
        if(membri.size() < NrMaxim){
            membri.add(member);
            return true;
        }
        else return false;
    }

    boolean removeMembru(Membru member){
        if(membri.contains(member) == true){
            membri.remove(member);
            System.out.println("Am eliminat un membru din echipa");
            return true;
        }
        else return false;

    }

    boolean setLider(Membru LiderTest){
          if(LiderTest.getExperienta() < 5){
              return false;
        }
          else {
              if(membri.contains(LiderTest) == true){
                  this.lider = LiderTest;
            }
              else {
                   this.addMembru(LiderTest);
                   this.lider = LiderTest;
            }
            return true;
        }
    }

    public void setNume(String nume, Membru membru) {
        if(membru.equals(this.lider)) {
            this.nume = nume;
        }
        else {
           System.out.println("Doar liderul poate modifica");
        }
    }
//Metoda asta nu da eroare, dar nu vrea sa recunoasca liderul :')
    public void setNrMaxim(int NrMaxim, Membru membru){
      if(membru.equals(this.lider)){
          if(this.NrMaxim > NrMaxim)
          this.NrMaxim = NrMaxim;
        }
        else {
          System.out.println("Doar liderul poate modifica");
      }
    }

    @Override
    public String toString() {
        return "Nume echipa: " + this.nume + "\n" + "Lider echipa : " + this.lider.getNume() + " " + this.lider.getPrenume() + "\n";
    }


    abstract int getCost();
    abstract int getCostMembri();

}
