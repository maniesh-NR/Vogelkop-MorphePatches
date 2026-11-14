package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class g25 extends nz0 {
    public final /* synthetic */ byte a = 1;
    public final int b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;

    public g25(int i, int i2, String str, jl4 jl4Var, d35 d35Var) {
        super(true, false);
        this.b = i;
        this.c = i2;
        this.f = str;
        this.d = jl4Var;
        this.e = d35Var;
    }

    public g25(Context context, int i, pxh pxhVar, int i2, DialogInterface.OnClickListener onClickListener) {
        super(false, false);
        this.d = context;
        this.b = i;
        this.e = pxhVar;
        this.c = i2;
        this.f = onClickListener;
    }

    public static g25 b(Context context, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener) {
        g25 g25Var = new g25((Context) null, i, new rxh(i2), i3, onClickListener);
        z77 z77VarU = sfe.U(context);
        z77VarU.getClass();
        z77VarU.b(g25Var, ijm.b);
        return g25Var;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132018111);
            default:
                return context.getString(2132021153);
        }
    }

    @Override // defpackage.nz0
    public final String getNeutralButtonText(Context context) {
        switch (this.a) {
            case 1:
                return context.getString(2132021158);
            default:
                return super.getNeutralButtonText(context);
        }
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(this.c);
            default:
                return context.getString(2132021152);
        }
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                az0Var.a.f = ((pxh) this.e).a(az0Var.getContext().getResources());
                if (i != 0) {
                    az0Var.b(i);
                    break;
                }
                break;
            default:
                View viewInflate = LayoutInflater.from(az0Var.getContext()).inflate(2131558666, (ViewGroup) null, false);
                int i2 = 2131362455;
                yq1 yq1Var = (StylingTextView) w1h.j(2131362455, viewInflate);
                if (yq1Var != null) {
                    i2 = 2131363525;
                    yq1 yq1Var2 = (DialogTitle) w1h.j(2131363525, viewInflate);
                    if (yq1Var2 != null) {
                        yq1Var2.setText(this.c);
                        yq1Var.setText((String) this.f);
                        az0Var.a.e = (RelativeLayout) viewInflate;
                        az0Var.a(i);
                        break;
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onDialogCreated(bz0 bz0Var) {
        switch (this.a) {
            case 1:
                bz0Var.setCanceledOnTouchOutside(false);
                break;
            default:
                super.onDialogCreated(bz0Var);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        switch (this.a) {
            case 1:
                ((d35) this.e).run();
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        switch (this.a) {
            case 1:
                ((c35) ((jl4) this.d).b).d = 3;
                break;
            default:
                super.onNegativeButtonClicked(bz0Var);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        switch (this.a) {
            case 0:
                ((DialogInterface.OnClickListener) this.f).onClick(bz0Var, -1);
                break;
            default:
                ((c35) ((jl4) this.d).b).d = 2;
                break;
        }
    }

    @Override // defpackage.nz0
    public final Context wrapContext(Context context) {
        switch (this.a) {
            case 0:
                Context context2 = (Context) this.d;
                if (context2 == null) {
                    break;
                }
                break;
        }
        return super.wrapContext(context);
    }
}
