package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.w;
import androidx.mediarouter.app.OperaMediaRouteActionProvider;
import androidx.mediarouter.app.OperaMediaRouteButton;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import com.opera.android.OperaApplication;
import com.opera.android.OverlaidStatusBarDrawingView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.media.MediaPlayerBottomSlideLayout;
import com.opera.android.media.MediaPlayerMini;
import com.opera.android.media.PlayerContainerView;
import com.opera.android.media.PlayerControlView;
import com.opera.android.media.QuickJumpPlayerView;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class gld extends ltl implements jbl {
    public sjg A;
    public pgh B;
    public g77 C;
    public final yn4 D;
    public final ald E;
    public final we7 F;
    public final d8d G;
    public final mig H;
    public d4c r;
    public u02 s;
    public i4d t;
    public i4d u;
    public xbf v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    public gld() {
        super((itl) u7k.j(0).a);
        this.w = 2131232026;
        fld fldVar = new fld(this);
        this.E = new ald(this, (byte) 0);
        this.F = new we7(this, fldVar, (byte) 2);
        this.G = new d8d(this, (byte) 4);
        this.H = new mig(new dld(this));
        this.D = new yn4(this);
    }

    @Override // defpackage.ltl
    public final itl C0(itl itlVar) {
        d4c d4cVarA = d4c.a(requireContext());
        this.r = d4cVarA;
        itl itlVar2 = (itl) u7k.j(d4cVarA.b).a;
        itlVar2.b = 2131755036;
        return itlVar2;
    }

    public final void G0() {
        ColorDrawable colorDrawable;
        ColorStateList colorStateListA;
        u02 u02Var = this.s;
        if (u02Var == null) {
            return;
        }
        Context context = ((RelativeLayout) ((or2) u02Var.f).c).getContext();
        iig iigVar = (iig) ((PlayerContainerView) this.s.e).j.g();
        if (iigVar != null) {
            colorStateListA = ColorStateList.valueOf(iigVar.a);
            colorDrawable = null;
        } else {
            colorDrawable = new ColorDrawable(context.getColor(2131099816));
            colorStateListA = ResourcesCompat.a(context.getResources(), 2131103876, context.getTheme());
        }
        ((RelativeLayout) ((or2) this.s.f).c).setBackground(colorDrawable);
        ((StylingImageButton) ((or2) this.s.f).b).c(colorStateListA);
        ((StylingImageButton) ((or2) this.s.f).e).c(colorStateListA);
        ((StylingImageButton) ((or2) this.s.f).d).c(colorStateListA);
    }

    public final void H0() {
        u02 u02Var = this.s;
        if (u02Var != null) {
            iig iigVar = (iig) ((PlayerContainerView) u02Var.e).j.g();
            xgh xghVar = (xgh) this.s.o;
            if (xghVar instanceof lck) {
                OverlaidStatusBarDrawingView overlaidStatusBarDrawingView = ((lck) xghVar).c;
                if (iigVar != null) {
                    wuf wufVar = wuf.a;
                    if (wufVar != overlaidStatusBarDrawingView.f) {
                        overlaidStatusBarDrawingView.f = wufVar;
                        overlaidStatusBarDrawingView.invalidate();
                        c1f c1fVar = overlaidStatusBarDrawingView.c;
                        if (c1fVar != null) {
                            c1fVar.e();
                        }
                    }
                    if (overlaidStatusBarDrawingView.e != 0) {
                        overlaidStatusBarDrawingView.e = 0;
                        overlaidStatusBarDrawingView.invalidate();
                        c1f c1fVar2 = overlaidStatusBarDrawingView.c;
                        if (c1fVar2 != null) {
                            c1fVar2.e();
                            return;
                        }
                        return;
                    }
                    return;
                }
                wuf wufVar2 = wuf.b;
                if (wufVar2 != overlaidStatusBarDrawingView.f) {
                    overlaidStatusBarDrawingView.f = wufVar2;
                    overlaidStatusBarDrawingView.invalidate();
                    c1f c1fVar3 = overlaidStatusBarDrawingView.c;
                    if (c1fVar3 != null) {
                        c1fVar3.e();
                    }
                }
                int color = overlaidStatusBarDrawingView.getContext().getColor(2131099818);
                if (color != overlaidStatusBarDrawingView.e) {
                    overlaidStatusBarDrawingView.e = color;
                    overlaidStatusBarDrawingView.invalidate();
                    c1f c1fVar4 = overlaidStatusBarDrawingView.c;
                    if (c1fVar4 != null) {
                        c1fVar4.e();
                    }
                }
            }
        }
    }

    public final void I0() {
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        zkd zkdVar = (zkd) ((OperaApplication) context.getApplicationContext()).r.Z.get();
        boolean z = ((MediaPlayerBottomSlideLayout) this.s.b).a;
        if (z == zkdVar.j) {
            return;
        }
        zkdVar.j = z;
        zkdVar.T();
    }

    public final void J0() {
        boolean z;
        a1b a1bVarU = this.F.c().w().a.u(0);
        while (true) {
            if (!a1bVarU.hasNext()) {
                z = false;
                break;
            }
            ezl ezlVar = (ezl) a1bVarU.next();
            if (ezlVar.a > 0 && ezlVar.b.d[0].u != -1) {
                z = true;
                break;
            }
        }
        or2 or2Var = (or2) this.s.f;
        AppCompatImageView appCompatImageView = (StylingImageButton) or2Var.e;
        AppCompatImageView appCompatImageView2 = (StylingImageButton) or2Var.d;
        appCompatImageView.setVisibility((this.y && z) ? 0 : 8);
        appCompatImageView2.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.k24, defpackage.ryl
    public final void h0(w wVar) {
        wVar.Y(-1, 1, "media-player");
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        MediaPlayerBottomSlideLayout mediaPlayerBottomSlideLayout = (MediaPlayerBottomSlideLayout) this.s.b;
        if (mediaPlayerBottomSlideLayout.a) {
            mediaPlayerBottomSlideLayout.b(false);
            return;
        }
        xbf xbfVar = this.v;
        if (xbfVar != null) {
            this.x = ((p12) xbfVar.f).w();
        }
        super.l0(z);
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!Objects.equals(this.r, d4c.a(requireContext()))) {
            this.h = (itl) u7k.j(0).a;
            if (getView() != null) {
                this.o = true;
                D0();
                return;
            }
            return;
        }
        u02 u02Var = this.s;
        if (u02Var == null) {
            return;
        }
        PlayerContainerView playerContainerView = (PlayerContainerView) u02Var.e;
        playerContainerView.f = p92.a(getResources());
        playerContainerView.a();
    }

    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        if (this.p) {
            return null;
        }
        if (!z && this.z) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0);
            valueAnimatorOfInt.setDuration(0L);
            return valueAnimatorOfInt;
        }
        if (!this.x) {
            return super/*androidx.fragment.app.Fragment*/.onCreateAnimator(i, z, i2);
        }
        View view = getView();
        ViewGroup viewGroup = (ViewGroup) this.s.a;
        ViewGroup viewGroup2 = (ViewGroup) getView().getParent();
        p12 p12Var = (p12) this.v.f;
        return new vkd(view, viewGroup, viewGroup2, z, p12Var.m() ? q9n.t((MediaPlayerMini) p12Var.c) : null).g;
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.v != null) {
            yn4 yn4Var = this.D;
            SessionManager sessionManager = yn4Var.g;
            if (sessionManager != null) {
                sessionManager.removeSessionManagerListener(yn4Var.d, CastSession.class);
                yn4Var.g = null;
            }
            yn4Var.f = null;
            ((PlayerContainerView) this.s.e).j.p(this.G);
            ((PlayerContainerView) this.s.e).c(this.v);
            this.F.b(this.v);
            ((QuickJumpPlayerView) this.s.c).D = null;
            this.B = null;
            vml.a((dnb) this.C.c);
            this.C = null;
            this.H.b(this.v);
            zld zldVar = (zld) this.t.b;
            mig migVar = zldVar.e;
            xbf xbfVar = zldVar.b;
            migVar.b(xbfVar);
            zldVar.d.b(xbfVar);
            this.t = null;
            zld zldVar2 = (zld) this.u.b;
            mig migVar2 = zldVar2.e;
            xbf xbfVar2 = zldVar2.b;
            migVar2.b(xbfVar2);
            zldVar2.d.b(xbfVar2);
            this.u = null;
            ((tjg) this.v.b).j(this.A);
            ((h7f) ((uuj) this.v.g).b).c(this.E);
            this.A = null;
            PlayerControlView playerControlView = ((wkd) this.s.d).g;
            playerControlView.b.b(this.v);
            this.v = null;
        }
        this.s = null;
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131363458) {
            return false;
        }
        Toolbar toolbar = this.l;
        l5b l5bVar = q9n.c;
        ArrayList arrayList = new ArrayList();
        q9n.J(toolbar, qe.class, new pih(arrayList));
        View view = (View) arrayList.get(0);
        xbf xbfVar = this.v;
        if (xbfVar == null) {
            return true;
        }
        new akg(xbfVar, false, new rl(this, (byte) 21), null).p(view);
        return true;
    }

    @Override // defpackage.ltl
    public final void onPause() {
        super.onPause();
        PlayerContainerView playerContainerView = (PlayerContainerView) this.s.e;
        yn4 yn4Var = this.D;
        yn4Var.c.c(playerContainerView);
        if (yn4Var.j != null) {
            playerContainerView.e(null);
        }
    }

    @Override // defpackage.ltl
    public final void onResume() {
        super.onResume();
        PlayerContainerView playerContainerView = (PlayerContainerView) this.s.e;
        yn4 yn4Var = this.D;
        yn4Var.c.b(playerContainerView);
        CastSession castSession = yn4Var.j;
        if (castSession != null) {
            playerContainerView.e(castSession);
        }
    }

    @Override // defpackage.ltl
    public final int s0() {
        return this.w == 2131232026 ? 2132019240 : 2132018253;
    }

    @Override // defpackage.ltl
    public final int t0(Context context) {
        return this.w;
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        msk mskVarFindItem = itdVar.findItem(2131363454);
        OperaMediaRouteActionProvider operaMediaRouteActionProvider = (OperaMediaRouteActionProvider) (mskVarFindItem instanceof msk ? mskVarFindItem.z() : null);
        yn4 yn4Var = this.D;
        vnd vndVar = yn4Var.h != null ? yn4Var.e : null;
        if (vndVar != null) {
            lmd lmdVar = operaMediaRouteActionProvider.e;
            dod dodVar = operaMediaRouteActionProvider.d;
            if (!operaMediaRouteActionProvider.f.equals(vndVar)) {
                if (!operaMediaRouteActionProvider.f.d()) {
                    dodVar.j(lmdVar);
                }
                if (!vndVar.d()) {
                    dodVar.a(vndVar, lmdVar, 0);
                }
                operaMediaRouteActionProvider.f = vndVar;
                operaMediaRouteActionProvider.h();
                OperaMediaRouteButton operaMediaRouteButton = operaMediaRouteActionProvider.h;
                if (operaMediaRouteButton != null) {
                    operaMediaRouteButton.e(vndVar);
                }
            }
        }
        ao4 ao4Var = new ao4();
        if (operaMediaRouteActionProvider.g != ao4Var) {
            operaMediaRouteActionProvider.g = ao4Var;
            OperaMediaRouteButton operaMediaRouteButton2 = operaMediaRouteActionProvider.h;
            if (operaMediaRouteButton2 != null) {
                operaMediaRouteButton2.d = ao4Var;
            }
        }
        r16 r16Var = new r16();
        if (r16Var != operaMediaRouteActionProvider.i) {
            operaMediaRouteActionProvider.i = r16Var;
            operaMediaRouteActionProvider.h();
            OperaMediaRouteButton operaMediaRouteButton3 = operaMediaRouteActionProvider.h;
            if (operaMediaRouteButton3 == null || r16Var == operaMediaRouteButton3.e) {
                return;
            }
            operaMediaRouteButton3.e = r16Var;
            operaMediaRouteButton3.c();
            operaMediaRouteButton3.b();
        }
    }

    @Override // defpackage.jbl
    public final String y() {
        return "media-player";
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0524 A[PHI: r3
      0x0524: PHI (r3v7 int) = (r3v6 int), (r3v8 int), (r3v15 int) binds: [B:70:0x016c, B:74:0x0181, B:86:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v72, types: [android.view.View, com.opera.android.media.QuickJumpPlayerView] */
    @Override // defpackage.ltl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y0(android.view.LayoutInflater r33, com.opera.android.StatusBarDrawingFrameLayout r34) {
        /*
            Method dump skipped, instructions count: 1339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gld.y0(android.view.LayoutInflater, com.opera.android.StatusBarDrawingFrameLayout):void");
    }
}
