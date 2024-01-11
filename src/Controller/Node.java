/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Player;

/**
 *
 * @author thaip
 */
public class Node {
    private Player pl;
    private Node next;
    private Node headNode = null;
    private Node tailNode = null;
    public Node(Player pl) {
        this.pl = pl;
    }

    public Node(Player pl, Node next) {
        this.pl = pl;
        this.next = next;
    }

    public Node() {
    }
    
    public void inplayer(Player value) {
    Node newNode = new Node(value);

    if (headNode == null) {
        headNode = newNode;
    } else {
        tailNode.next = newNode;
    }

    tailNode = newNode;
    tailNode.next = headNode;
}
    
    public void printCir(){
           
        Node current = headNode;  
        if(headNode == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("--------------------------List of multi-player in game------------------------");
            do{
                System.out.println(current.pl.toString());
                current = current.next;
            }  while(current != headNode);
        }  
    }
    public void outPlayer(String id) {
        Node currentNode = headNode;
        if (headNode == null) { 
        return;
    }
    do {
        Node nextNode = currentNode.next;
        if (nextNode.pl.getId().equals(id)) {
            if (tailNode == headNode) { // neu list chi 1 node
                headNode = null;
                tailNode = null;
            } else {
                currentNode.next = nextNode.next;
                if (headNode == nextNode) { // xoa node dau
                    headNode = headNode.next;
                }
                if (tailNode == nextNode) { // xoa node duoi
                    tailNode = currentNode;
                }
            }
            break;
        }
        currentNode = currentNode.next;
    } while (currentNode != headNode);
}
    
}
