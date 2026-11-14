package defpackage;

import android.os.Bundle;
import androidx.fragment.app.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class y51 implements oki {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y51(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ y51(nd3 nd3Var, kw6 kw6Var) {
        this.a = (byte) 0;
        this.b = kw6Var;
    }

    @Override // defpackage.oki
    public final Bundle a() {
        Pair[] pairArr;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kw6 kw6Var = (kw6) obj;
                Bundle bundle = new Bundle();
                if (Boolean.TRUE.booleanValue()) {
                    k2j k2jVarC = kw6Var.c();
                    bundle.putParcelable("STATE_KEEPER_STATE", new g0n(k2jVarC, z4c.b(new gb3(k2jVarC, k2j.Companion.serializer(), (byte) 9))));
                }
                return bundle;
            case 1:
                return xd5.m((xd5) obj);
            case 2:
                Map mapD = ((wji) obj).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapD.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 3:
                return ((w) obj).f0();
            default:
                x79 x79Var = (x79) obj;
                for (Map.Entry entry2 : rbd.i((LinkedHashMap) x79Var.d).entrySet()) {
                    x79Var.V(((nak) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : rbd.i((LinkedHashMap) x79Var.b).entrySet()) {
                    x79Var.V(((oki) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) x79Var.a;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return ic4.m((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
