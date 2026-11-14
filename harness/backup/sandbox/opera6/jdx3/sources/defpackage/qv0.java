package defpackage;

import com.leanplum.internal.Constants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class qv0 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qv0(long j, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
    }

    public /* synthetic */ qv0(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public final Object invoke(Object obj) throws Exception {
        wsk wskVarH;
        byte b = this.a;
        long j = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                rv0 rv0Var = (rv0) obj2;
                wskVarH = ((osk) obj).h("SELECT * from chat_message WHERE chat = ? ORDER BY id ASC");
                try {
                    wskVarH.T0(1, j);
                    int iF = hyg.f(wskVarH, "id");
                    int iF2 = hyg.f(wskVarH, "chat");
                    int iF3 = hyg.f(wskVarH, "source");
                    int iF4 = hyg.f(wskVarH, "content");
                    int iF5 = hyg.f(wskVarH, "created");
                    int iF6 = hyg.f(wskVarH, "urls");
                    int iF7 = hyg.f(wskVarH, Constants.Params.NAME);
                    int iF8 = hyg.f(wskVarH, Constants.Params.MESSAGE_ID);
                    ArrayList arrayList = new ArrayList();
                    while (wskVarH.n()) {
                        long j2 = wskVarH.getLong(iF);
                        long j3 = wskVarH.getLong(iF2);
                        String strL = wskVarH.l(iF3);
                        rv0Var.getClass();
                        lu4 lu4VarA = rv0.a(strL);
                        String strL2 = wskVarH.l(iF4);
                        long j4 = wskVarH.getLong(iF5);
                        JSONArray jSONArray = new JSONArray(wskVarH.l(iF6));
                        ArrayList arrayList2 = new ArrayList();
                        int i = iF;
                        int length = jSONArray.length();
                        int i2 = iF2;
                        int i3 = 0;
                        while (i3 < length) {
                            int i4 = length;
                            Object obj3 = jSONArray.get(i3);
                            int i5 = iF3;
                            if (obj3 == JSONObject.NULL) {
                                throw new JSONException(u35.g(i3, " is null"));
                            }
                            arrayList2.add(String.valueOf(obj3));
                            i3++;
                            length = i4;
                            iF3 = i5;
                        }
                        int i6 = iF3;
                        arrayList.add(new nu4(j2, j3, lu4VarA, strL2, j4, arrayList2, wskVarH.isNull(iF7) ? null : wskVarH.l(iF7), wskVarH.isNull(iF8) ? null : wskVarH.l(iF8)));
                        iF = i;
                        iF2 = i2;
                        iF3 = i6;
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                oi9 oi9Var = (oi9) obj2;
                wskVarH = ((osk) obj).h("UPDATE football_events SET source = ? WHERE oscoreId = ?");
                try {
                    wskVarH.T0(1, oi9Var.a);
                    wskVarH.T0(2, j);
                    wskVarH.n();
                    return Unit.a;
                } finally {
                }
            case 2:
                return wlc.c((wlc) obj2, j, (mt5) obj);
            default:
                mk7.z0((mk7) obj, this.b, 0L, djh.b(((Number) ((iak) obj2).getValue()).floatValue(), 0.0f, 1.0f), 118);
                return Unit.a;
        }
    }
}
