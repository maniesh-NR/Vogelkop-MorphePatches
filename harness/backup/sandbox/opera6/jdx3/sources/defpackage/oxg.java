package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public final class oxg extends b23 {
    public final wvg b;
    public final c61 c;
    public final x5f d;
    public final bxc e;
    public boolean f;

    public oxg(wvg wvgVar, c61 c61Var, x5f x5fVar, bxc bxcVar) {
        super((byte) 1);
        this.b = wvgVar;
        this.c = c61Var;
        this.d = x5fVar;
        this.e = bxcVar;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) throws Resources.NotFoundException {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String strA = this.e.a(2, context);
        if (!TextUtils.isEmpty(strA)) {
            this.f = true;
            spannableStringBuilder.append((CharSequence) strA).append((CharSequence) "\n\n");
        }
        spannableStringBuilder.append((CharSequence) phj.y(context.getString(2132022238, DateFormat.getDateInstance().format(new Date(this.b.c)))));
        return spannableStringBuilder;
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132020925);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        return 2132083347;
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        return context.getString(2132022239);
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        return sgb.F(2131231939, context);
    }

    @Override // defpackage.b23
    public final int k(Context context) {
        return f03.E(2130969732, context, 0);
    }

    @Override // defpackage.b23
    public final ColorStateList l(Context context) {
        return null;
    }

    @Override // defpackage.b23
    public final ColorStateList m(Context context) {
        return f03.u(2130969517, context, 2131101243);
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        if (this.mDismissReason == hjm.b) {
            q(zq0.d);
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        hmk hmkVar;
        c61 c61Var = this.c;
        oxg oxgVar = (oxg) new o8f(this, (byte) 25).b;
        jmk jmkVar = this.b.h;
        zq0 zq0Var = zq0.b;
        zq0 zq0Var2 = zq0.c;
        mxg mxgVar = mxg.b;
        if (jmkVar == null || (hmkVar = jmkVar.c) == null) {
            nxg kxgVar = new kxg();
            int iOrdinal = mxgVar.ordinal();
            if (iOrdinal == 0) {
                oxgVar.q(zq0Var);
                return;
            } else {
                if (iOrdinal == 1) {
                    oxgVar.q(zq0Var2);
                    return;
                }
                return;
            }
        }
        try {
            String str = hmkVar.a;
            Context context = c61Var.a;
            Intent intentG = p12.g(str, context.getPackageName());
            intentG.addFlags(268435456);
            context.startActivity(intentG);
            nxg lxgVar = new lxg();
            int iOrdinal2 = mxg.a.ordinal();
            if (iOrdinal2 == 0) {
                oxgVar.q(zq0Var);
            } else if (iOrdinal2 == 1) {
                oxgVar.q(zq0Var2);
            }
        } catch (ActivityNotFoundException unused) {
            nxg kxgVar2 = new kxg();
            int iOrdinal3 = mxgVar.ordinal();
            if (iOrdinal3 == 0) {
                oxgVar.q(zq0Var);
            } else if (iOrdinal3 == 1) {
                oxgVar.q(zq0Var2);
            }
        }
    }

    public final void q(zq0 zq0Var) {
        boolean z = this.f;
        x5f x5fVar = this.d;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            yq0 yq0Var = new yq0(2443, -1, 2);
            yq0Var.q(0, 1, zq0Var);
            yq0Var.r(1, 1, z);
            x56 x56VarF = zpa.F();
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(31);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 31, am2.q(xb0VarX, 31, 1)) : new hf0(xb0VarX, 31, list)).add(yq0Var);
            x5fVar.U0(x56VarF);
        }
    }
}
