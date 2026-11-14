package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class txd implements uya, bk9 {
    public final Object a;
    public final sb4 b;
    public int c;
    public final kqd d;
    public boolean e;
    public final rn9 f;
    public tya g;
    public Executor h;
    public final LongSparseArray i;
    public final LongSparseArray j;
    public int k;
    public final ArrayList l;
    public final ArrayList m;

    public txd(int i, int i2, int i3, int i4) {
        rn9 rn9Var = new rn9(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new sb4(this, (byte) 2);
        this.c = 0;
        this.d = new kqd(this, (byte) 1);
        this.e = false;
        this.i = new LongSparseArray();
        this.j = new LongSparseArray();
        this.m = new ArrayList();
        this.f = rn9Var;
        this.k = 0;
        this.l = new ArrayList(q());
    }

    public final void a(ck9 ck9Var) {
        synchronized (this.a) {
            b(ck9Var);
        }
    }

    public final void b(ck9 ck9Var) {
        synchronized (this.a) {
            int iIndexOf = this.l.indexOf(ck9Var);
            if (iIndexOf >= 0) {
                this.l.remove(iIndexOf);
                int i = this.k;
                if (iIndexOf <= i) {
                    this.k = i - 1;
                }
            }
            this.m.remove(ck9Var);
            if (this.c > 0) {
                d(this.f);
            }
        }
    }

    public final void c(d5j d5jVar) {
        tya tyaVar;
        Executor executor;
        synchronized (this.a) {
            if (this.l.size() < q()) {
                d5jVar.h(this);
                this.l.add(d5jVar);
                tyaVar = this.g;
                executor = this.h;
            } else {
                d5jVar.close();
                tyaVar = null;
                executor = null;
            }
        }
        if (tyaVar != null) {
            if (executor != null) {
                executor.execute(new hpd(this, tyaVar, (byte) 5));
            } else {
                tyaVar.o(this);
            }
        }
    }

    @Override // defpackage.uya
    public final void close() {
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.l);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((qya) obj).close();
            }
            this.l.clear();
            this.f.close();
            this.e = true;
        }
    }

    public final void d(uya uyaVar) {
        qya qyaVarY;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            int size = this.j.size() + this.l.size();
            if (size >= uyaVar.q()) {
                return;
            }
            do {
                try {
                    qyaVarY = uyaVar.y();
                    if (qyaVarY != null) {
                        this.c--;
                        size++;
                        this.j.put(qyaVarY.h1().e(), qyaVarY);
                        f();
                    }
                } catch (IllegalStateException unused) {
                    qyaVarY = null;
                }
                if (qyaVarY == null || this.c <= 0) {
                    break;
                }
            } while (size < uyaVar.q());
        }
    }

    @Override // defpackage.uya
    public final qya e() {
        synchronized (this.a) {
            if (this.l.isEmpty()) {
                return null;
            }
            if (this.k >= this.l.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < this.l.size() - 1; i2++) {
                if (!this.m.contains(this.l.get(i2))) {
                    arrayList.add((qya) this.l.get(i2));
                }
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((qya) obj).close();
            }
            int size2 = this.l.size();
            ArrayList arrayList2 = this.l;
            this.k = size2;
            qya qyaVar = (qya) arrayList2.get(size2 - 1);
            this.m.add(qyaVar);
            return qyaVar;
        }
    }

    public final void f() {
        synchronized (this.a) {
            for (int size = this.i.size() - 1; size >= 0; size--) {
                sxa sxaVar = (sxa) this.i.valueAt(size);
                long jE = sxaVar.e();
                qya qyaVar = (qya) this.j.get(jE);
                if (qyaVar != null) {
                    this.j.remove(jE);
                    this.i.removeAt(size);
                    c(new d5j(qyaVar, (Size) null, sxaVar));
                }
            }
            g();
        }
    }

    public final void g() {
        synchronized (this.a) {
            if (this.j.size() == 0 || this.i.size() == 0) {
                return;
            }
            long jKeyAt = this.j.keyAt(0);
            Long lValueOf = Long.valueOf(jKeyAt);
            long jKeyAt2 = this.i.keyAt(0);
            jpo.j(!Long.valueOf(jKeyAt2).equals(lValueOf));
            if (jKeyAt2 > jKeyAt) {
                for (int size = this.j.size() - 1; size >= 0; size--) {
                    if (this.j.keyAt(size) < jKeyAt2) {
                        ((qya) this.j.valueAt(size)).close();
                        this.j.removeAt(size);
                    }
                }
            } else {
                for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
                    if (this.i.keyAt(size2) < jKeyAt) {
                        this.i.removeAt(size2);
                    }
                }
            }
        }
    }

    @Override // defpackage.uya
    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.f.getHeight();
        }
        return height;
    }

    @Override // defpackage.uya
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.f.getSurface();
        }
        return surface;
    }

    @Override // defpackage.uya
    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.f.getWidth();
        }
        return width;
    }

    @Override // defpackage.uya
    public final int i() {
        int i;
        synchronized (this.a) {
            i = this.f.i();
        }
        return i;
    }

    @Override // defpackage.uya
    public final void l() {
        synchronized (this.a) {
            this.f.l();
            this.g = null;
            this.h = null;
            this.c = 0;
        }
    }

    @Override // defpackage.uya
    public final int q() {
        int iQ;
        synchronized (this.a) {
            iQ = this.f.q();
        }
        return iQ;
    }

    @Override // defpackage.uya
    public final void w(tya tyaVar, Executor executor) {
        synchronized (this.a) {
            tyaVar.getClass();
            this.g = tyaVar;
            executor.getClass();
            this.h = executor;
            this.f.w(this.d, executor);
        }
    }

    @Override // defpackage.uya
    public final qya y() {
        synchronized (this.a) {
            if (this.l.isEmpty()) {
                return null;
            }
            if (this.k >= this.l.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = this.l;
            int i = this.k;
            this.k = i + 1;
            qya qyaVar = (qya) arrayList.get(i);
            this.m.add(qyaVar);
            return qyaVar;
        }
    }
}
