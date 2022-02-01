public class BMI{
    private double weight;
    private double height;

    public BMI(){

    }

    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getWeight(){
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getInterpretations(){
        String[] interpretations = {"Underweight", "Normal", "Overweight","Obese"}; 
        String interpretation ="";
        double bmi = getBMI();

        if(bmi < 18.5){
            interpretation = interpretations[0];
        }else if(bmi >= 18.5 && bmi < 25.0){
            interpretation = interpretations[1];
        }else if(bmi >= 25.0 && bmi < 30.0){
            interpretation = interpretations[2];
        }else if(bmi <= 30.0){
            interpretation = interpretations[3];
        }
        
        return interpretation;
    }

    public double getBMI(){
        return (this.weight*0.45359237)/((this.height*0.0254)*(this.height*0.0254));
    }
}