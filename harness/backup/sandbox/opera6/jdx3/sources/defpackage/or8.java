package defpackage;

import J.N;
import androidx.fragment.app.Fragment;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.bookmarks.h;
import com.opera.android.suggestion.SuggestionManagerBridge;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class or8 implements lkf, mkf {
    public final umi a;
    public final gjm b;
    public final dw3 c;
    public final dw3 d;
    public final dw3 e;
    public final ew3 f;
    public final ew3 g;
    public final ew3 h;
    public final ew3 i;
    public final dw3 j;
    public final dw3 k;
    public final dw3 l;
    public final ew3 m;
    public final Lazy n;
    public final zv3 o;
    public final dw3 p;
    public final Lazy q;

    public or8(umi umiVar, gjm gjmVar, dw3 dw3Var, dw3 dw3Var2, dw3 dw3Var3, ew3 ew3Var, ew3 ew3Var2, ew3 ew3Var3, ew3 ew3Var4, dw3 dw3Var4, dw3 dw3Var5, dw3 dw3Var6, ew3 ew3Var5, Lazy lazy, zv3 zv3Var, dw3 dw3Var7, Lazy lazy2) {
        this.a = umiVar;
        this.b = gjmVar;
        this.c = dw3Var;
        this.d = dw3Var2;
        this.e = dw3Var3;
        this.f = ew3Var;
        this.g = ew3Var2;
        this.h = ew3Var3;
        this.i = ew3Var4;
        this.j = dw3Var4;
        this.k = dw3Var5;
        this.l = dw3Var6;
        this.m = ew3Var5;
        this.n = lazy;
        this.o = zv3Var;
        this.p = dw3Var7;
        this.q = lazy2;
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        OperaApplication operaApplication = this.k.b;
        boolean zA = Intrinsics.a(cls, ju.class);
        ew3 ew3Var = this.i;
        dw3 dw3Var = this.j;
        dw3 dw3Var2 = this.d;
        zv3 zv3Var = this.o;
        if (!zA) {
            if (Intrinsics.a(cls, xs.class)) {
                return new xs(new qb7(dw3Var2.b.o(), new u59((ysj) ew3Var.get(), (byte) 6)), new tw2((orm) dw3Var.get(), (byte) 5), operaApplication.J(), (tr8) zv3Var.get());
            }
            return null;
        }
        qb7 qb7Var = new qb7(dw3Var2.b.o(), new u59((ysj) ew3Var.get(), (byte) 6));
        nv2 nv2Var = (nv2) this.n.get();
        dw3 dw3Var3 = this.c;
        rq8 rq8Var = (rq8) dw3Var3.get();
        dw3 dw3Var4 = this.e;
        h hVar = (h) dw3Var4.get();
        tw2 tw2Var = new tw2((orm) dw3Var.get(), (byte) 5);
        nr8 nr8VarO = dw3Var2.b.o();
        rq8 rq8Var2 = (rq8) dw3Var3.get();
        ibf ibfVar = (ibf) this.g.get();
        h hVar2 = (h) dw3Var4.get();
        k6l k6lVar = (k6l) this.m.get();
        SuggestionManagerBridge suggestionManagerBridge = new SuggestionManagerBridge();
        fr[] frVarArr = ibfVar.b;
        fr[] frVarArr2 = ibfVar.b;
        fr frVar = frVarArr[2];
        int i = frVar.b;
        int i2 = frVar.c;
        fr frVar2 = frVarArr[3];
        int i3 = frVar2.b;
        int i4 = frVar2.c;
        hVar2.getClass();
        N.ME2$Sfed(N.Mj3RWkw$(N.MWt5ZYqx(20, i, i2, i3, i4)), N.MsnOjWk7(suggestionManagerBridge.a), kqk.b.ordinal(), true);
        fr frVar3 = frVarArr2[4];
        int i5 = frVar3.b;
        int i6 = frVar3.c;
        fr frVar4 = frVarArr2[5];
        int i7 = frVar4.b;
        int i8 = frVar4.c;
        fr frVar5 = frVarArr2[6];
        int i9 = frVar5.b;
        int i10 = frVar5.c;
        fr frVar6 = frVarArr2[7];
        suggestionManagerBridge.a(new vl3(i5, i6, i7, i8, i9, i10, frVar6.b, frVar6.c), kqk.f, true);
        fr frVar7 = frVarArr2[8];
        int i11 = frVar7.b;
        int i12 = frVar7.c;
        fr frVar8 = frVarArr2[9];
        int i13 = frVar8.b;
        int i14 = frVar8.c;
        fr frVar9 = frVarArr2[10];
        int i15 = frVar9.b;
        int i16 = frVar9.c;
        fr frVar10 = frVarArr2[11];
        suggestionManagerBridge.a(new x8l(this.a, k6lVar, i11, i12, i13, i14, i15, i16, frVar10.b, frVar10.c), kqk.n, true);
        return new ju(this.a, rq8Var, hVar, nv2Var, qb7Var, new ot(new nt(this.a, nr8VarO, qb7Var, rq8Var2, suggestionManagerBridge, (tr8) zv3Var.get()), tw2Var), (ipk) this.h.get(), new tw2((orm) dw3Var.get(), (byte) 5), operaApplication.J(), (tr8) zv3Var.get());
    }

    public final Fragment b(Class cls) {
        boolean zA = Intrinsics.a(cls, ss.class);
        gjm gjmVar = this.b;
        if (zA) {
            return new ss(gjmVar);
        }
        if (Intrinsics.a(cls, ct.class)) {
            return new ct(gjmVar);
        }
        if (!Intrinsics.a(cls, syk.class)) {
            return null;
        }
        return new syk(this.b, (skm) this.l.get(), this.k.b.J(), (qr8) this.f.get(), (nv2) this.n.get(), (zzj) this.p.b.r.U0.get(), ((gx8) this.q.get()).c);
    }
}
