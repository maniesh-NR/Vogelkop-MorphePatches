package defpackage;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class h2a extends awb {
    public final /* synthetic */ byte i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2a(List list, byte b) {
        super(list);
        this.i = b;
        switch (b) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new nli();
                break;
            default:
                int iMax = 0;
                for (int i = 0; i < list.size(); i++) {
                    g2a g2aVar = (g2a) ((zvb) list.get(i)).b;
                    if (g2aVar != null) {
                        iMax = Math.max(iMax, g2aVar.b.length);
                    }
                }
                this.j = new g2a(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // defpackage.a73
    public final Object f(zvb zvbVar, float f) {
        Object obj;
        float f2;
        byte b = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                g2a g2aVar = (g2a) obj2;
                g2a g2aVar2 = (g2a) zvbVar.b;
                g2a g2aVar3 = (g2a) zvbVar.c;
                int[] iArr = g2aVar.b;
                float[] fArr = g2aVar.a;
                int[] iArr2 = g2aVar2.b;
                int length = iArr2.length;
                int[] iArr3 = g2aVar3.b;
                if (length != iArr3.length) {
                    StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                    sb.append(iArr2.length);
                    sb.append(" vs ");
                    qp2.o(p3p.k(iArr3.length, ")", sb));
                    return null;
                }
                for (int i = 0; i < iArr2.length; i++) {
                    fArr[i] = l1e.d(g2aVar2.a[i], g2aVar3.a[i], f);
                    iArr[i] = c26.o(f, iArr2[i], iArr3[i]);
                }
                for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                    fArr[length2] = fArr[iArr2.length - 1];
                    iArr[length2] = iArr[iArr2.length - 1];
                }
                return g2aVar;
            case 1:
                return k(zvbVar, f, f, f);
            default:
                nli nliVar = (nli) obj2;
                Object obj3 = zvbVar.b;
                if (obj3 == null || (obj = zvbVar.c) == null) {
                    qp2.n("Missing values for keyframe.");
                    return null;
                }
                nli nliVar2 = (nli) obj3;
                nli nliVar3 = (nli) obj;
                ua7 ua7Var = this.e;
                if (ua7Var != null) {
                    f2 = f;
                    nli nliVar4 = (nli) ua7Var.z(zvbVar.g, zvbVar.h.floatValue(), nliVar2, nliVar3, f2, d(), this.d);
                    if (nliVar4 != null) {
                        return nliVar4;
                    }
                } else {
                    f2 = f;
                }
                float fD = l1e.d(nliVar2.a, nliVar3.a, f2);
                float fD2 = l1e.d(nliVar2.b, nliVar3.b, f2);
                nliVar.a = fD;
                nliVar.b = fD2;
                return nliVar;
        }
    }

    @Override // defpackage.a73
    public final /* bridge */ /* synthetic */ Object g(zvb zvbVar, float f, float f2, float f3) {
        switch (this.i) {
            case 1:
                return k(zvbVar, f, f2, f3);
            default:
                return super.g(zvbVar, f, f2, f3);
        }
    }

    public final PointF k(zvb zvbVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = zvbVar.b;
        if (obj2 == null || (obj = zvbVar.c) == null) {
            qp2.n("Missing values for keyframe.");
            return null;
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        ua7 ua7Var = this.e;
        if (ua7Var != null && (pointF = (PointF) ua7Var.z(zvbVar.g, zvbVar.h.floatValue(), pointF3, pointF4, f, d(), this.d)) != null) {
            return pointF;
        }
        float f4 = pointF3.x;
        float fG = v0g.g(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF2.set(fG, v0g.g(pointF4.y, f5, f3, f5));
        return pointF2;
    }
}
