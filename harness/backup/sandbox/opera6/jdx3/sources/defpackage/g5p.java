package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class g5p extends f4p {

    @NotNull
    public static final f5p Companion = new f5p();
    public final int b;
    public final d5p c;

    public g5p(int i, int i2, d5p d5pVar) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, e5p.b);
            throw null;
        }
        this.b = i2;
        this.c = d5pVar;
    }
}
