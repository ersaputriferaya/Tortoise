package tortoise;

public class Tortoise {
    
    private String nama;
    private String ukuran;
    private String corak;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getCorak() {
        return corak;
    }

    public void setCorak(String corak) {
        this.corak = corak;
    }
    public void cetak(){
        System.out.println("Nama    : "+nama);
        System.out.println("Ukuran  : "+ukuran);
        System.out.println("Corak   : "+corak);
    }
   
    }
    

