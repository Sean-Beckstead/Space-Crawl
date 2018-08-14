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
public final class Room {
    private Point size;
    private Space[][] spaces;   
    
   
    public Room(int x, int y) {
        size = new Point(x,y); 
    }
    
    public Room() {
        spaces = new Space[10][10];
        size = new Point(10,10);
        
        int x = 0;
        int y = 0;
        
        while (y < 10) {
            createSpace(x,y,Space.blank,Space.blank,Space.blank,Space.blank);
            x++;
            if (x == 10) {
                x=0;
                y++;
            }
        }
        
        
        createSpace(0,0,Space.wall,Space.blank,Space.blank,Space.wall);
        createSpace(1,0,Space.wall,Space.blank,Space.blank,Space.blank);
        createSpace(2,0,Space.wall,Space.blank,Space.blank,Space.blank);
        createSpace(3,0,Space.wall,Space.blank,Space.blank,Space.blank);
        createSpace(4,0,Space.wall,Space.blank,Space.blank,Space.blank);
        createSpace(5,0,Space.wall,Space.blank,Space.blank,Space.blank);
        createSpace(6,0,Space.wall,Space.blank,Space.blank,Space.blank);
        createSpace(7,0,Space.wall,Space.blank,Space.blank,Space.blank);
        createSpace(8,0,Space.wall,Space.blank,Space.blank,Space.blank);
        
        createSpace(9,0,Space.wall,Space.wall,Space.blank,Space.blank);        
        createSpace(0,1,Space.blank,Space.blank,Space.blank,Space.wall);
        createSpace(0,2,Space.blank,Space.blank,Space.blank,Space.wall);
        createSpace(0,3,Space.blank,Space.blank,Space.blank,Space.wall);
        createSpace(0,4,Space.blank,Space.blank,Space.blank,Space.wall);
        createSpace(0,5,Space.blank,Space.blank,Space.blank,Space.wall);
        createSpace(0,6,Space.blank,Space.blank,Space.blank,Space.wall);
        createSpace(0,7,Space.blank,Space.blank,Space.blank,Space.wall);
        createSpace(0,8,Space.blank,Space.blank,Space.blank,Space.wall);
        
        createSpace(0,9,Space.blank,Space.blank,Space.wall,Space.wall);        
        createSpace(1,9,Space.blank,Space.blank,Space.wall,Space.blank);
        createSpace(2,9,Space.blank,Space.blank,Space.wall,Space.blank);
        createSpace(3,9,Space.blank,Space.blank,Space.wall,Space.blank);
        createSpace(4,9,Space.blank,Space.blank,Space.wall,Space.blank);
        createSpace(5,9,Space.blank,Space.blank,Space.wall,Space.blank);
        createSpace(6,9,Space.blank,Space.blank,Space.wall,Space.blank);
        createSpace(7,9,Space.blank,Space.blank,Space.wall,Space.blank);
        createSpace(8,9,Space.blank,Space.blank,Space.wall,Space.blank);     
        
        createSpace(9,9,Space.blank,Space.wall,Space.wall,Space.blank);
        createSpace(9,1,Space.blank,Space.wall,Space.blank,Space.blank);
        createSpace(9,2,Space.blank,Space.wall,Space.blank,Space.blank);
        createSpace(9,3,Space.blank,Space.wall,Space.blank,Space.blank);
        createSpace(9,4,Space.blank,Space.wall,Space.blank,Space.blank);
        createSpace(9,5,Space.blank,Space.wall,Space.blank,Space.blank);
        createSpace(9,6,Space.blank,Space.wall,Space.blank,Space.blank);
        createSpace(9,7,Space.blank,Space.wall,Space.blank,Space.blank);
        createSpace(9,8,Space.blank,Space.wall,Space.blank,Space.blank);
        
    }    
    
    public void createSpace(int x, int y, char n, char e, char s, char w) {
        spaces[x][y] = new Space(n,e,s,w);
    }
    
    public Point getSize() {
        return size;
    }
    
    public Space getWalls(int x, int y) {
        return spaces[x][y];
    }
    
            
}
