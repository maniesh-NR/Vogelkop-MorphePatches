package defpackage;

import ads_mobile_sdk.af;
import ads_mobile_sdk.gn1;
import ads_mobile_sdk.iu0;
import ads_mobile_sdk.jq0;
import ads_mobile_sdk.pf3;
import ads_mobile_sdk.xu0;
import java.util.Collections;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class eo6 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo6(String str, Object obj, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = str;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo6(String str, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = str;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                eo6 eo6Var = new eo6(this.v, mt5Var, (byte) 0);
                eo6Var.u = obj;
                return eo6Var;
            case 1:
                eo6 eo6Var2 = new eo6(this.v, mt5Var, (byte) 1);
                eo6Var2.u = obj;
                return eo6Var2;
            case 2:
                eo6 eo6Var3 = new eo6(this.v, mt5Var, (byte) 2);
                eo6Var3.u = obj;
                return eo6Var3;
            case 3:
                eo6 eo6Var4 = new eo6(this.v, mt5Var, (byte) 3);
                eo6Var4.u = obj;
                return eo6Var4;
            case 4:
                eo6 eo6Var5 = new eo6(this.v, mt5Var, (byte) 4);
                eo6Var5.u = obj;
                return eo6Var5;
            case 5:
                return new eo6(this.v, this.u, mt5Var, (byte) 5);
            case 6:
                eo6 eo6Var6 = new eo6(this.v, mt5Var, (byte) 6);
                eo6Var6.u = obj;
                return eo6Var6;
            case 7:
                return new eo6(this.v, this.u, mt5Var, (byte) 7);
            case 8:
                return new eo6(this.v, this.u, mt5Var, (byte) 8);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new eo6(this.v, this.u, mt5Var, (byte) 9);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new eo6(this.v, this.u, mt5Var, (byte) 10);
            case 11:
                return new eo6(this.v, this.u, mt5Var, (byte) 11);
            case 12:
                return new eo6(this.v, this.u, mt5Var, (byte) 12);
            case 13:
                return new eo6(this.v, this.u, mt5Var, (byte) 13);
            case 14:
                return new eo6(this.v, this.u, mt5Var, (byte) 14);
            case 15:
                eo6 eo6Var7 = new eo6(this.v, mt5Var, (byte) 15);
                eo6Var7.u = obj;
                return eo6Var7;
            case 16:
                return new eo6(this.v, this.u, mt5Var, (byte) 16);
            default:
                return new eo6(this.v, this.u, mt5Var, (byte) 17);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        String str = this.v;
        switch (b) {
            case 6:
                eo6 eo6Var = new eo6(str, (mt5) obj2, (byte) 6);
                eo6Var.u = (af) obj;
                break;
            case 15:
                eo6 eo6Var2 = new eo6(str, (mt5) obj2, (byte) 15);
                eo6Var2.u = (jq0) obj;
                break;
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        String str = this.v;
        switch (b) {
            case 0:
                iuc iucVar = (iuc) this.u;
                px5 px5Var = px5.a;
                ybh.y(obj);
                ouc oucVarI = iucVar.i(str, ouc.b());
                fuc fucVar = (fuc) iucVar.toBuilder();
                nuc nucVar = (nuc) oucVarI.toBuilder();
                nucVar.copyOnWrite();
                ((ouc) ((a) nucVar).instance).g();
                fucVar.b(str, (ouc) nucVar.build());
                break;
            case 1:
                iuc iucVar2 = (iuc) this.u;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ouc oucVarI2 = iucVar2.i(str, ouc.b());
                fuc fucVar2 = (fuc) iucVar2.toBuilder();
                nuc nucVar2 = (nuc) oucVarI2.toBuilder();
                nucVar2.copyOnWrite();
                ((ouc) ((a) nucVar2).instance).f();
                fucVar2.b(str, (ouc) nucVar2.build());
                break;
            case 2:
                iuc iucVar3 = (iuc) this.u;
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                ouc oucVarI3 = iucVar3.i(str, ouc.b());
                fuc fucVar3 = (fuc) iucVar3.toBuilder();
                nuc nucVar3 = (nuc) oucVarI3.toBuilder();
                nucVar3.copyOnWrite();
                ((ouc) ((a) nucVar3).instance).h();
                fucVar3.b(str, (ouc) nucVar3.build());
                break;
            case 3:
                iuc iucVar4 = (iuc) this.u;
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                fuc fucVar4 = (fuc) iucVar4.toBuilder();
                fucVar4.copyOnWrite();
                ((iuc) ((a) fucVar4).instance).q(str);
                break;
            case 4:
                wch wchVar = (wch) this.u;
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                wchVar.getClass();
                break;
            case 5:
                px5 px5Var6 = px5.a;
                ybh.y(obj);
                vr3 vr3Var = xu0.a;
                sko.t("Invoking function [onVideoEnd] on listener [", str, "]", null);
                m3n m3nVar = ((pf3) this.u).a.m;
                if (m3nVar != null) {
                    m3nVar.getVideoLifecycleCallbacks();
                }
                break;
            case 6:
                px5 px5Var7 = px5.a;
                ybh.y(obj);
                ump umpVarN = ((af) this.u).n();
                Collections.unmodifiableMap(Collections.unmodifiableMap(af.O(((iu0) umpVarN).b)));
                Objects.requireNonNull(str);
                umpVarN.b$1();
                af afVar = ((iu0) umpVarN).b;
                gn1 gn1VarO = af.O(afVar);
                if (!gn1VarO.a) {
                    af.P(afVar, gn1VarO.b());
                }
                af.O(afVar).remove(str);
                break;
            case 7:
                px5 px5Var8 = px5.a;
                ybh.y(obj);
                vr3 vr3Var2 = xu0.a;
                sko.t("Invoking function [onVideoPause] on listener [", str, "]", null);
                m3n m3nVar2 = ((pf3) this.u).a.m;
                if (m3nVar2 != null) {
                    m3nVar2.getVideoLifecycleCallbacks();
                }
                break;
            case 8:
                px5 px5Var9 = px5.a;
                ybh.y(obj);
                vr3 vr3Var3 = xu0.a;
                sko.t("Invoking function [onVideoPlay] on listener [", str, "]", null);
                m3n m3nVar3 = ((pf3) this.u).a.m;
                if (m3nVar3 != null) {
                    m3nVar3.getVideoLifecycleCallbacks();
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                px5 px5Var10 = px5.a;
                ybh.y(obj);
                vr3 vr3Var4 = xu0.a;
                sko.t("Invoking function [onCreate] on listener [", str, "]", null);
                ((clp) this.u).d();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                px5 px5Var11 = px5.a;
                ybh.y(obj);
                vr3 vr3Var5 = xu0.a;
                sko.t("Invoking function [onDestroy] on listener [", str, "]", null);
                ((clp) this.u).onDestroy();
                break;
            case 11:
                px5 px5Var12 = px5.a;
                ybh.y(obj);
                vr3 vr3Var6 = xu0.a;
                sko.t("Invoking function [onPause] on listener [", str, "]", null);
                ((clp) this.u).onPause();
                break;
            case 12:
                px5 px5Var13 = px5.a;
                ybh.y(obj);
                vr3 vr3Var7 = xu0.a;
                sko.t("Invoking function [onRestart] on listener [", str, "]", null);
                ((clp) this.u).c();
                break;
            case 13:
                px5 px5Var14 = px5.a;
                ybh.y(obj);
                vr3 vr3Var8 = xu0.a;
                sko.t("Invoking function [onResume] on listener [", str, "]", null);
                ((clp) this.u).onResume();
                break;
            case 14:
                px5 px5Var15 = px5.a;
                ybh.y(obj);
                vr3 vr3Var9 = xu0.a;
                sko.t("Invoking function [onStart] on listener [", str, "]", null);
                ((clp) this.u).a$1();
                break;
            case 15:
                px5 px5Var16 = px5.a;
                ybh.y(obj);
                i6p i6pVarN = ((jq0) this.u).n();
                i6pVarN.b$1();
                ((iu0) i6pVarN).b.b(str);
                break;
            case 16:
                px5 px5Var17 = px5.a;
                ybh.y(obj);
                vr3 vr3Var10 = xu0.a;
                sko.t("Invoking function [onStop] on listener [", str, "]", null);
                ((clp) this.u).onStop();
                break;
            default:
                px5 px5Var18 = px5.a;
                ybh.y(obj);
                vr3 vr3Var11 = xu0.a;
                sko.t("Invoking function [onUserLeaveHint] on listener [", str, "]", null);
                ((clp) this.u).b();
                break;
        }
        return Unit.a;
    }
}
