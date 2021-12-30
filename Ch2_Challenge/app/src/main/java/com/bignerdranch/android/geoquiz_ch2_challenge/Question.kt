package com.bignerdranch.android.geoquiz_ch2_challenge

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)
