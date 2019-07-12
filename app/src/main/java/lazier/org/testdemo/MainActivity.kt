package lazier.org.testdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import lazier.org.testdemo.R.id.left

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val TAG = "tag"
    }

    internal var startX = 0f
    internal var startY = 0f


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_dianji.setOnClickListener(this)

    }


    override fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.tv_dianji->{
                Toast.makeText(this,"你点击了点击按钮",Toast.LENGTH_SHORT).show()
            }

        }
    }
}
