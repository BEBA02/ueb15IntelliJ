package com.company;

/**
 * Interface Palindrom
 * 
 * @author (Niklas Terwort && Tobias Steuer) 
 */

public interface Palindrom
{
    /**
     * Methode zum Ueberpruefen ob das gegebene Wort ein Palindrom ist
     * param String Wort    Das zu pruefende Wort     
     *
     * Wird ueberschrieben 
     */
    public abstract boolean istPalindrom(String wort);
    public abstract String dateiEinlesen();
    long istPalindromCheckTime(String wort);
    String testReihe();
}