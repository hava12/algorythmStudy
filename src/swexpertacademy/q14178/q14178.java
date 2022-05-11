package swexpertacademy.q14178;

import common.TimeChecker;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q14178 {

	// 1차원 수직선 위에 정원이 있다. 모든 정수 1 ≤ i ≤ N 에 대해, 좌표 i에 꽃이 하나씩 심겨 있다. 즉, 좌표 1, 2, …, N에 총 N개의 꽃이 심겨 있다.
	// 꽃에 물을 주기 위해 자동 분무기를 사용한다. 분무기는 정수 좌표에 놓을 수 있으며, 좌표 x에 분무기를 놓았을 경우 닫힌 구간 [x - D, x + D]에 심긴 모든 꽃들에 물을 줄 수 있다.
	// N과 D가 주어질 때, 모든 꽃이 한 개 이상의 분무기에서 물을 받을 수 있도록 하기 위해 필요한 최소한의 분무기 수를 구하는 프로그램을 작성하라.

	// 	[입력]
	// 	첫 번째 줄에 테스트 케이스의 수 T가 주어진다.
	// 	각 테스트 케이스는 하나의 줄로 이루어진다. 각 줄에는 두 개의 정수 N과 D (1 ≤ N, D ≤ 100) 가 공백 하나를 사이로 두고 주어진다.
	//
	// 	[출력]
	// 	각 테스트 케이스마다 모든 꽃이 한 개 이상의 분무기에서 물을 받을 수 있도록 하기 위해 필요한 최소한의 분무기 수를 출력한다.
	//
	// 	입력           출력
	//  3			   #1 2
	// 	5 1            #2 1
	// 	5 2			   #3 15
	// 	100 3

	public static void main(String[] args) throws FileNotFoundException {
		TimeChecker timeChecker = new TimeChecker();
		timeChecker.start();

		StringBuilder builder = new StringBuilder();
		System.setIn(new FileInputStream("src/swexpertacademy/q14178/sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int t;
		t = sc.nextInt();

		for(int i = 0; i < t; i++) {

			int length = sc.nextInt();
			int range = sc.nextInt();
			int amount = 0;

			int totalRange = 1 + range * 2;

			amount = length / totalRange;

			if(length % totalRange > 0) {
				amount++;
			}

			builder.append("#" + (i + 1) + " " + amount + "\r\n");
		}

		System.out.println(builder.toString());
		timeChecker.end();
	}
}
