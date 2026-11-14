package defpackage;

import J.N;
import android.util.Base64;
import com.opera.api.Callback;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class ji2 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ li2 b;

    public /* synthetic */ ji2(li2 li2Var, byte b) {
        this.a = b;
        this.b = li2Var;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 2;
        orb orbVar = null;
        li2 li2Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                li2Var.i = null;
                myk mykVar = li2Var.a;
                bpd bpdVarB = mykVar.b();
                db dbVar = mykVar.b;
                String strC = !dbVar.f() ? null : dbVar.c();
                mykVar.c.getClass();
                avj avjVar = cak.d;
                String[] strArr = !avj.b(1) ? new String[0] : (String[]) N.MeEAPUBl();
                HashSet hashSet = new HashSet(na2.j(strArr.length));
                Collections.addAll(hashSet, strArr);
                Boolean boolValueOf = !dbVar.f() ? null : Boolean.valueOf(dbVar.d());
                ji2 ji2Var = new ji2(li2Var, (byte) 5);
                orb orbVar2 = new orb();
                if (bpdVarB != null) {
                    String str2 = (String) bpdVarB.b;
                    byte[] bArr = (byte[]) bpdVarB.c;
                    orb orbVarP = vep.p("auth_password", str2);
                    orbVarP.p(bArr != null ? Base64.encodeToString(bArr, 2) : null, "bootstrap_token");
                    orbVar = orbVarP;
                }
                orbVar2.p(hi2.f(str, orbVar, strC, boolValueOf, hashSet), "start_sync_data");
                li2Var.i = li2Var.j("SignInToSyncRequestMessage", orbVar2, ji2Var);
                break;
            case 1:
                li2Var.i = null;
                li2Var.a.b.j(true);
                li2Var.m(2, (String) obj);
                break;
            case 2:
                li2Var.i = null;
                li2Var.m(2, (String) obj);
                break;
            case 3:
                li2Var.i = null;
                li2Var.h = (byte) 3;
                String str3 = li2Var.c;
                ji2 ji2Var2 = new ji2(li2Var, b2);
                mgh mghVar = new mgh((Object) null, new ji2(li2Var, b3), (byte) 8);
                new s14(li2Var, str3, mghVar, ji2Var2);
                li2Var.i = mghVar;
                break;
            case 4:
                li2Var.i = null;
                li2Var.m(2, (String) obj);
                break;
            case 5:
                Long l = (Long) obj;
                li2Var.i = null;
                if (l != null) {
                    li2Var.j = l.longValue();
                    break;
                } else {
                    li2Var.c(2);
                    break;
                }
            case 6:
                li2Var.i = null;
                li2Var.m(2, (String) obj);
                break;
            default:
                Long l2 = (Long) obj;
                li2Var.i = null;
                if (l2 != null) {
                    li2Var.a();
                    ii2 ii2Var = li2Var.d;
                    if (ii2Var != null) {
                        li2Var.d = null;
                        ii2Var.f(1);
                        break;
                    }
                } else {
                    li2Var.c(2);
                    break;
                }
                break;
        }
    }
}
