package com.rifsxd.ksunext.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography as MaterialTypography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val SystemFont = FontFamily.Default

// HyperOS/MIUIX-like rhythm: tighter tracking, softer hierarchy and large rounded containers.
val Typography = MaterialTypography(
    displayLarge = TextStyle(SystemFont, FontWeight.SemiBold, 40.sp, 46.sp, 0.sp),
    displayMedium = TextStyle(SystemFont, FontWeight.SemiBold, 36.sp, 42.sp, 0.sp),
    displaySmall = TextStyle(SystemFont, FontWeight.SemiBold, 32.sp, 38.sp, 0.sp),
    headlineLarge = TextStyle(SystemFont, FontWeight.SemiBold, 30.sp, 36.sp, 0.sp),
    headlineMedium = TextStyle(SystemFont, FontWeight.SemiBold, 26.sp, 32.sp, 0.sp),
    headlineSmall = TextStyle(SystemFont, FontWeight.SemiBold, 22.sp, 28.sp, 0.sp),
    titleLarge = TextStyle(SystemFont, FontWeight.SemiBold, 20.sp, 26.sp, 0.sp),
    titleMedium = TextStyle(SystemFont, FontWeight.Medium, 17.sp, 22.sp, 0.sp),
    titleSmall = TextStyle(SystemFont, FontWeight.Medium, 15.sp, 20.sp, 0.sp),
    bodyLarge = TextStyle(SystemFont, FontWeight.Normal, 16.sp, 22.sp, 0.sp),
    bodyMedium = TextStyle(SystemFont, FontWeight.Normal, 14.sp, 20.sp, 0.sp),
    bodySmall = TextStyle(SystemFont, FontWeight.Normal, 13.sp, 18.sp, 0.sp),
    labelLarge = TextStyle(SystemFont, FontWeight.Medium, 14.sp, 18.sp, 0.sp),
    labelMedium = TextStyle(SystemFont, FontWeight.Medium, 12.sp, 16.sp, 0.sp),
    labelSmall = TextStyle(SystemFont, FontWeight.Medium, 11.sp, 14.sp, 0.sp),
)

val HyperShapes = Shapes(
    extraSmall = RoundedCornerShape(10.dp),
    small = RoundedCornerShape(14.dp),
    medium = RoundedCornerShape(18.dp),
    large = RoundedCornerShape(24.dp),
    extraLarge = RoundedCornerShape(30.dp),
)
