package com.opera.android.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastSession;
import defpackage.bi;
import defpackage.cc6;
import defpackage.dll;
import defpackage.hig;
import defpackage.hjf;
import defpackage.iig;
import defpackage.kg7;
import defpackage.kkf;
import defpackage.l92;
import defpackage.n92;
import defpackage.nml;
import defpackage.p92;
import defpackage.pde;
import defpackage.q9n;
import defpackage.tjg;
import defpackage.u8n;
import defpackage.umi;
import defpackage.vx;
import defpackage.w3a;
import defpackage.we7;
import defpackage.xbf;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class PlayerContainerView extends FrameLayout {
    public static final /* synthetic */ int k = 0;
    public final we7 a;
    public tjg b;
    public PlayerView c;
    public cc6 d;
    public boolean e;
    public p92 f;
    public Bitmap g;
    public l92 h;
    public CastSession i;
    public final pde j;

    public PlayerContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new we7(this, new hig(this), (byte) 5);
        this.j = new pde(null);
        this.f = p92.a(context.getResources());
        kkf kkfVar = new kkf(this, (byte) 2);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(getContext());
        if (dllVarV == null) {
            return;
        }
        u8n.b(dllVarV, this, kkfVar);
    }

    public final void a() {
        FrameLayout frameLayout;
        o92 o92VarN;
        iig iigVar;
        qjd qjdVarG;
        String friendlyName;
        tjg tjgVar;
        PlayerView playerView = this.c;
        if (playerView == null || (frameLayout = playerView.l) == null) {
            return;
        }
        we7 we7Var = this.a;
        qjd qjdVarG2 = we7Var.c().g();
        kg7 kg7Var = kg7.h;
        o92 o92Var = null;
        if (qjdVarG2 != null && (tjgVar = this.b) != null && tjgVar.h != null) {
            setBackground(null);
            o92VarN = lcp.n(getContext(), this.f, this.b.k(qjdVarG2) == kg7Var ? 4 : 3);
            iigVar = new iig(o92VarN.b);
        } else if (this.e) {
            setBackgroundColor(-16777216);
            o92VarN = null;
            iigVar = null;
        } else {
            if (qjdVarG2 == null) {
                setBackground(null);
                o92VarN = new ColorDrawable(f03.G(getContext()).getDefaultColor());
            } else {
                AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(2131362771);
                if (aspectRatioFrameLayout.c != 1.0f) {
                    aspectRatioFrameLayout.c = 1.0f;
                    aspectRatioFrameLayout.requestLayout();
                }
                setBackground(null);
                Bitmap bitmap = (we7Var.a == null || (qjdVarG = we7Var.c().g()) == null) ? null : (Bitmap) this.b.k.d.get(qjdVarG.a);
                if (bitmap != null) {
                    if (bitmap != this.g) {
                        this.g = bitmap;
                        Context context = getContext();
                        umi umiVar = this.b.b;
                        p92 p92Var = this.f;
                        l92 l92Var = new l92(new Drawable[]{new ColorDrawable(bitmap.getPixel(0, 0)), new w3a(new n92(p92Var.c, (int) p92Var.b, context, bitmap), p92Var.a ? 119 : 17, false)}, (byte) 0);
                        nml nmlVarB = umiVar.b(new vx(bitmap, (byte) 9));
                        nmlVarB.b(umiVar.f(new bi(l92Var, (byte) 27)));
                        nmlVarB.a(null);
                        this.h = l92Var;
                    }
                    o92VarN = this.h;
                } else {
                    o92VarN = lcp.n(getContext(), this.f, this.b.k(qjdVarG2) == kg7Var ? 2 : 1);
                    iigVar = new iig(o92VarN.b);
                }
            }
            iigVar = null;
        }
        xf8.F0(this.j, iigVar);
        cc6 cc6Var = this.d;
        if (cc6Var != null) {
            CastSession castSession = this.i;
            LinearLayout linearLayout = cc6Var.b;
            if (castSession != null) {
                linearLayout.setVisibility(0);
                Context context2 = getContext();
                CastDevice castDevice = this.i.getCastDevice();
                String string = (castDevice == null || (friendlyName = castDevice.getFriendlyName()) == null) ? null : context2.getString(2132019744, friendlyName);
                TextView textView = this.d.c;
                if (string == null) {
                    string = "";
                }
                textView.setText(string);
            } else {
                linearLayout.setVisibility(8);
                o92Var = o92VarN;
            }
        } else {
            o92Var = o92VarN;
        }
        frameLayout.setForeground(o92Var);
    }

    public final void b(xbf xbfVar) {
        View viewFindViewById = findViewById(2131362402);
        if (viewFindViewById != null) {
            this.d = cc6.a(viewFindViewById);
        }
        this.a.a(xbfVar);
        WeakHashMap weakHashMap = r5n.a;
        this.c = (View) m5n.f(this, 2131363911);
        this.b = (tjg) xbfVar.b;
        f();
    }

    public final void c(xbf xbfVar) {
        this.d = null;
        this.c = null;
        this.a.b(xbfVar);
        this.b = null;
    }

    public final Rect d() {
        PlayerView playerView = this.c;
        if (playerView == null || !playerView.isLaidOut()) {
            return null;
        }
        View view = this.c.d;
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        rect.offset(iArr[0], iArr[1]);
        return rect;
    }

    public final void e(CastSession castSession) {
        this.i = castSession;
        f();
    }

    public final void f() {
        this.e = false;
        a1b a1bVarU = this.a.c().w().a.u(0);
        while (true) {
            if (!a1bVarU.hasNext()) {
                break;
            }
            ezl ezlVar = (ezl) a1bVarU.next();
            if (ezlVar.a > 0 && ezlVar.b.d[0].u != -1) {
                this.e = true;
                break;
            }
        }
        g();
        a();
    }

    public final void g() {
        this.c.d.setKeepScreenOn(this.e && this.a.c().e0() && this.b.h == null);
    }
}
