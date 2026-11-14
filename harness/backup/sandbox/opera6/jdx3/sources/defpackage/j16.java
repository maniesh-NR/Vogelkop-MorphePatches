package defpackage;

import android.content.Context;
import java.util.Collection;

/* loaded from: classes.dex */
public final class j16 extends n1 implements Runnable {
    public final Object c;
    public Collection d;

    public j16(Context context, umi umiVar) {
        super(context, umiVar);
        this.c = new Object();
    }

    @Override // defpackage.n1
    public final void run() {
        synchronized (this.c) {
            this.d = ((i16) this.b).q();
            this.c.notifyAll();
        }
    }
}
