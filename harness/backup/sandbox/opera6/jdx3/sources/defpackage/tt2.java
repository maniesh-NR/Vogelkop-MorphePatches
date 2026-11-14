package defpackage;

import android.graphics.Bitmap;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class tt2 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tt2(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ tt2(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                AutofillPasswordPickerActivity autofillPasswordPickerActivity = (AutofillPasswordPickerActivity) obj2;
                a4g a4gVar = (a4g) obj;
                int i2 = AutofillPasswordPickerActivity.o;
                w3g w3gVarB = a4gVar.b(i);
                if (w3gVarB != null) {
                    autofillPasswordPickerActivity.G(w3gVarB, a4gVar.c(w3gVarB));
                    return;
                }
                return;
            case 1:
                hu2 hu2Var = (hu2) obj2;
                a4g a4gVar2 = (a4g) obj;
                w3g w3gVarB2 = a4gVar2.b(i);
                if (w3gVarB2 != null) {
                    hu2Var.d.G(w3gVarB2, a4gVar2.c(w3gVarB2));
                    return;
                }
                return;
            case 2:
                Callback callback = (Callback) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    callback.run(yni.a(bitmap, 0, i));
                    return;
                } else {
                    callback.run(null);
                    return;
                }
            case 3:
                g77 g77Var = (g77) obj2;
                ArrayList arrayList = (ArrayList) g77Var.b;
                arrayList.set(i, obj);
                LinkedHashSet linkedHashSet = (LinkedHashSet) g77Var.c;
                if (!linkedHashSet.isEmpty()) {
                    linkedHashSet.remove(Integer.valueOf(i));
                    if (!linkedHashSet.isEmpty()) {
                        return;
                    }
                }
                wx wxVar = (wx) g77Var.a;
                if (wxVar != null) {
                    wxVar.run(arrayList);
                    return;
                }
                return;
            case 4:
                vr3 vr3Var = (vr3) obj2;
                vr3Var.a--;
                ArrayList arrayList2 = (ArrayList) vr3Var.d;
                arrayList2.set(i, obj);
                if (vr3Var.b && vr3Var.a == 0) {
                    ((Callback) vr3Var.c).run(CollectionsKt.k0(arrayList2));
                    return;
                }
                return;
            case 5:
                bg7 bg7Var = (bg7) obj2;
                bg7Var.finish(hjm.a);
                ((ydn) bg7Var.b).C(false);
                bg7Var.d();
                if (i == 0) {
                    throw null;
                }
                vx3 vx3VarA = ay3.a("https://support-vpn-pro.opera.com/", lqm.v, false);
                vx3VarA.b = 3;
                o18.t(vx3VarA, true, vx3VarA);
                return;
            case 6:
                agm agmVar = (agm) obj2;
                dwh dwhVar = (dwh) obj;
                agmVar.getClass();
                dwhVar.c(jkn.a);
                gvh gvhVar = dwhVar.b;
                gvhVar.b(i, i);
                dwhVar.b();
                dwhVar.j();
                gvhVar.c((nb9) agmVar.c);
                return;
            default:
                onn onnVar = ((qln) obj2).d;
                onnVar.c((aln) obj, i, iu0.b);
                onnVar.a();
                return;
        }
    }
}
