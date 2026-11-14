package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.TextView;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final /* synthetic */ class rmg implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rmg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        Uri uriY;
        Uri uriY2;
        int i;
        int i2;
        int i3;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                dc1 dc1Var = ((smg) obj2).b;
                (dc1Var != null ? dc1Var : null).invoke(motionEvent);
                return Unit.a;
            case 1:
                ong ongVar = (ong) obj2;
                t15 t15Var = (t15) obj;
                t15.b(t15Var, Constants.Params.TYPE, xhk.b);
                t15Var.a(Constants.Params.VALUE, xug.g("kotlinx.serialization.Polymorphic<" + ongVar.a.c() + '>', f2j.b, new SerialDescriptor[0]), l08.a);
                t15Var.b = ongVar.b;
                return Unit.a;
            case 2:
                bzg bzgVar = (bzg) obj2;
                n6j n6jVar = (n6j) obj;
                n6j.c(n6jVar, 1, 2132018395, 2131364277, 0, null, 56);
                n6j.c(n6jVar, 2, 2132021138, 2131364265, 0, null, 56);
                n6j.c(n6jVar, 3, 2132021151, 2131364271, 0, null, 56);
                n6jVar.a(bzgVar.e.a);
                n6jVar.a(bzgVar.f.a);
                n6jVar.a(bzgVar.g.a);
                n6jVar.a(bzgVar.h.a);
                n6jVar.a(bzgVar.i.a);
                n6jVar.a(bzgVar.j.a);
                n6jVar.a(bzgVar.k.a);
                return Unit.a;
            case 3:
                ((i72) ((x79) obj2).e).addLast(obj);
                return Unit.a;
            case 4:
                Unit unit = Unit.a;
                ((cd5) obj2).j0(unit);
                return unit;
            case 5:
                cd5 cd5Var = ((xvh) obj2).b;
                Unit unit2 = Unit.a;
                cd5Var.j0(unit2);
                return unit2;
            case 6:
                ((p04) ((q8h) obj2).e.d).b(new vvh((zf) obj));
                return Unit.a;
            case 7:
                ((i72) ((x79) obj2).e).addLast(obj);
                return Unit.a;
            case 8:
                u89 u89Var = (u89) obj2;
                q0j q0jVar = (q0j) obj;
                if (u89Var.invoke() > 0.0f) {
                    o4h o4hVar = new o4h(u89Var.invoke(), new h65(1.0f));
                    xtb[] xtbVarArr = o0j.a;
                    p0j p0jVar = n0j.c;
                    xtb xtbVar = o0j.a[1];
                    p0jVar.getClass();
                    q0jVar.b(p0jVar, o4hVar);
                }
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                mdh mdhVar = (mdh) obj2;
                mdhVar.h.r(mdhVar.a());
                mdhVar.c.e();
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return Boolean.valueOf(((jdh) obj).a == ((idh) obj2));
            case 11:
                pt1 pt1Var = (pt1) obj2;
                Integer num = (Integer) obj;
                ((StylingImageView) pt1Var.e).setVisibility(num.intValue());
                ((DialogTitle) pt1Var.b).setVisibility(num.intValue());
                return Unit.a;
            case 12:
                ((ojh) ((pg5) obj2).e).a(((Configuration) obj).screenHeightDp);
                return Unit.a;
            case 13:
                jkh jkhVar = (jkh) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    dc1VarA = th instanceof CancellationException ? (CancellationException) th : null;
                    if (dc1VarA == null) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "Channel was cancelled";
                        }
                        dc1VarA = na2.a(message, th);
                    }
                    if (jkhVar.c == null) {
                        jkhVar.c = new d65(dc1VarA);
                        jkhVar.b.close();
                    }
                }
                return Unit.a;
            case 14:
                ((StylingImageView) ((cnh) obj2).b.f).setImageDrawable((Drawable) obj);
                return Unit.a;
            case 15:
                ((fi5) obj2).y(obj);
                return Unit.a;
            case 16:
                hoh hohVar = (hoh) obj2;
                Throwable th2 = (Throwable) obj;
                CancellationException cancellationExceptionA = na2.a("Recomposer effect job completed", th2);
                synchronized (hohVar.c) {
                    unb unbVar = hohVar.d;
                    if (unbVar != null) {
                        nak nakVar = hohVar.u;
                        eoh eohVar = eoh.b;
                        nakVar.getClass();
                        nakVar.k((Object) null, eohVar);
                        unbVar.k(cancellationExceptionA);
                        hohVar.r = null;
                        unbVar.s(new vvf(hohVar, th2, (byte) 11));
                    } else {
                        hohVar.e = cancellationExceptionA;
                        nak nakVar2 = hohVar.u;
                        eoh eohVar2 = eoh.a;
                        nakVar2.getClass();
                        nakVar2.k((Object) null, eohVar2);
                    }
                }
                return Unit.a;
            case 17:
                ((toh) obj2).a((us7) obj);
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                ((xt2) obj2).setEnabled(((Boolean) obj).booleanValue());
                return Unit.a;
            case 19:
                o2i o2iVar = (o2i) obj2;
                boolean zB = o2iVar.b();
                if (zB != o2iVar.e) {
                    o2iVar.e = zB;
                    o2iVar.d.c();
                }
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                r2i r2iVar = (r2i) obj2;
                if (((m18) obj) == m18.b) {
                    if (!r2iVar.e) {
                        r2iVar.e = true;
                    }
                    d3k d3kVar = r2iVar.g;
                    if (d3kVar != null) {
                        d3kVar.k((CancellationException) null);
                    }
                    r2iVar.g = na2.B(fsp.y(r2iVar.d), (CoroutineContext) null, (rx5) null, new agb((byte) 18, dc1VarA, r2iVar), 3);
                } else {
                    d3k d3kVar2 = r2iVar.g;
                    if (d3kVar2 != null) {
                        d3kVar2.k((CancellationException) null);
                    }
                }
                return Unit.a;
            case 21:
                vl6 vl6Var = (vl6) obj2;
                q3i q3iVar = (q3i) vl6Var.e;
                wv1 wv1Var = (wv1) vl6Var.b;
                m18 m18Var = (m18) obj;
                d59 d59Var = d59.g;
                int i4 = m18Var == null ? -1 : p3i.a[m18Var.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        e59 e59Var = (e59) wv1Var.b.get();
                        ((c59) e59Var.a.get(d59Var)).i.b(q3iVar);
                        String strB = e59Var.b(d59Var);
                        if (strB != null) {
                            ((y3i) ((j4c) vl6Var.d).get()).e(strB);
                        }
                        e59Var.c(d59Var, true);
                    } else {
                        if (i4 != 3 && i4 != 4) {
                            h9o.p();
                            return null;
                        }
                        e59 e59Var2 = (e59) wv1Var.b.get();
                        ((c59) e59Var2.a.get(d59Var)).i.c(q3iVar);
                        e59Var2.c(d59Var, false);
                    }
                }
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                Context context = (Context) obj;
                String str = ((n0f) obj2).E.b;
                if (str != null && (uriY = ddh.y(str)) != null) {
                    lk6.a(uriY, lqm.i, 0, context);
                }
                return Unit.a;
            case 23:
                Context context2 = (Context) obj;
                String str2 = ((m0f) obj2).b;
                if (str2 != null && (uriY2 = ddh.y(str2)) != null) {
                    lk6.a(uriY2, lqm.i, 0, context2);
                }
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                x79 x79Var = (x79) obj2;
                x79Var.d = null;
                ob obVar = (ob) x79Var.e;
                if (obVar != null) {
                    x79Var.e = null;
                    ((oje) x79Var.a).d.b(obVar);
                }
                ((i51) x79Var.c).invoke();
                return Unit.a;
            case 25:
                r4i r4iVar = (r4i) obj2;
                long jLongValue = ((Long) obj).longValue();
                r4iVar.j = jLongValue;
                r4iVar.h0(jLongValue);
                ua7 ua7Var = r4iVar.h;
                pt1 pt1Var2 = r4iVar.i;
                if (pt1Var2 == null) {
                    pt1Var2 = null;
                }
                ((OperaMaterialButton) pt1Var2.b).R(false);
                boolean z = r4iVar.j >= ((t4i) ua7Var.p()).a.b;
                q4i q4iVar = ((t4i) ua7Var.p()).b;
                pt1 pt1Var3 = r4iVar.i;
                if (pt1Var3 == null) {
                    pt1Var3 = null;
                }
                TextView textView = (TextView) pt1Var3.g;
                if (z) {
                    int iOrdinal = q4iVar.ordinal();
                    if (iOrdinal == 0) {
                        i = 2132020943;
                    } else {
                        if (iOrdinal != 1) {
                            h9o.p();
                            return null;
                        }
                        i = 2132020928;
                    }
                } else {
                    i = 2132020934;
                }
                textView.setText(r4iVar.getString(i));
                long j = ((t4i) ua7Var.p()).a.b;
                if (z) {
                    int iOrdinal2 = q4iVar.ordinal();
                    if (iOrdinal2 == 0) {
                        i3 = 2132020942;
                    } else {
                        if (iOrdinal2 != 1) {
                            h9o.p();
                            return null;
                        }
                        i3 = 2132020927;
                    }
                    pt1 pt1Var4 = r4iVar.i;
                    if (pt1Var4 == null) {
                        pt1Var4 = null;
                    }
                    ((TextView) pt1Var4.f).setText(phj.X(r4iVar.requireContext(), i3, new CharSequence[]{upj.o(r4iVar.requireContext(), j, true)}));
                } else {
                    pt1 pt1Var5 = r4iVar.i;
                    if (pt1Var5 == null) {
                        pt1Var5 = null;
                    }
                    TextView textView2 = (TextView) pt1Var5.f;
                    int iOrdinal3 = q4iVar.ordinal();
                    if (iOrdinal3 == 0) {
                        i2 = 2132020935;
                    } else {
                        if (iOrdinal3 != 1) {
                            h9o.p();
                            return null;
                        }
                        i2 = 2132020933;
                    }
                    textView2.setText(r4iVar.getString(i2));
                }
                r4iVar.h0(r4iVar.j);
                pt1 pt1Var6 = r4iVar.i;
                if (pt1Var6 == null) {
                    pt1Var6 = null;
                }
                ((OperaMaterialButton) pt1Var6.b).setText(r4iVar.getString(z ? 2132020337 : 2132020931));
                dc1 dc1Var2 = r4iVar.i;
                ((OperaMaterialButton) (dc1Var2 != null ? dc1Var2 : null).b).setOnClickListener(new hv6(z, r4iVar, q4iVar));
                return Unit.a;
            case 26:
                x4i x4iVar = (x4i) obj2;
                ddc ddcVar = x4iVar.d;
                if (((m18) obj) == m18.b) {
                    na2.B(ddcVar, (CoroutineContext) null, (rx5) null, new r07(x4iVar, true, (mt5) null), 3);
                    d3k d3kVar3 = x4iVar.e;
                    if (d3kVar3 != null) {
                        d3kVar3.k((CancellationException) null);
                    }
                    x4iVar.e = na2.B(ddcVar, (CoroutineContext) null, (rx5) null, new agb((byte) 23, dc1VarA, x4iVar), 3);
                } else {
                    d3k d3kVar4 = x4iVar.e;
                    if (d3kVar4 != null) {
                        d3kVar4.k((CancellationException) null);
                    }
                    xf8.E0(x4iVar.h, n08.a);
                }
                return Unit.a;
            case 27:
                ((xbf) obj2).g = (to9) obj;
                return Unit.a;
            case 28:
                return ((y5i) obj2).g((ng6) obj);
            default:
                ((t7i) obj2).f.h(new v91(new h7i((gpm) obj, true), (byte) 17), new r7i((byte) 7));
                return Unit.a;
        }
    }
}
