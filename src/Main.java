public class Main {
    public static void main(String[] args) {
        Echipa HrTeam = new HrTeam("HrTeam",3);

        Membru Membru1 = new Membru("Strulea", "Anca", 24, 100, 5);
        Membru Membru2 = new Membru("Sandru", "Paul", 22, 10, 2);
        Membru Membru3 = new Membru("Sabau", "Ioana", 27, 200, 7);

        HrTeam.addMembru(Membru1);
        System.out.println(HrTeam.setLider(Membru1));
        HrTeam.addMembru(Membru2);
        HrTeam.addMembru(Membru3);

        HrTeam.setNrMaxim(5, Membru1);
        HrTeam.setNume("ArtTeam", Membru2);
        HrTeam.setNume("GdscHrTeam", Membru1);

        System.out.println("\n"+ HrTeam);
        System.out.println("Costu pe echipa este :\n " + HrTeam.getCost());

        Echipa DevTeam = new DevTeam("DevTeam",6);

        Membru Membru11 = new Membru("Mardare", "Matei", 18, 200, 1);
        Membru Membru12 = new Membru("Sabau", "Radu", 25, 300, 4);
        Membru Membru13 = new Membru("Monea", "Serban", 45, 700, 10);
        Membru Membru14 = new Membru("Paico", "Mara", 22, 70, 2);
        Membru Membru15 = new Membru("Gabor", "Petra", 20, 1000, 3);
        Membru Membru16 = new Membru("Boticean", "Andrei", 25, 300, 4);

        DevTeam.addMembru(Membru11);
        DevTeam.addMembru(Membru12);
        DevTeam.addMembru(Membru13);
        DevTeam.addMembru(Membru14);
        DevTeam.addMembru(Membru15);
        DevTeam.addMembru(Membru16);

        DevTeam.removeMembru(Membru16);

        DevTeam.setLider(Membru11);
        DevTeam.setLider(Membru13);
        DevTeam.setNrMaxim(5, Membru14);
        DevTeam.setNume("CreatoriDeViitor", Membru11);
        DevTeam.setNume("GdscDevTeam", Membru13);

        System.out.println("\n"+ DevTeam);
        System.out.println("Costu pe echipa este :\n " + DevTeam.getCost());





    }
}
