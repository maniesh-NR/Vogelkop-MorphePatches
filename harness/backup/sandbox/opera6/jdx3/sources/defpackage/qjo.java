package defpackage;

import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.opera.ad.interstitial.AdActivity;
import com.opera.ad.view.VolumeMutableButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qjo extends n1 {
    public ViewGroup c;
    public oji d;
    public jvg e;
    public final /* synthetic */ byte f;
    public final k8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qjo(AdActivity adActivity, k8 k8Var, byte b) {
        super(adActivity, (byte) 1);
        this.f = b;
        this.g = k8Var;
    }

    public final void H0(int i, uuj uujVar) {
        int i2;
        AdActivity adActivity = (AdActivity) this.b;
        adActivity.setContentView(2131558465);
        ViewStub viewStub = (ViewStub) adActivity.findViewById(2131361911);
        try {
            viewStub.setLayoutResource(i);
            this.c = (ViewGroup) viewStub.inflate();
        } catch (Exception unused) {
        }
        int i3 = lto.a[((ahb) uujVar.b).ordinal()];
        if (i3 == 1) {
            i2 = 2131364482;
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    i2 = 2131364566;
                }
                this.d = uujVar.d(adActivity, new dgo(this, (byte) 6));
            }
            i2 = 2131364103;
        }
        uujVar.a = i2;
        this.d = uujVar.d(adActivity, new dgo(this, (byte) 6));
    }

    public final void I0(p12 p12Var) {
        ImageView imageView = (ImageView) ((AdActivity) this.b).findViewById(2131361908);
        if (this.e == null) {
            this.e = new jvg((byte) 15);
        }
        imageView.setVisibility(0);
        imageView.setOnClickListener(new obn(this, p12Var, (byte) 17));
    }

    @Override // defpackage.n1
    public final void R() throws PackageManager.NameNotFoundException {
        byte b = this.f;
        k8 k8Var = this.g;
        switch (b) {
            case 0:
                joo jooVar = (joo) k8Var;
                AdActivity adActivity = (AdActivity) this.b;
                ((dzo) jooVar.o.p.a).b = new WeakReference(adActivity);
                H0(2131558464, (uuj) jooVar.a);
                p12 p12Var = (p12) jooVar.b;
                if (p12Var != null) {
                    I0(p12Var);
                }
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    try {
                        viewGroup.addView(jooVar.s0(adActivity), new RelativeLayout.LayoutParams(-1, -1));
                        break;
                    } catch (zno unused) {
                        adActivity.finish();
                        return;
                    }
                }
                break;
            case 1:
                lro lroVar = (lro) k8Var;
                H0(lroVar.p, (uuj) lroVar.a);
                p12 p12Var2 = (p12) lroVar.b;
                if (p12Var2 != null) {
                    I0(p12Var2);
                }
                lroVar.t0((AdActivity) this.b);
                break;
            default:
                AdActivity adActivity2 = (AdActivity) this.b;
                koo kooVar = (koo) k8Var;
                nxo nxoVar = kooVar.o;
                if (!nxoVar.d()) {
                    adActivity2.finish();
                    break;
                } else {
                    uuj uujVar = (uuj) kooVar.a;
                    if (((ahb) uujVar.b) == ahb.c) {
                        uujVar.b = ahb.b;
                    }
                    H0(2131558471, uujVar);
                    nxoVar.q = new WeakReference(adActivity2);
                    LinearLayout linearLayout = (LinearLayout) this.c;
                    if (linearLayout != null) {
                        p5g p5gVar = new p5g(adActivity2, nxoVar);
                        linearLayout.addView(p5gVar);
                        nxoVar.b(p5gVar, linearLayout);
                        VolumeMutableButton volumeMutableButton = (VolumeMutableButton) adActivity2.findViewById(2131362239);
                        volumeMutableButton.setVisibility(0);
                        volumeMutableButton.c = true;
                        volumeMutableButton.d = kooVar;
                        volumeMutableButton.setImageDrawable(volumeMutableButton.a);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.n1
    public final void X() {
        byte b = this.f;
        k8 k8Var = this.g;
        switch (b) {
            case 0:
                lxo lxoVar = ((joo) k8Var).o;
                lxoVar.getClass();
                lxoVar.unregister();
                y9p y9pVar = lxoVar.r;
                if (y9pVar != null) {
                    y9pVar.o();
                    lxoVar.r = null;
                    break;
                }
                break;
            case 1:
                noo nooVar = ((lro) k8Var).v;
                if (nooVar != null) {
                    nooVar.a();
                    break;
                }
                break;
            default:
                nxo nxoVar = ((koo) k8Var).o;
                rwo rwoVar = nxoVar.c;
                nxoVar.k = null;
                ujo ujoVar = nxoVar.d;
                ujoVar.c = (short) 2;
                ujoVar.a.release();
                ujoVar.f = null;
                ujoVar.e = null;
                xup xupVar = nxoVar.i;
                if (xupVar != null) {
                    ((ArrayList) xupVar.d.b).remove(rwoVar);
                    nxoVar.i.c.remove(rwoVar);
                    nxoVar.i.b();
                    nxoVar.i = null;
                }
                ha6 ha6Var = nxoVar.h;
                if (ha6Var != null) {
                    ((ArrayList) ((n9h) ha6Var.e).b).remove(rwoVar);
                    ((ArrayList) nxoVar.h.f).remove(rwoVar);
                    nxoVar.h = null;
                }
                FrameLayout frameLayout = nxoVar.j;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    nxoVar.j = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.n1
    public final void c0() {
        byte b = this.f;
        k8 k8Var = this.g;
        switch (b) {
            case 0:
                oji ojiVar = this.d;
                if (ojiVar != null) {
                    gxo.d.removeCallbacks((ttn) ((bx7) ojiVar.a).b);
                }
                dzo dzoVar = (dzo) ((joo) k8Var).o.p.a;
                nyo nyoVar = dzoVar.c;
                if (!dzoVar.f) {
                    nyoVar.getSettings().setJavaScriptEnabled(false);
                    nyoVar.onPause();
                    dzoVar.f = true;
                    break;
                }
                break;
            case 1:
                oji ojiVar2 = this.d;
                if (ojiVar2 != null) {
                    gxo.d.removeCallbacks((ttn) ((bx7) ojiVar2.a).b);
                    break;
                }
                break;
            default:
                oji ojiVar3 = this.d;
                if (ojiVar3 != null) {
                    gxo.d.removeCallbacks((ttn) ((bx7) ojiVar3.a).b);
                }
                ((koo) k8Var).o.f();
                break;
        }
    }

    @Override // defpackage.n1
    public final void e0() {
        byte b = this.f;
        k8 k8Var = this.g;
        switch (b) {
            case 0:
                oji ojiVar = this.d;
                if (ojiVar != null) {
                    ((bx7) ojiVar.a).c();
                }
                ((joo) k8Var).o.p.i();
                break;
            case 1:
                oji ojiVar2 = this.d;
                if (ojiVar2 != null) {
                    ((bx7) ojiVar2.a).c();
                    break;
                }
                break;
            default:
                oji ojiVar3 = this.d;
                if (ojiVar3 != null) {
                    ((bx7) ojiVar3.a).c();
                }
                ((koo) k8Var).o.g();
                break;
        }
    }
}
