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
		System.out.println("1. ���� �������� ���� �����Ѵ�. (�⺻ �������)");
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
		System.out.println("2. �ù� 50, 50���� �̵�, ��� 50, 60���� �̵�, ������ 50, 40���� �̵�");
		System.out.println("=======================================================");
		singletonUnit.moveDirect("Citizen1", 50, 50);
		singletonUnit.moveDirect("Knight1", 50, 60);
		singletonUnit.moveDirect("Mage1", 50, 40);
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("3. �ξ��� 50, 21���� �̵�");
		System.out.println("=======================================================");
		singletonUnit.moveDirect("Owl",50,21);
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("4. �ξ��̰� Ư���ɷ��� ����");
		System.out.println("=======================================================");
		
		uniqueOwl.specialAbility();
		System.out.println();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. �ù� 50, 40���� �̵�");
		System.out.println("=======================================================");
		singletonUnit.moveDirect("Citizen1", 50, 40);
		System.out.println();

		
		System.out.println("=======================================================");
		System.out.println("6. �ξ��̰� Ư���ɷ��� ����");
		System.out.println("=======================================================");
		uniqueOwl.specialAbility();
		System.out.println();
		System.out.println();

		
		System.out.println("=======================================================");
		System.out.println("7. ������ �����Ѵ�.");
		System.out.println("=======================================================");
		singletonUnit.fightOne("Mage1");
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("8. �ù��� �׾���.");
		System.out.println("=======================================================");
		singletonUnit.unitDied("Citizen1");
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("9. �ξ��̰� Ư���ɷ��� ����");
		System.out.println("=======================================================");
		uniqueOwl.specialAbility();
		System.out.println();
		System.out.println();
	
	}
}
