# Android-shutdown
Kotlin XML-安卓关机程序
<uses-permission android:name="android.permission.SHUTDOWN" /> 是在 AndroidManifest.xml 文件中声明的一个权限。该权限的名称是 "android.permission.SHUTDOWN"
<uses-permission>：这是一个标签，用于在 AndroidManifest.xml 文件中声明应用程序所需的权限。
android:name="android.permission.SHUTDOWN"：这是权限的名称，即 "android.permission.SHUTDOWN"。它表示应用程序需要执行关机操作的权限。
  import android.content.Context：导入Context类，它提供了对Android应用程序环境的访问。
import android.os.PowerManager：导入PowerManager类，它提供了控制设备电源的功能。
class ShutdownUtil(private val context: Context)：创建一个名为ShutdownUtil的类，它接受一个Context参数作为构造函数的参数。
fun shutdown()：在ShutdownUtil类中定义一个名为shutdown的函数，用于执行关机操作。
val powerManager = context.getSystemService(Context.POWER_SERVICE) as PowerManager：使用getSystemService()方法从Context获取系统服务，其中参数Context.POWER_SERVICE用于获取与电源管理相关的服务。然后将其转换为PowerManager对象并赋值给powerManager变量。
powerManager.shutdown(true)：调用PowerManager对象的shutdown()方法来执行关机操作。传递true参数表示关机时同时关闭所有正在运行的应用程序。
