/*
Authors: Gabriel Magidson, Elizabeth Brandwein
 */

public class RocketShip {
    private int health;
    private int x; //X-coordinate of rocket ship
    private int y; //Y-coordinate of rocket ship

    /*
    RocketShips will have 4 health, and every time they collide with an
    asteroid they lose 1 health
     */
    public RocketShip(int h){
        health = h;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int h){
        this.health = health;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    /*
    When the rocket collides with an asteroid, the health is decreased by 1
     */
    public void collide(RocketShip r){
        health--;
    }
}
