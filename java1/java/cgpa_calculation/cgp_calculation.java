
package cgpa_calculation;


public class cgp_calculation {
    public double cgpa_calculation(double java,double algo)
    {
        
        double javacgpa = clculatemarkegpa(java);
        double algocgpa = clculatemarkegpa(algo);
        
        double cg =(javacgpa*3)+(algocgpa*3)/(3+3);
        return cg;
    }
    
    private double clculatemarkegpa(double n)
    {
        double gpa=0;
        if (n>80) {
            gpa=4.0;
        } 
        else if (n>=70) {
            
        } else {
            gpa=0.0;
        }

        return gpa;
    }

    
}
