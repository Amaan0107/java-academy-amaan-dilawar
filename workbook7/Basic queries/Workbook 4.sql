SELECT d.name, d.address, d.phone
FROM dealership d
JOIN inventory i ON d.dealership_id = i.dealership_id
JOIN vehicles v ON v.VIN = i.VIN
WHERE v.VIN = '1HGCM82633A004352';