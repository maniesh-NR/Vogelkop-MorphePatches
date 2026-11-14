package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ky implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ky(Object obj, int i, Object obj2, Serializable serializable, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj2;
        this.d = serializable;
        this.e = obj;
    }

    public ky(Object obj, e9a e9aVar, Function0 function0, icp icpVar, int i) {
        this.a = (byte) 2;
        this.c = obj;
        this.d = function0;
        this.e = icpVar;
        this.b = i;
    }

    public /* synthetic */ ky(rop ropVar, String str, int i, String str2) {
        this.a = (byte) 3;
        this.c = ropVar;
        this.d = str;
        this.b = i;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Uri uri;
        byte b = this.a;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                i5o i5oVar = (i5o) obj;
                jz jzVar = (jz) ((jy) i5oVar.c).get();
                yz yzVar = (yz) obj3;
                String str2 = (String) obj2;
                nz nzVar = (nz) i5oVar.k;
                String str3 = nzVar != null ? nzVar.o : "";
                jzVar.getClass();
                yo yoVar = yzVar.i;
                HashMap map = jzVar.d;
                StringBuilder sb = new StringBuilder("ad_dot_");
                if (i == 1) {
                    str = "IMPRESSION";
                } else {
                    if (i != 2) {
                        throw null;
                    }
                    str = "CLICK";
                }
                sb.append(str);
                sb.append("_");
                sb.append(yoVar.name());
                String string = sb.toString();
                sy syVar = jzVar.c;
                int iA = vep.A(i);
                if (iA == 0) {
                    uri = (Uri) ((k5o) syVar.get()).b;
                } else {
                    if (iA != 1) {
                        hai.d();
                        return;
                    }
                    uri = (Uri) ((k5o) syVar.get()).c;
                }
                Uri uri2 = uri;
                String strP = fki.p(uri2, string);
                iz izVar = (iz) map.get(strP);
                if (izVar == null) {
                    iz izVar2 = new iz(jzVar.a, jzVar.b, string, uri2, str3);
                    map.put(strP, izVar2);
                    izVar = izVar2;
                }
                uz uzVar = yzVar.n;
                fz fzVar = uzVar != null ? new fz(uzVar.a, uzVar.b, yzVar.l, 0, uzVar.c, str2) : null;
                if (fzVar != null) {
                    izVar.f.add(fzVar);
                    fzVar.a(izVar.b, izVar.d, izVar.e, izVar.g);
                    izVar.a();
                    return;
                }
                return;
            case 1:
                g3k g3kVar = (g3k) obj;
                if (g3kVar.b(i)) {
                    g3kVar.a.c(((v84) obj3).request()).enqueue(g3kVar);
                    return;
                } else {
                    g3kVar.c(((IOException) obj2).getMessage());
                    return;
                }
            case 2:
                if (((Boolean) ((Function0) obj2).invoke()).booleanValue()) {
                    return;
                }
                ((icp) obj).a(i, obj3);
                return;
            default:
                String str4 = (String) obj2;
                xpp xppVar = (xpp) ((gpp) ((rop) obj3).c).c.remove(str4);
                if (xppVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("targetPackage", str4);
                    bundle.putInt("errorCode", i);
                    bundle.putString("errorMessage", (String) obj);
                    xppVar.b.onError(bundle);
                    return;
                }
                return;
        }
    }
}
