package main;

import observer.unit.Owl;
import singleton.unit.SingletonUnit;
import strategy.unit.Citizen;
import strategy.unit.Knight;
import strategy.unit.Mage;
import strategy.unit.Unit;

public class MainTest {
	
	public static void main(String[] args){		
		
		System.out.println("=======================================================");
		System.out.println("1. 유닛 종류별로 세명씩 생성한다. (기본 정보출력)");
		System.out.println("=======================================================");
		
		SingletonUnit singletonUnit = SingletonUnit.getInstance();
		Owl uniqueOwl = Owl.getInstance();
		singletonUnit.addUnit(new Citizen());
		singletonUnit.addUnit(new Knight());
		singletonUnit.addUnit(new Mage());
		singletonUnit.addUnit(uniqueOwl);
		
		
		singletonUnit.addUnit(new Citizen());
		singletonUnit.addUnit(new Knight());
		singletonUnit.addUnit(new Mage());
		
		singletonUnit.addUnit(new Citizen());
		singletonUnit.addUnit(new Knight());
		singletonUnit.addUnit(new Mage());
		System.out.println();
		
		
		System.out.println("=======================================================");
		System.out.println("2. 시민 50, 50으로 이동, 기사 50, 60으로 이동, 마법사 50, 40으로 이동");
		System.out.println("=======================================================");
		singletonUnit.moveDirect("Citizen1", 50, 50);
		singletonUnit.moveDirect("Knight1", 50, 60);
		singletonUnit.moveDirect("Mage1", 50, 40);
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("3. 부엉이 50, 21으로 이동");
		System.out.println("=======================================================");
		singletonUnit.moveDirect("Owl",50,21);
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("4. 부엉이가 특수능력을 수행");
		System.out.println("=======================================================");
		
		uniqueOwl.specialAbility();
		System.out.println();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. 시민 50, 40으로 이동");
		System.out.println("=======================================================");
		singletonUnit.moveDirect("Citizen1", 50, 40);
		System.out.println();

		
		System.out.println("=======================================================");
		System.out.println("6. 부엉이가 특수능력을 수행");
		System.out.println("=======================================================");
		uniqueOwl.specialAbility();
		System.out.println();
		System.out.println();

		
		System.out.println("=======================================================");
		System.out.println("7. 마법사 공격한다.");
		System.out.println("=======================================================");
		singletonUnit.fightOne("Mage1");
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("8. 시민이 죽었다.");
		System.out.println("=======================================================");
		singletonUnit.unitDied("Citizen1");
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("9. 부엉이가 특수능력을 수행");
		System.out.println("=======================================================");
		uniqueOwl.specialAbility();
		System.out.println();
		System.out.println();
	
	}
}
