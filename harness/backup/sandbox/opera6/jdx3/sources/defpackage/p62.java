package defpackage;

import com.leanplum.internal.Constants;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class p62 {
    public final ole a;
    public final qyj b;
    public final g22 c;
    public final g7m d;
    public final a52 e;
    public final Function1 f;

    public p62(ole oleVar, qyj qyjVar, g22 g22Var, g7m g7mVar, a52 a52Var, Function1 function1) {
        this.a = oleVar;
        this.b = qyjVar;
        this.c = g22Var;
        this.d = g7mVar;
        this.e = a52Var;
        this.f = function1;
    }

    public final void a(wyh wyhVar, m62 m62Var) {
        n9a n9aVar;
        pqh pqhVar = new pqh();
        byte b = 22;
        if (wyhVar.equals(t52.k) || (wyhVar instanceof s52) || (wyhVar instanceof v52)) {
            n9aVar = new n9a((byte) 22);
        } else if (!(wyhVar instanceof u52)) {
            h9o.p();
            return;
        } else {
            pqhVar.a = ((u52) wyhVar).k;
            n9aVar = new zpa(b);
        }
        ws1 ws1Var = new ws1(m62Var, pqhVar, this, this.e.b(), (byte) 1);
        qq8 qq8Var = (qq8) this.a.a;
        vpb vpbVar = new vpb();
        orb orbVar = new orb();
        orbVar.p(n9aVar.a(), "spec");
        vpbVar.a(orbVar);
        String strH = qq8Var.h();
        orb orbVarJ = o18.j("jsonrpc", "2.0", "method", "actions.v1.createNewChat");
        orbVarJ.p(vpbVar, Constants.Params.PARAMS);
        orbVarJ.p(strH, "id");
        qq8Var.l(orbVarJ, new t02(ws1Var, (byte) 7));
    }

    public final void b(long j, Function1 function1) {
        o62 o62Var = new o62(function1, (byte) 0);
        ole oleVar = this.a;
        oleVar.getClass();
        vpb vpbVar = new vpb();
        orb orbVar = new orb();
        vpbVar.a(orbVar);
        orbVar.o(j, "id");
        qq8 qq8Var = (qq8) oleVar.a;
        String strH = qq8Var.h();
        orb orbVarJ = o18.j("jsonrpc", "2.0", "method", "actions.v1.requestChatDump");
        orbVarJ.p(vpbVar, Constants.Params.PARAMS);
        orbVarJ.p(strH, "id");
        qq8Var.l(orbVarJ, new d42(o62Var, (byte) 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r17, java.lang.String r19, defpackage.z42 r20) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p62.c(long, java.lang.String, z42):void");
    }
}
