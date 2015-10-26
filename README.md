# BaiduVoiceHelper
可在Android Studio上直接使用的Baidu Voice SDK aar版本。对应Baidu Voice SDK版本为 `2.0.1` <br>
百度语音官方地址: [http://yuyin.baidu.com/](http://yuyin.baidu.com/)
# About
  百度官方目前开放的android sdk，是jar+so+res文件的形式，还没有提供可直接用于android studio的aar版本<br>
如果要调用Baidu Voice的默认语音识别控件，需要自己手动合并他提供的res，并在Androidmanifest.xml添加permission和activity以及service声明，稍有点繁琐，而且，将这些资源文件合到自己的项目里，跟项目自身res文件混在一起，多少有些凌乱。另外调用默认控件的时候，居然必须得设置sound文件，一长串。所以就想着把他们集中起来，直接使用一个库就可以使用默认语音识别控件。<br>
当然，如果你是自己开发界面，则也可以直接参照Baidu提供的开发文档使用API进行开发，毕竟Baidu提供的默认控件上有baidu logo。<br>
    本文提供的aar库，内部还是直接使用的Baidu官方提供的jar和so，仅仅是利用aar机制将res也一起打包进去，方便在android studio 中引用。demo代码基本都来自Baidu demo，版权请参考官方网站。相信官方之后也会出aar库的。
#Usage
## 1.引入库
### 1.1 引用本地aar
首先将[baduvoicehelper-0.2.0.aar](https://github.com/dxjia/BaiduVoiceHelper/raw/master/baduvoicehelper-0.2.0.aar)下载到本地，放入自己的app下的libs目录里；<br>
然后app下的build.gradle里依照下面的方式添加依赖:<br>
```java
repositories {
    flatDir {
        dirs 'libs'
    }
}

dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile(name: 'baduvoicehelper-0.2.0', ext: 'aar')
}
```
grdle sync之后就可以使用啦
### 1.2 通过jcenter
第二种方式是通过jcenter，该库已上传到jcenter，在app下的gradle下添加依赖即可使用：
```java
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.dxjia.baiduvoicehelper:library:0.2.0'
}
```
## 2. 使用
### 2.1 调用默认控件
```java
import com.dxjia.library.BaiduVoiceHelper;


private static final String BAI_DU_DEMO_APIKEY = "8MAxI5o7VjKSZOKeBzS4XtxO";
private static final String BAI_DU_DEMO_SECRET = "Ge5GXVdGQpaxOmLzc8fOM8309ATCz9Ha";

private static final int REQUEST_UI = 1;

BaiduVoiceHelper.startBaiduVoiceDialogForResult(ApiActivity.this,
                    BAI_DU_DEMO_APIKEY, BAI_DU_DEMO_SECRET, REQUEST_UI);

```
<br>
如果你有自己的参数需要设置，使用下面的方式：
```java
Intent intent = new Intent();
intent.putExtra(***, ***);
intent.putExtra(***, ***);

BaiduVoiceHelper.startBaiduVoiceDialogForResult(ApiActivity.this,
                    BAI_DU_DEMO_APIKEY, BAI_DU_DEMO_SECRET, intent, REQUEST_UI);
```
效果图：<br>
![Img](https://github.com/dxjia/BaiduVoiceHelper/blob/master/Screenshot.jpeg)
### 2.2 使用API方式
这种方式请直接参考官方文档：[http://yuyin.baidu.com/docs/asr/88](http://yuyin.baidu.com/docs/asr/88)<br>
