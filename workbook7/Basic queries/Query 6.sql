SELECT SupplierID, count(*) as items_supplied
FROM northwind.products
Group by SupplierID;