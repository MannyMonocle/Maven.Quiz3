package rocks.zipcode.io.quiz3.arrays;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        board = new String[3][3];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] ans = new String[3];
        for(int i = 0; i < 3; i++){
            ans[i] = board[i][value];
        }
        return ans;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        Boolean ans = false;
        String[] row = getRow(rowIndex);
        if(row[0] == row[1] && row[1] == row[2]){ans = true;}
        return ans;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        Boolean ans = false;
        String[] column = getColumn(columnIndex);
        if(column[0] == column[1] && column[1] == column[2]){ans = true;}
        return ans;
    }

    public Boolean isDiagnol1Won(){
        Boolean ans = false;
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2]){ans = true;}
        return ans;
    }

    public Boolean isDiagnol2Won(){
        Boolean ans = false;
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0]){ans = true;}
        return ans;
    }

    public String getWinner() {
        String ans = rowWinner() + columnWinner() + diagnolWinner();
        return Character.toString(ans.charAt(0));
    }

    public String[][] getBoard() {
        return board;
    }


    public String rowWinner(){
        for(int i = 0; i < 3; i++){
            if(isRowHomogenous(i)){
                return getRow(i)[0];
            }
        }
        return "";
    }

    public String columnWinner(){
        for(int i = 0; i < 3; i++){
            if(isColumnHomogeneous(i)){
                return getColumn(i)[0];
            }
        }
        return "";
    }

    public String diagnolWinner(){
        if(isDiagnol1Won()){return board[0][0];}
        else if(isDiagnol2Won()){return board[2][0];}
        else {return "";}
    }

}
