package defpackage;

import ads_mobile_sdk.b82;
import ads_mobile_sdk.cy0;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.ph0;
import ads_mobile_sdk.q6;
import ads_mobile_sdk.uo2;
import ads_mobile_sdk.v82;
import android.app.Application;
import android.view.ViewParent;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class eno extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eno(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eno(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eno(mt5 mt5Var, ph0 ph0Var, d2i d2iVar) {
        super(2, mt5Var);
        this.t = (byte) 1;
        this.u = ph0Var;
        this.v = d2iVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                return new eno((List) this.u, (Application) obj2, mt5Var, (byte) 0);
            case 1:
                return new eno(mt5Var, (ph0) this.u, (d2i) obj2);
            case 2:
                return new eno((uo2) this.u, (rap) obj2, mt5Var, (byte) 2);
            case 3:
                return new eno((prb) this.u, (it1) obj2, mt5Var, (byte) 3);
            case 4:
                return new eno((b82) this.u, (q6) obj2, mt5Var, (byte) 4);
            case 5:
                return new eno((ViewParent) this.u, (v82) obj2, mt5Var, (byte) 5);
            case 6:
                eno enoVar = new eno((byte) 6, mt5Var, obj2);
                enoVar.u = obj;
                return enoVar;
            case 7:
                return new eno((d3k) this.u, (Application) obj2, mt5Var, (byte) 7);
            case 8:
                return new eno((n1p) this.u, (t5p) obj2, mt5Var, (byte) 8);
            case 9:
                eno enoVar2 = new eno((byte) 9, mt5Var, obj2);
                enoVar2.u = obj;
                return enoVar2;
            case 10:
                eno enoVar3 = new eno((byte) 10, mt5Var, obj2);
                enoVar3.u = obj;
                return enoVar3;
            case 11:
                return new eno((z8p) this.u, (Application) obj2, mt5Var, (byte) 11);
            case 12:
                eno enoVar4 = new eno((byte) 12, mt5Var, obj2);
                enoVar4.u = obj;
                return enoVar4;
            case 13:
                return new eno((File) this.u, (File) obj2, mt5Var, (byte) 13);
            default:
                eno enoVar5 = new eno((byte) 14, mt5Var, obj2);
                enoVar5.u = obj;
                return enoVar5;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.v;
        switch (b) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                eno enoVar = new eno((byte) 6, (mt5) obj2, obj3);
                enoVar.u = (cy0) obj;
                break;
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eno.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
