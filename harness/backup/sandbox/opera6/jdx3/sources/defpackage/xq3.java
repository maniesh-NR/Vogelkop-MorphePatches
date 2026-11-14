package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.opera.android.autofill.Address;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.utilities.DisplayUtil;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xq3 extends cej implements abf {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public /* synthetic */ xq3(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.b = obj2;
        this.c = obj;
    }

    public xq3(View view, List list) {
        this.a = (byte) 5;
        this.b = Collections.unmodifiableList(list);
        this.c = view;
    }

    public xq3(ebf ebfVar) {
        this.a = (byte) 0;
        this.b = ebfVar;
    }

    public /* synthetic */ xq3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public xq3(ven venVar) {
        this.a = (byte) 14;
        this.c = venVar;
        this.b = vb0.d;
    }

    public xq3(x5f x5fVar) {
        this.a = (byte) 2;
        this.b = x5fVar;
        this.c = wb0.d;
    }

    public final void b(Context context) {
        float dimension = context.getResources().getDimension(2131165352);
        if (dimension <= 0.0f) {
            dimension = DisplayUtil.c(context);
        }
        ((bmn) this.c).g = (int) ((dimension - fan.a((r1 * 12) + 24, context.getResources())) / (context.getResources().getInteger(2131493010) + 0.5f));
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) throws Resources.NotFoundException {
        rxh rxhVar;
        zu5 zu5Var;
        rxh rxhVar2;
        av5 av5Var;
        rxh rxhVar3;
        m98 m98Var;
        rxh rxhVar4;
        zu5 zu5Var2;
        rxh rxhVar5;
        m98 m98Var2;
        m98 m98Var3;
        rxh rxhVar6;
        rxh rxhVar7;
        zu5 zu5Var3;
        zu5 zu5Var4;
        rxh rxhVar8;
        rxh rxhVar9;
        m98 m98Var4;
        rxh rxhVar10;
        m98 m98Var5;
        zu5 zu5Var5;
        pxh pxhVar;
        int i = 2131364567;
        byte b = 7;
        byte b2 = 1;
        byte b3 = 0;
        byte b4 = 2;
        switch (this.a) {
            case 0:
                qf qfVar = new qf(this, mejVar, b2lVar);
                this.c = qfVar;
                qfVar.a.b(new of(this, (byte) 1));
                return (qf) this.c;
            case 1:
                Context context = mejVar.getContext();
                nv6 nv6VarB = ru9.c(context).b();
                ((SharedPreferences.Editor) nv6VarB.a).putInt("cookie.blocker.sheet.show.count", ru9.c(context).a.getInt("cookie.blocker.sheet.show.count", 0) + 1);
                nv6VarB.w();
                gjm gjmVar = (gjm) this.c;
                lxh lxhVar = new lxh(2131232049);
                dxh dxhVar = new dxh(2130968821);
                rxh rxhVar11 = new rxh(2132021167);
                rxh rxhVar12 = new rxh(2132021166);
                rxh rxhVar13 = new rxh(2132019506);
                zu5 zu5Var6 = new zu5(context, gjmVar, b3);
                if (o18.h(context, rxhVar13) == 0) {
                    rxhVar = null;
                    zu5Var = null;
                } else {
                    rxhVar = rxhVar13;
                    zu5Var = zu5Var6;
                }
                rxh rxhVar14 = new rxh(2132018011);
                av5 av5Var2 = new av5(context, b3);
                if (o18.h(context, rxhVar14) == 0) {
                    rxhVar2 = null;
                    av5Var = null;
                } else {
                    rxhVar2 = rxhVar14;
                    av5Var = av5Var2;
                }
                return new qf(mejVar, new gua(null, lxhVar, null, null, rxhVar11, rxhVar12, null, rxhVar, zu5Var, rxhVar2, av5Var, true, dxhVar, false, null), b4);
            case 2:
                Context context2 = mejVar.getContext();
                rxh rxhVar15 = new rxh(2132018899);
                rxh rxhVar16 = new rxh(2132018898);
                lxh lxhVar2 = new lxh(2131232636);
                rxh rxhVar17 = new rxh(2132019498);
                m98 m98Var6 = new m98(this, b2);
                if (o18.h(context2, rxhVar17) == 0) {
                    rxhVar3 = null;
                    m98Var = null;
                } else {
                    rxhVar3 = rxhVar17;
                    m98Var = m98Var6;
                }
                rxh rxhVar18 = new rxh(2132018897);
                zu5 zu5Var7 = new zu5((Object) this, context2, b4);
                if (o18.h(context2, rxhVar18) == 0) {
                    rxhVar4 = null;
                    zu5Var2 = null;
                } else {
                    rxhVar4 = rxhVar18;
                    zu5Var2 = zu5Var7;
                }
                return new qf(mejVar, new gua(null, null, null, lxhVar2, rxhVar15, rxhVar16, null, rxhVar3, m98Var, rxhVar4, zu5Var2, true, null, false, null), b4);
            case 3:
                return new yvd(mejVar, (ib9) ((ja2) this.b), ((qb9) this.c).m);
            case 4:
                jb9 jb9Var = (jb9) ((ja2) this.b);
                tb9 tb9Var = (tb9) this.c;
                return new yvd(mejVar, jb9Var, tb9Var.p.getText().toString(), tb9Var.m);
            case 5:
                return new pg5(mejVar, (List) this.b);
            case 6:
                Context context3 = mejVar.getContext();
                gjm gjmVar2 = (gjm) this.b;
                lxh lxhVar3 = new lxh(2131232195);
                dxh dxhVar2 = new dxh(2130969323);
                rxh rxhVar19 = new rxh(2132021376);
                sxh sxhVar = new sxh(2132021375, new Object[]{new rxh(2132017591)});
                rxh rxhVar20 = new rxh(2132020202);
                m98 m98Var7 = new m98(gjmVar2, b4);
                if (o18.h(context3, rxhVar20) == 0) {
                    rxhVar5 = null;
                    m98Var2 = null;
                } else {
                    rxhVar5 = rxhVar20;
                    m98Var2 = m98Var7;
                }
                return new qf(mejVar, new gua(null, lxhVar3, null, null, rxhVar19, sxhVar, null, rxhVar5, m98Var2, new rxh(2132019218), null, true, dxhVar2, false, null), b4);
            case 7:
                return new pg5(mejVar, (xbf) this.b, (ojh) this.c, b4);
            case 8:
                return new pg5(mejVar, (s9i) this.b, (wjh) this.c, (byte) 3);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                Context context4 = mejVar.getContext();
                rii riiVar = (rii) this.c;
                pr prVar = (pr) this.b;
                View viewInflate = LayoutInflater.from(context4).inflate(2131559281, (ViewGroup) null, false);
                yq1 yq1Var = (StylingTextView) w1h.j(2131362248, viewInflate);
                if (yq1Var != null) {
                    yq1 yq1Var2 = (StylingTextView) w1h.j(2131364567, viewInflate);
                    if (yq1Var2 != null) {
                        LayoutDirectionLinearLayout layoutDirectionLinearLayout = (LayoutDirectionLinearLayout) viewInflate;
                        yq1Var.setText((String) prVar.b);
                        yq1Var2.setText(((String) prVar.c) + context4.getResources().getString(2132017823) + ((String) prVar.d));
                        rxh rxhVar21 = new rxh(2132017910);
                        mgf mgfVar = new mgf((Object) context4, (Object) prVar, (byte) 21);
                        rxh rxhVar22 = new rxh(2132017909);
                        m98 m98Var8 = new m98(riiVar, prVar);
                        if (o18.h(context4, rxhVar22) == 0) {
                            rxhVar6 = null;
                            m98Var3 = null;
                        } else {
                            m98Var3 = m98Var8;
                            rxhVar6 = rxhVar22;
                        }
                        rxh rxhVar23 = new rxh(2132017904);
                        zu5 zu5Var8 = new zu5(riiVar, prVar, b);
                        if (o18.h(context4, rxhVar23) == 0) {
                            rxhVar7 = null;
                            zu5Var3 = null;
                        } else {
                            rxhVar7 = rxhVar23;
                            zu5Var3 = zu5Var8;
                        }
                        return new qf(mejVar, new gua(mgfVar, null, null, null, rxhVar21, null, layoutDirectionLinearLayout, rxhVar7, zu5Var3, rxhVar6, m98Var3, true, null, true, null), b4);
                    }
                } else {
                    i = 2131362248;
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                Context context5 = mejVar.getContext();
                qq8 qq8Var = (qq8) this.c;
                Address address = (Address) this.b;
                String strV = address.b;
                String str = address.c;
                if (!str.isEmpty()) {
                    strV = sko.v(strV, " - ", str);
                }
                View viewInflate2 = LayoutInflater.from(context5).inflate(2131559277, (ViewGroup) null, false);
                yq1 yq1Var3 = (StylingTextView) w1h.j(2131362248, viewInflate2);
                if (yq1Var3 != null) {
                    yq1 yq1Var4 = (StylingTextView) w1h.j(2131364567, viewInflate2);
                    if (yq1Var4 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate2;
                        yq1Var3.setText(strV);
                        yq1Var4.setText(address.n);
                        lxh lxhVar4 = new lxh(2131232128);
                        dxh dxhVar3 = new dxh(2130968821);
                        rxh rxhVar24 = new rxh(2132017903);
                        rxh rxhVar25 = new rxh(2132017909);
                        zu5 zu5Var9 = new zu5((Object) qq8Var, (Object) address, (byte) 8);
                        if (o18.h(context5, rxhVar25) == 0) {
                            rxhVar8 = null;
                            zu5Var4 = null;
                        } else {
                            zu5Var4 = zu5Var9;
                            rxhVar8 = rxhVar25;
                        }
                        rxh rxhVar26 = new rxh(2132018111);
                        m98 m98Var9 = new m98((Object) qq8Var, (byte) 4);
                        if (o18.h(context5, rxhVar26) == 0) {
                            rxhVar9 = null;
                            m98Var4 = null;
                        } else {
                            rxhVar9 = rxhVar26;
                            m98Var4 = m98Var9;
                        }
                        return new qf(mejVar, new gua(null, lxhVar4, null, null, rxhVar24, null, linearLayout, rxhVar9, m98Var4, rxhVar8, zu5Var4, true, dxhVar3, false, null), b4);
                    }
                } else {
                    i = 2131362248;
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i)));
                return null;
            case 11:
                if (b2lVar == null) {
                    qp2.o("");
                    return null;
                }
                String strG0 = ((d7l) b2lVar).g0();
                String[] strArr = wqm.a;
                return new vxi(mejVar, aik.g(strG0), (ArrayList) this.b, (lz8) this.c);
            case 12:
                return new pxk(mejVar, (byk) this.b, (u7k) this.c);
            case 13:
                Context context6 = mejVar.getContext();
                rxh rxhVar27 = new rxh(2132017998);
                qxh qxhVar = new qxh(((f0c) this.b).a.a(2132017996));
                lxh lxhVar5 = new lxh(2131232283);
                dxh dxhVar4 = new dxh(2130968821);
                rxh rxhVar28 = new rxh(2132019771);
                m98 m98Var10 = new m98(this.c, (byte) 6);
                if (o18.h(context6, rxhVar28) == 0) {
                    rxhVar10 = null;
                    m98Var5 = null;
                } else {
                    rxhVar10 = rxhVar28;
                    m98Var5 = m98Var10;
                }
                return new qf(mejVar, new gua(null, lxhVar5, null, null, rxhVar27, qxhVar, null, rxhVar10, m98Var5, new rxh(2132019218), null, true, dxhVar4, false, null), b4);
            case 14:
                ven venVar = (ven) this.c;
                ru9 ru9Var = venVar.g;
                nv6 nv6VarB2 = ru9Var.b();
                int i2 = ru9Var.a.getInt("vpn.pro_adult_page_promo.show_count", 0) + 1;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB2.a;
                editor.putInt("vpn.pro_adult_page_promo.show_count", i2);
                editor.putLong("vpn.pro_adult_page_promo.show_timestamp", System.currentTimeMillis());
                nv6VarB2.w();
                Context context7 = mejVar.getContext();
                bxc bxcVar = (bxc) cxc.t(venVar.d.b).i();
                lxh lxhVar6 = new lxh(2131232693);
                String strA = bxcVar.a(25, context7);
                pxh qxhVar2 = strA != null ? new qxh(strA) : new rxh(2132022193);
                String strA2 = bxcVar.a(26, context7);
                pxh qxhVar3 = strA2 != null ? new qxh(strA2) : new rxh(2132022191);
                String strA3 = bxcVar.a(27, context7);
                pxh qxhVar4 = strA3 != null ? new qxh(strA3) : new rxh(2132022192);
                zu5 zu5Var10 = new zu5((Object) this, (Object) venVar, (byte) 11);
                if (qxhVar4.a(context7.getResources()).length() == 0) {
                    pxhVar = null;
                    zu5Var5 = null;
                } else {
                    zu5Var5 = zu5Var10;
                    pxhVar = qxhVar4;
                }
                return new qf(mejVar, new gua(null, null, null, lxhVar6, qxhVar2, qxhVar3, null, null, null, pxhVar, zu5Var5, true, null, true, new m98(this, b)), b4);
            default:
                zln zlnVar = (zln) this.b;
                mejVar.getContext();
                zlnVar.j();
                return new qf(this, mejVar);
        }
    }

    @Override // defpackage.cej
    public final mej createSheetHost(Context context) {
        switch (this.a) {
            case 0:
                return new wq3(new s8n(((ebf) this.b).p(context), 2130969943), (byte) 0);
            case 14:
                return new vq3(new s8n(context, 2130970594), 2132083100, true);
            case 15:
                amn amnVar = new amn(this, context, (byte) 0);
                byte b = ((bmn) this.c).a;
                int i = b != 3 ? 2130968817 : 2130968816;
                boolean z = (b == 0 || b == 3) ? false : true;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                typedArrayObtainStyledAttributes.recycle();
                wq3 wq3Var = new wq3(context, resourceId, z, (byte) 3);
                wq3Var.d = amnVar;
                return wq3Var;
            default:
                return super.createSheetHost(context);
        }
    }

    @Override // defpackage.abf
    public final void dismiss() {
        qf qfVar = (qf) this.c;
        if (qfVar != null) {
            qfVar.b.Q(hjm.b);
        }
    }

    @Override // defpackage.cej
    public final boolean isAllowed(b2l b2lVar) {
        switch (this.a) {
            case 15:
                return b2lVar == null || !((d7l) b2lVar).j.m();
            default:
                return super.isAllowed(b2lVar);
        }
    }

    @Override // defpackage.cej
    public final void onFinished(hjm hjmVar) throws Resources.NotFoundException {
        byte b = this.a;
        hjm hjmVar2 = hjm.b;
        switch (b) {
            case 1:
                if (hjmVar == hjmVar2) {
                    ((x5f) this.b).H(p90.d);
                    break;
                }
                break;
            case 2:
                ((x5f) this.b).L(11, (wb0) this.c, null);
                break;
            case 3:
            case 4:
            case 5:
            case 12:
            case 13:
            default:
                super.onFinished(hjmVar);
                break;
            case 6:
                ((pjg) this.c).run();
                break;
            case 7:
                super.onFinished(hjmVar);
                ojh ojhVar = (ojh) this.c;
                if (ojhVar.c.e()) {
                    yo7 yo7Var = ojhVar.a;
                    Callback callback = (Callback) yo7Var.b;
                    vjh vjhVar = (vjh) yo7Var.c;
                    qjh qjhVar = (qjh) yo7Var.d;
                    Integer num = vjhVar.b;
                    eo0 eo0Var = eo0.c;
                    callback.run(new pjh(null, eo0Var, null, num));
                    if (!Intrinsics.a(eo0Var, eo0Var)) {
                        qjhVar.c.f(new glj(2132019051, 5000));
                        break;
                    }
                }
                break;
            case 8:
                wjh wjhVar = (wjh) this.c;
                if (((sa2) wjhVar.e).e()) {
                    ((ai) wjhVar.b).invoke((vjh) wjhVar.f);
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                if (hjmVar == hjmVar2) {
                    ((rii) this.c).o((pr) this.b, hjmVar2);
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                if (hjmVar == hjmVar2) {
                    ((qq8) this.c).i(hjmVar2);
                    break;
                }
                break;
            case 11:
                if (hjmVar != hjm.a) {
                    ((lz8) this.c).invoke(new byte[0]);
                    break;
                }
                break;
            case 14:
                ven venVar = (ven) this.c;
                venVar.i = null;
                orm ormVar = venVar.f;
                vb0 vb0Var = (vb0) this.b;
                long j = venVar.g.a.getInt("vpn.pro_adult_page_promo.show_count", 0);
                x5f x5fVar = (x5f) ormVar;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).d().b(new q5f(j, vb0Var, (byte) 1));
                    x5fVar.U0(x56VarF);
                    break;
                }
                break;
            case 15:
                bmn bmnVar = (bmn) this.c;
                super.onFinished(hjmVar);
                if (hjmVar.equals(hjmVar2)) {
                    bmnVar.f(ru0.b, null);
                }
                bmnVar.f = null;
                ((zln) this.b).c(this, hjmVar);
                break;
        }
    }
}
