import java.util.Scanner;
class Notes{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int amount, note500, note200, note100, note50, note20, note10, note5, note2, note1;
	System.out.println("Enter the amount : ");
	amount = sc.nextInt();
	if( amount >= 500){
		note500 = amount / 500;
		amount = amount - note500 * 500;
		System.out.println("Notes 500 - "+note500);
	}
	if( amount >= 200){
		note200 = amount / 200;
		amount = amount - note200 * 200;
		System.out.println("Notes 200 - "+note200);
	}
	if( amount >= 100){
		note100 = amount / 100;
		amount = amount - note100 * 100;
		System.out.println("Notes 100 - "+note100);
	}
	if( amount >= 50){
		note50 = amount / 50;
		amount = amount - note50 * 50;
		System.out.println("Notes 50 - "+note50);
	}
	if( amount >= 20){
		note20 = amount / 20;
		amount = amount - note20 * 20;
		System.out.println("Notes 20 - "+note20);
	}
	if( amount >= 10){
		note10 = amount / 10;
		amount = amount - note10 * 10;
		System.out.println("Notes 10 - "+note10);
	}
	if( amount >= 5){
		note5 = amount / 5;
		amount = amount - note5 * 500;
		System.out.println("Notes 5 - "+note5);
	}
	if( amount >= 2){
		note2 = amount / 2;
		amount = amount - note2 * 2;
		System.out.println("Notes 2 - "+note2);
	}
	if( amount >= 1){
		note1 = amount / 1;
		amount = amount - note1 * 1;
		System.out.println("Notes 1 - "+ note1);
	}
	}

}

// 2528 -
// ------
// 500 -
// 100 -
// 50 -
// 20 -
// 10 -
// 5 -
// 2 -
// 1 -