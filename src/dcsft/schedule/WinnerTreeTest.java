/**
 * WinnerTreeTest.java
 * @author Mikhail Konyukhov
 */

import dcsft.schedule.winnertree.*;
import dcsft.schedule.parent.*;
import java.util.ArrayList;
import static java.lang.Math.max;

public class WinnerTreeTest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = 1; i < 5; ++i) {
            a.add(i);
        }

        WinnerTree wt = new WinnerTree(a, new Parent() {
            public int func(int lChild, int rChild) {
                return max(lChild, rChild);
            }
        });
    }
}
