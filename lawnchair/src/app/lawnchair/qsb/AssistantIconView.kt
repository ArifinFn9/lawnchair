package app.lawnchair.qsb

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.widget.ImageButton
import com.android.launcher3.R
import com.android.launcher3.qsb.QsbContainerView

@SuppressLint("AppCompatCustomView")
class AssistantIconView(context: Context, attrs: AttributeSet?) : ImageButton(context, attrs) {

    init {
        scaleType = ScaleType.FIT_CENTER
        setOnClickListener {
            val intent = Intent(Intent.ACTION_VOICE_COMMAND)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                .setPackage(QsbContainerView.getSearchWidgetPackageName(context))
            context.startActivity(intent)
        }
    }

    fun setIcon() {
        setImageResource(R.drawable.ic_mic_color)
    }
}
