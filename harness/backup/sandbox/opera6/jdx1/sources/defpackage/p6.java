package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class p6 {
    public static final p6 c;
    public static final p6 d;
    public final boolean a;
    public final CancellationException b;

    static {
        if (x6.d) {
            d = null;
            c = null;
        } else {
            d = new p6(false, null);
            c = new p6(true, null);
        }
    }

    public p6(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
