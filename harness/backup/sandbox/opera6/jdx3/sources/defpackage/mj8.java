package defpackage;

import android.view.View;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class mj8 extends njf {
    public final nj8 a;
    public final dg7 b;
    public boolean c;

    public mj8(nj8 nj8Var, dg7 dg7Var) {
        this.a = nj8Var;
        this.b = dg7Var;
    }

    @Override // defpackage.njf
    public final int a(int i) {
        return i;
    }

    @Override // defpackage.njf
    public final void b() {
        this.a.W();
    }

    @Override // defpackage.njf
    public final void c(View view, float f) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        int i = OperaBottomSheetBehavior.C(view).q;
        dg7 dg7Var = this.b;
        if (i == 3) {
            dg7Var.run(Float.valueOf(1.0f));
        } else {
            dg7Var.run(Float.valueOf(f));
        }
        this.a.K();
    }

    @Override // defpackage.njf
    public final void d(int i) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        dg7 dg7Var = this.b;
        switch (i) {
            case 1:
            case 2:
                this.c = true;
                break;
            case 3:
                dg7Var.run(Float.valueOf(1.0f));
                break;
            case 4:
            case 5:
                dg7Var.run(Float.valueOf(0.0f));
                break;
            case 6:
                dg7Var.run(Float.valueOf(-1.0f));
                if (this.c) {
                    this.a.F();
                    break;
                }
                break;
        }
    }
}
