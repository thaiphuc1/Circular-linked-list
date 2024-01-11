/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import Model.Player;
import View.Menu;
import Controller.Node;

/**
 *
 * @author thaip
 */
public class Main extends Menu<String>{
    private static String[] mc = {"Print all Player","In player","Out player", "Exit"};
    Node node = new Node();
    public Main(){
        super("Multi-Player Game Queue", mc);
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
    
    @Override
    public void execute(int ch) {
    switch(ch){
            case 1: print();break;
            case 2: inPlayer();break;
            case 3: removeItem();break;
            case 4: System.exit(0);
            
        }
    }
    
    
    
    
    
    
    
    
    public void inPlayer(){
        String id = Menu.getString("Enter your ID player : ");
        String nameItem = Menu.getString("Enter your name player : ");      
        node.inplayer(new Player(id, nameItem));
        print();
         
        
         
    }
    
    public void print(){
        node.printCir();
    }
    
    public void removeItem(){
        String id = Menu.getString("Enter your id player you want out : ");
        node.outPlayer(id);
        print();
    }
    
}
