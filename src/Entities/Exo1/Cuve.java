package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    private int largeur;
    private int longueur;

    public Cuve(int id, String nom, int hauteur, int debitMax, int largeur, int longueur) {
        super(id, nom, hauteur, debitMax);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public String getDescription(){
        String description = super.getDescription()+" - longueur "+this.longueur+" - largeur "+this.largeur;
        return description;
    }

    @Override
    public double getVolume() {
        double volume = this.longueur * this.largeur;
        return Math.round(volume);
    }
}
