<pre>
stack 에 progress 별 개발 일자 있음

days : progress 별 작업 완료 일 배열

max_day 배포 기준일(현재 관측된 최대값)

max_day 보다 day 가 작다면 count +(같이 배포해아함)
		  크다면 현재 count 출력하고 max_day 를 day 로 수정, count 는 1로

반복이 종료 된 후 남은 count append

return
<pre>
