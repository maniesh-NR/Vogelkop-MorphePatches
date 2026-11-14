package defpackage;

/* loaded from: classes.dex */
public final class cyl {
    public final boolean a;
    public final String b;
    public final gyl c;
    public final short d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cyl(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            defpackage.z4o.w(r2)
            r4.a = r5
            r4.b = r6
            r4.d = r7
            r4.e = r11
            gyl r5 = new gyl
            if (r6 == 0) goto L6b
            int r7 = r6.hashCode()
            r11 = 2
            r2 = -1
            switch(r7) {
                case 3046605: goto L47;
                case 3046671: goto L3d;
                case 3049879: goto L33;
                case 3049895: goto L29;
                default: goto L28;
            }
        L28:
            goto L4f
        L29:
            java.lang.String r7 = "cens"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L4f
            r0 = 3
            goto L50
        L33:
            java.lang.String r7 = "cenc"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L4f
            r0 = r11
            goto L50
        L3d:
            java.lang.String r7 = "cbcs"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L4f
            r0 = r1
            goto L50
        L47:
            java.lang.String r7 = "cbc1"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L50
        L4f:
            r0 = r2
        L50:
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L6a;
                case 2: goto L6b;
                case 3: goto L6b;
                default: goto L53;
            }
        L53:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.<init>(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            defpackage.w7d.K(r6)
            goto L6b
        L6a:
            r1 = r11
        L6b:
            r5.<init>(r1, r8, r9, r10)
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyl.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
