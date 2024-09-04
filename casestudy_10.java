// Problem 10: Grocery List Manager
// Develop a program that helps users manage their grocery list. The program should have the 
// following features:
//  Allow the user to add items to the grocery list.
//  Provide the ability to mark items as purchased or remove them from the list.
//  Display the current grocery list, including the purchased and remaining items.
//  Implement a search functionality to find specific items on the list.
//  Optionally, allow the user to save and load the grocery list to/from a file
import java.util.Scanner;
class grocery{
    private String[] list;
    private boolean[] flag;
    private int index;
    grocery()
    {
        this(10);
     }
    grocery(int size)
    {
        this.index=0;
        this.list=new String[size];
        this.flag=new boolean[size];
    }
    public void insert(String item)
    {
        if(list.length>index)
        {
        list[index]=new String(item);
        flag[index]=false;
        index++;
        }
        else{

            System.out.println("List is full. Cannot add more items.");
        }

    }
    public void display()
    {   
        for(int i=0 ; i < index; i++)
        {
            System.out.println(list[i]+"\t "+ flag[i]);    
            
        }
    }
    public void bought(String item)
    { 
        for(int i=0;i<index;i++)
        {
            if(item.equals(list[i])){
                flag[i]=true;
                return;
            }
        }
        System.out.println("Item not found in the list.");
    }
    public void search(String item)
    { 
        for(int i=0;i<index;i++)
        {
            if(item.equals(list[i])){
            System.out.println(item +" found ");
                return;
            }
        }
        System.out.println("Item not found in the list.");
    }
}
class casestudy_10{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" enter no of elements :: ");
        int nu = scan.nextInt();
        grocery g1= new grocery(nu);
        g1.insert("apples");
        g1.insert("mango");
        g1.insert("banana");
        g1.insert("chilli");
        g1.insert("shoes");
        g1.insert("strawberry");
        g1.insert("pineapple");
        g1.bought("pineapple");
        // g1.insert("grape");
        g1.display();
        g1.search("chilli");
        
    }
}