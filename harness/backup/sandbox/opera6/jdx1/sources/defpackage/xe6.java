package defpackage;

import ads_mobile_sdk.av2;
import ads_mobile_sdk.e7;
import ads_mobile_sdk.ew1;
import ads_mobile_sdk.fo;
import ads_mobile_sdk.gn1;
import ads_mobile_sdk.iw1;
import ads_mobile_sdk.pf3;
import ads_mobile_sdk.qr0;
import ads_mobile_sdk.xu0;
import ads_mobile_sdk.zt1;
import ads_mobile_sdk.zu1;
import ads_mobile_sdk.zy1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xe6 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe6(String str, Object obj, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = str;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe6(String str, Object obj, mt5 mt5Var, boolean z) {
        super(2, mt5Var);
        this.t = (byte) 6;
        this.w = str;
        this.v = obj;
        this.u = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe6(String str, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe6(String str, mt5 mt5Var, boolean z) {
        super(2, mt5Var);
        this.t = (byte) 8;
        this.w = str;
        this.u = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        String str = this.w;
        switch (b) {
            case 0:
                xe6 xe6Var = new xe6(str, mt5Var, (byte) 0);
                xe6Var.v = obj;
                return xe6Var;
            case 1:
                xe6 xe6Var2 = new xe6(str, mt5Var, (byte) 1);
                xe6Var2.v = obj;
                return xe6Var2;
            case 2:
                xe6 xe6Var3 = new xe6(str, mt5Var, (byte) 2);
                xe6Var3.v = obj;
                return xe6Var3;
            case 3:
                xe6 xe6Var4 = new xe6(str, mt5Var, (byte) 3);
                xe6Var4.v = obj;
                return xe6Var4;
            case 4:
                xe6 xe6Var5 = new xe6(str, mt5Var, (byte) 4);
                xe6Var5.v = obj;
                return xe6Var5;
            case 5:
                xe6 xe6Var6 = new xe6(str, mt5Var, (byte) 5);
                xe6Var6.v = obj;
                return xe6Var6;
            case 6:
                return new xe6(str, this.v, mt5Var, this.u);
            case 7:
                return new xe6(str, this.v, mt5Var, (byte) 7);
            case 8:
                xe6 xe6Var7 = new xe6(str, mt5Var, this.u);
                xe6Var7.v = obj;
                return xe6Var7;
            case 9:
                return new xe6(str, this.v, mt5Var, (byte) 9);
            case 10:
                return new xe6(str, this.v, mt5Var, (byte) 10);
            case 11:
                return new xe6(str, this.v, mt5Var, (byte) 11);
            case 12:
                return new xe6(str, this.v, mt5Var, (byte) 12);
            case 13:
                return new xe6(str, this.v, mt5Var, (byte) 13);
            case 14:
                return new xe6(str, this.v, mt5Var, (byte) 14);
            case 15:
                return new xe6(str, this.v, mt5Var, (byte) 15);
            case 16:
                return new xe6(str, this.v, mt5Var, (byte) 16);
            case 17:
                return new xe6(str, this.v, mt5Var, (byte) 17);
            case 18:
                return new xe6(str, this.v, mt5Var, (byte) 18);
            case 19:
                return new xe6(str, this.v, mt5Var, (byte) 19);
            case 20:
                return new xe6(str, this.v, mt5Var, (byte) 20);
            case 21:
                return new xe6(str, this.v, mt5Var, (byte) 21);
            case 22:
                return new xe6(str, this.v, mt5Var, (byte) 22);
            case 23:
                return new xe6(str, this.v, mt5Var, (byte) 23);
            case 24:
                return new xe6(str, this.v, mt5Var, (byte) 24);
            case 25:
                return new xe6(str, this.v, mt5Var, (byte) 25);
            case 26:
                return new xe6(str, this.v, mt5Var, (byte) 26);
            case 27:
                return new xe6(str, this.v, mt5Var, (byte) 27);
            case 28:
                return new xe6(str, this.v, mt5Var, (byte) 28);
            default:
                return new xe6(str, this.v, mt5Var, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        FrameLayout frameLayoutC;
        byte b = this.t;
        String str = this.w;
        switch (b) {
            case 0:
                ggb ggbVar = (ggb) this.v;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    rr1 rr1Var = ggbVar.k;
                    this.v = null;
                    this.u = true;
                    if (rr1Var.H0(str, this) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 1:
                ggb ggbVar2 = (ggb) this.v;
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    rr1 rr1Var2 = ggbVar2.c;
                    this.v = null;
                    this.u = true;
                    Object objZ0 = rr1Var2.Z0(str, this);
                    if (objZ0 == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                    break;
                }
                break;
            case 2:
                ggb ggbVar3 = (ggb) this.v;
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    rr1 rr1Var3 = ggbVar3.c;
                    this.v = null;
                    this.u = true;
                    Object objC1 = rr1Var3.c1(str, this);
                    if (objC1 == px5Var3) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                    break;
                }
                break;
            case 3:
                ggb ggbVar4 = (ggb) this.v;
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    rr1 rr1Var4 = ggbVar4.l;
                    p71 p71Var = new p71(ggbVar4, str, (mt5) null, (byte) 7);
                    this.v = null;
                    this.u = true;
                    if (upj.B(rr1Var4, p71Var, this) == px5Var4) {
                        break;
                    }
                } else if (!z4) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 4:
                ggb ggbVar5 = (ggb) this.v;
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    rr1 rr1Var5 = ggbVar5.c;
                    this.v = null;
                    this.u = true;
                    Object objD1 = rr1Var5.d1(str, this);
                    if (objD1 == px5Var5) {
                        break;
                    }
                } else if (!z5) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                    break;
                }
                break;
            case 5:
                ggb ggbVar6 = (ggb) this.v;
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    rr1 rr1Var6 = ggbVar6.c;
                    this.v = null;
                    this.u = true;
                    Object objJ1 = rr1Var6.j1(str, this);
                    if (objJ1 == px5Var6) {
                        break;
                    }
                } else if (!z6) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                    break;
                }
                break;
            case 6:
                px5 px5Var7 = px5.a;
                ybh.y(obj);
                vr3 vr3Var = xu0.a;
                sko.t("Invoking function [onVideoMute] on listener [", str, "]", (Throwable) null);
                m3n m3nVar = ((pf3) this.v).a.m;
                if (m3nVar != null) {
                    m3nVar.getVideoLifecycleCallbacks();
                }
                break;
            case 7:
                px5 px5Var8 = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    vr3 vr3Var2 = xu0.a;
                    sko.t("Invoking function [onVisibilityChanged (true)] on listener [", str, "]", (Throwable) null);
                    hap hapVar = (hap) this.v;
                    this.u = true;
                    if (hapVar.a(true, this) == px5Var8) {
                        break;
                    }
                } else if (!z7) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 8:
                px5 px5Var9 = px5.a;
                ybh.y(obj);
                zu1 zu1Var = (zu1) this.v;
                boolean z8 = this.u;
                ymp ympVar = (ymp) zu1Var.n();
                Collections.unmodifiableMap(Collections.unmodifiableMap(((zu1) ympVar.b).adUnitToUseMediaView_));
                Objects.requireNonNull(str);
                ympVar.b$1();
                zu1 zu1Var2 = (zu1) ympVar.b;
                gn1 gn1Var = zu1Var2.adUnitToUseMediaView_;
                if (!gn1Var.a) {
                    zu1Var2.adUnitToUseMediaView_ = gn1Var.b();
                }
                zu1Var2.adUnitToUseMediaView_.put(str, Boolean.valueOf(z8));
                break;
            case 9:
                px5 px5Var10 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    vr3 vr3Var3 = xu0.a;
                    sko.t("Invoking function [onVisibilityChanged (false)] on listener [", str, "]", (Throwable) null);
                    hap hapVar2 = (hap) this.v;
                    this.u = true;
                    if (hapVar2.a(false, this) == px5Var10) {
                        break;
                    }
                } else if (!z9) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 10:
                px5 px5Var11 = px5.a;
                boolean z10 = this.u;
                if (!z10) {
                    ybh.y(obj);
                    vr3 vr3Var4 = xu0.a;
                    sko.t("Invoking function [onAdClicked] on listener [", str, "]", (Throwable) null);
                    rko rkoVar = (rko) this.v;
                    this.u = true;
                    if (rkoVar.n(this) == px5Var11) {
                        break;
                    }
                } else if (!z10) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 11:
                px5 px5Var12 = px5.a;
                boolean z11 = this.u;
                if (!z11) {
                    ybh.y(obj);
                    vr3 vr3Var5 = xu0.a;
                    sko.t("Invoking function [onAdDestroyed] on listener [", str, "]", (Throwable) null);
                    rko rkoVar2 = (rko) this.v;
                    this.u = true;
                    if (rkoVar2.a(this) == px5Var12) {
                        break;
                    }
                } else if (!z11) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 12:
                px5 px5Var13 = px5.a;
                boolean z12 = this.u;
                if (!z12) {
                    ybh.y(obj);
                    vr3 vr3Var6 = xu0.a;
                    sko.t("Invoking function [onAdDestroyed] on listener [", str, "]", (Throwable) null);
                    rko rkoVar3 = (rko) this.v;
                    this.u = true;
                    if (rkoVar3.a(this) == px5Var13) {
                        break;
                    }
                } else if (!z12) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 13:
                Unit unit = px5.a;
                boolean z13 = this.u;
                if (!z13) {
                    ybh.y(obj);
                    vr3 vr3Var7 = xu0.a;
                    sko.t("Invoking function [onMraidAdResized] on listener [", str, "]", (Throwable) null);
                    dfp dfpVar = (dfp) this.v;
                    this.u = true;
                    if (dfpVar.d(this) == unit) {
                        break;
                    }
                } else if (!z13) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 14:
                px5 px5Var14 = px5.a;
                boolean z14 = this.u;
                if (!z14) {
                    ybh.y(obj);
                    vr3 vr3Var8 = xu0.a;
                    sko.t("Invoking function [onAdDismissedFullscreenContent] on listener [", str, "]", (Throwable) null);
                    rko rkoVar4 = (rko) this.v;
                    this.u = true;
                    if (rkoVar4.g(this) == px5Var14) {
                        break;
                    }
                } else if (!z14) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 15:
                Unit unit2 = px5.a;
                boolean z15 = this.u;
                if (!z15) {
                    ybh.y(obj);
                    vr3 vr3Var9 = xu0.a;
                    sko.t("Invoking function [onMraidResizedAdClosed] on listener [", str, "]", (Throwable) null);
                    dfp dfpVar2 = (dfp) this.v;
                    this.u = true;
                    if (dfpVar2.h(this) == unit2) {
                        break;
                    }
                } else if (!z15) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 16:
                px5 px5Var15 = px5.a;
                boolean z16 = this.u;
                if (!z16) {
                    ybh.y(obj);
                    vr3 vr3Var10 = xu0.a;
                    sko.t("Invoking function [onMraidUnload] on listener [", str, "]", (Throwable) null);
                    dfp dfpVar3 = (dfp) this.v;
                    this.u = true;
                    if (dfpVar3.c(this) == px5Var15) {
                        break;
                    }
                } else if (!z16) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 17:
                px5 px5Var16 = px5.a;
                boolean z17 = this.u;
                if (!z17) {
                    ybh.y(obj);
                    vr3 vr3Var11 = xu0.a;
                    sko.t("Invoking function [onAdImpression] on listener [", str, "]", (Throwable) null);
                    rko rkoVar5 = (rko) this.v;
                    this.u = true;
                    if (rkoVar5.q(this) == px5Var16) {
                        break;
                    }
                } else if (!z17) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 18:
                Unit unit3 = px5.a;
                boolean z18 = this.u;
                if (!z18) {
                    ybh.y(obj);
                    vr3 vr3Var12 = xu0.a;
                    sko.t("Invoking function [onVisibilityChanged (true)] on listener [", str, "]", (Throwable) null);
                    wgp wgpVar = (wgp) this.v;
                    this.u = true;
                    if (wgpVar.a(true) == unit3) {
                        break;
                    }
                } else if (!z18) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 19:
                Unit unit4 = px5.a;
                boolean z19 = this.u;
                if (!z19) {
                    ybh.y(obj);
                    vr3 vr3Var13 = xu0.a;
                    sko.t("Invoking function [onVisibilityChanged (false)] on listener [", str, "]", (Throwable) null);
                    wgp wgpVar2 = (wgp) this.v;
                    this.u = true;
                    if (wgpVar2.a(false) == unit4) {
                        break;
                    }
                } else if (!z19) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 20:
                Unit unit5 = px5.a;
                boolean z20 = this.u;
                if (!z20) {
                    ybh.y(obj);
                    vr3 vr3Var14 = xu0.a;
                    sko.t("Invoking function [onAdPolled] on listener [", str, "]", (Throwable) null);
                    rko rkoVar6 = (rko) this.v;
                    this.u = true;
                    if (rkoVar6.e() == unit5) {
                        break;
                    }
                } else if (!z20) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 21:
                Unit unit6 = px5.a;
                boolean z21 = this.u;
                if (!z21) {
                    ybh.y(obj);
                    vr3 vr3Var15 = xu0.a;
                    sko.t("Invoking function [onMediaViewFullyVisible] on listener [", str, "]", (Throwable) null);
                    zy1 zy1Var = (zy1) this.v;
                    this.u = true;
                    e7 e7Var = zy1Var.d;
                    if (zy1Var.c != av2.g && e7Var.a != null && (frameLayoutC = ((ew1) ((fvo) e7Var.a("The backing field has not yet been initialized."))).c()) != null) {
                        qr0 qr0Var = zy1Var.a;
                        qr0Var.getClass();
                        if (((Boolean) qr0Var.a("gads:nas_interaction_ping_enabled_decagon", Boolean.FALSE, fo.a)).booleanValue()) {
                            Map mapB = ((ew1) ((fvo) e7Var.a("The backing field has not yet been initialized."))).b();
                            ImageView.ScaleType scaleTypeE = ((ew1) ((fvo) e7Var.a("The backing field has not yet been initialized."))).e();
                            if (scaleTypeE == null) {
                                scaleTypeE = iw1.i;
                            }
                            zt1 zt1Var = zy1Var.b;
                            zt1Var.getClass();
                            if (!zt1Var.b.getAndSet(true)) {
                                zt1Var.b(frameLayoutC, scaleTypeE, mapB);
                            }
                        }
                    }
                    if (Unit.a == unit6) {
                        break;
                    }
                } else if (!z21) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 22:
                px5 px5Var17 = px5.a;
                boolean z22 = this.u;
                if (!z22) {
                    ybh.y(obj);
                    vr3 vr3Var16 = xu0.a;
                    sko.t("Invoking function [onAdPresentation] on listener [", str, "]", (Throwable) null);
                    rko rkoVar7 = (rko) this.v;
                    this.u = true;
                    if (rkoVar7.j(this) == px5Var17) {
                        break;
                    }
                } else if (!z22) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 23:
                px5 px5Var18 = px5.a;
                boolean z23 = this.u;
                if (!z23) {
                    ybh.y(obj);
                    vr3 vr3Var17 = xu0.a;
                    sko.t("Invoking function [onRewardedVideoComplete] on listener [", str, "]", (Throwable) null);
                    fkp fkpVar = (fkp) this.v;
                    this.u = true;
                    if (fkpVar.f(this) == px5Var18) {
                        break;
                    }
                } else if (!z23) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 24:
                Unit unit7 = px5.a;
                boolean z24 = this.u;
                if (!z24) {
                    ybh.y(obj);
                    vr3 vr3Var18 = xu0.a;
                    sko.t("Invoking function [onAdShowedFullscreenContent] on listener [", str, "]", (Throwable) null);
                    rko rkoVar8 = (rko) this.v;
                    this.u = true;
                    if (rkoVar8.o(this) == unit7) {
                        break;
                    }
                } else if (!z24) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 25:
                px5 px5Var19 = px5.a;
                boolean z25 = this.u;
                if (!z25) {
                    ybh.y(obj);
                    vr3 vr3Var19 = xu0.a;
                    sko.t("Invoking function [onRewardedVideoStart] on listener [", str, "]", (Throwable) null);
                    fkp fkpVar2 = (fkp) this.v;
                    this.u = true;
                    if (fkpVar2.k(this) == px5Var19) {
                        break;
                    }
                } else if (!z25) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 26:
                Unit unit8 = px5.a;
                boolean z26 = this.u;
                if (!z26) {
                    ybh.y(obj);
                    vr3 vr3Var20 = xu0.a;
                    sko.t("Invoking function [onAdSwipeGestureClicked] on listener [", str, "]", (Throwable) null);
                    rko rkoVar9 = (rko) this.v;
                    this.u = true;
                    if (rkoVar9.e(this) == unit8) {
                        break;
                    }
                } else if (!z26) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 27:
                px5 px5Var20 = px5.a;
                boolean z27 = this.u;
                if (!z27) {
                    ybh.y(obj);
                    vr3 vr3Var21 = xu0.a;
                    sko.t("Invoking function [onAdWillBeReturned] on listener [", str, "]", (Throwable) null);
                    rko rkoVar10 = (rko) this.v;
                    this.u = true;
                    if (rkoVar10.i(this) == px5Var20) {
                        break;
                    }
                } else if (!z27) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 28:
                px5 px5Var21 = px5.a;
                boolean z28 = this.u;
                if (!z28) {
                    ybh.y(obj);
                    vr3 vr3Var22 = xu0.a;
                    sko.t("Invoking function [onRequestStarted] on listener [", str, "]", (Throwable) null);
                    aop aopVar = (aop) this.v;
                    this.u = true;
                    if (aopVar.b(this) == px5Var21) {
                        break;
                    }
                } else if (!z28) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                Unit unit9 = px5.a;
                boolean z29 = this.u;
                if (!z29) {
                    ybh.y(obj);
                    vr3 vr3Var23 = xu0.a;
                    sko.t("Invoking function [onSignalCollectionSucceeded] on listener [", str, "]", (Throwable) null);
                    aop aopVar2 = (aop) this.v;
                    this.u = true;
                    if (aopVar2.f() == unit9) {
                        break;
                    }
                } else if (!z29) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
        }
        return Unit.a;
    }
}
