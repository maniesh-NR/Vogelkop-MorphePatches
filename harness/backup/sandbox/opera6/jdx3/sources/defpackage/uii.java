package defpackage;

import J.N;
import android.os.Bundle;
import androidx.fragment.app.r;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public class uii extends eog {
    public final PasswordManager i = new PasswordManager();

    public final void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        r activity = getActivity();
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) activity.getApplication()).J();
        ps5 ps5Var = new ps5(activity);
        ps5Var.c = this;
        ps5Var.e = this;
        qtd qtdVarA = ps5Var.a(1, 0, 0, getString(2132021353));
        qtd qtdVarA2 = ps5Var.a(1, 1, 0, getString(2132021354));
        qtd qtdVarA3 = ps5Var.a(1, 2, 0, getString(2132021355));
        this.i.getClass();
        if (!N.MaxktGXn()) {
            qtdVarA3.setChecked(true);
        } else if (settingsManagerJ.i("password_manager_autosave")) {
            qtdVarA.setChecked(true);
        } else {
            qtdVarA2.setChecked(true);
        }
        ps5Var.setHeaderTitle(2132021398);
        ps5Var.setGroupCheckable(1, true, true);
        this.d = ps5Var;
        this.h = new tii(this);
    }
}
