package defpackage;

import android.widget.TextView;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class nzg implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ozg b;
    public final /* synthetic */ byte[][] c;
    public final /* synthetic */ TextView d;

    public /* synthetic */ nzg(ozg ozgVar, byte[][] bArr, TextView textView, byte b) {
        this.a = b;
        this.b = ozgVar;
        this.c = bArr;
        this.d = textView;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        xzg parentFragment;
        byte b = this.a;
        TextView textView = this.d;
        byte[][] bArr = this.c;
        ozg ozgVar = this.b;
        switch (b) {
            case 0:
                umi umiVar = ozgVar.a;
                ozgVar.d.n0(en0.j);
                if (!ozgVar.e) {
                    ozgVar.g0(new qq4(umiVar, bArr, ozgVar.c, false));
                    break;
                } else {
                    parentFragment = ozgVar.getParentFragment() instanceof xzg ? ozgVar.getParentFragment() : null;
                    if (parentFragment != null) {
                        parentFragment.dismiss();
                    }
                    zhj.a(new rq4(umiVar, bArr, false), -1).c(textView.getContext());
                    break;
                }
            default:
                umi umiVar2 = ozgVar.a;
                ozgVar.d.n0(en0.m);
                if (!ozgVar.e) {
                    ozgVar.g0(new qq4(umiVar2, bArr, ozgVar.c, true));
                    break;
                } else {
                    parentFragment = ozgVar.getParentFragment() instanceof xzg ? ozgVar.getParentFragment() : null;
                    if (parentFragment != null) {
                        parentFragment.dismiss();
                    }
                    zhj.a(new rq4(umiVar2, bArr, true), -1).c(textView.getContext());
                    break;
                }
        }
    }
}
