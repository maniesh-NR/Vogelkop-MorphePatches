package defpackage;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cb1 {
    public final db1 a;
    public final ab1 b;
    public final ab1 c;
    public final View d;

    public cb1(db1 db1Var, ab1 ab1Var, ab1 ab1Var2, View view) {
        this.a = db1Var;
        this.b = ab1Var;
        this.c = ab1Var2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        kfl kflVar = (kfl) this.b.invoke();
        byte b = 0;
        if (Intrinsics.a(kflVar, (Object) null)) {
            return false;
        }
        menu.clear();
        List list = kflVar.a;
        int size = list.size();
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (i2 < size) {
            sfl sflVar = (jfl) list.get(i2);
            if (sflVar instanceof sfl) {
                i = i3 + 1;
                Object obj = ((jfl) sflVar).a;
                sfl sflVar2 = sflVar;
                MenuItem menuItemAdd = menu.add(i4, Intrinsics.a(obj, vtp.g) ? R.id.cut : Intrinsics.a(obj, vtp.h) ? R.id.copy : Intrinsics.a(obj, vtp.i) ? R.id.paste : Intrinsics.a(obj, vtp.j) ? R.id.selectAll : Intrinsics.a(obj, vtp.k) ? R.id.autofill : i3, i3, sflVar2.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new bb1(sflVar2, this, b));
            } else if (sflVar instanceof yfl) {
                i = i3 + 1;
                Context context = this.d.getContext();
                yfl yflVar = (yfl) sflVar;
                TextClassification textClassification = yflVar.b;
                int i5 = yflVar.c;
                Drawable drawable = yflVar.d;
                if (i5 < 0) {
                    MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i3, textClassification.getLabel());
                    menuItemAdd2.setShowAsAction(2);
                    menuItemAdd2.setIcon(drawable);
                    menuItemAdd2.setOnMenuItemClickListener(new bb1(context, textClassification, b));
                } else {
                    byte b2 = i5 == 0 ? (byte) 1 : b;
                    RemoteAction remoteAction = textClassification.getActions().get(i5);
                    MenuItem menuItemAdd3 = menu.add(R.id.textAssist, b2 != 0 ? (byte) 16908353 : b, i3, remoteAction.getTitle());
                    menuItemAdd3.setShowAsAction(b2 == 0 ? (byte) 0 : (byte) 2);
                    if (drawable != null) {
                        menuItemAdd3.setIcon(drawable);
                    }
                    menuItemAdd3.setOnMenuItemClickListener(new axe(remoteAction, (byte) 4));
                }
            } else {
                if (sflVar instanceof wfl) {
                    i4++;
                }
                i2++;
                b = 0;
            }
            i3 = i;
            i2++;
            b = 0;
        }
        return true;
    }
}
