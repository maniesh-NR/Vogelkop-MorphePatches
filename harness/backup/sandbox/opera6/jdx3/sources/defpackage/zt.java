package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Toast;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class zt implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zt(dqi dqiVar, eqi eqiVar) {
        this.a = (byte) 13;
        this.b = eqiVar;
    }

    public /* synthetic */ zt(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        byte b2 = 4;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                au auVar = (au) obj;
                is isVar = auVar.e;
                if (isVar != null && isVar.c.j.b != ht.c) {
                    int i = eu.b;
                    x7d.B(auVar.d.f(), view, new x2(auVar, isVar, b2));
                    break;
                }
                break;
            case 1:
                cu cuVar = (cu) obj;
                is isVar2 = cuVar.e;
                if (isVar2 != null) {
                    int i2 = eu.b;
                    x7d.B(cuVar.d.f(), view, new x2((Object) cuVar, (Object) isVar2, (byte) 5));
                    break;
                }
                break;
            case 2:
                qy0 qy0Var = (qy0) obj;
                gy0 gy0Var = (gy0) qy0Var.f;
                if (gy0Var != null) {
                    qy0Var.b.a.d(gy0Var.b());
                }
                qy0Var.h0();
                break;
            case 3:
                ((Runnable) obj).run();
                break;
            case 4:
                ?? r11 = (BrowserActivity) obj;
                int i3 = BrowserActivity.E1;
                String[] strArr = OperaApplication.K;
                OperaApplication operaApplication = (OperaApplication) r11.getApplication();
                qln qlnVar = (qln) ((j4c) r11.y.a.a.e).get();
                x5f x5fVar = operaApplication.L().c;
                eej eejVarO = r11.O();
                wt3 wt3Var = new wt3(r11, (byte) 6);
                d8j d8jVar = (d8j) r11.g0.E(d8j.class);
                if (pk5.n == null && !wt3Var.get().equals(Boolean.FALSE)) {
                    if (((vq8) qlnVar.f.e).i()) {
                        byte b3 = 15;
                        xq3 xq3Var = new xq3(b3, new pk5(qlnVar, x5fVar, d8jVar, eejVarO, eejVarO.c), new cpj((byte) 9), z);
                        nej nejVar = eejVarO.a;
                        nejVar.getClass();
                        nejVar.b(xq3Var, ijm.b);
                        pk5.n = xq3Var;
                    } else {
                        qlnVar.f.r(new i61((Object) qlnVar, (Object) x5fVar, (Object) eejVarO, (Object) wt3Var, (Object) d8jVar, (byte) 7));
                    }
                }
                operaApplication.L().c.f0(ph0.t);
                break;
            case 5:
                h85 h85Var = (h85) obj;
                break;
            case 6:
                break;
            case 7:
                xkc xkcVar = (xkc) obj;
                kmc kmcVar = xkcVar.g;
                if (kmcVar != null) {
                    xkcVar.d.a(xkcVar.c.b, kmcVar);
                    break;
                }
                break;
            case 8:
                znc zncVar = (znc) obj;
                nmc nmcVar = zncVar.h;
                if (nmcVar != null) {
                    zncVar.d.a((View) zncVar.c.g, nmcVar);
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                foc focVar = (foc) obj;
                pmc pmcVar = focVar.g;
                if (pmcVar != null) {
                    focVar.d.a(focVar.c.b, pmcVar);
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                hoc hocVar = (hoc) obj;
                qmc qmcVar = hocVar.h;
                if (qmcVar != null) {
                    hocVar.d.a((View) hocVar.c.g, qmcVar);
                    break;
                }
                break;
            case 11:
                zoc zocVar = (zoc) obj;
                wmc wmcVar = zocVar.j;
                if (wmcVar != null) {
                    zocVar.d.a(zocVar.c.f, wmcVar);
                    break;
                }
                break;
            case 12:
                ((him) obj).a(view);
                break;
            case 13:
                eqi eqiVar = (eqi) obj;
                if (eqiVar.a != null || eqiVar.b != null) {
                    new xw((byte) 10, eqiVar, view, z).p(view);
                    break;
                }
                break;
            case 14:
                new bbl((nwf) obj, view, (byte) 4);
                break;
            case 15:
                h5l h5lVar = (h5l) obj;
                break;
            case 16:
                ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("id", (String) obj));
                Toast.makeText(view.getContext(), "Copied to clipboard", 1).show();
                break;
            case 17:
                y6n y6nVar = (y6n) obj;
                aln alnVar = y6nVar.c;
                if (alnVar != null) {
                    y6nVar.b.m(view, alnVar);
                    break;
                }
                break;
            default:
                exn exnVar = (exn) obj;
                exnVar.l0();
                exnVar.h0();
                break;
        }
        return true;
    }
}
