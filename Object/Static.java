package Object;

public class Static {
    public static void main(String args[]){
        Students s1=new Students();
        s1.schoolName ="DPS";

        Students s2=new Students();
        System.out.println(s2.schoolName);

    }
    
}

class Students{
    static int returnPercentage(int math,int phy, int chem){     //logic is same for all object and reduce the memory space 
        return (math+phy+chem)/3;  
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
