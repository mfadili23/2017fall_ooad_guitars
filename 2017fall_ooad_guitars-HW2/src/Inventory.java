/**
* Professor: 	Orlando Montalvo
* Class: 		Object Oriented Analysis & Design CSC7400
* @author 		Mohamed Fadili
* @version 		2.0
* @since   		09-11-2017
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List<Guitar> guitars;

  /**
 * this class will create a Guitar search a get a Guitar if any from 
 */
public Inventory() {
    guitars = new LinkedList<Guitar>();
  }

  /**
   * create new Guitar using the parameters below
   * 
 * @param serialNumber
 * @param price
 * @param builder
 * @param model
 * @param type
 * @param backWood
 * @param topWood
 */
public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  /**
   * searches for Guitar using serialNumber
   * return Guitar if found else return null
 * @param serialNumber
 * @return guitar 
 */
public Guitar getGuitar(String serialNumber) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  /**
   * search for Guitar using the parameters(builder, model, type, backwood, topwood)
   * if a match is found, then return Guitar, else return null.
 * @param searchGuitar
 * @return guitar otherwise null
 */
public Guitar search(Guitar searchGuitar) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getBuilder();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getBuilder())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals(guitar)) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      
      return guitar;
    }
    return null;
  }
}
