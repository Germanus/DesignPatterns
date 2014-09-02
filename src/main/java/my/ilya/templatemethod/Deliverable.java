package my.ilya.templatemethod;

/**
 * @author Kazakevich Ilya
 */
class Deliverable extends ProjectItem {
   
	private static final long serialVersionUID = 1L;
	private double materialsCost;
    private double productionTime;

    public Deliverable(){ }
    public Deliverable(String newName, String newDescription,
                       double newMaterialsCost, double newProductionTime,
                       double newRate){
        super(newName, newDescription, newRate);
        materialsCost = newMaterialsCost;
        productionTime = newProductionTime;
    }

    public void setMaterialsCost(double newCost){ materialsCost = newCost; }
    public void setProductionTime(double newTime){ productionTime = newTime; }

    public double getMaterialsCost(){ return materialsCost; }
    public double getTimeRequired(){ return productionTime; }
}
