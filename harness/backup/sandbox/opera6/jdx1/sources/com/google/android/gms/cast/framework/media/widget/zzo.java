package com.google.android.gms.cast.framework.media.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.core.app.NotificationCompat;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.gms.cast.internal.Logger;
import defpackage.ab5;

/* loaded from: classes.dex */
public final class zzo {
    private static final Logger zza = new Logger("WidgetUtil");

    public static Bitmap zza(Context context, Bitmap bitmap, float f, float f2) {
        Logger logger = zza;
        logger.d("Begin blurring bitmap %s, original width = %d, original height = %d.", new Object[]{bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight())});
        int iRound = Math.round(bitmap.getWidth() * 0.25f);
        int iRound2 = Math.round(bitmap.getHeight() * 0.25f);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iRound, iRound2, false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, bitmapCreateScaledBitmap.getConfig());
        RenderScript renderScriptCreate = RenderScript.create(context);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, allocationCreateFromBitmap.getElement());
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.setRadius(7.5f);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmapCreateBitmap);
        renderScriptCreate.destroy();
        logger.d("End blurring bitmap %s, original width = %d, original height = %d.", new Object[]{bitmapCreateScaledBitmap, Integer.valueOf(iRound), Integer.valueOf(iRound2)});
        return bitmapCreateBitmap;
    }

    public static Drawable zzb(Context context, int i, int i2) {
        return zzd(context, i, i2, R.attr.colorForeground, 0);
    }

    public static Drawable zzc(Context context, int i, int i2) {
        return zzd(context, i, i2, 0, R.color.white);
    }

    private static Drawable zzd(Context context, int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        int color;
        ColorStateList colorStateList;
        Drawable drawableMutate = context.getResources().getDrawable(i2).mutate();
        drawableMutate.setTintMode(PorterDuff.Mode.SRC_IN);
        if (i != 0) {
            colorStateList = ResourcesCompat.a(context.getResources(), i, context.getTheme());
        } else {
            if (i3 != 0) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i3});
                color = typedArrayObtainStyledAttributes.getColor(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } else {
                color = context.getColor(i4);
            }
            colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{color, ab5.l(color, NotificationCompat.FLAG_HIGH_PRIORITY)});
        }
        drawableMutate.setTintList(colorStateList);
        return drawableMutate;
    }
}
