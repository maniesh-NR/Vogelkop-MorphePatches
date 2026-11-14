package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.OperaApplication;
import com.opera.android.import_data.ImportChromeDataActivity;
import com.opera.android.import_data.ImportChromePasswordsActivity;

/* loaded from: classes.dex */
public final class yz5 extends nz0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz5() {
        super(false, false);
        this.a = (byte) 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yz5(boolean z, boolean z2, byte b) {
        super(z, z2);
        this.a = b;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132018111);
            case 1:
                return context.getString(2132018111);
            case 4:
                return context.getString(2132018111);
            case 7:
                return context.getString(2132018111);
            default:
                return super.getNegativeButtonText(context);
        }
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132021753);
            case 1:
                return context.getString(2132021985);
            case 2:
                return context.getString(2132020155);
            case 3:
            default:
                return super.getPositiveButtonText(context);
            case 4:
                return context.getString(2132021985);
            case 5:
                return context.getString(2132019218);
            case 6:
                return context.getString(2132019218);
            case 7:
                return context.getString(2132022130);
        }
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        switch (this.a) {
            case 0:
                az0Var.b(2132021754);
                az0Var.a(2132021752);
                break;
            case 1:
                az0Var.b(2132018476);
                az0Var.a.k = true;
                az0Var.a(2132018475);
                break;
            case 2:
                az0Var.b(2132021686);
                Context context = az0Var.getContext();
                yq1 yq1VarJ = phj.J(context);
                phj.b0(yq1VarJ, context.getString(2132021698), new dg7(this, (byte) 9));
                az0Var.setView(yq1VarJ);
                break;
            case 3:
                az0Var.b(2132019101);
                az0Var.a(2132019108);
                break;
            case 4:
                az0Var.b(2132018477);
                az0Var.a.k = true;
                az0Var.a(2132020332);
                break;
            case 5:
                az0Var.b(2132019313);
                az0Var.a.k = true;
                az0Var.a(2132020334);
                break;
            case 6:
                az0Var.b(2132021667);
                az0Var.a(2132021666);
                break;
            default:
                Context context2 = az0Var.getContext();
                String[] strArr = OperaApplication.K;
                nv6 nv6VarB = ru9.c(((OperaApplication) context2.getApplicationContext()).R().l).b();
                ((SharedPreferences.Editor) nv6VarB.a).putLong("vpn.enabled.timestamp.normal", System.currentTimeMillis());
                nv6VarB.w();
                az0Var.b(2132022260);
                az0Var.a(2132022259);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onDialogCreated(bz0 bz0Var) {
        switch (this.a) {
            case 7:
                bz0Var.setCanceledOnTouchOutside(false);
                break;
            default:
                super.onDialogCreated(bz0Var);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        switch (this.a) {
            case 0:
                ac8.a(new yzh());
                break;
            case 1:
                int i = ImportChromeDataActivity.d0;
                ir5.e(bz0Var.getContext(), j2b.c, false, 0L);
                break;
            case 4:
                int i2 = ImportChromePasswordsActivity.b0;
                Context context = bz0Var.getContext();
                context.startActivity(FullscreenWebActivity.e0(context, ImportChromePasswordsActivity.class, "https://passwords.google.com/options", new rxh(2132020330), true, lqm.d));
                break;
            case 5:
                finish(hjm.a);
                break;
            case 7:
                Context context2 = bz0Var.getContext();
                String[] strArr = OperaApplication.K;
                ((OperaApplication) context2.getApplicationContext()).R().C(false);
                break;
        }
    }
}
