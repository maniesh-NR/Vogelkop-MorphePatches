package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import defpackage.akk;
import defpackage.bh;
import defpackage.ch;
import defpackage.ff;
import defpackage.fh;
import defpackage.hh;
import defpackage.sgb;

/* loaded from: classes.dex */
public class ShareActionProvider extends ff {
    public final Context d;

    public ShareActionProvider(Context context) {
        super(context);
        this.d = context;
    }

    @Override // defpackage.ff
    public final View c() {
        Context context = this.d;
        hh hhVar = new hh(context);
        if (!hhVar.isInEditMode()) {
            bh bhVarB = bh.b(context);
            fh fhVar = hhVar.a;
            hh hhVar2 = fhVar.f;
            fh fhVar2 = hhVar2.a;
            ch chVar = hhVar2.j;
            bh bhVar = fhVar2.a;
            if (bhVar != null && hhVar2.isShown()) {
                bhVar.unregisterObserver(chVar);
            }
            fhVar.a = bhVarB;
            if (hhVar2.isShown()) {
                bhVarB.registerObserver(chVar);
            }
            fhVar.notifyDataSetChanged();
            if (hhVar.c()) {
                hhVar.a();
                if (!hhVar.c() && hhVar.o) {
                    hhVar.m = false;
                    hhVar.d(hhVar.n);
                }
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968606, typedValue, true);
        Drawable drawableF = sgb.F(typedValue.resourceId, context);
        ImageView imageView = hhVar.f;
        imageView.setImageDrawable(drawableF);
        hhVar.i = this;
        imageView.setContentDescription(hhVar.getContext().getString(2132017177));
        return hhVar;
    }

    @Override // defpackage.ff
    public final void f(akk akkVar) {
        akkVar.clear();
        Context context = this.d;
        bh bhVarB = bh.b(context);
        context.getPackageManager();
        int iD = bhVarB.d();
        int iMin = Math.min(iD, 4);
        if (iMin > 0) {
            bhVarB.c(0);
            throw null;
        }
        if (iMin < iD) {
            akkVar.addSubMenu(0, iMin, iMin, context.getString(2132017157));
            if (iD > 0) {
                bhVarB.c(0);
                throw null;
            }
        }
    }
}
