package com.nakib.javaexercise.arrays;

public class Spiral {

    public enum Direction   {
        RIGHT, LEFT, UP, DOWN
    }

    static void process( int n )
    {
        int[][] matrix = new int[n][n];

        int max = n*n;

        int currentMark = 1;

        Direction direction = Direction.RIGHT;

        int posx = 0;
        int posy = 0;

        while (currentMark <= max) {
            matrix[posx][posy] = currentMark;

            if(blocked(matrix, posx, posy, n, direction))  {
                direction = changeDirection(direction);
            }

            if(direction.equals(Direction.RIGHT))   {
                posx +=1;
            }

            if(direction.equals(Direction.DOWN))    {
                posy +=1;
            }

            if(direction.equals(Direction.LEFT))    {
                posx -=1;
            }

            if(direction.equals(Direction.UP))    {
                posy -=1;
            }

            currentMark++;
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static boolean blocked(int[][] matrix, int posx, int posy, int limit, Direction direction)    {
        if(direction.equals(Direction.RIGHT))   {
            if(posx + 1 == limit)   {
                return true;
            }

            if(matrix[posx +1][posy] > 0)   {
                return true;
            }
        }

        if(direction.equals(Direction.DOWN))   {
            if(posy + 1 == limit)   {
                return true;
            }

            if(matrix[posx][posy + 1] > 0)   {
                return true;
            }
        }

        if(direction.equals(Direction.LEFT))   {
            if(posx - 1 < 0)   {
                return true;
            }

            if(matrix[posx - 1][posy] > 0)   {
                return true;
            }
        }

        if(direction.equals(Direction.UP))   {
            if(posy - 1 < 0)   {
                return true;
            }

            if(matrix[posx][posy -1] > 0)   {
                return true;
            }
        }

        return false;
    }

    public static Direction changeDirection(Direction direction)   {
        if(direction.equals(Direction.RIGHT))   {
            return Direction.DOWN;
        }

        if(direction.equals(Direction.DOWN))   {
            return Direction.LEFT;
        }

        if(direction.equals(Direction.LEFT))    {
            return Direction.UP;
        }

        return Direction.RIGHT;
    }

    public static void main(String[] args)
    {
        int N = 10;

        process(N);
    }
}
