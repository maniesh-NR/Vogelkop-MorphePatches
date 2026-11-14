package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.ads.interactivemedia.v3.impl.ImaSdkSettingsImpl;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.internal.zzpw;
import com.google.ads.interactivemedia.v3.internal.zzsx;
import com.opera.ad.view.VolumeMutableButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class nxo {
    public static final t72 t;
    public final FrameLayout a;
    public final ix5 b;
    public final rwo c;
    public final ujo d;
    public final ArrayList e;
    public final ArrayList f;
    public fzo g;
    public ha6 h;
    public xup i;
    public FrameLayout j;
    public Object k;
    public bm l;
    public int m;
    public int n;
    public String o;
    public boolean p;
    public WeakReference q;
    public boolean r;
    public VolumeMutableButton s;

    static {
        List listAsList = Arrays.asList(vim.a, vim.b);
        t72 t72Var = new t72(0);
        if (listAsList != null) {
            t72Var.addAll(listAsList);
        }
        t = t72Var;
    }

    public nxo(Context context, boolean z) {
        ArrayList arrayList = new ArrayList(1);
        this.e = arrayList;
        this.f = new ArrayList();
        int[] iArr = z4o.q;
        int i = 0;
        this.m = iArr[0];
        this.n = iArr[1];
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        ix5 ix5Var = ix5.b;
        if (ix5Var == null) {
            ix5Var = new ix5((byte) 13);
            ix5.b = ix5Var;
        }
        this.b = ix5Var;
        ImaSdkSettingsImpl imaSdkSettingsImpl = new ImaSdkSettingsImpl();
        imaSdkSettingsImpl.setAutoPlayAdBreaks(false);
        imaSdkSettingsImpl.setMaxRedirects(5);
        rwo rwoVar = new rwo(this);
        this.c = rwoVar;
        ujo ujoVar = new ujo(context, new kvo(this));
        this.d = ujoVar;
        t9l t9lVar = new t9l();
        n9h n9hVar = new n9h((byte) 15);
        t9lVar.d = n9hVar;
        t9lVar.b = ujoVar;
        ujoVar.d = n9hVar;
        drp drpVar = new drp(frameLayout, t9lVar);
        ha6 ha6Var = new ha6(new mbi(this, context), imaSdkSettingsImpl.isDebugMode() ? lpp.b : lpp.a, imaSdkSettingsImpl, drpVar, Executors.newCachedThreadPool());
        wpp wppVar = (wpp) ha6Var.c;
        wppVar.getClass();
        wppVar.r = SystemClock.elapsedRealtime();
        ((WebView) wppVar.i.a).loadUrl(wppVar.h);
        wppVar.o.getTask().addOnCompleteListener((zzsx) ha6Var.o, new bxk((Object) ha6Var, (byte) 22));
        this.h = ha6Var;
        ((ArrayList) ((n9h) ha6Var.e).b).add(rwoVar);
        ((ArrayList) this.h.f).add(rwoVar);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            linearLayout.setOnHierarchyChangeListener(new wvo());
            yop yopVar = new yop();
            yopVar.c = linearLayout;
            yopVar.a = (short) 300;
            yopVar.b = (short) 250;
            arrayList.add(yopVar);
            zzpw zzpwVar = new zzpw();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                yop yopVar2 = (yop) obj;
                if (yopVar2 != null) {
                    int i2 = drp.f;
                    drp.f = i2 + 1;
                    zzpwVar.a("compSlot_" + i2, yopVar2);
                }
            }
            drpVar.b = zzpwVar.b();
        }
    }

    public final void a(Context context) {
        wm wmVar;
        xup xupVar = this.i;
        if (xupVar != null) {
            xupVar.g(JavaScriptMessage$MsgType.click);
        }
        fzo fzoVar = this.g;
        if (fzoVar != null && (wmVar = (wm) fzoVar.a) != null) {
            wmVar.onAdClicked();
        }
        if (TextUtils.isEmpty(this.o)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.o));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final void b(final FrameLayout frameLayout, LinearLayout linearLayout) {
        if (d()) {
            final bno bnoVar = new bno(this, (byte) 1);
            final TextureView textureView = new TextureView(frameLayout.getContext());
            textureView.addOnAttachStateChangeListener(bnoVar);
            nwo nwoVar = new nwo() { // from class: hvo
                @Override // defpackage.nwo
                public final void a() {
                    final nxo nxoVar = this.a;
                    ujo ujoVar = nxoVar.d;
                    TextureView textureView2 = textureView;
                    textureView2.removeOnAttachStateChangeListener(bnoVar);
                    if (textureView2.getParent() == null || ujoVar.e == null) {
                        nxoVar.j.removeAllViews();
                        final byte b = 1;
                        nxoVar.j.setOnClickListener(new View.OnClickListener() { // from class: mvo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b2 = b;
                                nxo nxoVar2 = nxoVar;
                                nxoVar2.getClass();
                                switch (b2) {
                                    case 0:
                                        nxoVar2.a(view.getContext());
                                        break;
                                    default:
                                        nxoVar2.a(view.getContext());
                                        break;
                                }
                            }
                        });
                    } else {
                        FrameLayout frameLayout2 = frameLayout;
                        ImageView imageView = new ImageView(frameLayout2.getContext());
                        imageView.setImageBitmap(ujoVar.e);
                        final byte b2 = 0;
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: mvo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b22 = b2;
                                nxo nxoVar2 = nxoVar;
                                nxoVar2.getClass();
                                switch (b22) {
                                    case 0:
                                        nxoVar2.a(view.getContext());
                                        break;
                                    default:
                                        nxoVar2.a(view.getContext());
                                        break;
                                }
                            }
                        });
                        frameLayout2.addView(imageView);
                    }
                }
            };
            ArrayList arrayList = this.f;
            arrayList.add(nwoVar);
            View view = this.a;
            upj.j(view);
            ujo ujoVar = this.d;
            ujoVar.f = textureView;
            ujoVar.a.setVideoTextureView(textureView);
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
            frameLayout.addView(textureView, layoutParams);
            frameLayout.addView(view, layoutParams);
            boolean z = ujoVar.b;
            if (this.s == null) {
                this.s = new VolumeMutableButton(frameLayout.getContext(), null);
                int i = (int) ((frameLayout.getContext().getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
                int i2 = i / 2;
                layoutParams2.setMarginEnd(i2);
                layoutParams2.bottomMargin = i2 / 2;
                layoutParams2.gravity = 8388693;
                this.s.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.s.setBackgroundResource(2131231172);
                frameLayout.addView(this.s, layoutParams2);
                VolumeMutableButton volumeMutableButton = this.s;
                kvo kvoVar = new kvo(this);
                volumeMutableButton.c = z;
                volumeMutableButton.d = kvoVar;
                volumeMutableButton.setImageDrawable(z ? volumeMutableButton.a : volumeMutableButton.b);
                arrayList.add(new nwo() { // from class: lvo
                    @Override // defpackage.nwo
                    public final void a() {
                        this.a.s.setVisibility(8);
                    }
                });
            }
            ArrayList arrayList2 = this.e;
            yop yopVar = arrayList2.size() >= 1 ? (yop) arrayList2.get(0) : null;
            if (yopVar != null && linearLayout != null) {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) ((frameLayout.getContext().getResources().getDisplayMetrics().density * yopVar.b) + 0.5f));
                layoutParams3.gravity = 17;
                linearLayout.addView(yopVar.c, layoutParams3);
            }
            this.j = frameLayout;
        }
    }

    public final void c(fzo fzoVar) {
        dn dnVar;
        if (this.g == null) {
            this.g = fzoVar;
            if (d()) {
                dn dnVar2 = (dn) this.g.b;
                if (dnVar2 != null) {
                    dnVar2.i();
                    return;
                }
                return;
            }
            bm bmVar = this.l;
            if ((bmVar == bm.VAST_FAILED_TO_DOWNLOAD_VIDEO || bmVar == bm.d) && (dnVar = (dn) this.g.b) != null) {
                dnVar.p(bmVar);
            }
        }
    }

    public final boolean d() {
        return this.k == null && this.i != null;
    }

    public final void e() {
        if (!d() || this.p) {
            return;
        }
        ujo ujoVar = this.d;
        if (ujoVar.b) {
            return;
        }
        ujoVar.a.setVolume(0.0f);
        ujoVar.b = true;
        n9h n9hVar = ujoVar.d;
        if (n9hVar != null) {
            n9hVar.c(0);
        }
    }

    public final void f() {
        if (this.r || !d() || this.p) {
            return;
        }
        this.i.g(JavaScriptMessage$MsgType.pause);
        this.r = true;
    }

    public final void g() {
        if (!d() || this.p) {
            return;
        }
        this.i.g(JavaScriptMessage$MsgType.resume);
        this.r = false;
    }

    public final void h() {
        if (!d() || this.p) {
            return;
        }
        ujo ujoVar = this.d;
        if (ujoVar.b) {
            ujoVar.a.setVolume(1.0f);
            ujoVar.b = false;
            n9h n9hVar = ujoVar.d;
            if (n9hVar != null) {
                n9hVar.c(100);
            }
        }
    }
}
