##问答社区

##资料
[spring 文档](https://spring.io/guides)
[spring Web文档](https://spring.io/guides/gs/serving-web-content/)
[Spring Boot Reference Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
[该项目官方社区](https://elasticsearch.cn/explore)
[该项目官方视频](https://www.bilibili.com/video/av65117012?p=4)
[Bootstrap起步](https://v3.bootcss.com/getting-started/)
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/)
[flyway](https://flywaydb.org/getstarted/)
[Thymeleat](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)
[jquery的api](https://api.jquery.com/)
[Markdown 插件](http://editor.md.ipandao.com/)
[Markdown 语法官方解释文档](https://github.com/pandao/editor.md)
[UCloud上传操作官方文档](https://github.com/ucloud/ufile-sdk-java)

##工具
[git地址](https://git-scm.com/download)
[Visual Paradigm](https://www.visual-paradigm.com/tw/)
[lombok](https://projectlombok.org/)
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

```bash
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```