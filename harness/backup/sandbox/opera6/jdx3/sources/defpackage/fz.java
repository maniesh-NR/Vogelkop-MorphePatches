package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fz {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;

    public fz(String str, String str2, String str3, int i, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.f = i;
        this.e = str5;
    }

    public final void a(t9f t9fVar, Uri uri, String str, hz hzVar) {
        this.f++;
        jz.a(t9fVar, uri, this.a, this.e, this.b, this.c, this.d, str, new ez(this, hzVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fz.class != obj.getClass()) {
            return false;
        }
        fz fzVar = (fz) obj;
        if (this.a.equals(fzVar.a) && this.b.equals(fzVar.b) && this.c.equals(fzVar.c) && this.d.equals(fzVar.d)) {
            return this.e.equals(fzVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return "1:" + TextUtils.join("\t", new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(this.f), this.e});
    }
}
