package com.opera.android.import_data;

import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.widget.ThemeableLottieAnimationView;
import defpackage.ac8;
import defpackage.b3b;
import defpackage.c3b;
import defpackage.cx3;
import defpackage.eb0;
import defpackage.fc6;
import defpackage.ir5;
import defpackage.ix5;
import defpackage.j2b;
import defpackage.j3b;
import defpackage.jm3;
import defpackage.l2b;
import defpackage.nl3;
import defpackage.nz0;
import defpackage.or2;
import defpackage.qim;
import defpackage.re7;
import defpackage.sma;
import defpackage.v2b;
import defpackage.v5g;
import defpackage.w2b;
import defpackage.wu5;
import defpackage.x5f;
import defpackage.y2b;
import defpackage.z77;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/opera/android/import_data/ImportChromeDataActivity;", "Ll2b;", "<init>", "()V", "j2b", "cx3", "xm5", "d06", "ir5", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImportChromeDataActivity extends l2b {
    public static final /* synthetic */ int d0 = 0;
    public j2b a0;
    public final jm3 b0;
    public final v5g c0;

    public ImportChromeDataActivity() {
        nl3 nl3Var = nl3.d;
        jm3 jm3Var = new jm3();
        jm3Var.a = false;
        jm3Var.b = 0L;
        jm3Var.c = nl3Var;
        this.b0 = jm3Var;
        y2b y2bVar = y2b.e;
        v5g v5gVar = new v5g();
        v5gVar.a = false;
        v5gVar.b = 0;
        v5gVar.c = y2bVar;
        this.c0 = v5gVar;
    }

    @Override // defpackage.l2b
    public final void D0() {
        super.D0();
        j3b j3bVar = this.N;
        if (j3bVar != null) {
            or2 or2Var = j3bVar.b;
            j3bVar.a(2130969941);
            ((TextView) or2Var.b).setText(2132019323);
            ((TextView) or2Var.f).setText(2132019321);
        }
        j3b j3bVar2 = this.N;
        if (j3bVar2 != null) {
            ((MaterialButton) j3bVar2.b.e).setOnClickListener(new sma(this, (byte) 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l2b
    public final void F0() {
        j2b j2bVar = this.a0;
        if (j2bVar == j2b.c) {
            setTitle(getString(2132020330));
        } else if (j2bVar == j2b.d) {
            setTitle("Google Takeout");
        }
    }

    @Override // defpackage.l2b
    public final void G0() {
        j2b j2bVar = this.a0;
        if (j2bVar == j2b.c) {
            r0(0, "https://passwords.google.com/options");
        } else if (j2bVar == j2b.d) {
            r0(0, "https://takeout.google.com");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l2b
    public final void H0() {
        setTitle(getString(2132019306));
    }

    @Override // defpackage.l2b
    public final void I0() {
        j2b j2bVar = j2b.c;
        b3b[] b3bVarArr = b3b.a;
        S0(j2bVar, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l2b
    public final void J0() {
        setTitle(getString(2132019306));
    }

    @Override // defpackage.l2b
    public final void K0() {
        M0();
        j2b j2bVar = this.a0;
        if (j2bVar != null) {
            b3b[] b3bVarArr = b3b.a;
            R0(j2bVar, -3);
        }
    }

    @Override // defpackage.l2b
    public final void N0(re7 re7Var) {
        new cx3(this, re7Var, (byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R0(j2b j2bVar, int i) {
        x5f x5fVar;
        j2b j2bVar2 = j2b.c;
        eb0 eb0Var = eb0.c;
        jm3 jm3Var = this.b0;
        v5g v5gVar = this.c0;
        if (j2bVar == j2bVar2) {
            v5gVar.a = false;
            y2b.b.getClass();
            v5gVar.c = ix5.p(i);
            v2b v2bVar = v2b.PASSWORDS;
            x5f x5fVar2 = this.U;
            x5fVar = x5fVar2 != null ? x5fVar2 : null;
            hv5 hv5Var = w2b.b;
            String str = this.Y;
            hv5Var.getClass();
            x5fVar.I(hv5.I(str), c3b.FROM_CHROME, v2bVar, eb0Var);
        } else if (j2bVar == j2b.d) {
            jm3Var.a = false;
            nl3.b.getClass();
            jm3Var.c = ulp.C(i);
            v2b v2bVar2 = v2b.BOOKMARKS;
            x5f x5fVar3 = this.U;
            x5fVar = x5fVar3 != null ? x5fVar3 : null;
            hv5 hv5Var2 = w2b.b;
            String str2 = this.Y;
            hv5Var2.getClass();
            x5fVar.I(hv5.I(str2), c3b.FROM_CHROME, v2bVar2, eb0Var);
        }
        if (!j2bVar.a) {
            j2b.b.getClass();
            j2b j2bVarI = wu5.i(j2bVar);
            if (j2bVarI != null) {
                ir5.e(this, j2bVarI, false, 0L);
                return;
            }
            return;
        }
        j3b j3bVar = this.N;
        if (j3bVar != null) {
            ((ThemeableLottieAnimationView) j3bVar.b.d).q();
        }
        if (!joh.p(this)) {
            ac8.b(new fc6(jm3Var, v5gVar));
            return;
        }
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        z77 z77Var = qimVar.c;
        nz0 nz0VarY = vtp.y(jm3Var, v5gVar);
        z77Var.getClass();
        z77Var.b(nz0VarY, nz0VarY.getDefaultPriority());
    }

    public final void S0(j2b j2bVar, int i) {
        M0();
        B0();
        R0(j2bVar, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T0(j2b j2bVar) {
        M0();
        B0();
        if (j2bVar.a) {
            setResult(-1);
            finish();
            ac8.b(new fc6(this.b0, this.c0));
        } else {
            j2b.b.getClass();
            j2b j2bVarI = wu5.i(j2bVar);
            if (j2bVarI != null) {
                ir5.e(this, j2bVarI, false, 0L);
            }
        }
    }

    @Override // defpackage.l2b, defpackage.hjf
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        P0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l2b, com.opera.android.FullscreenWebActivity
    public final void p0() {
        super.p0();
        Uri uriK0 = k0();
        if (Intrinsics.a(uriK0 != null ? uriK0.getHost() : null, "passwords.google.com")) {
            this.a0 = j2b.c;
            if (getIntent().getBooleanExtra("extra_try_again_partly", false)) {
                j2b j2bVar = this.a0;
                if (j2bVar != null) {
                    j2bVar.a = true;
                }
                jm3 jm3Var = this.b0;
                jm3Var.a = true;
                jm3Var.b = getIntent().getLongExtra("extra_imported_partly", 0L);
                return;
            }
            return;
        }
        Uri uriK02 = k0();
        if (Intrinsics.a(uriK02 != null ? uriK02.getHost() : null, "takeout.google.com")) {
            this.a0 = j2b.d;
            if (getIntent().getBooleanExtra("extra_try_again_partly", false)) {
                j2b j2bVar2 = this.a0;
                if (j2bVar2 != null) {
                    j2bVar2.a = true;
                }
                v5g v5gVar = this.c0;
                v5gVar.a = true;
                v5gVar.b = (int) getIntent().getLongExtra("extra_imported_partly", 0L);
            }
        }
    }
}
