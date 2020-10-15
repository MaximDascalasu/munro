

public class Munro {

// DoBIH number, grid ref, name, height (ft), category of munro (munro/munro top - if field is blank omit from results
private int DoBIH;
private String gridRef;
private  String name;
private double heightFT;
private String category;


public Munro(int DoBIH,String gridRef, String name,double heightFT,String category){
this.DoBIH=DoBIH;
this.gridRef=gridRef;
this.name=name;
this.heightFT=heightFT;
this.category=category;
}

//Getters
public int getDoBIH(){
    return DoBIH;
}
public String getGridRef(){
    return gridRef;
}
public String getName(){
    return name;
}
public double getHeightFT(){
    return heightFT;
}

    public String getCategory() {
        return category;
    }
}

