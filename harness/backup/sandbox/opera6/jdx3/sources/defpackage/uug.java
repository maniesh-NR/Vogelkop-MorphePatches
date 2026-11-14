package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class uug extends b23 {
    public final /* synthetic */ byte b = 0;
    public final x5f c;
    public wb0 d;
    public final w6f e;

    public uug(gjm gjmVar, x5f x5fVar) {
        super((byte) 0);
        this.e = gjmVar;
        this.c = x5fVar;
        this.d = wb0.d;
    }

    public uug(ydn ydnVar, x5f x5fVar) {
        super((byte) 0);
        this.d = wb0.d;
        this.e = ydnVar;
        this.c = x5fVar;
    }

    @Override // defpackage.b23
    public final Integer b(Context context) {
        switch (this.b) {
        }
        return Integer.valueOf(f03.E(2130970591, context, 0));
    }

    @Override // defpackage.b23
    public final Integer d(Context context) {
        switch (this.b) {
        }
        return Integer.valueOf(f03.E(2130970592, context, 0));
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132019159);
            default:
                return context.getString(2132021701);
        }
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132018253);
            default:
                return context.getString(2132020043);
        }
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.b) {
        }
        return context.getString(2132022136);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        byte b = this.b;
        return 2132083346;
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        switch (this.b) {
        }
        return context.getString(2132021702);
    }

    @Override // defpackage.nz0
    public final boolean isRequestValid(b2l b2lVar) {
        switch (this.b) {
            case 1:
                return !((ydn) this.e).d.a;
            default:
                return super.isRequestValid(b2lVar);
        }
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        byte b = this.b;
        x5f x5fVar = this.c;
        switch (b) {
            case 0:
                x5fVar.L(1, this.d, null);
                break;
            default:
                x5fVar.L(2, this.d, null);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        byte b = this.b;
        wb0 wb0Var = wb0.c;
        switch (b) {
            case 0:
                this.d = wb0Var;
                break;
            default:
                this.d = wb0Var;
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        byte b = this.b;
        w6f w6fVar = this.e;
        wb0 wb0Var = wb0.b;
        switch (b) {
            case 0:
                this.d = wb0Var;
                ((gjm) w6fVar).e(new vfn(1, null, 2), false);
                break;
            default:
                this.d = wb0Var;
                ((ydn) w6fVar).C(true);
                break;
        }
    }
}
