package PBONadiaZafiraZahra;

/**
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author Acer
 */
public class LaptopUser {
    private Laptop laptop;

    public LaptopUser(Laptop laptop){
        this.laptop=laptop;
    }

    void turnOnLaptop(){
        this.laptop.powerOn();
    }

    void turnOffLaptop(){
        this.laptop.powerOff();
    }

    void makeLaptopLouder(){
        this.laptop.volumeUp();
    }

    void makeLaptopSilence(){
        this.laptop.volumeDown();
    }
}