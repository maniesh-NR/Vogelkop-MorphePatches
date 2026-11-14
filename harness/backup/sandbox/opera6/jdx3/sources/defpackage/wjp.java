package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class wjp {

    @NotNull
    public static final sjp Companion = new sjp();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final zap f;
    public final zap g;
    public final int h;
    public final int i;
    public final String j;
    public boolean k;
    public long l;

    public wjp(int i, int i2, int i3, int i4, int i5, long j, zap zapVar, zap zapVar2, int i6, int i7, String str, boolean z, long j2) {
        if (447 != (i & 447)) {
            x7d.I(i, 447, rjp.b);
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = j;
        this.f = zapVar;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = zapVar2;
        }
        this.h = i6;
        this.i = i7;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str;
        }
        this.k = (i & 1024) == 0 ? false : z;
        this.l = (i & 2048) == 0 ? -1L : j2;
    }

    public wjp(int i, int i2, int i3, int i4, long j, zap zapVar, zap zapVar2, int i5, int i6, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
        this.f = zapVar;
        this.g = zapVar2;
        this.h = i5;
        this.i = i6;
        this.j = str;
        this.k = false;
        this.l = -1L;
    }
}
