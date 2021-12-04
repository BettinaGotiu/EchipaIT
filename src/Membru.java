public class Membru {
    String numeMembru;
    String prenume;
    int varsta;
    double salariu;
    int experienta;

    public Membru(String numeMembru, String prenume, int varsta, double salariu, int experienta){
        this.numeMembru = numeMembru;
        this.prenume = prenume;
        this.varsta = varsta;
        this.salariu = salariu;
        this.experienta = experienta;
    }

   public String getNume(){
        return numeMembru;
}
   public String getPrenume(){
        return prenume;
}
   public int getExperienta(){
        return experienta;
}

    public double getSalariu() {
        return salariu;
    }

    @Override
    public String toString() {
        return "Membru [nume=" + numeMembru + ", prenume=" + prenume + ", varsta=" + varsta + ", salariu=" + salariu
                + ", Experienta=" + experienta + "]";
    }
}
