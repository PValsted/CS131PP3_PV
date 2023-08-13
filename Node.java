package linkedlist;

public class Node {
  private String data;
  
  private Node nextNode;
  
  public Node() {
    setNextNode(null);
    this.data = null;
  }
  
  public void setData(String data) {
    this.data = data;
  }
  
  public String getData() {
    return this.data;
  }
  
  public Node getNode() {
    return this;
  }
  
  public void setNextNode(Node nextNode) {
    this.nextNode = nextNode;
  }
  
  public Node getNextNode() {
    return this.nextNode;
  }
}
