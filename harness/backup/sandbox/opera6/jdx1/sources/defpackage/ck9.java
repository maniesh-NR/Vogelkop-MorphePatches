package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class ck9 implements qya {
    public final qya b;
    public final Object a = new Object();
    public final HashSet c = new HashSet();

    public ck9(qya qyaVar) {
        this.b = qyaVar;
    }

    @Override // defpackage.qya
    public pya[] A0() {
        return this.b.A0();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((bk9) it.next()).a(this);
        }
    }

    @Override // defpackage.qya
    public final int getFormat() {
        return this.b.getFormat();
    }

    @Override // defpackage.qya
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // defpackage.qya
    public int getWidth() {
        return this.b.getWidth();
    }

    public final void h(bk9 bk9Var) {
        synchronized (this.a) {
            this.c.add(bk9Var);
        }
    }

    @Override // defpackage.qya
    public sxa h1() {
        return this.b.h1();
    }

    @Override // defpackage.qya
    public final Image y() {
        return this.b.y();
    }
}
