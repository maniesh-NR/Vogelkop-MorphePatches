package com.opera.android.webapps;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class WebappsIconUtils {
    @NonNull
    public static Bitmap createHomeScreenIconFromWebIcon(@NonNull Bitmap bitmap, boolean z) {
        int iMin = Math.min(Math.round(((ActivityManager) t8.a.getSystemService("activity")).getLauncherLargeIconSize() * 1.25f), Math.max(bitmap.getWidth(), bitmap.getHeight()));
        int iRound = 0;
        Rect rect = new Rect(0, 0, iMin, iMin);
        if (z) {
            iRound = Math.round(iMin * 0.15454549f);
        } else {
            int width = bitmap.getWidth() - 1;
            int height = bitmap.getHeight() - 1;
            if (Color.alpha(bitmap.getPixel(0, 0)) != 0 && Color.alpha(bitmap.getPixel(width, height)) != 0 && Color.alpha(bitmap.getPixel(0, height)) != 0 && Color.alpha(bitmap.getPixel(width, 0)) != 0) {
                iRound = Math.round(iMin * 0.045454547f);
            }
        }
        int i = (iRound << 1) + iMin;
        rect.offset(iRound, iRound);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    @NonNull
    public static int[] getIconSizes() throws Resources.NotFoundException {
        Context context = t8.a;
        int iRound = Math.round(context.getResources().getDimension(2131167805));
        float dimension = context.getResources().getDimension(2131167805);
        float f = context.getResources().getDisplayMetrics().density;
        return new int[]{iRound, Math.round((f - 1.0f) * (dimension / f)), Math.round(context.getResources().getDimension(2131167804))};
    }
}
