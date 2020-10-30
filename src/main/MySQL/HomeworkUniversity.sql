--5 inserts
INSERT INTO Student (id, name, phone, address) VALUES(01, “John”, “123456”, “Street 123”);
INSERT INTO Teacher(id, name, department_id, phone_number, email) VALUES(01, “Marc”, “02”, “123”, “marc@marc.com”);
INSERT INTO Building(id, name, location, creation_date) VALUES(3, “Maths”, “North”, TO_DATE('17/12/2015', 'DD/MM/YYYY'));
INSERT INTO Room(id, number, capacity, building_id) VALUES(01, 6, 50, 3);
INSERT INTO Subject(id, name, hours, credits) VALUES(51, “Physics”, “70”, “5”);

--5 update
UPDATE Reservation SET finishing_date=GETDATE() WHERE start_date=TO_DATE('15/09/2020', 'DD/MM/YYYY');
UPDATE Mark SET mark='A' WHERE id=5;
UPDATE Room SET capacity=70 WHERE building_id=3;
UPDATE Subject SET name='History' WHERE id=51;
UPDATE Teacher SET email="marc@education.account.com" WHERE id=01;


--5 delete
DELETE FROM Student WHERE id=01;
DELETE FROM Teacher WHERE id=01;
DELETE FROM Building WHERE id=3;
DELETE FROM Room WHERE id=01;
DELETE FROM Subject WHERE id=01;

--Big select (all information from all tables)

SELECT *
FROM Reservation r 
LEFT JOIN Book b ON (r.book_id=b.id)
LEFT JOIN Library l ON (b.library_id=l.id)
LEFT JOIN Student st ON(st.id=Reservation.student_id)
LEFT JOIN Study s ON (s.student_id=st.id)
LEFT JOIN Study_has_Mark shm ON(s.id=shm.study_id)
LEFT JOIN Mark m ON(m.id=shm.mark_id)
LEFT JOIN Teach t ON (s.teach:id=t.id)
LEFT JOIN Teacher te ON (t.teacher_id=te.id)
LEFT JOIN Subject su ON(su.id=t.subject_id)
LEFT JOIN ReservationRoom rr ON (rr.teacher_id=te.id)
LEFT JOIN Room ro ON (rr.room_id=ro.id)
LEFT JOIN Building bu ON(bu.id= ro.building_id)
LEFT JOIN Department d ON(d.id=te.department_id)


--7 with having


--teachers that teach more than 4 subjects.
SELECT t.teacher_id, COUNT(t.subject_id)
FROM Teach t
INNER JOIN Subject s ON(t.subject_id=s.id)
GROUP BY t.teacher_id
HAVING COUNT(t.subject_id)>4;

--all buildings with more than 5 rooms 
SELECT b.id
FROM building b 
INNER JOIN Room r ON (r.building_id=b.id)
GROUP BY b.id
HAVING COUNT(r.id)>5;

--all students that have been studied more than 3 subjects.
SELECT student_id, COUNT (*)
FROM Study 
GROUP BY student_id
HAVING COUNT(teach_subject_id)>3;

--books that have been reservated more than 2 times
SELECT book_id
FROM Reservation
GROUP BY book_id
HAVING COUNT(id)>2;


-- departments with more than 10 teachers
SELECT d.id
FROM Department d 
INNER JOIN Teacher t ON (d.id = t.department_id)
GROUP BY d.id
HAVING COUNT(t.id)>10

--Rooms with less than 5 reservations 
SELECT id
FROM ReservationRoom 
GROUP BY room_id
HAVING COUNT(id)<5;

--libraries with 356 books
SELECT id
FROM Book
GROUP BY library_id
HAVING COUNT(id)=356;



--3 with group by 
SELECT shm.student_id, AVG(*) AS "Average"
FROM Study_has_Mark shm 
INNER JOIN Mark m
ON (m.id=shm.mark_id)
GROUP BY shm.student_id

SELECT d.id, COUNT(t.id)
FROM Department d 
INNER JOIN Teacher t ON (d.id = t.department_id)
GROUP BY d.id;

SELECT t.teacher_id, COUNT(t.subject_id)
FROM Teach t
INNER JOIN Subject s ON(t.subject_id=s.id)
GROUP BY t.teacher_id

--3 without group by
SELECT shm.student_id, AVG(*) AS "Average"
FROM Study_has_Mark shm 
INNER JOIN Mark m
ON (m.id=shm.mark_id)

SELECT d.id, COUNT(t.id)
FROM Department d 
INNER JOIN Teacher t ON (d.id = t.department_id)

SELECT t.teacher_id, COUNT(t.subject_id)
FROM Teach t
INNER JOIN Subject s ON(t.subject_id=s.id)