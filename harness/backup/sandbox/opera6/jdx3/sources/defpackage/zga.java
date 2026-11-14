package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class zga extends b23 {
    public final /* synthetic */ byte b = 1;
    public final Object c;
    public final Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zga(rl rlVar, vdf vdfVar, o8f o8fVar) {
        super((byte) 1);
        this.c = rlVar;
        this.d = vdfVar;
        this.e = o8fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zga(vdf vdfVar, rl rlVar, o8f o8fVar) {
        super((byte) 1);
        this.d = vdfVar;
        this.c = rlVar;
        this.e = o8fVar;
    }

    public zga(zv3 zv3Var, String str, gk5 gk5Var) {
        super((byte) 1);
        this.d = zv3Var;
        this.c = str;
        this.e = gk5Var;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132022367);
            case 1:
                return context.getString(2132019543, context.getString(2132017591));
            default:
                return context.getString(2132020523);
        }
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.b) {
        }
        return context.getString(2132018111);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132020202);
            case 1:
                return context.getString(2132020202);
            default:
                return context.getString(2132021985);
        }
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        switch (this.b) {
            case 0:
                return 2132083349;
            default:
                return super.getTheme();
        }
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132022368);
            case 1:
                return context.getString(2132018834);
            default:
                return context.getString(2132018458);
        }
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        switch (this.b) {
            case 0:
                return sgb.F(2131232127, context);
            case 1:
                return sgb.F(2131232126, context);
            default:
                return sgb.F(2131232317, context);
        }
    }

    @Override // defpackage.b23
    public final int k(Context context) {
        switch (this.b) {
            case 1:
                return 0;
            default:
                return super.k(context);
        }
    }

    @Override // defpackage.b23
    public final ColorStateList l(Context context) {
        switch (this.b) {
            case 1:
                return null;
            default:
                return super.l(context);
        }
    }

    @Override // defpackage.b23
    public final ColorStateList m(Context context) {
        switch (this.b) {
            case 0:
                return f03.u(2130969273, context, 2131101243);
            case 1:
                return f03.u(2130969288, context, 2131101243);
            default:
                return super.m(context);
        }
    }

    @Override // defpackage.b23
    public final Integer o() {
        switch (this.b) {
            case 0:
                return 2131165294;
            case 1:
                return 2131165295;
            default:
                return super.o();
        }
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        byte b = this.b;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((o8f) obj).run(hjmVar);
                break;
            case 1:
                ((o8f) obj).run(hjmVar);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((rl) obj).run();
                break;
            case 1:
                ((rl) obj).run();
                break;
            default:
                super.onNegativeButtonClicked(bz0Var);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        byte b = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((vdf) obj).run();
                break;
            case 1:
                ((vdf) obj).run();
                break;
            default:
                ((bk5) ((zv3) obj).get()).e((String) this.c, (gk5) this.e);
                break;
        }
    }
}
