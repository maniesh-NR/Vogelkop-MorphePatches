package com.opera.android.tabui2;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.pde;
import defpackage.z61;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/opera/android/tabui2/ConfigurationProvidingFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public class ConfigurationProvidingFrameLayout extends FrameLayout {
    public boolean a;
    public final pde b;
    public final pde c;
    public final pde d;
    public final m9f e;

    public ConfigurationProvidingFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new pde(getResources().getConfiguration());
        this.c = new pde(new Size(getWidth(), getHeight()));
        this.d = new pde(0);
        this.e = new m9f(this);
        addOnAttachStateChangeListener(new z61(this, (byte) 5));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.r(configuration);
        this.e.h();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        xf8.F0(this.c, new Size(i, i2));
        xf8.F0(this.d, Integer.valueOf(this.e.e()));
    }
}
