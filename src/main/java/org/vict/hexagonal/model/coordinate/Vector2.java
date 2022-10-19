package org.vict.hexagonal.model.coordinate;

// in this Hexagonal Coordinate we will use "odd-r" for display.
// this board is starting from (0,0)
public class Vector2 {
    public int x;
    public int y;

    public enum Direction {
        East,
        NorthEast,
        SouthEast,
        West,
        NorthWest,
        SouthWest
    }

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // this move direction is only for "odd-r" display
    public static Vector2 moveDirection(Vector2 vector2, Direction direction) {
        Vector2 newPosition = vector2;

        if (vector2.y % 2 == 0){
            switch (direction) {
                case East:
                    newPosition.x++;
                    break;
                case NorthEast:
                    newPosition.y--;
                    break;
                case SouthEast:
                    newPosition.y++;
                    break;
                case West:
                    newPosition.x--;
                    break;
                case NorthWest:
                    newPosition.x--;
                    newPosition.y--;
                    break;
                case SouthWest:
                    newPosition.x--;
                    newPosition.y++;
                    break;
            }
        }else{
            switch (direction) {
                case East:
                    newPosition.x++;
                    break;
                case NorthEast:
                    newPosition.x++;
                    newPosition.y--;
                    break;
                case SouthEast:
                    newPosition.x++;
                    newPosition.y++;
                    break;
                case West:
                    newPosition.x--;
                    break;
                case NorthWest:
                    newPosition.y--;
                    break;
                case SouthWest:
                    newPosition.y++;
                    break;
            }
        }
        return newPosition;
    }

    public static boolean collision(Vector2 pos1, Vector2 pos2) {
        return ((pos1.x == pos2.x) && (pos1.y == pos2.y));
    }

    void collision() {
    }

    void borderInfo() {
    }

    void explosion() {
    }

    void distance(Vector2 pos1, Vector2 pos2) {
    }

}