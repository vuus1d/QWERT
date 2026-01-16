CREATE TABLE bus (
                     id SERIAL PRIMARY KEY,
                     route_number INT NOT NULL,
                     capacity INT NOT NULL
);

CREATE TABLE commuter (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(100),
                          ticket_balance DOUBLE PRECISION
);
