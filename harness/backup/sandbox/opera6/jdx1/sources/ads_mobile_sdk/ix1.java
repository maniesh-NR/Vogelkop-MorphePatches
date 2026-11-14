package ads_mobile_sdk;

import defpackage.pqh;
import defpackage.prb;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ix1 extends kuk implements Function1 {
    public Object a;
    public Object b;
    public Object c;
    public byte d;
    public final /* synthetic */ Object e;
    public Object f;
    public final /* synthetic */ byte t = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix1(bl1 bl1Var, kv2 kv2Var, prb prbVar, mt5 mt5Var) {
        super(1, mt5Var);
        this.b = bl1Var;
        this.e = kv2Var;
        this.f = prbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix1(jx1 jx1Var, String str, mt5 mt5Var) {
        super(1, mt5Var);
        this.e = jx1Var;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix1(lqh lqhVar, bk1 bk1Var, String str, pqh pqhVar, mt5 mt5Var) {
        super(1, mt5Var);
        this.a = lqhVar;
        this.c = bk1Var;
        this.b = str;
        this.e = pqhVar;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        Object obj = this.e;
        switch (b) {
            case 0:
                return new ix1((jx1) obj, (String) this.f, mt5Var);
            case 1:
                return new ix1((lqh) this.a, (bk1) this.c, (String) this.b, (pqh) obj, mt5Var);
            default:
                return new ix1((bl1) this.b, (kv2) obj, (prb) this.f, mt5Var);
        }
    }

    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                break;
        }
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0293 A[Catch: all -> 0x02a7, TRY_ENTER, TryCatch #4 {all -> 0x02a7, blocks: (B:144:0x0287, B:148:0x0293, B:150:0x0297, B:152:0x02a1, B:153:0x02a6), top: B:236:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b7 A[Catch: all -> 0x02de, TryCatch #18 {all -> 0x02de, blocks: (B:160:0x02b0, B:162:0x02b7, B:164:0x02be, B:166:0x02c2, B:168:0x02c6, B:169:0x02c7, B:170:0x02cc, B:171:0x02cd, B:172:0x02d4, B:173:0x02d5, B:174:0x02dc, B:175:0x02dd), top: B:257:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02dd A[Catch: all -> 0x02de, TRY_LEAVE, TryCatch #18 {all -> 0x02de, blocks: (B:160:0x02b0, B:162:0x02b7, B:164:0x02be, B:166:0x02c2, B:168:0x02c6, B:169:0x02c7, B:170:0x02cc, B:171:0x02cd, B:172:0x02d4, B:173:0x02d5, B:174:0x02dc, B:175:0x02dd), top: B:257:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0328 A[Catch: all -> 0x033b, TRY_ENTER, TryCatch #14 {all -> 0x033b, blocks: (B:190:0x031d, B:193:0x0328, B:195:0x032c, B:198:0x0335, B:199:0x033a), top: B:251:0x031d }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x034b A[Catch: all -> 0x0372, TryCatch #8 {all -> 0x0372, blocks: (B:206:0x0344, B:208:0x034b, B:210:0x0352, B:212:0x0356, B:214:0x035a, B:215:0x035b, B:216:0x0360, B:217:0x0361, B:218:0x0368, B:219:0x0369, B:220:0x0370, B:221:0x0371), top: B:242:0x0344 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0371 A[Catch: all -> 0x0372, TRY_LEAVE, TryCatch #8 {all -> 0x0372, blocks: (B:206:0x0344, B:208:0x034b, B:210:0x0352, B:212:0x0356, B:214:0x035a, B:215:0x035b, B:216:0x0360, B:217:0x0361, B:218:0x0368, B:219:0x0369, B:220:0x0370, B:221:0x0371), top: B:242:0x0344 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[Catch: all -> 0x00b2, TryCatch #9 {all -> 0x00b2, blocks: (B:28:0x0084, B:30:0x008b, B:32:0x0092, B:34:0x0096, B:36:0x009a, B:37:0x009b, B:38:0x00a0, B:39:0x00a1, B:40:0x00a8, B:41:0x00a9, B:42:0x00b0, B:43:0x00b1), top: B:243:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #9 {all -> 0x00b2, blocks: (B:28:0x0084, B:30:0x008b, B:32:0x0092, B:34:0x0096, B:36:0x009a, B:37:0x009b, B:38:0x00a0, B:39:0x00a1, B:40:0x00a8, B:41:0x00a9, B:42:0x00b0, B:43:0x00b1), top: B:243:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed A[Catch: all -> 0x0114, TryCatch #10 {all -> 0x0114, blocks: (B:62:0x00e6, B:64:0x00ed, B:66:0x00f4, B:68:0x00f8, B:70:0x00fc, B:71:0x00fd, B:72:0x0102, B:73:0x0103, B:74:0x010a, B:75:0x010b, B:76:0x0112, B:77:0x0113), top: B:244:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0113 A[Catch: all -> 0x0114, TRY_LEAVE, TryCatch #10 {all -> 0x0114, blocks: (B:62:0x00e6, B:64:0x00ed, B:66:0x00f4, B:68:0x00f8, B:70:0x00fc, B:71:0x00fd, B:72:0x0102, B:73:0x0103, B:74:0x010a, B:75:0x010b, B:76:0x0112, B:77:0x0113), top: B:244:0x00e6 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v30, types: [ads_mobile_sdk.rg3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [ads_mobile_sdk.wk2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v9, types: [ads_mobile_sdk.rg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ix1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
