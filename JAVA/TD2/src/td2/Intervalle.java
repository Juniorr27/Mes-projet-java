
package td2;
public class Intervalle {
    private int min;
    private int max;
    public Intervalle(int min,int max){
        this.max = max;
        this.min = min;
    }
    public Intervalle(){
        
    }
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    public void setMinMax(int max, int min){
        
    } 

    @Override
    public String toString() {
        return "IntervalLe{" + "min= " + min + ", max= " + max + '}';
    }
    public void  affiche(){
        System.out.println("“ L’intervalle a pour" +
"borne inférieure " + this.min + " et pour borne supérieure max" + this.max);
    }
    public int longuer(){
       return min - max; 
    }
    public boolean estIncluse(int v){
        if (v > min || v < max){
        return true;
          } else {
                return false;
             }
    }

   /*
    @Override
    public boolean equals( Object intervalle){
        
        if (this == intervalle) {
            return true;
        }
        if (this == null || getClass() != intervalle.getClass()) {
            return false;
        }
        Intervalle inter = (Intervalle) intervalle;
        return min = inter.min; 
    }*/
    
    public boolean  contient(  Intervalle va){
       return estIncluse(va.min)&& estIncluse(va.max);
            
        }
    
    public Intervalle Intersection(Intervalle i){
        if (max(this.min,i.min) > min(this.max,i.min)){
            return null;
            
        }
        return new Intervalle (max(this.min,i.min) > min(this.max,i.min));
    }
}
