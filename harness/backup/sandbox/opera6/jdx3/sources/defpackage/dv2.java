package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.flow.MyFlowMessageRoot;
import com.usercentrics.sdk.ui.components.UCImageView;
import java.util.HashMap;
import org.chromium.net.GURLUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class dv2 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dv2(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        byte b = this.a;
        byte b2 = 10;
        byte b3 = 2;
        byte b4 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                lqh lqhVar = (lqh) obj3;
                cv2 cv2Var = (cv2) obj2;
                ImageView imageView = (ImageView) obj;
                boolean z = lqhVar.a;
                lqhVar.a = !z;
                imageView.setImageResource(!z ? 2131232292 : 2131232293);
                cv2Var.invoke(Boolean.valueOf(lqhVar.a));
                break;
            case 1:
                wt7 wt7Var = (wt7) obj3;
                View view2 = (View) obj2;
                taf tafVar = (taf) obj;
                dbf dbfVar = wt7Var.b;
                hbf hbfVar = (hbf) wt7Var.i.g();
                if (hbfVar == null) {
                    hbfVar = hbf.a;
                }
                dbfVar.v(view2, tafVar, false, hbfVar);
                break;
            case 2:
                xb9 xb9Var = (xb9) obj3;
                hb9 hb9Var = (hb9) obj;
                MyFlowMessageRoot myFlowMessageRoot = xb9Var.h;
                if (!xb9Var.e0((ja2) obj2)) {
                    boolean z2 = !myFlowMessageRoot.j;
                    ((HashMap) xb9Var.g.c).put(Long.valueOf(hb9Var.b), Boolean.valueOf(z2));
                    myFlowMessageRoot.a(z2, true);
                    break;
                }
                break;
            case 3:
                ((StylingImageView) ((y83) obj2).d).setOnClickListener(null);
                v3m v3mVar = ((b1c) obj3).e.z;
                szb szbVar = ((a1c) obj).a.a;
                plk plkVar = v3mVar.d;
                ((xl) plkVar.b).j(new iyk(plkVar, szbVar, b3));
                break;
            case 4:
                igi igiVar = (igi) obj3;
                nwf nwfVar = (nwf) obj2;
                Runnable runnable = (Runnable) obj;
                pt1 pt1Var = (pt1) igiVar.c;
                if (!view.equals((StylingImageButton) pt1Var.d)) {
                    if (!view.equals((StylingImageButton) pt1Var.e)) {
                        if (!view.equals((StylingImageButton) pt1Var.f)) {
                            if (view.equals((StylingImageButton) pt1Var.c)) {
                                if (!((d7l) ((k6l) igiVar.b).o).j.isLoading()) {
                                    switch (nwfVar.a) {
                                        case 0:
                                            new lwf(nwfVar, (byte) 11);
                                            break;
                                        default:
                                            new c7k(nwfVar, b3);
                                            break;
                                    }
                                } else {
                                    switch (nwfVar.a) {
                                        case 0:
                                            new lwf(nwfVar, (byte) 12);
                                            break;
                                        default:
                                            new c7k(nwfVar, (byte) 3);
                                            break;
                                    }
                                }
                            }
                        } else {
                            switch (nwfVar.a) {
                                case 0:
                                    new lwf(nwfVar, b2);
                                    break;
                                default:
                                    new c7k(nwfVar, b4);
                                    break;
                            }
                        }
                    } else {
                        nwfVar.u(false);
                    }
                } else {
                    nwfVar.u(true);
                }
                runnable.run();
                break;
            case 5:
                g0h g0hVar = (g0h) obj3;
                lag lagVar = (lag) obj2;
                kag kagVar = (kag) obj;
                i0h i0hVar = (i0h) g0hVar.c.c;
                i0hVar.c.n0(en0.g);
                String origin = GURLUtils.getOrigin((String) i0hVar.b.e.g());
                int iOrdinal = lagVar.ordinal();
                if (iOrdinal == 1) {
                    p0h p0hVar = i0hVar.b;
                    Context context = view.getContext();
                    boolean z3 = kagVar == kag.GRANTED;
                    p0hVar.getClass();
                    if (!aoh.l(context, origin, z3)) {
                        new h0h(origin, lagVar, new r9g(g0hVar, b2)).o(view);
                        break;
                    }
                } else if (iOrdinal == 2) {
                    new h0h(origin, lagVar, new r9g(g0hVar, b2)).o(view);
                    break;
                } else {
                    Context context2 = view.getContext();
                    xzg parentFragment = i0hVar.getParentFragment() instanceof xzg ? i0hVar.getParentFragment() : null;
                    if (parentFragment != null) {
                        parentFragment.dismiss();
                    }
                    jag jagVarF = s9g.h.f(origin, false);
                    if (jagVarF != null && jagVarF.a(lagVar, (kag) null) != null) {
                        i0hVar.a.e(new c9g(origin), false);
                        break;
                    } else {
                        z77 z77VarU = sfe.U(context2);
                        wpe wpeVar = new wpe(origin, lagVar);
                        z77VarU.getClass();
                        z77VarU.b(wpeVar, ijm.b);
                        break;
                    }
                }
                break;
            case 6:
                ((sdh) obj3).I((Context) obj2, (hq8) obj);
                break;
            case 7:
                cdm cdmVar = (cdm) obj2;
                ((ddm) obj3).d.invoke();
                UCImageView uCImageView = (UCImageView) cdmVar.r.getValue();
                uCImageView.setEnabled(false);
                uCImageView.setImageDrawable((Drawable) cdmVar.t.getValue());
                ((UCImageView) obj).postDelayed(new cbl(cdmVar, (byte) 24), 3500L);
                break;
            case 8:
                lcn lcnVar = (lcn) obj2;
                lcnVar.b.c.c(lcnVar);
                lcnVar.a.J(kf0.c);
                ((rcn) obj3).b(hjm.a);
                ((View.OnClickListener) ((wzg) obj).c).onClick(view);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((nqi) obj3).invoke(((LinearLayout) obj2).getContext(), Long.valueOf(((e7o) obj).a.b));
                break;
            default:
                lro lroVar = (lro) obj3;
                View view3 = (View) obj2;
                xbf xbfVar = (xbf) obj;
                qb7 qb7Var = lroVar.s;
                if (qb7Var != null) {
                    qb7Var.onAdClicked();
                }
                xbfVar.a(view3);
                lroVar.s0(4);
                break;
        }
    }
}
