# geekbang-lessons
极客时间课程工程

# 第一周作业
[作业文档链接] https://github.com/summer853300975/geekbang-lessons/blob/master/README.md
## 作业要求
通过自研 Web MVC 框架实现（可以自己实现）一个用户注册，forward 到一个成功的页面（JSP 用法）/register
通过 Controller -> Service -> Repository 实现（数据库实现）
（非必须）JDNI 的方式获取数据库源（DataSource），在获取 Connection

## 作业运行测试
### 进入user-platform目录
```
cd user-platform
mvn clean package -U
java -jar user-web/target/user-web-v1-SNAPSHOT-war-exec.jar
```

## 作业心得记录

### Mac配置derby数据库
https://blog.csdn.net/as403045314/article/details/101337337