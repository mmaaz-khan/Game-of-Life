import javafx.scene.paint.Color; 
import java.util.List;

/**
 * Simplest form of life.
 * Fun Fact: Mycoplasma are one of the simplest forms of life.  A type of
 * bacteria, they only have 500-1000 genes! For comparison, fruit flies have
 * about 14,000 genes.
 *
 * @author David J. Barnes, Michael Kölling & Jeffery Raphael
 * @version 2022.01.06
 */

public class Mycoplasma extends Cell {

    /**
     * Create a new Mycoplasma.
     *
     * @param field The field currently occupied.
     * @param location The location within the field.
     */
    public Mycoplasma(Field field, Location location, Color col) {
        super(field, location, col);
    }

    /**
    * This is how the Mycoplasma decides if it's alive or not
    */
   
    // • The base code comes with a simple life form, the Mycoplasma. Your first task is to make it
    // more interesting. Modify its rule set so that it behaves in the following manner:
        // – If the cell has fewer than two live neighbours it will die
        // – If the cell has two or three live neighbours it will live on to the next generation
        // – If the cell has more than three neighbours it will die
        // – Lastly, any dead cell will come alive if it has exactly three neighbours
        
    public void act() {
        List<Cell> neighbours = getField().getLivingNeighbours(getLocation());
        setNextState(false);
    
        if (isAlive()) {
            if (neighbours.size() > 1 && neighbours.size() < 4)
            {
                setNextState(true);
            }
            else
            {
                setNextState(false);
            }
        }
        else
        {
           if (neighbours.size() == 3)
           {
               setNextState(true);
           }
           else
           {
               setNextState(false);
           }
        }
    }
}
