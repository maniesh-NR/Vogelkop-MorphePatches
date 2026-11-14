package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class g1o {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final byte e;
    public final String f;

    /* JADX WARN: Multi-variable type inference failed */
    public g1o(String str, int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = str;
    }

    public String a(Context context) {
        return context.getString(2132022279);
    }

    public int b() {
        return 0;
    }

    public int c() {
        return 1;
    }

    public boolean d() {
        return true;
    }
}
