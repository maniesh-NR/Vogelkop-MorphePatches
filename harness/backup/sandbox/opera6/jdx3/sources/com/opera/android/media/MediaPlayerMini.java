package com.opera.android.media;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.media.MediaPlayerMini;
import defpackage.dll;
import defpackage.ei;
import defpackage.kg7;
import defpackage.lzb;
import defpackage.mig;
import defpackage.ni0;
import defpackage.oi0;
import defpackage.p92;
import defpackage.pi0;
import defpackage.q9n;
import defpackage.qd0;
import defpackage.rh0;
import defpackage.sh0;
import defpackage.tjg;
import defpackage.tld;
import defpackage.u8n;
import defpackage.vh0;
import defpackage.x56;
import defpackage.x5f;
import defpackage.xbf;
import defpackage.zkd;
import defpackage.zpa;
import java.util.List;

/* loaded from: classes.dex */
public class MediaPlayerMini extends RelativeLayout {
    public static final /* synthetic */ int d = 0;
    public ei a;
    public xbf b;
    public final mig c;

    public MediaPlayerMini(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new mig(new tld(this));
    }

    public final void a(oi0 oi0Var) {
        qjd qjdVarG = ((gig) ((ode) this.b.c).g()).g();
        if (qjdVarG != null) {
            Context context = getContext();
            String[] strArr = OperaApplication.K;
            x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
            rh0 rh0VarR = zkd.R((tjg) this.b.b, qjdVarG);
            sh0 sh0Var = ((tjg) this.b.b).k(qjdVarG) == kg7.g ? sh0.b : sh0.c;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                ni0 ni0Var = new ni0(2443, -1, 3);
                ni0Var.q(2, 1, oi0Var);
                ni0Var.q(1, 1, pi0.a);
                vh0 vh0Var = (vh0) ni0Var.n(0);
                if (vh0Var == null) {
                    ni0Var.q(0, 1, zpa.A());
                    vh0Var = (vh0) ni0Var.n(0);
                }
                vh0Var.q(1, 1, rh0VarR);
                vh0Var.q(0, 1, sh0Var);
                x56 x56VarF = zpa.F();
                qd0 qd0VarB = x56VarF.B(zpaVar);
                List list = (List) qd0VarB.n(15);
                ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 15, vep.t(qd0VarB, 15, 1)) : new hf0(qd0VarB, 15, list)).add(ni0Var);
                x5fVar.U0(x56VarF);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        xbf xbfVar = ((OperaApplication) context.getApplicationContext()).x().o;
        this.b = xbfVar;
        ((PlayerContainerView) this.a.e).b(xbfVar);
        this.c.a(this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b(this.b);
        ((PlayerContainerView) this.a.e).c(this.b);
        this.b = null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = 2131362349;
        AppCompatImageView appCompatImageView = (StylingImageButton) w1h.j(2131362349, this);
        if (appCompatImageView != null) {
            i = 2131363902;
            AppCompatImageView appCompatImageView2 = (StylingImageButton) w1h.j(2131363902, this);
            if (appCompatImageView2 != null) {
                i = 2131363909;
                PlayerContainerView playerContainerView = (PlayerContainerView) w1h.j(2131363909, this);
                if (playerContainerView != null) {
                    i = 2131363911;
                    PlayerView playerViewJ = w1h.j(2131363911, this);
                    if (playerViewJ != null) {
                        i = 2131363061;
                        LinearProgressIndicator linearProgressIndicatorJ = w1h.j(2131363061, this);
                        if (linearProgressIndicatorJ != null) {
                            i = 2131364596;
                            yq1 yq1Var = (StylingTextView) w1h.j(2131364596, this);
                            if (yq1Var != null) {
                                i = 2131363525;
                                yq1 yq1Var2 = (StylingTextView) w1h.j(2131363525, this);
                                if (yq1Var2 != null) {
                                    this.a = new ei((ViewGroup) this, (View) appCompatImageView, (View) appCompatImageView2, (View) playerContainerView, (View) playerViewJ, (View) linearProgressIndicatorJ, (View) yq1Var, (View) yq1Var2, (byte) 7);
                                    playerViewJ.e();
                                    AspectRatioFrameLayout aspectRatioFrameLayout = ((PlayerView) this.a.f).b;
                                    aspectRatioFrameLayout.getClass();
                                    if (aspectRatioFrameLayout.d != 4) {
                                        aspectRatioFrameLayout.d = 4;
                                        aspectRatioFrameLayout.requestLayout();
                                    }
                                    PlayerContainerView playerContainerView2 = (PlayerContainerView) this.a.e;
                                    playerContainerView2.f = new p92(true, 0.0f, getResources().getDimensionPixelSize(2131166672), 2, false);
                                    playerContainerView2.a();
                                    final byte b = 0;
                                    ((StylingImageButton) this.a.d).setOnClickListener(new View.OnClickListener(this) { // from class: sld
                                        public final /* synthetic */ MediaPlayerMini b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b2 = b;
                                            MediaPlayerMini mediaPlayerMini = this.b;
                                            switch (b2) {
                                                case 0:
                                                    int i2 = MediaPlayerMini.d;
                                                    if (!mediaPlayerMini.c.e()) {
                                                        mediaPlayerMini.a(oi0.c);
                                                        break;
                                                    } else {
                                                        mediaPlayerMini.a(oi0.b);
                                                        break;
                                                    }
                                                case 1:
                                                    int i3 = MediaPlayerMini.d;
                                                    mediaPlayerMini.a(oi0.d);
                                                    mediaPlayerMini.c.c().stop();
                                                    tjg tjgVar = (tjg) mediaPlayerMini.b.b;
                                                    okg okgVar = tjgVar.k;
                                                    okgVar.c.clear();
                                                    okgVar.d.clear();
                                                    okgVar.e.clear();
                                                    okgVar.b.b();
                                                    if (tjgVar.h != null) {
                                                        dod.d(tjgVar.a);
                                                        dod.k((cpd) null);
                                                        CastContext.getSharedInstance().getSessionManager().endCurrentSession(true);
                                                        fr3.i = null;
                                                        tjgVar.l();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    int i4 = MediaPlayerMini.d;
                                                    mediaPlayerMini.a(oi0.e);
                                                    zhj.a(new gld(), -1).c(mediaPlayerMini.getContext());
                                                    break;
                                            }
                                        }
                                    });
                                    final byte b2 = 1;
                                    ((StylingImageButton) this.a.c).setOnClickListener(new View.OnClickListener(this) { // from class: sld
                                        public final /* synthetic */ MediaPlayerMini b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b22 = b2;
                                            MediaPlayerMini mediaPlayerMini = this.b;
                                            switch (b22) {
                                                case 0:
                                                    int i2 = MediaPlayerMini.d;
                                                    if (!mediaPlayerMini.c.e()) {
                                                        mediaPlayerMini.a(oi0.c);
                                                        break;
                                                    } else {
                                                        mediaPlayerMini.a(oi0.b);
                                                        break;
                                                    }
                                                case 1:
                                                    int i3 = MediaPlayerMini.d;
                                                    mediaPlayerMini.a(oi0.d);
                                                    mediaPlayerMini.c.c().stop();
                                                    tjg tjgVar = (tjg) mediaPlayerMini.b.b;
                                                    okg okgVar = tjgVar.k;
                                                    okgVar.c.clear();
                                                    okgVar.d.clear();
                                                    okgVar.e.clear();
                                                    okgVar.b.b();
                                                    if (tjgVar.h != null) {
                                                        dod.d(tjgVar.a);
                                                        dod.k((cpd) null);
                                                        CastContext.getSharedInstance().getSessionManager().endCurrentSession(true);
                                                        fr3.i = null;
                                                        tjgVar.l();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    int i4 = MediaPlayerMini.d;
                                                    mediaPlayerMini.a(oi0.e);
                                                    zhj.a(new gld(), -1).c(mediaPlayerMini.getContext());
                                                    break;
                                            }
                                        }
                                    });
                                    final byte b3 = 2;
                                    setOnClickListener(new View.OnClickListener(this) { // from class: sld
                                        public final /* synthetic */ MediaPlayerMini b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b22 = b3;
                                            MediaPlayerMini mediaPlayerMini = this.b;
                                            switch (b22) {
                                                case 0:
                                                    int i2 = MediaPlayerMini.d;
                                                    if (!mediaPlayerMini.c.e()) {
                                                        mediaPlayerMini.a(oi0.c);
                                                        break;
                                                    } else {
                                                        mediaPlayerMini.a(oi0.b);
                                                        break;
                                                    }
                                                case 1:
                                                    int i3 = MediaPlayerMini.d;
                                                    mediaPlayerMini.a(oi0.d);
                                                    mediaPlayerMini.c.c().stop();
                                                    tjg tjgVar = (tjg) mediaPlayerMini.b.b;
                                                    okg okgVar = tjgVar.k;
                                                    okgVar.c.clear();
                                                    okgVar.d.clear();
                                                    okgVar.e.clear();
                                                    okgVar.b.b();
                                                    if (tjgVar.h != null) {
                                                        dod.d(tjgVar.a);
                                                        dod.k((cpd) null);
                                                        CastContext.getSharedInstance().getSessionManager().endCurrentSession(true);
                                                        fr3.i = null;
                                                        tjgVar.l();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    int i4 = MediaPlayerMini.d;
                                                    mediaPlayerMini.a(oi0.e);
                                                    zhj.a(new gld(), -1).c(mediaPlayerMini.getContext());
                                                    break;
                                            }
                                        }
                                    });
                                    AppCompatImageView appCompatImageView3 = (StylingImageButton) this.a.d;
                                    lzb lzbVar = new lzb(this, (byte) 11);
                                    dll dllVarS = q9n.s(appCompatImageView3);
                                    if (dllVarS == null) {
                                        return;
                                    }
                                    u8n.b(dllVarS, appCompatImageView3, lzbVar);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }
}
