package Entities.Exo1;

public class Captage implements Comparable<Captage>
{
    protected int id;
    protected String nom;
    protected int hauteur;
    protected int debitMax;

    public Captage(int id, String nom, int hauteur, int debitMax) {
        this.id = id;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debitMax = debitMax;
    }

    public int getId() {
        return id;
    }

    public int getDebitMax() {
        return debitMax;
    }

    public String getDescription(){
        String description = this.nom+" - "+this.hauteur+" mètres - "+this.debitMax+" litres";
        return description;
    }

    @Override
    public int compareTo(Captage captage) {
        if(this.debitMax == captage.debitMax){
            return 0;
        }
        else if(this.debitMax > captage.debitMax){
            return 1;
        }
        else{
            return -1;
        }
    }
}
