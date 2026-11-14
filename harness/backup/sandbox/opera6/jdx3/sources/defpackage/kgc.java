package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class kgc implements xbd {
    public final /* synthetic */ ks3 a;
    public final /* synthetic */ lgc b;

    public kgc(ks3 ks3Var, lgc lgcVar) {
        this.a = ks3Var;
        this.b = lgcVar;
    }

    @Override // defpackage.xbd
    public final void a(s9i s9iVar, k73 k73Var) {
        mgc mgcVar;
        jc9 jc9Var = (jc9) s9iVar.c;
        yma ymaVar = (yma) k73Var;
        lgc lgcVar = this.b;
        o5h o5hVar = lgcVar.a;
        String str = ymaVar.g;
        ks3 ks3Var = this.a;
        String str2 = (String) ks3Var.e;
        String str3 = (String) ks3Var.f;
        if (c.q(str, str2, false)) {
            int iA0 = s9iVar.a0();
            String strJ = "";
            while (true) {
                ymaVar = (k73) ymaVar.f;
                if (ymaVar == null || ((ymaVar instanceof yma) && Intrinsics.a(ymaVar.g, str3))) {
                    break;
                } else if (ymaVar instanceof nel) {
                    strJ = sko.j(strJ, ((nel) ymaVar).g);
                }
            }
            jc9Var.b(o5hVar, new mgc(iA0, strJ));
            return;
        }
        if (!Intrinsics.a(ymaVar.g, str3) || (mgcVar = (mgc) jc9Var.a.get(o5hVar)) == null) {
            return;
        }
        jc9Var.a.remove(o5hVar);
        cxj cxjVar = (cxj) s9iVar.d;
        int i = mgcVar.a;
        int iA02 = s9iVar.a0();
        ks3 ks3Var2 = lgcVar.b;
        ArrayList arrayList = (ArrayList) ks3Var2.i;
        String str4 = null;
        if (arrayList != null) {
            str4 = (String) (arrayList.isEmpty() ? null : arrayList.remove(0));
        }
        ks3Var2.K(cxjVar, str4, mgcVar.b, i, iA02);
    }
}
