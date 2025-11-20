SELECT p.ProductName, c.CategoryName, p.UnitPrice
FROM products p
JOIN categories c
on p.CategoryID = c.CategoryID
where p.UnitPrice = (
select Max(UnitPrice)
from products);