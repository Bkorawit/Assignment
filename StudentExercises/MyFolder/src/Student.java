/**<The Student is a simple class</h1>
*It has id and name.
*/
public class Student {
    long id;
    String name;

    Student(long id, String name) {
        this.id = id;
        this.name = name;
    }
    /**returns the chat value at the specified index. 
    *An index range from 0 to name.lenght()-1.
    *@param index the index of the char Value.
    *@return the char value at the specified index.
    *@see java.lang.String
    */
    public char getNameLetterAt(int index){
	return name.chatAt(index);
}


}
