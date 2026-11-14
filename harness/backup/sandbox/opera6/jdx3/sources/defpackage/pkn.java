package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class pkn implements tjn {
    public final /* synthetic */ wln a;
    public final /* synthetic */ n1 b;
    public final /* synthetic */ qln c;
    public final /* synthetic */ orm d;
    public final /* synthetic */ eej e;
    public final /* synthetic */ qkn f;

    public pkn(qkn qknVar, wln wlnVar, n1 n1Var, qln qlnVar, orm ormVar, eej eejVar) {
        this.a = wlnVar;
        this.b = n1Var;
        this.c = qlnVar;
        this.d = ormVar;
        this.e = eejVar;
        this.f = qknVar;
    }

    @Override // defpackage.tjn
    public final int a() {
        t79 t79Var = this.f.m;
        if (t79Var != null) {
            return t79Var.s0();
        }
        return 0;
    }

    @Override // defpackage.tjn
    public final void b() {
        this.f.a.e(new sln(), false);
    }

    @Override // defpackage.tjn
    public final void c() {
        ((x5f) this.d).S(13);
        String strQ = rih.q(this.f.f.getContext());
        if (strQ == null) {
            return;
        }
        vx3 vx3VarA = ay3.a(strQ, lqm.d, false);
        vx3VarA.a(true);
        vx3VarA.b = 3;
        am2.v(vx3VarA);
    }

    @Override // defpackage.tjn
    public final boolean d() {
        return this.f.b.g();
    }

    @Override // defpackage.tjn
    public final String e() {
        return this.f.b.i();
    }

    @Override // defpackage.tjn
    public final String f() {
        return this.f.b.f();
    }

    @Override // defpackage.tjn
    public final void g() {
        this.f.a.e(new mkn(), false);
    }

    @Override // defpackage.tjn
    public final void i(View view) {
        Context context = this.f.f.getContext();
        iyk iykVar = new iyk(this, this.a, (byte) 12);
        try {
            Intent intentAddCategory = new Intent("android.intent.action.GET_CONTENT").setType("image/*").addCategory("android.intent.category.OPENABLE");
            intentAddCategory.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            ((hjf) oi.d(context)).D(intentAddCategory, new qj2(iykVar, (byte) 14));
        } catch (ActivityNotFoundException unused) {
            az0 az0Var = new az0(context);
            az0Var.a(2132019060);
            az0Var.setNegativeButton(2132020155, (DialogInterface.OnClickListener) null).c();
        }
    }

    @Override // defpackage.tjn
    public final void j(boolean z) {
        qln qlnVar = this.f.b;
        if (z) {
            qlnVar.o(false);
            qlnVar.n("most_popular");
            return;
        }
        if (zg.e != null) {
            return;
        }
        qln qlnVar2 = this.c;
        boolean zI = ((vq8) qlnVar2.f.e).i();
        eej eejVar = this.e;
        if (!zI) {
            qlnVar2.f.r(new h4m((Object) qlnVar2, (Object) this.d, (Object) eejVar, (byte) 8));
            return;
        }
        urj urjVar = new urj((byte) 9);
        eejVar.getClass();
        og5 og5Var = new og5(new zg(qlnVar2), urjVar);
        nej nejVar = eejVar.a;
        nejVar.getClass();
        nejVar.b(og5Var, ijm.b);
        zg.e = og5Var;
    }

    @Override // defpackage.tjn
    public final void k(View view) {
    }

    @Override // defpackage.tjn
    public final void l() {
        ((x5f) this.d).S(12);
    }

    @Override // defpackage.tjn
    public final void m(View view, final aln alnVar) {
        k15 k15Var;
        ArrayList arrayList = new ArrayList();
        qkn qknVar = this.f;
        Map map = (Map) qknVar.h.h.g();
        final byte b = 0;
        final byte b2 = 1;
        if (map == null || map.isEmpty() || (k15Var = (k15) map.get(alnVar.getId())) == null || k15Var.a()) {
            if (((ArrayList) qknVar.b.j.d).contains(alnVar.getId())) {
                arrayList.add(new gtd(new rxh(2132020902), new lxh(2131232081), new View.OnClickListener(this) { // from class: okn
                    public final /* synthetic */ pkn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b3 = b;
                        ijm ijmVar = ijm.b;
                        aln alnVar2 = alnVar;
                        pkn pknVar = this.b;
                        switch (b3) {
                            case 0:
                                qkn qknVar2 = pknVar.f;
                                qknVar2.b.m(alnVar2.getId());
                                ysj ysjVar = qknVar2.p;
                                ysjVar.b(am2.i(2132022356, 2500, ysjVar), ijmVar);
                                pknVar.p();
                                break;
                            case 1:
                                qkn qknVar3 = pknVar.f;
                                qln qlnVar = qknVar3.b;
                                String id = alnVar2.getId();
                                vzk vzkVar = qlnVar.j;
                                ((ArrayList) vzkVar.d).add(id);
                                vzkVar.i0();
                                ysj ysjVar2 = qknVar3.p;
                                ysjVar2.b(am2.i(2132022313, 2500, ysjVar2), ijmVar);
                                pknVar.p();
                                break;
                            case 2:
                                pknVar.n(alnVar2);
                                break;
                            default:
                                qln qlnVar2 = pknVar.f.b;
                                String id2 = alnVar2.getId();
                                qlnVar2.f.f(id2, new npl(qlnVar2, id2, (byte) 28));
                                pknVar.p();
                                break;
                        }
                    }
                }));
            } else {
                arrayList.add(new gtd(new rxh(2132017385), new lxh(2131232081), new View.OnClickListener(this) { // from class: okn
                    public final /* synthetic */ pkn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b3 = b2;
                        ijm ijmVar = ijm.b;
                        aln alnVar2 = alnVar;
                        pkn pknVar = this.b;
                        switch (b3) {
                            case 0:
                                qkn qknVar2 = pknVar.f;
                                qknVar2.b.m(alnVar2.getId());
                                ysj ysjVar = qknVar2.p;
                                ysjVar.b(am2.i(2132022356, 2500, ysjVar), ijmVar);
                                pknVar.p();
                                break;
                            case 1:
                                qkn qknVar3 = pknVar.f;
                                qln qlnVar = qknVar3.b;
                                String id = alnVar2.getId();
                                vzk vzkVar = qlnVar.j;
                                ((ArrayList) vzkVar.d).add(id);
                                vzkVar.i0();
                                ysj ysjVar2 = qknVar3.p;
                                ysjVar2.b(am2.i(2132022313, 2500, ysjVar2), ijmVar);
                                pknVar.p();
                                break;
                            case 2:
                                pknVar.n(alnVar2);
                                break;
                            default:
                                qln qlnVar2 = pknVar.f.b;
                                String id2 = alnVar2.getId();
                                qlnVar2.f.f(id2, new npl(qlnVar2, id2, (byte) 28));
                                pknVar.p();
                                break;
                        }
                    }
                }));
            }
        }
        final byte b3 = 2;
        arrayList.add(new gtd(new rxh(2132021058), new lxh(2131232305), new View.OnClickListener(this) { // from class: okn
            public final /* synthetic */ pkn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b3;
                ijm ijmVar = ijm.b;
                aln alnVar2 = alnVar;
                pkn pknVar = this.b;
                switch (b32) {
                    case 0:
                        qkn qknVar2 = pknVar.f;
                        qknVar2.b.m(alnVar2.getId());
                        ysj ysjVar = qknVar2.p;
                        ysjVar.b(am2.i(2132022356, 2500, ysjVar), ijmVar);
                        pknVar.p();
                        break;
                    case 1:
                        qkn qknVar3 = pknVar.f;
                        qln qlnVar = qknVar3.b;
                        String id = alnVar2.getId();
                        vzk vzkVar = qlnVar.j;
                        ((ArrayList) vzkVar.d).add(id);
                        vzkVar.i0();
                        ysj ysjVar2 = qknVar3.p;
                        ysjVar2.b(am2.i(2132022313, 2500, ysjVar2), ijmVar);
                        pknVar.p();
                        break;
                    case 2:
                        pknVar.n(alnVar2);
                        break;
                    default:
                        qln qlnVar2 = pknVar.f.b;
                        String id2 = alnVar2.getId();
                        qlnVar2.f.f(id2, new npl(qlnVar2, id2, (byte) 28));
                        pknVar.p();
                        break;
                }
            }
        }));
        final byte b4 = 3;
        if (this.b instanceof yjn) {
            arrayList.add(new gtd(new rxh(2132020899), new lxh(2131232064), new View.OnClickListener(this) { // from class: okn
                public final /* synthetic */ pkn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b32 = b4;
                    ijm ijmVar = ijm.b;
                    aln alnVar2 = alnVar;
                    pkn pknVar = this.b;
                    switch (b32) {
                        case 0:
                            qkn qknVar2 = pknVar.f;
                            qknVar2.b.m(alnVar2.getId());
                            ysj ysjVar = qknVar2.p;
                            ysjVar.b(am2.i(2132022356, 2500, ysjVar), ijmVar);
                            pknVar.p();
                            break;
                        case 1:
                            qkn qknVar3 = pknVar.f;
                            qln qlnVar = qknVar3.b;
                            String id = alnVar2.getId();
                            vzk vzkVar = qlnVar.j;
                            ((ArrayList) vzkVar.d).add(id);
                            vzkVar.i0();
                            ysj ysjVar2 = qknVar3.p;
                            ysjVar2.b(am2.i(2132022313, 2500, ysjVar2), ijmVar);
                            pknVar.p();
                            break;
                        case 2:
                            pknVar.n(alnVar2);
                            break;
                        default:
                            qln qlnVar2 = pknVar.f.b;
                            String id2 = alnVar2.getId();
                            qlnVar2.f.f(id2, new npl(qlnVar2, id2, (byte) 28));
                            pknVar.p();
                            break;
                    }
                }
            }));
        }
        exd exdVar = new exd(qknVar.r, new l11(3, 0, 48, view), arrayList);
        qknVar.q = exdVar;
        exdVar.f();
        view.getParent().requestDisallowInterceptTouchEvent(true);
    }

    @Override // defpackage.tjn
    public final void n(aln alnVar) {
        qkn qknVar = this.f;
        mnn mnnVar = qknVar.c.g;
        if (mnnVar != null) {
            mnnVar.c.add(alnVar);
        }
        qknVar.a.e(new dmn(this.a, new cmn(alnVar.getId(), null, 0, 6, true)), false);
        p();
    }

    @Override // defpackage.tjn
    public final x4i o() {
        qkn qknVar = this.f;
        if (qknVar.g.c()) {
            return qknVar.h;
        }
        return null;
    }

    public final void p() {
        qkn qknVar = this.f;
        exd exdVar = qknVar.q;
        if (exdVar != null) {
            exdVar.b(hjm.a);
        }
        qknVar.q = null;
    }

    @Override // defpackage.tjn
    public final void retry() {
        this.f.b.f.r(new rl((byte) 4));
    }
}
