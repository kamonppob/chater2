/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guutong.chapter2;

/**
 *
 * @author GuutonG
 */
public class StringPattern {
    public static void main(String[] args) {
        String input = "1234-5647-890";
        String split[] = input.split("-");
        System.out.println(split[0]+","+split[1]+","+split[2]);
        System.out.println(split[0].length()+","+split[1].length()+","+split[2].length());
    }
}
