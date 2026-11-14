package defpackage;

/* loaded from: classes.dex */
public final class be3 {
    public static final String b;
    public static final String c;
    public static final be3 d;
    public static final be3 e;
    public final boolean a;

    static {
        n9k n9kVar = kgl.c;
        b = "\u200e";
        c = "\u200f";
        d = new be3(false);
        e = new be3(true);
    }

    public be3(boolean z) {
        n9k n9kVar = kgl.a;
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r1 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r2 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r0.c <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        switch(r0.a()) {
            case 14: goto L64;
            case 15: goto L64;
            case 16: goto L63;
            case 17: goto L63;
            case 18: goto L62;
            default: goto L68;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r9) {
        /*
            ae3 r0 = new ae3
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.c
            int r5 = r0.b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6c
            if (r1 != 0) goto L6c
            java.lang.String r5 = r0.a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            int r8 = r0.c
            if (r4 == 0) goto L37
            int r4 = java.lang.Character.codePointAt(r5, r8)
            int r5 = r0.c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4a
        L37:
            int r8 = r8 + 1
            r0.c = r8
            char r4 = r0.d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L46
            byte[] r5 = defpackage.ae3.e
            r4 = r5[r4]
            goto L4a
        L46:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4a:
            if (r4 == 0) goto L68
            if (r4 == r7) goto L65
            r5 = 2
            if (r4 == r5) goto L65
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L61;
                case 15: goto L61;
                case 16: goto L5d;
                case 17: goto L5d;
                case 18: goto L59;
                default: goto L58;
            }
        L58:
            goto L6a
        L59:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5d:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L61:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L65:
            if (r3 != 0) goto L6a
            goto L82
        L68:
            if (r3 == 0) goto L85
        L6a:
            r1 = r3
            goto Lb
        L6c:
            if (r1 == 0) goto L89
            if (r2 == 0) goto L71
            return r2
        L71:
            int r2 = r0.c
            if (r2 <= 0) goto L89
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L83;
                case 15: goto L83;
                case 16: goto L80;
                case 17: goto L80;
                case 18: goto L7d;
                default: goto L7c;
            }
        L7c:
            goto L71
        L7d:
            int r3 = r3 + 1
            goto L71
        L80:
            if (r1 != r3) goto L86
        L82:
            return r7
        L83:
            if (r1 != r3) goto L86
        L85:
            return r6
        L86:
            int r3 = r3 + (-1)
            goto L71
        L89:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be3.a(java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r6) {
        /*
            ae3 r0 = new ae3
            r0.<init>(r6)
            int r6 = r0.b
            r0.c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.c
            if (r3 <= 0) goto L3e
            byte r3 = r0.a()
            if (r3 == 0) goto L37
            r4 = 1
            if (r3 == r4) goto L31
            r5 = 2
            if (r3 == r5) goto L31
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r2 != 0) goto Lc
            goto L3d
        L26:
            int r1 = r1 + 1
            goto Lc
        L29:
            if (r2 != r1) goto L2e
            goto L33
        L2c:
            if (r2 == r1) goto L39
        L2e:
            int r1 = r1 + (-1)
            goto Lc
        L31:
            if (r1 != 0) goto L34
        L33:
            return r4
        L34:
            if (r2 != 0) goto Lc
            goto L3d
        L37:
            if (r1 != 0) goto L3b
        L39:
            r6 = -1
            return r6
        L3b:
            if (r2 != 0) goto Lc
        L3d:
            goto Lb
        L3e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be3.b(java.lang.String):int");
    }
}
