/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package space_crawl;

/**
 *
 * @author Sean
 */
public class Space {   
    public final static char blank = ' ';
    public final static char door = 'd';
    public final static char wall = 'w';
    
    private char north;
    private char east;
    private char south;
    private char west;
    
    public Space(char n, char e, char s, char w) {
        north = n;
        east = e;
        south = s;
        west = w;
    }
    
    public int getNorth() {
        return north;
    }
    
    public int getEast() {
        return east;        
    }
    
    public int getSouth() {
        return south;
    }
    
    public int getWest() {
        return west;
    }
    
    public void setNorth(char n) {
        north = n;
    }
    
    public void setEast(char e) {
        east = e;        
    }
    
    public void setSouth(char s) {
        south = s;
    }
    
    public void setWest(char w) {
        west = w;
    }
    
}
