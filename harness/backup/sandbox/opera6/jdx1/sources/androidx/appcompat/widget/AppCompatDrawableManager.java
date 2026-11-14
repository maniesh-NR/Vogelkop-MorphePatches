package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import defpackage.igi;

/* loaded from: classes.dex */
public final class AppCompatDrawableManager {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public static AppCompatDrawableManager b;
    private ResourceManagerInternal mResourceManager;

    public static synchronized AppCompatDrawableManager a() {
        if (b == null) {
            g();
        }
        return b;
    }

    public static synchronized PorterDuffColorFilter d(int i, PorterDuff.Mode mode) {
        return ResourceManagerInternal.e(i, mode);
    }

    public static synchronized void g() {
        if (b == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            b = appCompatDrawableManager;
            appCompatDrawableManager.mResourceManager = ResourceManagerInternal.b();
            ResourceManagerInternal resourceManagerInternal = b.mResourceManager;
            igi igiVar = new igi();
            synchronized (resourceManagerInternal) {
                resourceManagerInternal.c = igiVar;
            }
        }
    }

    public final synchronized Drawable b(int i, Context context) {
        return this.mResourceManager.c(i, context);
    }

    public final synchronized Drawable c(int i, Context context) {
        return this.mResourceManager.d(context, i, true);
    }

    public final synchronized ColorStateList e(int i, Context context) {
        return this.mResourceManager.f(i, context);
    }

    public final synchronized void f(Context context) {
        this.mResourceManager.g(context);
    }
}
