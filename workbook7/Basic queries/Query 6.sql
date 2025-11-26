SELECT 
    product_id,
    product_name,
    (unit_price * units_in_stock) AS inventory_value
FROM products
ORDER BY inventory_value DESC, product_name;
