package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class t4p extends f4p {

    @NotNull
    public static final s4p Companion = new s4p();
    public final int b;
    public final q4p c;

    public t4p(int i, int i2, q4p q4pVar) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, r4p.b);
            throw null;
        }
        this.b = i2;
        this.c = q4pVar;
    }
}
