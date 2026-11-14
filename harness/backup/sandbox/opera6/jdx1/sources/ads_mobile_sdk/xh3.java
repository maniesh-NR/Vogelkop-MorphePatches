package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.nsd;
import defpackage.p3p;
import java.util.ArrayList;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xh3 {
    public static final xh3 a = new xh3();

    public static d3k a(nx5 nx5Var, Function2 function2) {
        return defpackage.na2.B(nx5Var, h.a, null, new fsg(function2, null, (byte) 3), 2);
    }

    public static void a(av0 av0Var, boolean z) {
        String strJ;
        if (av0Var instanceof ev0) {
            strJ = ((ev0) av0Var).c;
        } else if (av0Var instanceof bv0) {
            bv0 bv0Var = (bv0) av0Var;
            String str = bv0Var.e;
            strJ = str == null ? bv0Var.c.getClass().getName() : str;
        } else if (av0Var instanceof kv0) {
            strJ = "WebView destroyed when method invoked.";
        } else if (av0Var instanceof jv0) {
            jv0 jv0Var = (jv0) av0Var;
            strJ = jv0Var.c + ": " + jv0Var.d + " on url: " + jv0Var.e;
        } else if (av0Var instanceof dv0) {
            nsd nsdVar = ((dv0) av0Var).c;
            strJ = nsdVar.E() + ": " + nsdVar.getMessage();
        } else if (av0Var instanceof cv0) {
            cv0 cv0Var = (cv0) av0Var;
            strJ = p3p.j(cv0Var.c, "Code: ", ", Message: ", cv0Var.d);
        } else if (av0Var instanceof gv0) {
            strJ = ((gv0) av0Var).c;
        } else if (av0Var instanceof fv0) {
            strJ = ((fv0) av0Var).c;
        } else {
            if (!(av0Var instanceof iv0)) {
                h9o.p();
                return;
            }
            strJ = ((iv0) av0Var).c;
        }
        a(strJ, av0Var.b(), false, z);
    }

    public static void a(Exception exc) {
        ArrayList arrayList = w8h.a(exc).s;
        String message = exc.getMessage();
        if (message == null) {
            message = exc.getClass().getName();
        }
        arrayList.add(message);
    }

    public static void a(String str) {
        rg3 rg3VarA = hh3.a();
        rg3VarA.e().m = false;
        rg3VarA.e().s.add(str);
    }

    public static void a(String str, Exception exc, int i) {
        if ((i & 2) != 0) {
            exc = null;
        }
        a(str, exc, true, false);
    }

    public static void a(String str, Throwable th, boolean z, boolean z2) {
        rg3 rg3VarA;
        if (z2) {
            rg3VarA = hh3.b().a;
            if (rg3VarA == null) {
                return;
            }
        } else {
            rg3VarA = hh3.a();
        }
        if (str != null) {
            rg3VarA.e().s.add(str);
        }
        rg3VarA.e().m = false;
        if (th != null) {
            if (z) {
                rg3VarA.a(th);
            } else {
                rg3VarA.b(th);
            }
        }
    }
}
