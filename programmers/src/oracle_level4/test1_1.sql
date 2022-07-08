
-- Lv.4 우유와 요거트가 담긴 장바구니 

-- 내 쿼리
SELECT CART_ID 
FROM CART_PRODUCTS
WHERE CART_ID IN (SELECT CART_ID FROM CART_PRODUCTS WHERE NAME LIKE 'Milk') AND
      CART_ID IN (SELECT CART_ID FROM CART_PRODUCTS WHERE NAME LIKE 'Yogurt')
GROUP BY CART_ID
ORDER BY CART_ID;

-- 남 쿼리 --> 근데 카트아이디 중복이 안걸러짐!!!!!!!!!!! 
-- <> 는 != 와 같은 표현. 같지 않으면.
SELECT A.CART_ID
FROM CART_PRODUCTS A, CART_PRODUCTS B
WHERE A.Cart_Id = B.Cart_id 
And   A.Name = 'Milk'
And   B.Name = 'Yogurt'
And   A.name <> B.name
order by A.cart_id

-- 남 쿼리 내가 수정 (DISTINCT로 중복거르기. A.name<>B.name 왜한지 모르겠어서 뺌. 어차피 다르지 않나?)
SELECT DISTINCT A.CART_ID
FROM CART_PRODUCTS A, CART_PRODUCTS B
WHERE A.Cart_Id = B.Cart_id 
And   A.Name = 'Milk'
And   B.Name = 'Yogurt'
order by A.cart_id




