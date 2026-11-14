package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class d6e implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d6e(ae5 ae5Var, ek6 ek6Var, boolean z, String str, e6g e6gVar) {
        this.d = ae5Var;
        this.e = ek6Var;
        this.c = z;
        this.b = str;
        this.f = e6gVar;
    }

    public /* synthetic */ d6e(uyj uyjVar, String str, Locale locale, String str2, boolean z) {
        this.d = uyjVar;
        this.b = str;
        this.e = locale;
        this.f = str2;
        this.c = z;
    }

    public final Object invoke() {
        boolean z;
        byte b = this.a;
        boolean z2 = this.c;
        Object obj = this.f;
        Object obj2 = this.e;
        String str = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                return qyn.V(new Object[]{(ae5) obj3, new k7i((ek6) obj2, z2, str, (e6g) obj)});
            default:
                uyj uyjVar = (uyj) obj3;
                Locale locale = (Locale) obj2;
                String str2 = (String) obj;
                pyl pylVar = uyjVar.h;
                kze kzeVar = uyjVar.b;
                if (Intrinsics.a((String) pylVar.c, str)) {
                    z = false;
                } else {
                    pylVar.c = null;
                    pylVar.d = null;
                    pylVar.b = 0;
                    ((ArrayList) pylVar.e).clear();
                    pylVar.c = str;
                    z = true;
                }
                if (z) {
                    int language = uyjVar.d.setLanguage(locale);
                    if (language == -2) {
                        kzeVar.n(new vyj(ryj.b));
                        return Unit.a;
                    }
                    if (language == -1) {
                        kzeVar.n(new vyj(ryj.a));
                        return Unit.a;
                    }
                    kzeVar.n(new xyj(str));
                }
                lqh lqhVar = new lqh();
                lqhVar.a = z;
                vvf vvfVar = new vvf(uyjVar, lqhVar, (byte) 29);
                sa2 sa2Var = (sa2) pylVar.f;
                az7 az7Var = new az7(str2);
                pylVar.d = az7Var;
                tyj tyjVar = (tyj) CollectionsKt.R((ArrayList) pylVar.e);
                int length = tyjVar != null ? tyjVar.c.length() + tyjVar.d : 0;
                String strSubstring = az7Var.b.substring(length);
                if (z2) {
                    for (ffl fflVar : sa2Var.g(length, strSubstring)) {
                        vvfVar.invoke(pylVar.h(fflVar.b, fflVar.a));
                    }
                } else if (StringsKt.F(strSubstring, '\n')) {
                    String strSubstring2 = strSubstring.substring(0, StringsKt.P(strSubstring, '\n', 0, 6));
                    if (!StringsKt.N(strSubstring2)) {
                        for (ffl fflVar2 : sa2Var.g(length, strSubstring2)) {
                            vvfVar.invoke(pylVar.h(fflVar2.b, fflVar2.a));
                        }
                    }
                }
                return Unit.a;
        }
    }
}
