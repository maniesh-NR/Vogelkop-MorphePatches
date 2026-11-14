package defpackage;

import android.net.Uri;
import com.opera.android.account.auth.EditProfileAuthActivity;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class bw7 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditProfileAuthActivity b;

    public /* synthetic */ bw7(EditProfileAuthActivity editProfileAuthActivity, byte b) {
        this.a = b;
        this.b = editProfileAuthActivity;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        Uri uriF0;
        Uri uriF02;
        byte b = this.a;
        af9 af9Var = af9.a;
        EditProfileAuthActivity editProfileAuthActivity = this.b;
        af9 af9Var2 = (af9) obj;
        switch (b) {
            case 0:
                int i = EditProfileAuthActivity.V;
                editProfileAuthActivity.R = true;
                editProfileAuthActivity.S = af9Var2 == af9Var;
                if (editProfileAuthActivity.Q && !editProfileAuthActivity.U && (uriF0 = editProfileAuthActivity.F0()) != null) {
                    editProfileAuthActivity.s0(uriF0, 0, 0);
                    break;
                }
                break;
            default:
                int i2 = EditProfileAuthActivity.V;
                if (!editProfileAuthActivity.U && af9Var2 == af9Var && (uriF02 = editProfileAuthActivity.F0()) != null) {
                    editProfileAuthActivity.s0(uriF02, 0, 0);
                    break;
                }
                break;
        }
    }
}
