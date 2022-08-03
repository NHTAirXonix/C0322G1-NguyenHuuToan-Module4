create database bai_thi_module_4;

INSERT INTO question_type (question_type_id, question_type_name) VALUES
(1,"Học Tập"),
(2,"Giáo Vụ"),
(3,"Khác");

INSERT INTO question_content (question_content_id,answer, content, date_create, `status`, title, question_type_id) VALUES
(1,"A","Con chim có mấy cánh","2022-10-10" , "Chờ phản hồi", "Module 4", 1),
(2,"A","Con chim có mấy cánh","2022-10-10" , "Chờ phản hồi", "Module 2", 2),
(3,"A","Con chim có mấy cánh","2022-10-10" , "Chờ phản hồi", "Module 3", 3),
(4,"A","Con chim có mấy cánh","2022-10-10" , "Chờ phản hồi", "Module 1", 4),
(5,"A","Con chim có mấy cánh","2022-10-10" , "Chờ phản hồi", "Module 2", 2);