package defpackage;

import J.N;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.fragment.app.i;
import java.util.Objects;
import org.chromium.content.browser.input.DateTimeChooserAndroid;

/* loaded from: classes.dex */
public final class r8b implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r8b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public r8b(tn tnVar) {
        this.a = (byte) 0;
        Objects.requireNonNull(tnVar);
        this.b = tnVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                tn tnVar = (tn) obj;
                if (((AlertDialog) tnVar.c) == dialogInterface && !tnVar.a) {
                    tnVar.a = true;
                    long j = ((DateTimeChooserAndroid) ((ga6) tnVar.d).b).a;
                    if (j != 0) {
                        N.MCtaZNwj(j);
                        break;
                    }
                }
                break;
            case 1:
                tn tnVar2 = (tn) obj;
                if (!tnVar2.a) {
                    tnVar2.a = true;
                    long j2 = ((DateTimeChooserAndroid) ((ga6) tnVar2.d).b).a;
                    if (j2 != 0) {
                        N.MCtaZNwj(j2);
                        break;
                    }
                }
                break;
            default:
                i iVar = (i) obj;
                if (i.access$000(iVar) != null) {
                    iVar.onDismiss(i.access$000(iVar));
                    break;
                }
                break;
        }
    }
}
