package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bf2 extends kuk implements Function2 {
    public rg3 a;
    public rg3 b;
    public byte c;
    public final /* synthetic */ df2 d;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf2(df2 df2Var, boolean z, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.d = df2Var;
        this.f = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        boolean z = this.f;
        df2 df2Var = this.d;
        switch (b) {
            case 0:
                return new bf2(df2Var, z, mt5Var, (byte) 0);
            default:
                return new bf2(df2Var, z, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                boolean z = this.f;
                return new bf2(this.d, z, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0176 A[Catch: all -> 0x019d, TryCatch #12 {all -> 0x019d, blocks: (B:106:0x016f, B:108:0x0176, B:110:0x017d, B:112:0x0181, B:114:0x0185, B:115:0x0186, B:116:0x018b, B:117:0x018c, B:118:0x0193, B:119:0x0194, B:120:0x019b, B:121:0x019c), top: B:181:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019c A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #12 {all -> 0x019d, blocks: (B:106:0x016f, B:108:0x0176, B:110:0x017d, B:112:0x0181, B:114:0x0185, B:115:0x0186, B:116:0x018b, B:117:0x018c, B:118:0x0193, B:119:0x0194, B:120:0x019b, B:121:0x019c), top: B:181:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01cc A[Catch: all -> 0x01f3, TryCatch #8 {all -> 0x01f3, blocks: (B:139:0x01c5, B:141:0x01cc, B:143:0x01d3, B:145:0x01d7, B:147:0x01db, B:148:0x01dc, B:149:0x01e1, B:150:0x01e2, B:151:0x01e9, B:152:0x01ea, B:153:0x01f1, B:154:0x01f2), top: B:175:0x01c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f2 A[Catch: all -> 0x01f3, TRY_LEAVE, TryCatch #8 {all -> 0x01f3, blocks: (B:139:0x01c5, B:141:0x01cc, B:143:0x01d3, B:145:0x01d7, B:147:0x01db, B:148:0x01dc, B:149:0x01e1, B:150:0x01e2, B:151:0x01e9, B:152:0x01ea, B:153:0x01f1, B:154:0x01f2), top: B:175:0x01c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:28:0x0077, B:30:0x007e, B:32:0x0085, B:34:0x0089, B:36:0x008d, B:37:0x008e, B:38:0x0093, B:39:0x0094, B:40:0x009b, B:41:0x009c, B:42:0x00a3, B:43:0x00a4), top: B:162:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4 A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #1 {all -> 0x00a5, blocks: (B:28:0x0077, B:30:0x007e, B:32:0x0085, B:34:0x0089, B:36:0x008d, B:37:0x008e, B:38:0x0093, B:39:0x0094, B:40:0x009b, B:41:0x009c, B:42:0x00a3, B:43:0x00a4), top: B:162:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4 A[Catch: all -> 0x00fb, TryCatch #11 {all -> 0x00fb, blocks: (B:61:0x00cd, B:63:0x00d4, B:65:0x00db, B:67:0x00df, B:69:0x00e3, B:70:0x00e4, B:71:0x00e9, B:72:0x00ea, B:73:0x00f1, B:74:0x00f2, B:75:0x00f9, B:76:0x00fa), top: B:180:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #11 {all -> 0x00fb, blocks: (B:61:0x00cd, B:63:0x00d4, B:65:0x00db, B:67:0x00df, B:69:0x00e3, B:70:0x00e4, B:71:0x00e9, B:72:0x00ea, B:73:0x00f1, B:74:0x00f2, B:75:0x00f9, B:76:0x00fa), top: B:180:0x00cd }] */
    /* JADX WARN: Type inference failed for: r13v28, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r13v57, types: [ads_mobile_sdk.rg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bf2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
