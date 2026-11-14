package defpackage;

import androidx.recyclerview.widget.i;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class cm8 implements jvk {
    public final /* synthetic */ dg7 a;
    public final /* synthetic */ dm8 b;

    public cm8(dm8 dm8Var, dg7 dg7Var) {
        this.a = dg7Var;
        this.b = dm8Var;
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = this.b.w;
        hvkVarArr[1] = mvkVar;
        hvkVarArr[0] = mvkVar;
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str = ((pmj) iVar).c;
        if (str == null) {
            return;
        }
        this.a.run(str);
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        return true;
    }
}
