SELECT ProductName, UnitPrice
FROM northwind.products
where UnitPrice = (
select max(UnitPrice)
from northwind.products);