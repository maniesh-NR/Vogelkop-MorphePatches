package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.opera.android.browser.obml.Platform;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ceg extends Handler {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ceg(Looper looper, byte b) {
        super(looper);
        this.a = b;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == 3) {
                    dc dcVar = (dc) message.obj;
                    dcVar.a.getClass();
                    dcVar.a.a(dcVar.d());
                    return;
                }
                if (i != 8) {
                    if (i != 13) {
                        throw new AssertionError("Unknown handler message received: " + message.what);
                    }
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        dc dcVar2 = (dc) list.get(i2);
                        deg degVar = dcVar2.a;
                        degVar.getClass();
                        Bitmap bitmapJ = (dcVar2.e & 1) == 0 ? degVar.j(dcVar2.h) : null;
                        if (bitmapJ != null) {
                            degVar.d(bitmapJ, 1, dcVar2, (Exception) null);
                        } else {
                            degVar.e(dcVar2);
                        }
                    }
                    return;
                }
                List list2 = (List) message.obj;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    sg3 sg3Var = (sg3) list2.get(i3);
                    deg degVar2 = sg3Var.a;
                    degVar2.getClass();
                    dc dcVar3 = sg3Var.j;
                    ArrayList arrayList = sg3Var.k;
                    boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
                    if (dcVar3 != null || z) {
                        Exception exc = sg3Var.o;
                        Bitmap bitmap = sg3Var.l;
                        int i4 = sg3Var.n;
                        if (dcVar3 != null) {
                            degVar2.d(bitmap, i4, dcVar3, exc);
                        }
                        if (z) {
                            int size3 = arrayList.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                degVar2.d(bitmap, i4, (dc) arrayList.get(i5), exc);
                            }
                        }
                    }
                }
                return;
            case 1:
                removeMessages(1);
                Context context = Platform.a;
                try {
                    int iM2alLUrR = N.M2alLUrR();
                    if (iM2alLUrR >= 0) {
                        Platform.requestSlice(iM2alLUrR);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Platform.requestSlice(1);
                    throw th;
                }
            case 2:
            default:
                super.handleMessage(message);
                return;
            case 3:
                sendMessageDelayed(obtainMessage(), 1000L);
                return;
        }
    }
}
