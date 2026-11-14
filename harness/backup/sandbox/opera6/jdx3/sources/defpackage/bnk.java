package defpackage;

import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class bnk {
    public final String a;
    public final String b;
    public final h1b c;

    public bnk(String str, String str2, h1b h1bVar) {
        this.a = str;
        this.b = str2;
        this.c = h1bVar;
    }

    public final fdn a() {
        String str;
        Locale locale = Locale.ROOT;
        String str2 = this.a;
        int iK = vtp.K(2131231685, str2.toLowerCase(locale));
        String str3 = this.b;
        pt0 pt0Var = pt0.f;
        fdn fdnVar = new fdn(str2, str2, str3, pt0Var, false, 0, iK, null, false);
        HashSet hashSet = new HashSet();
        a1b a1bVarU = this.c.u(0);
        while (a1bVarU.hasNext()) {
            ank ankVar = (ank) a1bVarU.next();
            String str4 = ankVar.b;
            String str5 = ankVar.b;
            if (hashSet.add(str4)) {
                fdn fdnVar2 = fdnVar;
                fdn fdnVar3 = new fdn(str2, z1m.l(new StringBuilder(str2), ":", str5), str5, pt0Var, false, 0, fdnVar2.i, fdnVar2, false);
                str = str2;
                fdnVar = fdnVar2;
                fdnVar.g.add(fdnVar3);
            } else {
                str = str2;
            }
            str2 = str;
        }
        return fdnVar;
    }
}
