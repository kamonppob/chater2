/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guutong.chapter2;

import java.awt.BorderLayout;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author GuutonG
 */
public class SeparateString {
    
    
    private static boolean isNumber(char ch){
       return (int) '0'<=(int) ch && (int) ch <=(int) '9'; /* (int) '0'<=(int) ch && (int) ch <=(int) '9'*/
    }
    
    private static boolean isString(char ch){
       return (int) 'A' <= (int) ch && (int) ch <=(int) 'Z' || (int) 'a' <= (int) ch && (int) ch <=(int) 'z'; /* (int) 'A'<=(int) ch && (int) ch <=(int) 'Z'*/
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("input-->");
        String input = scanner.next();
        String str = "";
        String number = "";
        
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(isNumber(ch)){
                number = number + ch;  
            }
            if(isString(ch)){
                str = str + ch;                       
            }
        }
        System.out.println("output-->"+input.length());
        System.out.println("output-->"+str);
        System.out.println("output-->"+number);
    }
    
}
