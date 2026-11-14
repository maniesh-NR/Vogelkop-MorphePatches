package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kpm {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public kpm(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static kpm a(String str) {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String strH = wqm.h(uri);
        int iIndexOf = TextUtils.isEmpty(scheme) ? 0 : str.indexOf(scheme);
        int length = TextUtils.isEmpty(scheme) ? 0 : scheme.length();
        int iIndexOf2 = TextUtils.isEmpty(strH) ? 0 : str.indexOf(strH, iIndexOf + length);
        int length2 = TextUtils.isEmpty(strH) ? 0 : strH.length();
        int i = length + 1;
        if ("blob".equals(scheme) && str.length() > i) {
            kpm kpmVarA = a(str.substring(i));
            int i2 = kpmVarA.d;
            int i3 = kpmVarA.b;
            if (i3 > 0 || i2 > 0) {
                return new kpm(i3 > 0 ? kpmVarA.a + i : 0, i3, i2 > 0 ? i + kpmVarA.c : 0, i2);
            }
        }
        return new kpm(iIndexOf, length, iIndexOf2, length2);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof kpm)) {
            return false;
        }
        kpm kpmVar = (kpm) obj;
        return this.a == kpmVar.a && this.b == kpmVar.b && this.c == kpmVar.c && this.d == kpmVar.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
