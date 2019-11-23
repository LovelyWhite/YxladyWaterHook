# YxladyWaterHook
荣钧健康饮水去广告插件

## 简介

```txt
本软件基于Xposed：82 框架编写，主要功能为跳过荣钧健康饮水软件的
广告。
```

## 主要工作原理

```txt
com.yxlady.water.ui.activity.EntryActivity为该程序的默认Activity，
在该Activity执行的onCreate方法中调用了字节跳动公司提供的广告SDK并
加载了一些广告。通过Hook并replace其中的k方法，我们可以实现跳过广告
直接进入startActivty。
```

## 使用方法

1. 安装并激活Xposed或者类似的软件,比如 EdXposedManager
   注意 Xposed 9.0以上系统无法使用，推荐EdXposed

2. 安装本软件 YxladyWaterHook

3. 添加荣均健康饮水软件进入应用列表

4. 开启荣钧去广告模块

5. 重启手机
