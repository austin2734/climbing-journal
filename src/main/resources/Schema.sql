CREATE TABLE IF NOT EXISTS Entry (
    id INTEGER AUTO_INCREMENT,
    route_name varchar(50) NOT NULL,
    route_grade varchar(5),
    pitches INTEGER,
    attempts INTEGER,
    status varchar(9),
    notes varchar(500),
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    primary key(id)
);


