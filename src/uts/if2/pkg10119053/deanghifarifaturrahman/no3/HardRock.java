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
public class HardRock extends Rnb implements PopRock,ProgressiveRock,PsychedelicRock {

    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName + " adalah musisi Pop Rock");
    }

    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName + " adalah musisi Progressive Rock");
    }

    @Override
    public void genrePsychedelicRock(String artistName) {
        System.out.println(artistName + " adalah musisi Psychedelic Rock");
    }
    
}
