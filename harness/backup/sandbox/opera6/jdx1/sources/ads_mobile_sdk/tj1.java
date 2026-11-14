package ads_mobile_sdk;

import defpackage.pqh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tj1 extends kuk implements Function2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public int e;
    public byte f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ bk1 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ pqh k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj1(String str, boolean z, bk1 bk1Var, boolean z2, pqh pqhVar, String str2, mt5 mt5Var) {
        super(2, mt5Var);
        this.g = str;
        this.h = z;
        this.i = bk1Var;
        this.j = z2;
        this.k = pqhVar;
        this.l = str2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new tj1(this.g, this.h, this.i, this.j, this.k, this.l, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b2 A[Catch: all -> 0x02b3, TRY_LEAVE, TryCatch #8 {all -> 0x02b3, blocks: (B:88:0x0285, B:90:0x028c, B:92:0x0293, B:94:0x0297, B:96:0x029b, B:97:0x029c, B:98:0x02a1, B:99:0x02a2, B:100:0x02a9, B:101:0x02aa, B:102:0x02b1, B:103:0x02b2), top: B:203:0x0285 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e4 A[Catch: all -> 0x03a7, TRY_LEAVE, TryCatch #2 {all -> 0x03a7, blocks: (B:114:0x02de, B:116:0x02e4), top: B:191:0x02de }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0378 A[Catch: all -> 0x039f, TryCatch #13 {all -> 0x039f, blocks: (B:138:0x0371, B:140:0x0378, B:142:0x037f, B:144:0x0383, B:146:0x0387, B:147:0x0388, B:148:0x038d, B:149:0x038e, B:150:0x0395, B:151:0x0396, B:152:0x039d, B:153:0x039e), top: B:211:0x0371 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x039e A[Catch: all -> 0x039f, TRY_LEAVE, TryCatch #13 {all -> 0x039f, blocks: (B:138:0x0371, B:140:0x0378, B:142:0x037f, B:144:0x0383, B:146:0x0387, B:147:0x0388, B:148:0x038d, B:149:0x038e, B:150:0x0395, B:151:0x0396, B:152:0x039d, B:153:0x039e), top: B:211:0x0371 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b4 A[Catch: all -> 0x03db, TryCatch #10 {all -> 0x03db, blocks: (B:165:0x03ad, B:167:0x03b4, B:169:0x03bb, B:171:0x03bf, B:173:0x03c3, B:174:0x03c4, B:175:0x03c9, B:176:0x03ca, B:177:0x03d1, B:178:0x03d2, B:179:0x03d9, B:180:0x03da), top: B:206:0x03ad }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03da A[Catch: all -> 0x03db, TRY_LEAVE, TryCatch #10 {all -> 0x03db, blocks: (B:165:0x03ad, B:167:0x03b4, B:169:0x03bb, B:171:0x03bf, B:173:0x03c3, B:174:0x03c4, B:175:0x03c9, B:176:0x03ca, B:177:0x03d1, B:178:0x03d2, B:179:0x03d9, B:180:0x03da), top: B:206:0x03ad }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[PHI: r0 r1 r4 r6 r8 r13 r15
      0x0086: PHI (r0v28 int) = (r0v24 int), (r0v34 int) binds: [B:69:0x0231, B:21:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r1v15 bd5) = (r1v10 bd5), (r1v29 bd5) binds: [B:69:0x0231, B:21:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r4v8 ads_mobile_sdk.tj1) = (r4v5 ads_mobile_sdk.tj1), (r4v0 ads_mobile_sdk.tj1) binds: [B:69:0x0231, B:21:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r6v27 ads_mobile_sdk.cy0) = (r6v22 ads_mobile_sdk.cy0), (r6v32 ads_mobile_sdk.cy0) binds: [B:69:0x0231, B:21:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r8v40 pqh) = (r8v35 pqh), (r8v44 pqh) binds: [B:69:0x0231, B:21:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r13v11 rx5) = (r13v7 rx5), (r13v12 rx5) binds: [B:69:0x0231, B:21:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r15v13 boolean) = (r15v9 boolean), (r15v14 boolean) binds: [B:69:0x0231, B:21:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0272 A[Catch: all -> 0x027f, TRY_LEAVE, TryCatch #12 {all -> 0x027f, blocks: (B:79:0x026c, B:81:0x0272), top: B:209:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028c A[Catch: all -> 0x02b3, TryCatch #8 {all -> 0x02b3, blocks: (B:88:0x0285, B:90:0x028c, B:92:0x0293, B:94:0x0297, B:96:0x029b, B:97:0x029c, B:98:0x02a1, B:99:0x02a2, B:100:0x02a9, B:101:0x02aa, B:102:0x02b1, B:103:0x02b2), top: B:203:0x0285 }] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v43, types: [ads_mobile_sdk.rg3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tj1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
