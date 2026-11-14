package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.CollectionsKt;
import org.chromium.ui.base.SelectFileDialog;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public final /* synthetic */ class hg7 implements ue7, Continuation, did, lp4, p9g {
    public final /* synthetic */ Object a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hg7(Context context, Intent intent, boolean z) {
        this.a = context;
        this.c = intent;
        this.b = z;
    }

    public /* synthetic */ hg7(Object obj, Object obj2, boolean z) {
        this.c = obj;
        this.a = obj2;
        this.b = z;
    }

    public /* synthetic */ hg7(Object obj, boolean z, Object obj2) {
        this.c = obj;
        this.b = z;
        this.a = obj2;
    }

    @Override // defpackage.ue7
    public final void a(Uri uri, String str) {
        jg7 jg7Var = (jg7) this.c;
        jg7Var.b.q((Context) this.a, jg7Var.j, uri, str, this.b);
    }

    public final void c(ssa ssaVar, int i) {
        ssaVar.X(((gid) this.c).c, i, ((pf2) this.a).c(), this.b);
    }

    @Override // defpackage.lp4
    public final void d(ArrayList arrayList, boolean z) {
        bue bueVar = (bue) this.c;
        l0c l0cVar = (l0c) this.a;
        if (arrayList == null) {
            bueVar.c.run(new rw7(xle.b));
            return;
        }
        if (!this.b) {
            l0cVar = null;
        }
        yqe yqeVar = yqe.d;
        if (arrayList.contains(yqeVar)) {
            bueVar.c(l0cVar, arrayList);
        } else {
            bueVar.c(l0cVar, CollectionsKt.V(arrayList, Collections.singletonList(yqeVar)));
        }
    }

    public final void k(int[] iArr, String[] strArr) {
        SelectFileDialog selectFileDialog = (SelectFileDialog) this.c;
        String[] strArr2 = (String[]) this.a;
        String[] strArr3 = SelectFileDialog.n;
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == -1) {
                if (selectFileDialog.e) {
                    selectFileDialog.m();
                    return;
                }
                if (!this.b) {
                    continue;
                } else {
                    if (strArr.length != strArr2.length) {
                        throw new RuntimeException(String.format("Permissions arrays misaligned: %d != %d", Integer.valueOf(strArr.length), Integer.valueOf(strArr2.length)));
                    }
                    if (!strArr[i].equals(strArr2[i])) {
                        h9o.r(p3p.w("Permissions arrays don't match: ", strArr[i], " != ", strArr2[i]));
                        return;
                    }
                    if (strArr[i].equals("android.permission.READ_EXTERNAL_STORAGE") || strArr[i].equals("android.permission.READ_MEDIA_IMAGES") || strArr[i].equals("android.permission.READ_MEDIA_VIDEO")) {
                        b2b b2bVar = WindowAndroid.B;
                        String string = t8.a.getString(2132020434);
                        if (string != null) {
                            arl.a(t8.a, 0, string).b();
                        }
                        selectFileDialog.m();
                        return;
                    }
                }
            }
        }
        selectFileDialog.k();
    }

    public final Object then(Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? esg.n((Context) this.a, (Intent) this.c, this.b).continueWith(new bx1((byte) 2), new yt7((byte) 15)) : task;
    }
}
