package com.opera.android.media;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.DisplayCutout;
import android.view.View;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerView;
import com.opera.android.OperaApplication;
import defpackage.hjf;
import defpackage.mdb;
import defpackage.p92;
import defpackage.q9n;
import defpackage.rkd;
import defpackage.sjg;
import defpackage.skd;
import defpackage.tjg;
import defpackage.tkd;
import defpackage.ukd;
import defpackage.wld;
import defpackage.xbf;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MediaPlayerActivity extends hjf {
    public static final /* synthetic */ int t = 0;
    public sjg m;
    public PlayerView n;
    public PlayerContainerView o;
    public xbf p;
    public wld q;
    public boolean r;
    public final Rect j = new Rect();
    public final skd k = new skd(this);
    public final tkd l = new tkd(this, 0);
    public boolean s = true;

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        Bundle extras;
        if (this.r || !a26.m0(this)) {
            this.s = false;
            Intent intentB = mdb.b(this);
            intentB.setAction("com.opera.android.action.SHOW_MEDIA_PLAYER_FROM_PIP");
            startActivity(intentB);
            overridePendingTransition(0, 0);
            finishAndRemoveTask();
            return;
        }
        Rect rectD = this.o.d();
        if (rectD != null) {
            Intent intent = getIntent();
            a26.D(this, new Size(rectD.width(), rectD.height()), (intent == null || (extras = intent.getExtras()) == null) ? null : (Rect) extras.getParcelable("sourceBounds"));
        } else if (Build.VERSION.SDK_INT < 30) {
            q9n.d(new rkd(this, (byte) 1), this.n);
        }
    }

    public final void G() {
        Rect rectD = this.o.d();
        if (rectD == null) {
            return;
        }
        if (rectD.width() != 0 && rectD.height() != 0) {
            a26.k0(this, new Size(rectD.width(), rectD.height()));
        } else {
            q9n.d(new rkd(this, (byte) 2), this.o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        int safeInsetTop;
        int i;
        int i2;
        int safeInsetLeft;
        Bundle extras;
        boolean zIsInPictureInPictureMode = isInPictureInPictureMode();
        Intent intent = getIntent();
        Rect rect = (intent == null || (extras = intent.getExtras()) == null) ? null : (Rect) extras.getParcelable("sourceBounds");
        Rect rect2 = this.j;
        if (rect != null && !zIsInPictureInPictureMode) {
            View decorView = getWindow().getDecorView();
            WeakHashMap weakHashMap = r5n.a;
            g3o g3oVarA = i5n.a(decorView);
            if (g3oVarA != null) {
                d3o d3oVar = g3oVarA.a;
                i2 = d3oVar.i(519).a;
                i = d3oVar.i(519).b;
                jb7 jb7VarH = d3oVar.h();
                if (jb7VarH != null) {
                    DisplayCutout displayCutout = jb7VarH.a;
                    safeInsetLeft = displayCutout.getSafeInsetLeft();
                    safeInsetTop = displayCutout.getSafeInsetTop();
                } else {
                    safeInsetTop = 0;
                    safeInsetLeft = 0;
                }
            } else {
                safeInsetTop = 0;
                i = 0;
                i2 = 0;
                safeInsetLeft = 0;
            }
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            rect2.left = Math.max(0, rect.left - i2);
            rect2.top = Math.max(0, rect.top - i);
            rect2.right = Math.max(0, (displayMetrics.widthPixels + safeInsetLeft) - rect.right);
            rect2.bottom = Math.max(0, (displayMetrics.heightPixels + safeInsetTop) - rect.bottom);
        }
        PlayerContainerView playerContainerView = this.o;
        if (zIsInPictureInPictureMode) {
            q9n.D(playerContainerView, 0, 0, 0, 0);
        } else {
            q9n.D(playerContainerView, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131559041);
        String[] strArr = OperaApplication.K;
        ((OperaApplication) getApplication()).B().b(findViewById(2131364107));
        PlayerView playerViewFindViewById = findViewById(2131363911);
        this.n = playerViewFindViewById;
        this.m = new sjg(5, playerViewFindViewById);
        playerViewFindViewById.e();
        PlayerContainerView playerContainerView = (PlayerContainerView) findViewById(2131363909);
        this.o = playerContainerView;
        playerContainerView.f = new p92(true, 0.0f, getResources().getDimensionPixelSize(2131166672), 1, false);
        playerContainerView.a();
        PlayerView playerView = this.n;
        rkd rkdVar = new rkd(this, (byte) 0);
        AspectRatioFrameLayout aspectRatioFrameLayout = playerView.b;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.b = rkdVar;
        xbf xbfVar = ((OperaApplication) getApplication()).x().o;
        this.p = xbfVar;
        ((tjg) xbfVar.b).b(this.m, true);
        ((tjg) this.p.b).F(this.k);
        this.o.b(this.p);
        gig gigVar = (gig) ((ode) this.p.c).g();
        if (gigVar != null) {
            gigVar.S(this.l);
        }
        this.q = (wld) ((OperaApplication) getApplication()).r.b0.get();
        F();
    }

    @Override // defpackage.hjf
    public final void onDestroy() {
        super.onDestroy();
        this.o.c(this.p);
        ((tjg) this.p.b).H(this.k);
        ((tjg) this.p.b).j(this.m);
        gig gigVar = (gig) ((ode) this.p.c).g();
        if (gigVar != null) {
            gigVar.g0(this.l);
        }
        this.m = null;
        this.p = null;
        this.q = null;
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        super/*xd5*/.onPictureInPictureModeChanged(z);
        PlayerContainerView playerContainerView = this.o;
        if (z) {
            q9n.D(playerContainerView, 0, 0, 0, 0);
        } else {
            Rect rect = this.j;
            q9n.D(playerContainerView, rect.left, rect.top, rect.right, rect.bottom);
            this.r = true;
            if ("HUAWEI".equalsIgnoreCase(Build.BRAND)) {
                new ukd(this, getLifecycle());
            }
        }
        gig gigVar = (gig) ((ode) this.p.c).g();
        this.q.l((pod) this.p.d, z, gigVar != null && gigVar.e0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*androidx.fragment.app.r*/.onResume();
        if (this.r) {
            this.s = false;
            Intent intentB = mdb.b(this);
            intentB.setAction("com.opera.android.action.SHOW_MEDIA_PLAYER_FROM_PIP");
            startActivity(intentB);
            overridePendingTransition(0, 0);
            finishAndRemoveTask();
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.s) {
            ((gig) ((ode) this.p.c).g()).pause();
            this.q.n((pod) this.p.d);
        }
        gig gigVar = (gig) ((ode) this.p.c).g();
        this.q.l((pod) this.p.d, false, gigVar != null && gigVar.e0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public final int w() {
        String[] strArr = OperaApplication.K;
        return qbe.z(((OperaApplication) getApplication()).J().g(), true, false, true);
    }
}
