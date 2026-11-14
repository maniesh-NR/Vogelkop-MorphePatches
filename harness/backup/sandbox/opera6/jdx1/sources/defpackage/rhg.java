package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public class rhg extends Exception {
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final long b;
    public final Bundle c;

    static {
        String str = tym.a;
        d = "0";
        e = "1";
        f = "2";
        g = "3";
        h = "4";
        i = "5";
    }

    public rhg(String str, Throwable th, int i2, Bundle bundle, long j) {
        super(str, th);
        this.a = i2;
        this.c = bundle;
        this.b = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r3 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(defpackage.rhg r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L5b
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 != r3) goto L5b
            java.lang.Throwable r2 = r6.getCause()
            java.lang.Throwable r3 = r7.getCause()
            if (r2 == 0) goto L3b
            if (r3 == 0) goto L3d
            java.lang.String r4 = r2.getMessage()
            java.lang.String r5 = r3.getMessage()
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 != 0) goto L2c
            return r1
        L2c:
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3e
            return r1
        L3b:
            if (r3 == 0) goto L3e
        L3d:
            return r1
        L3e:
            int r2 = r6.a
            int r3 = r7.a
            if (r2 != r3) goto L5b
            java.lang.String r2 = r6.getMessage()
            java.lang.String r3 = r7.getMessage()
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L5b
            long r2 = r6.b
            long r6 = r7.b
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 != 0) goto L5b
            return r0
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhg.d(rhg):boolean");
    }
}
