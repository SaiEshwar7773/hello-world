CREATE TABLE Donor_Details(
Donor_Id VARCHAR2(20),
Donor_Name VARCHAR2(20),
Address VARCHAR2(20),
Phone_Number VARCHAR2(20),
Donor_Date DATE,
Donor_Amount NUMBER);

CREATE SEQUENCE donorId_sequence
START WITH 1000;




 create sequence s
 start with 1001
 increment by 1
 minvalue 1001
 maxvalue 9999
 nocycle;
 
create table donor (donarId number primary key, name varchar2(20) ,address varchar2(20) ,phone_number number(10) ,donor_date date ,donor_amount number);


create TABLE cab_request(request_id number, customer_name varchar2(20),phone_number varchar2(10), date_of_request
date, request_status varchar2(12), cab_number varchar2(15),address_of_pickup varchar2(50),pincode varchar2(6));


create sequence seq_request_id
start with 1001;