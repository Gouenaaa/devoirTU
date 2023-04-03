package Tools;

import Entities.Exo1.Captage;
import Entities.Exo1.Cuve;
import Entities.Exo1.Forage;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{

    private String[] colonnes;
    private Object[][] lignes;
    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    public void loadDatasCaptage(ArrayList<Captage> uneListe)
    {
        // A compléter ici
        colonnes = new String[]{"Numéro","Description","Volume"};
        lignes = new Object[uneListe.size()][3];

        int i = 0;
        for(Captage captage: uneListe){
            lignes[i][0] = captage.getId();
            lignes[i][1] = captage.getDescription();
            if(captage instanceof Cuve){
                Cuve cuve = (Cuve) captage;
                lignes[i][2] = cuve.getVolume();
            }
            else if(captage instanceof Forage){
                Forage forage = (Forage) captage;
                lignes[i][2] = forage.getVolume();
            }
            else{
                lignes[i][2] = "";
            }
            i++;
        }
        fireTableChanged(null);
    }
}
