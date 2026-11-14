package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class n8b extends InputConnectionWrapper {
    public final /* synthetic */ bm8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8b(InputConnection inputConnection, bm8 bm8Var) {
        super(inputConnection, false);
        this.a = bm8Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        oq5 nq5Var;
        xm5 xm5Var = inputContentInfo == null ? null : new xm5(new qq6(inputContentInfo, (byte) 21));
        bq1 bq1Var = (bq1) this.a.b;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((qq6) xm5Var.a).b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((qq6) xm5Var.a).b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception unused) {
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((qq6) xm5Var.a).b;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            nq5Var = new nq5(clipData, 2);
        } else {
            pq5 pq5Var = new pq5();
            pq5Var.b = clipData;
            pq5Var.c = (byte) 2;
            nq5Var = pq5Var;
        }
        nq5Var.a(inputContentInfo3.getLinkUri());
        nq5Var.setExtras(bundle2);
        if (r5n.i(bq1Var, nq5Var.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
