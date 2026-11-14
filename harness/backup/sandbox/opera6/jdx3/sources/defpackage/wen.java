package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.permissions.LocalNetworkPermissionController;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class wen extends b23 {
    public final /* synthetic */ byte b;
    public final Object c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wen() {
        this(new kof((byte) 9), (byte) 6);
        this.b = (byte) 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wen(Object obj, byte b) {
        super((byte) 1);
        this.b = b;
        this.c = obj;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132022207);
            case 1:
                return context.getText(2132018971);
            case 2:
                return context.getString(2132019550, context.getString(2132017591));
            case 3:
                return context.getText(2132021127);
            case 4:
                return context.getText(2132021356);
            case 5:
                return context.getText(2132021131);
            default:
                return context.getText(2132020315);
        }
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132020043);
            case 1:
                return context.getString(2132018111);
            case 2:
                return context.getString(2132020043);
            case 3:
                return context.getString(2132018111);
            case 4:
                return context.getString(2132018111);
            case 5:
                return context.getString(2132018111);
            default:
                return context.getString(2132020043);
        }
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132021683);
            case 1:
                return context.getString(2132018974);
            case 2:
                return context.getString(2132018378);
            case 3:
                return context.getString(2132018974);
            case 4:
                return context.getString(2132021359);
            case 5:
                return context.getString(2132019312);
            default:
                return context.getString(2132020202);
        }
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        switch (this.b) {
            case 0:
                return 2132083347;
            default:
                return super.getTheme();
        }
    }

    @Override // defpackage.b23
    public final Integer h() {
        switch (this.b) {
            case 0:
                return 4;
            default:
                return super.h();
        }
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        switch (this.b) {
            case 0:
                return context.getString(2132022209);
            case 1:
                return context.getText(2132018973);
            case 2:
                return context.getString(2132019551);
            case 3:
                return context.getText(2132021128);
            case 4:
                return context.getText(2132021126);
            case 5:
                return context.getText(2132021132);
            default:
                return context.getText(2132020316);
        }
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        switch (this.b) {
            case 0:
                return sgb.F(2131231939, context);
            case 1:
                return sgb.F(2131232005, context);
            case 2:
                return sgb.F(2131232126, context);
            case 3:
                return sgb.F(2131232172, context);
            case 4:
                return sgb.F(2131232172, context);
            case 5:
                return sgb.F(2131232172, context);
            default:
                return sgb.F(2131232311, context);
        }
    }

    @Override // defpackage.b23
    public final int k(Context context) {
        switch (this.b) {
            case 0:
                return f03.E(2130969732, context, 0);
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return 0;
        }
    }

    @Override // defpackage.b23
    public final ColorStateList l(Context context) {
        switch (this.b) {
            case 0:
            case 2:
                return null;
            case 1:
            default:
                return super.l(context);
        }
    }

    @Override // defpackage.b23
    public final ColorStateList m(Context context) {
        switch (this.b) {
        }
        return f03.u(2130969284, context, 2131101243);
    }

    @Override // defpackage.b23
    public final Integer o() {
        switch (this.b) {
            case 1:
                return 2131165295;
            case 2:
                return 2131165295;
            case 3:
                return 2131165295;
            case 4:
                return 2131165295;
            case 5:
                return 2131165295;
            default:
                return super.o();
        }
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        byte b = this.b;
        hjm hjmVar2 = hjm.b;
        switch (b) {
            case 0:
                if (this.mDismissReason == hjmVar2) {
                    Context context = bz0Var.getContext();
                    String[] strArr = OperaApplication.K;
                    ((OperaApplication) context.getApplicationContext()).L().c.P0(vb0.d);
                    break;
                }
                break;
            case 2:
                if (hjmVar == hjmVar2) {
                    N.MLWmh7HR(false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        switch (this.b) {
            case 0:
                Context context = bz0Var.getContext();
                String[] strArr = OperaApplication.K;
                ((OperaApplication) context.getApplicationContext()).L().c.P0(vb0.c);
                break;
            case 1:
            default:
                super.onNegativeButtonClicked(bz0Var);
                break;
            case 2:
                N.MLWmh7HR(false);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                Context context = bz0Var.getContext();
                String[] strArr = OperaApplication.K;
                ((OperaApplication) context.getApplicationContext()).L().c.P0(vb0.b);
                ((yug) obj).a(7);
                break;
            case 1:
                ((gb3) obj).invoke();
                break;
            case 2:
                LocalNetworkPermissionController.a(new vk2((byte) 15), ((ChromiumContent) obj).b);
                break;
            case 3:
                ((b6g) obj).invoke();
                break;
            case 4:
                ((e6g) obj).invoke();
                break;
            case 5:
                ((x2) obj).invoke();
                break;
            default:
                Intent intent = new Intent("android.settings.LOCK_SCREEN_SETTINGS");
                if (qvf.b(65536, intent) == null) {
                    intent = new Intent("android.settings.SETTINGS");
                }
                intent.setFlags(268435456);
                try {
                    bz0Var.getContext().startActivity(intent);
                    break;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
        }
    }

    @Override // defpackage.b23, defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) throws Resources.NotFoundException {
        switch (this.b) {
            case 6:
                super.onShowDialog(bz0Var);
                ((Function0) this.c).invoke();
                break;
            default:
                super.onShowDialog(bz0Var);
                break;
        }
    }
}
