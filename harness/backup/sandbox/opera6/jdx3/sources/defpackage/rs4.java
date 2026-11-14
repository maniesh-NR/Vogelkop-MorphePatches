package defpackage;

import android.net.Uri;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class rs4 implements Function1 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ui3 b;
    public final /* synthetic */ Set c;

    public /* synthetic */ rs4(ui3 ui3Var, Set set) {
        this.b = ui3Var;
        this.c = set;
    }

    public /* synthetic */ rs4(ui3 ui3Var, Set set, us4 us4Var) {
        this.b = ui3Var;
        this.c = set;
    }

    public final Object invoke(Object obj) {
        xi3 xi3Var;
        pxh pxhVar;
        pxh pxhVar2;
        byte b = this.a;
        boolean zContains = true;
        Set set = this.c;
        ui3 ui3Var = this.b;
        xj3 xj3Var = (xj3) obj;
        switch (b) {
            case 0:
                wj3 wj3Var = xj3Var.a;
                String str = xj3Var.b;
                int iOrdinal = wj3Var.a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        return null;
                    }
                    if (iOrdinal != 3) {
                        h9o.p();
                        return null;
                    }
                }
                wi3 wi3Var = (wi3) ui3Var.d.get(str);
                if (wi3Var == null || (xi3Var = wi3Var.a) == null) {
                    return null;
                }
                String str2 = xi3Var.c;
                pxh qxhVar = (pxh) lic.a.get(str);
                if (qxhVar != null) {
                    pxhVar = qxhVar;
                } else if (str2 != null) {
                    qxhVar = new qxh(str2);
                    pxhVar = qxhVar;
                } else {
                    pxhVar = null;
                }
                if (pxhVar == null) {
                    return null;
                }
                String str3 = xi3Var.d;
                pxh qxhVar2 = (pxh) lic.b.get(str);
                if (qxhVar2 != null) {
                    pxhVar2 = qxhVar2;
                } else if (str3 != null) {
                    qxhVar2 = new qxh(str3);
                    pxhVar2 = qxhVar2;
                } else {
                    pxhVar2 = null;
                }
                if ((xi3Var.a & 8) == 8) {
                    return null;
                }
                boolean zContains2 = set.contains(str);
                String str4 = xj3Var.b;
                ti3 ti3Var = xi3Var.b;
                String str5 = xi3Var.e;
                return new nvm(str4, pxhVar, pxhVar2, ti3Var, str5 != null ? Uri.parse(str5) : null, zContains2);
            default:
                String str6 = xj3Var.b;
                wi3 wi3Var2 = (wi3) ui3Var.d.get(str6);
                xi3 xi3Var2 = wi3Var2 != null ? wi3Var2.a : null;
                if (xi3Var2 != null) {
                    int i = xi3Var2.a;
                    if (set == null) {
                        if ((i & 4) != 4) {
                            zContains = false;
                        }
                    } else if ((i & 12) != 12) {
                        zContains = set.contains(str6);
                    }
                }
                if (zContains) {
                    return str6;
                }
                return null;
        }
    }
}
