package com.bignerdranch.android.geoquiz_challenge

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)