INSERT INTO menu_items(id, name, calories, price)
VALUES (1, 'bread', 500, 50),
       (2, 'beer', 400, 350),
       (3, 'salad', 200, 450),
       (4, 'ribs', 700, 800),
       (5, 'pasta', 600, 500),
       (6, 'coffee', 200, 200);

INSERT INTO restaurants(id, name)
VALUES (1, 'Restaurant 1'),
       (2, 'Restaurant 2'),
       (3, 'Restaurant 3');

INSERT INTO restaurants_items(restaurant_id, item_id)
VALUES (1, 1),
       (1, 6),
       (1, 3),
       (2, 2),
       (2, 4),
       (3, 3),
       (3, 5),
       (3, 6);