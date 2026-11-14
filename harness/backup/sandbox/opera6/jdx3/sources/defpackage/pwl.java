package defpackage;

import android.util.Base64;
import com.appsflyer.internal.o;
import com.leanplum.internal.Constants;
import java.security.PublicKey;
import java.text.ParseException;
import java.util.Date;

/* loaded from: classes.dex */
public class pwl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final PublicKey f;
    public final Date g;
    public final u1b h;

    public pwl(String str, String str2, String str3, String str4, String str5, PublicKey publicKey, Date date, u1b u1bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = publicKey;
        this.g = date;
        this.h = u1bVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.security.PublicKey] */
    public pwl(orb orbVar, byte b) throws Throwable {
        jsh jshVarJ;
        byte[] bArrDecode;
        Throwable th;
        Date date;
        jsh jshVarJ2;
        int iIndexOf;
        int i = 0;
        switch (b) {
            case 1:
                String strE = orbVar.e("id");
                String strE2 = orbVar.e(Constants.Kinds.DICTIONARY);
                String strE3 = orbVar.e(Constants.Params.NAME);
                String strE4 = orbVar.e("version");
                String strE5 = orbVar.e("kind");
                PublicKey publicKeyC = p36.c(Base64.decode(orbVar.e("public_key"), 0));
                if (publicKeyC == null) {
                    o.a("Badly formatted public_key");
                    throw null;
                }
                Date date2 = new Date(orbVar.a.optLong("last_seen", System.currentTimeMillis()));
                vpb vpbVarH = orbVar.h("capabilities");
                if (vpbVarH == null) {
                    int i2 = u1b.c;
                    jshVarJ = jsh.j;
                } else {
                    int i3 = u1b.c;
                    t1b t1bVar = new t1b(4);
                    while (i < vpbVarH.a.length()) {
                        t1bVar.g(vpbVarH.d(i));
                        i++;
                    }
                    jshVarJ = t1bVar.j();
                }
                this(strE, strE2, strE3, strE4, strE5, publicKeyC, date2, jshVarJ);
                return;
            default:
                String strE6 = orbVar.e("id");
                String strE7 = orbVar.e("group_id");
                String strE8 = orbVar.e(Constants.Params.NAME);
                String strM = orbVar.m("client_version", "");
                String strE9 = orbVar.e("kind");
                String strE10 = orbVar.e("public_key");
                int i4 = le9.g;
                if (!strE10.startsWith("-----BEGIN ") || (iIndexOf = strE10.indexOf("-----", 11)) == -1) {
                    bArrDecode = null;
                    th = null;
                } else {
                    th = null;
                    int iIndexOf2 = strE10.indexOf("-----END ", iIndexOf + 5);
                    bArrDecode = iIndexOf2 == -1 ? null : Base64.decode(strE10.substring(iIndexOf, iIndexOf2), 0);
                }
                Object objC = bArrDecode == null ? th : p36.c(bArrDecode);
                if (objC == null) {
                    o.a("Badly formatted public_key");
                    throw th;
                }
                try {
                    date = yjb.a(orbVar.m("last_seen", ""));
                } catch (ParseException unused) {
                    date = new Date();
                }
                Date date3 = date;
                vpb vpbVarH2 = orbVar.h("client_capabilities");
                if (vpbVarH2 == null) {
                    int i5 = u1b.c;
                    jshVarJ2 = jsh.j;
                } else {
                    int i6 = u1b.c;
                    t1b t1bVar2 = new t1b(4);
                    while (i < vpbVarH2.a.length()) {
                        t1bVar2.g(vpbVarH2.d(i));
                        i++;
                    }
                    jshVarJ2 = t1bVar2.j();
                }
                this(strE6, strE7, strE8, strM, strE9, objC, date3, jshVarJ2);
                return;
        }
    }
}
