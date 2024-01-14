## 제로베이스 프론트엔드 스쿨_CandyPrice
### 문제 설명
당신은 제로-슈가 사탕 가게에서 n개의 사탕을 구매하려고 합니다.

제로-슈가 사탕 가게에서는 사탕을 개당 price의 가격으로 판매합니다.

현재 이 가게에서는 10+1이벤트를 하고 있어서, 사탕을 10개 구매하면 1개를 무료로 제공해 준다고 하며, 이 이벤트는 여러 번 중복 적용이 가능합니다.

이 때, n개의 사탕을 구매하는 데 필요한 비용을 계산하는 프로그램을 구현하세요.

단, 정확히 n개를 구매할 수 없다면 n+1개를 구매하게 되어도 괜찮습니다.

### 입력 형식
* n: 구매하려고 하는 사탕의 개수 (정수)
* price: 사탕 1개당 비용 (정수)
### 출력 형식
* 사탕을 구매하는 데에 필요한 비용을 정수로 반환
### 제약 사항
* 1 <= n <= 100
* 1 <= price <= 100
### 입출력 예시
* 예시1
  * 입력
    * n = 11
    * price = 10
  * 출력: 100
  * 설명: 총 10개의 사탕 비용인 100를 소비하면, 1개를 추가로 받기 때문에 총 11개의 사탕을 구매할 수 있다.
* 예시2
  * 입력
    * n = 20
    * price = 5
  * 출력: 95
  * 설명: 총 19개의 사탕 비용인 95를 소비하면, 1개를 추가로 받기 때문에 총 20개의 사탕을 구매할 수 있다.