package ads_mobile_sdk;

import defpackage.glp;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class h21 {
    public final URL a;
    public final String b;
    public final Map c;
    public final byte[] d;
    public final in0 e;
    public final glp f;

    public h21(URL url, String str, Map map, byte[] bArr, in0 in0Var, glp glpVar) {
        this.a = url;
        this.b = str;
        this.c = map;
        this.d = bArr;
        this.e = in0Var;
        this.f = glpVar;
    }

    public final kvh h() {
        fvh fvhVar = new fvh();
        String string = this.a.toString();
        rma rmaVar = new rma((byte) 4);
        rmaVar.o(string, (hra) null);
        fvhVar.a = rmaVar.d();
        byte[] bArr = this.d;
        fvhVar.e(this.b, bArr != null ? qvh.d(rvh.Companion, bArr, (esd) null, 0, 7) : null);
        for (Map.Entry entry : this.c.entrySet()) {
            fvhVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        return new kvh(fvhVar);
    }

    public final String toString() {
        return "HttpRequest{method=" + this.b + ", url=" + this.a + ", headers=" + this.c + "}";
    }
}
