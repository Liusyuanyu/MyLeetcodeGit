package LeetCodes;

import java.util.Stack;

public class MinimumAddtoMakeParenthesesValidSol {
    public void ImplementFunction(){
        String Input ="((((";
        int result = 0;

//        result = minAddToMakeValid(Input);
//        System.out.println("Input: "+Input+ " Add: " + result);

        Input = "())";
        result = minAddToMakeValid(Input);
        System.out.println("Input: "+Input+ " Add: " + result);
//        System.out.printf("Input: %s  Add: %d\n",Input,result);

        Input = "(((";
        result = minAddToMakeValid(Input);
        System.out.println("Input: "+Input+ " Add: " + result);

        Input = "()";
        result = minAddToMakeValid(Input);
        System.out.println("Input: "+Input+ " Add: " + result);

        Input = "()))((";
        result = minAddToMakeValid(Input);
        System.out.println("Input: "+Input+ " Add: " + result);
    }

    public int minAddToMakeValid(String S) {
        int rightParenthesis = 0;
        int index=0;
        int StringLength=S.length();
        int result=0;

        for (index=0;index<StringLength;index++){
            if (S.charAt(index)=='('){
                rightParenthesis++;
            }
            else if (S.charAt(index)==')'){
                if (rightParenthesis==0)
                    result++;
                else
                    rightParenthesis--;
            }
        }
        result += rightParenthesis;
        return result;
    }

    public int minAddToMakeValid_Temp(String S) {
        int rightParenthesis = 0;
        int leftParenthesis = 0;
        int index=0;
        int StringLength=S.length();
        Stack <Character> basket = new Stack<Character>();
                char Achar = ' ';

                for (index=0;index<StringLength;index++){
                    Achar = S.charAt(index);
                    if (Achar=='('){
                        basket.add(S.charAt(index));
                    }
                    else if (S.charAt(index)==')'){

                    }
//
//            if (S.charAt(index)=='('){
//                rightParenthesis++;
//            }
//            else if (S.charAt(index)==')'){
//                leftParenthesis++;
//            }
        }
        int result = Math.abs(leftParenthesis-rightParenthesis);
        return result;
    }



    public int minAddToMakeValidWrong(String S) {
        int rightParenthesis = 0;
        int leftParenthesis = 0;
        int index=0;
        int StringLength=S.length();
        for (index=0;index<StringLength;index++){
            if (S.charAt(index)=='('){
                rightParenthesis++;
            }
            else if (S.charAt(index)==')'){
                leftParenthesis++;
            }
        }
        int result = Math.abs(leftParenthesis-rightParenthesis);
        return result;
    }



}
