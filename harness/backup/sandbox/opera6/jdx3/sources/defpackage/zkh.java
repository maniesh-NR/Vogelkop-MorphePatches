package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.i;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import com.opera.android.sync.SyncedSessionTab;

/* loaded from: classes.dex */
public final class zkh implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i b;

    public /* synthetic */ zkh(i iVar, byte b) {
        this.a = b;
        this.b = iVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        i iVar = this.b;
        switch (b) {
            case 0:
                alh alhVar = (alh) iVar;
                blh blhVar = alhVar.l;
                if (alhVar.j != null && !blhVar.b.e()) {
                    if (blhVar.g.b == 3) {
                        alhVar.b.d();
                        blhVar.k.g.s(alhVar);
                    } else {
                        blhVar.d.d(alhVar.j.a.a);
                    }
                    alhVar.h0();
                    break;
                }
                break;
            default:
                vyk vykVar = ((uyk) iVar).e;
                vykVar.getClass();
                SyncedSessionTab syncedSessionTab = (SyncedSessionTab) view.getTag(2131364644);
                final String str = syncedSessionTab.d;
                if (TextUtils.isEmpty(str)) {
                    str = syncedSessionTab.c;
                }
                final Context context = view.getContext();
                z77 z77VarU = sfe.U(vykVar.getContext());
                pyc pycVarI0 = eog.i0(vykVar.getContext());
                String[] strArr = OperaApplication.K;
                final SettingsManager settingsManagerJ = ((OperaApplication) context.getApplicationContext()).J();
                eog eogVar = (eog) pycVarI0.a;
                eogVar.h = new MenuItem.OnMenuItemClickListener() { // from class: tyk
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        ClipboardManager clipboardManager;
                        int itemId = menuItem.getItemId();
                        String str2 = str;
                        if (itemId != 2131364648) {
                            if (menuItem.getItemId() == 2131364646 && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                                clipboardManager.setPrimaryClip(ClipData.newPlainText(str2, str2));
                            }
                            return true;
                        }
                        boolean z = settingsManagerJ.C() == q7j.FOREGROUND;
                        vx3 vx3VarA = ay3.a(str2, lqm.h, false);
                        vx3VarA.c(true);
                        vx3VarA.c = 1;
                        vx3VarA.a(z);
                        vx3VarA.d(true);
                        vx3VarA.f = false;
                        am2.v(vx3VarA);
                        return true;
                    }
                };
                ps5 ps5Var = eogVar.d;
                new MenuInflater(context).inflate(2131755044, ps5Var);
                ps5Var.setHeaderTitle(str);
                z77VarU.getClass();
                z77VarU.b(pycVarI0, ijm.b);
                break;
        }
        return true;
    }
}
