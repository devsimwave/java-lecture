package com.greedy.section02.string;

public class Application1 {

	public static void main(String[] args) {

		
		/* String 클래스의 자주 사용하는 메소드 
		 * charAt() : 해당 문자열의 특정 인텍스에 해당하는 문자열을 반환한다.
		 * 인덱스는 0부터 시작하는 숫자 체계를 의미한다.
		 * 인덱스를  벗어난 정수를 인자로 전달하는 경우 StringIndexOutOfBoundsException*/
		
		String str1 = "apple";
		
		for(int i = 0; i < str1.length(); i++) {
			System.out.println("charAt(" + i + ") : " + str1.charAt(i));
		}
		
		/* compareTo() :  인자로 전달된 문자열과 사전 순으로 비교하여
		 * 두 문자열이 같다면  0을 반환, 인자로 전달된 문자열보다 작으면 음수를,
		 * 크면 양수를 반환한다.
		 * 단, 이 메소드는 대소문자를 구분하여 비교한다.,*/
		 
		String str2 = "java";
		String str3 = "java";
		String str4 = "JAVA";
		String str5 = "oracle";
		
		System.out.println("compareTo() : " + (str2.compareTo(str3))); //0 유니코드 숫자로 비교
		
		System.out.println("compareTo() : " + (str2.compareTo(str4))); //32
		System.out.println("compareTo() : " + (str4.compareTo(str4))); //0
		
		System.out.println("compareTO() : " + (str2.compareTo(str5))); //-5
		System.out.println("compareTO() : " + (str5.compareTo(str2))); //5
	
		/* compareToIgnoreCase() : 대소문자를 구분하지 않고 비교한다.*/
		System.out.println("compareToIgnoreCase() : " + (str2.compareToIgnoreCase(str4)));
	
		/* concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
		 * 원본 문자열에는 영향을 주지 않는다.
		 * */
		System.out.println("concat() : " + (str2.concat(str5)));
		System.out.println("str2 : " + str2);
		
		/* indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
		 * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
		 * */
		String indexOf = "java oracle";
		
		System.out.println("indexOf('a') : " + indexOf.indexOf('a'));
		System.out.println("indexOf('z') : " + indexOf.indexOf('z'));
		
		/* lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스를 반환한다.
		 * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
		 * */
		System.out.println("lastIndexOf('a') : " + indexOf.lastIndexOf('a'));
		System.out.println("lastIndexOf('z') : " + indexOf.lastIndexOf('z'));
		
		/* trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */
		String trimStr = "   java   ";
		
		System.out.println("trimStr : #" + trimStr + "#");
		System.out.println("trim() : #" + trimStr.trim() + "#");
		
		/* 원본에 영향을 주지 않는다. */
		System.out.println("trimStr : #" + trimStr + "#");
		
		/* toLowerCase() : 모든 문자를 소문자로 변환시킨다.
		 * toUpperCase() : 모든 문자를 대문자로 변환시킨다.
		 * 원본에 영향을 주지 않는다.
		 * */
		String caseStr = "JavaOracle";
		System.out.println("toLowerCase() : " + caseStr.toLowerCase());
		System.out.println("toUpperCase() : " + caseStr.toUpperCase());
		
		System.out.println("caseStr : " + caseStr);
		
		/* substring() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다. 
		 * 원본에 영향을 주지 않는다.
		 * */
		String javaoracle = "javaoracle";
		
		System.out.println("substring(3, 6) : " + javaoracle.substring(3, 6));
		System.out.println("substring(3) : " + javaoracle.substring(3));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("파일 명을 입력하세요 : ");
//		String fileName = sc.nextLine();
//
//		System.out.println(fileName.substring(0, fileName.indexOf(".")));
		
		System.out.println("javaoracle : " + javaoracle);
		
		/* replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환한다.
		 * 원본에 영향을 주지 않는다.
		 *  */
		System.out.println("replace() : " + javaoracle.replace("java", "python"));
		
		System.out.println("javaoracle : " + javaoracle);
		
		/* length() : 문자열의 길이를 정수형으로 반환한다. */
		System.out.println("length() : " + javaoracle.length());
		System.out.println("빈 문자열 길이 : " + ("".length()));
		
		/* isEmpty() : 문자열의 길이가 0이면 true, 아니면 false를 반환 */
		System.out.println("isEmpty() : " + "".isEmpty());
		System.out.println("isEmpty() : " + "abc".isEmpty());
	
		String str = "123";
		String str6 = "456";
		
		System.out.println(str + str6);
		System.out.println(str);
	
	}
	

}
