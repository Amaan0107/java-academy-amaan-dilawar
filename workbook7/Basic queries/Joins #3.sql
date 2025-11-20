SELECT p.ProductID, p.ProductName, p.UnitPrice, s.ContactName As supplierName, c.categoryName 
FROM products p
join suppliers s 
on p.SupplierID = s.SupplierID
join categories c 
on p.CategoryID = c.CategoryID
order by p.ProductName;