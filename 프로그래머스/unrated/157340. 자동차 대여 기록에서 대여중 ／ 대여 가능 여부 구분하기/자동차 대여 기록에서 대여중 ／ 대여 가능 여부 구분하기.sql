#  START_DATE, END_DATE가 있을 때, 특정 날짜가 해당 기간에 포함되는지 알아내기
#  CASE ~ WHEN ~ THEN ~ ELSE ~ END
#  CASE WHEN 조건 1 THEN 결과 1
#       WHEN 조건 2 THEN 결과 2
#       THEN 결과 3
#       ELSE 결과 4
#  END AS 별명
#  GROUP BY의 특징 : GROUP BY로 묶게 될 경우 각각 하나의 컬럼이 나오게되는데, 이 때 각 그룹별 가장 상단의 컬럼이 출력되었다.
#  EX) ID : 5인 컬럼이 3개가 존재할 때, ID로 GROUPING을 할 경우 컬럼 3개 중 가장 상단의 컬럼이 출력된다.
#  이 때, MAX, MIN이 존재할 경우 해당하는 값을 포함하는 컬럼으로 GROUP BY의 대표값으로 나타난다.


# 2022-10-16값이 포함되어있는 문장을 BETWEEN을 통해 찾아내게 되며, 이러한 경우는 AVAILABILITY가 '대여 중', 아닌 경우는 '대여 가능'을 모든 컬럼에 부여한다.
# 각 컬럼에 '대여중', '대여 가능' 여부를 판단한 후, MAX함수로 최신 날짜를 지니고 있는 컬럼을 출력합니다. 이 때 GROUP BY로 인해 모든 컬럼이 아닌 각 CAR_ID별로 분할하여 계산을 수행합니다.


SELECT CAR_ID, 
    CASE 
        WHEN CAR_ID IN 
        (
            SELECT CAR_ID
            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
            WHERE '2022-10-16' BETWEEN START_DATE AND END_DATE  # WHERE절에 필드 값이 아닌 '2022-10-16' 과 같이 명시된 값을 주니 헷갈림..
        ) THEN '대여중'
        ELSE '대여 가능'
    END AS AVAILABILITY
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY 
    CAR_ID
ORDER BY 
    CAR_ID DESC;