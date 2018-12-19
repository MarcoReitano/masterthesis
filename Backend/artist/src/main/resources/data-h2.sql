-- INSERT INTO genre ('id', 'name') VALUES
--   ('1cbaffc19fdc4721a26201bb6270a1c3', 'Pop'),
--   ('1737e4a2b3884c9d8992c6f77a9e42b5', 'Rock'),
--   ('78af618d345940c1a610d84646e58e6c', 'Punk');

INSERT INTO artist (id, alias, genre) VALUES
  (random_uuid(), 'Michael Jackson', 'Pop'),
  (random_uuid(), 'Foo Fighters', 'Rock'),
  (random_uuid(), 'Greenday', 'Punk');

