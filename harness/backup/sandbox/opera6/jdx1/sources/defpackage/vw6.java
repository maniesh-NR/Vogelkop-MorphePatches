package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class vw6 implements w7e {
    public final Resources a;

    public vw6(Resources resources, byte b) {
        switch (b) {
            case 1:
                this.a = resources;
                break;
            default:
                resources.getClass();
                this.a = resources;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(defpackage.oj9 r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.d
            java.lang.String r1 = r8.b
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = ""
            if (r2 != 0) goto L4c
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4c
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            java.lang.String r2 = defpackage.tym.a
            java.util.Locale$Category r2 = java.util.Locale.Category.DISPLAY
            java.util.Locale r2 = java.util.Locale.getDefault(r2)
            java.lang.String r0 = r0.getDisplayName(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L4c
            r4 = 1
            r5 = 0
            int r4 = r0.offsetByCodePoints(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            java.lang.String r5 = r0.substring(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            java.lang.String r2 = r5.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            java.lang.String r2 = r0.substring(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            goto L4d
        L4c:
            r0 = r3
        L4d:
            java.lang.String r8 = r7.b(r8)
            java.lang.String[] r8 = new java.lang.String[]{r0, r8}
            java.lang.String r7 = r7.c(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L67
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 == 0) goto L66
            r1 = r3
        L66:
            r7 = r1
        L67:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw6.a(oj9):java.lang.String");
    }

    public final String b(oj9 oj9Var) {
        int i = oj9Var.f;
        int i2 = i & 2;
        Resources resources = this.a;
        String string = i2 != 0 ? resources.getString(2132018954) : "";
        if ((i & 4) != 0) {
            string = c(string, resources.getString(2132018957));
        }
        if ((i & 8) != 0) {
            string = c(string, resources.getString(2132018956));
        }
        return (i & 1088) != 0 ? c(string, resources.getString(2132018955)) : string;
    }

    public final String c(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : this.a.getString(2132018950, string, str);
            }
        }
        return string;
    }

    @Override // defpackage.w7e
    public final v7e w(d5o d5oVar) {
        return new fc2(this.a, d5oVar.r(Uri.class, InputStream.class));
    }
}
