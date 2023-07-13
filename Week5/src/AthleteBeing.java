public class AthleteBeing implements Behavior {
    private String name;
    private int salary;
    private int numberMedal;
    static int population = 0;

public AthleteBeing(String name,int salary){
    this.name=name;
    this.salary=salary;
    population++;
}

    public String tellName(){
    return name;
    }
    public int tellSalary(){
    return salary;
    }
    public int medal(int actualMedal){
    numberMedal+=actualMedal;
    return numberMedal;
    }
    public static int getNumberAthlete(){
    return population;
    }

    public int compareTo(Object o) {

        AthleteBeing other = (AthleteBeing)  o;
        if (this.name.equals(other.name) && this.numberMedal == other.numberMedal) {
            return 10;
        } else if (this.numberMedal == other.numberMedal) {
            return 0;
        } else if (this.numberMedal < other.numberMedal) {
            return -1;
        } else {
            return 1;
        }
    }
    public String comparePeople(AthleteBeing other) {
        int result = this.compareTo(other);
        if (result == 10) {
            return this.name + " and " + other.name + " are the same persons";
        } else if (result == 0) {
            return this.name + " and " + other.name + " have the same number of medals";
        } else if (result == -1) {
            return this.name + " has less number of medals than " + other.name;
        } else {
            return this.name + " has more number of medals than " + other.name;
        }
    }

    public String toString(){
return "Name : "+name+", Salary : " +salary+", Medal : "+numberMedal;
    }
}
