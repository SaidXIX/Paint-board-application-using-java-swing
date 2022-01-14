/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpihmfinal1;

import java.awt.Color;

/**
 * A class to get the Color value from a string color name
 */
public class MyColor {
    public Color color;


 public void funcolor(String col){
  switch (col.toLowerCase()) {
    case "black":
        color = Color.BLACK;
        break;
    case "blue":
        color = Color.BLUE;
        break;
    case "cyan":
        color = Color.CYAN;
        break;
    case "darkgray":
        color = Color.DARK_GRAY;
        break;
    case "gray":
        color = Color.GRAY;
        break;
    case "green":
        color = Color.GREEN;
        break;
    case "yellow":
        color = Color.YELLOW;
        break;
    case "lightgray":
        color = Color.LIGHT_GRAY;
        break;
    case "magneta":
        color = Color.MAGENTA;
        break;
    case "orange":
        color = Color.ORANGE;
        break;
    case "pink":
        color = Color.PINK;
        break;
    case "red":
        color = Color.RED;
        break;
    case "white":
        color = Color.WHITE;
        break;
 
        }
 }

}