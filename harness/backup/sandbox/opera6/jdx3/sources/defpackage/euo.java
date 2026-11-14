package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class euo extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final /* synthetic */ int J = 0;
    public int A;
    public boolean B;
    public z4k C;
    public h9o D;
    public rii E;
    public uto F;
    public tvk G;
    public ioj H;
    public int I;
    public int a;
    public byte b;
    public Context c;
    public AudioManager d;
    public qoo e;
    public FrameLayout f;
    public TextureView g;
    public SurfaceTexture h;
    public Surface i;
    public Timer j;
    public u71 k;
    public wtm l;
    public t8p m;
    public ImageButton n;
    public ImageButton o;
    public ImageButton p;
    public ImageButton q;
    public String r;
    public float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public final void a() throws IllegalStateException {
        qoo qooVar = this.e;
        if (qooVar != null) {
            if (this.a == 3) {
                qooVar.f.pause();
                this.a = 4;
                f();
                this.l.a(21);
            }
            if (this.a == 5) {
                this.e.f.pause();
                this.a = 6;
                f();
                this.l.a(21);
            }
        }
    }

    public final void b() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        qoo qooVar = this.e;
        if (qooVar != null) {
            MediaPlayer mediaPlayer = qooVar.f;
            int i = this.a;
            if (i == 4) {
                mediaPlayer.start();
                this.a = 3;
                d();
                return;
            }
            if (i == 6) {
                mediaPlayer.start();
                this.a = 5;
                d();
                return;
            }
            if (i == 7 || i == -1) {
                try {
                    mediaPlayer.reset();
                } catch (IllegalStateException unused) {
                }
                qooVar.a = null;
                qooVar.b = null;
                qooVar.c = null;
                qooVar.d = null;
                qooVar.e = null;
                qooVar.a();
                j();
                this.x = false;
                this.z = false;
                this.y = false;
                this.w = false;
                this.v = false;
                this.u = false;
            }
        }
    }

    public final void c() {
        Context context = this.c;
        FrameLayout frameLayout = this.f;
        if (this.a == 0) {
            byte b = 1;
            if (this.d == null) {
                AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
                this.d = audioManager;
                if (audioManager != null) {
                    audioManager.requestAudioFocus(null, 3, 1);
                }
            }
            if (this.e == null) {
                qoo qooVar = new qoo();
                this.e = qooVar;
                qooVar.f.setAudioStreamType(3);
            }
            if (this.g == null) {
                TextureView textureView = new TextureView(context);
                this.g = textureView;
                textureView.setSurfaceTextureListener(this);
            }
            upj.j(this.g);
            byte b2 = 0;
            if (this.g != null) {
                frameLayout.addView(this.g, 0, new FrameLayout.LayoutParams(-1, -1, 17));
            }
            if (this.o == null) {
                ImageButton imageButton = new ImageButton(context);
                this.o = imageButton;
                imageButton.setBackgroundColor(0);
                this.o.setImageDrawable(sgb.F(2131232994, context));
                this.o.setOnClickListener(new cto(this, b2));
                this.o.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            upj.j(this.o);
            int iApplyDimension = (int) TypedValue.applyDimension(1, 50.0f, getResources().getDisplayMetrics());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iApplyDimension, iApplyDimension);
            layoutParams.gravity = 8388693;
            frameLayout.addView(this.o, layoutParams);
            if (this.q == null) {
                ImageButton imageButton2 = new ImageButton(context);
                this.q = imageButton2;
                imageButton2.setBackgroundColor(0);
                this.q.setImageDrawable(bbp.VIDEO_PAUSE.d(context));
                this.q.setOnClickListener(new cto(this, b));
                this.q.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            upj.j(this.q);
            int iApplyDimension2 = (int) TypedValue.applyDimension(1, 50.0f, getResources().getDisplayMetrics());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iApplyDimension2, iApplyDimension2);
            layoutParams2.gravity = 8388691;
            frameLayout.addView(this.q, layoutParams2);
            g(frameLayout);
            e(this.s);
        }
    }

    public final void d() {
        f();
        if (this.j == null) {
            this.j = new Timer();
        }
        u71 u71Var = this.k;
        if (u71Var == null) {
            u71Var = new u71(this, (byte) 2);
            this.k = u71Var;
        }
        this.j.schedule((TimerTask) u71Var, 0L, 1000L);
    }

    public final void e(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.s = f;
        qoo qooVar = this.e;
        if (qooVar != null) {
            qooVar.f.setVolume(f, f);
        }
    }

    public final void f() {
        Timer timer = this.j;
        if (timer != null) {
            timer.cancel();
            this.j = null;
        }
        u71 u71Var = this.k;
        if (u71Var != null) {
            u71Var.cancel();
            this.k = null;
        }
    }

    public final void g(FrameLayout frameLayout) {
        Context context = this.c;
        if (this.p == null) {
            ImageButton imageButton = new ImageButton(context);
            this.p = imageButton;
            imageButton.setBackgroundColor(0);
            this.p.setOnClickListener(new cto(this, (byte) 3));
            this.p.setImageDrawable(bbp.FULL_SCREEN.d(context));
            this.p.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        upj.j(this.p);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 50.0f, getResources().getDisplayMetrics());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iApplyDimension, iApplyDimension);
        layoutParams.gravity = 8388659;
        frameLayout.addView(this.p, layoutParams);
    }

    public final void h() {
        Context context = this.c;
        FrameLayout frameLayout = this.f;
        if (this.b == 11) {
            fp1 fp1VarA = sjo.a(context);
            if (fp1VarA != null) {
                gc supportActionBar = fp1VarA.getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.q(false);
                    supportActionBar.u();
                }
                Activity activityP = sjo.p(context);
                if (activityP != null) {
                    activityP.getWindow().clearFlags(1024);
                }
            }
            ViewGroup viewGroup = (ViewGroup) upj.f(context, this);
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
            upj.j(this.n);
            if (frameLayout.getParent() != null) {
                upj.j(frameLayout);
            }
            Activity activityE = upj.e(this);
            if (activityE != null) {
                activityE.setRequestedOrientation(this.A);
                try {
                    if (Settings.System.getInt(activityE.getContentResolver(), "accelerometer_rotation") > 0) {
                        activityE.setRequestedOrientation(4);
                    }
                } catch (Exception unused) {
                }
                activityE.getWindow().clearFlags(1024);
                activityE.getWindow().addFlags(2048);
            }
            addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            g(frameLayout);
            this.b = (byte) 10;
            t8p t8pVar = this.m;
            if (t8pVar != null) {
                t8pVar.x.a(24);
                if (t8pVar.E) {
                    t8pVar.p();
                    t8pVar.E = false;
                }
            }
        }
    }

    public final boolean i() {
        return this.b == 11;
    }

    public final void j() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (this.e != null) {
            this.f.setKeepScreenOn(true);
            qoo qooVar = this.e;
            qooVar.a = this.C;
            qooVar.c = this.D;
            qooVar.b = this.E;
            qooVar.d = this.F;
            qooVar.e = this.G;
            try {
                qooVar.f.setDataSource(this.c.getApplicationContext(), Uri.parse(this.r));
                Surface surface = this.i;
                if (surface == null) {
                    surface = new Surface(this.h);
                    this.i = surface;
                }
                this.e.f.setSurface(surface);
                this.e.f.prepareAsync();
                this.a = 1;
            } catch (Exception e) {
                e.getMessage();
                this.I = 2;
                this.a = -1;
                t8p t8pVar = this.m;
                if (t8pVar == null || t8pVar.D) {
                    return;
                }
                t8pVar.x.a(16);
                t8pVar.y();
                t8pVar.D = true;
            }
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !i()) {
            return super.onKeyDown(i, keyEvent);
        }
        h();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        SurfaceTexture surfaceTexture2 = this.h;
        if (surfaceTexture2 == null) {
            this.h = surfaceTexture;
            j();
        } else {
            TextureView textureView = this.g;
            if (textureView != null) {
                textureView.setSurfaceTexture(surfaceTexture2);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return this.h == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
