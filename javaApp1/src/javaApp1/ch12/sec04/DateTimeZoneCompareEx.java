package javaApp1.ch12.sec04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeZoneCompareEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //현재 날짜
	   //특정 날짜 
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0);
		LocalDateTime stopDateTime = LocalDateTime.of(2021, 12, 31, 23, 59);
		LocalDateTime eventDateTime = LocalDateTime.of(2022, 12, 31, 23, 59);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println( "시작일 " +  startDateTime.format(dtf) );
		System.out.println( "종료일 " +  stopDateTime.format(dtf) );
		
		if( startDateTime.isAfter(stopDateTime)) {
			System.out.println( "이벤트 진행중입니다");
		}else if(eventDateTime.isEqual(stopDateTime) ) {
			System.out.println( "이벤트 오늘 마감합니다.");
		}else {
			System.out.println( "이벤트 마감했습니다. 다음 기회에 ");
     	}
		
		// 2023-12-20 12:00 ~ 12:25 11:59 이벤트
		// 이벤트 기간 세일 70%, 이벤트 마감일 세일 85%, 이벤트 종료
		LocalDateTime startEvent = LocalDateTime.of(2023, 12, 20, 12, 0);
		LocalDateTime stopEvent = LocalDateTime.of(2023, 12, 25, 11, 59);
		 LocalDateTime currentDate = LocalDateTime.now();
		if( currentDate.isBefore(stopEvent) && currentDate.isAfter(startEvent)) {
			System.out.println("이벤트 중입니다 세일 70%");
		}else if( currentDate.isEqual(stopEvent) ) {
			System.out.println(" 이벤트 마감일 세일 85% ");
		}else {
			System.out.println( "이벤트 종료");
		}
		
		
		
		
	}
}
