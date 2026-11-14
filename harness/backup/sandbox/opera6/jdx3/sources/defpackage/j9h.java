package defpackage;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaTextView;
import java.net.ProtocolException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class j9h implements wxg, xjj, auk, bcf, ke7, k0g {
    public final /* synthetic */ byte a;

    public /* synthetic */ j9h(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void c(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void e(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void h(String str) throws ProtocolException {
        throw new ProtocolException(str);
    }

    public static /* synthetic */ void k(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    public static /* synthetic */ void l(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(String str, Object obj, int i) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void p(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public static /* synthetic */ void q(Object obj, Object obj2, String str) throws e22 {
        throw new e22(str + obj + obj2);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void t(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void v(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    @Override // defpackage.wxg
    public final Object a(oup oupVar) {
        byte b = this.a;
        iuf iufVar = iuf.d;
        cbc cbcVar = (cbc) oupVar;
        switch (b) {
            case 0:
                r6h r6hVar = cbcVar.f;
                r6hVar.d.ordinal();
                gs7.b(r6hVar);
                r6hVar.e.equals(iufVar);
                return new kr7();
            default:
                r6h r6hVar2 = cbcVar.f;
                r6hVar2.d.ordinal();
                return new gs7((k9h) vub.d.a(k9h.class, r6hVar2.a).a(r6hVar2.c), gs7.b(r6hVar2), r6hVar2.e.equals(iufVar) ? new byte[]{0} : new byte[0]);
        }
    }

    public final s6h b(c0g c0gVar) {
        bai baiVar = (bai) c0gVar;
        jvb jvbVarZ = kvb.z();
        jvbVarZ.i("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        w9i w9iVarY = x9i.y();
        cai caiVarX = dai.x();
        i8a i8aVarG = iai.h.G(baiVar.d);
        caiVarX.f();
        ((av9) caiVarX).b.y(i8aVarG);
        dai daiVarB = caiVarX.b();
        w9iVarY.f();
        ((av9) w9iVarY).b.B(daiVarB);
        int i = baiVar.a;
        w9iVarY.f();
        ((av9) w9iVarY).b.A(i);
        c54 c54VarB = iai.b(baiVar.b);
        w9iVarY.f();
        ((av9) w9iVarY).b.C(c54VarB);
        jvbVarZ.j(w9iVarY.b().e());
        jvbVarZ.g(iai.g.G(baiVar.c));
        return s6h.D(jvbVarZ.b());
    }

    public final double d(double d) {
        return d;
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        switch (this.a) {
            case 5:
                ((cnh) iVar).X((zmh) obj);
                break;
            case 6:
                c85 c85Var = (c85) obj;
                wmh wmhVar = (wmh) iVar;
                wmhVar.d = c85Var;
                pt1 pt1Var = wmhVar.b;
                ((StylingTextView) pt1Var.b).setText(c85Var.a.c().a(((StylingTextView) pt1Var.b).getResources()));
                int size = c85Var.b.size();
                yq1 yq1Var = (StylingTextView) pt1Var.c;
                yq1Var.setText(yq1Var.getResources().getQuantityString(2131886113, size, Integer.valueOf(size)));
                wmhVar.X();
                break;
            case 7:
                hj8 hj8Var = (hj8) obj;
                ymh ymhVar = (ymh) iVar;
                ymhVar.d = hj8Var;
                ymhVar.X();
                OperaTextView operaTextView = ((fbl) ymhVar.b.c).f;
                operaTextView.setText(hj8Var.a.c().a(operaTextView.getResources()));
                wf wfVar = ymhVar.e;
                ArrayList arrayList = hj8Var.b;
                ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                int size2 = arrayList.size();
                int i = 0;
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(new zmh((enh) obj2));
                }
                wfVar.K(arrayList2);
                break;
            default:
                ((cnh) iVar).X((zmh) obj);
                break;
        }
    }

    public final void j(yo2 yo2Var) {
    }

    public final g3o l0(View view, g3o g3oVar) {
        r9b r9bVarI = g3oVar.a.i(647);
        int i = Build.VERSION.SDK_INT;
        t2o t2oVar = i >= 36 ? new t2o(g3oVar) : i >= 35 ? new s2o(g3oVar) : i >= 34 ? new r2o(g3oVar) : i >= 31 ? new q2o(g3oVar) : i >= 30 ? new p2o(g3oVar) : new o2o(g3oVar);
        t2oVar.d(647, r9b.c(0, r9bVarI.b, 0, r9bVarI.d));
        return t2oVar.b();
    }
}
