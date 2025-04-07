package Main.Datenstrukturen_Algorhitmen;

public class Bintree {
private Root Root;

 
 
 public Bintree(int Value){
  this.Root = new Root(Value, null, null);
 }
  
 public void plantLeave(int value){
 Root newRoot = new Root(value, null, null);
 this.Root = addLeave(this.Root, newRoot);
   }

   public Root addLeave(Root currentRoot, Root addRoot){
    if(currentRoot == null){
        return addRoot;
    }
    if(addRoot.getValue() < currentRoot.getValue()){
        currentRoot.setLeftRoot(addLeave(currentRoot.getLeftRoot(), addRoot));
    }
    else if(addRoot.getValue() > currentRoot.getValue()){
        currentRoot.setRightRoot(addLeave(currentRoot.getRightRoot(), addRoot));
    }
    
    return currentRoot;
}



 public void removeLeave(){

 }

 public void printBinTree(){

 }
 
 public void searchRoot(){

 }

}


