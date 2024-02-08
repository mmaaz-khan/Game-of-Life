import javafx.scene.paint.Color; 
import java.util.List;

/**
 * A bacterium added into Lifev2 by Jamil&Maaz 
 * Inherits from abstract class Cell
 */

public class Salmonella extends Cell {

    /**
     * Create a new Salmonella.
     *
     * @param field The field currently occupied.
     * @param location The location within the field.
     */
    public Salmonella(Field field, Location location, Color col) {
        super(field, location, col);
    }

    /**
    * This is how the Salmonella decides if it's alive or not
    */
        
    public void act() {
        List<Cell> neighbours = getField().getLivingNeighbours(getLocation());
        setNextState(false);
    
        if (isAlive()) {
            if (neighbours.size() < 1)
            {
                setNextState(false);
            }
            else if(neighbours.size() == 1)
            {
                setNextState(true);
                setColor(Color.RED);
            }
            else if(neighbours.size() == 2)
            {
                setNextState(true);
                setColor(Color.YELLOW);
            }
            else if(neighbours.size() > 2)
            {
                setNextState(true);
                setColor(Color.GREEN);
            }
        }
       
    }
}
