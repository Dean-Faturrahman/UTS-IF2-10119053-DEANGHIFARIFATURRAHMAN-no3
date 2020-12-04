/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119053.deanghifarifaturrahman.no3;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program genre musik
 */
public class UTSIF210119053DEANGHIFARIFATURRAHMANNo3 {

    public static void main(String[] args) {
        Rnb blues = new Rnb();
        blues.genreBlues("Jimmy Hendrik");
        
        Rnb jazz = new Rnb();
        jazz.genreJazz("Chad Baker");
        
        Folk folk = new Folk();
        folk.genreFolk("Bob Dylan");
        
        Rockability rb = new Rockability();
        rb.genreRockability("Elvis Presley");
        
        HardRock hardrock = new HardRock();
        hardrock.genreProgressiveRock("Dream Theater");
        hardrock.genrePsychedelicRock("The Doors");
        hardrock.genrePopRock("Kiss");
        
        Metal metal = new Metal();
        metal.genrePunk("MXPX");
        metal.genreHeavyMetal("METALLICA");
        
        Grindcore gc = new Grindcore();
        gc.genreGrindcore("Mesin Tempur");
        
        DeathMetal dm = new DeathMetal();
        dm.genreDeathMetal("JASAD");
        
        DeathCoreKepiting dck = new DeathCoreKepiting();
        dck.genreDeathCoreKepiting("Revenge The Fate");
        
        BlackMetal bm = new BlackMetal();
        bm.genreBlackMetal("Behemoth");
        
        NewSkul ns = new NewSkul();
        ns.genreNewSkul("HATEBREED");
    }
    
}
