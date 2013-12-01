/**
 * WinnerTree.java
 * @author Mikhail Konyukhov
 */

package dcsft.schedule.winnertree;

import dcsft.schedule.parent.*;
import java.util.ArrayList;

public class WinnerTree {
    public WinnerTree(ArrayList<Integer> Players, Parent parent) {
        int i = 2 * Players.size() - 1;

        Tree = new int[i];
        
        for (int p : Players) {
            Tree[--i] = p;
        }

        while (i > 0) {            
            Tree[--i] = parent.func(Tree[2 * i + 1], Tree[2 * i + 2]);
        }
    }

    public int getWinner() {
        return Tree[0];
    }

    public void replay() {
    }

    private int[] Tree;
}
