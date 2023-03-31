package com.example.lesson2

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.core.content.withStyledAttributes
import com.example.lesson2.databinding.ViewProfileCardBinding
import com.google.android.material.card.MaterialCardView

class ViewProfile @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defAttributeSet: Int = 0,
) : MaterialCardView(context, attributeSet, defAttributeSet){

    private lateinit var binding: ViewProfileCardBinding

    init{
        binding = ViewProfileCardBinding.inflate(
            LayoutInflater.from(context),
            this,
            true
        )

        context.withStyledAttributes(
            attributeSet,
            R.styleable.ViewProfile,
            defAttributeSet,
            defStyleRes = 0
        ){
            getString(R.styleable.ViewProfile_userName)?.let { userName ->
                binding.userName.text = userName
            }
            getString(R.styleable.ViewProfile_userStatus)?.let { userStatus ->
                binding.userStatus.text = userStatus
            }
            getInt(R.styleable.ViewProfile_IMGNum, 0).let { IMGNum ->
                binding.countIMG.text = IMGNum.toString()
            }
            getInt(R.styleable.ViewProfile_subsNum, 0).let { subsNum ->
                binding.countSubs.text = subsNum.toString()
            }
            getInt(R.styleable.ViewProfile_postsNum, 0).let { postsNum ->
                binding.countPost.text = postsNum.toString()
            }
            getColor(R.styleable.ViewProfile_btnColor, 0x6750A4.toInt()).let { btnColor ->
                binding.btnSubscribe.setBackgroundColor(btnColor)

            }
        }
    }

    fun setUserName(text: String){
        binding.userName.text = text
    }

    fun setUserStatus(text: String){
        binding.userStatus.text = text
    }

    fun setIMGNum(num: Int){
        binding.countIMG.text = num.toString()
    }

    fun setSubsNum(num: Int){
        binding.countSubs.text = num.toString()
    }

    fun setPostsNum(num: Int){
        binding.countPost.text = num.toString()
    }

    fun setBtnColor(@ColorRes color: Int){
        binding.btnSubscribe.setBackgroundColor(
            ContextCompat.getColor(context, color)
        )
    }

}