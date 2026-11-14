package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ogc extends u5 {
    public final /* synthetic */ byte a;
    public final Object b;

    public ogc(Context context) {
        this.a = (byte) 2;
        this.b = new abl(new fr(context));
    }

    public /* synthetic */ ogc(ks3 ks3Var, byte b) {
        this.a = b;
        this.b = ks3Var;
    }

    public final void a() {
        switch (this.a) {
            case 2:
                abl ablVar = (abl) this.b;
                ablVar.b = false;
                ablVar.c = false;
                ablVar.e = 0;
                ablVar.d = false;
                ablVar.f.clear();
                break;
        }
    }

    public final void b(shf shfVar) {
        u5 u5Var;
        u5 u5Var2;
        switch (this.a) {
            case 0:
                ks3 ks3Var = (ks3) this.b;
                ArrayList arrayList = (ArrayList) shfVar.a;
                ArrayList arrayList2 = (ArrayList) shfVar.b;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (true) {
                    u5Var = null;
                    if (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        u5Var2 = (u5) obj;
                        if (gw5.class.isAssignableFrom(u5Var2.getClass())) {
                        }
                    } else {
                        u5Var2 = null;
                    }
                }
                if (u5Var2 == null) {
                    int size2 = arrayList.size();
                    while (true) {
                        if (i < size2) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            u5 u5Var3 = (u5) obj2;
                            if (gw5.class.isAssignableFrom(u5Var3.getClass())) {
                                u5Var = u5Var3;
                            }
                        }
                    }
                    if (u5Var == null) {
                        j9h.n("Requested plugin is not added: ", gw5.class.getName(), ", plugins: ", arrayList);
                        break;
                    } else {
                        shfVar.n(u5Var);
                        u5Var2 = u5Var;
                    }
                }
                ((gw5) u5Var2).a.add(new ngc(ks3Var));
                break;
        }
    }

    public final void c(vzk vzkVar) {
        switch (this.a) {
            case 2:
                vzkVar.u(Collections.singletonList(new wgk((byte) 1)));
                break;
        }
    }

    public final void e(rc6 rc6Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                rc6Var.a(mfc.class, new fw5((ks3) obj, (byte) 2));
                break;
            case 2:
                abl ablVar = (abl) obj;
                rc6Var.a(kal.class, new zal(ablVar, (byte) 0));
                rc6Var.a(mal.class, new zal(ablVar, (byte) 1));
                rc6Var.a(sal.class, new zal(ablVar, (byte) 2));
                rc6Var.a(xal.class, new zal(ablVar, (byte) 3));
                rc6Var.a(oal.class, new zal(ablVar, (byte) 4));
                break;
        }
    }
}
