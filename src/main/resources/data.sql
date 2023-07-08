INSERT INTO users (id, email, first_name, last_name, address, birthdate, phone_number, reward_points)
VALUES  (1001, 'smith@example.com', 'Sophie', 'Smith', '12345 New City, Example Street 12', '1960-07-09', '+4912345678', 0),
        (1002, 'helper@example.com', 'Helen', 'Helper', '12345 New City, Example Street 8', '1990-12-09', '+4998765432', 200);

INSERT INTO communities (id, type) VALUES (2001, 2);
INSERT INTO community_users (community_id, user_id) VALUES (2001, 1001), (2001, 1002);

INSERT INTO requests (id, status, deadline, requester_id, helper_id) VALUES (3001, 2, '2023-07-09', 1001, 1002);

INSERT INTO articles (id, request_id, name, brand, pack, price, eans, amount) VALUES (4001, 3001, 'AprèsSunLotion', 'Cien', '500 ml', 0.99, '9405803997280,1706351938007', 2);