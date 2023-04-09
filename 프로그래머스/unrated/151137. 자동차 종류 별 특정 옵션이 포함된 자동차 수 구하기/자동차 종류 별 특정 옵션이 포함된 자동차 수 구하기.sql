-- 문자열 포함 여부 판단
-- Like문을 활용
-- %단어 : 단어로 끝나는 모든 데이터를 검색한다.
-- 단어% : 단어로 시작하는 모든 데이터를 검색한다.
-- %단어% : 단어가 포함된 모든 데이터를 검색한다.
-- _단어 : 앞자리수가 1자리 포함되고 단어로 끝나는 데이터를 검색한다.
-- 단어_ : 단어로 시작하고 뒷자리수가 1자리 포함된 데이터를 검색한다.
-- _단어_ : 앞에 1자리, 뒤에 1자리가 추가되고 단어가 포함된 데이터를 검색한다.
SELECT CAR_TYPE, COUNT(CAR_ID) AS CARS FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%열선시트%' OR OPTIONS LIKE '%통풍시트%' OR OPTIONS LIKE '%가죽시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE ASC;