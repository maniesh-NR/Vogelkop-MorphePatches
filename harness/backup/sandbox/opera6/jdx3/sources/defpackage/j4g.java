package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.custom_views.OperaRadioGroup;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j4g extends b23 {
    public final ArrayList b;
    public final o8f c;
    public final vdf d;
    public final orm e;
    public kf f;

    public j4g(ArrayList arrayList, o8f o8fVar, vdf vdfVar, orm ormVar) {
        super((byte) 1);
        this.b = arrayList;
        this.c = o8fVar;
        this.d = vdfVar;
        this.e = ormVar;
    }

    @Override // defpackage.b23
    public final View f(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131559205, (ViewGroup) null, false);
        int i = 2131363292;
        if (((OperaListItem) w1h.j(2131363292, viewInflate)) != null) {
            i = 2131364051;
            OperaListItem operaListItem = (OperaListItem) w1h.j(2131364051, viewInflate);
            if (operaListItem != null) {
                OperaRadioGroup operaRadioGroup = (OperaRadioGroup) viewInflate;
                this.f = new kf((byte) 23, operaRadioGroup, operaListItem);
                return operaRadioGroup;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        Resources resources = context.getResources();
        ArrayList arrayList = this.b;
        return resources.getQuantityString(2131886168, arrayList.size(), Integer.valueOf(arrayList.size()));
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getResources().getString(2132018111);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getResources().getString(2132018378);
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        return context.getString(2132020331);
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        return sgb.F(2131232311, context);
    }

    @Override // defpackage.b23
    public final int k(Context context) {
        return 0;
    }

    @Override // defpackage.b23
    public final ColorStateList m(Context context) {
        return f03.u(2130969284, context, 2131101243);
    }

    @Override // defpackage.b23
    public final Integer o() {
        return 2131165295;
    }

    @Override // defpackage.b23, defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        super.onCreateDialog(az0Var);
        az0Var.a.k = false;
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        this.d.run();
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        ArrayList arrayList;
        gm0 gm0Var;
        kf kfVar = this.f;
        if (kfVar == null) {
            kfVar = null;
        }
        if (((OperaListItem) kfVar.c).isChecked()) {
            arrayList = this.b;
            gm0Var = gm0.h;
        } else {
            arrayList = new ArrayList();
            gm0Var = gm0.g;
        }
        this.c.run(arrayList);
        ((x5f) this.e).l0(gm0Var);
    }
}
