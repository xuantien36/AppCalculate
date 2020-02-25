package com.example.appcalculate
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.muddzdev.styleabletoast.StyleableToast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigInteger

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        val sb = StringBuilder()
        var c = sb.toString()
        val e:Int
        when(v){
          btn_0-> {
           sb.append("0").toString()
              edt_1.setText(c,  TextView.BufferType.SPANNABLE)
              Log.d("TAG0", ""+c)
          }
            btn_1->  {
              sb.append("1")
                var c = sb.toString()
                edt_1.setText(c,  TextView.BufferType.SPANNABLE)
                Log.d("TAG1", ""+c)
            }
            btn_2->{
                sb.append("2")
                val c = sb.toString()
                edt_1.setText(c,  TextView.BufferType.SPANNABLE)
            }
           btn_3-> {
               sb.append("3")
               val c = sb.toString()
               edt_1.setText(c,  TextView.BufferType.SPANNABLE);
           }
           btn_4-> {
               sb.append("4")
               val c = sb.toString()
               edt_1.setText(c,  TextView.BufferType.SPANNABLE);
           }
           btn_5-> {
               sb.append("5")
               val c = sb.toString()
               edt_1.setText(c,  TextView.BufferType.SPANNABLE);
           }
           btn_6->{
               sb.append("6")
               val c = sb.toString()
               edt_1.setText(c,  TextView.BufferType.SPANNABLE);
           }
           btn_7->{
               sb.append("7")
               val c = sb.toString()
               edt_1.setText(c,  TextView.BufferType.SPANNABLE);
           }
           btn_8-> {
               sb.append("8")
               val c = sb.toString()
               edt_1.setText(c,  TextView.BufferType.SPANNABLE);
           }
           btn_9-> {
               sb.append("9")
               val c = sb.toString()
               edt_1.setText(c,  TextView.BufferType.SPANNABLE);
        }
        btn_clear -> {
            text_result.text = "0"
            edt_1.text.clear()
            edt_2.text.clear()
        }
            edt_1->{
                key.setVisibility(View.VISIBLE);
            }
        }
    }
    fun sum1(a: BigInteger, b: BigInteger): BigInteger {
        return a + b
    }

    fun sum2(a: BigInteger, b: BigInteger): BigInteger {
        return a - b
    }
    fun sum3(a: BigInteger, b: BigInteger): BigInteger {
        return a * b
    }
    fun sum4(a: BigInteger, b: BigInteger): BigInteger {

        return a / b
    }
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edt_1.setCursorVisible(false)
        edt_1.setFocusableInTouchMode(false)
        edt_1.setFocusable(false)
        edt_2.setCursorVisible(false);
        edt_2.setFocusableInTouchMode(false)
        edt_2.setFocusable(false)
        btn_0.setOnClickListener(this)
        btn_1.setOnClickListener(this)
        btn_2.setOnClickListener(this)
        btn_3.setOnClickListener(this)
        btn_4.setOnClickListener(this)
        btn_5.setOnClickListener(this)
        btn_6.setOnClickListener(this)
        btn_7.setOnClickListener(this)
        btn_8.setOnClickListener(this)
        btn_9.setOnClickListener(this)
        btn_clear.setOnClickListener(this)
        edt_1.setOnClickListener(this)
        btn_cong.setOnClickListener {
            if (edt_1.text.toString().isEmpty() || edt_2.text.toString().isEmpty()) {
                StyleableToast.makeText(this, "Yêu cầu điền đầy đủ thông tin", R.style.ColoredText)
                    .show()
            } else {
                text_result.text = sum1(
                    edt_1.text.toString().toBigInteger(),
                    edt_2.text.toString().toBigInteger()
                ).toString()
            }
            btn_tru.setOnClickListener {
                if (edt_1.text.toString().isEmpty() || edt_2.text.toString().isEmpty()) {
                    StyleableToast.makeText(
                        this,
                        "Yêu cầu điền đầy đủ thông tin",
                        R.style.ColoredText
                    ).show()
                } else {
                    text_result.text = sum2(
                        edt_1.text.toString().toBigInteger(),
                        edt_2.text.toString().toBigInteger()
                    ).toString()
                }
                btn_nhan.setOnClickListener {
                    if (edt_1.text.toString().isEmpty() || edt_2.text.toString().isEmpty()) {
                        StyleableToast.makeText(
                            this,
                            "Yêu cầu điền đầy đủ thông tin",
                            R.style.ColoredText
                        )
                            .show()
                    } else {
                        text_result.text = sum3(
                            edt_1.text.toString().toBigInteger(),
                            edt_2.text.toString().toBigInteger()
                        ).toString()
                    }
                    btn_chia.setOnClickListener {
                        if (edt_1.text.toString().isEmpty() || edt_2.text.toString().isEmpty()) {
                            StyleableToast.makeText(
                                this,
                                "Yêu cầu điền đầy đủ thông tin",
                                R.style.ColoredText
                            )
                                .show()

                        } else if (edt_2.text.toString().equals("0")) {
                            StyleableToast.makeText(
                                this,
                                "Phép tính không hợp lệ",
                                R.style.ColoredText
                            ).show()
                        } else {
                            text_result.text = sum4(
                                edt_1.text.toString().toBigInteger(),
                                edt_2.text.toString().toBigInteger()
                            ).toString()

                        }
                        btn_clear.setOnClickListener {

                        }
                    }

                }
            }
        }
    }
}
