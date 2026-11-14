package defpackage;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import com.leanplum.messagetemplates.MessageTemplateConstants;

/* loaded from: classes.dex */
public final class mo8 extends k43 {
    public final Activity k;
    public final i3j l;
    public final ap m;
    public final bp n;
    public final yo o;
    public final /* synthetic */ oo8 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo8(oo8 oo8Var, Activity activity, oo8 oo8Var2, zy zyVar, dl dlVar, i3j i3jVar, ap apVar) {
        super(oo8Var2, zyVar, dlVar);
        this.p = oo8Var;
        this.k = activity;
        this.l = i3jVar;
        this.m = apVar;
        this.n = new bp();
        this.o = oo8Var2.e;
    }

    @Override // defpackage.k43
    public final void a() {
        mo8 mo8Var;
        qo8 qo8Var = new qo8(this.k);
        rm rmVar = this.p.f;
        int iOrdinal = rmVar.ordinal();
        int iG = 320;
        short s = 50;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                mo8Var = this;
                iG = MessageTemplateConstants.Values.CENTER_POPUP_WIDTH;
            } else if (iOrdinal == 3) {
                mo8Var = this;
                iG = mo8Var.g();
                s = 120;
            } else if (iOrdinal != 4) {
                mo8Var = this;
                mo8Var.b(false, "internal error", true, null, null);
            } else {
                mo8Var = this;
                iG = mo8Var.g();
            }
            s = 250;
        } else {
            mo8Var = this;
        }
        qo8Var.c = rmVar;
        qo8Var.invalidate();
        qo8Var.a = iG;
        qo8Var.b = s;
        qo8Var.requestLayout();
        qo8Var.invalidate();
        mo8Var.d(new vo8(mo8Var.o, mo8Var.c, mo8Var.d, mo8Var.n, mo8Var.l, mo8Var.m, qo8Var));
    }

    public final int g() {
        Activity activity = this.k;
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        int iWidth = displayMetrics.widthPixels;
        if (Build.VERSION.SDK_INT >= 30) {
            iWidth = activity.getWindowManager().getCurrentWindowMetrics().getBounds().width();
        }
        return (int) ((iWidth - 64) / displayMetrics.density);
    }
}
