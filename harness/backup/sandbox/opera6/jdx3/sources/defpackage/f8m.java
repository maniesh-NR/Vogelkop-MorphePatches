package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.opera.android.account.auth.TwoFactorAuthenticationActivity;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class f8m extends ryl implements jbl {
    public static s14 e;
    public final s14 c;
    public final Uri d;

    public f8m(String str, s14 s14Var) {
        this.c = s14Var;
        this.d = Uri.parse(str);
        s14 s14Var2 = e;
        if (s14Var2 != null) {
            mgh mghVar = (mgh) s14Var2.d;
            if (((Callback) mghVar.c) != null) {
                mghVar.e("2fa error");
            }
        }
        e = s14Var;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super/*androidx.fragment.app.Fragment*/.onActivityResult(i, i2, intent);
        g0();
    }

    @Override // defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(getContext(), (Class<?>) TwoFactorAuthenticationActivity.class);
        ActivityOptions activityOptionsMakeCustomAnimation = ActivityOptions.makeCustomAnimation(getContext(), 2130772041, 0);
        intent.setData(this.d);
        startActivityForResult(intent, 61454, activityOptionsMakeCustomAnimation.toBundle());
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        s14 s14Var = e;
        s14 s14Var2 = this.c;
        if (s14Var == s14Var2) {
            e = null;
        }
        mgh mghVar = (mgh) s14Var2.d;
        if (((Callback) mghVar.c) == null) {
            return;
        }
        mghVar.e("2fa error");
    }

    @Override // defpackage.jbl
    public final String y() {
        return "two-factor-authentication";
    }
}
