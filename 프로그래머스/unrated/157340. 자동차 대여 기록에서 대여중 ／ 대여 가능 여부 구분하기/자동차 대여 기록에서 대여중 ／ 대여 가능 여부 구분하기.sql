-- START_DATE, END_DATE가 있을 때, 특정 날짜가 해당 기간에 포함되는지 알아내기
-- CASE ~ WHEN ~ THEN ~ ELSE ~ END
-- CASE WHEN 조건 1 THEN 결과 1
--      WHEN 조건 2 THEN 결과 2
--      THEN 결과 3
--      ELSE 결과 4
-- END AS 별명
-- GROUP BY의 특징 : GROUP BY로 묶게 될 경우 각각 하나의 컬럼이 나오게되는데, 이 때 각 그룹별 가장 상단의 컬럼이 출력되었다.
-- EX) ID : 5인 컬럼이 3개가 존재할 때, ID로 GROUPING을 할 경우 컬럼 3개 중 가장 상단의 컬럼이 출력된다.
-- 이 때, MAX, MIN이 존재할 경우 해당하는 값을 포함하는 컬럼으로 GROUP BY의 대표값으로 나타난다.
SELECT CAR_ID, MAX(CASE WHEN '2022-10-16' BETWEEN  DATE_FORMAT(START_DATE, '%Y-%m-%d') AND  DATE_FORMAT(END_DATE, '%Y-%m-%d') THEN '대여중'
ELSE '대여 가능' END) AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC;