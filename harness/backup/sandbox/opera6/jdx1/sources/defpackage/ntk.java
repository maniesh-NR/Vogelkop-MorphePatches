package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ntk {
    public final short a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final byte f;
    public final to2 g;
    public int h;
    public int i;
    public buk k;
    public mtk l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public ntk(int i, int i2, to2 to2Var, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = to2Var;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new mtk(i2, to2Var.a);
    }

    public final void a(Runnable runnable) {
        xug.i();
        b();
        this.m.add(runnable);
    }

    public final void b() {
        jpo.n("Edge is already closed.", !this.n);
    }

    public final void c() {
        xug.i();
        this.l.a();
        this.n = true;
        this.o.clear();
        this.m.clear();
    }

    public final buk d(zd4 zd4Var, boolean z) {
        xug.i();
        b();
        to2 to2Var = this.g;
        Size size = to2Var.a;
        ip7 ip7Var = to2Var.c;
        int i = to2Var.d;
        Range range = to2Var.e;
        byte b = 0;
        buk bukVar = new buk(size, zd4Var, z, ip7Var, i, range, new ktk(this, b));
        try {
            s0b s0bVar = bukVar.m;
            mtk mtkVar = this.l;
            if (mtkVar.f(s0bVar, new jtk(mtkVar, b))) {
                k1g.O(mtkVar.e).addListener(new qlk(s0bVar, (byte) 7), n97.a());
            }
            this.k = bukVar;
            f();
            return bukVar;
        } catch (f07 e) {
            h9o.v("Surface is somehow already closed", e);
            return null;
        } catch (RuntimeException e2) {
            bukVar.c();
            throw e2;
        }
    }

    public final void e() {
        boolean z;
        xug.i();
        b();
        mtk mtkVar = this.l;
        xug.i();
        if (mtkVar.o == null) {
            synchronized (mtkVar.a) {
                z = mtkVar.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new mtk(this.a, this.g.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        auk aukVar;
        Executor executor;
        xug.i();
        yo2 yo2Var = new yo2(this.d, this.i, this.h, this.c, this.b, this.e);
        buk bukVar = this.k;
        int i = 0;
        if (bukVar != null) {
            synchronized (bukVar.a) {
                bukVar.n = yo2Var;
                aukVar = bukVar.o;
                executor = bukVar.p;
            }
            if (aukVar != null && executor != null) {
                executor.execute(new xtk(aukVar, yo2Var, (byte) 0));
            }
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qp5) obj).accept(yo2Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append((int) this.f);
        sb.append(", format=");
        sb.append((int) this.a);
        sb.append(", resolution=");
        sb.append(this.g.a);
        sb.append(", cropRect=");
        sb.append(this.d);
        sb.append(", rotationDegrees=");
        sb.append(this.i);
        sb.append(", mirroring=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.b;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(d2m.b(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(d2m.e(matrix));
        sb.append(", isClosed=");
        sb.append(this.n);
        sb.append('}');
        return sb.toString();
    }
}
