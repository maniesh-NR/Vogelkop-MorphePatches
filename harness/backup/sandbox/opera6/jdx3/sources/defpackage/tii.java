package defpackage;

import J.N;
import android.view.MenuItem;
import androidx.fragment.app.r;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class tii implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ uii a;

    public tii(uii uiiVar) {
        this.a = uiiVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        uii uiiVar = this.a;
        PasswordManager passwordManager = uiiVar.i;
        r activity = uiiVar.getActivity();
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) activity.getApplication()).J();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            passwordManager.getClass();
            N.MQtjLg8W(true);
            settingsManagerJ.V(1, "password_manager_autosave");
            return true;
        }
        if (itemId == 1) {
            passwordManager.getClass();
            N.MQtjLg8W(true);
            settingsManagerJ.V(0, "password_manager_autosave");
            return true;
        }
        if (itemId != 2) {
            return true;
        }
        passwordManager.getClass();
        N.MQtjLg8W(false);
        return true;
    }
}
