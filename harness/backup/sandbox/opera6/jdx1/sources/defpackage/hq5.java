package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class hq5 implements ql7, z6g, x63, evb {
    public final Matrix a;
    public final Path b;
    public final RectF c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final f3d g;
    public ArrayList h;
    public final ev7 i;

    public hq5(f3d f3dVar, c73 c73Var, abj abjVar, p2d p2dVar) {
        id1 id1Var;
        String str = abjVar.a;
        boolean z = abjVar.c;
        List list = abjVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            wp5 wp5VarA = ((vq5) list.get(i2)).a(f3dVar, p2dVar, c73Var);
            if (wp5VarA != null) {
                arrayList.add(wp5VarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                id1Var = null;
                break;
            }
            vq5 vq5Var = (vq5) list.get(i);
            if (vq5Var instanceof id1) {
                id1Var = (id1) vq5Var;
                break;
            }
            i++;
        }
        this(f3dVar, c73Var, str, z, arrayList, id1Var);
    }

    public hq5(f3d f3dVar, c73 c73Var, String str, boolean z, ArrayList arrayList, id1 id1Var) {
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = str;
        this.g = f3dVar;
        this.e = z;
        this.f = arrayList;
        if (id1Var != null) {
            ev7 ev7Var = new ev7(id1Var);
            this.i = ev7Var;
            ev7Var.a(c73Var);
            ev7Var.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            wp5 wp5Var = (wp5) arrayList.get(size);
            if (wp5Var instanceof x3a) {
                arrayList2.add((x3a) wp5Var);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((x3a) arrayList2.get(size2)).g(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // defpackage.x63
    public final void a() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.wp5
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            wp5 wp5Var = (wp5) arrayList.get(size2);
            wp5Var.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(wp5Var);
        }
    }

    @Override // defpackage.evb
    public final void c(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2) {
        String str = this.d;
        if (!dvbVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            dvb dvbVar3 = new dvb(dvbVar2);
            dvbVar3.a.add(str);
            if (dvbVar.a(i, str)) {
                dvb dvbVar4 = new dvb(dvbVar3);
                dvbVar4.b = this;
                arrayList.add(dvbVar4);
            }
            dvbVar2 = dvbVar3;
        }
        if (!dvbVar.d(i, str)) {
            return;
        }
        int iB = dvbVar.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            wp5 wp5Var = (wp5) arrayList2.get(i2);
            if (wp5Var instanceof evb) {
                ((evb) wp5Var).c(dvbVar, iB, arrayList, dvbVar2);
            }
            i2++;
        }
    }

    @Override // defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        ev7 ev7Var = this.i;
        if (ev7Var != null) {
            ev7Var.c(ua7Var, obj);
        }
    }

    @Override // defpackage.z6g
    public final Path e() {
        Matrix matrix = this.a;
        matrix.reset();
        ev7 ev7Var = this.i;
        if (ev7Var != null) {
            matrix.set(ev7Var.e());
        }
        Path path = this.b;
        path.reset();
        if (!this.e) {
            ArrayList arrayList = this.f;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                wp5 wp5Var = (wp5) arrayList.get(size);
                if (wp5Var instanceof z6g) {
                    path.addPath(((z6g) wp5Var).e(), matrix);
                }
            }
        }
        return path;
    }

    @Override // defpackage.ql7
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        ev7 ev7Var = this.i;
        if (ev7Var != null) {
            matrix2.preConcat(ev7Var.e());
        }
        RectF rectF2 = this.c;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            wp5 wp5Var = (wp5) arrayList.get(size);
            if (wp5Var instanceof ql7) {
                ((ql7) wp5Var).f(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List g() {
        if (this.h == null) {
            this.h = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f;
                if (i >= arrayList.size()) {
                    break;
                }
                wp5 wp5Var = (wp5) arrayList.get(i);
                if (wp5Var instanceof z6g) {
                    this.h.add((z6g) wp5Var);
                }
                i++;
            }
        }
        return this.h;
    }

    @Override // defpackage.wp5
    public final String getName() {
        throw null;
    }

    @Override // defpackage.ql7
    public final void h(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        ev7 ev7Var = this.i;
        if (ev7Var != null) {
            matrix2.preConcat(ev7Var.e());
            i = (int) (((((((a73) ev7Var.l) == null ? 100 : ((Integer) r5.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        this.g.getClass();
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof ql7) {
                ((ql7) obj).h(canvas, matrix2, i);
            }
        }
    }
}
