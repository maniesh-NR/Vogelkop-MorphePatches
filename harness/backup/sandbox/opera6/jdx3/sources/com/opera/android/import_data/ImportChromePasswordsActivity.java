package com.opera.android.import_data;

import android.widget.TextView;
import com.opera.android.autofill.PasswordImporter;
import com.opera.android.widget.ThemeableLottieAnimationView;
import defpackage.a3b;
import defpackage.ac8;
import defpackage.b3b;
import defpackage.c3b;
import defpackage.eb0;
import defpackage.gm0;
import defpackage.ix5;
import defpackage.j3b;
import defpackage.l2b;
import defpackage.or2;
import defpackage.qim;
import defpackage.v2b;
import defpackage.w2b;
import defpackage.x5f;
import defpackage.y2b;
import defpackage.yz5;
import defpackage.z77;
import java.io.File;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/opera/android/import_data/ImportChromePasswordsActivity;", "Ll2b;", "<init>", "()V", "nv6", "k1g", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImportChromePasswordsActivity extends l2b {
    public static final /* synthetic */ int b0 = 0;
    public boolean a0;

    @Override // defpackage.l2b
    public final void C0(File file) {
        new PasswordImporter(new nv6(this)).a(file.getAbsolutePath());
    }

    @Override // defpackage.l2b
    public final void D0() {
        super.D0();
        j3b j3bVar = this.N;
        if (j3bVar != null) {
            or2 or2Var = j3bVar.b;
            j3bVar.a(2130969941);
            ((TextView) or2Var.b).setText(2132019318);
            ((TextView) or2Var.f).setText(2132019321);
        }
    }

    @Override // defpackage.l2b
    public final void E0(int i) {
        super.E0(i);
        S0(i);
        R0(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l2b
    public final void F0() {
        setTitle(getString(2132020330));
    }

    @Override // defpackage.l2b
    public final void G0() {
        r0(0, "https://passwords.google.com/options");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l2b
    public final void H0() {
        setTitle(getString(2132021132));
    }

    @Override // defpackage.l2b
    public final void I0() {
        b3b[] b3bVarArr = b3b.a;
        E0(-1);
    }

    @Override // defpackage.l2b
    public final void K0() {
        M0();
        j3b j3bVar = this.N;
        if (j3bVar != null) {
            ((ThemeableLottieAnimationView) j3bVar.b.d).q();
        }
        int i = y2b.d.a;
        S0(i);
        R0(i);
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
        x5fVar.l0(gm0.i);
    }

    public final void R0(int i) {
        x5f x5fVar = this.U;
        if (x5fVar == null) {
            x5fVar = null;
        }
        x5fVar.l0(gm0.l);
        x5f x5fVar2 = this.U;
        if (x5fVar2 == null) {
            x5fVar2 = null;
        }
        StringBuilder sb = new StringBuilder("reason: ");
        sb.append(i);
        sb.append(" ");
        StringBuilder sb2 = this.W;
        sb.append((Object) sb2);
        x5fVar2.R(9, sb.toString());
        sb2.setLength(0);
        x5f x5fVar3 = this.V;
        if (x5fVar3 == null) {
            x5fVar3 = null;
        }
        x5fVar3.m0(false);
        x5f x5fVar4 = this.U;
        x5f x5fVar5 = x5fVar4 != null ? x5fVar4 : null;
        hv5 hv5Var = w2b.b;
        String str = this.Y;
        hv5Var.getClass();
        x5fVar5.I(hv5.I(str), c3b.FROM_CHROME, v2b.PASSWORDS, eb0.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S0(int i) {
        y2b.b.getClass();
        y2b y2bVarP = ix5.p(i);
        if (!joh.p(this)) {
            ac8.b(new a3b(y2bVarP));
            return;
        }
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        z77 z77Var = qimVar.c;
        boolean z = false;
        yz5 yz5Var = y2bVarP == y2b.c ? new yz5(z, z, (byte) 5) : new yz5(z, z, (byte) 4);
        z77Var.getClass();
        z77Var.b(yz5Var, yz5Var.getDefaultPriority());
    }
}
