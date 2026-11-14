package defpackage;

import J.N;
import android.content.Context;
import com.opera.android.browser.passwordmanager.AutoSigninFirstRunDialogRequest;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mm2 extends nz0 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm2(AutoSigninFirstRunDialogRequest autoSigninFirstRunDialogRequest) {
        super(false, false);
        this.c = autoSigninFirstRunDialogRequest;
    }

    public mm2(String str, boolean z) {
        super(true, false);
        this.c = str;
        this.b = z;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132017654);
            default:
                return context.getString(2132018541);
        }
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132017655);
            default:
                return context.getString(2132017536);
        }
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        switch (this.a) {
            case 0:
                Context context = az0Var.getContext();
                az0Var.b(2132017656);
                String string = context.getString(2132017653, context.getString(2132017591));
                wy0 wy0Var = az0Var.a;
                wy0Var.f = string;
                wy0Var.k = true;
                break;
            default:
                Context context2 = az0Var.getContext();
                az0 title = az0Var.setTitle(context2.getString(2132020071));
                String string2 = context2.getString(2132020433, (String) this.c);
                wy0 wy0Var2 = title.a;
                wy0Var2.f = string2;
                wy0Var2.k = true;
                break;
        }
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    N.MRjqL_BM(((AutoSigninFirstRunDialogRequest) this.c).b);
                    break;
                }
                break;
            default:
                super.onFinished(hjmVar);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    N.M4GRMnKU(((AutoSigninFirstRunDialogRequest) this.c).b, false);
                    break;
                }
                break;
            default:
                super.onNegativeButtonClicked(bz0Var);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    N.M4GRMnKU(((AutoSigninFirstRunDialogRequest) obj).b, true);
                    break;
                }
                break;
            default:
                Context context = bz0Var.getContext();
                sz4 sz4Var = (sz4) context.getSystemService("com.opera.android.permissions.PermissionHandlerService");
                Objects.requireNonNull(sz4Var);
                if (!yi4.T(sz4Var)) {
                    s9g.h.o(this.b, (String) obj, lag.b, kag.GRANTED, true);
                    break;
                } else {
                    yi4.R(context, sz4Var, oi.d(context), new ilm(this, (byte) 5));
                    break;
                }
        }
    }

    @Override // defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) {
        switch (this.a) {
            case 0:
                phj.Q(bz0Var, false);
                break;
            default:
                phj.Q(bz0Var, true);
                break;
        }
    }
}
