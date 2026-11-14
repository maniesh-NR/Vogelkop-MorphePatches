package defpackage;

import ads_mobile_sdk.bg;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.k61;
import ads_mobile_sdk.wt1;
import ads_mobile_sdk.yq3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class cek extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public final /* synthetic */ Object w;
    public Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cek(it1 it1Var, wt1 wt1Var, prb prbVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 27;
        this.x = wt1Var;
        this.v = prbVar;
        this.w = it1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cek(k61 k61Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = k61Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cek(Object obj, Object obj2, Object obj3, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.x = obj;
        this.v = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cek(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cek(String str, Object obj, mt5 mt5Var, Object obj2, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.x = str;
        this.v = obj;
        this.w = obj2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 0);
            case 1:
                cek cekVar = new cek(this.v, obj2, mt5Var, (byte) 1);
                cekVar.x = obj;
                return cekVar;
            case 2:
                cek cekVar2 = new cek(this.v, obj2, mt5Var, (byte) 2);
                cekVar2.x = obj;
                return cekVar2;
            case 3:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 3);
            case 4:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 4);
            case 5:
                return new cek(this.v, obj2, mt5Var, (byte) 5);
            case 6:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 6);
            case 7:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 7);
            case 8:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 8);
            case 9:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 9);
            case 10:
                return new cek(this.v, obj2, mt5Var, (byte) 10);
            case 11:
                return new cek(this.v, obj2, mt5Var, (byte) 11);
            case 12:
                cek cekVar3 = new cek(this.v, obj2, mt5Var, (byte) 12);
                cekVar3.x = obj;
                return cekVar3;
            case 13:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 13);
            case 14:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 14);
            case 15:
                cek cekVar4 = new cek(this.v, obj2, mt5Var, (byte) 15);
                cekVar4.x = obj;
                return cekVar4;
            case 16:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 16);
            case 17:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 17);
            case 18:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 18);
            case 19:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 19);
            case 20:
                return new cek((String) this.x, this.v, mt5Var, obj2, (byte) 20);
            case 21:
                return new cek((yq3) obj2, mt5Var, (byte) 21);
            case 22:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 22);
            case 23:
                return new cek((String) this.x, this.v, mt5Var, obj2, (byte) 23);
            case 24:
                return new cek((bg) obj2, mt5Var, (byte) 24);
            case 25:
                return new cek((String) this.x, this.v, mt5Var, obj2, (byte) 25);
            case 26:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 26);
            case 27:
                return new cek((it1) obj2, (wt1) this.x, (prb) this.v, mt5Var);
            case 28:
                return new cek((String) this.x, this.v, mt5Var, obj2, (byte) 28);
            default:
                return new cek(this.x, this.v, obj2, mt5Var, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.w;
        switch (b) {
            case 21:
                break;
            case 24:
                break;
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x073f, code lost:
    
        r0 = r13.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x074d, code lost:
    
        if (((java.lang.Boolean) r13.d.invoke()).booleanValue() == false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x074f, code lost:
    
        r1 = k0o.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0752, code lost:
    
        r1 = new k0o(j0o.c, false, new q0n((byte) 16), 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0761, code lost:
    
        r0.r(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0766, code lost:
    
        return kotlin.Unit.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035f A[Catch: all -> 0x0384, TryCatch #0 {all -> 0x0384, blocks: (B:145:0x0314, B:148:0x031a, B:150:0x031e, B:152:0x0325, B:154:0x032d, B:156:0x035f, B:157:0x037d), top: B:450:0x0314 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 2754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cek.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
