package defpackage;

import com.leanplum.internal.Constants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class d42 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o62 b;

    public /* synthetic */ d42(o62 o62Var, byte b) {
        this.a = b;
        this.b = o62Var;
    }

    public final Object invoke(Object obj) throws JSONException {
        Object y32Var;
        ru4 ru4Var;
        su4 su4Var;
        ou4 ou4Var;
        byte b = this.a;
        o62 o62Var = this.b;
        switch (b) {
            case 0:
                orb orbVar = (orb) obj;
                d42 d42Var = new d42(o62Var, (byte) 1);
                if (orbVar.a.has("error")) {
                    orb orbVarC = orbVar.c("error");
                    o62Var.n(new rw7(new cqb(orbVarC.a.getInt("code"), orbVarC.e(Constants.Params.MESSAGE))));
                } else {
                    d42Var.invoke(orbVar);
                }
                break;
            default:
                orb orbVarC2 = ((orb) obj).c("result");
                JSONObject jSONObject = orbVarC2.a;
                if (jSONObject.has("chat")) {
                    orb orbVarC3 = orbVarC2.c("chat");
                    JSONObject jSONObject2 = orbVarC3.a;
                    long j = jSONObject2.getLong("chatId");
                    String strE = orbVarC3.e("title");
                    String strM = orbVarC3.m(Constants.Params.USER_ID, null);
                    String strE2 = orbVarC3.e("position");
                    ru4[] ru4VarArrValues = ru4.values();
                    int length = ru4VarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            ru4Var = ru4.UNDEFINED;
                        } else {
                            ru4Var = ru4VarArrValues[i];
                            if (ru4Var == ru4.UNDEFINED || !strE2.equals(ru4Var.a)) {
                                i++;
                            }
                        }
                    }
                    ru4 ru4Var2 = ru4Var;
                    String strE3 = orbVarC3.e(Constants.Params.STATE);
                    su4[] su4VarArrValues = su4.values();
                    int length2 = su4VarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            su4Var = su4.UNDEFINED;
                        } else {
                            su4Var = su4VarArrValues[i2];
                            if (su4Var == su4.UNDEFINED || !strE3.equals(su4Var.a)) {
                                i2++;
                            }
                        }
                    }
                    su4 su4Var2 = su4Var;
                    boolean z = jSONObject2.getBoolean("hasContent");
                    Boolean boolK = orbVarC3.k("isPrivate");
                    orb orbVarI = orbVarC3.i("modifiers");
                    qu4 qu4VarI = orbVarI != null ? sfe.I(orbVarI) : null;
                    ArrayList arrayList = new ArrayList();
                    vpb vpbVarB = orbVarC3.b(Constants.Keys.MESSAGES);
                    int length3 = vpbVarB.a.length();
                    int i3 = 0;
                    while (i3 < length3) {
                        orb orbVarC4 = vpbVarB.c(i3);
                        String strE4 = orbVarC4.e("author");
                        vpb vpbVar = vpbVarB;
                        ou4[] ou4VarArrValues = ou4.values();
                        boolean z2 = z;
                        int length4 = ou4VarArrValues.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length4) {
                                int i5 = i4;
                                ou4Var = ou4VarArrValues[i5];
                                int i6 = length4;
                                if (ou4Var == ou4.UNDEFINED || !strE4.equals(ou4Var.a)) {
                                    i4 = i5 + 1;
                                    length4 = i6;
                                }
                            } else {
                                ou4Var = ou4.UNDEFINED;
                            }
                        }
                        arrayList.add(new mu4(ou4Var, orbVarC4.e("msg")));
                        i3++;
                        vpbVarB = vpbVar;
                        z = z2;
                    }
                    y32Var = new v32(new gu4(j, strE, strM, ru4Var2, su4Var2, z, boolK, qu4VarI, arrayList));
                } else if (jSONObject.has("error")) {
                    orb orbVarC5 = orbVarC2.c("error");
                    orbVarC5.a.getLong("code");
                    orbVarC5.e(Constants.Params.MESSAGE);
                    y32Var = new w32();
                } else {
                    y32Var = new y32();
                }
                o62Var.n(new sw7(y32Var));
                break;
        }
        return Unit.a;
    }
}
