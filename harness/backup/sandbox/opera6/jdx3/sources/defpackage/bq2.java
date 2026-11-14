package defpackage;

import android.app.ProgressDialog;
import com.opera.android.autofill.AddressEditorManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class bq2 implements AddressEditorManager.RegionsReceiver {
    public final /* synthetic */ iq2 a;

    public bq2(iq2 iq2Var) {
        this.a = iq2Var;
    }

    @Override // com.opera.android.autofill.AddressEditorManager.RegionsReceiver
    public final void a(String str, Map map) {
        iq2 iq2Var = this.a;
        ArrayList arrayList = iq2Var.D;
        if (!str.equals(iq2Var.I0()) || iq2Var.E) {
            return;
        }
        iq2Var.E = true;
        if (!map.isEmpty()) {
            arrayList.add(new sp2("", iq2Var.getContext().getString(2132017668)));
            arrayList.addAll(iq2.L0(map));
        }
        dt1 dt1Var = iq2Var.u;
        int i = 0;
        while (true) {
            if (i >= ((List) dt1Var.c).size()) {
                break;
            }
            if (((fw) ((List) dt1Var.c).get(i)).a == ew.ADMIN_AREA) {
                dt1Var.notifyItemChanged(i);
                break;
            }
            i++;
        }
        ProgressDialog progressDialog = iq2Var.z;
        if (progressDialog != null && progressDialog.isShowing()) {
            iq2Var.z.dismiss();
        }
        iq2Var.z = null;
    }
}
