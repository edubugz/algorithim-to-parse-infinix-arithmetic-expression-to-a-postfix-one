package com.BugzTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        String input="", output;

        while(true)
        {
            System.out.print("Enter infix: ");
            System.out.flush();
            try {
                input = getString(); // read a string from kbd
            } catch (IOException e) {
                e.printStackTrace();
            }
            if( input.equals("") ) // quit if [Enter]
                break;
// make a translator
            InToPost theTrans = new InToPost(input);
            output = theTrans.doTrans(); // do the translation
            System.out.println("Postfix is " + output + '\n');
        } // end while

    }

    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }


}
