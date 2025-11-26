SELECT o.OrderID, o.ShipName, o.ShipAddress, s.CompanyName
 FROM orders o 
 Join shippers s
 on o.ShipVia = s.ShipperID
 Where o.ShipCountry = "Germany";