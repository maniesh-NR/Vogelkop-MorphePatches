package defpackage;

import android.content.Context;
import com.opera.api.Callback;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s75 {
    public final /* synthetic */ byte a = 0;
    public int b;
    public Object c;

    public s75() {
    }

    public s75(int i) {
        this.b = i;
    }

    public s75(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public s75(Context context, int i) {
        this.b = i;
        this.c = context.getApplicationContext();
    }

    public s75(k2d k2dVar, int i) {
        this.c = k2dVar;
        this.b = i;
    }

    public static String b(int i, int i2, int i3, int i4, String str) {
        return rfp.n(i4, "-", new StringBuilder(c(i, i2, i3, str)));
    }

    public static String c(int i, int i2, int i3, String str) {
        return rfp.n(i3, "-", new StringBuilder(d(i, i2, str)));
    }

    public static String d(int i, int i2, String str) {
        return str + "-" + i + "-16-" + i2;
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i);

    public final void G() throws cjb {
        int iC;
        do {
            iC = C();
            if (iC == 0) {
                return;
            }
            int i = this.b;
            if (i >= 100) {
                throw new cjb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.b = i + 1;
            this.b--;
        } while (F(iC));
    }

    public abstract void a(int i);

    public final void e(Callback callback) {
        avj avjVar = cak.d;
        avj.g(2, new zr9(callback, this, (byte) 8));
    }

    public abstract int f();

    public abstract boolean g();

    public void h(n2o n2oVar) {
    }

    public void i(n2o n2oVar) {
    }

    public abstract g3o j(g3o g3oVar, List list);

    public abstract mgh k(n2o n2oVar, mgh mghVar);

    public abstract void l(int i);

    public abstract int m(int i);

    public abstract boolean n();

    public abstract d54 o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public String toString() {
        switch (this.a) {
            case 4:
                return (String) this.c;
            default:
                return super.toString();
        }
    }

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
