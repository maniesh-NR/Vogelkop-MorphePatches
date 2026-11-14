package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class cto implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ euo b;

    public /* synthetic */ cto(euo euoVar, byte b) {
        this.a = b;
        this.b = euoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        wtm wtmVar;
        int i;
        ImageButton imageButton;
        bbp bbpVar;
        byte b = this.a;
        euo euoVar = this.b;
        switch (b) {
            case 0:
                Context context = euoVar.c;
                boolean z = euoVar.t;
                euoVar.o.setImageDrawable(null);
                if (z) {
                    euoVar.o.setImageDrawable(sgb.F(2131233294, context));
                    AudioManager audioManager = euoVar.d;
                    int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : 0;
                    euoVar.e((float) (1.0d - (Math.log(streamMaxVolume - (euoVar.d != null ? r2.getStreamVolume(3) : 0)) / Math.log(euoVar.d != null ? r9.getStreamMaxVolume(3) : 0))));
                    euoVar.t = false;
                    wtmVar = euoVar.l;
                    i = 18;
                } else {
                    euoVar.o.setImageDrawable(sgb.F(2131232994, context));
                    euoVar.e(0.0f);
                    euoVar.t = true;
                    wtmVar = euoVar.l;
                    i = 17;
                }
                wtmVar.a(i);
                break;
            case 1:
                Context context2 = euoVar.c;
                int i2 = euoVar.a;
                if (i2 == 3) {
                    euoVar.a();
                    euoVar.B = true;
                    imageButton = euoVar.q;
                    bbpVar = bbp.VIDEO_PLAY;
                } else if (i2 == 4) {
                    euoVar.b();
                    euoVar.B = false;
                    euoVar.l.a(22);
                    imageButton = euoVar.q;
                    bbpVar = bbp.VIDEO_PAUSE;
                }
                imageButton.setImageDrawable(bbpVar.d(context2));
                break;
            case 2:
                if (euoVar.i()) {
                    euoVar.h();
                    break;
                }
                break;
            default:
                if (!euoVar.i()) {
                    FrameLayout frameLayout = euoVar.f;
                    Context context3 = euoVar.c;
                    if (euoVar.b != 11) {
                        fp1 fp1VarA = sjo.a(context3);
                        if (fp1VarA != null) {
                            gc supportActionBar = fp1VarA.getSupportActionBar();
                            if (supportActionBar != null) {
                                supportActionBar.q(false);
                                supportActionBar.f();
                            }
                            Activity activityP = sjo.p(context3);
                            if (activityP != null) {
                                activityP.getWindow().setFlags(1024, 1024);
                            }
                        }
                        Activity activityE = upj.e(euoVar);
                        byte b2 = 2;
                        if (activityE != null) {
                            int i3 = activityE.getResources().getConfiguration().orientation;
                            euoVar.A = i3;
                            if (i3 != 2) {
                                activityE.setRequestedOrientation(0);
                            }
                            activityE.getWindow().addFlags(1024);
                            activityE.getWindow().clearFlags(2048);
                        }
                        upj.j(frameLayout);
                        upj.j(euoVar.p);
                        ViewGroup viewGroup = (ViewGroup) upj.f(context3, euoVar);
                        if (viewGroup != null) {
                            viewGroup.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                        }
                        if (euoVar.n == null) {
                            ImageButton imageButton2 = new ImageButton(context3);
                            euoVar.n = imageButton2;
                            imageButton2.setBackgroundColor(0);
                            euoVar.n.setOnClickListener(new cto(euoVar, b2));
                            euoVar.n.setImageDrawable(bbp.g(context3));
                            euoVar.n.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        }
                        upj.j(euoVar.n);
                        int iApplyDimension = (int) TypedValue.applyDimension(1, 50.0f, euoVar.getResources().getDisplayMetrics());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iApplyDimension, iApplyDimension);
                        layoutParams.gravity = 8388661;
                        frameLayout.addView(euoVar.n, layoutParams);
                        if (!euoVar.hasFocus()) {
                            euoVar.setFocusable(true);
                            euoVar.setFocusableInTouchMode(true);
                            euoVar.requestFocus();
                        }
                        euoVar.b = (byte) 11;
                    }
                    euoVar.l.a(23);
                    break;
                }
                break;
        }
    }
}
