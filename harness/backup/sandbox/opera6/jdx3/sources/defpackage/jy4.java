package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Toast;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class jy4 implements View.OnClickListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ jy4(byte b) {
        this.a = b;
    }

    private final void a(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                view.findViewById(2131362306).performClick();
                break;
            case 1:
                break;
            case 2:
                z77 z77VarU = sfe.U(view.getContext());
                String strG = vtp.G(1, view.getContext());
                qxh qxhVar = strG != null ? new qxh(strG) : null;
                gkj gkjVar = new gkj(false, false);
                gkjVar.a = null;
                gkjVar.b = null;
                gkjVar.c = null;
                gkjVar.d = "Install Referrer";
                gkjVar.e = null;
                gkjVar.f = null;
                gkjVar.g = null;
                gkjVar.h = null;
                gkjVar.i = null;
                gkjVar.j = null;
                gkjVar.k = 0;
                gkjVar.l = 0;
                gkjVar.m = 0;
                gkjVar.n = true;
                gkjVar.o = qxhVar;
                z77VarU.getClass();
                z77VarU.b(gkjVar, ijm.b);
                break;
            default:
                ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("token", ((OperaListItem) view).B.D()));
                Toast.makeText(view.getContext(), "Copied to clipboard", 1).show();
                break;
        }
    }
}
