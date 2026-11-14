package com.opera.android.import_data;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.opera.android.widget.ThemeableLottieAnimationView;
import defpackage.ac8;
import defpackage.c3b;
import defpackage.eb0;
import defpackage.i2b;
import defpackage.ijm;
import defpackage.j3b;
import defpackage.k3b;
import defpackage.l2b;
import defpackage.mv;
import defpackage.nl3;
import defpackage.or2;
import defpackage.qim;
import defpackage.v2b;
import defpackage.vml;
import defpackage.w2b;
import defpackage.x5f;
import defpackage.z2b;
import defpackage.z77;
import defpackage.z80;
import defpackage.zr9;
import java.io.File;
import java.util.Objects;
import kotlin.Metadata;
import org.chromium.content_public.browser.NavigationController;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/opera/android/import_data/ImportChromeBookmarksActivity;", "Ll2b;", "<init>", "()V", "qq6", "o0g", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImportChromeBookmarksActivity extends l2b {
    public static final /* synthetic */ int b0 = 0;
    public boolean a0;

    @Override // defpackage.l2b
    public final void C0(File file) {
        vml.d.c(new zr9((Object) this, (Object) file, (byte) 6)).a(null);
    }

    @Override // defpackage.l2b
    public final void D0() {
        super.D0();
        j3b j3bVar = this.N;
        if (j3bVar != null) {
            or2 or2Var = j3bVar.b;
            j3bVar.a(2130969937);
            ((TextView) or2Var.b).setText(2132019304);
            ((TextView) or2Var.f).setText(2132019321);
        }
    }

    @Override // defpackage.l2b
    public final void E0(int i) {
        super.E0(i);
        nl3.b.getClass();
        ulp.C(i);
        S0();
        R0(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l2b
    public final void J0() {
        setTitle(getString(2132019298));
    }

    @Override // defpackage.l2b
    public final void K0() {
        M0();
        j3b j3bVar = this.N;
        if (j3bVar != null) {
            ((ThemeableLottieAnimationView) j3bVar.b.d).q();
        }
        nl3 nl3Var = nl3.c;
        nl3Var.getClass();
        S0();
        R0(nl3Var.a);
    }

    @Override // defpackage.l2b
    public final void P0() {
        super.P0();
        if (this.a0) {
            return;
        }
        this.a0 = true;
        x5f x5fVar = this.U;
        if (x5fVar == null) {
            x5fVar = null;
        }
        x5fVar.X(z80.f);
    }

    public final void R0(int i) {
        x5f x5fVar = this.U;
        if (x5fVar == null) {
            x5fVar = null;
        }
        x5fVar.X(z80.i);
        x5f x5fVar2 = this.U;
        if (x5fVar2 == null) {
            x5fVar2 = null;
        }
        StringBuilder sb = new StringBuilder("reason: ");
        sb.append(i);
        sb.append(" ");
        StringBuilder sb2 = this.W;
        sb.append((Object) sb2);
        x5fVar2.R(7, sb.toString());
        sb2.setLength(0);
        x5f x5fVar3 = this.U;
        x5f x5fVar4 = x5fVar3 != null ? x5fVar3 : null;
        hv5 hv5Var = w2b.b;
        String str = this.Y;
        hv5Var.getClass();
        x5fVar4.I(hv5.I(str), c3b.FROM_CHROME, v2b.BOOKMARKS, eb0.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S0() {
        if (!joh.p(this)) {
            ac8.b(new k3b(2, 0L, "", 2));
            return;
        }
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        z77 z77Var = qimVar.c;
        z2b z2bVar = new z2b(true);
        z77Var.getClass();
        z77Var.b(z2bVar, ijm.b);
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final Drawable l0(Context context) {
        Drawable drawableF = sgb.F(2131232034, context);
        j14.o0(drawableF, f03.v(context));
        return drawableF;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final boolean o0(NavigationController navigationController) {
        if (!this.O) {
            return super.o0(navigationController);
        }
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        z77 z77Var = qimVar.c;
        mv mvVar = new mv(new i2b(this, (byte) 1));
        z77Var.getClass();
        z77Var.b(mvVar, ijm.b);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.FullscreenWebActivity
    public final boolean onSupportNavigateUp() {
        if (!this.O && !this.P) {
            finish();
            return true;
        }
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        z77 z77Var = qimVar.c;
        mv mvVar = new mv(new i2b(this, (byte) 0));
        z77Var.getClass();
        z77Var.b(mvVar, ijm.b);
        return true;
    }
}
