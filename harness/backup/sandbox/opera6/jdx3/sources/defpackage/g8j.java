package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g8j implements d8j {
    public final BrowserActivity a;
    public final gjm b;
    public final du3 c;
    public final Lazy d;
    public final du3 e;

    public g8j(BrowserActivity browserActivity, gjm gjmVar, du3 du3Var, Lazy lazy, du3 du3Var2) {
        this.a = browserActivity;
        this.b = gjmVar;
        this.c = du3Var;
        this.d = lazy;
        this.e = du3Var2;
    }

    public final void a(int... iArr) {
        this.b.e(new j9(new oba(2, 0, iArr)), false);
    }

    public final void b(int... iArr) {
        this.b.e(new ku1(new oba(2, 0, iArr)), false);
    }

    public final void c(int... iArr) {
        this.b.e(new ic2(new oba(2, 0, iArr)), false);
    }

    public final void d(int... iArr) {
        this.b.e(new dy3(new oba(2, 0, iArr)), false);
    }

    public final void e(int... iArr) {
        this.b.e(new b29(new oba(2, 0, iArr)), false);
    }

    public final void f(int... iArr) {
        this.b.e(new fcg(new oba(2, 0, iArr)), false);
    }

    public final void g(int... iArr) {
        this.b.e(new hsi(new oba(2, 0, iArr)), false);
    }

    public final void h() {
        this.b.e(new t8j(), false);
    }

    public final void i(int... iArr) {
        Bundle bundle = new Bundle();
        Bundle bundleN = s16.n(iArr);
        if (bundleN != null) {
            bundle.putAll(bundleN);
        }
        new zhj(new wzg(null, szj.class, (byte) 4), bundle, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(this.a);
    }

    public final void j(c8j c8jVar, int... iArr) {
        this.b.e(new m7k(c8jVar, new oba(2, 0, iArr)), false);
    }

    public final void k() {
        Intent intentAddFlags = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456);
        fp1 fp1Var = this.a;
        fp1Var.startActivity(intentAddFlags.putExtra("android.provider.extra.APP_PACKAGE", fp1Var.getApplicationContext().getPackageName()));
    }

    public final void l(Class cls, Bundle bundle) {
        new zhj(new wzg(null, cls, (byte) 4), bundle, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(this.a);
    }
}
