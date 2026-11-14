package defpackage;

import J.N;
import android.util.Base64;
import com.opera.api.Callback;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class mi2 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pi2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ mi2(pi2 pi2Var, long j, byte b) {
        this.a = b;
        this.b = pi2Var;
        this.c = j;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        orb orbVarP;
        byte b = this.a;
        long j = this.c;
        pi2 pi2Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                pi2Var.h = null;
                myk mykVar = pi2Var.a;
                bpd bpdVarB = mykVar.b();
                db dbVar = mykVar.b;
                String strC = !dbVar.f() ? null : dbVar.c();
                mykVar.c.getClass();
                avj avjVar = cak.d;
                String[] strArr = !avj.b(1) ? new String[0] : (String[]) N.MeEAPUBl();
                HashSet hashSet = new HashSet(na2.j(strArr.length));
                Collections.addAll(hashSet, strArr);
                Boolean boolValueOf = !dbVar.f() ? null : Boolean.valueOf(dbVar.d());
                ab abVar = new ab(pi2Var, (byte) 22);
                if (bpdVarB != null) {
                    String str2 = (String) bpdVarB.b;
                    byte[] bArr = (byte[]) bpdVarB.c;
                    orbVarP = vep.p("auth_password", str2);
                    orbVarP.p(bArr != null ? Base64.encodeToString(bArr, 2) : null, "bootstrap_token");
                } else {
                    orbVarP = null;
                }
                orb orbVarF = hi2.f(str, orbVarP, strC, boolValueOf, hashSet);
                orb orbVar = new orb();
                orbVar.p(orbVarF, "start_sync_data");
                orbVar.p(null, "error_detail");
                orbVar.p(String.valueOf(j), "in_response_to");
                pi2Var.h = pi2Var.j("SpawnStartSyncDataResponseMessage", orbVar, abVar);
                break;
            case 1:
                pi2Var.h = pi2Var.k(j, vep.p("error_string", str), new ab(pi2Var, (byte) 22));
                break;
            case 2:
                pi2Var.h = pi2Var.k(j, vep.p("error_string", str), new ab(pi2Var, (byte) 22));
                break;
            default:
                pi2Var.a.b.j(true);
                pi2Var.h = pi2Var.k(j, vep.p("error_string", str), new ab(pi2Var, (byte) 22));
                break;
        }
    }
}
