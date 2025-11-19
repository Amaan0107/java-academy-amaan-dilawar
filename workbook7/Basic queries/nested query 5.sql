SELECT ContactName
FROM northwind.customers
where CustomerID = (
select CustomerID
from northwind.orders
where OrderID = 10266);