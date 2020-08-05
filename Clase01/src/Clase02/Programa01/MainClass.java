package Clase02.Programa01;

public class MainClass {

	public static void main(String[] args) {
		
		PlanTelefonico planBase = new PlanTelefonico();
		
		System.out.println(planBase);
		
		
		PlanTelefonico PlanX = new PlanTelefonico(3,200,20000,"Plan Z");
		
		System.out.println(PlanX);
	}

}
