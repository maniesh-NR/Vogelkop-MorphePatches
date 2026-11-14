package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class n4p extends f4p {

    @NotNull
    public static final m4p Companion = new m4p();
    public final int b;
    public final k4p c;

    public n4p(int i, int i2, k4p k4pVar) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, l4p.b);
            throw null;
        }
        this.b = i2;
        this.c = k4pVar;
    }
}
