package defpackage;

import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class poo {
    public static final EnumMap a = new EnumMap(w06.class);

    public static uuj a(String str, pqo pqoVar) {
        uuj uujVar;
        fio fioVar;
        bio bioVar;
        ArrayList arrayList;
        int i;
        w06 w06Var;
        vho vhoVar;
        pqo pqoVar2 = pqoVar;
        dro droVar = pqoVar2.d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("sessionId");
            int iOptInt = jSONObject.optInt("statusCode");
            jSONObject.optString(Constants.Params.MESSAGE);
            long jOptLong = jSONObject.optLong("expireTimestamp");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("fetchConfig");
            int i2 = 0;
            if (jSONObjectOptJSONObject != null) {
                int iOptInt2 = jSONObjectOptJSONObject.optInt("reqNum");
                int iOptInt3 = jSONObjectOptJSONObject.optInt("minAdNumInCache");
                int iOptInt4 = jSONObjectOptJSONObject.optInt("videoAutoPlayFlag");
                int iOptInt5 = jSONObjectOptJSONObject.optInt("te", 0);
                int iOptInt6 = jSONObjectOptJSONObject.optInt("d", 20);
                int iOptInt7 = jSONObjectOptJSONObject.optInt("td", 500);
                int iOptInt8 = jSONObjectOptJSONObject.optInt("tb", 0);
                boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("acceptsClickOnEntireAd", false);
                String strOptString = jSONObjectOptJSONObject.optString("updatedAdServerUrl");
                fio fioVar2 = new fio(iOptInt5, iOptInt6, iOptInt7, iOptInt8, pqoVar2.e, pqoVar2.f);
                bioVar = new bio(iOptInt2, iOptInt3, iOptInt4, strOptString, zOptBoolean);
                fioVar = fioVar2;
            } else {
                fioVar = null;
                bioVar = null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ads");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                uujVar = null;
                arrayList = null;
            } else {
                arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                int i3 = 0;
                while (i3 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                    String strOptString2 = jSONObject2.optString("creativeType");
                    w06[] w06VarArrValues = w06.values();
                    int length = w06VarArrValues.length;
                    int i4 = i2;
                    uujVar = null;
                    while (true) {
                        if (i4 >= length) {
                            i = i3;
                            w06Var = w06.v;
                            break;
                        }
                        try {
                            w06Var = w06VarArrValues[i4];
                            i = i3;
                            if (w06Var.a.equals(strOptString2)) {
                                break;
                            }
                            i4++;
                            i3 = i;
                        } catch (JSONException e) {
                            e = e;
                            e.getMessage();
                            return uujVar;
                        }
                    }
                    if (droVar.a.contains(w06Var)) {
                        long jOptLong2 = jSONObject2.optLong("endTime");
                        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("adParts");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                            vhoVar = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList(jSONArrayOptJSONArray2.length());
                            for (int i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                                lho lhoVarB = b(jSONArrayOptJSONArray2.getJSONObject(i5), droVar);
                                if (lhoVarB != null) {
                                    arrayList2.add(lhoVarB);
                                }
                            }
                            vhoVar = new vho(w06Var, arrayList2, jOptLong, jOptLong2, pqoVar2, fioVar);
                        }
                        if (vhoVar != null) {
                            arrayList.add(vhoVar);
                        }
                    }
                    i3 = i + 1;
                    pqoVar2 = pqoVar;
                    i2 = 0;
                }
                uujVar = null;
            }
            uuj uujVar2 = new uuj();
            uujVar2.a = iOptInt;
            uujVar2.b = arrayList;
            uujVar2.c = bioVar;
            return uujVar2;
        } catch (JSONException e2) {
            e = e2;
            uujVar = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.lho b(org.json.JSONObject r26, defpackage.dro r27) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.poo.b(org.json.JSONObject, dro):lho");
    }

    public static JSONArray c(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y5p y5pVar = (y5p) it.next();
            if (!y5pVar.b.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = y5pVar.b.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put((String) it2.next());
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(y5pVar.a, jSONArray2);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public static ArrayList d(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }
}
