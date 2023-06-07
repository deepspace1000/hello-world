public class HelloWorld {
    private int i;
	private String name;
    public HelloWorld() {
        i = 0; 
    }
    public HelloWorld(String text){
        System.out.println(text);
    }
    public int getI() {
        return i;
    } 
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
}