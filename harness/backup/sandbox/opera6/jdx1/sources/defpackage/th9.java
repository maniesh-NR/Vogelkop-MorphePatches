package defpackage;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class th9 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;

    public th9(String str, int i) {
        this.a = "com.google.android.gms.fonts";
        this.b = "com.google.android.gms";
        str.getClass();
        this.c = str;
        this.d = null;
        this.e = i;
        this.f = null;
        this.g = null;
        this.h = a("com.google.android.gms.fonts", "com.google.android.gms", str, null, null);
    }

    public th9(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str2;
        this.c = str3;
        list.getClass();
        this.d = list;
        this.e = 0;
        this.f = str4;
        this.g = str5;
        this.h = a(str, str2, str3, str4, str5);
    }

    public static String a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        if (str5 != null) {
            int length = str5.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    break;
                }
                int iCodePointAt = str5.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    sb.append("-VF");
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb.append(this.a);
        sb.append(", mProviderPackage: ");
        sb.append(this.b);
        sb.append(", mQuery: ");
        sb.append(this.c);
        sb.append(", mSystemFont: ");
        sb.append(this.f);
        sb.append(", mVariationSettings: ");
        StringBuilder sb2 = new StringBuilder(z1m.l(sb, this.g, ", mCertificates:"));
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                sb2.append("}");
                sb2.append("mCertificatesArray: " + this.e);
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i++;
        }
    }
}
