package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class d43 extends ve {
    public final Context a;
    public final String b;
    public final hrj c;
    public final f1p d;

    public d43(Context context, grj grjVar, int i) {
        this.a = context;
        String packageName = context.getPackageName();
        this.b = packageName;
        this.c = new hrj(context, grjVar, i);
        f1p f1pVar = new f1p();
        f1pVar.b = new HashMap();
        f1pVar.a = packageName;
        this.d = f1pVar;
    }

    @Override // defpackage.ve
    public final boolean a(nzi nziVar, boolean z) {
        return false;
    }

    public abstract String b();

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        hrj hrjVar = this.c;
        sc scVar = hrjVar.d;
        if (scVar == null) {
            return false;
        }
        if (menuItem.getItemId() != 16908353) {
            scVar = null;
        }
        if (scVar == null) {
            return false;
        }
        hrjVar.a.startActivity((Intent) scVar.a);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.c.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPrepareActionMode(android.view.ActionMode r10, android.view.Menu r11) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d43.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
