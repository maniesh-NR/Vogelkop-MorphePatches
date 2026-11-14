package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes.dex */
public final class fc1 extends s75 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc1(ViewGroup viewGroup, byte b) {
        super(1);
        this.d = b;
        this.e = viewGroup;
    }

    @Override // defpackage.s75
    public final g3o j(g3o g3oVar, List list) {
        byte b = this.d;
        ViewGroup viewGroup = this.e;
        switch (b) {
            case 0:
                return ((c6n) viewGroup).h(g3oVar);
            default:
                v77 v77Var = (v77) viewGroup;
                if (v77Var.k) {
                    return g3oVar;
                }
                View childAt = v77Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, v77Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, v77Var.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? g3oVar : g3oVar.a.r(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // defpackage.s75
    public final mgh k(n2o n2oVar, mgh mghVar) {
        byte b = this.d;
        ViewGroup viewGroup = this.e;
        switch (b) {
            case 0:
                j8b j8bVar = (j8b) ((c6n) viewGroup).z.F.b;
                if (!j8bVar.b0.n) {
                    return mghVar;
                }
                long jF0 = scd.f0(j8bVar.U(0L));
                int i = (int) (jF0 >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jF0 & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jH = rm5.v(j8bVar).h();
                int i3 = (int) (jH >> 32);
                int i4 = (int) (jH & 4294967295L);
                long j = j8bVar.c;
                long jF02 = scd.f0(j8bVar.U((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i5 = i3 - ((int) (jF02 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (jF02 & 4294967295L));
                int i7 = i6 >= 0 ? i6 : 0;
                return (i == 0 && i2 == 0 && i5 == 0 && i7 == 0) ? mghVar : new mgh(c6n.f((r9b) mghVar.b, i, i2, i5, i7), c6n.f((r9b) mghVar.c, i, i2, i5, i7), (byte) 12);
            default:
                v77 v77Var = (v77) viewGroup;
                if (v77Var.k) {
                    return mghVar;
                }
                View childAt = v77Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, v77Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, v77Var.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return mghVar;
                }
                r9b r9bVarC = r9b.c(iMax, iMax2, iMax3, iMax4);
                int i8 = r9bVarC.a;
                r9b r9bVar = (r9b) mghVar.b;
                int i9 = r9bVarC.b;
                int i10 = r9bVarC.c;
                int i11 = r9bVarC.d;
                return new mgh(g3o.e(r9bVar, i8, i9, i10, i11), g3o.e((r9b) mghVar.c, i8, i9, i10, i11), (byte) 12);
        }
    }
}
