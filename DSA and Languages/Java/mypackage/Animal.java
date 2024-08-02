package mypackage;

// Superclass with different access modifiers
public class Animal {
  public String publicField = "Public field";
  private String privateField = "Private field";
  protected String protectedField = "Protected field";
  String defaultField = "Default field";

  public void display() {
    System.out.println("Inside Animal class:");
    System.out.println("\tpublicField: " + publicField);
    System.out.println("\tprivateField: Not accessible directly");
    System.out.println("\tprotectedField: " + protectedField);
    System.out.println("\tdefaultField: " + defaultField);
  }
}