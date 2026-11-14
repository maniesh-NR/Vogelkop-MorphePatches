package defpackage;

import androidx.core.widget.NestedScrollView;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.sheet.VelocityTrackingCoordinatorLayout;
import com.opera.android.webaiassistant.WebAiAssistantLayoutSwitcher;
import com.opera.android.webaiassistant.WebAiAssistantSheetContentWrapper;
import com.opera.android.webcore.FastResizeWebViewContainer;
import com.opera.android.widget.MeasurableHeightScrollView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class t42 extends x22 {
    public final gv3 A;
    public final gv3 B;
    public final ji C;
    public final zv3 D;
    public final j4c E;
    public final rw3 F;
    public final gv3 G;
    public final gjm H;
    public final qwe I;
    public final wll J;
    public final kze K;
    public final s42 L;
    public final BrowserActivity v;
    public final ei w;
    public final tcc x;
    public final zv3 y;
    public final zv3 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, androidx.core.widget.NestedScrollView, com.opera.android.widget.MeasurableHeightScrollView] */
    public t42(BrowserActivity browserActivity, ei eiVar, k6l k6lVar, tcc tccVar, dll dllVar, zv3 zv3Var, zv3 zv3Var2, gv3 gv3Var, gv3 gv3Var2, gv3 gv3Var3, ji jiVar, zv3 zv3Var3, Lazy lazy, wv1 wv1Var, j4c j4cVar, rw3 rw3Var, gv3 gv3Var4, gjm gjmVar, y22 y22Var, ji jiVar2, j4c j4cVar2, qim qimVar, qwe qweVar) {
        rvg rvgVar = (rvg) eiVar.f;
        WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher = (WebAiAssistantLayoutSwitcher) eiVar.g;
        super(browserActivity, k6lVar, tccVar, dllVar, gv3Var2, rvgVar, lazy, (VelocityTrackingCoordinatorLayout) eiVar.c, wv1Var, y22Var, jiVar2, j4cVar2, qimVar);
        this.v = browserActivity;
        this.w = eiVar;
        this.x = tccVar;
        this.y = zv3Var;
        this.z = zv3Var2;
        this.A = gv3Var;
        this.B = gv3Var3;
        this.C = jiVar;
        this.D = zv3Var3;
        this.E = j4cVar;
        this.F = rw3Var;
        this.G = gv3Var4;
        this.H = gjmVar;
        this.I = qweVar;
        this.J = new wll(browserActivity);
        kze kzeVar = new kze(Boolean.FALSE);
        this.K = kzeVar;
        this.L = new s42();
        ((FastResizeWebViewContainer) eiVar.i).c(kzeVar);
        ?? r1 = (MeasurableHeightScrollView) eiVar.e;
        OperaBottomSheetBehavior.C(r1).x(new r42(this, (byte) 0));
        vl6 vl6Var = new vl6((NestedScrollView) r1, 4, new eme(this));
        OperaBottomSheetBehavior operaBottomSheetBehavior = (OperaBottomSheetBehavior) vl6Var.b;
        operaBottomSheetBehavior.a = OperaBottomSheetBehavior.O;
        operaBottomSheetBehavior.p = true;
        tccVar.a(vl6Var);
        eiVar.b.setOnTouchListener(new m42(this, (byte) 0));
        r1.L = false;
        new ga7((FastResizeWebViewContainer) webAiAssistantLayoutSwitcher.getChildAt(0));
        webAiAssistantLayoutSwitcher.c().c.setOnClickListener(new gf((Object) this, (byte) 13));
        webAiAssistantLayoutSwitcher.a().c.setOnClickListener(new n42(this, (byte) 0));
    }

    @Override // defpackage.x22
    public final r22 a(b2l b2lVar, m02 m02Var, v22 v22Var, u22 u22Var, q2 q2Var) {
        final byte b = 1;
        final hq3 hq3VarA = ((j62) this.y.get()).a(((d7l) b2lVar).j.m(), new p42(this, b), m02Var);
        WebContentsWrapper webContentsWrapper = hq3VarA.b;
        new ga7(webContentsWrapper.e().J0().b);
        mlj mljVarC = c();
        wx wxVar = new wx(this, b2lVar, (byte) 10);
        g7m g7mVar = hq3VarA.c;
        k42 k42Var = (k42) this.D.get();
        v5n v5nVar = (v5n) this.k.getValue();
        v22Var.getLifecycle().a(new d62(hq3VarA, new gq3(this.v, v22Var, this.z, new ize(Boolean.valueOf(((d7l) b2lVar).j.m())), new rl((byte) 4), this.A, mljVarC, wxVar, new whf(hq3VarA, (byte) 9), this.C, g7mVar, k42Var, v5nVar, this.H), b));
        z zVar = hq3VarA.m;
        tcc tccVar = this.x;
        zVar.t(tccVar);
        qyj qyjVarF = hq3VarA.f();
        qyjVarF.getClass();
        tccVar.a(new ob(qyjVarF, (byte) 16));
        ize izeVar = new ize(Boolean.valueOf(((d7l) b2lVar).j.m()));
        fp1 fp1Var = this.v;
        final byte b2 = 0;
        vsn vsnVar = new vsn(izeVar, r9n.A(fp1Var), hq3VarA, new Function2(this) { // from class: o42
            public final /* synthetic */ t42 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                hq3 hq3Var = hq3VarA;
                t42 t42Var = this.b;
                String str = (String) obj;
                List list = (List) obj2;
                switch (b3) {
                    case 0:
                        new c5o(t42Var.v, (byte) 3).i(list, (o52) hq3Var.p.c.g(), str);
                        break;
                    default:
                        new c5o(t42Var.v, (byte) 3).E(list, (o52) hq3Var.p.c.g(), str);
                        break;
                }
                return Unit.a;
            }
        }, new Function2(this) { // from class: o42
            public final /* synthetic */ t42 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b;
                hq3 hq3Var = hq3VarA;
                t42 t42Var = this.b;
                String str = (String) obj;
                List list = (List) obj2;
                switch (b3) {
                    case 0:
                        new c5o(t42Var.v, (byte) 3).i(list, (o52) hq3Var.p.c.g(), str);
                        break;
                    default:
                        new c5o(t42Var.v, (byte) 3).E(list, (o52) hq3Var.p.c.g(), str);
                        break;
                }
                return Unit.a;
            }
        }, new vx(this, (byte) 8), ((yk6) this.E.get()).k, new q02(this, (byte) 9), (urn) this.F.get(), this.G);
        hq3VarA.d().j(v22Var, new ug(new f9((Object) new pqh(), (Object) this, (Object) vsnVar, (byte) 9), (byte) 4));
        xf8.B(vsnVar.q).j(v22Var, new ug(new p42(this, (byte) 0), (byte) 4));
        w7d.i(vsnVar.p, cqp.V(v22Var.f), new c71(this, vsnVar, (mt5) null, (byte) 2));
        tccVar.a(new ob(hq3VarA, (byte) 2));
        q42 q42Var = new q42(this, hq3VarA, vsnVar);
        ei eiVar = this.w;
        WebAiAssistantSheetContentWrapper webAiAssistantSheetContentWrapper = (WebAiAssistantSheetContentWrapper) eiVar.d;
        ((FastResizeWebViewContainer) ((WebAiAssistantLayoutSwitcher) eiVar.g).getChildAt(0)).a((zll) this.J.a(webContentsWrapper.e(), f03.t(2130969325, new s8n(fp1Var, 2130969943), 2131103876)).b, webContentsWrapper, this.I);
        qyj qyjVarF2 = hq3VarA.f();
        qyjVarF2.getClass();
        tccVar.a(new ob(qyjVarF2, (byte) 16));
        webAiAssistantSheetContentWrapper.F(this.L);
        return q42Var;
    }

    @Override // defpackage.x22
    public final boolean j(String str) {
        return false;
    }

    @Override // defpackage.x22
    public final boolean k(GURL gurl) {
        return false;
    }
}
