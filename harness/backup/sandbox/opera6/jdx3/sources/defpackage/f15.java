package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class f15 implements srg {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f15(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final boolean apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                cre creVar = (cre) obj2;
                g15 g15Var = (g15) obj;
                return (g15Var.a.c.equals(creVar.c) && g15Var.a.d.equals(creVar.d)) ? false : true;
            case 1:
                String str = (String) obj2;
                bre breVar = (bre) obj;
                return x77.h(breVar).toLowerCase(Locale.US).contains(str) || breVar.d.startsWith(str);
            case 2:
                return w1h.o((SharedPreferences) ((b59) ((tmk) obj2).a.a).get(), "acked_tokens", Collections.EMPTY_SET).contains((String) obj);
            case 3:
                return ((epk) obj2).test((n8f) obj);
            case 4:
                return ((epk) obj2).test((jn7) obj);
            case 5:
                v3m v3mVar = (v3m) obj2;
                szb szbVar = (szb) obj;
                return v3mVar.d().equals(szbVar) || v3mVar.e(szbVar, 1);
            case 6:
                v3m v3mVar2 = (v3m) ((z3m) obj2).l.b;
                return nb6.J(sfe.Q(v3m.c(v3mVar2.a), new f15(v3mVar2, (byte) 5))).contains(((y3m) obj).a);
            case 7:
                return ((urg) obj2).test((kqm) obj);
            default:
                xxc xxcVar = (xxc) obj;
                return xxcVar.f().b() && ((HashSet) obj2).contains(xxcVar.f().c);
        }
    }
}
