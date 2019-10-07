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
