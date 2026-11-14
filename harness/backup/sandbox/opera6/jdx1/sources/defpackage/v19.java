package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class v19 implements rkh {
    public final File a;
    public final u2j b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public v19(File file, u2j u2jVar) {
        this.a = file;
        this.b = u2jVar;
    }

    @Override // defpackage.rkh
    public final Object a(sn4 sn4Var) {
        if (this.c.get()) {
            qp2.n("This scope has already been closed.");
            return null;
        }
        return wyh.U(this.a, new s23((byte) 6, (mt5) null, this), sn4Var);
    }

    @Override // defpackage.e65
    public final void close() {
        this.c.set(true);
    }
}
