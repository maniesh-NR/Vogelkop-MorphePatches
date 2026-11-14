package ads_mobile_sdk;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bw1;
import defpackage.w1h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ri3 {
    public static final ri3 g = new ri3();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final bw1 j = new bw1(15);
    public static final bw1 k = new bw1(16);
    public final ji c;
    public final ji e;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final xio d = new xio((byte) 1);

    public ri3() {
        ji jiVar = new ji();
        e7 e7Var = new e7((byte) 15);
        jiVar.a = e7Var;
        jiVar.b = new e7((Object) e7Var, (byte) 3);
        this.c = jiVar;
        os osVar = new os();
        osVar.b = new ArrayDeque();
        osVar.c = null;
        osVar.a = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        ji jiVar2 = new ji();
        jiVar2.b = osVar;
        this.e = jiVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view, e7 e7Var, JSONObject jSONObject, boolean z) {
        Object obj;
        Object[] objArr;
        xio xioVar = this.d;
        HashMap map = xioVar.b;
        WeakHashMap weakHashMap = xioVar.i;
        if (w1h.e(view) == null) {
            char c = xioVar.d.contains(view) ? (char) 1 : xioVar.j ? (char) 2 : (char) 3;
            if (c != 3) {
                JSONObject jSONObjectA = e7Var.a(view);
                v62.a(jSONObject, jSONObjectA);
                HashMap map2 = xioVar.a;
                if (map2.size() == 0) {
                    obj = null;
                } else {
                    obj = (String) map2.get(view);
                    if (obj != null) {
                        map2.remove(view);
                    }
                }
                boolean z2 = false;
                if (obj != null) {
                    try {
                        jSONObjectA.put("adSessionId", obj);
                    } catch (JSONException unused) {
                    }
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
                v9 v9Var = (v9) map.get(view);
                if (v9Var != null) {
                    map.remove(view);
                    es0 es0Var = v9Var.a;
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayList = v9Var.b;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        jSONArray.put((String) obj2);
                    }
                    try {
                        jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                        jSONObjectA.put("friendlyObstructionClass", es0Var.b);
                        jSONObjectA.put("friendlyObstructionPurpose", es0Var.c);
                        jSONObjectA.put("friendlyObstructionReason", (Object) null);
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
                            a(viewGroup.getChildAt(i3), e7Var, jSONObjectA, z3);
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
                        Object obj3 = arrayList3.get(i5);
                        i5++;
                        ArrayList arrayList4 = (ArrayList) map3.get((Float) obj3);
                        int size3 = arrayList4.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            Object obj4 = arrayList4.get(i6);
                            i6++;
                            a((View) obj4, e7Var, jSONObjectA, z3);
                        }
                    }
                }
            }
        }
    }
}
