package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;

    public Forage(int id, String nom, int hauteur, int debitMax, int diametre) {
        super(id, nom, hauteur, debitMax);
        this.diametre = diametre;
    }

    public String getDescription(){
        String description = super.getDescription()+" - diamètre "+this.diametre;
        return description;
    }

    @Override
    public double getVolume() {
        double volume = Math.PI * this.diametre * super.hauteur;
        return volume;
    }
}
