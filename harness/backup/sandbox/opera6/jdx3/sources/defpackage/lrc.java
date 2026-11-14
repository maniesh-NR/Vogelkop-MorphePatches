package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.live_score.LivescoreSheetContentWrapper;
import com.opera.android.live_score.LivescoreSheetLayoutSwitcher;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.sheet.VelocityTrackingCoordinatorLayout;
import com.opera.android.webcore.FastResizeWebViewContainer;
import com.opera.android.widget.MeasurableHeightScrollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class lrc extends ltl {
    public final yqc A;
    public or2 B;
    public vl6 C;
    public final kze D;
    public final urc r;
    public final qrc s;
    public final wll t;
    public final qwe u;
    public LivescoreSheetLayoutSwitcher v;
    public p8f w;
    public WebContents x;
    public boolean y;
    public final ew3 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public lrc(urc urcVar, qrc qrcVar, wll wllVar, qwe qweVar, ew3 ew3Var, yqc yqcVar, u55 u55Var, orm ormVar) {
        u7k u7kVarJ = u7k.j(2131558979);
        ((itl) u7kVarJ.a).h = false;
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.f = true;
        super(itlVar);
        this.r = urcVar;
        this.s = qrcVar;
        this.t = wllVar;
        this.u = qweVar;
        this.z = ew3Var;
        this.A = yqcVar;
        this.D = new kze(Boolean.FALSE);
        getLifecycle().a(new krc(u55Var, ormVar));
    }

    public final void G0() {
        LivescoreSheetLayoutSwitcher livescoreSheetLayoutSwitcher = this.v;
        if (livescoreSheetLayoutSwitcher != null) {
            FastResizeWebViewContainer fastResizeWebViewContainer = (FastResizeWebViewContainer) livescoreSheetLayoutSwitcher.getChildAt(0);
            zll zllVar = fastResizeWebViewContainer.c;
            if (zllVar != null) {
                fastResizeWebViewContainer.removeView(zllVar);
            }
            fastResizeWebViewContainer.c = null;
            fastResizeWebViewContainer.b = null;
            qwe qweVar = fastResizeWebViewContainer.d;
            if (qweVar != null) {
                qweVar.b.c(fastResizeWebViewContainer.g);
            }
            fastResizeWebViewContainer.d = null;
        }
        p8f p8fVar = this.w;
        if (p8fVar != null) {
            u8n.h((zll) p8fVar.b);
        }
        p8f p8fVar2 = this.w;
        if (p8fVar2 != null) {
            p8fVar2.j();
        }
        this.w = null;
        this.x = null;
    }

    @Override // defpackage.ryl
    public final void g0() {
        if (this.a) {
            return;
        }
        super.g0();
        G0();
    }

    @Override // defpackage.k24
    public final int k0() {
        return 2130969943;
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        NavigationController navigationControllerQ;
        WebContents webContents = this.x;
        if (webContents != null && (navigationControllerQ = webContents.q()) != null && navigationControllerQ.f()) {
            navigationControllerQ.e();
            return;
        }
        vl6 vl6Var = this.C;
        if (vl6Var == null) {
            vl6Var = null;
        }
        vl6Var.S();
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.y = true;
        Bundle arguments = getArguments();
        irc ircVar = arguments != null ? ((mrc) p37.E(arguments)).a : null;
        if (ircVar == null) {
            ircVar = crc.a;
        }
        this.s.a(ircVar);
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        this.r.e.e(occ.ON_DESTROY);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        G0();
    }

    public final void onStart() {
        super.onStart();
        WebContents webContents = this.x;
        if (webContents != null) {
            webContents.y1(2);
        }
    }

    public final void onStop() {
        super.onStop();
        WebContents webContents = this.x;
        if (webContents != null) {
            webContents.y1(0);
        }
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        this.s.c.j(getViewLifecycleOwner(), new iwa(new rkc((Object) this, (byte) 4), (byte) 3));
        p8f p8fVar = this.w;
        if (p8fVar != null) {
            zll zllVar = (zll) p8fVar.b;
            lzb lzbVar = new lzb(this, (byte) 5);
            l5b l5bVar = q9n.c;
            dll dllVarV = hjf.v(zllVar.getContext());
            if (dllVarV != null) {
                u8n.b(dllVarV, zllVar, lzbVar);
            }
        }
        LivescoreSheetLayoutSwitcher livescoreSheetLayoutSwitcher = this.v;
        if (livescoreSheetLayoutSwitcher == null) {
            livescoreSheetLayoutSwitcher = null;
        }
        livescoreSheetLayoutSwitcher.a().c.setOnClickListener(new sma(this, (byte) 19));
        view.postOnAnimation(new ca(view, (byte) 3));
        final byte b = 0;
        q9n.f(this.l, new e73(new nga(this.k, 0), this, (byte) 9));
        this.k.setBackground(new ColorDrawable(this.k.getContext().getColor(2131099819)));
        this.k.getBackground().setAlpha(0);
        or2 or2Var = this.B;
        if (or2Var == null) {
            or2Var = null;
        }
        ((FastResizeWebViewContainer) or2Var.b).c(this.D);
        or2 or2Var2 = this.B;
        if (or2Var2 == null) {
            or2Var2 = null;
        }
        OperaBottomSheetBehavior.C((MeasurableHeightScrollView) or2Var2.e).x(new r42(this, (byte) 2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165347);
        or2 or2Var3 = this.B;
        if (or2Var3 == null) {
            or2Var3 = null;
        }
        new m9f((MeasurableHeightScrollView) or2Var3.e, dimensionPixelSize).v(1.0f);
        or2 or2Var4 = this.B;
        if (or2Var4 == null) {
            or2Var4 = null;
        }
        this.C = new vl6((MeasurableHeightScrollView) or2Var4.e, 6, new qfb(this, (byte) 5));
        tcc lifecycle = getViewLifecycleOwner().getLifecycle();
        vl6 vl6Var = this.C;
        if (vl6Var == null) {
            vl6Var = null;
        }
        lifecycle.a(vl6Var);
        s6h s6hVar = new s6h((byte) 12);
        or2 or2Var5 = this.B;
        if (or2Var5 == null) {
            or2Var5 = null;
        }
        ((LinearLayout) or2Var5.c).setOnClickListener(new jf7(s6hVar, this, (byte) 17));
        or2 or2Var6 = this.B;
        if (or2Var6 == null) {
            or2Var6 = null;
        }
        ((LayoutDirectionToolbar) or2Var6.f).setOnTouchListener(new m42(this, (byte) 3));
        or2 or2Var7 = this.B;
        ((MeasurableHeightScrollView) (or2Var7 == null ? null : or2Var7).e).L = false;
        q9n.d(new yzb(this, (byte) 9), (MeasurableHeightScrollView) (or2Var7 != null ? or2Var7 : null).e);
        ndc viewLifecycleOwner = getViewLifecycleOwner();
        final eq6 eq6Var = new eq6(this.z);
        final urc urcVar = this.A.a;
        final byte b2 = 1;
        oup.l0(viewLifecycleOwner.getLifecycle(), (Function1) null, new Function1() { // from class: src
            public final Object invoke(Object obj) {
                byte b3 = b;
                eq6 eq6Var2 = eq6Var;
                urc urcVar2 = urcVar;
                switch (b3) {
                    case 0:
                        ta7 ta7Var = urcVar2.f;
                        if (Intrinsics.a((eq6) ta7Var.m, eq6Var2)) {
                            ta7Var.m = null;
                        }
                        break;
                    default:
                        urcVar2.f.m = eq6Var2;
                        break;
                }
                return Unit.a;
            }
        }, (Function1) null, new Function1() { // from class: src
            public final Object invoke(Object obj) {
                byte b3 = b2;
                eq6 eq6Var2 = eq6Var;
                urc urcVar2 = urcVar;
                switch (b3) {
                    case 0:
                        ta7 ta7Var = urcVar2.f;
                        if (Intrinsics.a((eq6) ta7Var.m, eq6Var2)) {
                            ta7Var.m = null;
                        }
                        break;
                    default:
                        urcVar2.f.m = eq6Var2;
                        break;
                }
                return Unit.a;
            }
        }, 5);
    }

    public final void setArguments(Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.setArguments(bundle);
        if (this.y) {
            Bundle arguments = getArguments();
            irc ircVar = arguments != null ? ((mrc) p37.E(arguments)).a : null;
            if (ircVar == null) {
                ircVar = crc.a;
            }
            this.s.a(ircVar);
        }
    }

    @Override // defpackage.ltl
    public final int t0(Context context) {
        return 0;
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        View viewFindViewById = statusBarDrawingFrameLayout.findViewById(2131363024);
        int i = 2131362409;
        LivescoreSheetContentWrapper livescoreSheetContentWrapper = (LivescoreSheetContentWrapper) w1h.j(2131362409, viewFindViewById);
        if (livescoreSheetContentWrapper != null) {
            LinearLayout linearLayout = (LinearLayout) viewFindViewById;
            i = 2131363313;
            LivescoreSheetLayoutSwitcher livescoreSheetLayoutSwitcher = (LivescoreSheetLayoutSwitcher) w1h.j(2131363313, viewFindViewById);
            if (livescoreSheetLayoutSwitcher != null) {
                i = 2131364421;
                MeasurableHeightScrollView measurableHeightScrollView = (MeasurableHeightScrollView) w1h.j(2131364421, viewFindViewById);
                if (measurableHeightScrollView != null) {
                    i = 2131364424;
                    if (((VelocityTrackingCoordinatorLayout) w1h.j(2131364424, viewFindViewById)) != null) {
                        i = 2131364794;
                        LayoutDirectionToolbar layoutDirectionToolbarJ = w1h.j(2131364794, viewFindViewById);
                        if (layoutDirectionToolbarJ != null) {
                            i = 2131365082;
                            FastResizeWebViewContainer fastResizeWebViewContainer = (FastResizeWebViewContainer) w1h.j(2131365082, viewFindViewById);
                            if (fastResizeWebViewContainer != null) {
                                this.B = new or2(linearLayout, livescoreSheetContentWrapper, livescoreSheetLayoutSwitcher, measurableHeightScrollView, layoutDirectionToolbarJ, fastResizeWebViewContainer);
                                urc urcVar = this.r;
                                WebContents webContentsE = urcVar.a.e();
                                this.x = webContentsE;
                                p8f p8fVarA = this.t.a(webContentsE, f03.t(2130969328, new s8n(requireContext(), 2130969943), 2131103876));
                                this.w = p8fVarA;
                                ((FastResizeWebViewContainer) livescoreSheetLayoutSwitcher.getChildAt(0)).a((zll) p8fVarA.b, urcVar.a, this.u);
                                this.v = livescoreSheetLayoutSwitcher;
                                return;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i)));
    }
}
