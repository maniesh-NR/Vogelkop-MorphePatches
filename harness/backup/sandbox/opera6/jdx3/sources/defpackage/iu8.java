package defpackage;

import com.opera.android.BrowserActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class iu8 extends ba2 {
    public final BrowserActivity b;
    public final uqe c;
    public final p12 d;
    public final x79 e;
    public final String f;
    public final p0c g;

    /* JADX WARN: Multi-variable type inference failed */
    public iu8(BrowserActivity browserActivity, xw8 xw8Var, uqe uqeVar, p12 p12Var, x79 x79Var) {
        super(pue.class);
        this.b = browserActivity;
        this.c = uqeVar;
        this.d = p12Var;
        this.e = x79Var;
        this.f = xw8Var.b.a();
        this.g = (p0c) browserActivity.E0().b.get();
        new xoi(browserActivity, xw8Var.y, xw8Var.g, new vx(xw8Var, (byte) 19), new hu8(xw8Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    @Override // defpackage.fa2, defpackage.rjm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.sjm r19) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu8.b(sjm):void");
    }

    @Override // defpackage.aa2
    public final void d(int i, ArrayList arrayList) {
        x79 x79Var = this.e;
        if (x79Var != null) {
            for (int size = arrayList.size() - 1; size >= i; size--) {
                ja2 ja2Var = (ja2) arrayList.get(size);
                if (ja2Var instanceof j82) {
                    oqe oqeVar = (oqe) ((HashMap) x79Var.d).get(((pue) ((j82) ja2Var)).c);
                    if (oqeVar != null) {
                        arrayList.add(size, pue.e((msh) oqeVar, (String) x79Var.c, false));
                    }
                }
            }
        }
        vue vueVar = (vue) this;
        for (int size2 = arrayList.size() - 1; size2 >= i; size2--) {
            ja2 ja2Var2 = (ja2) arrayList.get(size2);
            if (ja2Var2 instanceof j82) {
                oqe oqeVar2 = ((pue) ((j82) ja2Var2)).c;
                msh mshVar = oqeVar2 instanceof msh ? (msh) oqeVar2 : null;
                if (mshVar != null) {
                    ArrayList arrayListH = p12.h(mshVar);
                    if (arrayListH.isEmpty()) {
                        continue;
                    } else if (!mshVar.A.b) {
                        return;
                    } else {
                        arrayList.add(size2 + 1, new fve(mshVar, arrayListH, (String) vueVar.d.d));
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // defpackage.fa2
    public final void v() {
        this.d.f = null;
    }
}
