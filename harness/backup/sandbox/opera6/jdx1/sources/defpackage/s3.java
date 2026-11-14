package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s3 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(Object obj, Object obj2, Object obj3, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
        this.x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(u07 u07Var, mt5 mt5Var, eb4 eb4Var, Map map) {
        super(2, mt5Var);
        this.t = (byte) 24;
        this.v = u07Var;
        this.w = eb4Var;
        this.x = map;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.w;
        Object obj3 = this.x;
        switch (b) {
            case 0:
                return new s3((lde) this.v, (mwg) obj2, (xb7) obj3, mt5Var, (byte) 0);
            case 1:
                return new s3((xr) this.v, (Context) obj2, (l1b) obj3, mt5Var, (byte) 1);
            case 2:
                return new s3(obj2, obj3, mt5Var, (byte) 2);
            case 3:
                return new s3((Function2) this.v, this.w, (nx5) obj3, mt5Var, (byte) 3);
            case 4:
                s3 s3Var = new s3(obj2, obj3, mt5Var, (byte) 4);
                s3Var.v = obj;
                return s3Var;
            case 5:
                s3 s3Var2 = new s3(obj2, obj3, mt5Var, (byte) 5);
                s3Var2.v = obj;
                return s3Var2;
            case 6:
                s3 s3Var3 = new s3(obj2, obj3, mt5Var, (byte) 6);
                s3Var3.v = obj;
                return s3Var3;
            case 7:
                s3 s3Var4 = new s3(obj2, obj3, mt5Var, (byte) 7);
                s3Var4.v = obj;
                return s3Var4;
            case 8:
                return new s3(obj2, obj3, mt5Var, (byte) 8);
            case 9:
                return new s3((tz1) this.v, (String) obj2, (String) obj3, mt5Var, (byte) 9);
            case 10:
                return new s3((gu6) this.v, (g1b) obj2, (Function1) obj3, mt5Var, (byte) 10);
            case 11:
                return new s3((us3) this.v, (wye) obj2, (gb3) obj3, mt5Var, (byte) 11);
            case 12:
                return new s3((s9i) this.v, (String) obj2, (x94) obj3, mt5Var, (byte) 12);
            case 13:
                return new s3((p12) this.v, (String) obj2, (z21) obj3, mt5Var, (byte) 13);
            case 14:
                return new s3((mm4) this.v, (qdg) obj2, (l01) obj3, mt5Var, (byte) 14);
            case 15:
                s3 s3Var5 = new s3(obj2, obj3, mt5Var, (byte) 15);
                s3Var5.v = obj;
                return s3Var5;
            case 16:
                s3 s3Var6 = new s3(obj2, obj3, mt5Var, (byte) 16);
                s3Var6.v = obj;
                return s3Var6;
            case 17:
                s3 s3Var7 = new s3(obj2, obj3, mt5Var, (byte) 17);
                s3Var7.v = obj;
                return s3Var7;
            case 18:
                s3 s3Var8 = new s3(obj2, obj3, mt5Var, (byte) 18);
                s3Var8.v = obj;
                return s3Var8;
            case 19:
                s3 s3Var9 = new s3(obj2, obj3, mt5Var, (byte) 19);
                s3Var9.v = obj;
                return s3Var9;
            case 20:
                s3 s3Var10 = new s3(obj2, obj3, mt5Var, (byte) 20);
                s3Var10.v = obj;
                return s3Var10;
            case 21:
                s3 s3Var11 = new s3(obj2, obj3, mt5Var, (byte) 21);
                s3Var11.v = obj;
                return s3Var11;
            case 22:
                return new s3((fv6) this.v, (gfe) obj2, (Function2) obj3, mt5Var, (byte) 22);
            case 23:
                s3 s3Var12 = new s3(obj2, obj3, mt5Var, (byte) 23);
                s3Var12.v = obj;
                return s3Var12;
            case 24:
                return new s3((u07) this.v, mt5Var, (eb4) obj2, (Map) obj3);
            case 25:
                s3 s3Var13 = new s3(obj2, obj3, mt5Var, (byte) 25);
                s3Var13.v = obj;
                return s3Var13;
            case 26:
                return new s3((ra7) this.v, (Function2) obj2, (ua7) obj3, mt5Var, (byte) 26);
            case 27:
                return new s3((ra7) this.v, (gg6) obj2, (ua7) obj3, mt5Var, (byte) 27);
            case 28:
                return new s3(obj2, obj3, mt5Var, (byte) 28);
            default:
                return new s3((lde) this.v, (ndb) obj2, (xb7) obj3, mt5Var, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: m65 */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0681  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
