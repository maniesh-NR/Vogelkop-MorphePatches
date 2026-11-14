package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class nse {
    public final short a;
    public final Serializable b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public nse(int i, lse lseVar) {
        this.b = new ArrayList();
        this.a = i;
        this.c = lseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nse(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.b = uuid;
        this.a = i;
        this.c = bArr;
    }

    public final void a() {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        short s = this.a;
        if (size > s) {
            arrayList.subList(0, arrayList.size() - s).clear();
        }
    }

    public final ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(((lse) this.c).A(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    public boolean c(List list) {
        return ((ArrayList) this.b).removeAll(list);
    }

    public final JSONArray d() throws JSONException {
        ArrayList arrayList = (ArrayList) this.b;
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(i, ((lse) this.c).y(arrayList.get(i)));
        }
        return jSONArray;
    }
}
