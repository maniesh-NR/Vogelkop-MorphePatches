package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class bc1 implements u5n {
    public final ViewConfiguration a;

    public bc1(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.u5n
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.u5n
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.u5n
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return g8.v(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.u5n
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.u5n
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.u5n
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return g8.u(this.a);
        }
        return 16.0f;
    }
}
