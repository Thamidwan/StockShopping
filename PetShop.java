/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokale.tj;

/**
 *
 * @author DESIRE
 */
class PetShop extends PETSFOOD{
private String name; 
private int noCatsFood;
private int dogMore;

    PetShop(String name, int noCatsFood, int dogMore) {
        this.dogMore =dogMore;
        this.name= name;
        this.noCatsFood= noCatsFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoCatsFood() {
        return noCatsFood;
    }

    public void setNoCatsFood(int noCatsFood) {
        this.noCatsFood = noCatsFood;
    }

    public int getDogMore() {
        return dogMore;
    }

    public void setDogMore(int dogMore) {
        this.dogMore = dogMore;
    }

        
    public double catFood(){
       double price;
       price = noCatsFood * 50;
       return price;
    }
    
    public double dogFood(){
        return dogMore * 45;
    }
    
  
    public double BuyingPrice(){
        double total =0;
        double money;
        money = dogFood() + catFood() ;
        if(money <500){
          total = money *0.90;
        }
        if(money>500){
            total = money * 0.80;
        }
        return total;
    }
    
 
    
}
