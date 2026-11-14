package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class t3n implements esk {
    public final String a;
    public final zpl b;
    public final s4n c;
    public final Size d;
    public final hn2 e;
    public final ip7 f;
    public final Range g;

    public t3n(String str, zpl zplVar, s4n s4nVar, Size size, hn2 hn2Var, ip7 ip7Var, Range range) {
        this.a = str;
        this.b = zplVar;
        this.c = s4nVar;
        this.d = size;
        this.e = hn2Var;
        this.f = ip7Var;
        this.g = range;
    }

    @Override // defpackage.esk
    public final Object get() {
        fp2 fp2Var;
        LinkedHashMap linkedHashMap = k3n.a;
        ii4 ii4VarA = k3n.a(this.c, this.g);
        hn2 hn2Var = this.e;
        int i = hn2Var.c;
        int i2 = this.f.b;
        int i3 = hn2Var.h;
        int i4 = ii4VarA.b;
        int i5 = hn2Var.d;
        Size size = this.d;
        int iC = k3n.c(i, i2, i3, i4, i5, size.getWidth(), hn2Var.e, size.getHeight(), hn2Var.f);
        int i6 = hn2Var.g;
        LinkedHashMap linkedHashMap2 = k3n.a;
        String str = this.a;
        Map map = (Map) linkedHashMap2.get(str);
        if (map == null || (fp2Var = (fp2) map.get(Integer.valueOf(i6))) == null) {
            fp2Var = fp2.d;
        }
        tah tahVarA = ep2.a();
        if (str == null) {
            t3p.q("Null mimeType");
            return null;
        }
        tahVarA.b = str;
        zpl zplVar = this.b;
        if (zplVar == null) {
            t3p.q("Null inputTimebase");
            return null;
        }
        tahVarA.d = zplVar;
        if (size == null) {
            t3p.q("Null resolution");
            return null;
        }
        tahVarA.e = size;
        tahVarA.k = Integer.valueOf(iC);
        tahVarA.h = Integer.valueOf(ii4VarA.a);
        tahVarA.i = Integer.valueOf(ii4VarA.b);
        tahVarA.c = Integer.valueOf(i6);
        tahVarA.g = fp2Var;
        return tahVarA.i();
    }
}
