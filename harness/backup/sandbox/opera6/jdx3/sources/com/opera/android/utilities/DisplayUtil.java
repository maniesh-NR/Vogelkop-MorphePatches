package com.opera.android.utilities;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class DisplayUtil {
    public static final Object a = new Object();
    public static Display b;
    public static DisplayMetrics c;
    public static int d;
    public static float e;
    public static float f;
    public static int g;

    public static boolean a(Context context) {
        f(context);
        return d(context, f);
    }

    public static int b(Context context) {
        f(context);
        return b.getHeight();
    }

    public static int c(Context context) {
        f(context);
        return b.getWidth();
    }

    public static boolean d(Context context, float f2) {
        int i = g;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return e >= f2 && Math.min(c(context), b(context)) >= 600;
                }
                return true;
            }
            if (e >= f2) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Context context) {
        f(context);
        return d(context, 5.8f);
    }

    public static void f(Context context) {
        synchronized (a) {
            if (b != null) {
                return;
            }
            b = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            c = displayMetrics;
            b.getMetrics(displayMetrics);
            try {
                d = context.getResources().getInteger(2131492992);
            } catch (Resources.NotFoundException unused) {
                d = 240;
            }
            Display display = b;
            float width = display.getWidth() / c.xdpi;
            float height = display.getHeight() / c.ydpi;
            e = (float) Math.sqrt((height * height) + (width * width));
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(2131167645, typedValue, true);
            f = typedValue.getFloat();
            g = context.getResources().getConfiguration().screenLayout & 15;
        }
    }

    public static boolean isTabletFormFactor() {
        return t8.a.getResources().getInteger(2131492935) >= 2;
    }
}
