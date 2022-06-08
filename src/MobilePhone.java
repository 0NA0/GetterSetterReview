public class MobilePhone {
    private String brandName;
    private String colour;
    private int modelNo;

    public void setBrandName(String bName) {this.brandName = bName;}
    public void setColour(String cr) {this.colour = cr;}
    public void setModelNo(int modelNo) {
        if(modelNo<25 || modelNo>50 ) {
            this.modelNo=0;}
        else
        {this.modelNo=modelNo;}
    }

    public String getBrandName() {
        return brandName;
    }
    public String getColour() {
        return colour;
    }
    public int getModelNo() {
        return modelNo;
    }

    public static void main(String[] args) {
        MobilePhone iphone = new MobilePhone();

        iphone.setBrandName("iphone pro");
        iphone.setColour("Azure");
        iphone.setModelNo(13);

        System.out.println(iphone.getBrandName());
        System.out.println(iphone.getColour());
        System.out.println(iphone.getModelNo());

    }
}
