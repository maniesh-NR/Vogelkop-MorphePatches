package defpackage;

import ads_mobile_sdk.cg0;
import ads_mobile_sdk.cs1;
import ads_mobile_sdk.cy0;
import ads_mobile_sdk.fq1;
import android.content.DialogInterface;
import android.widget.ListView;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final /* synthetic */ class dyi implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dyi(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((rn9) obj2).G(rn9.v((ListView) obj));
                break;
            case 1:
                cg0.a((cg0) obj2, (String) obj);
                break;
            case 2:
                fq1 fq1Var = (fq1) obj2;
                na2.B(fq1Var.d, null, null, new cek((Object) fq1Var, obj, (Object) "Operation denied by user.", (mt5) null, (byte) 14), 3);
                break;
            default:
                Regex regex = cs1.i;
                ((cs1) obj2).a("User canceled the download.", (cy0) obj, false);
                break;
        }
    }
}
