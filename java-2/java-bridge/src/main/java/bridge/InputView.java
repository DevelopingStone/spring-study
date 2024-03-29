package bridge;

import camp.nextstep.edu.missionutils.Console;

// 사용자로부터 입력을 받는 역할을 한다.
// 오로지 입력만 받자.
public class InputView {

    //다리의 길이를 입력받는다.

    public int readBridgeSize() {
        System.out.println("다리의 길이를 입력해주세요.");
        return Integer.parseInt(Console.readLine());
    }

    // 사용자가 이동할 칸을 입력받는다.
    public String readMoving() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        return Console.readLine();
    }

    // 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.

    public String readGameCommand() {
        return Console.readLine();
    }
}
