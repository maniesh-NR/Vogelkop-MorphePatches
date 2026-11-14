package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class ip2 {
    public CharSequence a;
    public CharSequence b;
    public int c;
    public int d;

    public static boolean e(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence2.toString().startsWith(charSequence.toString()) && charSequence2.length() > charSequence.length();
    }

    public final void a(ip2 ip2Var) {
        f(ip2Var.c, ip2Var.d, ip2Var.a, ip2Var.b);
    }

    public final String b() {
        return this.a.toString() + this.b.toString();
    }

    public final boolean c() {
        return !TextUtils.isEmpty(this.b);
    }

    public final boolean d() {
        return this.c == this.a.length() && this.d == this.a.length();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ip2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ip2 ip2Var = (ip2) obj;
        return TextUtils.equals(this.a, ip2Var.a) && TextUtils.equals(this.b, ip2Var.b) && this.c == ip2Var.c && this.d == ip2Var.d;
    }

    public final void f(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        this.a = new SpannableString(charSequence);
        this.b = new SpannableString(charSequence2);
        this.c = i;
        this.d = i2;
    }

    public final int hashCode() {
        return (this.d * 7) + (this.c * 5) + (this.b.hashCode() * 3) + (this.a.hashCode() << 1);
    }

    public final String toString() {
        return "";
    }
}
