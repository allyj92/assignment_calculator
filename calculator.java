import java.util.*;
public class calculator {
    public static int add(int leftNum,int rightNum){
        return leftNum+rightNum;

    }
    public static int sub(int leftNum,int rightNum){
        return leftNum+rightNum;

    }

    public static int mul(int leftNum,int rightNum){
       return leftNum+rightNum;

    }

    public static int devide(int leftNum,int rightNum){
        return leftNum+rightNum;

    }


    public static void main(String[] args) {
        int result=0;
        boolean isNotExit=true;
        calculator calc = new calculator();
        while (isNotExit){
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("+ 또는 - 또는 * 또는 / 연산자를 입력하세요 : ");
        String operator = scanner.next();
        System.out.print("숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();



        switch (operator){
            case "+" :
                result = add(num1,num2);
                break;
            case "-" :
                result = sub(num1,num2);
                break;
            case "*" :
                result = mul(num1,num2);
                break;
            case "/" :
                result = devide(num1,num2);
                break;
        }

            System.out.println("Result: " + result);
            System.out.println("그만 끝내겠습니까? 네/아니오 : ");
            String wouldExit = scanner.next();
            if (wouldExit.equals("네")){
                isNotExit = false;
            }else if(wouldExit.equals("아니오")){
                isNotExit = true;



            }
        }

        }
    }
