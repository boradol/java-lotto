# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

---
---
##Step1 - 문자열 계산기 요구사항 - 문자 사칙연산 계산기 구현
> 이번 미션의 핵심은 내가 구현하는 코드에 단위 테스트를 추가하는 경험을 하는 것이다.<br>
> 모든 예외 상황을 처리하기 위해 너무 복잡하게 접근하지 않아도 된다.
### 기능요구사항
- [x] 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열 - 빈공백으로 split
- [x] 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정
- [x] 입력값에 따라 계산순서 결정
### 프로그래밍 요구사항
- [x] indent(들여쓰기) depth 를 2단계에서 1단계로 줄이기
- [x] 메소드의 크기가 최대 10 라인을 넘지 않도록 구현
- [x] else 사용 금지
### 기능 분리 힌트
- [x] 테스트 할 수 있는 단위로 나누어 구현목록 만듦.
  - [x] 덧셈, 뺄셈, 곱셈, 나눗셈
  - [x] Number 객체 생성
  - [x] 입력값이 Null 이거나 빈 공백 문자일 경우 -> IllegalArgumentException throw
  - [x] Operator 객체 생성
  - [x] 사칙연산 기호가 아닌 경우 -> IllegalArgumentException throw
- [x] 공백 문자열을 빈 공백 문자로 분리하려면 String 클래스의 split("") 메소드를 활용.
- [x] 반복적인 패턴을 찾아 반복문으로 구현 

### 리뷰 요구사항
- [x] 메서드 명사형 -> 동사형 수정 (calculator -> calculate)
- [x] 처음 input값 validation -> Expression 클래스에서 처리하기
- [x] Test input이 하나일때 @ParameterizedTest -> @Test 사용
- [x] ArithmeticOperation 정적 팩토리 메서드로 처리하기.
- [x] 의미없는 test 삭제
