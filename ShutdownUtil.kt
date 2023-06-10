import android.content.Context
import android.os.PowerManager

class ShutdownUtil(private val context: Context) {
    fun shutdown() {
        val powerManager = context.getSystemService(Context.POWER_SERVICE) as PowerManager
        powerManager.shutdown(true)
    }
}
