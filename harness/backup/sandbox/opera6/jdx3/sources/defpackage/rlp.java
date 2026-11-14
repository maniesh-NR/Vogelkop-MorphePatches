package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class rlp extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rlp(Object obj, Object obj2, byte b) {
        super(0);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r4 = this;
            byte r0 = r4.i
            java.lang.Object r1 = r4.j
            java.lang.Object r4 = r4.k
            switch(r0) {
                case 0: goto L2c;
                default: goto L9;
            }
        L9:
            ylp r4 = (defpackage.ylp) r4
            pro r1 = (defpackage.pro) r1
            java.lang.String r0 = r1.h
            r1 = 0
            if (r0 == 0) goto L1b
            boolean r2 = android.webkit.URLUtil.isNetworkUrl(r0)
            if (r2 != 0) goto L19
            r0 = r1
        L19:
            if (r0 != 0) goto L1f
        L1b:
            iio r0 = r4.z
            java.lang.String r0 = r0.b
        L1f:
            yjo r2 = new yjo
            java.io.File r4 = r4.x
            if (r4 == 0) goto L26
            r1 = r4
        L26:
            java.lang.String r4 = "index.html"
            r2.<init>(r1, r4, r0)
            return r2
        L2c:
            gzo r1 = (gzo) r1
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map r0 = r1.a
            kotlin.text.Regex r1 = gzo.b
            cno r2 = new cno
            r3 = 7
            r2.<init>(r0, r3)
            java.lang.String r4 = r1.k(r4, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlp.invoke():java.lang.Object");
    }
}
