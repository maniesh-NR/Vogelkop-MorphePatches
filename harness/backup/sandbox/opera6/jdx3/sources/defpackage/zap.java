package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class zap {

    @NotNull
    public static final yap Companion = new yap();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zap(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public zap(int i, int i2, int i3, int i4, int i5) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, xap.b);
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
    }
}
