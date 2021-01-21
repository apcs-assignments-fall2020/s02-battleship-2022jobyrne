public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        boolean answer = false;
       for (int i = row; i < board.length; i++)
        {
            for (int j = col; j < board[0].length; j++)
            {
                if (board[col][row] == true)
                {
                   
                    System.out.println("There was a hit!");
                    answer = true;
                }
                else
                {
                    answer = false;
                }
            }
        }
        return answer;
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
         if (direction == "down")
        {
             for (int i = 0; i < boatLength; i++)
             {
                 board[i + 1][col] = true;
             }
        }
        if (direction == "left")
        {
             for (int i = 0; i < boatLength; i++)
             {
                 board[row + 1][i] = true;
             }
        }
        if (direction == "right")
        {
            for (int i = 0; i < boatLength; i++)
            {
                board[row][col +i] = true;
            }
        }
        if (direction == "up")
        {
             for (int i = 0; i < boatLength; i++)
             {
                 board[i][col + 1] = true;
             }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) 
    { 
        String[] arr = new String[1];
        for (int row = 0; row < words.length; row++) 
        {
            for (int col = 0; col < words[0].length; col++) 
            {
                if (col == words[0].length - 2)
                    {
                    if (words[row][col].charAt(0) > words[row][col+1].charAt(0))
                        {
                        return false;
                        }
                    if (words[row][col].length() > words[row][col+1].length())
                        {
                        return false;
                        }
                    }
            }
            
        }
        return true;
    }
                
                //y = words[row][col];
                //arr[counter] = y;
 //System.out.print(arr[i] + " ");    
           
       
 
        
        

    public static void main(String[] args) {
        boolean board[][] = { {true, true, true, false, false}, 
           {false, false, false, false, false},
           {false, true, true, true, false},
           {false, false, false, false, false},
           {false, false, false, false, false} };
        System.out.print(placeBoat(board, "right", 3, 2, 2));
    }
}
