package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes.dex */
public final class hra {
    public static final wu5 i = new wu5();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final String g;
    public final String h;

    public hra(String str, String str2, String str3, String str4, int i2, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
        this.f = arrayList2;
        this.g = str5;
        this.h = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(StringsKt.K(str, ':', length, 4) + 1, StringsKt.K(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iK = StringsKt.K(str, '/', length, 4);
        return str.substring(iK, _UtilCommonKt.delimiterOffset(str, "?#", iK, str.length()));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iK = StringsKt.K(str, '/', length, 4);
        int iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, "?#", iK, str.length());
        ArrayList arrayList = new ArrayList();
        while (iK < iDelimiterOffset) {
            int i2 = iK + 1;
            int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(str, '/', i2, iDelimiterOffset);
            arrayList.add(str.substring(i2, iDelimiterOffset2));
            iK = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int iK = StringsKt.K(str, '?', 0, 6) + 1;
        return str.substring(iK, _UtilCommonKt.delimiterOffset(str, '#', iK, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, _UtilCommonKt.delimiterOffset(str, ":@", length, str.length()));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hra) && ((hra) obj).h.equals(this.h);
    }

    public final boolean f() {
        return Intrinsics.a(this.a, "https");
    }

    public final rma g() {
        String strCanonicalize$default;
        rma rmaVar = new rma((byte) 4);
        ArrayList arrayList = (ArrayList) rmaVar.f;
        String str = this.a;
        rmaVar.c = str;
        rmaVar.d = e();
        rmaVar.e = a();
        rmaVar.g = this.d;
        int i2 = Intrinsics.a(str, "http") ? 80 : Intrinsics.a(str, "https") ? 443 : -1;
        int i3 = this.e;
        rmaVar.b = i3 != i2 ? i3 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        rmaVar.h = (strD == null || (strCanonicalize$default = _UrlKt.canonicalize$default(strD, 0, 0, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 83, null)) == null) ? null : rma.t(strCanonicalize$default);
        if (this.g != null) {
            String str2 = this.h;
            strSubstring = str2.substring(StringsKt.K(str2, '#', 0, 6) + 1);
        }
        rmaVar.i = strSubstring;
        return rmaVar;
    }

    public final String h() {
        rma rmaVar;
        try {
            rmaVar = new rma((byte) 4);
            rmaVar.o("/...", this);
        } catch (IllegalArgumentException unused) {
            rmaVar = null;
        }
        rmaVar.getClass();
        rmaVar.d = _UrlKt.canonicalize$default("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
        rmaVar.e = _UrlKt.canonicalize$default("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
        return rmaVar.d().h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final hra i(String str) {
        rma rmaVar;
        try {
            rmaVar = new rma((byte) 4);
            rmaVar.o(str, this);
        } catch (IllegalArgumentException unused) {
            rmaVar = null;
        }
        if (rmaVar != null) {
            return rmaVar.d();
        }
        return null;
    }

    public final URI j() {
        rma rmaVarG = g();
        ArrayList arrayList = (ArrayList) rmaVarG.f;
        String str = (String) rmaVarG.g;
        rmaVarG.g = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, _UrlKt.canonicalize$default((String) arrayList.get(i2), 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, 99, null));
        }
        ArrayList arrayList2 = (ArrayList) rmaVarG.h;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str2 = (String) arrayList2.get(i3);
                arrayList2.set(i3, str2 != null ? _UrlKt.canonicalize$default(str2, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, 67, null) : null);
            }
        }
        String str3 = (String) rmaVarG.i;
        rmaVarG.i = str3 != null ? _UrlKt.canonicalize$default(str3, 0, 0, _UrlKt.FRAGMENT_ENCODE_SET_URI, true, true, false, true, 35, null) : null;
        String string = rmaVarG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
            } catch (Exception unused) {
                rqd.p(e);
                return null;
            }
        }
    }

    public final String toString() {
        return this.h;
    }
}
