package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class buk {
    public static final Range q = to2.h;
    public final Object a = new Object();
    public final Size b;
    public final ip7 c;
    public final Range d;
    public final zd4 e;
    public final boolean f;
    public final int g;
    public final o94 h;
    public final l94 i;
    public final o94 j;
    public final l94 k;
    public final l94 l;
    public final s0b m;
    public yo2 n;
    public auk o;
    public Executor p;

    public buk(Size size, zd4 zd4Var, boolean z, ip7 ip7Var, int i, Range range, ktk ktkVar) {
        this.b = size;
        this.e = zd4Var;
        this.f = z;
        jpo.i("SurfaceRequest's DynamicRange must always be fully specified.", ip7Var.b());
        this.c = ip7Var;
        this.g = i;
        this.d = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            atomicReference.set(l94Var);
            l94Var.a = str.concat("-cancellation");
        } catch (Exception e) {
            o94Var.a(e);
        }
        l94 l94Var2 = (l94) atomicReference.get();
        l94Var2.getClass();
        this.l = l94Var2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        l94 l94Var3 = new l94();
        l94Var3.c = new byh();
        o94 o94Var2 = new o94(l94Var3);
        l94Var3.b = o94Var2;
        l94Var3.a = vep.class;
        try {
            atomicReference2.set(l94Var3);
            l94Var3.a = str.concat("-status");
        } catch (Exception e2) {
            o94Var2.a(e2);
        }
        this.j = o94Var2;
        o94Var2.addListener(new wr9(o94Var2, new wci(l94Var2, o94Var, (byte) 5), (byte) 0), n97.a());
        l94 l94Var4 = (l94) atomicReference2.get();
        l94Var4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        l94 l94Var5 = new l94();
        l94Var5.c = new byh();
        o94 o94Var3 = new o94(l94Var5);
        l94Var5.b = o94Var3;
        l94Var5.a = vep.class;
        try {
            atomicReference3.set(l94Var5);
            l94Var5.a = str.concat("-Surface");
        } catch (Exception e3) {
            o94Var3.a(e3);
        }
        this.h = o94Var3;
        l94 l94Var6 = (l94) atomicReference3.get();
        l94Var6.getClass();
        this.i = l94Var6;
        s0b s0bVar = new s0b(this, size);
        this.m = s0bVar;
        ListenableFuture listenableFutureO = k1g.O(s0bVar.e);
        o94Var3.addListener(new wr9(o94Var3, new p8f(listenableFutureO, l94Var4, str, (byte) 24), (byte) 0), n97.a());
        listenableFutureO.addListener(new mw6(this, (byte) 1), n97.a());
        n97 n97VarA = n97.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        o94 o94VarZ = k1g.z(new roj(this, atomicReference4, (byte) 2));
        o94VarZ.addListener(new wr9(o94VarZ, new rii(ktkVar, (byte) 9), (byte) 0), n97VarA);
        l94 l94Var7 = (l94) atomicReference4.get();
        l94Var7.getClass();
        this.k = l94Var7;
    }

    public final void a(final Surface surface, Executor executor, final qp5 qp5Var) {
        final byte b = 0;
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: ytk
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    Surface surface2 = surface;
                    qp5 qp5Var2 = qp5Var;
                    switch (b2) {
                        case 0:
                            qp5Var2.accept(new xo2(2, surface2));
                            break;
                        case 1:
                            qp5Var2.accept(new xo2(3, surface2));
                            break;
                        default:
                            qp5Var2.accept(new xo2(4, surface2));
                            break;
                    }
                }
            });
            return;
        }
        if (!this.i.b(surface)) {
            o94 o94Var = this.h;
            if (!o94Var.isCancelled()) {
                jpo.n((String) null, o94Var.b.isDone());
                try {
                    o94Var.get();
                    final byte b2 = 1;
                    executor.execute(new Runnable() { // from class: ytk
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b2;
                            Surface surface2 = surface;
                            qp5 qp5Var2 = qp5Var;
                            switch (b22) {
                                case 0:
                                    qp5Var2.accept(new xo2(2, surface2));
                                    break;
                                case 1:
                                    qp5Var2.accept(new xo2(3, surface2));
                                    break;
                                default:
                                    qp5Var2.accept(new xo2(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final byte b3 = 2;
                    executor.execute(new Runnable() { // from class: ytk
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b3;
                            Surface surface2 = surface;
                            qp5 qp5Var2 = qp5Var;
                            switch (b22) {
                                case 0:
                                    qp5Var2.accept(new xo2(2, surface2));
                                    break;
                                case 1:
                                    qp5Var2.accept(new xo2(3, surface2));
                                    break;
                                default:
                                    qp5Var2.accept(new xo2(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        n9h n9hVar = new n9h((byte) 7, qp5Var, surface, false);
        o94 o94Var2 = this.j;
        o94Var2.addListener(new wr9(o94Var2, n9hVar, (byte) 0), executor);
    }

    public final void b(Executor executor, auk aukVar) {
        yo2 yo2Var;
        synchronized (this.a) {
            this.o = aukVar;
            this.p = executor;
            yo2Var = this.n;
        }
        if (yo2Var != null) {
            executor.execute(new xtk(aukVar, yo2Var, (byte) 1));
        }
    }

    public final boolean c() {
        return this.i.d(new lv0("Surface request will not complete."));
    }
}
