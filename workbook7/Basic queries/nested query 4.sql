SELECT FirstName, LastName
FROM northwind.employees
where EmployeeId = (
select EmployeeID
from northwind.orders
where orderID = 10266);