package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class tfa {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public tfa(String str, int i, int i2, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tfa.class == obj.getClass()) {
            tfa tfaVar = (tfa) obj;
            if (this.a == tfaVar.a && this.b == tfaVar.b && TextUtils.equals(this.c, tfaVar.c) && TextUtils.equals(this.d, tfaVar.d) && TextUtils.equals(this.e, tfaVar.e) && TextUtils.equals(this.f, tfaVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
