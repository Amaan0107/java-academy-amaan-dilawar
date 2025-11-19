SELECT  distinct ProductID, ProductName, (UnitPrice*UnitsInStock) as inventory_value
FROM northwind.products
order by inventory_value desc;