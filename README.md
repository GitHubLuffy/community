##码匠社区

##资料
[spring 文档](https://spring.io/guides)
https://spring.io/guides/gs/serving-web-content/
https://elasticsearch.cn/explore
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/)

[Spring官方文档]()
##工具
https://git-scm.com/download

##脚本
```sql
create table user
(
	id int auto_increment,
	account_id varchar(100),
	name varchar(50),
	token char(36),
	gmt_create bigint,
	gmt_modified bigint,
	constraint user_pk
		primary key (id)
);
```