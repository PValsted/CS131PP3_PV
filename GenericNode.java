package linkedlist;

public class GenericNode {
  private String data;
  
  private GenericNode nextNode;
  
  public GenericNode() {
    setNextNode(null);
    this.data = null;
  }
  
  public void setData(String data) {
    this.data = data;
  }
  
  public String getData() {
    return this.data;
  }
  
  public GenericNode getNode() {
    return this;
  }
  
  public void setNextNode(GenericNode nextNode) {
    this.nextNode = nextNode;
  }
  
  public GenericNode getNextNode() {
    return this.nextNode;
  }
}
