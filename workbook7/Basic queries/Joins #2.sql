SELECT p.ProductID, p.ProductName, p.UnitPrice, s.ContactName
FROM products p
join suppliers s 
on p.SupplierID = s.SupplierID
where p.UnitPrice >= 75
order by p.ProductName;