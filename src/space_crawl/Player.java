/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package space_crawl;

import java.awt.Point;

/**
 *
 * @author Sean
 */
public class Player {
    private int facing;
    private Point position = new Point(); 
    private Room curRoom;
    
    
    public Player() {
        
    }
    
    public int getFacing() {
        return facing;
    }
    
    public Point getPosition() {
        return position;
    }
    
    public void setPosition(int x, int y) {
        position.x = x;
        position.y = y;
    }
    
    public Room getRoom() {
        return curRoom;
    }
    
    public void setRoom(Room r) {
        curRoom = r;
    }
    
    public void move() {
        switch (facing) {
            case 0:
                if (position.y > 0 ) {
                    position.y --;  
                }
                break;
            case 1:
                if (position.x < curRoom.getSize().x) {
                    position.x ++;
                }
                break;
            case 2:
                if (position.y < curRoom.getSize().y) {
                    position.y ++;
                }
                break;
            case 3:
                if (position.x > 0) {
                    position.x --;
                }
                break;              
        }
    }
    
    public void turnLeft() {
        switch (facing) {
            case 0:
                facing = 3;
                break;
            case 1:
                facing = 0;
                break;
            case 2:
                facing = 1;
                break;
            case 3:
                facing = 2;
                break;              
        }
    }
    
    public void turnRight() {
        switch (facing) {
            case 0:
                facing = 1;
                break;
            case 1:
                facing = 2;
                break;
            case 2:
                facing = 3;
                break;
            case 3:
                facing = 0;
                break;              
        }
    }
}
