-- 5월 식품들의 총매출 조회하기
SELECT fd.PRODUCT_ID,	fd.PRODUCT_NAME, sum(fd.price * fo.amount) as TOTAL_SALES
from FOOD_PRODUCT fd, FOOD_ORDER fo
where fd.PRODUCT_ID = fo.PRODUCT_ID
and to_char(fo.PRODUCE_DATE, 'yyyy-mm') = '2022-05'
group by fd.PRODUCT_ID, fd.PRODUCT_NAME
order by TOTAL_SALES desc, fd.PRODUCT_ID asc;