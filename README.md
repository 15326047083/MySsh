# MySsh
为期末项目做准备
1、数据库连接以及hibernate配置（jdbc.properties）
2、通用层可以直接继承使用，样例模仿user相关文件
3、本次项目完全分包实现：Repository（Dao）底层数据库操作方法实现，
	Repository实现中凡是涉及到数据库操作的，均需在方法上端加入@Transactional注解
	各实体类id均使用uuid使用方法：
		@Id
		@GeneratedValue(generator = "uuid")
		@GenericGenerator(name = "uuid", strategy = "uuid")
		private String id;
4、本次项目实体类均使用注解方式进行映射