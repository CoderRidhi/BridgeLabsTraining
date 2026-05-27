import java.util.*;
interface IReservable
{
    int ReserveItem();
    boolean CheckAvailability();
}
class Borrower
{
    private String name; 
    
    public String getName()
    {
        return this.name;
    }
}
abstract class libraryItem
{
    int itemId;
    String title;
    String author;
    
    libraryItem(int itemId, String title, String author)
    {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    abstract void getLoanDuration(){};
    public void getItemDetails()
    {
        System.out.print(itemId);
        System.out.print(title);
        System.out.print(author);
    }
    
}

class Book extends libraryItem
{
    void getLoanDuration()
    {
         System.out.print("Book - 5 days");
    }
}
class DVD extends libraryItem
{
    void getLoanDuration()
    {
        System.out.print("DVD - 3 days");
    }
    
}
class Magzine extends libraryItem
{
    void getLoanDuration()
    {
         System.out.print("Magzine - 1 day");
    }
}
public class LibraryManagement
{
	public static void main(String[] args) {
		
	}
}

//Improvements
// Constructors Missing in Child Classes

// Your subclasses extend libraryItem, but parent constructor requires:

// libraryItem(int itemId, String title, String author)

// So child classes MUST call super(...).

// Example:

// class Book extends LibraryItem
// {
//     Book(int itemId, String title, String author)
//     {
//         super(itemId, title, author);
//     }

//     void getLoanDuration()
//     {
//         System.out.println("Book - 5 days");
//     }
// }

// Otherwise compiler error occurs.

// 5. Implement Interface Properly

// Currently no class implements IReservable.

// Better:

// class Book extends LibraryItem implements IReservable

// Then override:

// public int reserveItem()
// {
//     return itemId;
// }

// public boolean checkAvailability()
// {
//     return true;
// }