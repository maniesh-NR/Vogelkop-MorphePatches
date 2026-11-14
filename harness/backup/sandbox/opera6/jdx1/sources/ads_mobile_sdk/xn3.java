package ads_mobile_sdk;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import defpackage.mip;

/* loaded from: classes.dex */
public final class xn3 implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ yn3 a;

    public xn3(yn3 yn3Var) {
        this.a = yn3Var;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        synchronized (this.a) {
            yn3 yn3Var = this.a;
            mip mipVar = yn3Var.a;
            if (z) {
                mipVar.getClass();
                yn3Var.d = System.currentTimeMillis();
                this.a.g = true;
            } else {
                mipVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                yn3 yn3Var2 = this.a;
                long j = yn3Var2.e;
                if (j > 0 && jCurrentTimeMillis >= j) {
                    yn3Var2.f = jCurrentTimeMillis - j;
                }
                yn3Var2.g = false;
            }
        }
    }
}
