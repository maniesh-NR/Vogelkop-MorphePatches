package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import defpackage.ab5;
import defpackage.bz0;
import defpackage.cod;
import defpackage.dod;
import defpackage.lmd;
import defpackage.o0g;
import defpackage.smd;
import defpackage.tmd;
import defpackage.umd;
import defpackage.vmd;
import defpackage.vnd;
import defpackage.wmd;
import defpackage.wxe;
import defpackage.xuf;
import defpackage.z8b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class d extends bz0 {
    public static final /* synthetic */ int q0 = 0;
    public final boolean A;
    public LinearLayout B;
    public RelativeLayout C;
    public LinearLayout D;
    public View E;
    public OverlayListView F;
    public c G;
    public ArrayList H;
    public HashSet I;
    public HashSet J;
    public HashSet K;
    public SeekBar L;
    public xmd M;
    public cod N;
    public int O;
    public int P;
    public int Q;
    public final int R;
    public HashMap S;
    public z8b T;
    public final wmd U;
    public PlaybackStateCompat V;
    public MediaDescriptionCompat W;
    public vmd X;
    public Bitmap Y;
    public Uri Z;
    public boolean a0;
    public Bitmap b0;
    public int c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public final dod h;
    public boolean h0;
    public final lmd i;
    public int i0;
    public final cod j;
    public int j0;
    public final Context k;
    public int k0;
    public boolean l;
    public Interpolator l0;
    public boolean m;
    public final Interpolator m0;
    public int n;
    public final Interpolator n0;
    public Button o;
    public final AccessibilityManager o0;
    public Button p;
    public final vl9 p0;
    public ImageButton q;
    public MediaRouteExpandCollapseButton r;
    public FrameLayout s;
    public LinearLayout t;
    public FrameLayout u;
    public ImageView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public final boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context) {
        ContextThemeWrapper contextThemeWrapperY = o0g.y(context, 0, true);
        int iY = o0g.Y(2130970333, contextThemeWrapperY);
        super(contextThemeWrapperY, iY == 0 ? o0g.W(contextThemeWrapperY) : iY);
        this.z = true;
        this.p0 = new vl9(this, (byte) 14);
        Context context2 = getContext();
        this.k = context2;
        this.U = new wmd(this, (byte) 0);
        this.h = dod.d(context2);
        this.A = dod.h();
        this.i = new lmd(this, (byte) 2);
        this.j = dod.g();
        q(dod.e());
        this.R = context2.getResources().getDimensionPixelSize(2131166735);
        this.o0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.m0 = AnimationUtils.loadInterpolator(contextThemeWrapperY, 2131623953);
        this.n0 = AnimationUtils.loadInterpolator(contextThemeWrapperY, 2131623952);
    }

    public static void p(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void h(int i, View view) {
        tmd tmdVar = new tmd(view.getLayoutParams().height, i, view, (byte) 0);
        tmdVar.setDuration(this.i0);
        tmdVar.setInterpolator(this.l0);
        view.startAnimation(tmdVar);
    }

    public final boolean j() {
        return (this.W == null && this.V == null) ? false : true;
    }

    public final void k(boolean z) {
        OverlayListView overlayListView;
        HashSet hashSet;
        int firstVisiblePosition = this.F.getFirstVisiblePosition();
        int i = 0;
        while (true) {
            int childCount = this.F.getChildCount();
            overlayListView = this.F;
            if (i >= childCount) {
                break;
            }
            View childAt = overlayListView.getChildAt(i);
            cod codVar = (cod) this.G.getItem(firstVisiblePosition + i);
            if (!z || (hashSet = this.I) == null || !hashSet.contains(codVar)) {
                ((LinearLayout) childAt.findViewById(2131365036)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
            i++;
        }
        ArrayList arrayList = overlayListView.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            xuf xufVar = (xuf) obj;
            xufVar.j = true;
            xufVar.k = true;
            c5o c5oVar = xufVar.l;
            if (c5oVar != null) {
                d dVar = (d) c5oVar.b;
                dVar.K.remove((cod) c5oVar.a);
                dVar.G.notifyDataSetChanged();
            }
        }
        if (z) {
            return;
        }
        l(false);
    }

    public final void l(boolean z) {
        this.I = null;
        this.J = null;
        this.g0 = false;
        if (this.h0) {
            this.h0 = false;
            u(z);
        }
        this.F.setEnabled(true);
    }

    public final int m(int i, int i2) {
        float f;
        float f2;
        float f3 = this.n;
        if (i >= i2) {
            f = f3 * i2;
            f2 = i;
        } else {
            f = f3 * 9.0f;
            f2 = 16.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public final int n(boolean z) {
        if (!z && this.D.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.B.getPaddingBottom() + this.B.getPaddingTop();
        if (z) {
            paddingBottom += this.C.getMeasuredHeight();
        }
        if (this.D.getVisibility() == 0) {
            paddingBottom += this.D.getMeasuredHeight();
        }
        return (z && this.D.getVisibility() == 0) ? this.E.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean o() {
        cod codVar = this.j;
        return codVar.e() && Collections.unmodifiableList(codVar.v).size() > 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
        this.h.a(vnd.c, this.i, 2);
        q(dod.e());
    }

    @Override // defpackage.bz0, defpackage.zp1, defpackage.ce5, android.app.Dialog
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setContentView(2131559075);
        findViewById(R.id.button3).setVisibility(8);
        umd umdVar = new umd(this, (byte) 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(2131363597);
        this.s = frameLayout;
        frameLayout.setOnClickListener(new umd(this, (byte) 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131363595);
        this.t = linearLayout;
        linearLayout.setOnClickListener(new jy4((byte) 1));
        Context context = this.k;
        int iX = o0g.X(2130969303, context);
        if (ab5.e(iX, o0g.X(R.attr.colorBackground, context)) < 3.0d) {
            iX = o0g.X(2130969091, context);
        }
        Button button = (Button) findViewById(R.id.button2);
        this.o = button;
        button.setText(2132019836);
        this.o.setTextColor(iX);
        this.o.setOnClickListener(umdVar);
        Button button2 = (Button) findViewById(R.id.button1);
        this.p = button2;
        button2.setText(2132019843);
        this.p.setTextColor(iX);
        this.p.setOnClickListener(umdVar);
        this.y = (TextView) findViewById(2131363601);
        ((ImageButton) findViewById(2131363587)).setOnClickListener(umdVar);
        this.u = (FrameLayout) findViewById(2131363594);
        umd umdVar2 = new umd(this, (byte) 2);
        ImageView imageView = (ImageView) findViewById(2131363552);
        this.v = imageView;
        imageView.setOnClickListener(umdVar2);
        findViewById(2131363592).setOnClickListener(umdVar2);
        this.B = (LinearLayout) findViewById(2131363600);
        this.E = findViewById(2131363588);
        this.C = (RelativeLayout) findViewById(2131363608);
        this.w = (TextView) findViewById(2131363591);
        this.x = (TextView) findViewById(2131363590);
        ImageButton imageButton = (ImageButton) findViewById(2131363589);
        this.q = imageButton;
        imageButton.setOnClickListener(umdVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(2131363610);
        this.D = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(2131363613);
        this.L = seekBar;
        cod codVar = this.j;
        seekBar.setTag(codVar);
        SeekBar.OnSeekBarChangeListener xmdVar = new xmd(this);
        this.M = xmdVar;
        this.L.setOnSeekBarChangeListener(xmdVar);
        this.F = (OverlayListView) findViewById(2131363611);
        this.H = new ArrayList();
        c cVar = new c(this, this.F.getContext(), this.H);
        this.G = cVar;
        this.F.setAdapter((ListAdapter) cVar);
        this.K = new HashSet();
        LinearLayout linearLayout3 = this.B;
        OverlayListView overlayListView = this.F;
        boolean zO = o();
        int iX2 = o0g.X(2130969303, context);
        int iX3 = o0g.X(2130969305, context);
        if (zO && o0g.R(context) == -570425344) {
            iX3 = iX2;
            iX2 = -1;
        }
        linearLayout3.setBackgroundColor(iX2);
        overlayListView.setBackgroundColor(iX3);
        linearLayout3.setTag(Integer.valueOf(iX2));
        overlayListView.setTag(Integer.valueOf(iX3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.L;
        LinearLayout linearLayout4 = this.B;
        int iR = o0g.R(context);
        if (Color.alpha(iR) != 255) {
            iR = ab5.h(iR, ((Integer) linearLayout4.getTag()).intValue());
        }
        if (mediaRouteVolumeSlider.e != iR) {
            mediaRouteVolumeSlider.e = iR;
        }
        if (mediaRouteVolumeSlider.f != iR) {
            mediaRouteVolumeSlider.f = iR;
        }
        HashMap map = new HashMap();
        this.S = map;
        map.put(codVar, this.L);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(2131363598);
        this.r = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.i = new umd(this, (byte) 3);
        this.l0 = this.f0 ? this.m0 : this.n0;
        this.i0 = context.getResources().getInteger(2131492937);
        this.j0 = context.getResources().getInteger(2131492938);
        this.k0 = context.getResources().getInteger(2131492939);
        this.l = true;
        t();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.h.j(this.i);
        q(null);
        this.m = false;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.bz0, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.A || !this.f0) {
            this.j.k(i == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // defpackage.bz0, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void q(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        PlaybackStateCompat playbackState;
        z8b z8bVar = this.T;
        wmd wmdVar = this.U;
        if (z8bVar != null) {
            z8bVar.N(wmdVar);
            this.T = null;
        }
        if (mediaSessionCompat$Token == null || !this.m) {
            return;
        }
        z8b z8bVar2 = new z8b(this.k, mediaSessionCompat$Token);
        this.T = z8bVar2;
        z8bVar2.L(wmdVar);
        MediaMetadata metadata = ((android.support.v4.media.session.a) this.T.a).a.getMetadata();
        if (metadata != null) {
            ArrayMap arrayMap = MediaMetadataCompat.d;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            mediaMetadataCompatCreateFromParcel.b = metadata;
        } else {
            mediaMetadataCompatCreateFromParcel = null;
        }
        this.W = mediaMetadataCompatCreateFromParcel == null ? null : mediaMetadataCompatCreateFromParcel.a();
        android.support.v4.media.session.a aVar = (android.support.v4.media.session.a) this.T.a;
        MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
        if (mediaSessionCompat$Token2.a() != null) {
            try {
                playbackState = mediaSessionCompat$Token2.a().getPlaybackState();
            } catch (RemoteException unused) {
            }
        } else {
            PlaybackState playbackState2 = aVar.a.getPlaybackState();
            playbackState = playbackState2 != null ? PlaybackStateCompat.a(playbackState2) : null;
        }
        this.V = playbackState;
        s();
        r(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(boolean r13) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.r(boolean):void");
    }

    public final void s() {
        Bitmap bitmap;
        Uri uri;
        Uri uri2;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.W;
        if (mediaDescriptionCompat == null) {
            uri = null;
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.e;
            uri = mediaDescriptionCompat.f;
        }
        vmd vmdVar = this.X;
        if (vmdVar == null) {
            bitmap2 = this.Y;
            uri2 = this.Z;
        } else {
            Bitmap bitmap3 = vmdVar.a;
            uri2 = vmdVar.b;
            bitmap2 = bitmap3;
        }
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri2 != null) {
                if (uri2.equals(uri)) {
                    return;
                }
            } else if (uri == null) {
                return;
            }
        }
        if (!o() || this.A) {
            vmd vmdVar2 = this.X;
            if (vmdVar2 != null) {
                vmdVar2.cancel(true);
            }
            vmd vmdVar3 = new vmd(this);
            this.X = vmdVar3;
            vmdVar3.execute(new Void[0]);
        }
    }

    public final void t() throws Resources.NotFoundException {
        Context context = this.k;
        int iB = wxe.B(context);
        getWindow().setLayout(iB, -2);
        View decorView = getWindow().getDecorView();
        this.n = (iB - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.O = resources.getDimensionPixelSize(2131166733);
        this.P = resources.getDimensionPixelSize(2131166732);
        this.Q = resources.getDimensionPixelSize(2131166734);
        this.Y = null;
        this.Z = null;
        s();
        r(false);
    }

    public final void u(boolean z) {
        this.u.requestLayout();
        this.u.getViewTreeObserver().addOnGlobalLayoutListener(new smd(this, z));
    }

    public final void v(boolean z) {
        int i = 0;
        this.E.setVisibility((this.D.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.B;
        if (this.D.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }
}
