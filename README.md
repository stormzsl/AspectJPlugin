###### AspectJPlugin
```text
AspectJ实现统计耗时，异常处理，日志统计等
```

###### 查看工程中各module执行的task耗时命令:
```text
./gradlew assembleDebug --profile，会在build/reports/profile生出相应的时间统计数据
```

###### 查看project中指定module的第三方库的依赖详情:
```text
./gradlew app:dependencies
```
####### 参考(Aspectj使用)[https://blog.csdn.net/zlmrche/article/details/79643801]
