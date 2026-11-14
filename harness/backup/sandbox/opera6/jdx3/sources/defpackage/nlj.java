package defpackage;

import com.appsflyer.internal.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class nlj extends si {
    public final k06 a;
    public final HashMap b;
    public final String c;
    public final String d;
    public final long e;

    public nlj(k06 k06Var, HashMap map, String str, String str2, long j) {
        this.a = k06Var;
        this.b = map;
        this.c = str;
        if (str2 == null || str2.indexOf("{choiceId}") >= 0) {
            this.d = str2;
        } else {
            this.d = null;
        }
        this.e = j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static nlj b(orb orbVar, long j) throws JSONException {
        k06 i06Var;
        md8 md8Var;
        orb orbVarC = orbVar.c("creative");
        String strE = orbVarC.e("creativeType");
        char c = 65535;
        switch (strE.hashCode()) {
            case 100313435:
                if (strE.equals("image")) {
                    c = 0;
                    break;
                }
                break;
            case 112202875:
                if (strE.equals("video")) {
                    c = 1;
                    break;
                }
                break;
            case 1547089679:
                if (strE.equals("BIG_CARD")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i06Var = new i06((byte) 0);
                orbVarC.e("imageUrl");
                break;
            case 1:
                i06Var = new j06((byte) 0);
                orbVarC.e("videoUrl");
                break;
            case 2:
                i06Var = new h06(orbVarC);
                break;
            default:
                o.a("Unexpected creative type");
                return null;
        }
        k06 k06Var = i06Var;
        vpb vpbVarB = orbVar.b("eventTrackers");
        int length = vpbVarB.a.length();
        HashMap map = new HashMap(length);
        for (int i = 0; i < length; i++) {
            orb orbVarC2 = vpbVarB.c(i);
            String strE2 = orbVarC2.e("eventType");
            md8[] md8VarArrValues = md8.values();
            int length2 = md8VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    md8Var = md8VarArrValues[i2];
                    if (!md8Var.a.equalsIgnoreCase(strE2)) {
                        i2++;
                    }
                } else {
                    md8Var = null;
                }
            }
            if (md8Var != null) {
                vpb vpbVarB2 = orbVarC2.b("urls");
                int length3 = vpbVarB2.a.length();
                ArrayList arrayList = new ArrayList(length3);
                for (int i3 = 0; i3 < length3; i3++) {
                    arrayList.add(vpbVarB2.d(i3));
                }
                if (map.put(md8Var, arrayList) != null) {
                    throw new JSONException("Duplicate event type: " + md8Var);
                }
            }
        }
        if (map.get(md8.CLICK) == null || map.get(md8.IMPRESSION) == null) {
            o.a("Missing non-optional event type(s)");
            return null;
        }
        String strE3 = orbVar.e("clickUrl");
        String strE4 = orbVar.a.isNull("adChoiceUrl") ? null : orbVar.e("adChoiceUrl");
        if (strE4 != null) {
            strE4 = strE4.replace("%7BchoiceId%7D", "{choiceId}").replace("%7bchoiceId%7d", "{choiceId}");
        }
        return new nlj(k06Var, map, strE3, strE4, j);
    }

    @Override // defpackage.si
    public final yz a(ez ezVar, ami amiVar, int i) {
        int iIndexOf;
        k06 k06Var = this.a;
        if (!k06Var.c()) {
            t3p.o();
            return null;
        }
        String str = Arrays.hashCode(new Object[]{Integer.valueOf(k06Var.hashCode()), Integer.valueOf(amiVar.hashCode())}) + "," + i;
        h06 h06VarF = k06Var.f();
        md8 md8Var = md8.IMPRESSION;
        HashMap map = this.b;
        List list = (List) map.get(md8Var);
        List list2 = (List) map.get(md8.CLICK);
        String str2 = this.d;
        List listUnmodifiableList = (str2 == null || (iIndexOf = str2.indexOf("{choiceId}")) == -1) ? Collections.EMPTY_LIST : Collections.unmodifiableList(Arrays.asList(new ri(wz.a, p37.v0(iIndexOf, str2, "1")), new ri(wz.d, p37.v0(iIndexOf, str2, "2")), new ri(wz.b, p37.v0(iIndexOf, str2, "3")), new ri(wz.c, p37.v0(iIndexOf, str2, "4"))));
        return new gu9(ezVar, h06VarF, list, list2, amiVar, this.c, listUnmodifiableList, str, this.e);
    }
}
