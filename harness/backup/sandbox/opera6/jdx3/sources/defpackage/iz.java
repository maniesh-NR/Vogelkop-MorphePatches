package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class iz {
    public final b59 a;
    public final t9f b;
    public final String c;
    public final Uri d;
    public final String e;
    public final ArrayList f = new ArrayList(100);
    public final hz g = new hz(this, 0);
    public final ig h = new ig(this, (byte) 1);

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public iz(defpackage.b59 r21, t9f r22, java.lang.String r23, android.net.Uri r24, java.lang.String r25) throws java.lang.NumberFormatException {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 100
            r2.<init>(r3)
            r0.f = r2
            hz r2 = new hz
            r4 = 0
            r2.<init>(r0, r4)
            r0.g = r2
            ig r2 = new ig
            r5 = 1
            r2.<init>(r0, r5)
            r0.h = r2
            r2 = r21
            r0.a = r2
            r6 = r22
            r0.b = r6
            r0.c = r1
            r6 = r24
            r0.d = r6
            r6 = r25
            r0.e = r6
            java.lang.Object r2 = r2.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            r6 = 0
            java.lang.String r1 = r2.getString(r1, r6)
            if (r1 == 0) goto Le1
            java.lang.String r2 = "\n"
            java.lang.String[] r1 = android.text.TextUtils.split(r1, r2)
            java.util.List r1 = java.util.Arrays.asList(r1)
            int r2 = r1.size()
            int r2 = r2 - r3
            int r2 = java.lang.Math.max(r4, r2)
            int r3 = r1.size()
            java.util.List r2 = r1.subList(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r7 = r2.size()
            r3.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L67:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto Lcf
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "1:"
            boolean r8 = r7.startsWith(r8)
            r9 = 5
            r10 = 6
            java.lang.String r11 = "\t"
            r12 = 2
            if (r8 != 0) goto La5
            java.lang.String r8 = "0:"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto Lc8
            java.lang.String r7 = r7.substring(r12)
            java.lang.String[] r7 = android.text.TextUtils.split(r7, r11)
            int r8 = r7.length
            int r8 = r8 + r5
            if (r8 == r10) goto L96
            r8 = r6
            goto La2
        L96:
            int r8 = r7.length
            int r8 = r8 + r5
            java.lang.String[] r8 = new java.lang.String[r8]
            int r11 = r7.length
            java.lang.System.arraycopy(r7, r4, r8, r4, r11)
            java.lang.String r7 = "Unknown"
            r8[r9] = r7
        La2:
            if (r8 != 0) goto Lad
            goto Lc8
        La5:
            java.lang.String r7 = r7.substring(r12)
            java.lang.String[] r8 = android.text.TextUtils.split(r7, r11)
        Lad:
            int r7 = r8.length
            if (r7 != r10) goto Lc8
            r7 = 4
            r7 = r8[r7]     // Catch: java.lang.NumberFormatException -> Lc8
            int r17 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> Lc8
            fz r13 = new fz
            r14 = r8[r4]
            r15 = r8[r5]
            r16 = r8[r12]
            r7 = 3
            r18 = r8[r7]
            r19 = r8[r9]
            r13.<init>(r14, r15, r16, r17, r18, r19)
            goto Lc9
        Lc8:
            r13 = r6
        Lc9:
            if (r13 == 0) goto L67
            r3.add(r13)
            goto L67
        Lcf:
            java.util.ArrayList r2 = r0.f
            r2.addAll(r3)
            int r2 = r3.size()
            int r1 = r1.size()
            if (r2 == r1) goto Le1
            r0.a()
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.<init>(b59, t9f, java.lang.String, android.net.Uri, java.lang.String):void");
    }

    public final void a() {
        ArrayList arrayList = this.f;
        if (arrayList.size() > 100) {
            arrayList.subList(0, arrayList.size() - 100).clear();
        }
        ((SharedPreferences) this.a.get()).edit().putString(this.c, arrayList.isEmpty() ? null : TextUtils.join("\n", arrayList)).apply();
    }
}
