public class Main {
    public static void main(String[] args) {
        AthleteBeing furkan = new AthleteBeing("furkan",2000);
        furkan.medal(5);
        System.out.println(furkan);
        AthleteBeing sare = new AthleteBeing("sare",3000);
        System.out.println(sare);
        AthleteBeing cemre = new AthleteBeing("sare",3000);
        System.out.println(cemre);
        AthleteBeing necati = new AthleteBeing("necati",2000);
        System.out.println(necati);
        System.out.println();
        System.out.println(furkan.comparePeople(sare));
        System.out.println(sare.comparePeople(cemre));
        System.out.println(necati.comparePeople(furkan));
        System.out.println(necati.comparePeople(sare));
        System.out.println();
        System.out.println("Athlete Population : " + AthleteBeing.getNumberAthlete());
    }
}