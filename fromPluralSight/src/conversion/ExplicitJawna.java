package conversion;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ExplicitJawna {

    public static void main(String[] args) {
        // Konwersja jawna dokonana przez programistę poprzez operatory rzutowania

        long lVal = 60;
        /*
        ERROR!
        Error: java: incompatible types: possible lossy conversion from long to int
        int iVal = lVal;

        */

        int iVal = (int)lVal;
        System.out.println("Rzutowanie jawne long na int: " + iVal);
    }
}
