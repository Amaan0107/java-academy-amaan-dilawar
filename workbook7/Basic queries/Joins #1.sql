SELECT p.ProductID, p.ProductName, p.UnitPrice, c.categoryName
FROM products p
Join categories c
on p.CategoryID = C.categoryID
order by c.CategoryName, p.ProductName;