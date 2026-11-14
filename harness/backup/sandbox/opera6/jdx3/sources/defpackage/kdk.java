package defpackage;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class kdk implements Runnable {
    public final CountDownLatch a;
    public final oml b;
    public final Object c;
    public final /* synthetic */ ldk d;

    public kdk(ldk ldkVar, Object obj) {
        Objects.requireNonNull(ldkVar);
        this.d = ldkVar;
        this.a = new CountDownLatch(1);
        this.c = obj;
        this.b = new oml(ldkVar.a.c(new mni(this, (byte) 28)));
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.a.await();
        } catch (InterruptedException unused) {
        }
    }
}
