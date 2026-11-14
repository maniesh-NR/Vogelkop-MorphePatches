package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class t8p extends aoo {
    public static boolean J;
    public i8p A;
    public int B;
    public final int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final g2p I;
    public euo u;
    public ImageView v;
    public ImageButton w;
    public final wtm x;
    public String y;
    public xho z;

    public t8p(Context context) {
        super(context, null);
        this.B = z1m.b;
        this.I = new g2p(this, (byte) 1);
        this.x = new wtm();
        this.C = xvg.d(this.a);
    }

    @Override // defpackage.aoo
    public final void i(View view) {
        super.i(view);
        this.F = true;
        g2p g2pVar = this.I;
        ami amiVar = this.c;
        amiVar.b(this, g2pVar);
        View view2 = this.j;
        if (view2 == null) {
            view2 = this;
        }
        amiVar.b(view2, new g8p(this, view2));
    }

    @Override // defpackage.aoo
    public final View k() {
        Context context = this.a;
        euo euoVar = new euo(context, null);
        euoVar.a = 0;
        euoVar.b = (byte) 10;
        euoVar.I = 3;
        euoVar.s = 0.0f;
        euoVar.t = true;
        euoVar.C = new z4k((Object) euoVar, (byte) 19);
        euoVar.D = new h9o((byte) 17);
        euoVar.E = new rii((Object) euoVar, (byte) 26);
        euoVar.F = new uto(euoVar, (byte) 0);
        euoVar.G = new tvk(euoVar);
        euoVar.H = new ioj(euoVar, (byte) 13);
        euoVar.c = context;
        FrameLayout frameLayout = new FrameLayout(context);
        euoVar.f = frameLayout;
        frameLayout.setBackgroundColor(-2631461);
        euoVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        this.u = euoVar;
        addView(this.u, new FrameLayout.LayoutParams(-1, -1));
        return this.u;
    }

    @Override // defpackage.aoo
    public final void l(w06 w06Var) {
        super.l(w06Var);
        euo euoVar = this.u;
        wtm wtmVar = this.x;
        euoVar.l = wtmVar;
        euoVar.m = this;
        wtmVar.a = this.h;
        wtmVar.b = euoVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        i8p i8pVar = new i8p(this);
        this.A = i8pVar;
        this.a.registerReceiver(i8pVar, intentFilter);
    }

    @Override // defpackage.aoo
    public final void m() {
        this.c.b(this, this.I);
    }

    @Override // defpackage.aoo
    public final void n() throws IllegalStateException {
        w(4);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) throws IllegalStateException {
        super.onVisibilityChanged(view, i);
        w(i);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) throws IllegalStateException {
        super.onWindowVisibilityChanged(i);
        w(i);
    }

    @Override // defpackage.aoo
    public final void p() {
        if (this.u.i() && !this.E) {
            this.E = true;
            return;
        }
        this.c.a(this);
        euo euoVar = this.u;
        FrameLayout frameLayout = euoVar.f;
        if (euoVar.i()) {
            euoVar.h();
        }
        byte b = euoVar.b;
        if (b == 12 && b == 12) {
            upj.j(frameLayout);
            euoVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            euoVar.b = (byte) 10;
        }
        euoVar.b = (byte) 10;
        euoVar.f();
        AudioManager audioManager = euoVar.d;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(null);
            euoVar.d = null;
        }
        qoo qooVar = euoVar.e;
        if (qooVar != null) {
            qooVar.f.release();
            qooVar.a = null;
            qooVar.b = null;
            qooVar.c = null;
            qooVar.d = null;
            qooVar.e = null;
            qooVar.a();
            euoVar.e = null;
        }
        frameLayout.removeView(euoVar.g);
        Surface surface = euoVar.i;
        if (surface != null) {
            surface.release();
            euoVar.i = null;
        }
        SurfaceTexture surfaceTexture = euoVar.h;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            euoVar.h = null;
        }
        euoVar.a = 0;
        ImageView imageView = this.v;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        i8p i8pVar = this.A;
        if (i8pVar != null) {
            this.a.unregisterReceiver(i8pVar);
            this.A = null;
        }
        sc scVar = this.o;
        if (scVar != null) {
            scVar.a();
        }
    }

    @Override // defpackage.aoo
    public final void q(View view) {
        if (this.H) {
            this.c.a(this);
            if (this.u.i()) {
                this.u.h();
            }
            j(view);
        }
    }

    public final void w(int i) throws IllegalStateException {
        ami amiVar = this.c;
        if (i == 0) {
            if (this.F) {
                amiVar.b(this, this.I);
            }
        } else {
            euo euoVar = this.u;
            if (euoVar.a == 3) {
                euoVar.a();
                amiVar.a(this);
            }
        }
    }

    public final void x(boolean z) {
        int i;
        byte b = 1;
        if (!z && (i = this.B) != 3) {
            if (i != 1) {
                return;
            }
            int i2 = this.C;
            if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                return;
            }
        }
        if (this.w == null) {
            ImageButton imageButton = new ImageButton(getContext());
            this.w = imageButton;
            imageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.w.setImageDrawable(bbp.VIDEO_PLAY_TRANSPARENT.d(getContext()));
            this.w.setBackgroundColor(0);
            this.w.setOnClickListener(new a8p(this, b));
        }
        upj.j(this.w);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.w, layoutParams);
        this.w.post(new ttn((Object) this, (byte) 24));
        sc scVar = this.o;
        if (scVar != null) {
            scVar.d(this.w, pp9.a, "play button");
        }
    }

    public final void y() {
        xho xhoVar;
        if (this.v == null) {
            ImageView imageView = new ImageView(getContext());
            this.v = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (TextUtils.isEmpty(this.y) && (xhoVar = this.z) != null && xhoVar.a()) {
                Bitmap bitmapB = dbh.b(1000000L, this.z.s);
                if (bitmapB != null) {
                    this.v.setImageBitmap(bitmapB);
                }
            } else if (!TextUtils.isEmpty(this.y)) {
                fip.b(this.v.getContext(), this.y, new smo(this, (byte) 1));
            }
        }
        upj.j(this.v);
        addView(this.v, new FrameLayout.LayoutParams(-1, -1));
        sc scVar = this.o;
        if (scVar != null) {
            scVar.d(this.v, pp9.a, "cover image");
        }
    }
}
