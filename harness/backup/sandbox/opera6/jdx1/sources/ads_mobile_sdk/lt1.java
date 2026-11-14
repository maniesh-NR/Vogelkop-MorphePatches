package ads_mobile_sdk;

import defpackage.prb;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class lt1 extends kuk implements Function2 {
    public rg3 a;
    public rg3 b;
    public it1 c;
    public boolean d;
    public final /* synthetic */ it1 e;
    public final /* synthetic */ wt1 f;
    public final /* synthetic */ prb g;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lt1(it1 it1Var, wt1 wt1Var, prb prbVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.e = it1Var;
        this.f = wt1Var;
        this.g = prbVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new lt1(this.e, this.f, this.g, mt5Var, (byte) 0);
            case 1:
                return new lt1(this.e, this.f, this.g, mt5Var, (byte) 1);
            case 2:
                return new lt1(this.e, this.f, this.g, mt5Var, (byte) 2);
            default:
                return new lt1(this.e, this.f, this.g, mt5Var, (byte) 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a4 A[Catch: all -> 0x01cb, TryCatch #3 {all -> 0x01cb, blocks: (B:117:0x019d, B:119:0x01a4, B:121:0x01ab, B:123:0x01af, B:125:0x01b3, B:126:0x01b4, B:127:0x01b9, B:128:0x01ba, B:129:0x01c1, B:130:0x01c2, B:131:0x01c9, B:132:0x01ca), top: B:191:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ca A[Catch: all -> 0x01cb, TRY_LEAVE, TryCatch #3 {all -> 0x01cb, blocks: (B:117:0x019d, B:119:0x01a4, B:121:0x01ab, B:123:0x01af, B:125:0x01b3, B:126:0x01b4, B:127:0x01b9, B:128:0x01ba, B:129:0x01c1, B:130:0x01c2, B:131:0x01c9, B:132:0x01ca), top: B:191:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0246 A[Catch: all -> 0x026d, TryCatch #5 {all -> 0x026d, blocks: (B:163:0x023f, B:165:0x0246, B:167:0x024d, B:169:0x0251, B:171:0x0255, B:172:0x0256, B:173:0x025b, B:174:0x025c, B:175:0x0263, B:176:0x0264, B:177:0x026b, B:178:0x026c), top: B:194:0x023f }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x026c A[Catch: all -> 0x026d, TRY_LEAVE, TryCatch #5 {all -> 0x026d, blocks: (B:163:0x023f, B:165:0x0246, B:167:0x024d, B:169:0x0251, B:171:0x0255, B:172:0x0256, B:173:0x025b, B:174:0x025c, B:175:0x0263, B:176:0x0264, B:177:0x026b, B:178:0x026c), top: B:194:0x023f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[Catch: all -> 0x00bc, TryCatch #14 {all -> 0x00bc, blocks: (B:32:0x008e, B:34:0x0095, B:36:0x009c, B:38:0x00a0, B:40:0x00a4, B:41:0x00a5, B:42:0x00aa, B:43:0x00ab, B:44:0x00b2, B:45:0x00b3, B:46:0x00ba, B:47:0x00bb), top: B:210:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #14 {all -> 0x00bc, blocks: (B:32:0x008e, B:34:0x0095, B:36:0x009c, B:38:0x00a0, B:40:0x00a4, B:41:0x00a5, B:42:0x00aa, B:43:0x00ab, B:44:0x00b2, B:45:0x00b3, B:46:0x00ba, B:47:0x00bb), top: B:210:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114 A[Catch: all -> 0x013b, TryCatch #13 {all -> 0x013b, blocks: (B:72:0x010d, B:74:0x0114, B:76:0x011b, B:78:0x011f, B:80:0x0123, B:81:0x0124, B:82:0x0129, B:83:0x012a, B:84:0x0131, B:85:0x0132, B:86:0x0139, B:87:0x013a), top: B:209:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a A[Catch: all -> 0x013b, TRY_LEAVE, TryCatch #13 {all -> 0x013b, blocks: (B:72:0x010d, B:74:0x0114, B:76:0x011b, B:78:0x011f, B:80:0x0123, B:81:0x0124, B:82:0x0129, B:83:0x012a, B:84:0x0131, B:85:0x0132, B:86:0x0139, B:87:0x013a), top: B:209:0x010d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lt1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
