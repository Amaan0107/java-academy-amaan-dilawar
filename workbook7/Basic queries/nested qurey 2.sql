SELECT OrderID, ShipName, ShipAddress
FROM northwind.orders
where ShipVia = ( 
Select ShipperID
from northwind.shippers
where CompanyName = "Federal Shipping");