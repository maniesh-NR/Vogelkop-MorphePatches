package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.account.auth.FinishAccountSetupAuthActivity;

/* loaded from: classes.dex */
public final class d49 extends Fragment {
    public final db a;
    public final fv2 b;

    public d49(db dbVar, fv2 fv2Var) {
        this.a = dbVar;
        this.b = fv2Var;
    }

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
        fv2 fv2Var = this.b;
        if (fv2Var != null) {
            fv2Var.run();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("result_code", i2);
        vtp.V(bundle, this, "FinishAccountSetupAuthPortalFragment_request");
        if (i2 == -1) {
            Bundle arguments = getArguments();
            if (arguments != null ? arguments.getBoolean("SHOW_EDIT_PROFILE_ON_SUCCESS", true) : true) {
                xih.v(getParentFragmentManager(), this.a, null, null);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intentE0 = FullscreenWebActivity.e0(getContext(), FinishAccountSetupAuthActivity.class, null, null, true, lqm.d);
        ActivityOptions activityOptionsMakeCustomAnimation = ActivityOptions.makeCustomAnimation(getContext(), 2130772041, 0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putAll(arguments);
            intentE0.putExtras(bundle2);
        }
        startActivityForResult(intentE0, 48879, activityOptionsMakeCustomAnimation.toBundle());
    }
}
