# 2017118104_android
第一次作业HelloWorldActivity：
    遇到的问题：暂无。
第二次作业HelloWorld：
    遇到的问题：1.出现错误：TAG 在 FragmentActivity 中是 private 访问控制；解决方法：少打了一行代码，在开头添加代码public static final  String TAG="MainActivity";
第三次作业ActivityTest：
    Android的启动模式默认为standard
    对原来的代码（文件位置:"ActivityTest\app\src\main\AndroidManifest.xml"）:
    
        <activity android:name=".PageC"></activity>
        <activity android:name=".PageB"/>
        <activity android:name=".PageA"/>
        <activity android:name=".MainActivity">
        
    进行修改，可以修改Android中的启动模式（以下以singleTask为例）：
    
        <activity android:name=".PageC"
            android:launchMode="singleTask"></activity>
        <activity android:name=".PageB"
            android:launchMode="singleTask"/>
        <activity android:name=".PageA"
            android:launchMode="singleTask"/>
        <activity android:name=".MainActivity"
                  android:launchMode="singleTask">
                  
每一个活动的android:launchMode都要修改。


第一次：将Android Studio中的项目同步上传到Github和Sourcetree；
第二次：点击实现活动的跳转；
第三次：活动的启动模式；
第四次：用隐式intent召唤浏览器、拨号、地图；
第五次：RecyclerView做UI界面实现增删查改；
第六次：线程；
第七次：Service的使用
