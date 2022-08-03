INSERT INTO customer_type (customer_type_id,customer_type_name) VALUES
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');

INSERT INTO customer (customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address, status_delete) VALUES
("KH-001", 1, "Nguyễn Hoàng Hảo", "1999-10-10", 0, "201802281", "0978144014", "hao@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0),
("KH-002", 4, "Trần Văn Khánh", "1995-10-10", 0, "201802281", "0978144014", "khanh@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0),
("KH-003", 5, "Nguyễn Dương Trung Kiên", "1999-10-10", 0, "201802281", "0978144014", "kien@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0),
("KH-004", 2, "Trần Xuân Trường", "1998-10-10", 0, "201802281", "0978144014", "truong@gmail.com.vn", "1 Như Nguyệt, Đà Nẵng",0),
("KH-005", 3, "Nguyễn Bảo Long", "1998-10-10", 0, "201802281", "0978144014", "long@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0),
("KH-006", 1, "Nguyễn Hữu Toàn", "1999-10-10", 0, "201802281", "0978144014", "toan@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0),
("KH-007", 4, "Huỳnh Nhật Hoàng", "1995-10-10", 0, "201802281", "0978144014", "hoang@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0),
("KH-008", 5, "Nguyễn Đình Luân", "1999-10-10", 0, "201802281", "0978144014", "luan@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0),
("KH-009", 2, "Nguyễn Thiên Duy", "1998-10-10", 0, "201802281", "0978144014", "duy@gmail.com.vn", "1 Như Nguyệt, Đà Nẵng",0),
("KH-010", 3, "Huỳnh Kim Hiếu", "1998-10-10", 0, "201802281", "0978144014", "hieu@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0),
("KH-011", 1, "Trần Mạnh Cường", "1999-10-10", 0, "201802281", "0978144014", "cuong@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0),
("KH-012", 4, "Nguyễn Duy Trung", "1995-10-10", 0, "201802281", "0978144014", "trung@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0),
("KH-013", 5, "Nguyễn Quang Phúc", "1999-10-10", 0, "201802281", "0978144014", "phuc@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0),
("KH-014", 2, "Hồ Duy Tuấn", "1998-10-10", 0, "201802281", "0978144014", "tuan@gmail.com.vn", "1 Như Nguyệt, Đà Nẵng",0),
("KH-015", 3, "Hồ Văn Chung", "1998-10-10", 0, "201802281", "0978144014", "long@gmail.com.vn", "14-12 Hoà An, Đà Nẵng",0);

INSERT INTO education (education_id,education_name) VALUES
(1,'Intermediate'),
(2,'College'),
(3,'University'),
(4,'Postgraduate');

INSERT INTO position (position_id,position_name) VALUES
(1,'Receptionist'),
(2,'Serve'),
(3,'Expert'),
(4,'Supervision'),
(5,'Manage'),
(6,'Director');

INSERT INTO division (division_id,division_name) VALUES
(1,'Sales - Marketing'),
(2,'Administration'),
(3,'Service'),
(4,'Manage');

INSERT `role` (role_id, `name`) VALUES
(1, "ROLE_MEMBER"),
(2, "ROLE_ADMIN");

INSERT app_user (user_id, is_enable, password, user_name) VALUES
(1, 1, "$2a$12$O82Ky1qqYfaVnxw7voRXx.WznIOe6HFalz3xawnKZNWJcpY9yNYf6", "toan"),
(2, 1, "$2a$12$O82Ky1qqYfaVnxw7voRXx.WznIOe6HFalz3xawnKZNWJcpY9yNYf6", "admin");

INSERT user_role (user_id, role_id) VALUES
(1, 1),
(2, 2);


INSERT INTO employee (employee_id, employee_address, employee_birthday, employee_email, employee_id_card, employee_name, employee_phone, employee_salary, status_delete, division_id,education_id,position_id,user_name) VALUES
(1, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "hao@gmail.com.vn", "201802281", "Nguyễn Hoàng Hảo", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(2, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "khanh@gmail.com.vn", "201802281", "Trần Văn Khánh", "0978144014", 10000, 0, 2, 2, 3, "toan"),
(3, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "kien@gmail.com.vn", "201802281", "Nguyễn Dương Trung Kiên", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(4, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "truong@gmail.com.vn", "201802281", "Trần Xuân Trường", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(5, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "long@gmail.com.vn", "201802281", "Nguyễn Bảo Long", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(6, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "toan@gmail.com.vn", "201802281", "Nguyễn Hữu Toàn", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(7, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "hoang@gmail.com.vn", "201802281", "Huỳnh Nhật Hoàng", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(8, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "luan@gmail.com.vn", "201802281", "Nguyễn Đình Luân", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(9, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "duy@gmail.com.vn", "201802281", "Nguyễn Thiên Duy", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(10, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "hieu@gmail.com.vn", "201802281", "Huỳnh Kim Hiếu", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(11, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "cuong@gmail.com.vn", "201802281", "Trần Mạnh Cường", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(12, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "trung@gmail.com.vn", "201802281", "Nguyễn Duy Trung", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(13, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "phuc@gmail.com.vn", "201802281", "Nguyễn Quang Phúc", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(14, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "tuan@gmail.com.vn", "201802281", "Hồ Duy Tuấn", "0978144014", 10000, 0, 1, 2, 3, "toan"),
(15, "14-12 Hoà An, Đà Nẵng", "1999-10-10", "chung@gmail.com.vn", "201802281", "Hồ Văn Chung", "0978144014", 10000, 0, 1, 2, 3, "toan");

INSERT INTO rent_type (rent_type_id, rent_type) VALUES
(1,"hour"),
(2,"day"),
(3,"month");

INSERT INTO facility_type (service_type_id,`name`) VALUES
(1,"Villa"),
(2,"House"),
(3,"Room");

INSERT INTO facility (id, amount_customer, area, cost, `description`, floor, `name`, pool_area, standard_room, `status`, rent_type_id, service_type_id,free_service) VALUES
(1,10,100,1000,"House 1 floor", 2,"House Lion1", 0,"Vip",0,2,2,""),
(2,20,200,2000,"Villa 1 floor", 2,"Villa Eagle1", 10,"Vip",0,2,1,""),
(3,15,500,1500,"0", 0,"Room Alpha1", 0,"0",0,2,3,"Karaoke"),
(4,12,1000,1000,"Villa 2 floor", 2,"Villa Eagle2", 10,"Vip",0,2,1,""),
(5,15,200,1500,"Villa 3 floor", 2,"Villa Eagle3", 10,"Vip",0,2,1,""),
(6,20,150,2500,"0", 0,"Room Alpha2", 0,"0",0,2,3,"Karaoke"),
(7,15,120,2200,"House 2 floor", 2,"House Lion2",0,"Vip",0,2,2,""),
(8,10,200,2100,"Villa 2 floor", 2,"Villa Eagle3", 10,"Vip",0,2,1,""),
(9,12,300,2800,"Villa 5 floor", 2,"Villa Eagle5", 10,"Vip",0,2,1,""),
(10,15,500,1000,"House 3", 2,"House Lion3", 0,"Vip",0,2,2,"");

INSERT contract ( contract_id,contract_deposit,contract_end_date,contract_start_date,status_delete,customer_id,employee_id,id) VALUES
(1,500,"2022-10-10","2022-10-09",0,"KH-001",2,1),
(2,300,"2022-10-10","2022-10-09",0,"KH-002",2,2),
(3,200,"2022-10-10","2022-10-09",0,"KH-001",2,4),
(4,900,"2022-10-10","2022-10-09",0,"KH-003",2,5),
(5,800,"2022-10-10","2022-10-09",0,"KH-001",2,3),
(6,700,"2022-10-10","2022-10-09",0,"KH-004",2,7),
(7,400,"2022-10-10","2022-10-09",0,"KH-001",2,6),
(8,500,"2022-10-10","2022-10-09",0,"KH-005",2,8),
(9,200,"2022-10-10","2022-10-09",0,"KH-001",2,9),
(10,100,"2022-10-10","2022-10-09",0,"KH-007",2,10);

INSERT attach_service (attach_service_id, attach_service_cost, attach_service_name, attach_service_status, attach_service_unit) VALUES
(1,20,"massage","good","1 hour"),
(2,30,"drink","good","1 cogtail"),
(3,40,"vehicle","busy","1 car"),
(4,50,"food","normal","1 slot");

INSERT contract_detail (contract_detail_id, quantity, attach_service_id, contract_id) VALUES
(1, 5, 1, 1),
(2, 6, 2, 2),
(3, 3, 2, 2),
(4, 2, 3, 2),
(5, 3, 2, 4),
(6, 2, 3, 3),
(7, 7, 4, 5);

