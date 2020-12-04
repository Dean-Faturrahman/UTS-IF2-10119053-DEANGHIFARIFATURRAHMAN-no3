/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119053.deanghifarifaturrahman.no3;

/**
 *
 * @author Dean
 */
public class Metal implements HeavyMetal{
    
    public void genreMetal(String artistName){
        System.out.println(artistName + " adalah musisi Metal");
    }

    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName + " adalah musisi Heavy Metal");
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName + " adalah musisi Punk");
    }
    
    public void genreGrunge(String artistName){
        System.out.println(artistName + " adalah musisi Grunge");
    }
    
}
