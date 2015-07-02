# BaiduVoiceHelper
可在Android Studio上直接使用的Baidu Voice SDK aar版本。
# About
百度官方目前开放的android sdk，是jar+so+res文件的形式，还没有提供可直接用于android studio的aar版本<br>
如果要调用Baidu Voice的默认语音识别控件，需要自己手动合并他提供的res，并在Androidmanifest.xml添加permission和activity以及service声明，稍有点繁琐，这里就是将他们集中起来，直接调用一个接口就可以使用默认语音识别控件。<br>
当然，如果你是自己开发界面，则也可以直接参照Baidu提供的开发文档使用API进行开发，毕竟Baidu提供的默认控件上有baidu logo。<br>
本文提供的aar库，内部还是直接使用的Baidu官方提供的jar和so，仅仅是利用aar机制将res也一起打包进去，方便在android studio 中引用。至于demo也仅做了一点改动。
#Usage
```java
TODO, use via grdle
```

