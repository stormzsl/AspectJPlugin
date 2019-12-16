###### gradle实用命令:
```text
1.查看工程中各module执行的task耗时命令: ./gradlew assembleDebug --profile，会在build/reports/profile生出相应的时间统计数据。

2.查看project中指定module的第三方库的依赖详情: ./gradlew app:dependencies
```
![AOP三剑客](https://mmbiz.qpic.cn/mmbiz_jpg/v1LbPPWiaSt7XibQFuzOXRHCCaUKrhQo2fXO1bUFEj50LzhLHibgf36wfJfGhSdSuMibIt24CiabGOCr0AvY8Sye4Ig/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

###### AspectJPlugin是一个实现统计耗时，异常处理的工程项目
```text
AspectJ实现统计耗时，异常处理，日志统计等,[Aspectj使用](https://blog.csdn.net/zlmrche/article/details/79643801)
```
###### AspectJ的使用步骤:
```text
1.在根工程的build.gradle中添加AspectJ依赖插件: classpath 'com.hujiang.aspectjx:gradle-android-plugin-aspectjx:2.0.0'

2.在主工程app或者subProject中添加插件依赖:apply plugin: 'android-aspectjx'

3.在主工程app或者subProject中添加dependency依赖:implementation 'org.aspectj:aspectjrt:1.8.9'
```

