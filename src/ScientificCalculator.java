// 계산기 v3.0 관련 클래스
// https://github.com/dlawjdals/Java-Calculator/issues/9

public class ScientificCalculator extends AdvancedCalculator {


    // 계산기 v3.0 나머지 연산 기능 개발 완료
    //https://github.com/dlawjdals/Java-Calculator/issues/10

    @Override
    public int mod() {
        result = 0;

        result = num1 % num2;
        return result;
    }


}
