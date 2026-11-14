package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final /* synthetic */ class kv1 implements kri {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kv1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.kri
    public final void a(q6e q6eVar) {
        String strJ;
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((kze) obj).r(q6eVar.b());
                break;
            case 1:
                ((iv7) obj).d();
                break;
            case 2:
                xf8.F0(((u0a) obj).a, s0a.a);
                break;
            case 3:
                ghf ghfVar = (ghf) obj;
                List<eri> listUnmodifiableList = Collections.unmodifiableList(q6eVar.a);
                ehc ehcVarB = a.b();
                for (eri eriVar : listUnmodifiableList) {
                    if (!eriVar.d() && (strJ = eriVar.j()) != null) {
                        ehcVarB.add(strJ);
                    }
                }
                ((qie) ghfVar.d).n(new oml(((umi) ghfVar.b).c(new jri(a.a(ehcVarB), ghfVar, b2))), null);
                break;
            case 4:
                ((m6m) obj).a(false);
                break;
            default:
                ((ydn) obj).G(Collections.unmodifiableList(q6eVar.a));
                break;
        }
    }
}
