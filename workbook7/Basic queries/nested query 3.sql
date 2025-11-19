SELECT orderId
FROM northwind.`order details`
where ProductID = (
select ProductID
from northwind.products
where ProductName = "Sasquatch Ale");