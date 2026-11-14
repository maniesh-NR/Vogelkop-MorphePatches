package defpackage;

import android.content.DialogInterface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q8b implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tn b;

    public q8b(tn tnVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = tnVar;
                break;
            default:
                Objects.requireNonNull(tnVar);
                this.b = tnVar;
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        tn tnVar = this.b;
        switch (b) {
            case 0:
                tnVar.v();
                break;
            default:
                tnVar.a = true;
                ((ga6) tnVar.d).q(Double.NaN);
                break;
        }
    }
}
