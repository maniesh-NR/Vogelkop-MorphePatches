package ads_mobile_sdk;

import android.net.Uri;
import defpackage.glp;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class g21 {
    public URL a;
    public String b;
    public final LinkedHashMap c;
    public byte[] d;
    public final in0 e;
    public glp f;
    public final ArrayList g;

    public g21() {
        this.b = "GET";
        this.c = new LinkedHashMap();
        this.g = new ArrayList();
    }

    public g21(h21 h21Var) {
        this.b = "GET";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.c = linkedHashMap;
        this.g = new ArrayList();
        this.a = h21Var.a;
        this.b = h21Var.b;
        linkedHashMap.putAll(h21Var.c);
        this.d = h21Var.d;
        this.e = h21Var.e;
        this.f = h21Var.f;
    }

    public final h21 a() {
        URL url;
        URL url2 = this.a;
        if (url2 == null) {
            qp2.n("HttpRequest.Builder: URL must be set before calling build()");
            return null;
        }
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            url = url2;
        } else {
            Uri.Builder builderBuildUpon = Uri.parse(url2.toString()).buildUpon();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Pair pair = (Pair) obj;
                builderBuildUpon.appendQueryParameter((String) pair.a, (String) pair.b);
            }
            url = new URL(builderBuildUpon.build().toString());
        }
        return new h21(url, this.b, rbd.i(this.c), this.d, this.e, this.f);
    }

    public final void a(String str, String str2) {
        LinkedHashMap linkedHashMap = this.c;
        String str3 = (String) linkedHashMap.get(str);
        if (str3 != null) {
            str2 = sko.k(str3, ", ", str2);
        }
        linkedHashMap.put(str, str2);
    }

    public final void a(String str, byte[] bArr) {
        if (str.length() <= 0) {
            qp2.o("HTTP method must not be empty");
            return;
        }
        if (bArr == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH"))) {
            bxl.d(sko.k("Method ", str, " must have a request body."));
        } else {
            this.b = str;
            this.d = bArr;
        }
    }

    public final void b(String str) {
        this.a = new URL(str);
    }

    public final void b(String str, String str2) {
        this.g.add(new Pair(str, str2));
    }

    public final void b(String str, byte[] bArr) {
        a("POST", bArr);
        this.c.put("Content-Type", str);
    }
}
