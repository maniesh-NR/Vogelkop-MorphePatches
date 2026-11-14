package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.opera.android.FullscreenWebActivity;

/* loaded from: classes.dex */
public abstract class k83 extends Fragment {
    public final Class a;
    public final char b;

    /* JADX WARN: Multi-variable type inference failed */
    public k83(Class cls, int i) {
        this.a = cls;
        this.b = i;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        w parentFragmentManager = getParentFragmentManager();
        if (isRemoving() || parentFragmentManager.L) {
            return;
        }
        a aVar = new a(parentFragmentManager);
        aVar.m(this);
        aVar.i(true, true);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intentE0 = FullscreenWebActivity.e0(getContext(), this.a, null, null, true, lqm.d);
        ActivityOptions activityOptionsMakeCustomAnimation = ActivityOptions.makeCustomAnimation(getContext(), 2130772041, 0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putAll(arguments);
            intentE0.putExtras(bundle2);
        }
        startActivityForResult(intentE0, this.b, activityOptionsMakeCustomAnimation.toBundle());
    }
}
