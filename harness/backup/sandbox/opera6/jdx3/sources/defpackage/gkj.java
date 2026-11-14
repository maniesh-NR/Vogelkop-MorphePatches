package defpackage;

import android.content.Context;
import android.widget.Button;

/* loaded from: classes.dex */
public final class gkj extends nz0 {
    public String a;
    public String b;
    public String c;
    public CharSequence d;
    public ekj e;
    public fkj f;
    public qp2 g;
    public dkj h;
    public dkj i;
    public ql j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public pxh o;

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        int i = this.l;
        return i != 0 ? context.getString(i) : this.b;
    }

    @Override // defpackage.nz0
    public final String getNeutralButtonText(Context context) {
        return this.c;
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        int i = this.k;
        return i != 0 ? context.getString(i) : this.a;
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        int i = this.m;
        az0Var.setTitle(i != 0 ? az0Var.getContext().getString(i) : this.d);
        wy0 wy0Var = az0Var.a;
        pxh pxhVar = this.o;
        if (pxhVar != null) {
            wy0Var.f = pxhVar.a(az0Var.getContext().getResources());
        }
        wy0Var.k = true;
    }

    @Override // defpackage.nz0
    public final void onDialogCreated(bz0 bz0Var) {
        bz0Var.setCanceledOnTouchOutside(this.n);
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        ekj ekjVar = this.e;
        if (ekjVar != null) {
            ekjVar.b(hjmVar);
        }
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        super.onFinished(hjmVar);
        fkj fkjVar = this.f;
        if (fkjVar != null) {
            fkjVar.e(this, hjmVar);
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        dkj dkjVar = this.i;
        if (dkjVar != null) {
            dkjVar.a();
        }
    }

    @Override // defpackage.nz0
    public final void onNeutralButtonClicked(bz0 bz0Var) {
        ql qlVar = this.j;
        if (qlVar != null) {
            qlVar.a();
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        dkj dkjVar = this.h;
        if (dkjVar != null) {
            dkjVar.a();
        }
    }

    @Override // defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) {
        super.onShowDialog(bz0Var);
        qp2 qp2Var = this.g;
        if (qp2Var != null) {
            qp2Var.getClass();
            Button buttonF = bz0Var.f(-1);
            if (buttonF != null) {
                hz0 hz0Var = new hz0((byte) 1);
                q9n.e(buttonF, hz0Var);
                hz0Var.a(buttonF);
            }
        }
    }
}
