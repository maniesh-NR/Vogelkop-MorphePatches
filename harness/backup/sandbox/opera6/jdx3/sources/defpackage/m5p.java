package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class m5p extends f4p {

    @NotNull
    public static final l5p Companion = new l5p();
    public final int b;
    public final j5p c;

    public m5p(int i, int i2, j5p j5pVar) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, k5p.b);
            throw null;
        }
        this.b = i2;
        this.c = j5pVar;
    }
}
