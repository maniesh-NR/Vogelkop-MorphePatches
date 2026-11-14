package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.fragment.app.w;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerView;
import androidx.mediarouter.app.OperaMediaRouteButton;
import com.google.android.gms.cast.framework.CastSession;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.InterceptableFrameLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.custom_views.VerticalSeekBar;
import com.opera.android.media.PlayerContainerView;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class rld extends k24 implements View.OnClickListener {
    public final yn4 k;
    public sjg l;
    public hld m;
    public xbf n;
    public akg o;
    public nld p;
    public wld q;
    public boolean r;
    public boolean s;
    public int t;
    public final tkd f = new tkd(this, (byte) 1);
    public final mig g = new mig(new jld(this, (byte) 0));
    public final b2o h = new b2o(new vx(this, (byte) 24));
    public final ga6 i = new ga6((byte) 27);
    public final ald j = new ald(this, 1);
    public float u = -1.0f;

    public rld(yn4 yn4Var) {
        this.k = yn4Var;
    }

    @Override // defpackage.k24, defpackage.ryl
    public final void h0(w wVar) {
        if (!this.r) {
            this.r = true;
            Window window = requireActivity().getWindow();
            l5b l5bVar = q9n.c;
            window.getDecorView().setSystemUiVisibility(0);
        }
        if (!this.s) {
            super.h0(wVar);
        } else {
            if (wVar.Y(-1, 1, "media-player")) {
                return;
            }
            super.h0(wVar);
        }
    }

    @Override // defpackage.k24, defpackage.l24
    public final boolean j() {
        g0();
        return true;
    }

    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559046, viewGroup, false);
        int i = 2131362201;
        VerticalSeekBar verticalSeekBarJ = w1h.j(2131362201, viewInflate);
        if (verticalSeekBarJ != null) {
            i = 2131362202;
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131362202, viewInflate);
            if (linearLayout != null) {
                i = 2131362402;
                View viewJ = w1h.j(2131362402, viewInflate);
                if (viewJ != null) {
                    cc6.a(viewJ);
                    i = 2131363440;
                    OperaMediaRouteButton operaMediaRouteButtonJ = w1h.j(2131363440, viewInflate);
                    if (operaMediaRouteButtonJ != null) {
                        i = 2131363442;
                        View viewJ2 = w1h.j(2131363442, viewInflate);
                        if (viewJ2 != null) {
                            i = 2131363443;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363443, viewInflate);
                            if (stylingTextView != null) {
                                i = 2131363444;
                                StylingImageButton stylingImageButton = (StylingImageButton) w1h.j(2131363444, viewInflate);
                                if (stylingImageButton != null) {
                                    i = 2131363445;
                                    StylingImageButton stylingImageButton2 = (StylingImageButton) w1h.j(2131363445, viewInflate);
                                    if (stylingImageButton2 != null) {
                                        i = 2131363446;
                                        StylingImageButton stylingImageButton3 = (StylingImageButton) w1h.j(2131363446, viewInflate);
                                        if (stylingImageButton3 != null) {
                                            i = 2131363447;
                                            StylingImageButton stylingImageButton4 = (StylingImageButton) w1h.j(2131363447, viewInflate);
                                            if (stylingImageButton4 != null) {
                                                i = 2131363455;
                                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363455, viewInflate);
                                                if (stylingTextView2 != null) {
                                                    i = 2131363656;
                                                    LinearLayout linearLayout2 = (LinearLayout) w1h.j(2131363656, viewInflate);
                                                    if (linearLayout2 != null) {
                                                        i = 2131363902;
                                                        StylingImageButton stylingImageButton5 = (StylingImageButton) w1h.j(2131363902, viewInflate);
                                                        if (stylingImageButton5 != null) {
                                                            i = 2131363909;
                                                            PlayerContainerView playerContainerView = (PlayerContainerView) w1h.j(2131363909, viewInflate);
                                                            if (playerContainerView != null) {
                                                                i = 2131363911;
                                                                PlayerView playerViewJ = w1h.j(2131363911, viewInflate);
                                                                if (playerViewJ != null) {
                                                                    i = 2131363988;
                                                                    View viewJ3 = w1h.j(2131363988, viewInflate);
                                                                    if (viewJ3 != null) {
                                                                        pt1 pt1VarA = pt1.a(viewJ3);
                                                                        i = 2131363989;
                                                                        StylingImageButton stylingImageButton6 = (StylingImageButton) w1h.j(2131363989, viewInflate);
                                                                        if (stylingImageButton6 != null) {
                                                                            i = 2131363990;
                                                                            StylingImageButton stylingImageButton7 = (StylingImageButton) w1h.j(2131363990, viewInflate);
                                                                            if (stylingImageButton7 != null) {
                                                                                i = 2131364186;
                                                                                AppCompatSeekBar appCompatSeekBarJ = w1h.j(2131364186, viewInflate);
                                                                                if (appCompatSeekBarJ != null) {
                                                                                    i = 2131364616;
                                                                                    LinearLayout linearLayout3 = (LinearLayout) w1h.j(2131364616, viewInflate);
                                                                                    if (linearLayout3 != null) {
                                                                                        i = 2131364617;
                                                                                        ImageView imageView = (ImageView) w1h.j(2131364617, viewInflate);
                                                                                        if (imageView != null) {
                                                                                            i = 2131364618;
                                                                                            StylingTextView stylingTextView3 = (StylingTextView) w1h.j(2131364618, viewInflate);
                                                                                            if (stylingTextView3 != null) {
                                                                                                i = 2131364824;
                                                                                                StylingImageButton stylingImageButton8 = (StylingImageButton) w1h.j(2131364824, viewInflate);
                                                                                                if (stylingImageButton8 != null) {
                                                                                                    i = 2131364825;
                                                                                                    StylingImageButton stylingImageButton9 = (StylingImageButton) w1h.j(2131364825, viewInflate);
                                                                                                    if (stylingImageButton9 != null) {
                                                                                                        i = 2131365032;
                                                                                                        VerticalSeekBar verticalSeekBarJ2 = w1h.j(2131365032, viewInflate);
                                                                                                        if (verticalSeekBarJ2 != null) {
                                                                                                            i = 2131365034;
                                                                                                            LinearLayout linearLayout4 = (LinearLayout) w1h.j(2131365034, viewInflate);
                                                                                                            if (linearLayout4 != null) {
                                                                                                                i = 2131365035;
                                                                                                                ImageView imageView2 = (ImageView) w1h.j(2131365035, viewInflate);
                                                                                                                if (imageView2 != null) {
                                                                                                                    this.m = new hld((InterceptableFrameLayout) viewInflate, verticalSeekBarJ, linearLayout, operaMediaRouteButtonJ, viewJ2, stylingTextView, stylingImageButton, stylingImageButton2, stylingImageButton3, stylingImageButton4, stylingTextView2, linearLayout2, stylingImageButton5, playerContainerView, playerViewJ, pt1VarA, stylingImageButton6, stylingImageButton7, appCompatSeekBarJ, linearLayout3, imageView, stylingTextView3, stylingImageButton8, stylingImageButton9, verticalSeekBarJ2, linearLayout4, imageView2);
                                                                                                                    Context contextRequireContext = requireContext();
                                                                                                                    String[] strArr = OperaApplication.K;
                                                                                                                    xbf xbfVar = ((OperaApplication) contextRequireContext.getApplicationContext()).x().o;
                                                                                                                    this.n = xbfVar;
                                                                                                                    ((h7f) ((uuj) xbfVar.g).b).b(this.j);
                                                                                                                    gig gigVar = (gig) ((ode) this.n.c).g();
                                                                                                                    if (gigVar != null) {
                                                                                                                        gigVar.S(this.f);
                                                                                                                    }
                                                                                                                    this.q = (wld) ((OperaApplication) requireContext().getApplicationContext()).r.b0.get();
                                                                                                                    yn4 yn4Var = this.k;
                                                                                                                    vnd vndVar = yn4Var.h != null ? yn4Var.e : null;
                                                                                                                    if (vndVar != null) {
                                                                                                                        this.m.d.e(vndVar);
                                                                                                                        this.m.d.d = new ao4();
                                                                                                                    }
                                                                                                                    hld hldVar = this.m;
                                                                                                                    nld nldVar = new nld(hldVar, this.g, (uuj) this.n.g, new eme(requireActivity().getWindow()), vndVar != null);
                                                                                                                    InterceptableFrameLayout interceptableFrameLayout = hldVar.a;
                                                                                                                    kld kldVar = new kld(interceptableFrameLayout.getContext(), nldVar, nldVar);
                                                                                                                    View view = hldVar.e;
                                                                                                                    view.setClickable(true);
                                                                                                                    view.setOnTouchListener(new m42(kldVar, (byte) 4));
                                                                                                                    hldVar.s.setOnTouchListener(new m42(nldVar, (byte) 5));
                                                                                                                    interceptableFrameLayout.a = new ild(nldVar);
                                                                                                                    this.p = nldVar;
                                                                                                                    this.m.o.e();
                                                                                                                    PlayerContainerView playerContainerView2 = this.m.n;
                                                                                                                    playerContainerView2.f = p92.a(getResources());
                                                                                                                    playerContainerView2.a();
                                                                                                                    PlayerView playerView = this.m.o;
                                                                                                                    yzb yzbVar = new yzb(this, (byte) 27);
                                                                                                                    AspectRatioFrameLayout aspectRatioFrameLayout = playerView.b;
                                                                                                                    aspectRatioFrameLayout.getClass();
                                                                                                                    aspectRatioFrameLayout.b = yzbVar;
                                                                                                                    this.m.x.setOnClickListener(this);
                                                                                                                    this.m.q.setOnClickListener(this);
                                                                                                                    this.m.m.setOnClickListener(this);
                                                                                                                    this.m.r.setOnClickListener(this);
                                                                                                                    this.m.w.setOnClickListener(this);
                                                                                                                    this.m.j.setOnClickListener(this);
                                                                                                                    AppCompatSeekBar appCompatSeekBar = this.m.s;
                                                                                                                    mig migVar = this.g;
                                                                                                                    appCompatSeekBar.setOnSeekBarChangeListener(migVar.i);
                                                                                                                    this.m.g.setOnClickListener(this);
                                                                                                                    this.m.i.setOnClickListener(this);
                                                                                                                    this.m.h.setOnClickListener(this);
                                                                                                                    this.o = new akg(this.n, true, new dnb(this, (byte) 28), this.i);
                                                                                                                    sjg sjgVar = new sjg(4, this.m.o);
                                                                                                                    this.l = sjgVar;
                                                                                                                    ((tjg) this.n.b).b(sjgVar, true);
                                                                                                                    this.m.n.b(this.n);
                                                                                                                    migVar.a(this.n);
                                                                                                                    o0(((uuj) this.n.g).i());
                                                                                                                    this.h.j(getViewLifecycleOwner(), new d8d(this, (byte) 5));
                                                                                                                    return this.m.a;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void o0(int i) {
        int i2 = i == 0 ? 2131232297 : 2131232294;
        if (this.t == i2) {
            return;
        }
        this.t = i2;
        this.m.j.setImageResource(i2);
        this.m.A.setImageResource(i2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.m != null) {
            this.p.c();
            int id = view.getId();
            int id2 = this.m.m.getId();
            mig migVar = this.g;
            if (id == id2) {
                migVar.e();
                return;
            }
            if (view.getId() == this.m.q.getId()) {
                migVar.c().p0();
                return;
            }
            if (view.getId() == this.m.r.getId()) {
                if (migVar.c().getPlaybackState() != 4) {
                    migVar.c().o0();
                    return;
                }
                return;
            }
            if (view.getId() == this.m.x.getId()) {
                migVar.c().r();
                return;
            }
            if (view.getId() == this.m.w.getId()) {
                migVar.c().M();
                return;
            }
            if (view.getId() == this.m.g.getId()) {
                l0(false);
                return;
            }
            if (view.getId() == this.m.j.getId()) {
                uuj uujVar = (uuj) this.n.g;
                int i = uujVar.i();
                if (i <= 0) {
                    uujVar.m(uujVar.a);
                    return;
                } else {
                    uujVar.a = i;
                    uujVar.m(0);
                    return;
                }
            }
            if (view.getId() == this.m.i.getId()) {
                this.s = true;
                g0();
            } else if (view.getId() == this.m.h.getId()) {
                this.o.p(this.m.h);
                nld nldVar = this.p;
                nldVar.n = true;
                if (nldVar.l) {
                    nldVar.c();
                }
            }
        }
    }

    @Override // defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        if (!this.r) {
            this.r = true;
            Window window = requireActivity().getWindow();
            l5b l5bVar = q9n.c;
            window.getDecorView().setSystemUiVisibility(0);
        }
        this.g.b(this.n);
        this.m.n.c(this.n);
        ((tjg) this.n.b).j(this.l);
        ((h7f) ((uuj) this.n.g).b).c(this.j);
        gig gigVar = (gig) ((ode) this.n.c).g();
        if (gigVar != null) {
            gigVar.g0(this.f);
        }
        this.l = null;
        this.n = null;
        this.o = null;
        ((HashSet) this.i.b).clear();
        this.p = null;
        this.m = null;
        this.q = null;
    }

    public final void onPause() {
        super/*androidx.fragment.app.Fragment*/.onPause();
        WindowManager.LayoutParams attributes = requireActivity().getWindow().getAttributes();
        float f = attributes.screenBrightness;
        if (f != -1.0f) {
            this.u = f;
            attributes.screenBrightness = -1.0f;
            requireActivity().getWindow().setAttributes(attributes);
        }
        PlayerContainerView playerContainerView = this.m.n;
        yn4 yn4Var = this.k;
        yn4Var.c.c(playerContainerView);
        if (yn4Var.j != null) {
            playerContainerView.e(null);
        }
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        super/*androidx.fragment.app.Fragment*/.onPictureInPictureModeChanged(z);
        gig gigVar = (gig) ((ode) this.n.c).g();
        this.q.l((pod) this.n.d, z, gigVar != null && gigVar.e0());
    }

    public final void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (!this.r) {
            Window window = requireActivity().getWindow();
            l5b l5bVar = q9n.c;
            window.getDecorView().setSystemUiVisibility(5638);
        }
        if (this.u != -1.0f) {
            WindowManager.LayoutParams attributes = requireActivity().getWindow().getAttributes();
            attributes.screenBrightness = this.u;
            this.u = -1.0f;
            requireActivity().getWindow().setAttributes(attributes);
        }
        PlayerContainerView playerContainerView = this.m.n;
        yn4 yn4Var = this.k;
        yn4Var.c.b(playerContainerView);
        CastSession castSession = yn4Var.j;
        if (castSession != null) {
            playerContainerView.e(castSession);
        }
    }
}
