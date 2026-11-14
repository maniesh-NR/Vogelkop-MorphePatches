package defpackage;

import com.leanplum.internal.Constants;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final /* synthetic */ class xqi implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yqi b;

    public /* synthetic */ xqi(yqi yqiVar, byte b) {
        this.a = b;
        this.b = yqiVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yqi yqiVar = this.b;
        t15 t15Var = (t15) obj;
        switch (b) {
            case 0:
                t15.b(t15Var, Constants.Params.TYPE, xhk.b);
                t15Var.a(Constants.Params.VALUE, xug.f("kotlinx.serialization.Sealed<" + yqiVar.a.c() + '>', f2j.b, new SerialDescriptor[0], new xqi(yqiVar, (byte) 1)), l08.a);
                t15Var.b = yqiVar.b;
                break;
            default:
                for (Map.Entry entry : yqiVar.e.entrySet()) {
                    t15.b(t15Var, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor());
                }
                break;
        }
        return Unit.a;
    }
}
