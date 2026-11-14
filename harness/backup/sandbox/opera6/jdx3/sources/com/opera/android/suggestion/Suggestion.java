package com.opera.android.suggestion;

import defpackage.rn9;
import defpackage.sko;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Suggestion implements Comparable {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final rn9 e;
    public final String f;
    public final int g;
    public final String h;
    public final int i;
    public final int j;
    public final Object k;

    public Suggestion(int i, String str, String str2, String str3, rn9 rn9Var, String str4, int i2, String str5, int i3, int i4, Object obj) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = rn9Var;
        this.f = str4;
        this.g = i2;
        this.h = str5;
        this.i = i3;
        this.j = i4;
        this.k = obj;
    }

    public final String a() {
        String str = this.f;
        return str == null ? b() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            r5 = this;
            java.lang.String r0 = r5.d
            if (r0 != 0) goto Lc7
            rn9 r5 = r5.e
            boolean r0 = r5.b
            java.lang.Object r5 = r5.d
            j55 r5 = (defpackage.j55) r5
            android.content.Context r1 = r5.e
            android.content.ClipboardManager r5 = r5.f
            r2 = 0
            r3 = 0
            if (r0 == 0) goto La0
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r0 < r4) goto L76
            android.content.ClipData r0 = r5.getPrimaryClip()     // Catch: java.lang.SecurityException -> L2e
            if (r0 == 0) goto L2e
            int r4 = r0.getItemCount()     // Catch: java.lang.SecurityException -> L2e
            if (r4 > 0) goto L27
            r0 = r3
        L27:
            if (r0 == 0) goto L2e
            android.content.ClipData$Item r0 = r0.getItemAt(r2)     // Catch: java.lang.SecurityException -> L2e
            goto L2f
        L2e:
            r0 = r3
        L2f:
            if (r0 == 0) goto Lc1
            java.lang.CharSequence r0 = m41.p(r0)
            if (r0 != 0) goto L63
            android.content.ClipData r5 = r5.getPrimaryClip()     // Catch: java.lang.SecurityException -> L4b
            if (r5 == 0) goto L4b
            int r0 = r5.getItemCount()     // Catch: java.lang.SecurityException -> L4b
            if (r0 > 0) goto L44
            r5 = r3
        L44:
            if (r5 == 0) goto L4b
            android.content.ClipData$Item r5 = r5.getItemAt(r2)     // Catch: java.lang.SecurityException -> L4b
            goto L4c
        L4b:
            r5 = r3
        L4c:
            if (r5 == 0) goto L59
            java.lang.CharSequence r5 = r5.coerceToText(r1)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L59
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L59
            goto L5a
        L59:
            r5 = r3
        L5a:
            if (r5 == 0) goto L62
            java.lang.String r5 = defpackage.mdb.h(r5)
            r0 = r5
            goto L63
        L62:
            r0 = r3
        L63:
            if (r0 == 0) goto Lc1
            java.lang.String r5 = r0.toString()
            java.lang.String[] r0 = defpackage.wqm.a
            java.lang.Object r5 = J.N.MxvwDZcS(r5)
            org.chromium.url.GURL r5 = (org.chromium.url.GURL) r5
            java.lang.String r3 = r5.g()
            goto Lc1
        L76:
            android.content.ClipData r5 = r5.getPrimaryClip()     // Catch: java.lang.SecurityException -> L8a
            if (r5 == 0) goto L8a
            int r0 = r5.getItemCount()     // Catch: java.lang.SecurityException -> L8a
            if (r0 > 0) goto L83
            r5 = r3
        L83:
            if (r5 == 0) goto L8a
            android.content.ClipData$Item r5 = r5.getItemAt(r2)     // Catch: java.lang.SecurityException -> L8a
            goto L8b
        L8a:
            r5 = r3
        L8b:
            if (r5 == 0) goto L98
            java.lang.CharSequence r5 = r5.coerceToText(r1)     // Catch: java.lang.Throwable -> L98
            if (r5 == 0) goto L98
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L98
            goto L99
        L98:
            r5 = r3
        L99:
            if (r5 == 0) goto Lc1
            java.lang.String r3 = defpackage.mdb.h(r5)
            goto Lc1
        La0:
            android.content.ClipData r5 = r5.getPrimaryClip()     // Catch: java.lang.SecurityException -> Lb4
            if (r5 == 0) goto Lb4
            int r0 = r5.getItemCount()     // Catch: java.lang.SecurityException -> Lb4
            if (r0 > 0) goto Lad
            r5 = r3
        Lad:
            if (r5 == 0) goto Lb4
            android.content.ClipData$Item r5 = r5.getItemAt(r2)     // Catch: java.lang.SecurityException -> Lb4
            goto Lb5
        Lb4:
            r5 = r3
        Lb5:
            if (r5 == 0) goto Lc1
            java.lang.CharSequence r5 = r5.coerceToText(r1)     // Catch: java.lang.Throwable -> Lc1
            if (r5 == 0) goto Lc1
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            if (r3 != 0) goto Lc6
            java.lang.String r5 = ""
            return r5
        Lc6:
            return r3
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.suggestion.Suggestion.b():java.lang.String");
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return sko.j("a:", str);
        }
        return "b: " + ((String) this.e.c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Suggestion suggestion = (Suggestion) obj;
        int i = suggestion.g - this.g;
        if (i != 0) {
            return i;
        }
        int iCompareTo = this.b.compareTo(suggestion.b);
        return iCompareTo != 0 ? iCompareTo : c().compareTo(suggestion.c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Suggestion.class != obj.getClass()) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        return this.g == suggestion.g && this.b.equals(suggestion.b) && this.c.equals(suggestion.c) && c().equals(suggestion.c()) && Objects.equals(this.f, suggestion.f) && this.a == suggestion.a && this.h.equals(suggestion.h) && this.i == suggestion.i && this.j == suggestion.j && Objects.equals(this.k, suggestion.k);
    }

    public final int hashCode() {
        return Objects.hashCode(this.k) + ((((z1m.f((((Objects.hashCode(this.f) + ((c().hashCode() + z1m.f(z1m.f(this.a * 31, 31, this.b), 31, this.c)) * 31)) * 31) + this.g) * 31, 961, this.h) + this.i) * 31) + this.j) * 31);
    }
}
