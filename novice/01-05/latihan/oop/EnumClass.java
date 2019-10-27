public enum EnumClass{

    
    BLOUSE(1,"BLOUSE"),KEMEJA(2,"KEMEJA"), TSHIRT(3,"TSHISRT"),
    DRESS(4,"DRESS");

    String getJenisBaju;
    int urutanBaju;

    public void setJenisBaju(String getJenisBaju,int urutanBaju ){
        this.getJenisBaju=getJenisBaju;
        this.urutanBaju=urutanBaju;
    }

    public int getUrutanBaju(){
        return urutanBaju;
    }
    public String getJenisBaju(){
        return getJenisBaju;
    }

}