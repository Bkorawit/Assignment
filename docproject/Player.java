/**
*<h1>Player class</h1>
*a player class contains one attribute, player id.
*
* @author Umaporn
* @version 1.0
* @since 2020-11-16
*/
public class Player {
    private int id;
    public Player(int id) {
        this.id = id;
    }
	/** Returns player id of this object. 
     * 
     * @param increaseNumber the increase number to player id
     * @return increase player id as specified increaseNumber
	 * @see #Player 
    */
	public int increaseId(int increaseNumber){
		return id+increaseNumber;
    }
	
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Player{" + "id=" + id + '}';
    }

}
