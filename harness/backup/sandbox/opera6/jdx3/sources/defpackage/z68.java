package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.esim.ui.EsimActivity;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z68 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ EsimActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z68(EsimActivity esimActivity, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = esimActivity;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        EsimActivity esimActivity = this.w;
        switch (b) {
            case 0:
                z68 z68Var = new z68(esimActivity, mt5Var, (byte) 0);
                z68Var.v = obj;
                return z68Var;
            default:
                z68 z68Var2 = new z68(esimActivity, mt5Var, (byte) 1);
                z68Var2.v = obj;
                return z68Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((i78) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        xd5 xd5Var = this.w;
        switch (b) {
            case 0:
                i78 i78Var = (i78) this.v;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    xd5Var.setTitle(i78Var.a.a.a(xd5Var.getResources()));
                    xd5Var.invalidateMenu();
                    m78 m78Var = i78Var.b;
                    if (m78Var instanceof j78) {
                        or2 or2Var = xd5Var.Z;
                        if (or2Var == null) {
                            or2Var = null;
                        }
                        v88 v88Var = (v88) or2Var.e;
                        j78 j78Var = (j78) m78Var;
                        v88Var.c.setText(j78Var.a.a(xd5Var.getResources()));
                        p37.k0(new yk4(v88Var, (byte) 22), v88Var.d);
                        v88Var.e.setText(j78Var.b.a(xd5Var.getResources()));
                        v88Var.b.setVisibility(0);
                        or2 or2Var2 = xd5Var.Z;
                        if (or2Var2 == null) {
                            or2Var2 = null;
                        }
                        ((LinearLayout) ((pt1) or2Var2.d).g).setVisibility(8);
                        or2 or2Var3 = xd5Var.Z;
                        ((b98) (or2Var3 != null ? or2Var3 : null).f).b.setVisibility(8);
                    } else if (m78Var instanceof k78) {
                        or2 or2Var4 = xd5Var.Z;
                        if (or2Var4 == null) {
                            or2Var4 = null;
                        }
                        pt1 pt1Var = (pt1) or2Var4.d;
                        k78 k78Var = (k78) m78Var;
                        ((TextView) pt1Var.c).setText(k78Var.a.a(xd5Var.getResources()));
                        ((TextView) pt1Var.b).setText(k78Var.b.a(xd5Var.getResources()));
                        ((TextView) pt1Var.f).setText(k78Var.d.a(xd5Var.getResources()));
                        ((OperaIconedMessage) pt1Var.d).a(k78Var.c.a(xd5Var.getResources()).toString());
                        ((MaterialButton) pt1Var.e).setText(k78Var.e.a(xd5Var.getResources()));
                        ((LinearLayout) pt1Var.g).setVisibility(0);
                        or2 or2Var5 = xd5Var.Z;
                        if (or2Var5 == null) {
                            or2Var5 = null;
                        }
                        ((v88) or2Var5.e).b.setVisibility(8);
                        or2 or2Var6 = xd5Var.Z;
                        ((b98) (or2Var6 != null ? or2Var6 : null).f).b.setVisibility(8);
                    } else {
                        if (!m78Var.equals(l78.a)) {
                            h9o.p();
                            return null;
                        }
                        if (i78Var.c) {
                            on7 on7Var = pn7.b;
                            long jX0 = cs5.x0(200, un7.d);
                            this.v = null;
                            this.u = true;
                            if (nb6.q(jX0, this) == px5Var) {
                                return px5Var;
                            }
                        } else {
                            or2 or2Var7 = xd5Var.Z;
                            if (or2Var7 == null) {
                                or2Var7 = null;
                            }
                            ((b98) or2Var7.f).b.setVisibility(8);
                            or2 or2Var8 = xd5Var.Z;
                            if (or2Var8 == null) {
                                or2Var8 = null;
                            }
                            ((v88) or2Var8.e).b.setVisibility(8);
                            or2 or2Var9 = xd5Var.Z;
                            ((LinearLayout) ((pt1) (or2Var9 != null ? or2Var9 : null).d).g).setVisibility(8);
                        }
                    }
                    return Unit.a;
                }
                if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                or2 or2Var10 = xd5Var.Z;
                if (or2Var10 == null) {
                    or2Var10 = null;
                }
                ((b98) or2Var10.f).b.setVisibility(0);
                or2 or2Var11 = xd5Var.Z;
                if (or2Var11 == null) {
                    or2Var11 = null;
                }
                ((v88) or2Var11.e).b.setVisibility(8);
                or2 or2Var12 = xd5Var.Z;
                ((LinearLayout) ((pt1) (or2Var12 != null ? or2Var12 : null).d).g).setVisibility(8);
                return Unit.a;
            default:
                nx5 nx5Var = (nx5) this.v;
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    int i = EsimActivity.f0;
                    f99 f99VarT = qbe.t(new c78(xd5Var.G0().n, (byte) 0));
                    t07 t07Var = new t07(nx5Var, xd5Var, (mt5) null);
                    this.v = null;
                    this.u = true;
                    if (j14.v(f99VarT, t07Var, this) == px5Var2) {
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
        }
    }
}
