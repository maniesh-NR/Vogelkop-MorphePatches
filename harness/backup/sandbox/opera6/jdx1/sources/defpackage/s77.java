package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public final class s77 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s77(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                i iVar = (i) obj;
                if (iVar.mDialog != null) {
                    iVar.onCancel(iVar.mDialog);
                    break;
                }
                break;
            default:
                ((rn9) obj).G((int[]) null);
                break;
        }
    }
}
