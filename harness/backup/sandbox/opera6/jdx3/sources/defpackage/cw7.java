package defpackage;

import android.content.Intent;
import com.opera.android.account.auth.EditProfileAuthActivity;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class cw7 extends k83 {
    public final db c;
    public final mni d;

    public cw7(db dbVar, mni mniVar) {
        super(EditProfileAuthActivity.class, 43962);
        this.c = dbVar;
        this.d = mniVar;
    }

    @Override // defpackage.k83
    public final void onActivityResult(int i, int i2, Intent intent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.onActivityResult(i, i2, intent);
        this.c.g(true, new rl((byte) 4), new vk2((byte) 5));
        mni mniVar = this.d;
        if (mniVar != null) {
            mniVar.run();
        }
    }
}
