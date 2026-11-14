package com.opera.android.webapps;

import android.R;
import android.app.ActivityManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.i;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.aik;
import defpackage.b2l;
import defpackage.cjm;
import defpackage.cv3;
import defpackage.e7d;
import defpackage.eq9;
import defpackage.fsp;
import defpackage.fzk;
import defpackage.gxh;
import defpackage.iga;
import defpackage.ivn;
import defpackage.iwl;
import defpackage.je0;
import defpackage.k6l;
import defpackage.kk5;
import defpackage.ks3;
import defpackage.le0;
import defpackage.q9n;
import defpackage.qim;
import defpackage.qz4;
import defpackage.r2n;
import defpackage.ryl;
import defpackage.ryn;
import defpackage.t5d;
import defpackage.uy3;
import defpackage.wqm;
import defpackage.wt2;
import defpackage.xi5;
import defpackage.xt2;
import defpackage.zhj;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.chromium.base.CommandLine;
import org.chromium.content_public.browser.NavigationController;

/* loaded from: classes.dex */
public class WebappActivity extends t5d implements iga {
    public static final /* synthetic */ int J = 0;
    public uuj B;
    public fzk C;
    public View D;
    public boolean E;
    public boolean F;
    public CommandLine G;
    public xi5 H;
    public boolean I;
    public ChromiumContent x;
    public Integer z;
    public ryn y = new ryn();
    public final cv3 A = new cv3(this, 3);

    @Override // defpackage.dx3
    public final List G(ChromiumContent chromiumContent) {
        return this.y.m ? Collections.EMPTY_LIST : Collections.singletonList(new qz4(this, (byte) 2));
    }

    @Override // defpackage.dx3
    public final List I(ChromiumContent chromiumContent) {
        return !this.y.m ? h1b.v(new kk5(chromiumContent, (byte) 2)) : Collections.EMPTY_LIST;
    }

    @Override // defpackage.dx3
    public final d7h J() {
        return null;
    }

    @Override // defpackage.dx3
    public final ivn K() {
        return new r2n((Object) this, (byte) 20);
    }

    @Override // defpackage.dx3
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.dx3
    public final cjm c0(Class cls) {
        return new cjm(2131363371, ryl.class.isAssignableFrom(cls) ? false : i.class.isAssignableFrom(cls));
    }

    @Override // defpackage.t5d
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ChromiumContent chromiumContentF0;
        if (keyEvent.getKeyCode() != 125) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!keyEvent.isCanceled() && keyEvent.getAction() == 1 && this.E && !keyEvent.isLongPress() && (chromiumContentF0 = f0()) != null && !chromiumContentF0.h() && chromiumContentF0.d().n() && !chromiumContentF0.h()) {
            NavigationController navigationControllerD = chromiumContentF0.d();
            if (navigationControllerD.n()) {
                navigationControllerD.l();
            }
        }
        return true;
    }

    @Override // defpackage.iga
    public final String e() {
        return this.y.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t5d
    public final ChromiumContainerView e0() {
        l5b l5bVar = q9n.c;
        return (ChromiumContainerView) q9n.y(2131362328, getWindow().getDecorView());
    }

    public final ChromiumContent f0() {
        b2l b2lVar;
        uy3 uy3VarF;
        k6l k6lVarW = W();
        if (k6lVarW == null || (b2lVar = k6lVarW.o) == null || (uy3VarF = uy3.F(b2lVar)) == null) {
            return null;
        }
        return uy3VarF.b;
    }

    @Override // defpackage.iga
    public final boolean g(String str) {
        return str.equals(this.y.h);
    }

    public final void g0() {
        ChromiumContent chromiumContentF0;
        if (this.y.l != 4 || (chromiumContentF0 = f0()) == null) {
            return;
        }
        eq9 eq9VarS = S();
        d37 d37Var = eq9VarS.a;
        d37Var.g = chromiumContentF0;
        d37Var.b = false;
        d37Var.j(chromiumContentF0, true);
        eq9VarS.e();
    }

    @Override // defpackage.dx3, defpackage.kl9
    public final void h(zhj zhjVar) {
        X(zhjVar, 2131363371);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0() {
        String strP;
        if (TextUtils.isEmpty(this.y.f)) {
            ChromiumContent chromiumContent = this.x;
            if (chromiumContent != null) {
                strP = chromiumContent.p();
                if (TextUtils.isEmpty(strP)) {
                    String str = this.y.h;
                    String[] strArr = wqm.a;
                    strP = aik.g(str);
                }
            } else {
                strP = null;
            }
        } else {
            strP = this.y.f;
        }
        findViewById(2131365085).D(strP);
        Integer numValueOf = this.z;
        if (numValueOf == null) {
            long j = this.y.i;
            if (j != 2147483648L) {
                numValueOf = Integer.valueOf((int) j);
                this.z = numValueOf;
            }
        }
        int iM0 = p37.m0(numValueOf == null ? getColor(2131103875) : numValueOf.intValue(), 255);
        ryn rynVar = this.y;
        String str2 = rynVar.b;
        Bitmap bitmap = rynVar.c;
        if (bitmap == null) {
            if (!TextUtils.isEmpty(str2)) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                rynVar.c = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            }
            bitmap = rynVar.c;
        }
        setTaskDescription(new ActivityManager.TaskDescription(strP, bitmap, iM0));
        fzk fzkVar = this.C;
        Integer num = this.z;
        fzkVar.c.g(fzk.e[0], new gxh(num != null ? num.intValue() : -16777216));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t5d, defpackage.dx3, defpackage.hjf
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.I = true;
        CommandLine commandLine = ((OperaApplication) getApplication()).n;
        if (commandLine == null) {
            commandLine = null;
        }
        this.G = commandLine;
        this.H = xi5.a(this);
        ryn rynVar = new ryn(getIntent());
        this.y = rynVar;
        if (rynVar.a == null || rynVar.h == null) {
            getIntent();
            finish();
            return;
        }
        setContentView(2131558431);
        this.D = findViewById(2131361903);
        this.C = new fzk(this.D, getWindow(), ((OperaApplication) getApplication()).B());
        fsp.g(this, this.G);
        e7d.a(this, new wt2(this, (byte) 7));
        getOnBackPressedDispatcher().a(this, new xt2(this, (byte) 10));
        h0();
        ryn rynVar2 = this.y;
        this.B = rynVar2.n ? new iwl() : new uuj();
        long j = rynVar2.j;
        this.B.h(this, (ViewGroup) findViewById(R.id.content), j != 2147483648L ? (int) j : getColor(2131103874));
        uuj uujVar = this.B;
        ryn rynVar3 = this.y;
        Resources resources = getResources();
        Drawable drawable = rynVar3.d;
        String str = rynVar3.b;
        if (drawable == null) {
            int i = rynVar3.e;
            if (i != 0) {
                ThreadLocal threadLocal = ResourcesCompat.a;
                rynVar3.d = resources.getDrawable(i, null);
            } else if (!TextUtils.isEmpty(str)) {
                Bitmap bitmap = rynVar3.c;
                if (bitmap == null) {
                    if (!TextUtils.isEmpty(str)) {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        rynVar3.c = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    }
                    bitmap = rynVar3.c;
                }
                rynVar3.d = new BitmapDrawable(resources, bitmap);
            }
            drawable = rynVar3.d;
        }
        String str2 = this.y.g;
        if (((ViewGroup) uujVar.c) != null) {
            if (drawable != null && drawable.getIntrinsicWidth() > ((WebappActivity) uujVar.b).getResources().getDimensionPixelSize(2131167806)) {
                ((ImageView) ((ViewGroup) uujVar.c).findViewById(2131365083)).setImageDrawable(drawable);
            }
            uujVar.n(str2);
            int i2 = uujVar.a;
            if (((float) ab5.e(-1, i2)) > ((float) ab5.e(-16777216, i2))) {
                ((TextView) ((ViewGroup) uujVar.c).findViewById(2131365084)).setTextColor(((WebappActivity) uujVar.b).getColor(2131100250));
            }
        }
    }

    @Override // defpackage.dx3, defpackage.hjf
    public final void onDestroy() {
        b0(this.A);
        this.B = null;
        super.onDestroy();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 82) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            if (this.E && !keyEvent.isLongPress() && i == 82) {
                return true;
            }
            return super/*android.app.Activity*/.onKeyUp(i, keyEvent);
        } catch (Throwable th) {
            ks3.D(th);
            return true;
        }
    }

    public final void onPause() {
        super/*androidx.fragment.app.r*/.onPause();
        this.F = false;
        if (this.E) {
            qim qimVar = this.o;
            Objects.requireNonNull(qimVar);
            qimVar.p = true;
            qimVar.b.h++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        g0();
        super/*androidx.fragment.app.r*/.onResume();
        this.F = true;
        if (this.E) {
            qim qimVar = this.o;
            Objects.requireNonNull(qimVar);
            qimVar.i(true);
        }
        String[] strArr = OperaApplication.K;
        ((OperaApplication) getApplication()).L().c.T(this.I, null, le0.u, je0.d);
        this.I = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
