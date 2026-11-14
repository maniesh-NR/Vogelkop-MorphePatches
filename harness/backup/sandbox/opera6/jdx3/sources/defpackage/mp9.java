package defpackage;

import J.N;
import android.content.Context;

/* loaded from: classes.dex */
public final class mp9 extends nz0 {
    public long a;
    public final String b;

    public mp9(long j, String str) {
        super(false, false);
        this.a = j;
        this.b = str;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132018111);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132018378);
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        Context context = az0Var.getContext();
        String string = context.getString(2132017591);
        az0Var.b(2132022151);
        String string2 = context.getString(2132022150, this.b, string);
        wy0 wy0Var = az0Var.a;
        wy0Var.f = string2;
        wy0Var.k = true;
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        if (hjmVar == hjm.b) {
            long j = this.a;
            if (j != 0) {
                N.M89iwLkI(j, false);
                this.a = 0L;
            }
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.M89iwLkI(j, false);
        this.a = 0L;
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.M89iwLkI(j, true);
        this.a = 0L;
    }
}
