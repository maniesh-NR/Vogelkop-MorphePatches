package defpackage;

import ads_mobile_sdk.qp0;
import ads_mobile_sdk.vv1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class he6 extends kuk implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ boolean v;
    public Object w;
    public Object x;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he6(qp0 qp0Var, vv1 vv1Var, String str, boolean z, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.y = qp0Var;
        this.z = vv1Var;
        this.A = str;
        this.v = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he6(nqh nqhVar, ie6 ie6Var, Object obj, boolean z, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 0;
        this.x = nqhVar;
        this.A = ie6Var;
        this.z = obj;
        this.v = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.z;
        Object obj3 = this.A;
        switch (b) {
            case 0:
                he6 he6Var = new he6((nqh) this.x, (ie6) obj3, this.z, this.v, mt5Var);
                he6Var.y = obj;
                return he6Var;
            case 1:
                return new he6((qp0) this.y, (vv1) obj2, (String) obj3, this.v, mt5Var, (byte) 1);
            default:
                return new he6((qp0) this.y, (vv1) obj2, (String) obj3, this.v, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x03b4, code lost:
    
        if (r7.d(r19, r1) == r5) goto L210;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0296 A[Catch: all -> 0x02a5, TryCatch #2 {all -> 0x02a5, blocks: (B:110:0x01e1, B:127:0x0290, B:129:0x0296, B:130:0x029c), top: B:223:0x01e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b0 A[Catch: all -> 0x02d7, TryCatch #12 {all -> 0x02d7, blocks: (B:137:0x02a9, B:139:0x02b0, B:141:0x02b7, B:143:0x02bb, B:145:0x02bf, B:146:0x02c0, B:147:0x02c5, B:148:0x02c6, B:149:0x02cd, B:150:0x02ce, B:151:0x02d5, B:152:0x02d6), top: B:241:0x02a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d6 A[Catch: all -> 0x02d7, TRY_LEAVE, TryCatch #12 {all -> 0x02d7, blocks: (B:137:0x02a9, B:139:0x02b0, B:141:0x02b7, B:143:0x02bb, B:145:0x02bf, B:146:0x02c0, B:147:0x02c5, B:148:0x02c6, B:149:0x02cd, B:150:0x02ce, B:151:0x02d5, B:152:0x02d6), top: B:241:0x02a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0305 A[Catch: all -> 0x0313, TryCatch #10 {all -> 0x0313, blocks: (B:106:0x01cb, B:164:0x02ff, B:166:0x0305, B:167:0x030b), top: B:237:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031e A[Catch: all -> 0x0345, TryCatch #3 {all -> 0x0345, blocks: (B:174:0x0317, B:176:0x031e, B:178:0x0325, B:180:0x0329, B:182:0x032d, B:183:0x032e, B:184:0x0333, B:185:0x0334, B:186:0x033b, B:187:0x033c, B:188:0x0343, B:189:0x0344), top: B:225:0x0317 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0344 A[Catch: all -> 0x0345, TRY_LEAVE, TryCatch #3 {all -> 0x0345, blocks: (B:174:0x0317, B:176:0x031e, B:178:0x0325, B:180:0x0329, B:182:0x032d, B:183:0x032e, B:184:0x0333, B:185:0x0334, B:186:0x033b, B:187:0x033c, B:188:0x0343, B:189:0x0344), top: B:225:0x0317 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ff A[Catch: all -> 0x010e, TryCatch #6 {all -> 0x010e, blocks: (B:13:0x004a, B:30:0x00f9, B:32:0x00ff, B:33:0x0105), top: B:230:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:40:0x0112, B:42:0x0119, B:44:0x0120, B:46:0x0124, B:48:0x0128, B:49:0x0129, B:50:0x012e, B:51:0x012f, B:52:0x0136, B:53:0x0137, B:54:0x013e, B:55:0x013f), top: B:220:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:40:0x0112, B:42:0x0119, B:44:0x0120, B:46:0x0124, B:48:0x0128, B:49:0x0129, B:50:0x012e, B:51:0x012f, B:52:0x0136, B:53:0x0137, B:54:0x013e, B:55:0x013f), top: B:220:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e A[Catch: all -> 0x017c, TryCatch #14 {all -> 0x017c, blocks: (B:9:0x0034, B:67:0x0168, B:69:0x016e, B:70:0x0174), top: B:244:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0187 A[Catch: all -> 0x01ae, TryCatch #7 {all -> 0x01ae, blocks: (B:77:0x0180, B:79:0x0187, B:81:0x018e, B:83:0x0192, B:85:0x0196, B:86:0x0197, B:87:0x019c, B:88:0x019d, B:89:0x01a4, B:90:0x01a5, B:91:0x01ac, B:92:0x01ad), top: B:232:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad A[Catch: all -> 0x01ae, TRY_LEAVE, TryCatch #7 {all -> 0x01ae, blocks: (B:77:0x0180, B:79:0x0187, B:81:0x018e, B:83:0x0192, B:85:0x0196, B:86:0x0197, B:87:0x019c, B:88:0x019d, B:89:0x01a4, B:90:0x01a5, B:91:0x01ac, B:92:0x01ad), top: B:232:0x0180 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
