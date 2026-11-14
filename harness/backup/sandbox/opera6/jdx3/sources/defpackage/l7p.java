package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class l7p {

    @NotNull
    public static final r6p Companion = new r6p();
    public final long a;
    public final String b;

    public l7p(int i, long j, String str) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, p6p.b);
            throw null;
        }
        this.a = j;
        this.b = str;
    }

    public l7p(long j, String str) {
        this.a = j;
        this.b = str;
    }
}
