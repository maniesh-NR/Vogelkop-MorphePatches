package defpackage;

import android.os.Bundle;
import androidx.fragment.app.r;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class nrf extends eog {
    public String i = "";
    public String j = "";

    public static tim l0(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("key", str);
        bundle.putString("title", str2);
        nrf nrfVar = new nrf();
        nrfVar.setArguments(bundle);
        return new tim(nrfVar);
    }

    public final void onCreate(Bundle bundle) {
        List listAsList;
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments.getString("key", "");
        this.i = string;
        string.getClass();
        byte b = 1;
        switch (string) {
            case "tab_disposition":
                listAsList = Arrays.asList(q7j.values());
                break;
            case "image_mode":
                listAsList = Arrays.asList(m7j.values());
                break;
            case "enable_reading_mode_as_default":
                listAsList = Arrays.asList(o7j.values());
                break;
            case "concurrent_downloads":
                listAsList = Arrays.asList(i7j.values());
                break;
            case "addressbar_position":
                listAsList = Arrays.asList(b7j.values());
                break;
            case "toolbar_disposition_tablet":
                listAsList = Arrays.asList(r7j.NEVER, r7j.BOTH);
                break;
            case "app_layout":
                listAsList = Arrays.asList(e7j.values());
                break;
            case "accept_cookies":
                listAsList = Arrays.asList(j7j.values());
                break;
            case "toolbar_disposition_classic":
                listAsList = Arrays.asList(r7j.values());
                break;
            case "user_agent":
                listAsList = Arrays.asList(s7j.MOBILE, s7j.DESKTOP);
                break;
            default:
                listAsList = Collections.EMPTY_LIST;
                break;
        }
        this.j = arguments.getString("title", "");
        r activity = getActivity();
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) activity.getApplication()).J();
        ps5 ps5Var = new ps5(activity);
        ps5Var.c = this;
        ps5Var.e = this;
        int iN = settingsManagerJ.n(this.i);
        for (int i = 0; i < listAsList.size(); i++) {
            lrf lrfVar = (lrf) listAsList.get(i);
            qtd qtdVarA = ps5Var.a(1, i, 0, lrfVar.getDescription() == 0 ? lrfVar.d(getResources()) : m5h.h(getActivity(), lrfVar.d(getResources()), getString(lrfVar.getDescription())));
            qtdVarA.setChecked(lrfVar.getValue() == iN);
            int icon = lrfVar.getIcon();
            if (icon != 0) {
                qtdVarA.setIcon(sgb.F(icon, activity));
            }
        }
        ps5Var.setHeaderTitle(this.j);
        ps5Var.setGroupCheckable(1, true, true);
        this.d = ps5Var;
        this.h = new bb1(this, listAsList, b);
    }
}
