package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class s3n implements esk {
    public static final Size g = new Size(1280, 720);
    public final String a;
    public final zpl b;
    public final s4n c;
    public final Size d;
    public final ip7 e;
    public final Range f;

    public s3n(String str, zpl zplVar, s4n s4nVar, Size size, ip7 ip7Var, Range range) {
        this.a = str;
        this.b = zplVar;
        this.c = s4nVar;
        this.d = size;
        this.e = ip7Var;
        this.f = range;
    }

    @Override // defpackage.esk
    public final Object get() {
        fp2 fp2Var;
        Integer num;
        LinkedHashMap linkedHashMap = k3n.a;
        ii4 ii4VarA = k3n.a(this.c, this.f);
        ip7 ip7Var = this.e;
        int i = ip7Var.b;
        int i2 = ii4VarA.b;
        Size size = this.d;
        int width = size.getWidth();
        Size size2 = g;
        int iC = k3n.c(14000000, i, 8, i2, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight());
        HashMap map = op7.e;
        String str = this.a;
        Map map2 = (Map) map.get(str);
        int iIntValue = (map2 == null || (num = (Integer) map2.get(ip7Var)) == null) ? -1 : num.intValue();
        Map map3 = (Map) k3n.a.get(str);
        if (map3 == null || (fp2Var = (fp2) map3.get(Integer.valueOf(iIntValue))) == null) {
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
        tahVarA.c = Integer.valueOf(iIntValue);
        tahVarA.g = fp2Var;
        return tahVarA.i();
    }
}
