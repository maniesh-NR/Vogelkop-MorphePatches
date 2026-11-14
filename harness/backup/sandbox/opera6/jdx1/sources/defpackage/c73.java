package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c73 implements ql7, x63, evb {
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final ezb d = new ezb((byte) 0, 1);
    public final ezb e;
    public final ezb f;
    public final ezb g;
    public final ezb h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final f3d o;
    public final t1c p;
    public final ua7 q;
    public final t89 r;
    public c73 s;
    public c73 t;
    public List u;
    public final ArrayList v;
    public final ev7 w;
    public boolean x;
    public float y;
    public BlurMaskFilter z;

    public c73(f3d f3dVar, t1c t1cVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new ezb(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new ezb(mode2);
        ezb ezbVar = new ezb((byte) 0, 1);
        this.g = ezbVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        ezb ezbVar2 = new ezb();
        ezbVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = ezbVar2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.y = 0.0f;
        this.o = f3dVar;
        this.p = t1cVar;
        List list = t1cVar.h;
        if (t1cVar.u == 3) {
            ezbVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            ezbVar.setXfermode(new PorterDuffXfermode(mode));
        }
        id1 id1Var = t1cVar.i;
        id1Var.getClass();
        ev7 ev7Var = new ev7(id1Var);
        this.w = ev7Var;
        ev7Var.b(this);
        if (list != null && !list.isEmpty()) {
            ua7 ua7Var = new ua7(list);
            this.q = ua7Var;
            ArrayList arrayList = (ArrayList) ua7Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((a73) obj).a(this);
            }
            ArrayList arrayList2 = (ArrayList) this.q.c;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                a73 a73Var = (a73) obj2;
                g(a73Var);
                a73Var.a(this);
            }
        }
        t1c t1cVar2 = this.p;
        if (t1cVar2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        t89 t89Var = new t89(t1cVar2.t);
        this.r = t89Var;
        t89Var.b = true;
        t89Var.a(new x63() { // from class: b73
            @Override // defpackage.x63
            public final void a() {
                c73 c73Var = this.a;
                boolean z = c73Var.r.k() == 1.0f;
                if (z != c73Var.x) {
                    c73Var.x = z;
                    c73Var.o.invalidateSelf();
                }
            }
        });
        boolean z = ((Float) this.r.e()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        g(this.r);
    }

    @Override // defpackage.x63
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.wp5
    public final void b(List list, List list2) {
    }

    @Override // defpackage.evb
    public final void c(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2) {
        c73 c73Var = this.s;
        t1c t1cVar = this.p;
        if (c73Var != null) {
            String str = c73Var.p.c;
            dvb dvbVar3 = new dvb(dvbVar2);
            dvbVar3.a.add(str);
            if (dvbVar.a(i, this.s.p.c)) {
                c73 c73Var2 = this.s;
                dvb dvbVar4 = new dvb(dvbVar3);
                dvbVar4.b = c73Var2;
                arrayList.add(dvbVar4);
            }
            if (dvbVar.d(i, t1cVar.c)) {
                this.s.p(dvbVar, dvbVar.b(i, this.s.p.c) + i, arrayList, dvbVar3);
            }
        }
        String str2 = t1cVar.c;
        String str3 = t1cVar.c;
        if (dvbVar.c(i, str2)) {
            if (!"__container".equals(str3)) {
                dvb dvbVar5 = new dvb(dvbVar2);
                dvbVar5.a.add(str3);
                if (dvbVar.a(i, str3)) {
                    dvb dvbVar6 = new dvb(dvbVar5);
                    dvbVar6.b = this;
                    arrayList.add(dvbVar6);
                }
                dvbVar2 = dvbVar5;
            }
            if (dvbVar.d(i, str3)) {
                p(dvbVar, dvbVar.b(i, str3) + i, arrayList, dvbVar2);
            }
        }
    }

    @Override // defpackage.evb
    public void d(ua7 ua7Var, Object obj) {
        this.w.c(ua7Var, obj);
    }

    @Override // defpackage.ql7
    public void f(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((c73) this.u.get(size)).w.e());
                }
            } else {
                c73 c73Var = this.t;
                if (c73Var != null) {
                    matrix2.preConcat(c73Var.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void g(a73 a73Var) {
        if (a73Var == null) {
            return;
        }
        this.v.add(a73Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    @Override // defpackage.ql7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c73.h(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void i() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        c73 c73Var = this;
        while (true) {
            c73Var = c73Var.t;
            if (c73Var == null) {
                return;
            } else {
                this.u.add(c73Var);
            }
        }
    }

    public void j(Canvas canvas, Matrix matrix, int i) {
    }

    public zy9 k() {
        return this.p.w;
    }

    public wjh l() {
        return this.p.x;
    }

    public final boolean m() {
        ua7 ua7Var = this.q;
        return (ua7Var == null || ((ArrayList) ua7Var.b).isEmpty()) ? false : true;
    }

    public final void n() {
        ir5 ir5Var = this.o.a.a;
        String str = this.p.c;
    }

    public final void o(a73 a73Var) {
        this.v.remove(a73Var);
    }

    public void p(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2) {
    }

    public void q(float f) {
        ev7 ev7Var = this.w;
        a73 a73Var = (a73) ev7Var.l;
        if (a73Var != null) {
            a73Var.i(f);
        }
        a73 a73Var2 = (a73) ev7Var.b;
        if (a73Var2 != null) {
            a73Var2.i(f);
        }
        a73 a73Var3 = (a73) ev7Var.o;
        if (a73Var3 != null) {
            a73Var3.i(f);
        }
        a73 a73Var4 = (a73) ev7Var.a;
        if (a73Var4 != null) {
            a73Var4.i(f);
        }
        a73 a73Var5 = (a73) ev7Var.i;
        if (a73Var5 != null) {
            a73Var5.i(f);
        }
        a73 a73Var6 = (a73) ev7Var.j;
        if (a73Var6 != null) {
            a73Var6.i(f);
        }
        a73 a73Var7 = (a73) ev7Var.k;
        if (a73Var7 != null) {
            a73Var7.i(f);
        }
        t89 t89Var = (t89) ev7Var.m;
        if (t89Var != null) {
            t89Var.i(f);
        }
        t89 t89Var2 = (t89) ev7Var.n;
        if (t89Var2 != null) {
            t89Var2.i(f);
        }
        ua7 ua7Var = this.q;
        if (ua7Var != null) {
            ArrayList arrayList = (ArrayList) ua7Var.b;
            for (int i = 0; i < arrayList.size(); i++) {
                ((a73) arrayList.get(i)).i(f);
            }
        }
        t89 t89Var3 = this.r;
        if (t89Var3 != null) {
            t89Var3.i(f);
        }
        c73 c73Var = this.s;
        if (c73Var != null) {
            c73Var.q(f);
        }
        ArrayList arrayList2 = this.v;
        arrayList2.size();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ((a73) arrayList2.get(i2)).i(f);
        }
        arrayList2.size();
    }
}
