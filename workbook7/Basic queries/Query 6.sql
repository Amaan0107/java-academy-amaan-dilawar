SELECT SupplierID, count(*) items_supplied
FROM northwind.products
Group by SupplierID
having count(*) >= 5;
