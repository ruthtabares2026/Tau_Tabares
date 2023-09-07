class Main {
  public static void main(String[] args) {
    String name1 = "Vivi";
    String name2 = "Xeanne";
    String name3 = "Cha";
    String school1 = "Miriam";
    String school2 = "Pisay";
    String school3 = "Miriam";
    int yrs1 = 5;
    int yrs2 = 1;
    int yrs3 = 7;
    
    System.out.println("Friend 1");
    System.out.println("Name: " + name1);
    System.out.println("School: " + school1);
    System.out.println("Years known: " + yrs1);
    System.out.println();
    System.out.println("Friend 2");
    System.out.println("Name: " + name2);
    System.out.println("School: " + school2);
    System.out.println("Years known: " + yrs2);
    System.out.println();
    System.out.println("Friend 3");
    System.out.println("Name: " + name3);
    System.out.println("School: " + school3);
    System.out.println("Years known: " + yrs3);
    System.out.println();
    System.out.println("Total years known: " + (yrs1+yrs2+yrs3)); // (operation:sum)
    System.out.println("I've known Cha for longer than Vivi: " + (yrs1<yrs3)); // (operation:comparison)
    System.out.println("Xeanne and Vivi go to the same school: " + (school1==school2)); // (operation:comparison)
  }
}
