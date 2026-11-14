package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.opera.android.settings.SettingsManager;
import java.util.List;

/* loaded from: classes.dex */
public final class tf7 extends b23 {
    public final /* synthetic */ byte b = 1;
    public final orm c;
    public final Object d;
    public final Object e;
    public Object f;

    public tf7(orm ormVar, SettingsManager settingsManager, ydn ydnVar) {
        super((byte) 1);
        this.f = vb0.d;
        this.c = ormVar;
        this.d = settingsManager;
        this.e = ydnVar;
    }

    public tf7(x5f x5fVar, n32 n32Var, gl6 gl6Var, bl6 bl6Var) {
        super((byte) 1);
        this.c = x5fVar;
        this.d = n32Var;
        this.e = gl6Var;
        this.f = bl6Var;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132018832);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(context.getString(2132019151));
                if (((ydn) this.e).d.a) {
                    sb.append("\n\n");
                    sb.append(context.getString(2132018491));
                }
                return phj.y(sb.toString());
        }
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.b) {
        }
        return context.getString(2132020043);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132018835);
            default:
                return context.getString(2132017286);
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
                return context.getString(2132018836);
            default:
                return context.getString(2132019152);
        }
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        switch (this.b) {
            case 0:
                return sgb.F(2131231649, context);
            default:
                return sgb.F(2131232062, context);
        }
    }

    @Override // defpackage.b23
    public final int k(Context context) {
        switch (this.b) {
            case 0:
                return 0;
            default:
                return super.k(context);
        }
    }

    @Override // defpackage.b23
    public final ColorStateList l(Context context) {
        switch (this.b) {
            case 0:
                return null;
            default:
                return f03.u(2130969111, context, 2131101243);
        }
    }

    @Override // defpackage.b23
    public final ColorStateList m(Context context) {
        switch (this.b) {
            case 0:
                return null;
            default:
                return super.m(context);
        }
    }

    @Override // defpackage.b23
    public final ImageView.ScaleType n() {
        switch (this.b) {
            case 0:
                return ImageView.ScaleType.FIT_CENTER;
            default:
                return super.n();
        }
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        byte b = this.b;
        orm ormVar = this.c;
        switch (b) {
            case 0:
                if (hjmVar == hjm.b) {
                    ((x5f) ormVar).Q(vb0.d);
                    ((n32) this.d).run();
                    break;
                }
                break;
            default:
                vb0 vb0Var = (vb0) this.f;
                x5f x5fVar = (x5f) ormVar;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
                    pe0 pe0Var = new pe0(2443, -1, 1);
                    pe0Var.q(0, 1, vb0Var);
                    List list = (List) xb0VarX.n(27);
                    ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 27, am2.q(xb0VarX, 27, 1)) : new hf0(xb0VarX, 27, list)).add(pe0Var);
                    x5fVar.U0(x56VarF);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        byte b = this.b;
        vb0 vb0Var = vb0.c;
        switch (b) {
            case 0:
                ((x5f) this.c).Q(vb0Var);
                ((n32) this.d).run();
                break;
            default:
                this.f = vb0Var;
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        byte b = this.b;
        vb0 vb0Var = vb0.b;
        switch (b) {
            case 0:
                ((x5f) this.c).Q(vb0Var);
                ((gl6) this.e).run();
                break;
            default:
                ((SettingsManager) this.d).V(1, "compression");
                this.f = vb0Var;
                break;
        }
    }

    @Override // defpackage.b23, defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) throws Resources.NotFoundException, SecurityException {
        switch (this.b) {
            case 0:
                super.onShowDialog(bz0Var);
                ((bl6) this.f).run();
                break;
            default:
                super.onShowDialog(bz0Var);
                break;
        }
    }
}
