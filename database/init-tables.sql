
create database if not exists db_integral_audit;
use db_integral_audit;

create table if not exists tbl_audit (
	oid bigint not null auto_increment,
	service_name varchar(50),
	event_name varchar(50),
	payload text,
	event_timestamp datetime,
	primary key (oid)
)

create index idx_service_name on tbl_audit(service_name);
create index idx_service_name_event_timestamp on tbl_audit(service_name, event_timestamp);
create index idx_event_name_event_timestamp on  tbl_audit(event_name, event_timestamp);


