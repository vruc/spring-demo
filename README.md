

## 创建对象以及处理对象的依赖关系时相关的注解

| 注解 | |
| --- | --- |
| @ComponentScan | 扫描器 |
| @Configuration | 配置类 |
| @Component | 把一个对象加入IOC容器 |
| @Repository | 在持久层使用, 作用同@Component |
| @Service | 在业务逻辑层使用, 作用同@Component |
| @Controller | 在控制层使用, 作用同@Component |
| @Resource | 依赖关系|
| @AutoWired | 自动装配对象 |
|  | |

1. 如果@Resource不指定值，那么根据类型查找，相同的类型在IOC中不能有两个
1. 如果@Resource指定了值，那么根据名字来找  


## 其它的一些注解

| 注解 | |
| --- | --- |
| @Data | 为类的所有字段生成 Getter、Setter、toString、equals 方法  |
| @Entity | 标识类为数据库的表 |
| @Column | 标识列 |
| @Id | 主键列 |
| @GeneratedValue | 生成值，一般使用 **strategy = GenerationType.IDENTITY** |
| @SqlResultSetMapping | ????? |