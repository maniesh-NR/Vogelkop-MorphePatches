package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class d7p {

    @NotNull
    public static final b7p Companion = new b7p();
    public final String a;
    public final String b;
    public final long c;
    public final p8p d;
    public final zyk e;

    public d7p(String str, int i, String str2, long j) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, z6p.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = null;
        this.e = z4c.b(new a7p(this, (byte) 0));
        z4c.b(new a7p(this, (byte) 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d7p(defpackage.p8p r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.a
            java.lang.Object r1 = r6.b()
            p0i r2 = t0i.b
            boolean r2 = r1 instanceof q0i
            r3 = 0
            if (r2 != 0) goto L2c
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L1a
            java.lang.CharSequence r2 = kotlin.text.StringsKt.l0(r1)
            java.lang.String r2 = r2.toString()
            goto L1b
        L1a:
            r2 = r3
        L1b:
            java.lang.String r4 = "{}"
            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r2, r4)
            if (r4 != 0) goto L2b
            java.lang.String r4 = "[]"
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r2, r4)
            if (r2 == 0) goto L2c
        L2b:
            r1 = r3
        L2c:
            boolean r2 = r1 instanceof q0i
            if (r2 != 0) goto L31
            r3 = r1
        L31:
            java.lang.String r3 = (java.lang.String) r3
            long r1 = r6.b
            r5.<init>()
            r5.a = r0
            r5.b = r3
            r5.c = r1
            r5.d = r6
            a7p r6 = new a7p
            r0 = 0
            r6.<init>(r5, r0)
            zyk r6 = z4c.b(r6)
            r5.e = r6
            a7p r6 = new a7p
            r0 = 1
            r6.<init>(r5, r0)
            z4c.b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7p.<init>(p8p):void");
    }
}
