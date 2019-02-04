package LeetCodes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindandReplacePatternSol {
    public void ImplementFunction(){
        String[] words = new String[]{"abc","deq","mee","aqq","dkd","ccc"};
//        String[] words = new String[]{"ccc"};

        List<String> result = findAndReplacePattern(words,"abb");
//        List<String> result = findAndReplacePatternComplicate(words,"abb");

        System.out.println("Result:");
        for (String aw :result){
            System.out.print(aw+" , ");
        }
        System.out.println("\nEND");

        return;
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res= new LinkedList<String>();
        int[] pat= new int[26], Str= new int[26];
        int StrAsciiCode=0,PatAsciiCode=0;
        int index=0;
        int PatternLength=pattern.length();
        for (String w: words){
            boolean PF=true;
            Arrays.fill(pat, -1);
            Arrays.fill(Str, -1);

            for (index=0;index<PatternLength;index++){
                StrAsciiCode = w.charAt(index)-'a';
                PatAsciiCode = pattern.charAt(index)-'a';
                if (Str[StrAsciiCode]==pat[PatAsciiCode]){
                    Str[StrAsciiCode]=pat[PatAsciiCode]=PatAsciiCode;
                }
                else {
                    PF=false;
                    break;
                }
            }
            if (PF) res.add(w);
//            for (int i=0; i<w.length(); i++){
//                if (Str[w.charAt(i)-'a']!=pat[pattern.charAt(i)-'a']){
//                    PF=false;
//                    break;
//                }else{
//                    Str[w.charAt(i)-'a']=pat[pattern.charAt(i)-'a']=i+1;
//                }
//            }
//            if (PF) res.add(w);
        }
        return res;
    }


    public List<String> findAndReplacePatternComplicate(String[] words, String pattern) {
//        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphabet = new char[26];
        char[] PatternArray = pattern.toCharArray();
        List<String> TempResult = new LinkedList<String>();
        List<String> result = new LinkedList<String>();
        char[] WordArray;
        int AsciiCode=0;
        Boolean PF = false;
        int index=0;
        int PatternLength=pattern.length();

        for (String Aword :words){
            WordArray = Aword.toCharArray();
            PF=true;
            alphabet = new char[26];
            for (index=0;index<PatternLength;index++){
                AsciiCode = ((int)PatternArray[index])-97;
                if (alphabet[AsciiCode]!=0){
                    if (alphabet[AsciiCode]==WordArray[index]){
                        continue;
                    }
                    else {
                        PF=false;
                        break;
                    }
                }
                else {//Create a new mapping
                    alphabet[AsciiCode]=WordArray[index];
                }
            }
            if (PF){
                TempResult.add(Aword);
            }
        }


        //java.util.ConcurrentModificationException!!
        for (String Aword :TempResult){
            WordArray = Aword.toCharArray();
            PF=true;
            alphabet = new char[26];
            for (index=0;index<PatternLength;index++){
                AsciiCode = ((int)WordArray[index])-97;
                if (alphabet[AsciiCode]!=0){
                    if (alphabet[AsciiCode]==PatternArray[index]){
                        continue;
                    }
                    else {
                        PF=false;
                        break;
                    }
                }
                else {//Create a new mapping
                    alphabet[AsciiCode]=PatternArray[index];
                }
            }
            if (PF){
                result.add(Aword);
            }
        }

        return result;
    }


    void UnuseCodeCollection(){

        //        char[] TTable = new char[]{a,b,c};
//        char[] LetterTable = new char[]{'a','b','c','d','e','f','g','h','i','j'};
//        for (char word:alphabet){
//            System.out.print(word+" , ");


//        for (char Ach : WordArray){
//            AsciiCode = (int)Ach-97;
//            if (alphabet[AsciiCode]!=0){
//                if (alphabet[AsciiCode]==Ach){
//                    continue;
//                }
//                else {
//                    PF=false;
//                    break;
//                }
//            }
//            else {//Create a new mapping
//                alphabet[AsciiCode]=Ach;
//            }
//        }

//        }


//        if (Str[StrAsciiCode]==-1 && pat[PatAsciiCode]==-1){
//            Str[StrAsciiCode]=pat[PatAsciiCode]=PatAsciiCode;
//        }else if (Str[StrAsciiCode]==pat[PatAsciiCode]){
//            Str[StrAsciiCode]=pat[PatAsciiCode]=PatAsciiCode;
//            continue;
//        }
//        else {
//            PF=false;
//            break;
//        }
    }
}
