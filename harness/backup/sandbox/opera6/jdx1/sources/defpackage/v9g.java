package defpackage;

import ads_mobile_sdk.bj1;
import ads_mobile_sdk.fr;
import ads_mobile_sdk.hv;
import ads_mobile_sdk.iv;
import ads_mobile_sdk.yb1;
import android.app.Activity;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class v9g {
    public int a;
    public int b;
    public Object c;

    public v9g(Activity activity, int i, int i2) {
        this.c = activity.getResources();
        this.a = i;
        this.b = i2;
    }

    public static long a(long j) {
        return (j >>> 1) ^ (-(j & 1));
    }

    public static v9g a(InputStream inputStream) {
        if (inputStream != null) {
            return new iv(inputStream);
        }
        hv hvVar = new hv(yb1.a, 0);
        try {
            hvVar.d(0);
            return hvVar;
        } catch (bj1 e) {
            t3p.n(e);
            return null;
        }
    }

    public static int b(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public abstract int a();

    public abstract void a(int i);

    public abstract boolean b();

    public abstract void c(int i);

    public abstract boolean c();

    public abstract int d(int i);

    public abstract fr d();

    public abstract double e();

    public abstract boolean e(int i);

    public abstract int f();

    public abstract int g();

    public abstract long h();

    public abstract float i();

    public abstract int j();

    public abstract long k();

    public abstract int l();

    public abstract long m();

    public abstract int n();

    public abstract long o();

    public abstract String p();

    public abstract String q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public final void u() throws bj1 {
        int iR;
        do {
            iR = r();
            if (iR == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                t3p.j("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.b = i2 + 1;
                this.b--;
            }
        } while (e(iR));
    }
}
