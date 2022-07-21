//요소
//목적지
//목적지까지 거리
//기본 거리
//기본 요금
//거리당 요금
//    - **있을 경우** {기타 택시 요소들}
// - 기능
// 거리당 요금 추가
//- 요금 결제
//- **있을 경우** {기타 택시 기능들}
//- 기본값
//- 최대 승객 수 = 4
//- 기본 요금 = 3000
//- 거리당 요금 = 1000
// 기본 거리 = 1
//주유량 = 100
//상태 = 일반
//속도 = 0


public class Taxi {
    public class Taxi {
        String TaxiName; // 택시 이름
        int passengerCount; // 승객 수
        int money; // 택의 수입

        public Taxi(String taxiName){ // 버스 번호를 매개변수로 받는 생성자
            this.TaxiName = taxiName;
        }

        public void take(int money){ // 승객이 낸 돈을 받음
            this.money += money; // 택시의 수입 증가
            passengerCount++; // 승객 수 증가
        }

        public void showInfo() { // 택시 정보를 출력하는 함수
            System.out.println("택시 "+"\""+ TaxiName +"\""+ "의 승객은 " + passengerCount +"명이고, 수입은 "
                    + money + "입니다.");
            System.out.println("************************************");
        }
    }
}
