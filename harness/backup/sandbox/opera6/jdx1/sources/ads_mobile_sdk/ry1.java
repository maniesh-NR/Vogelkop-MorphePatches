package ads_mobile_sdk;

import defpackage.prb;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ry1 extends kuk implements Function1 {
    public Object a;
    public rg3 b;
    public rg3 c;
    public Object d;
    public Object e;
    public Closeable f;
    public byte g;
    public final /* synthetic */ prb h;
    public final /* synthetic */ xy1 i;
    public final /* synthetic */ ve2 j;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry1(ve2 ve2Var, xy1 xy1Var, prb prbVar, mt5 mt5Var, byte b) {
        super(1, mt5Var);
        this.t = b;
        this.h = prbVar;
        this.i = xy1Var;
        this.j = ve2Var;
    }

    public final mt5 create(mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new ry1(this.j, this.i, this.h, mt5Var, (byte) 0);
            default:
                return new ry1(this.j, this.i, this.h, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        switch (this.t) {
        }
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0157, code lost:
    
        if (r2 == r0) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d5 A[Catch: all -> 0x01d6, TRY_LEAVE, TryCatch #18 {all -> 0x01d6, blocks: (B:88:0x01a8, B:90:0x01af, B:92:0x01b6, B:94:0x01ba, B:96:0x01be, B:97:0x01bf, B:98:0x01c4, B:99:0x01c5, B:100:0x01cc, B:101:0x01cd, B:102:0x01d4, B:103:0x01d5), top: B:251:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02db A[Catch: all -> 0x02e2, TRY_LEAVE, TryCatch #2 {all -> 0x02e2, blocks: (B:142:0x02d5, B:144:0x02db), top: B:222:0x02d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ed A[Catch: all -> 0x032c, TryCatch #12 {all -> 0x032c, blocks: (B:149:0x02e6, B:151:0x02ed, B:153:0x0303, B:127:0x0235), top: B:241:0x0235 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0303 A[Catch: all -> 0x032c, TRY_LEAVE, TryCatch #12 {all -> 0x032c, blocks: (B:149:0x02e6, B:151:0x02ed, B:153:0x0303, B:127:0x0235), top: B:241:0x0235 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0339 A[Catch: all -> 0x0360, TryCatch #0 {all -> 0x0360, blocks: (B:169:0x0332, B:171:0x0339, B:173:0x0340, B:175:0x0344, B:177:0x0348, B:178:0x0349, B:179:0x034e, B:180:0x034f, B:181:0x0356, B:182:0x0357, B:183:0x035e, B:184:0x035f), top: B:219:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x035f A[Catch: all -> 0x0360, TRY_LEAVE, TryCatch #0 {all -> 0x0360, blocks: (B:169:0x0332, B:171:0x0339, B:173:0x0340, B:175:0x0344, B:177:0x0348, B:178:0x0349, B:179:0x034e, B:180:0x034f, B:181:0x0356, B:182:0x0357, B:183:0x035e, B:184:0x035f), top: B:219:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0378 A[Catch: all -> 0x039f, TryCatch #24 {all -> 0x039f, blocks: (B:197:0x0371, B:199:0x0378, B:201:0x037f, B:203:0x0383, B:205:0x0387, B:206:0x0388, B:207:0x038d, B:208:0x038e, B:209:0x0395, B:210:0x0396, B:211:0x039d, B:212:0x039e), top: B:262:0x0371 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x039e A[Catch: all -> 0x039f, TRY_LEAVE, TryCatch #24 {all -> 0x039f, blocks: (B:197:0x0371, B:199:0x0378, B:201:0x037f, B:203:0x0383, B:205:0x0387, B:206:0x0388, B:207:0x038d, B:208:0x038e, B:209:0x0395, B:210:0x0396, B:211:0x039d, B:212:0x039e), top: B:262:0x0371 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #22 {all -> 0x011d, blocks: (B:40:0x0110, B:42:0x0116), top: B:258:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129 A[Catch: all -> 0x0162, TryCatch #5 {all -> 0x0162, blocks: (B:52:0x015b, B:46:0x0122, B:48:0x0129, B:49:0x0144), top: B:228:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144 A[Catch: all -> 0x0162, TryCatch #5 {all -> 0x0162, blocks: (B:52:0x015b, B:46:0x0122, B:48:0x0129, B:49:0x0144), top: B:228:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f A[Catch: all -> 0x0196, TryCatch #17 {all -> 0x0196, blocks: (B:59:0x0168, B:61:0x016f, B:63:0x0176, B:65:0x017a, B:67:0x017e, B:68:0x017f, B:69:0x0184, B:70:0x0185, B:71:0x018c, B:72:0x018d, B:73:0x0194, B:74:0x0195), top: B:250:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #17 {all -> 0x0196, blocks: (B:59:0x0168, B:61:0x016f, B:63:0x0176, B:65:0x017a, B:67:0x017e, B:68:0x017f, B:69:0x0184, B:70:0x0185, B:71:0x018c, B:72:0x018d, B:73:0x0194, B:74:0x0195), top: B:250:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af A[Catch: all -> 0x01d6, TryCatch #18 {all -> 0x01d6, blocks: (B:88:0x01a8, B:90:0x01af, B:92:0x01b6, B:94:0x01ba, B:96:0x01be, B:97:0x01bf, B:98:0x01c4, B:99:0x01c5, B:100:0x01cc, B:101:0x01cd, B:102:0x01d4, B:103:0x01d5), top: B:251:0x01a8 }] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v91, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ry1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
