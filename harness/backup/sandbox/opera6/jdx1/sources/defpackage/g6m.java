package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g6m {
    public static final g6m f = new g6m();
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static Handler h = null;
    public static final bw1 i = new bw1((byte) 5);
    public static final bw1 j = new bw1((byte) 6);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final xio d = new xio((byte) 0);
    public final qsh c = new qsh((byte) 13);
    public final iuh e = new iuh(new wtm((byte) 8));

    public static void b() {
        if (h == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            h = handler;
            handler.post(i);
            h.postDelayed(j, 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view, is7 is7Var, JSONObject jSONObject, boolean z) {
        Object obj;
        Object[] objArr;
        if (cgh.c(view) == null) {
            xio xioVar = this.d;
            char c = xioVar.d.contains(view) ? (char) 1 : xioVar.j ? (char) 2 : (char) 3;
            if (c != 3) {
                JSONObject jSONObjectA = is7Var.a(view);
                yqo.c(jSONObject, jSONObjectA);
                HashMap map = xioVar.a;
                if (map.size() == 0) {
                    obj = null;
                } else {
                    Object obj2 = (String) map.get(view);
                    if (obj2 != null) {
                        map.remove(view);
                    }
                    obj = obj2;
                }
                boolean z2 = false;
                if (obj != null) {
                    try {
                        jSONObjectA.put("adSessionId", obj);
                    } catch (JSONException unused) {
                    }
                    WeakHashMap weakHashMap = xioVar.i;
                    if (weakHashMap.containsKey(view)) {
                        weakHashMap.put(view, Boolean.TRUE);
                    } else {
                        z2 = true;
                    }
                    try {
                        jSONObjectA.put("hasWindowFocus", Boolean.valueOf(z2));
                    } catch (JSONException unused2) {
                    }
                    boolean zContains = xioVar.h.contains(obj);
                    Object objValueOf = Boolean.valueOf(zContains);
                    if (zContains) {
                        try {
                            jSONObjectA.put("isPipActive", objValueOf);
                        } catch (JSONException unused3) {
                        }
                    }
                    xioVar.j = true;
                    return;
                }
                HashMap map2 = xioVar.b;
                sgo sgoVar = (sgo) map2.get(view);
                if (sgoVar != null) {
                    map2.remove(view);
                    wxo wxoVar = sgoVar.a;
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayList = sgoVar.b;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        jSONArray.put((String) obj3);
                    }
                    try {
                        jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                        jSONObjectA.put("friendlyObstructionClass", wxoVar.b);
                        jSONObjectA.put("friendlyObstructionPurpose", wxoVar.c);
                        jSONObjectA.put("friendlyObstructionReason", wxoVar.d);
                    } catch (JSONException unused4) {
                    }
                    objArr = true;
                } else {
                    objArr = false;
                }
                boolean z3 = z || objArr == true;
                boolean z4 = c == 1;
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (!z4) {
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            a(viewGroup.getChildAt(i3), is7Var, jSONObjectA, z3);
                        }
                        return;
                    }
                    HashMap map3 = new HashMap();
                    for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                        View childAt = viewGroup.getChildAt(i4);
                        ArrayList arrayList2 = (ArrayList) map3.get(Float.valueOf(childAt.getZ()));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            map3.put(Float.valueOf(childAt.getZ()), arrayList2);
                        }
                        arrayList2.add(childAt);
                    }
                    ArrayList arrayList3 = new ArrayList(map3.keySet());
                    Collections.sort(arrayList3);
                    int size2 = arrayList3.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj4 = arrayList3.get(i5);
                        i5++;
                        ArrayList arrayList4 = (ArrayList) map3.get((Float) obj4);
                        int size3 = arrayList4.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            Object obj5 = arrayList4.get(i6);
                            i6++;
                            a((View) obj5, is7Var, jSONObjectA, z3);
                        }
                    }
                }
            }
        }
    }
}
