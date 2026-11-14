package com.opera.android.webapps;

import J.N;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.opera.android.browser.BrowserUtils;
import defpackage.a9i;
import defpackage.dx3;
import defpackage.is6;
import defpackage.lhj;
import defpackage.m5h;
import defpackage.nml;
import defpackage.rn9;
import defpackage.umi;
import java.io.ByteArrayOutputStream;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ShortcutHelper {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(final dx3 dx3Var, umi umiVar, String str, final Uri uri, final boolean z, final Bitmap bitmap, boolean z2, final int i, final int i2, final long j, final long j2, final String str2, final String str3) {
        if (!m5h.q()) {
            m5h.B(dx3Var, str);
            return;
        }
        nml nmlVarB = umiVar.b(new esk() { // from class: khj
            public final Object get() {
                Intent intent;
                Uri uri2 = uri;
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    intent = new Intent();
                    intent.setAction("com.opera.android.ACTION_START_WEBAPP");
                    intent.putExtra("org.chromium.content_public.common.orientation", i);
                    intent.putExtra("org.opera.browser.webapp_display_mode", i2);
                    intent.putExtra("com.opera.android.webapp.extra_id", UUID.randomUUID().toString());
                    intent.putExtra("org.opera.browser.webapp_icon", strEncodeToString);
                    intent.putExtra("org.opera.browser.webapp_short_name", str2);
                    intent.putExtra("org.opera.browser.webapp_name", str3);
                    intent.putExtra("org.opera.browser.webapp_url", uri2.toString());
                    intent.putExtra("org.opera.browser.background_color", j);
                    intent.putExtra("org.opera.browser.theme_color", j2);
                    byte[] bArrE = w7d.E(uri2.toString(), strEncodeToString);
                    if (bArrE == null) {
                        return null;
                    }
                    intent.putExtra("org.opera.browser.webapp_mac", Base64.encodeToString(bArrE, 2));
                } else {
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(BrowserUtils.getExternalUrlWithFallback(uri2.toString())));
                }
                intent.putExtra("org.opera.browser.webapp_source", "com.opera.browser.WEBAPP");
                intent.setPackage(dx3Var.getPackageName());
                return intent;
            }
        });
        nmlVarB.b(umiVar.f(new is6((Object) dx3Var, (Object) str, (Object) bitmap, z2, (byte) 3)));
        nmlVarB.a(null);
    }

    public static Bitmap b(dx3 dx3Var, Bitmap bitmap, String str, int i, int i2) {
        int launcherLargeIconSize = ((ActivityManager) dx3Var.getSystemService("activity")).getLauncherLargeIconSize();
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (bitmap == null || bitmap.getWidth() < launcherLargeIconSize / 2 || bitmap.getHeight() < launcherLargeIconSize / 2) {
                    float launcherLargeIconDensity = r0.getLauncherLargeIconDensity() / 160.0f;
                    int i3 = (int) (40.0f * launcherLargeIconDensity);
                    int i4 = (int) (launcherLargeIconDensity * 2.0f);
                    int i5 = (int) (launcherLargeIconDensity * 16.0f);
                    if (!TextUtils.isEmpty(str)) {
                        Bitmap bitmapA = new a9i(i3, i3, i4, i, i2, i5).a(str);
                        Rect rect = new Rect(0, 0, canvas.getWidth(), canvas.getHeight());
                        canvas.drawBitmap(bitmapA, rect.exactCenterX() - (bitmapA.getWidth() / 2.0f), rect.exactCenterY() - (bitmapA.getHeight() / 2.0f), (Paint) null);
                    }
                } else {
                    d(bitmap, canvas, 1.0f);
                    m5h.z(dx3Var, canvas);
                }
                canvas.setBitmap(null);
                return bitmapCreateBitmap;
            } catch (OutOfMemoryError unused) {
                return bitmapCreateBitmap;
            }
        } catch (OutOfMemoryError unused2) {
            return null;
        }
    }

    public static Bitmap c(int i, int i2, Context context, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float f = i;
        if (Math.min(bitmap.getWidth(), bitmap.getHeight()) / ((int) (f / context.getApplicationContext().getResources().getDisplayMetrics().density)) < 0.6f) {
            return null;
        }
        float f2 = (((float) Math.max(bitmap.getWidth(), bitmap.getHeight())) * 1.25f) / ((float) ((int) (f / context.getApplicationContext().getResources().getDisplayMetrics().density))) < 1.0f ? 0.75f : 1.0f;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            try {
                if (f2 < 1.0f) {
                    e(bitmapCreateBitmap, bitmap, i2);
                } else {
                    f2 = f(bitmapCreateBitmap, bitmap, i2);
                }
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                d(bitmap, canvas, f2);
                canvas.setBitmap(null);
                return bitmapCreateBitmap;
            } catch (OutOfMemoryError unused) {
                return bitmapCreateBitmap;
            }
        } catch (OutOfMemoryError unused2) {
            return null;
        }
    }

    public static void d(Bitmap bitmap, Canvas canvas, float f) {
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        float width = (canvas.getWidth() * f) - canvas.getWidth();
        float height = (canvas.getHeight() * f) - canvas.getHeight();
        RectF rectF = new RectF(-width, -height, canvas.getWidth() + width, canvas.getHeight() + height);
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        int iSave = canvas.save();
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        canvas.drawBitmap(bitmapCopy, rect, rectF, paint);
        if (bitmapCopy != bitmap) {
            bitmapCopy.recycle();
        }
        canvas.restoreToCount(iSave);
    }

    public static void e(Bitmap bitmap, Bitmap bitmap2, int i) {
        if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
            lhj lhjVar = new lhj();
            N.MKfuIv9y(bitmap2, lhjVar);
            if (lhjVar.c < 0.73f) {
                bitmap.eraseColor(-1);
                return;
            }
        }
        rn9 rn9Var = new rn9(bitmap2, 1);
        if (rn9Var.A() && rn9Var.z()) {
            bitmap.eraseColor(((int[]) rn9Var.c)[0]);
        } else {
            bitmap.eraseColor(i);
        }
    }

    public static float f(Bitmap bitmap, Bitmap bitmap2, int i) {
        lhj lhjVar = new lhj();
        N.MKfuIv9y(bitmap2, lhjVar);
        if (bitmap2.getConfig() != Bitmap.Config.RGB_565) {
            if (lhjVar.c < 0.73f) {
                bitmap.eraseColor(-1);
                return 1.0f;
            }
            if (lhjVar.b > 1) {
                rn9 rn9Var = new rn9(bitmap2, 1);
                int[] iArr = (int[]) rn9Var.c;
                if (lhjVar.c == 1.0f && rn9Var.z()) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr2 = (int[]) rn9Var.d;
                        if (i2 >= iArr2.length) {
                            break;
                        }
                        if (!rn9.h(iArr2[i2], iArr[0])) {
                            bitmap.eraseColor(iArr[0]);
                            return 0.85f;
                        }
                        i2++;
                    }
                }
                if (rn9Var.b && rn9Var.A()) {
                    if (!rn9Var.z()) {
                        return 1.05f;
                    }
                    bitmap.eraseColor(iArr[0]);
                    return 1.0f;
                }
                if (lhjVar.c < 1.0f && Color.alpha(lhjVar.a) == 255) {
                    bitmap.eraseColor(lhjVar.a);
                    return 1.0f;
                }
                if (lhjVar.c < 1.0f) {
                    bitmap.eraseColor(i);
                }
            }
        }
        return 1.0f;
    }

    public static void setColorInfo(@NonNull Object obj, int i, int i2, float f) {
        lhj lhjVar = (lhj) obj;
        lhjVar.a = i;
        lhjVar.b = i2;
        lhjVar.c = f;
    }
}
