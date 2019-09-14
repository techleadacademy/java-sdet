package day9;


public class TableDemo {
   public static void main(String[] args) {
	  /** 
	   *   Table -> reference type
	   *   studentTable -> reference name (object name, variable name)
	   *   new -> we use to create our object
	   *   
	   */
	  Table studentTable = new Table();
	
	  
	  studentTable.type = "desk";
	  studentTable.color = "white";
	  studentTable.height = 30;
	  studentTable.width = 20;
	  System.out.println(studentTable.type);
	  System.out.println(studentTable.color);
	  System.out.println(studentTable.height);
	  System.out.println(studentTable.width);
	  
	  
	  Table table2 = new Table();
	  table2.type = "drawer";
	  table2.color = "grey";
	  table2.height = 40;
	  table2.width = 30;
	  System.out.println(table2.type);
	  System.out.println(table2.color);
	  System.out.println(table2.height);
	  System.out.println(table2.width);
	  
			  
   }
}
