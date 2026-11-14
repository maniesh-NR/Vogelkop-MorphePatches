package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ix7 implements z6g, x63, fvb {
    public final String b;
    public final f3d c;
    public final h2a d;
    public final a73 e;
    public final i05 f;
    public boolean h;
    public final Path a = new Path();
    public final d14 g = new d14((byte) 1);

    public ix7(f3d f3dVar, c73 c73Var, i05 i05Var) {
        this.b = i05Var.a;
        this.c = f3dVar;
        a73 a73VarD = i05Var.c.D();
        this.d = (h2a) a73VarD;
        a73 a73VarD2 = i05Var.b.D();
        this.e = a73VarD2;
        this.f = i05Var;
        c73Var.g(a73VarD);
        c73Var.g(a73VarD2);
        a73VarD.a(this);
        a73VarD2.a(this);
    }

    @Override // defpackage.x63
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.wp5
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            wp5 wp5Var = (wp5) arrayList.get(i);
            if (wp5Var instanceof h7m) {
                h7m h7mVar = (h7m) wp5Var;
                if (h7mVar.c == 1) {
                    this.g.a.add(h7mVar);
                    h7mVar.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.evb
    public final void c(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2) {
        l1e.e(dvbVar, i, arrayList, dvbVar2, this);
    }

    @Override // defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        if (obj == k3d.f) {
            this.d.j(ua7Var);
        } else if (obj == k3d.i) {
            this.e.j(ua7Var);
        }
    }

    @Override // defpackage.z6g
    public final Path e() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        i05 i05Var = this.f;
        if (i05Var.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (i05Var.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.a(path);
        this.h = true;
        return path;
    }

    @Override // defpackage.wp5
    public final String getName() {
        return this.b;
    }
}
