package defpackage;

import ads_mobile_sdk.am3;
import ads_mobile_sdk.bk1;
import ads_mobile_sdk.fo;
import ads_mobile_sdk.g0;
import ads_mobile_sdk.ix1;
import ads_mobile_sdk.p30;
import ads_mobile_sdk.qr0;
import ads_mobile_sdk.v;
import ads_mobile_sdk.x03;
import ads_mobile_sdk.xj2;
import ads_mobile_sdk.xu0;
import android.animation.ObjectAnimator;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class sqo extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqo(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                return new sqo((byte) 0, mt5Var, (tqo) obj2);
            case 1:
                return new sqo((byte) 1, mt5Var, (bd5) obj2);
            case 2:
                return new sqo((byte) 2, mt5Var, (or4) obj2);
            case 3:
                return new sqo((byte) 3, mt5Var, (jn4) obj2);
            case 4:
                return new sqo((byte) 4, mt5Var, (x03) obj2);
            case 5:
                return new sqo((byte) 5, mt5Var, (xj2) obj2);
            case 6:
                return new sqo((byte) 6, mt5Var, (zio) obj2);
            case 7:
                return new sqo((byte) 7, mt5Var, (g0) obj2);
            case 8:
                return new sqo((byte) 8, mt5Var, (ix1) obj2);
            case 9:
                return new sqo((byte) 9, mt5Var, (p30) obj2);
            case 10:
                return new sqo((byte) 10, mt5Var, (am3) obj2);
            default:
                return new sqo((byte) 11, mt5Var, (z23) obj2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.v;
        switch (b) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return new sqo((byte) 1, (mt5) obj2, (bd5) obj3).invokeSuspend(Unit.a);
            case 2:
                return new sqo((byte) 2, (mt5) obj2, (or4) obj3).invokeSuspend(Unit.a);
            case 3:
                return new sqo((byte) 3, (mt5) obj2, (jn4) obj3).invokeSuspend(Unit.a);
            case 4:
                return new sqo((byte) 4, (mt5) obj2, (x03) obj3).invokeSuspend(Unit.a);
            case 5:
                return new sqo((byte) 5, (mt5) obj2, (xj2) obj3).invokeSuspend(Unit.a);
            case 6:
                return new sqo((byte) 6, (mt5) obj2, (zio) obj3).invokeSuspend(Unit.a);
            case 7:
                return new sqo((byte) 7, (mt5) obj2, (g0) obj3).invokeSuspend(Unit.a);
            case 8:
                return new sqo((byte) 8, (mt5) obj2, (ix1) obj3).invokeSuspend(Unit.a);
            case 9:
                return new sqo((byte) 9, (mt5) obj2, (p30) obj3).invokeSuspend(Unit.a);
            case 10:
                return new sqo((byte) 10, (mt5) obj2, (am3) obj3).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Unit unit;
        switch (this.t) {
            case 0:
                tqo tqoVar = (tqo) this.v;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    zyk zykVar = tqo.h;
                    Pair pair = (Pair) tqoVar.d.getValue();
                    int iIntValue = ((Number) pair.a).intValue();
                    int iIntValue2 = ((Number) pair.b).intValue();
                    dx5 dx5Var = (dx5) tqo.h.getValue();
                    rqo rqoVar = new rqo(tqoVar, iIntValue, iIntValue2, null);
                    this.u = true;
                    obj = na2.Z(dx5Var, rqoVar, this);
                    if (obj == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                Object obj2 = ((t0i) obj).a;
                if (!(obj2 instanceof q0i)) {
                    Drawable drawable = (Drawable) obj2;
                    Pair pair2 = new Pair(new Integer(tqoVar.getIntrinsicWidth()), new Integer(tqoVar.getIntrinsicHeight()));
                    qt6 qt6Var = tqoVar.f;
                    if (qt6Var != null) {
                        Integer num = (Integer) qt6Var.c;
                        if (num != null) {
                            drawable.setAlpha(num.intValue());
                        }
                        Boolean bool = (Boolean) qt6Var.d;
                        if (bool != null) {
                            drawable.setAutoMirrored(bool.booleanValue());
                        }
                        ColorFilter colorFilter = (ColorFilter) qt6Var.e;
                        if (colorFilter != null) {
                            drawable.setColorFilter(colorFilter);
                        }
                        Boolean bool2 = (Boolean) qt6Var.f;
                        if (bool2 != null) {
                            drawable.setFilterBitmap(bool2.booleanValue());
                        }
                        if (qt6Var.a) {
                            drawable.mutate();
                        }
                        if (qt6Var.b) {
                            w0h.e(drawable, true);
                        }
                    }
                    tqoVar.f = null;
                    tqoVar.setDrawable(drawable);
                    ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, "alpha", 0, drawable.getAlpha());
                    objectAnimatorOfInt.setDuration(250L);
                    objectAnimatorOfInt.addListener(new df1(tqoVar, (byte) 7));
                    objectAnimatorOfInt.start();
                    tqoVar.g = objectAnimatorOfInt;
                    if (!pair2.equals(new Pair(new Integer(tqoVar.getIntrinsicWidth()), new Integer(tqoVar.getIntrinsicHeight())))) {
                        Drawable.Callback callback = tqoVar.getCallback();
                        View view = callback instanceof View ? (View) callback : null;
                        if (view != null && (((layoutParams = view.getLayoutParams()) != null && layoutParams.width == -2) || ((layoutParams2 = view.getLayoutParams()) != null && layoutParams2.height == -2))) {
                            view.requestLayout();
                        }
                    }
                }
                p0i p0iVar = t0i.b;
                cno cnoVar = tqoVar.b;
                if (cnoVar != null) {
                    cnoVar.invoke(t0i.d(obj2));
                }
                tqoVar.b = null;
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    bd5 bd5Var = (bd5) this.v;
                    this.u = true;
                    if (bd5Var.X(this) == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    or4 or4Var = (or4) this.v;
                    Unit unit2 = Unit.a;
                    this.u = true;
                    if (or4Var.c(this, unit2) == px5Var3) {
                        return px5Var3;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 3:
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    jn4 jn4Var = (jn4) this.v;
                    this.u = true;
                    if (jn4Var.invoke(this) == px5Var4) {
                        return px5Var4;
                    }
                } else {
                    if (!z4) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 4:
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    bk1 bk1Var = ((x03) this.v).e;
                    this.u = true;
                    if (bk1Var.d(this) == px5Var5) {
                        return px5Var5;
                    }
                } else {
                    if (!z5) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 5:
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    xj2 xj2Var = (xj2) this.v;
                    this.u = true;
                    if (xj2.a(xj2Var, (nt5) this) == px5Var6) {
                        return px5Var6;
                    }
                } else {
                    if (!z6) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 6:
                px5 px5Var7 = px5.a;
                boolean z7 = this.u;
                if (z7) {
                    if (z7) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                zio zioVar = (zio) this.v;
                this.u = true;
                Object objA = zio.a(zioVar, this);
                return objA == px5Var7 ? px5Var7 : objA;
            case 7:
                px5 px5Var8 = px5.a;
                boolean z8 = this.u;
                if (!z8) {
                    ybh.y(obj);
                    qr0 qr0Var = ((g0) this.v).f;
                    qr0Var.getClass();
                    on7 on7Var = pn7.b;
                    long j = ((pn7) qr0Var.a("gads:app_activity_tracker:notify_background_listeners_delay_ms", u0h.b(500, un7.d), fo.a$18)).a;
                    this.u = true;
                    if (nb6.q(j, this) == px5Var8) {
                        return px5Var8;
                    }
                } else {
                    if (!z8) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                g0 g0Var = (g0) this.v;
                synchronized (g0Var) {
                    if (g0Var.l && !g0Var.c()) {
                        mt5 mt5Var = null;
                        xu0.b("App is now backgrounded", null);
                        g0Var.o = true;
                        on7 on7Var2 = pn7.b;
                        g0Var.g.getClass();
                        long jY0 = cs5.y0(SystemClock.elapsedRealtime(), un7.d);
                        Iterator it = g0Var.h.iterator();
                        while (it.hasNext()) {
                            na2.B(g0Var.e, h.a, null, new fsg(new v((qlo) it.next(), jY0, null, (byte) 1), mt5Var, (byte) 3), 2);
                        }
                    }
                    unit = Unit.a;
                }
                return unit;
            case 8:
                px5 px5Var9 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    ix1 ix1Var = (ix1) this.v;
                    this.u = true;
                    if (ix1Var.invoke(this) == px5Var9) {
                        return px5Var9;
                    }
                } else {
                    if (!z9) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 9:
                px5 px5Var10 = px5.a;
                boolean z10 = this.u;
                if (!z10) {
                    ybh.y(obj);
                    p30 p30Var = (p30) this.v;
                    AtomicReference atomicReference = p30Var.l;
                    ynb ynbVar = p30Var.n;
                    this.u = true;
                    if (p30Var.a(atomicReference, ynbVar, (Long) null, (nt5) this) == px5Var10) {
                        return px5Var10;
                    }
                } else {
                    if (!z10) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 10:
                px5 px5Var11 = px5.a;
                boolean z11 = this.u;
                if (z11) {
                    if (z11) {
                        ybh.y(obj);
                        return Unit.a;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                am3 am3Var = (am3) this.v;
                this.u = true;
                am3Var.k(this);
                return px5Var11;
            default:
                px5 px5Var12 = px5.a;
                boolean z12 = this.u;
                if (!z12) {
                    ybh.y(obj);
                    long j2 = aap.f().H;
                    this.u = true;
                    if (nb6.p(j2, this) == px5Var12) {
                        return px5Var12;
                    }
                } else {
                    if (!z12) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                ((z23) this.v).invoke();
                return Unit.a;
        }
    }
}
