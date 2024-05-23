package Domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InsMain {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				showMenu();
				String choice = reader.readLine().trim();
				switch (choice) {
				case "1":
					insuranceInfo(reader);
					break;
				case "2":
					requestPayment(reader);
					break;
				case "3":
					roadsideAssist(reader);
					break;
				case "4":
					requestSupport(reader);
					break;
				case "5":
					productDevelop(reader);
					break;
				case "6":
					strategyDevelop(reader);
					break;
				case "7":
					marketAnalysis(reader);
					break;
				case "8":
					requestUnderwrite(reader);
					break;
				case "9":
					underwrite(reader);
					break;
				case "10":
					reviewCoverage(reader);
					break;
				case "11": 
					approvePayment(reader);
					break;
				case "12": 
					insurancePayment(reader);
					break;
				case "13": 
					contractManage(reader);
					break;
				case "14":
					infoManage(reader);
					break;
				case "15":
					personnelManage(reader);
					break;
				case "16":
					salesMenEdu(reader);
					break;
				case "17":
					happyCall(reader);
					break;
				case "18":
					offerSupport(reader);
					break;
				case "x":
					return;
				default:
					System.out.println("\n유효하지 않은 값입니다.\n");
				}
			}
		} catch (Exception e) {	
			System.out.println(e);
		}
	}
	private static void showMenu() {
		System.out.println("----------고객 메뉴----------");
		System.out.println("1. 보험 상품 메뉴");
		System.out.println("2. 보험금 청구 요청");
		System.out.println("3. 긴급 출동 요청");
		System.out.println("4. 고객 지원");
		System.out.println();
		System.out.println("----------직원 메뉴----------");
		System.out.println("5. 보험 상품 개발");
		System.out.println("6. 마케팅 전략 개발");
		System.out.println("7. 시장 분석");
		System.out.println("8. 인수 심사 요청");
		System.out.println("9. 인수 심사");
		System.out.println("10. 보험금 지급 심사");
		System.out.println("11. 보험금 지급 승인 요청");
		System.out.println("12. 보험금 지급");
		System.out.println("13. 계약 관리");
		System.out.println("14. 정보 관리");
		System.out.println("15. 인사 관리");
		System.out.println("16. 영업 교육");
		System.out.println("17. 해피 콜");
		System.out.println("18. 고객 지원");
		System.out.println();
		System.out.println("x. 종료");
	}
	/* private static void showList(ArrayList<?> dataList) {
		String list = "";
		for (int i=0; i<dataList.size(); ++i) {
			list += dataList.get(i) + "\n\n";
		}
	} */
	private static void insuranceInfo(BufferedReader reader) throws FileNotFoundException, IOException {
		System.out.println("----------보험 상품 메뉴----------");
		System.out.println("1. 생명 보험");
		System.out.println("2. 손해 보험");
		String choice = reader.readLine().trim();
		InsuranceListImpl insuranceList = new InsuranceListImpl("insurances.txt");
		ArrayList<Insurance> list;
		if (choice.equals("1")) {
			list = insuranceList.getLifeInsurance();
		} else if (choice.equals("2")) {
			list = insuranceList.getPropertyInsurance(); 
		} else {
			System.out.println("\n유효하지 않은 값입니다. 초기 화면으로 돌아갑니다.\n");
			return;
		}
		if (list.size()==0) {
			System.out.println("\n해당 종류의 보험이 존재하지 않습니다. 초기 화면으로 돌아갑니다.\n");
			return;
		}
		System.out.println("----------상품 목록----------");
		for (int i=0; i<list.size(); ++i) {
			System.out.println("[" + list.get(i).getName() + "]");
			System.out.println(list.get(i).getIntroduction());
			System.out.println("* 보험료 확인");
			System.out.println("* 상품 세부 정보");
			System.out.println("* 상품 가입");
		}
		// 특정 상품의 보험료 확인 or 상품 세부 정보 or 상품 가입을 누를 때의 작동을 어떻게 구현해야 할 지 모르겟습니다
		System.out.println("");
	}
	private static void requestPayment(BufferedReader reader){
	}
	private static void roadsideAssist(BufferedReader reader) {
	}
	private static void requestSupport(BufferedReader reader) {
	}
	private static void productDevelop(BufferedReader reader) {
	}
	private static void strategyDevelop(BufferedReader reader) {
	}
	private static void marketAnalysis(BufferedReader reader) {
	}
	private static void requestUnderwrite(BufferedReader reader) {
	}
	private static void underwrite(BufferedReader reader) {
	}
	private static void reviewCoverage(BufferedReader reader) {
	}
	private static void approvePayment(BufferedReader reader) {
	}
	private static void insurancePayment(BufferedReader reader) {
	}
	private static void contractManage(BufferedReader reader) {
	}
	private static void infoManage(BufferedReader reader) {
	}
	private static void personnelManage(BufferedReader reader) {
	}
	private static void salesMenEdu(BufferedReader reader) {
	}
	private static void happyCall(BufferedReader reader) {
	}
	private static void offerSupport(BufferedReader reader) {
	}
}