-- 2023.01.02 기준, 다시 풀어보기
-- 식당 별 MAX(FAVORITES)가 포함되어 있는 FOOD_TYPE, FAVORITES 행을 찾기
-- 해당 행의 내용이 포함되어 있는 행을 SELECT문으로 출력하기!

SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES FROM REST_INFO
WHERE (FOOD_TYPE, FAVORITES) IN (SELECT FOOD_TYPE, MAX(FAVORITES) FROM REST_INFO GROUP BY FOOD_TYPE)
ORDER BY FOOD_TYPE DESC;

