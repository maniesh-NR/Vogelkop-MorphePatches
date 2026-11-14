package defpackage;

import J.N;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.OperaApplication;
import com.opera.android.account.auth.OperaAuthPortalActivity;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public class mwk extends Fragment {
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        w parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.F("base-account-onboarding-fragment") != null) {
            parentFragmentManager.V(1, "base-account-onboarding-fragment");
        } else {
            w parentFragmentManager2 = getParentFragmentManager();
            if (!isRemoving() && !parentFragmentManager2.L) {
                a aVar = new a(parentFragmentManager2);
                aVar.m(this);
                aVar.i(true, true);
            }
        }
        if (i2 != -1) {
            Bundle bundle = new Bundle();
            bundle.putInt("result_code", i2);
            vtp.V(bundle, this, "SyncAuthPortalFragment_request");
            return;
        }
        Context contextRequireContext = requireContext();
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) contextRequireContext.getApplicationContext();
        db dbVarB = operaApplication.b();
        zwk zwkVarN = operaApplication.N();
        SettingsManager settingsManagerJ = operaApplication.J();
        zwkVarN.getClass();
        avj avjVar = cak.d;
        if ((avj.b(1) ? N.MhJnoDjg() : 0) == 2) {
            xih.q(dbVarB, zwkVarN, settingsManagerJ);
        } else {
            zwkVarN.F(new nyk(dbVarB, zwkVarN, settingsManagerJ));
        }
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("SHOW_EDIT_PROFILE_ON_SUCCESS", true) : true) {
            xih.v(getParentFragmentManager(), dbVarB, null, null);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("result_code", -1);
        vtp.V(bundle2, this, "SyncAuthPortalFragment_request");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intentE0 = FullscreenWebActivity.e0(getContext(), OperaAuthPortalActivity.class, null, null, true, lqm.d);
        ActivityOptions activityOptionsMakeCustomAnimation = ActivityOptions.makeCustomAnimation(getContext(), 2130772041, 0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putAll(arguments);
            intentE0.putExtras(bundle2);
        }
        startActivityForResult(intentE0, 65534, activityOptionsMakeCustomAnimation.toBundle());
    }
}
