package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class wr8 implements acl {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ yr8 e;

    public wr8(yr8 yr8Var, boolean z, boolean z2, String str, int i) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = i;
        this.e = yr8Var;
    }

    public final void a(Exception exc, Drawable drawable) {
        yr8 yr8Var = this.e;
        xr8 xr8Var = yr8Var.b;
        if (!this.a) {
            yr8Var.d(null);
            return;
        }
        boolean zC = xr8Var.c();
        boolean z = this.b;
        if (zC) {
            yr8Var.g(z);
        }
        xr8Var.h();
        yr8Var.b(this.d, this.c, z, false);
    }

    public final void b(Drawable drawable) {
    }

    public final void c(Bitmap bitmap, int i) {
        this.e.d(bitmap);
    }
}
