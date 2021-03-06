# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

#修改包名的时候  也要一起修改  否则生产包闪退
##################net bean###############
-keepclassmembernames class com.chen.baseextend.bean.**{*;}

-keep public class com.alibaba.android.arouter.routes.**{*;}

-keepclassmembernames class * extends com.chen.basemodule.allroot.RootBean{*;}
-keepclassmembernames class * extends com.chen.basemodule.allroot.RootRequest{*;}
-keepclassmembernames class * extends com.chen.basemodule.allroot.RootResponse{*;}

