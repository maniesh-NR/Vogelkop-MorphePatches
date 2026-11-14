package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class vva extends ck9 {
    public final /* synthetic */ byte d = 1;
    public final Object e;

    public vva(qya qyaVar) {
        super(qyaVar);
        this.e = new AtomicBoolean(false);
    }

    public vva(qya qyaVar, wva wvaVar) {
        super(qyaVar);
        this.e = new WeakReference(wvaVar);
        h(new uva(this, (byte) 0));
    }

    @Override // defpackage.ck9, java.lang.AutoCloseable
    public final void close() throws Exception {
        switch (this.d) {
            case 1:
                if (!((AtomicBoolean) this.e).getAndSet(true)) {
                    super.close();
                    break;
                }
                break;
            default:
                super.close();
                break;
        }
    }
}
