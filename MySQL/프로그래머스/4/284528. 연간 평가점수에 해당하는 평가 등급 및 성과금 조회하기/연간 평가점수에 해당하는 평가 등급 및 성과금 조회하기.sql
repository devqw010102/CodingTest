-- 코드를 작성해주세요
SELECT E.EMP_NO
     , E.EMP_NAME
     , CASE
            WHEN AVG(G.SCORE) >= 96 THEN 'S'
            WHEN AVG(G.SCORE) >= 90 THEN 'A'
            WHEN AVG(G.SCORE) >= 80 THEN 'B'
            ELSE 'C'
        END AS GRADE
     , CASE
            WHEN AVG(G.SCORE) >= 96 THEN SAL * 20 / 100
            WHEN AVG(G.SCORE) >= 90 THEN SAL * 15 / 100
            WHEN AVG(G.SCORE) >= 80 THEN SAL * 10 / 100
            ELSE 0
        END AS BONUS
  FROM HR_EMPLOYEES E
  LEFT JOIN HR_GRADE G
    ON E.EMP_NO = G.EMP_NO
 GROUP BY EMP_NO
 ORDER BY EMP_NO
 