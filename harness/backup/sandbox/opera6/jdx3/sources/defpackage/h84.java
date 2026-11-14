package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h84 {
    public final byte a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f = new ArrayList(1);

    /* JADX WARN: Multi-variable type inference failed */
    public h84(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final synchronized boolean a(int i) {
        if (this.f.size() >= 256) {
            return false;
        }
        this.f.add(Integer.valueOf(i));
        return true;
    }
}
