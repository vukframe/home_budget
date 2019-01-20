INSERT INTO category (parent, category_type, is_leaf, code, name, description, active)
VALUES (
 null,
 'ORGANISATIONAL',
 false,
 'HOME',
 'Home expenses',
 'Collection of home expenses',
 true);

INSERT INTO category (parent, category_type, is_leaf, code, name, description, active)
VALUES
((SELECT c.id FROM category c WHERE code = 'HOME'),
 'EXPENSE',
 true,
 'Electricity',
 'Home electricity bill',
 'Home electricity bill',
 true);