package defpackage;

/* loaded from: classes.dex */
public final class s0k extends u0k {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0k(vr3 vr3Var, CharSequence charSequence, Object obj, byte b) {
        super(vr3Var, charSequence);
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.u0k
    public final int a(int i) {
        switch (this.h) {
            case 0:
                return i + 1;
            default:
                return ((String) this.i).length() + i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r7 = r7 + 1;
     */
    @Override // defpackage.u0k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r7) {
        /*
            r6 = this;
            byte r0 = r6.h
            java.lang.CharSequence r1 = r6.c
            java.lang.Object r6 = r6.i
            switch(r0) {
                case 0: goto L2d;
                default: goto L9;
            }
        L9:
            java.lang.String r6 = (java.lang.String) r6
            int r0 = r6.length()
            int r2 = r1.length()
            int r2 = r2 - r0
        L14:
            if (r7 > r2) goto L2b
            r3 = 0
        L17:
            if (r3 >= r0) goto L2c
            int r4 = r3 + r7
            char r4 = r1.charAt(r4)
            char r5 = r6.charAt(r3)
            if (r4 == r5) goto L28
            int r7 = r7 + 1
            goto L14
        L28:
            int r3 = r3 + 1
            goto L17
        L2b:
            r7 = -1
        L2c:
            return r7
        L2d:
            st4 r6 = (st4) r6
            int r6 = r6.b(r1, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s0k.b(int):int");
    }
}
