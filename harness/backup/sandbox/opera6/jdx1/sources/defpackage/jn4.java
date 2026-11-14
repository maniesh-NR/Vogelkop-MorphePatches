package defpackage;

import ads_mobile_sdk.bl1;
import ads_mobile_sdk.cy0;
import ads_mobile_sdk.sr;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class jn4 extends kuk implements Function1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte t = 2;
    public byte u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn4(bl1 bl1Var, ato atoVar, cy0 cy0Var, Uri uri, mt5 mt5Var) {
        super(1, mt5Var);
        this.x = bl1Var;
        this.y = atoVar;
        this.z = cy0Var;
        this.A = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn4(sr srVar, mt5 mt5Var) {
        super(1, mt5Var);
        this.A = srVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn4(mn4 mn4Var, String str, l01 l01Var, String str2, mt5 mt5Var) {
        super(1, mt5Var);
        this.x = mn4Var;
        this.y = str;
        this.A = l01Var;
        this.z = str2;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        Object obj = this.A;
        switch (b) {
            case 0:
                return new jn4((mn4) this.x, (String) this.y, (l01) obj, (String) this.z, mt5Var);
            case 1:
                return new jn4((sr) obj, mt5Var);
            default:
                return new jn4((bl1) this.x, (ato) this.y, (cy0) this.z, (Uri) obj, mt5Var);
        }
    }

    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 1:
                return new jn4((sr) this.A, (mt5) obj).invokeSuspend(Unit.a);
            default:
                return create((mt5) obj).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x036b, code lost:
    
        if (r0.i(r18) == r9) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0539, code lost:
    
        if (lum.a(r1, r18) == r6) goto L293;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024e A[Catch: all -> 0x028c, TRY_LEAVE, TryCatch #25 {all -> 0x028c, blocks: (B:124:0x024a, B:126:0x024e), top: B:336:0x024a }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02cc A[Catch: all -> 0x02f1, TryCatch #11 {all -> 0x02f1, blocks: (B:100:0x019c, B:149:0x02bc, B:151:0x02cc, B:152:0x02cf, B:161:0x02ed, B:162:0x02f0, B:145:0x02a1, B:106:0x01cf, B:117:0x0230, B:118:0x0232, B:119:0x023a, B:120:0x023c, B:121:0x023e, B:148:0x02ba), top: B:299:0x012d, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02db A[Catch: all -> 0x02e8, TRY_LEAVE, TryCatch #5 {all -> 0x02e8, blocks: (B:154:0x02d7, B:156:0x02db, B:103:0x01ba, B:132:0x0284, B:136:0x028d, B:137:0x0290), top: B:305:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02fd A[Catch: all -> 0x0324, TryCatch #3 {all -> 0x0324, blocks: (B:167:0x02f6, B:169:0x02fd, B:171:0x0304, B:173:0x0308, B:175:0x030c, B:176:0x030d, B:177:0x0312, B:178:0x0313, B:179:0x031a, B:180:0x031b, B:181:0x0322, B:182:0x0323), top: B:302:0x02f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0323 A[Catch: all -> 0x0324, TRY_LEAVE, TryCatch #3 {all -> 0x0324, blocks: (B:167:0x02f6, B:169:0x02fd, B:171:0x0304, B:173:0x0308, B:175:0x030c, B:176:0x030d, B:177:0x0312, B:178:0x0313, B:179:0x031a, B:180:0x031b, B:181:0x0322, B:182:0x0323), top: B:302:0x02f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e3 A[Catch: all -> 0x0401, TryCatch #19 {all -> 0x0401, blocks: (B:88:0x0149, B:215:0x03d3, B:217:0x03e3, B:218:0x03e6, B:219:0x03ec, B:221:0x03f0, B:225:0x03fd, B:226:0x0400, B:91:0x0167, B:202:0x03a6, B:204:0x03ab, B:205:0x03ae, B:210:0x03b7, B:94:0x017b, B:194:0x0355, B:214:0x03d1), top: B:299:0x012d, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f0 A[Catch: all -> 0x0401, TRY_LEAVE, TryCatch #19 {all -> 0x0401, blocks: (B:88:0x0149, B:215:0x03d3, B:217:0x03e3, B:218:0x03e6, B:219:0x03ec, B:221:0x03f0, B:225:0x03fd, B:226:0x0400, B:91:0x0167, B:202:0x03a6, B:204:0x03ab, B:205:0x03ae, B:210:0x03b7, B:94:0x017b, B:194:0x0355, B:214:0x03d1), top: B:299:0x012d, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x040d A[Catch: all -> 0x0434, TryCatch #14 {all -> 0x0434, blocks: (B:231:0x0406, B:233:0x040d, B:235:0x0414, B:237:0x0418, B:239:0x041c, B:240:0x041d, B:241:0x0422, B:242:0x0423, B:243:0x042a, B:244:0x042b, B:245:0x0432, B:246:0x0433), top: B:319:0x0406 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0433 A[Catch: all -> 0x0434, TRY_LEAVE, TryCatch #14 {all -> 0x0434, blocks: (B:231:0x0406, B:233:0x040d, B:235:0x0414, B:237:0x0418, B:239:0x041c, B:240:0x041d, B:241:0x0422, B:242:0x0423, B:243:0x042a, B:244:0x042b, B:245:0x0432, B:246:0x0433), top: B:319:0x0406 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092 A[Catch: all -> 0x00b9, TryCatch #16 {all -> 0x00b9, blocks: (B:28:0x008b, B:30:0x0092, B:32:0x0099, B:34:0x009d, B:36:0x00a1, B:37:0x00a2, B:38:0x00a7, B:39:0x00a8, B:40:0x00af, B:41:0x00b0, B:42:0x00b7, B:43:0x00b8), top: B:322:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #16 {all -> 0x00b9, blocks: (B:28:0x008b, B:30:0x0092, B:32:0x0099, B:34:0x009d, B:36:0x00a1, B:37:0x00a2, B:38:0x00a7, B:39:0x00a8, B:40:0x00af, B:41:0x00b0, B:42:0x00b7, B:43:0x00b8), top: B:322:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:62:0x00f2, B:64:0x00f9, B:66:0x0100, B:68:0x0104, B:70:0x0108, B:71:0x0109, B:72:0x010e, B:73:0x010f, B:74:0x0116, B:75:0x0117, B:76:0x011e, B:77:0x011f), top: B:298:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011f A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:62:0x00f2, B:64:0x00f9, B:66:0x0100, B:68:0x0104, B:70:0x0108, B:71:0x0109, B:72:0x010e, B:73:0x010f, B:74:0x0116, B:75:0x0117, B:76:0x011e, B:77:0x011f), top: B:298:0x00f2 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v42, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v45, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
