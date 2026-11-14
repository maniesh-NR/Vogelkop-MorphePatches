package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class tuh implements ql7, z6g, x3a, x63, fvb {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final f3d c;
    public final c73 d;
    public final String e;
    public final boolean f;
    public final t89 g;
    public final t89 h;
    public final ev7 i;
    public hq5 j;

    public tuh(f3d f3dVar, c73 c73Var, aph aphVar) {
        this.c = f3dVar;
        this.d = c73Var;
        this.e = aphVar.b;
        this.f = aphVar.d;
        a73 a73VarD = aphVar.c.D();
        this.g = (t89) a73VarD;
        c73Var.g(a73VarD);
        a73VarD.a(this);
        a73 a73VarD2 = ((ed1) aphVar.e).D();
        this.h = (t89) a73VarD2;
        c73Var.g(a73VarD2);
        a73VarD2.a(this);
        id1 id1Var = (id1) aphVar.f;
        id1Var.getClass();
        ev7 ev7Var = new ev7(id1Var);
        this.i = ev7Var;
        ev7Var.a(c73Var);
        ev7Var.b(this);
    }

    @Override // defpackage.x63
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.wp5
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.evb
    public final void c(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2) {
        l1e.e(dvbVar, i, arrayList, dvbVar2, this);
        for (int i2 = 0; i2 < this.j.f.size(); i2++) {
            wp5 wp5Var = (wp5) this.j.f.get(i2);
            if (wp5Var instanceof fvb) {
                l1e.e(dvbVar, i, arrayList, dvbVar2, (fvb) wp5Var);
            }
        }
    }

    @Override // defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        if (this.i.c(ua7Var, obj)) {
            return;
        }
        if (obj == k3d.p) {
            this.g.j(ua7Var);
        } else if (obj == k3d.q) {
            this.h.j(ua7Var);
        }
    }

    @Override // defpackage.z6g
    public final Path e() {
        Path pathE = this.j.e();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixF = this.i.f(i + fFloatValue2);
            Matrix matrix = this.a;
            matrix.set(matrixF);
            path.addPath(pathE, matrix);
        }
        return path;
    }

    @Override // defpackage.ql7
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        this.j.f(rectF, matrix, z);
    }

    @Override // defpackage.x3a
    public final void g(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((wp5) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new hq5(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.wp5
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.ql7
    public final void h(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        ev7 ev7Var = this.i;
        float fFloatValue3 = ((Float) ((a73) ev7Var.b).e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) ((a73) ev7Var.o).e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(ev7Var.f(f + fFloatValue2));
            this.j.h(canvas, matrix2, (int) (l1e.d(fFloatValue3, fFloatValue4, f / fFloatValue) * i));
        }
    }
}
