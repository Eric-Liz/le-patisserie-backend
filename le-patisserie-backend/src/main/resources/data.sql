INSERT INTO product (id, name, description, price, image_url, category, available, order_id) VALUES
(1, 'Tart', 'A classic sablée pastry pie in the shape of a number', 80.50, 'https://i.ibb.co/G2rpYD8/image-8-1.png', 'PIE', true, null),
(2, 'Number Tart', 'Mini tart filled with fresh fruit and cream.', 18.00, 'https://i.ibb.co/WgYzpvJ/image-7.png', 'PIE', true, null),
(3, 'Mendiant', 'A French chocolate disc topped with dried fruits and nuts.', 12.75, 'https://i.ibb.co/ysHGCmR/image-1.png', 'CHOCOLATE', true, null),
(4, 'Chocolate Bar', 'Rich dark chocolate bar, 70% cocoa.', 5.99, 'https://i.ibb.co/JFQxrxL/429828791-18020673386295808-235619404392408935-n.jpg', 'CHOCOLATE', true, null),
(5, 'Truffles', 'Handmade chocolate truffles with a creamy ganache center.', 22.50, 'https://i.ibb.co/hsjbLtw/image-6.png', 'DESERT', true, null);
INSERT INTO top_products (id, product_id) VALUES (1, 1);
INSERT INTO top_products (id, product_id) VALUES (2, 2);
INSERT INTO top_products (id, product_id) VALUES (3, 3);