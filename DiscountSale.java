public class DiscountSale extends Sale{
    private double discount;

    public DiscountSale(){
        super();
        discount = 0;
    }
    public DiscountSale(String theName,  double thePrice, double theDiscount)
    {
        super (theName, thePrice);
        setDiscount(theDiscount);
    }
    public DiscountSale(DiscountSale originalObject){
        super(originalObject);
        discount =originalObject.discount;

    }
    public static void announcement(){
        System.out.println("This is the DiscountSales Class.");
    }
    public double bill(){
        double fraction=discount/100;
        return (1-fraction)*getPrice();
    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double newDiscount){
        if(newDiscount >= 0)
            discount=newDiscount;
        else{
            System.out.println("Error: Negative Discount.");
            System.exit(0);
        }

    }
    public String toString(){
        return (getName() + " Price $"+ getPrice()+ " Discount = "+ discount +"%\n"+" Total cost = $"+bill());
    }
    public boolean equals(Object otherObject){
        if(otherObject==null)
            return false;
        else if (getClass()!=otherObject.getClass())
            return false;
        else{
            Sale otherSale = (Sale)otherObject;
            return (getName().equals(otherSale.getName()) && (getPrice()==otherSale.getPrice()));
        }
    }
    
}
