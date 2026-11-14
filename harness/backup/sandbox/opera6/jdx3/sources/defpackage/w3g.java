package defpackage;

import J.N;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.Objects;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class w3g {
    public final int a;
    public final GURL b;
    public final String c;
    public final String d;
    public final GURL e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    public w3g(int i, GURL gurl, String str, String str2) {
        boolean zEquals = str2.length() == 0 ? false : "android".equals(Uri.parse(str2).normalizeScheme().getScheme());
        boolean zEquals2 = str2.length() != 0 ? "opera-user".equals(Uri.parse(str2).normalizeScheme().getScheme()) : false;
        this(i, gurl, null, zEquals2 ? z5i.C(str2) : gurl.c(), null, str, str2, zEquals, zEquals2);
    }

    public w3g(int i, GURL gurl, String str, String str2, GURL gurl2, String str3, String str4, boolean z, boolean z2) {
        this.a = i;
        this.b = gurl;
        if (TextUtils.isEmpty(str)) {
            if (z2) {
                str = z5i.C(str4);
            } else if (z) {
                str = rab.e(str4);
            } else if (gurl.c().isEmpty()) {
                str = "";
            } else {
                str = gurl.c();
                String str5 = (String) N.MnEPjazD(str, false);
                if (!TextUtils.isEmpty(str5)) {
                    str = str5;
                }
            }
        }
        this.c = str;
        this.d = str2;
        this.e = gurl2;
        this.f = str3;
        this.g = str4;
        this.h = z;
        this.i = z2;
    }

    public static int a(List list, w3g w3gVar) {
        if (list != null && w3gVar != null) {
            for (int i = 0; i < list.size(); i++) {
                if (((w3g) list.get(i)).a == w3gVar.a) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w3g.class == obj.getClass()) {
            w3g w3gVar = (w3g) obj;
            if (this.a == w3gVar.a && this.b.equals(w3gVar.b) && this.c.equals(w3gVar.c) && this.d.equals(w3gVar.d) && this.f.equals(w3gVar.f) && this.g.equals(w3gVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, this.f, this.g);
    }
}
