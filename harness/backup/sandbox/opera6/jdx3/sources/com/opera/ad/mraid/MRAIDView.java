package com.opera.ad.mraid;

import android.R;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import defpackage.aoo;
import defpackage.b5d;
import defpackage.bbp;
import defpackage.c5d;
import defpackage.ic;
import defpackage.mz4;
import defpackage.t2p;
import defpackage.x4d;
import defpackage.y4d;
import defpackage.y55;
import defpackage.yg8;
import defpackage.z4d;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Map;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class MRAIDView extends aoo {
    public static final /* synthetic */ int e0 = 0;
    public final Activity A;
    public final GestureDetector B;
    public byte C;
    public boolean D;
    public boolean E;
    public final yg8 F;
    public final sa2 G;
    public DisplayMetrics H;
    public int I;
    public Rect J;
    public Rect K;
    public final fr L;
    public final fr M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public View T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean a0;
    public final int b0;
    public final Handler c0;
    public long d0;
    public b5d u;
    public b5d v;
    public b5d w;
    public RelativeLayout x;
    public ImageButton y;
    public final Context z;

    public MRAIDView(Context context) {
        super(context, null);
        this.z = context;
        Activity activityE = upj.e(this);
        this.A = activityE;
        this.C = (byte) 0;
        this.D = false;
        this.E = false;
        yg8 yg8Var = new yg8();
        yg8Var.b = true;
        yg8Var.a = 2;
        this.F = yg8Var;
        sa2 sa2Var = new sa2((byte) 22, false);
        sa2Var.b = 2;
        this.G = sa2Var;
        this.H = getResources().getDisplayMetrics();
        this.J = new Rect();
        this.K = new Rect();
        this.L = new fr((byte) 12, false);
        this.M = new fr((byte) 12, false);
        this.b0 = activityE != null ? activityE.getRequestedOrientation() : -1;
        this.B = new GestureDetector(getContext(), new mz4((byte) 1));
        this.c0 = new Handler(Looper.getMainLooper());
        b5d b5dVar = this.u;
        this.w = b5dVar;
        addView(b5dVar);
    }

    public final b5d A(Context context) {
        b5d b5dVar = new b5d(this, context.getApplicationContext());
        b5dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        b5dVar.setScrollContainer(false);
        b5dVar.setVerticalScrollBarEnabled(false);
        b5dVar.setHorizontalScrollBarEnabled(false);
        b5dVar.setScrollBarStyle(33554432);
        b5dVar.setFocusableInTouchMode(false);
        WebSettings settings = b5dVar.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        b5dVar.setWebChromeClient(new a5d((byte) 0));
        b5dVar.setWebViewClient(new c5d(this, (byte) 0));
        return b5dVar;
    }

    public final void B(b5d b5dVar) {
        int i;
        int i2;
        ImageButton imageButton;
        this.C = (byte) 2;
        Activity activity = this.A;
        if (activity != null) {
            int i3 = activity.getWindow().getAttributes().flags;
            this.U = (i3 & 1024) != 0;
            this.V = (i3 & 2048) != 0;
            this.W = -9;
            ActionBar actionBar = activity.getActionBar();
            if (actionBar != null) {
                this.a0 = actionBar.isShowing();
                actionBar.hide();
            } else {
                this.T = null;
                try {
                    this.T = (View) activity.findViewById(R.id.title).getParent();
                } catch (NullPointerException unused) {
                }
                View view = this.T;
                if (view != null) {
                    this.W = view.getVisibility();
                    this.T.setVisibility(8);
                }
            }
            activity.getWindow().addFlags(1024);
            activity.getWindow().clearFlags(2048);
            this.P = !this.U;
        }
        Context context = this.z;
        this.x = new RelativeLayout(context);
        if (!b5dVar.hasFocus()) {
            b5dVar.setFocusable(true);
            b5dVar.setFocusableInTouchMode(true);
            b5dVar.requestFocus();
        }
        this.x.addView(b5dVar);
        RelativeLayout relativeLayout = this.x;
        ImageButton imageButton2 = new ImageButton(context);
        this.y = imageButton2;
        imageButton2.setBackgroundColor(0);
        this.y.setOnClickListener(new ic(this, (byte) 7));
        if (relativeLayout == this.x && !this.E && (imageButton = this.y) != null) {
            imageButton.setImageDrawable(bbp.g(this.a));
            this.y.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        relativeLayout.addView(this.y);
        RelativeLayout relativeLayout2 = this.x;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 50.0f, this.H);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iApplyDimension, iApplyDimension);
        if (relativeLayout2 != this.x) {
            if (relativeLayout2 == null) {
                sa2 sa2Var = this.G;
                switch (sa2Var.b) {
                    case 0:
                    case 4:
                        i2 = 9;
                        layoutParams.addRule(i2);
                        break;
                    case 1:
                    case 3:
                    case 5:
                        i2 = 14;
                        layoutParams.addRule(i2);
                        break;
                    case 2:
                    case 6:
                        layoutParams.addRule(11);
                        break;
                }
                switch (sa2Var.b) {
                    case 0:
                    case 1:
                    case 2:
                        layoutParams.addRule(10);
                        break;
                    case 3:
                        i = 15;
                        layoutParams.addRule(i);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i = 12;
                        layoutParams.addRule(i);
                        break;
                }
            }
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        }
        this.y.setLayoutParams(layoutParams);
        ViewGroup viewGroup = (ViewGroup) upj.f(activity, this);
        if (viewGroup != null) {
            viewGroup.addView(this.x, new ViewGroup.LayoutParams(-1, -1));
        }
        this.Q = true;
    }

    public final void C(boolean z) {
        Rect rect;
        int[] iArr = new int[2];
        View view = z ? this.w : this;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1] - this.I;
        int width = view.getWidth();
        int height = view.getHeight();
        Rect rect2 = z ? this.J : this.K;
        if (i == rect2.left && i2 == rect2.top && width == rect2.width() && height == rect2.height()) {
            return;
        }
        int i3 = width + i;
        int i4 = height + i2;
        if (z) {
            rect = new Rect(i, i2, i3, i4);
            this.J = rect;
        } else {
            rect = new Rect(i, i2, i3, i4);
            this.K = rect;
        }
        if (this.N) {
            if (z) {
                w();
            } else {
                x();
            }
        }
    }

    public final void D(String str) {
        b5d b5dVar = this.w;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b5dVar.evaluateJavascript(str, new z4d((byte) 0));
    }

    public final int E(int i) {
        return (int) ((i / this.z.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void F(int i) {
        boolean z = i == 0;
        if (z != this.D) {
            this.D = z;
            if (this.N && this.O) {
                J();
            }
        }
    }

    public final void G() {
        Activity activity = this.A;
        if (activity != null) {
            Rect rect = new Rect();
            Window window = activity.getWindow();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            rect.width();
            rect.height();
            this.I = window.findViewById(R.id.content).getTop();
            int iWidth = rect.width();
            int i = this.M.c - this.I;
            fr frVar = this.L;
            if (iWidth == frVar.b && i == frVar.c) {
                return;
            }
            frVar.b = iWidth;
            frVar.c = i;
            if (this.N) {
                y();
            }
        }
    }

    public final void H() {
        int i = getResources().getConfiguration().orientation;
        DisplayMetrics displayMetrics = this.H;
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        fr frVar = this.M;
        if (i2 == frVar.b && i3 == frVar.c) {
            return;
        }
        frVar.b = i2;
        frVar.c = i3;
        if (this.N) {
            z();
        }
    }

    public final void I() {
        D("mraid.fireStateChangeEvent('" + new String[]{"loading", "default", "expanded", "resized", "hidden"}[this.C] + "');");
    }

    public final void J() {
        D("mraid.fireViewableChangeEvent(" + this.D + ");");
    }

    public void close() {
        this.c0.post(new x4d(this, (byte) 0));
    }

    public void expand(String str) {
        byte b = this.C;
        if (b == 1 || b == 3) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    new Thread(new y4d(this, URLDecoder.decode(str, "UTF-8"), (byte) 0), "2-part-content").start();
                    return;
                } catch (UnsupportedEncodingException unused) {
                    return;
                }
            }
            byte b2 = this.C;
            if (b2 == 1) {
                ViewParent parent = this.u.getParent();
                b5d b5dVar = this.u;
                if (parent != null) {
                    ((ViewGroup) b5dVar.getParent()).removeView(this.u);
                } else {
                    removeView(b5dVar);
                }
            } else if (b2 == 3) {
                throw null;
            }
            B(this.u);
        }
    }

    @Override // defpackage.aoo
    public final View k() {
        b5d b5dVar = this.u;
        if (b5dVar != null) {
            return b5dVar;
        }
        b5d b5dVarA = A(this.a);
        this.u = b5dVarA;
        return b5dVarA;
    }

    @Override // defpackage.aoo
    public final void o() {
        b5d b5dVar = this.u;
        if (b5dVar != null) {
            b5dVar.setWebChromeClient(null);
            this.u.setWebViewClient(null);
            upj.j(this.u);
            this.u.destroy();
            this.u = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        this.H = getResources().getDisplayMetrics();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        byte b = this.C;
        if (this.P) {
            return;
        }
        if (b == 2 || b == 3) {
            H();
            G();
        }
        if (this.S) {
            this.S = false;
            this.J = new Rect(this.K);
            w();
        } else {
            C(false);
        }
        if (this.C == 3 && z) {
            this.c0.post(new rl(this, (byte) 19));
        }
        this.O = true;
        if (this.C == 0 && this.N) {
            this.C = (byte) 1;
            I();
            D("mraid.fireReadyEvent();");
            if (this.D) {
                J();
            }
        }
    }

    @Override // defpackage.aoo, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action;
        if ((view == this.u || view == this.v) && (((action = motionEvent.getAction()) == 0 || action == 1) && !view.hasFocus())) {
            view.requestFocus();
        }
        super.onTouch(view, motionEvent);
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.B.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        b5d b5dVar = this.w;
        if (b5dVar == null || !b5dVar.b) {
            F(i);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        int visibility = getVisibility();
        b5d b5dVar = this.w;
        if (b5dVar == null || !b5dVar.b) {
            F(visibility);
        }
    }

    public void open(String str) {
        long j = this.d0;
        if (j <= 0 || j + 2000 < SystemClock.uptimeMillis()) {
            return;
        }
        try {
            String strDecode = URLDecoder.decode(str, "UTF-8");
            y55 y55Var = this.m;
            if (y55Var == null || !y55Var.k(strDecode)) {
                t2p.b(getContext(), strDecode, this, this.n);
            }
            byte b = this.C;
            if (b == 2 || b == 3) {
                close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.aoo
    public final void p() {
        b5d b5dVar = this.u;
        if (b5dVar == null || this.C == 2) {
            return;
        }
        b5dVar.toString();
        b5dVar.onPause();
        b5dVar.a = true;
    }

    @Override // defpackage.aoo
    public final void q(View view) {
        if (view == this.u || view == this.v) {
            this.d0 = SystemClock.uptimeMillis();
        }
        t();
    }

    public void resize() {
    }

    public void setOrientationProperties(Map<String, String> map) {
        Activity activity;
        boolean z = Boolean.parseBoolean(map.get("allowOrientationChange"));
        String str = map.get("forceOrientation");
        yg8 yg8Var = this.F;
        int i = -1;
        if (yg8Var.b == z) {
            int i2 = yg8Var.a;
            int iIndexOf = Arrays.asList("portrait", "landscape", "none").indexOf(str);
            if (iIndexOf == -1) {
                iIndexOf = 2;
            }
            if (i2 == iIndexOf) {
                return;
            }
        }
        yg8Var.b = z;
        int iIndexOf2 = Arrays.asList("portrait", "landscape", "none").indexOf(str);
        if (iIndexOf2 == -1) {
            iIndexOf2 = 2;
        }
        yg8Var.a = iIndexOf2;
        if (this.C != 2 || (activity = this.A) == null) {
            return;
        }
        int i3 = getResources().getConfiguration().orientation == 1 ? 1 : 0;
        int i4 = yg8Var.a;
        if (i4 == 0) {
            i = 1;
        } else if (i4 == 1) {
            i = 0;
        } else if (!yg8Var.b) {
            i = i3;
        }
        activity.setRequestedOrientation(i);
    }

    public void setResizeProperties(Map<String, String> map) throws NumberFormatException {
        String str = map.get("width");
        if (str != null) {
            Integer.parseInt(str);
        }
        String str2 = map.get("height");
        if (str2 != null) {
            Integer.parseInt(str2);
        }
        String str3 = map.get("offsetX");
        if (str3 != null) {
            Integer.parseInt(str3);
        }
        String str4 = map.get("offsetY");
        if (str4 != null) {
            Integer.parseInt(str4);
        }
        String str5 = map.get("customClosePosition");
        map.get("allowOffscreen");
        sa2 sa2Var = this.G;
        sa2Var.getClass();
        int iIndexOf = Arrays.asList("top-left", "top-center", "top-right", "center", "bottom-left", "bottom-center", "bottom-right").indexOf(str5);
        if (iIndexOf == -1) {
            iIndexOf = 2;
        }
        sa2Var.b = iIndexOf;
    }

    public void useCustomClose(String str) {
        boolean z = Boolean.parseBoolean(str);
        if (this.E != z) {
            this.E = z;
            ImageButton imageButton = this.y;
            if (z) {
                if (imageButton != null) {
                    imageButton.setImageResource(R.color.transparent);
                }
            } else if (imageButton != null) {
                imageButton.setImageDrawable(bbp.g(this.a));
                this.y.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    public final void w() {
        Rect rect = this.J;
        D("mraid.setCurrentPosition(" + E(rect.left) + "," + E(rect.top) + "," + E(rect.width()) + "," + E(this.J.height()) + ");");
    }

    public final void x() {
        Rect rect = this.K;
        D("mraid.setDefaultPosition(" + E(rect.left) + "," + E(rect.top) + "," + E(rect.width()) + "," + E(this.K.height()) + ");");
    }

    public final void y() {
        fr frVar = this.L;
        D("mraid.setMaxSize(" + E(frVar.b) + "," + E(frVar.c) + ");");
    }

    public final void z() {
        fr frVar = this.M;
        D("mraid.setScreenSize(" + E(frVar.b) + "," + E(frVar.c) + ");");
    }
}
