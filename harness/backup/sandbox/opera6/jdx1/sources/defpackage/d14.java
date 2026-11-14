package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d14 {
    public final ArrayList a;

    public d14(byte b) {
        switch (b) {
            case 1:
                this.a = new ArrayList();
                break;
            case 2:
                this.a = new ArrayList();
                break;
            case 3:
            default:
                this.a = new ArrayList();
                break;
            case 4:
                this.a = new ArrayList();
                break;
        }
    }

    public d14(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new f2h(jSONObjectOptJSONObject));
                }
            }
        }
        this.a = arrayList;
    }

    public final void a(Path path) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h7m h7mVar = (h7m) arrayList.get(size);
            f30 f30Var = dzm.a;
            if (h7mVar != null && !h7mVar.a) {
                dzm.a(path, h7mVar.d.k() / 100.0f, h7mVar.e.k() / 100.0f, h7mVar.f.k() / 360.0f);
            }
        }
    }

    public final void b(k43 k43Var) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.a;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (((twh) arrayList.get(i)).a == k43Var) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
    }
}
